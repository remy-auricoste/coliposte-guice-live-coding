package fr.drysoft.di

import com.google.inject.{ Binder, Module }
import fr.drysoft.repository.{ DbClient, DbClientProd }

class ProdModule extends Module {
  override def configure(binder: Binder): Unit = {
    binder.bind(classOf[DbClient]).to(classOf[DbClientProd])
  }
}
