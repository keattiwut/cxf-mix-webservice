/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package com.amadeus.apx.taxinz;

import javax.ws.rs.Path;

/**
 *
 * @author kkosittaruk
 */
@Path( "/hello" )
public class HelloJaxrsImpl implements HelloJaxrs {

  @Override
  public String sayHi( String msg ) {
    return msg;
  }

}
