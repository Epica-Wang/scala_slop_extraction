/**
  * Created by wangyingbing on 8/8/18.
  */

package example

import org.scalatest._
import scala.io.Source

class ExtractSentencesTest extends FlatSpec with Matchers {
  var paragraph: String = _
  var tokens : Array[String] = _
  var correctSentences: Array[String] = _
  var mySentences: Array[String] = _

  "The paragraph 1" should "match special token Ms." in{
    paragraph = Source.fromFile("paragraph1.txt","utf-8").getLines.mkString
    tokens = Array("Ms.")
    correctSentences = Array("Ms. Scheller will present updates on the Viveve System, its global development, commercialization, and recent regulatory clearances in the U.S. and abroad",
    "Ms. Scheller and Scott Durbin, chief financial officer, will be participating in the conference and meeting with members of the investment community during one-on-one meetings",
    "A question and answer session will follow the presentation by Ms. Scheller")

    mySentences = ExtractSentences.extractSentences(paragraph,tokens)

    mySentences should have length correctSentences.length
    //compare sorted array so we won't concern order of sentences
    mySentences.sorted shouldEqual correctSentences.sorted
  }
  "The paragraph 1" should "match all tokens Canaccord, Medical, Technology, Sheraton, Viveve(R)" in{
    paragraph = Source.fromFile("paragraph1.txt","utf-8").getLines.mkString
    tokens = Array("Canaccord","Medical","Technology","Sheraton","Viveve(R)")
    correctSentences = Array("Viveve(R) to Present at New York Investor Conferences in November SUNNYVALE, CA--(Marketwired - November 01, 2016) - Viveve Medical, Inc. (Viveve) (NASDAQ: VIVE), a company focused on womens health, today announced that Patricia Scheller, chief executive officer, will present at two premier investor conferences in New York City",
      "The 7(th) Annual Craig-Hallum Investor Conference - November 16, 2016 at 2:10pm ET - The conference will be held at the Sheraton New York Times Square Hotel",
      "Canaccord Genuity Medical Technology Diagnostics Forum - November 17, 2016 at 1:00pm ET - The conference will be held at The Westin Grand Central in New York City",
      "Both conference presentations will be webcast live and available for download on the company website at ir.viveve.com About Viveve Viveve Medical, Inc. is a womens health company passionately committed to advancing new solutions to improve womens overall well-being and quality of life"
    )

    mySentences = ExtractSentences.extractSentences(paragraph,tokens)

    mySentences should have length correctSentences.length
    mySentences.sorted shouldEqual correctSentences.sorted

  }

  "The paragraph 2" should "match special token heritagepci" in {
    paragraph = Source.fromFile("paragraph2.txt","utf-8").getLines.mkString
    tokens = Array("heritagepci")
    correctSentences =  Array("Heritage Insurance Holdings Inc. Investor Contacts: Stephen Rohde, CFO 727-362-7204 srohde@heritagepci.com or Melanie Skijus, Investor Relations Director 727-362-7262 mskijus@heritagepci.com Logo - http://photos.prnewswire.com/prnh/20140615/118328 To view the original version on PR Newswire, visit:http://www.prnewswire.com/news-releases/heritage-completes-purchase-of-zephyr-acquisition-company-300238977.html SOURCE Heritage Insurance Holdings, Inc. /Web site: http://www.heritagepci.com (END) Dow Jones Newswires March 21, 2016 16:15 ET (20:15 GMT)")

    mySentences = ExtractSentences.extractSentences(paragraph,tokens)

    mySentences should have length correctSentences.length
    mySentences.sorted shouldEqual correctSentences.sorted

  }
  "The paragraph 2" should "match all tokens Zephyr, HRTG, policyholders" in{
    paragraph = Source.fromFile("paragraph2.txt","utf-8").getLines.mkString
    tokens = Array("Zephyr","HRTG","policyholders")
    correctSentences = Array("Heritage Completes Purchase of Zephyr Acquisition Company PR Newswire CLEARWATER, Fla., March 21, 2016 CLEARWATER, Fla., March 21, 2016 /PRNewswire/ -- Heritage Insurance Holdings, Inc. (NYSE: HRTG) (Heritage or the Company), a property and casualty insurance holding company, today announced it has completed its previously announced acquisition of Zephyr Acquisition Company (ZAC) and its wholly-owned subsidiary, Zephyr Insurance Company (Zephyr), a specialty insurance provider",
    "The purchase price of approximately $134 million was $14 million higher than originally projected because Zephyr had higher earnings in the second half of 2015 and the first quarter of 2016, resulting in a corresponding increase in shareholders equity",
    "Bruce Lucas, Chairman and CEO said, The acquisition of Zephyr Insurance is a major step in our diversification process",
    "Zephyr will add over $60 million of voluntary premium to our book and add strategic diversification to our platform",
    "Zephyr is an established company with an experienced management team and we are working toward a seamless integration",
    "Zephyrs President and CEO Richard Toyama added, Zephyr is proud to be known as a prominent and leading residential insurance provider in Hawaii and we look forward to continuing to serve our policyholders with superior customer service",
    "As part of Heritage, Zephyr will continue to be based in Hawaii to serve the needs of policyholders within the state",
    "Zephyr celebrated its 15 year anniversary in 2015",
    "Heritage Insurance Holdings Inc. Investor Contacts: Stephen Rohde, CFO 727-362-7204 srohde@heritagepci.com or Melanie Skijus, Investor Relations Director 727-362-7262 mskijus@heritagepci.com Logo - http://photos.prnewswire.com/prnh/20140615/118328 To view the original version on PR Newswire, visit:http://www.prnewswire.com/news-releases/heritage-completes-purchase-of-zephyr-acquisition-company-300238977.html SOURCE Heritage Insurance Holdings, Inc. /Web site: http://www.heritagepci.com (END) Dow Jones Newswires March 21, 2016 16:15 ET (20:15 GMT)"
    )

    mySentences = ExtractSentences.extractSentences(paragraph,tokens)

    mySentences should have length correctSentences.length

    mySentences.sorted shouldEqual correctSentences.sorted
  }

  "The paragraph 3" should "match special token HK$" in {
    paragraph = Source.fromFile("paragraph3.txt","utf-8").getLines.mkString
    tokens = Array("HK$")
    correctSentences = Array("As at 30 June 2016, the Group had cash and bank deposits valued at a total of approximately HK$1,582,383,000",
    "On 7 August 2015, the Group completed a rights issue and raised approximately HK$390,112,000",
    "In particular, the Group signed supply contracts with certain rare earth suppliers before the end of last year and applied such proceeds to settle a total amount of about HK$428,115,000 as prepayment for the rare earth materials and products",
    "A large proportion of the prepayments for rare earth had not been used as at 30 June 2016 and an amount of approximately HK$332,313,000 remained on book",
    "The Group received the refund of prepayments of about HK$23,632,000 in cash during the period")

    mySentences = ExtractSentences.extractSentences(paragraph,tokens)

    mySentences should have length correctSentences.length
    mySentences.sorted shouldEqual correctSentences.sorted
  }
  "The paragraph 3" should "match all tokens improvement, revenue, transformation" in {
    paragraph = Source.fromFile("paragraph3.txt","utf-8").getLines.mkString
    tokens = Array("improvement","revenue","transformation")
    correctSentences = Array("A series of laws and regulations issued by the Chinese ya Government were enforced to facilitate the rare earth industrial restructuring, transformation and upgrading in a bid to achieve sustainable and healthy development",
    "The rare earth prices will rebound, which should then stimulate the improvement in the Groups revenue",
    "In the short term, the Group will formulate timely and appropriate strategies in close consideration of market trends and will actively pursue the expansion of its upstream business, with the aim to generate synergies with its existing business and boost its overall revenue",
    )

    mySentences = ExtractSentences.extractSentences(paragraph,tokens)

    mySentences should have length correctSentences.length
    mySentences.sorted shouldEqual correctSentences.sorted
  }
}
