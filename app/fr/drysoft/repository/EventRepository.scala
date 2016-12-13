package fr.drysoft.repository

import javax.inject.{ Inject, Singleton }

import fr.drysoft.model.Event

@Singleton
case class EventRepository @Inject() (dbClient: DbClient) extends Repository[Event] {
}
