package fr.drysoft.repository

import fr.drysoft.tools.LoggerInjected

import scala.concurrent.Future

object DbClient extends LoggerInjected {
  // TODO implement this
  def save[T](obj: T): Future[Boolean] = {
    logger.info("this is the real implementation speaking")
    Future.successful(true)
  }
}
