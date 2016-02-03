
package com.amadeus.apx.taxinz;

import javax.jws.WebService;

@WebService(endpointInterface = "com.amadeus.apx.taxinz.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

