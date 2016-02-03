/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package com.amadeus.apx.taxinz;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author kkosittaruk
 */
public interface HelloJaxrs {

  @Path( "/sayHi/{msg}" )
  @GET
  @Produces( "text/plain" )
  public String sayHi( @PathParam( "msg" ) String msg);

}
