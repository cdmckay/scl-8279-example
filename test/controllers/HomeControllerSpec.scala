package controllers

import play.api.test._

/**
 * The beEmpty is always underlined.
 */
class HomeControllerSpec extends PlaySpecification {

  "The specification" should {
    "not have a red underline for beEmpty" in {
      val list = List.empty[String]
      list should beEmpty
    }
  }

}
