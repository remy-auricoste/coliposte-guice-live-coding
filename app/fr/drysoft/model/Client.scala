package fr.drysoft.model

import play.api.libs.json.Json

case class Client(id: String, name: String) {
}

object Client {
  implicit val format = Json.format[Client]
}
