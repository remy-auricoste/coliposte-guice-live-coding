package fr.drysoft.controller

import javax.inject.Inject

import fr.drysoft.model.Event
import fr.drysoft.service.EventService
import play.api.mvc.{ Action, Controller }

import scala.concurrent.ExecutionContext.Implicits.global

case class EventController @Inject() (eventService: EventService) extends Controller {
  def add() = Action.async(parse.json[Event]) { implicit request =>
    val event = request.body
    eventService.add(event).map(_ => Ok(event.id))
  }
}
