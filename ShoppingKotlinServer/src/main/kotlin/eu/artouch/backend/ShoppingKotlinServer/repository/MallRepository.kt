package eu.artouch.backend.ShoppingKotlinServer.repository

import eu.artouch.backend.ShoppingKotlinServer.model.ShoppingItem
import org.springframework.data.repository.CrudRepository

interface MallRepository : CrudRepository<ShoppingItem, Long> {
    fun findByNameContaining(name: String): Iterable<ShoppingItem>
}