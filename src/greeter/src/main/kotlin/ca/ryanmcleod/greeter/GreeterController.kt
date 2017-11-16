package ca.ryanmcleod.greeter

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.io.PrintWriter
import com.sun.org.glassfish.external.amx.AMXUtil.prop
import java.io.StringWriter



@RestController
class GreeterController {

    @GetMapping
    fun greetMe(): String {
        return "Hello!"
    }

}
