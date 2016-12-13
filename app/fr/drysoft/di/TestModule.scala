package fr.drysoft.di

import com.google.inject.{Binder, Module}
import fr.drysoft.repository.{DbClient, DbClientMock}

class TestModule extends Module {
  override def configure(binder: Binder): Unit = {
    binder.bind(classOf[DbClient]).to(classOf[DbClientMock])
  }
}
