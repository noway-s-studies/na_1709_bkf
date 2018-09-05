package eu.artouch.backend.ShoppingKotlinServer.api

import eu.artouch.backend.ShoppingKotlinServer.model.ShoppingItem
import eu.artouch.backend.ShoppingKotlinServer.repository.MallRepository
import org.springframework.web.bind.annotation.*

@RestController
class MallController(private val repository: MallRepository) {
    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/search/{name}")
    fun findByName(@PathVariable name: String) = repository.findByNameContaining(name)

    @PostMapping("/add")
    fun addItem(@RequestBody shoppingItem: ShoppingItem) = repository.save(shoppingItem)
}