package fr.drysoft.controller

import play.api.mvc.{ Action, Controller }

case class IndexController() extends Controller {
  def index = Action {
    Ok("it works !")
  }
}
