package fr.drysoft.service

import fr.drysoft.model.Event
import fr.drysoft.repository.{ ClientRepository, EventRepository }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object EventService {

  def add(event: Event): Future[Boolean] = {
    for {
      eventSaved <- EventRepository.save(event)
      clientSaved <- ClientRepository.save(event.client)
    } yield eventSaved && clientSaved
  }
}
