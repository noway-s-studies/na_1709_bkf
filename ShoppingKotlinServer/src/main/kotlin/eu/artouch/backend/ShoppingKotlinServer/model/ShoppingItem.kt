package eu.artouch.backend.ShoppingKotlinServer.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class ShoppingItem(
        @Id
        @GeneratedValue
        val id: Long = -1,
        val name: String="",
        val price: Int=0)