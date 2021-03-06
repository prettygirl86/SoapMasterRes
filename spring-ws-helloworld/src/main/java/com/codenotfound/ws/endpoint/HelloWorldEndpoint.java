package com.codenotfound.ws.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.codenotfound.types.flightsearch.FareMasterPriceResponseVO;
import com.codenotfound.types.flightsearch.Flight;
//import com.codenotfound.types.flightsearch.Flightinfo;
//import com.codenotfound.types.helloworld.Greeting;
import com.codenotfound.types.flightsearch.ObjectFactory;
//import com.codenotfound.types.helloworld.Person;
import com.codenotfound.types.flightsearch.FlightDetailsVO;
import com.codenotfound.types.flightsearch.FlightIndexVO;
import com.codenotfound.types.flightsearch.FlightInfoVO;
//import com.codenotfound.types.flightsearch.FlightInformation;
import com.codenotfound.types.flightsearch.GroupOfFlightsVO;
import com.codenotfound.types.flightsearch.ItemNumIdVO;
import com.codenotfound.types.flightsearch.ItemNumberVO;
import com.codenotfound.types.flightsearch.PaxFareDetailVO;
import com.codenotfound.types.flightsearch.PaxFareProduct;
import com.codenotfound.types.flightsearch.RecPriceInfoVO;
import com.codenotfound.types.flightsearch.RecommendationVO;
import com.codenotfound.types.flightsearch.SegFlightRefVO;

@Endpoint
public class HelloWorldEndpoint {

  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldEndpoint.class);
  
  //private static FlightInformation flightInformation  ;
  private static ObjectFactory factory = new ObjectFactory();
  private static FlightInfoVO flightInfoVO =  factory.createFlightInfoVO();
  private static FlightIndexVO flightIndexVO = factory.createFlightIndexVO();
  private static List<GroupOfFlightsVO> grpofFlightsVOList = new ArrayList<GroupOfFlightsVO>();
  private static GroupOfFlightsVO groupOfFlightsVO1= factory.createGroupOfFlightsVO();
  private static List<FlightDetailsVO> grpofFlightsDetailsVOList = new ArrayList<FlightDetailsVO>();
  private static FlightDetailsVO flightDetailsVO1 = factory.createFlightDetailsVO();
  private static ItemNumIdVO itemNumberId=factory.createItemNumIdVO();
  private static ItemNumberVO itemNumber =factory.createItemNumberVO();
  private static PaxFareDetailVO paxFareDetail=factory.createPaxFareDetailVO();
  private static PaxFareProduct paxFareProduct =factory.createPaxFareProduct();
  private static RecPriceInfoVO recPriceInfo=factory.createRecPriceInfoVO();
  private static SegFlightRefVO segflref1=factory.createSegFlightRefVO();
  private static SegFlightRefVO segflref2=factory.createSegFlightRefVO();
  private static List<SegFlightRefVO> segmentFlightRef=new ArrayList<SegFlightRefVO>();

private static List<RecommendationVO> recommendation= new ArrayList<RecommendationVO>();
  private static RecommendationVO recommendation1=factory.createRecommendationVO();
  
  

  //private static final String NAMESPACE_URI = "http://codenotfound.com/types/helloworld";
  private static final String NAMESPACE_URI = "http://codenotfound.com/types/flightsearch";
  

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "flight")
  @ResponsePayload
 /* public Flightinfo getFlight(@RequestPayload Flight request) {*/
	  public FareMasterPriceResponseVO getFlight(@RequestPayload Flight request) {
    LOGGER.info("Endpoint received flight[source={},destination={},dteofjourney={}]", request.getSource(),
        request.getDestination(),request.getDteofjourney());

    /*String greeting = "Hello " + request.getFirstName() + " " + request.getLastName() + "!";*/

    //ObjectFactory factory = new ObjectFactory();
    /*Greeting response = factory.createGreeting();
    response.setGreeting(greeting);*/
    
   // Flightinfo response=factory.createFlightinfo();
   
	  //Flightinfo response=factory.createFlightinfo();
    FareMasterPriceResponseVO response=factory.createFareMasterPriceResponseVO();
    
	  /*response.setFlightname("Delta Airlines");
	  response.setFare(170.00);
    response.setSource(request.getSource());
    response.setDestination(request.getDestination());
    response.setDteofjourney(request.getDteofjourney());*/
    
    //LOGGER.info("Endpoint sending greeting='{}'", response.getGreeting());
    return response;
  }
}
