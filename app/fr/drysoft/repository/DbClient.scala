package fr.drysoft.repository

import scala.concurrent.Future

object DbClient {

  // TODO implement this
  def save[T](obj: T): Future[Boolean] = Future.successful(true)
}
