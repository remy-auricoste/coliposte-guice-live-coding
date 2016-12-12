package fr.drysoft.controller

import play.api.mvc.Result
import play.api.test.{ FakeRequest, PlaySpecification }

import scala.concurrent.Future

class ApplicationTest extends PlaySpecification {
  "index route" should {
    "return OK status" in {
      val controller = IndexController()
      val result: Future[Result] = controller.index().apply(FakeRequest())
      contentAsString(result) must be equalTo "it works !"
      status(result) must be equalTo 200
    }
  }

}
