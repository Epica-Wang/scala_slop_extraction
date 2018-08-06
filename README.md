## Getting Started
* Download the latest version of Docker for Mac or Windows
* Clone the directory
* Run: `docker-compose run --rm accern_template bash`


For first time run this will create the container and step you inside
the container

Once the container is up and you're attached to it, run
`sbt` to get started. Within `sbt` u can use `compile`, `test`, and
`run` command

A sample hello world and test case is already implemented. Here's the output for the test case:
```
sbt:accern_template> test
[info] Compiling 1 Scala source to /app/target/scala-2.12/test-classes ...
[info] Done compiling.
[info] HelloSpec:
[info] The Hello object
[info] - should say hello
[info] Run completed in 1 second, 56 milliseconds.
[info] Total number of tests run: 1
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
```

### Question Tokenization and Sentence Extraction
Given a paragraph and list of tokens, write a function that can extract sentences containing those tokens.
In our Universe sentences are seperated by `.`, `;`, and `\n`

```
def extractSentences(paragraph: String, tokens: Array[String]): Array[String] = {
    /*
        Extract logic here
    */
    return listOfSentences
}
```

Please fork this repository and provide your solution.

---

## Examples

### Paragraph 1
Viveve(R) to Present at New York Investor Conferences in November SUNNYVALE, CA--(Marketwired - November 01, 2016) - Viveve Medical, Inc. (Viveve) (NASDAQ: VIVE), a company focused on womens health, today announced that Patricia Scheller, chief executive officer, will present at two premier investor conferences in New York City. Ms. Scheller will present updates on the Viveve System, its global development, commercialization, and recent regulatory clearances in the U.S. and abroad. The 7(th) Annual Craig-Hallum Investor Conference - November 16, 2016 at 2:10pm ET - The conference will be held at the Sheraton New York Times Square Hotel. Ms. Scheller and Scott Durbin, chief financial officer, will be participating in the conference and meeting with members of the investment community during one-on-one meetings. Canaccord Genuity Medical Technology Diagnostics Forum - November 17, 2016 at 1:00pm ET - The conference will be held at The Westin Grand Central in New York City. A question and answer session will follow the presentation by Ms. Scheller. Both conference presentations will be webcast live and available for download on the company website at ir.viveve.com About Viveve Viveve Medical, Inc. is a womens health company passionately committed to advancing new solutions to improve womens overall well-being and quality of life. The Viveve System has received regulatory approval in many countries throughout the world and is available through physician import license in Japan. For further information please visit www.viveve.com. Safe Harbor Statement All statements in this press release that are not based on historical fact are forward-looking statements within the meaning of Section 27A of the Securities Act of 1933 and Section 21E of the Securities Exchange Act of 1934. While management has based any forward-looking statements included in this press release on its current expectations, the information on which such expectations were based may change. These forward-looking statements rely on a number of assumptions concerning future events and are subject to a number of risks, uncertainties and other factors, many of which are outside of our control, which could cause actual results to materially differ from such statements. Such risks, uncertainties and other factors include, but are not limited to, the fluctuation of global economic conditions, the performance of management and our employees, our ability to obtain financing, competition, general economic conditions and other factors that are detailed in our periodic and current reports available for review at www.sec.gov.

### Terms
```
- Canaccord
- Medical
- Technology
- Sheraton
- Viveve(R)
```

---

### Paragraph 2
Heritage Completes Purchase of Zephyr Acquisition Company PR Newswire CLEARWATER, Fla., March 21, 2016 CLEARWATER, Fla., March 21, 2016 /PRNewswire/ -- Heritage Insurance Holdings, Inc. (NYSE: HRTG) (Heritage or the Company), a property and casualty insurance holding company, today announced it has completed its previously announced acquisition of Zephyr Acquisition Company (ZAC) and its wholly-owned subsidiary, Zephyr Insurance Company (Zephyr), a specialty insurance provider. The transaction provides Heritage an immediate presence in the state of Hawaii. The purchase price of approximately $134 million was $14 million higher than originally projected because Zephyr had higher earnings in the second half of 2015 and the first quarter of 2016, resulting in a corresponding increase in shareholders equity. The increased purchase price will not impact the goodwill associated with the acquisition. Bruce Lucas, Chairman and CEO said, The acquisition of Zephyr Insurance is a major step in our diversification process. Zephyr will add over $60 million of voluntary premium to our book and add strategic diversification to our platform. Zephyr is an established company with an experienced management team and we are working toward a seamless integration. Zephyrs President and CEO Richard Toyama added, Zephyr is proud to be known as a prominent and leading residential insurance provider in Hawaii and we look forward to continuing to serve our policyholders with superior customer service. We are excited to team up with Heritage to strengthen our overall product and capabilities. As part of Heritage, Zephyr will continue to be based in Hawaii to serve the needs of policyholders within the state. Zephyr celebrated its 15 year anniversary in 2015. About Heritage Heritage Insurance Holdings, Inc. is a property and casualty insurance holding company headquartered in Clearwater, Florida. Its subsidiary, Heritage Property Casualty Insurance Company, writes over $590 million of personal and commercial residential premium through a large network of experienced agents. Heritage is led by a seasoned senior management team with an average of 31 years of insurance industry experience. Forward Looking Statements Statements in this press release that are not historical facts are forward-looking statements that are subject to certain risks and uncertainties that could cause actual events and results to differ materially from those discussed herein. Without limiting the generality of the foregoing, words such as may, will, expect, believe, anticipate, intend, could, would, estimate, or continue or the other negative variations thereof or comparable terminology are intended to identify forward-looking statements. The risks and uncertainties that could cause our actual results to differ from those expressed or implied herein include, without limitation: the success of the Companys marketing initiatives, inflation and other changes in economic conditions (including changes in interest rates and financial markets); the impact of new federal and state regulations that affect the property and casualty insurance market; the costs of reinsurance and the collectability of reinsurance; assessments charged by various governmental agencies; pricing competition and other initiatives by competitors; our ability to obtain regulatory approval for requested rate changes, and the timing thereof; legislative and regulatory developments; the outcome of litigation pending against us, including the terms of any settlements; risks related to the nature of our business; dependence on investment income and the composition of our investment portfolio; the adequacy of our liability for losses and loss adjustment expense; insurance agents; claims experience; ratings by industry services; catastrophe losses; reliance on key personnel; weather conditions (including the severity and frequency of storms, hurricanes, tornadoes and hail); changes in loss trends; acts of war and terrorist activities; court decisions and trends in litigation; and other matters described from time to time by us in our filings with the Securities and Exchange Commission, including, but not limited to, the Companys Annual Report on Form 10-K for the year ended December 31, 2015 which was filed with the Securities and Exchange Commission on March 8, 2016. The Company undertakes no obligations to update, change or revise any forward-looking statement, whether as a result of new information, additional or subsequent developments or otherwise. Heritage Insurance Holdings Inc. Investor Contacts: Stephen Rohde, CFO 727-362-7204 srohde@heritagepci.com or Melanie Skijus, Investor Relations Director 727-362-7262 mskijus@heritagepci.com Logo - http://photos.prnewswire.com/prnh/20140615/118328 To view the original version on PR Newswire, visit:http://www.prnewswire.com/news-releases/heritage-completes-purchase-of-zephyr-acquisition-company-300238977.html SOURCE Heritage Insurance Holdings, Inc. /Web site: http://www.heritagepci.com (END) Dow Jones Newswires March 21, 2016 16:15 ET (20:15 GMT)

### Terms
```
- Zephyr
- HRTG
- policyholders
```

---

### Paragraph 3
Refractory Materials Business As the Chinese economy continued to slow down during the period, the decreasing overall output of the steel industry in China, over-capacity and the lowest tender strategy prevailing in the steel, cement and glass industries have led to a more intense competition in the refractory materials industry. The reduction of production in Japans steel industry has also resulted in less procurement of refractory materials in China. During the period, the Group sold approximately 10,800 tonnes of ordinary refractory materials and high temperature ceramics products, a decrease of approximately 20% year-on-year. The selling prices of its main products such as fused magnesium chrome bricks, alumina-graphite bricks, casting materials and Sialon series products remained flat with a variation within 5% when compared with the same period last year. With respect to raw materials, unit price of fused magnesium chrome grains and chromium concentrate decreased by approximately 10%. Regarding the magnesium grain business, the overall performance was relatively stable and production hours had increased when compared with the corresponding period last year. The Group sold approximately 34,000 tonnes of fused magnesium grain and high purity magnesium grain, a growth of more than 40% year-on-year. The change in selling prices was within 10% when compared with the corresponding period last year. Under this waxing-and-waning condition, the segments gross profit margin maintained at less than 10%. Geographically, China remained the dominant market for the Groups refractory materials business, with domestic sales accounting for about 86% of the total sales. Sales to the Japanese market decreased to about 9% while sales to other markets such as Europe and the Middle East accounted for about 5%. Prospects Chinas 13th Five-year Plan marks a critical period for the rare earth industry to maintain a sustainable and healthy development. It is also an important time as Chinese Government is exerting great efforts on the standardisation of rare earth resources development, focusing on addressing the over-capacity issue and driving the development of the rare earth industry through an intensive approach and a related shift to manufacture high-end products. At present, due to the persistently sluggish market conditions affecting the entire rare earth industry and uncertainties in the refractory materials application businesses, the demand for rare earth and refractory materials is expected to remain weak. However, as the Chinese Government continues to formulate and announce regulations to reform and consolidate the industry, the Group believes that future prospects of the industry will still present opportunities. Recently, the Ministry of Industry and Information Technology stated that the industry will continue the implementation of the provisions in Several Opinions of the State Council on Promoting the Sustainable and Healthy Development of the Rare Earth Industry. A series of laws and regulations issued by the Chinese ya Government were enforced to facilitate the rare earth industrial restructuring, transformation and upgrading in a bid to achieve sustainable and healthy development. In view of these, China is continuing to step up efforts to improve the conditions and better regulate the rare earth market, 15 conserve rare earth resources and combat violations in the rare earth industry. Besides, it is expected that a new round of the national rare earth hoarding reserve plan will be launched within this year. The rare earth prices will rebound, which should then stimulate the improvement in the Groups revenue. In the short term, the Group will formulate timely and appropriate strategies in close consideration of market trends and will actively pursue the expansion of its upstream business, with the aim to generate synergies with its existing business and boost its overall revenue. The Group has engaged a professional team to conduct due diligence for its acquisition of the magnesium ore mining project in Northeastern China. The work is progressing well and is expected to be concluded within this year. Aside from accelerating progress of the acquisition, the Group also continues to explore development opportunities in overseas markets and is actively evaluating the opportunities to collaborate with overseas rare earth enterprises. Liquidity and Financial Resources The Group continues to implement serious and prudent financial strategies and retains adequate liquidity for future acquisitions and development. As at 30 June 2016, the Group had cash and bank deposits valued at a total of approximately HK$1,582,383,000. On 7 August 2015, the Group completed a rights issue and raised approximately HK$390,112,000. Such net proceeds were utilised as general working capital of the Group. In particular, the Group signed supply contracts with certain rare earth suppliers before the end of last year and applied such proceeds to settle a total amount of about HK$428,115,000 as prepayment for the rare earth materials and products. The suppliers will provide goods to the Group upon request within one year or at the relevant time. This initiative enables the Group to counter the efforts by the state-owned rare earth groups to control the supply from rare earth mine sources after industry consolidation, and also secures a sufficient supply of raw materials and products at an advantageous price for future production and trading. However, the market has fluctuated during the period under review and the situation was not as expected. A large proportion of the prepayments for rare earth had not been used as at 30 June 2016 and an amount of approximately HK$332,313,000 remained on book. The Group received the refund of prepayments of about HK$23,632,000 in cash during the period. Due to the weak economy, the Group has granted a longer credit period to some of the customers, which has led to an increase in the ageing of trade receivables. The Group is closely monitoring the repayment situation of customers and negotiating with them in a timely manner. At the same time, it will undertake appropriate action and make provision for bad and doubtful debts whenever necessary. One of the Groups subsidiaries in Mainland China has acquired short term loans of RMB44,800,000 from a bank during the period. 16 (MORE TO FOLLOW) Dow Jones Newswires August 30, 2016 10:10 ET (14:10 GMT)

### Terms
```
- improvement
- revenue
- transformation
```

---

Bonus points for writing test cases using these examples.
