package fr.drysoft.controller

import fr.drysoft.di.TestModule
import fr.drysoft.model.{Client, Event}
import org.joda.time.DateTime
import play.api.inject.guice.GuiceApplicationBuilder
import play.api.mvc.{Headers, Result}
import play.api.test.{FakeRequest, PlaySpecification}

import scala.concurrent.Future

class EventControllerTest extends PlaySpecification {
  val controller = GuiceApplicationBuilder().overrides(new TestModule).injector().instanceOf(classOf[EventController])

  "EventController" should {
    "post an event" in {
      val event = Event("id", DateTime.now(), Client("clientId", "client name"))
      val result: Future[Result] = controller.add.apply(FakeRequest("POST", "", Headers(), event))
      status(result) must be equalTo 200
    }
  }
}
