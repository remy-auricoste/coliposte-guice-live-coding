package fr.drysoft.model

import org.joda.time.DateTime
import play.api.libs.json.Json

case class Event(id: String, date: DateTime, client: Client) {
}

object Event {
  implicit val format = Json.format[Event]
}
