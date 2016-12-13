package fr.drysoft.repository

import scala.concurrent.Future

trait Repository[T] {
  val dbClient: DbClient

  def save(obj: T): Future[Boolean] = dbClient.save(obj)
}
