package eu.artouch.backend.ShoppingKotlinServer

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ShoppingMallTests {

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    @Test
    fun `test GET List `() {

        val content = """
[
  {
    "id":1,
    "name":"Rubber Duck",
    "price":12
  },
  {
    "id":2,
    "name":"Action Man Figure",
    "price":1300
  },
  {
    "id":3,
    "name":"Rubber Action Man Figure",
    "price":1000
  }
]

        """

        val testContent = content
        val responseContent = restTemplate.getForEntity("/", String::class.java).body.toString()

        Assert.assertTrue(testContent equalsAsJson responseContent)
    }

}