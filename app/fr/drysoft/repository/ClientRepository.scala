package fr.drysoft.repository

import javax.inject.Inject

import fr.drysoft.model.Client

case class ClientRepository @Inject() (dbClient: DbClient) extends Repository[Client] {
}
