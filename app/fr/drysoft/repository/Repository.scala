package fr.drysoft.repository

import scala.concurrent.Future

trait Repository[T] {
  def save(obj: T): Future[Boolean] = DbClient.save(obj)
}
