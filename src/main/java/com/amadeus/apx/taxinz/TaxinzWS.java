/*
 * To change this license header, choose License Headers in Project Properties. To change this
 * template file, choose Tools | Templates and open the template in the editor.
 */
package com.amadeus.apx.taxinz;

import com.amadeus.sep.services.lightexternalprovider.v2.CancelReservationRequestType;
import com.amadeus.sep.services.lightexternalprovider.v2.CancelReservationResponseType;
import com.amadeus.sep.services.lightexternalprovider.v2.ConfirmReservationRequestType;
import com.amadeus.sep.services.lightexternalprovider.v2.ConfirmReservationResponseType;
import com.amadeus.sep.services.lightexternalprovider.v2.LightExternalProvider;
import com.amadeus.sep.services.lightexternalprovider.v2.LoadSearchRequestType;
import com.amadeus.sep.services.lightexternalprovider.v2.LoadSearchResponseType;
import com.amadeus.sep.services.lightexternalprovider.v2.RetrieveReservationRequestType;
import com.amadeus.sep.services.lightexternalprovider.v2.RetrieveReservationResponseType;
import com.amadeus.sep.services.lightexternalprovider.v2.SetBookingReferenceRequestType;
import com.amadeus.sep.services.lightexternalprovider.v2.SetBookingReferenceResponseType;
import javax.jws.WebService;

/**
 *
 * @author kkosittaruk
 */
@WebService(
    endpointInterface = "com.amadeus.sep.services.lightexternalprovider.v2.LightExternalProvider" )
public class TaxinzWS implements LightExternalProvider {

  @Override
  public RetrieveReservationResponseType retrieveReservation(
      RetrieveReservationRequestType rrrt ) {
    throw new UnsupportedOperationException( "Not supported yet." ); // To change body of generated
                                                                     // methods, choose Tools |
                                                                     // Templates.
  }

  @Override
  public SetBookingReferenceResponseType setBookingReference(
      SetBookingReferenceRequestType sbrrt ) {
    throw new UnsupportedOperationException( "Not supported yet." ); // To change body of generated
                                                                     // methods, choose Tools |
                                                                     // Templates.
  }

  @Override
  public LoadSearchResponseType loadSearch( LoadSearchRequestType lsrt ) {
    throw new UnsupportedOperationException( "Not supported yet." ); // To change body of generated
    // methods, choose Tools |
    // Templates.
  }

  @Override
  public CancelReservationResponseType cancelReservation( CancelReservationRequestType crrt ) {
    throw new UnsupportedOperationException( "Not supported yet." ); // To change body of generated
                                                                     // methods, choose Tools |
                                                                     // Templates.
  }

  @Override
  public ConfirmReservationResponseType confirmReservation( ConfirmReservationRequestType crrt ) {
    throw new UnsupportedOperationException( "Not supported yet." ); // To change body of generated
                                                                     // methods, choose Tools |
                                                                     // Templates.
  }

}
