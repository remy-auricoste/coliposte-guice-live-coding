package fr.drysoft.tools

import org.slf4j.LoggerFactory

trait LoggerInjected {
  lazy val logger = LoggerFactory.getLogger(getClass)
}
