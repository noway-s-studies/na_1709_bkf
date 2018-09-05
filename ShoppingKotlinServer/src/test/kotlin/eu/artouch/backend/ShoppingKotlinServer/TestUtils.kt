package eu.artouch.backend.ShoppingKotlinServer

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import eu.artouch.backend.ShoppingKotlinServer.model.ShoppingItem

infix fun String.equalsAsJson(other:String):Boolean{
    val parser = ObjectMapper()
    val o1:List<ShoppingItem> = parser.readValue(this, object : TypeReference<List<ShoppingItem>>(){})
    val o2:List<ShoppingItem> = parser.readValue(other,object :TypeReference<List<ShoppingItem>>(){})
    return o1==o2
}