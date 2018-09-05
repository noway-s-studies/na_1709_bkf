package eu.artouch.backend.ShoppingKotlinServer

import eu.artouch.backend.ShoppingKotlinServer.model.ShoppingItem
import eu.artouch.backend.ShoppingKotlinServer.repository.MallRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ShoppingKotlinServerApplication {
    @Bean
    fun init(repository: MallRepository): CommandLineRunner = CommandLineRunner {
        repository.save(ShoppingItem(name = "Rubber Duck", price = 12))
        repository.save(ShoppingItem(name = "Action Man Figure", price = 1300))
        repository.save(ShoppingItem(name = "Rubber Action Man Figure", price = 1000))
    }
}

fun main(args: Array<String>) {
    val run = SpringApplication.run(ShoppingKotlinServerApplication::class.java, *args)
}
