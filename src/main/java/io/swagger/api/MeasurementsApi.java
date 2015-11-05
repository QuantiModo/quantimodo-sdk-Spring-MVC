package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.InlineResponse20011;
import java.math.BigDecimal;
import io.swagger.model.MeasurementPost;
import java.io.File;
import io.swagger.model.InlineResponse20012;
import io.swagger.model.Measurement;
import io.swagger.model.InlineResponse2002;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/measurements", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/measurements", description = "the measurements API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-05T03:17:12.243Z")
public class MeasurementsApi {
  

  @ApiOperation(value = "Get all Measurements", notes = "Get all Measurements", response = InlineResponse20011.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20011> measurementsGet(@ApiParam(value = "user_id") @RequestParam(value = "userId", required = false) Integer userId


,
    @ApiParam(value = "client_id") @RequestParam(value = "clientId", required = false) String clientId


,
    @ApiParam(value = "connector_id") @RequestParam(value = "connectorId", required = false) Integer connectorId


,
    @ApiParam(value = "variable_id") @RequestParam(value = "variableId", required = false) Integer variableId


,
    @ApiParam(value = "start_time") @RequestParam(value = "startTime", required = false) Integer startTime


,
    @ApiParam(value = "value") @RequestParam(value = "value", required = false) BigDecimal value


,
    @ApiParam(value = "original_value") @RequestParam(value = "originalValue", required = false) BigDecimal originalValue


,
    @ApiParam(value = "duration") @RequestParam(value = "duration", required = false) Integer duration


,
    @ApiParam(value = "note") @RequestParam(value = "note", required = false) String note


,
    @ApiParam(value = "latitude") @RequestParam(value = "latitude", required = false) BigDecimal latitude


,
    @ApiParam(value = "longitude") @RequestParam(value = "longitude", required = false) BigDecimal longitude


,
    @ApiParam(value = "location") @RequestParam(value = "location", required = false) String location


,
    @ApiParam(value = "created_at") @RequestParam(value = "createdAt", required = false) String createdAt


,
    @ApiParam(value = "updated_at") @RequestParam(value = "updatedAt", required = false) String updatedAt


,
    @ApiParam(value = "error") @RequestParam(value = "error", required = false) String error


,
    @ApiParam(value = "limit") @RequestParam(value = "limit", required = false) Integer limit


,
    @ApiParam(value = "offset") @RequestParam(value = "offset", required = false) Integer offset


,
    @ApiParam(value = "sort") @RequestParam(value = "sort", required = false) String sort


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20011>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store Measurement", notes = "Store Measurement", response = InlineResponse20011.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse20011> measurementsPost(

@ApiParam(value = "Measurement that should be stored"  ) MeasurementPost body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20011>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get Measurements CSV", notes = "Download a CSV containing all user measurements", response = File.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/csv", 
    produces = { "text/csv" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<File> measurementsCsvGet()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<File>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Post Request for Measurements CSV", notes = "Use this endpoint to schedule a CSV export containing all user measurements to be emailed to the user within 24 hours.", response = Integer.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/request_csv", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<Integer> measurementsRequestCsvPost()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Integer>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get Measurement", notes = "Get Measurement", response = InlineResponse20012.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20012> measurementsIdGet(
@ApiParam(value = "id of Measurement",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20012>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update Measurement", notes = "Update Measurement", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> measurementsIdPut(
@ApiParam(value = "id of Measurement",required=true ) @PathVariable("id") Integer id

,
    

@ApiParam(value = "Measurement that should be updated"  ) Measurement body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete Measurement", notes = "Delete Measurement", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> measurementsIdDelete(
@ApiParam(value = "id of Measurement",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
