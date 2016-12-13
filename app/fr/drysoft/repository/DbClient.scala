package fr.drysoft.repository

import fr.drysoft.tools.LoggerInjected

import scala.concurrent.Future

case class DbClientProd() extends LoggerInjected with DbClient {
  // TODO implement this
  def save[T](obj: T): Future[Boolean] = {
    logger.info("this is the real implementation speaking")
    Future.successful(true)
  }
}

trait DbClient {
  def save[T](obj: T): Future[Boolean]
}

case class DbClientMock() extends LoggerInjected with DbClient {
  def save[T](obj: T): Future[Boolean] = {
    logger.info("this is the MOCK implementation speaking")
    Future.successful(true)
  }
}