/**
 * Created by joost on 23/10/14.
 */
import org.scalatest._
import org.scalatest.selenium._
import org.openqa.selenium.chrome._
import org.openqa.selenium._
import org.scalatest.concurrent.Eventually._

class GoogleSpec extends FlatSpec with ShouldMatchers with WebBrowser {

  System.setProperty("webdriver.chrome.driver","/Users/joost/Selenium/chromedriver")
  implicit val webDriver: WebDriver = new ChromeDriver

  val host = "http://www.google.nl/"

  "The google home page" should "have the correct title" in {
    go to (host)
    pageTitle should be ("Google")
  }

  it should "accept search input value Rabobank" in{
    click on "q"
    textField("q").value = "Rabobank"
    submit()
  }

  it should "quit successfully" in{
    quit()
  }
}