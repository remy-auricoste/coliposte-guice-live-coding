package fr.drysoft.service

import javax.inject.{ Inject, Singleton }

import fr.drysoft.model.Event
import fr.drysoft.repository.{ ClientRepository, EventRepository }

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

@Singleton
case class EventService @Inject() (eventRepository: EventRepository, clientRepository: ClientRepository) {

  def add(event: Event): Future[Boolean] = {
    for {
      eventSaved <- eventRepository.save(event)
      clientSaved <- clientRepository.save(event.client)
    } yield eventSaved && clientSaved
  }
}
