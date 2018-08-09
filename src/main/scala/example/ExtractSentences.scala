/**
  * Created by wangyingbing on 8/7/18.
  */
package example
import scala.collection.mutable.ArrayBuffer
import scala.io.Source
/*
Idea:
For each sentence, we compare word by word to see if it contains any taoken.
*/

object ExtractSentences {
  def extractSentences(paragraph: String, tokens: Array[String]): Array[String] = {
    //ArrayBuffer to store result
    var resultSentences = ArrayBuffer[String]()

    //split to get sentences.
    //use". "to avoid split urls/numbers.
    //Avoid to split
    // 1.Inc. or www. or Mr.
    // 2.abbreviation such as U.S. Abbreviation here defined as having less than 3 letters before dot.
    var sentences:Array[String] = paragraph.split("(?<!(Inc|www|Mr|Ms|Dr|\\b\\p{IsLetter}{1,3}\\b))\\. |;|\n")

    for(sentence <- sentences){
      if(checkSentence(sentence, tokens)){
        resultSentences += sentence
      }
    }

    return resultSentences.toArray
  }

  def checkSentence(sentence: String, tokens: Array[String]): Boolean = {
    var words: Array[String] =  sentence.split(" |-|/|@")
    for(word <- words){
      //transfer to lowercase
      var editWord = word.toLowerCase()
      for(token <- tokens){
        var editToken = token.toLowerCase()
        if(editWord.contains(editToken)){
          return true
        }
      }
    }
    return false
  }

  def main(args: Array[String]) {
    var tokens= Array("Heritage")
    val fileContent = Source.fromFile("paragraph2.txt","utf-8").getLines.mkString
    var result : Array[String] =extractSentences(fileContent,tokens)
    for(sentence <- result){
      println(sentence)
    }
  }
}

