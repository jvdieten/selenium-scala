import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import org.scalatest.selenium._
import org.openqa.selenium.chrome._
import org.openqa.selenium._

class GoogleFeatureSpec extends FeatureSpec with GivenWhenThen with WebBrowser{

  System.setProperty("webdriver.chrome.driver","/Users/joost/Selenium/chromedriver")
  implicit val webDriver: WebDriver = new ChromeDriver
  val host = "http://www.google.nl/"

  feature("The user can search Google with a given set of criteria") {

    info("As u user")
    info("I want to be able to search words and sentences")
    info("So that I can find the website I am looking for")

    scenario("search single word"){
      go to host
      Given("an empty search field")
      textField("q").value = ""
      When("I enter deTesters in the search field")
      textField("q").value = "deTesters"
      Then("The first result should be deTesters website")
    }
    scenario("search multiple words"){

      Given("an empty search field")
      When("I enter deTesters Houten in the search field")
      Then("The first result should be deTesters website")
      pending
    }

  }

 }
