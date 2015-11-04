package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.InlineResponse20021;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse20022;
import io.swagger.model.UserVariable;
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
@RequestMapping(value = "/userVariables", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/userVariables", description = "the userVariables API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-03T22:25:20.334Z")
public class UserVariablesApi {
  

  @ApiOperation(value = "Get all UserVariables", notes = "Get all UserVariables", response = InlineResponse20021.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20021> userVariablesGet(@ApiParam(value = "client_id") @RequestParam(value = "clientId", required = false) String clientId


,
    @ApiParam(value = "variable_id") @RequestParam(value = "variableId", required = false) Integer variableId


,
    @ApiParam(value = "default_unit_id") @RequestParam(value = "defaultUnitId", required = false) Integer defaultUnitId


,
    @ApiParam(value = "minimum_allowed_value") @RequestParam(value = "minimumAllowedValue", required = false) BigDecimal minimumAllowedValue


,
    @ApiParam(value = "maximum_allowed_value") @RequestParam(value = "maximumAllowedValue", required = false) BigDecimal maximumAllowedValue


,
    @ApiParam(value = "filling_value") @RequestParam(value = "fillingValue", required = false) BigDecimal fillingValue


,
    @ApiParam(value = "join_with") @RequestParam(value = "joinWith", required = false) Integer joinWith


,
    @ApiParam(value = "onset_delay") @RequestParam(value = "onsetDelay", required = false) Integer onsetDelay


,
    @ApiParam(value = "duration_of_action") @RequestParam(value = "durationOfAction", required = false) Integer durationOfAction


,
    @ApiParam(value = "variable_category_id") @RequestParam(value = "variableCategoryId", required = false) Integer variableCategoryId


,
    @ApiParam(value = "updated") @RequestParam(value = "updated", required = false) Integer updated


,
    @ApiParam(value = "public") @RequestParam(value = "_public", required = false) Integer _public


,
    @ApiParam(value = "cause_only") @RequestParam(value = "causeOnly", required = false) Boolean causeOnly


,
    @ApiParam(value = "filling_type") @RequestParam(value = "fillingType", required = false) String fillingType


,
    @ApiParam(value = "number_of_measurements") @RequestParam(value = "numberOfMeasurements", required = false) Integer numberOfMeasurements


,
    @ApiParam(value = "number_of_processed_measurements") @RequestParam(value = "numberOfProcessedMeasurements", required = false) Integer numberOfProcessedMeasurements


,
    @ApiParam(value = "measurements_at_last_analysis") @RequestParam(value = "measurementsAtLastAnalysis", required = false) Integer measurementsAtLastAnalysis


,
    @ApiParam(value = "last_unit_id") @RequestParam(value = "lastUnitId", required = false) Integer lastUnitId


,
    @ApiParam(value = "last_original_unit_id") @RequestParam(value = "lastOriginalUnitId", required = false) Integer lastOriginalUnitId


,
    @ApiParam(value = "last_original_value") @RequestParam(value = "lastOriginalValue", required = false) Integer lastOriginalValue


,
    @ApiParam(value = "last_value") @RequestParam(value = "lastValue", required = false) BigDecimal lastValue


,
    @ApiParam(value = "last_source_id") @RequestParam(value = "lastSourceId", required = false) Integer lastSourceId


,
    @ApiParam(value = "number_of_correlations") @RequestParam(value = "numberOfCorrelations", required = false) Integer numberOfCorrelations


,
    @ApiParam(value = "status") @RequestParam(value = "status", required = false) String status


,
    @ApiParam(value = "error_message") @RequestParam(value = "errorMessage", required = false) String errorMessage


,
    @ApiParam(value = "last_successful_update_time") @RequestParam(value = "lastSuccessfulUpdateTime", required = false) String lastSuccessfulUpdateTime


,
    @ApiParam(value = "standard_deviation") @RequestParam(value = "standardDeviation", required = false) BigDecimal standardDeviation


,
    @ApiParam(value = "variance") @RequestParam(value = "variance", required = false) BigDecimal variance


,
    @ApiParam(value = "minimum_recorded_daily_value") @RequestParam(value = "minimumRecordedDailyValue", required = false) BigDecimal minimumRecordedDailyValue


,
    @ApiParam(value = "maximum_recorded_daily_value") @RequestParam(value = "maximumRecordedDailyValue", required = false) BigDecimal maximumRecordedDailyValue


,
    @ApiParam(value = "mean") @RequestParam(value = "mean", required = false) BigDecimal mean


,
    @ApiParam(value = "median") @RequestParam(value = "median", required = false) BigDecimal median


,
    @ApiParam(value = "most_common_unit_id") @RequestParam(value = "mostCommonUnitId", required = false) Integer mostCommonUnitId


,
    @ApiParam(value = "most_common_value") @RequestParam(value = "mostCommonValue", required = false) BigDecimal mostCommonValue


,
    @ApiParam(value = "number_of_unique_daily_values") @RequestParam(value = "numberOfUniqueDailyValues", required = false) BigDecimal numberOfUniqueDailyValues


,
    @ApiParam(value = "number_of_changes") @RequestParam(value = "numberOfChanges", required = false) Integer numberOfChanges


,
    @ApiParam(value = "skewness") @RequestParam(value = "skewness", required = false) BigDecimal skewness


,
    @ApiParam(value = "kurtosis") @RequestParam(value = "kurtosis", required = false) BigDecimal kurtosis


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
    @ApiParam(value = "outcome") @RequestParam(value = "outcome", required = false) Boolean outcome


,
    @ApiParam(value = "sources") @RequestParam(value = "sources", required = false) String sources


,
    @ApiParam(value = "earliest_source_time") @RequestParam(value = "earliestSourceTime", required = false) Integer earliestSourceTime


,
    @ApiParam(value = "latest_source_time") @RequestParam(value = "latestSourceTime", required = false) Integer latestSourceTime


,
    @ApiParam(value = "earliest_measurement_time") @RequestParam(value = "earliestMeasurementTime", required = false) Integer earliestMeasurementTime


,
    @ApiParam(value = "latest_measurement_time") @RequestParam(value = "latestMeasurementTime", required = false) Integer latestMeasurementTime


,
    @ApiParam(value = "earliest_filling_time") @RequestParam(value = "earliestFillingTime", required = false) Integer earliestFillingTime


,
    @ApiParam(value = "latest_filling_time") @RequestParam(value = "latestFillingTime", required = false) Integer latestFillingTime


,
    @ApiParam(value = "limit") @RequestParam(value = "limit", required = false) Integer limit


,
    @ApiParam(value = "offset") @RequestParam(value = "offset", required = false) Integer offset


,
    @ApiParam(value = "sort") @RequestParam(value = "sort", required = false) String sort


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20021>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store UserVariable", notes = "Store UserVariable", response = InlineResponse20022.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse20022> userVariablesPost(

@ApiParam(value = "UserVariable that should be stored"  ) UserVariable body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20022>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get UserVariable", notes = "Get UserVariable", response = InlineResponse20022.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20022> userVariablesIdGet(
@ApiParam(value = "id of UserVariable",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20022>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update UserVariable", notes = "Update UserVariable", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> userVariablesIdPut(
@ApiParam(value = "id of UserVariable",required=true ) @PathVariable("id") Integer id

,
    

@ApiParam(value = "UserVariable that should be updated"  ) UserVariable body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete UserVariable", notes = "Delete UserVariable", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> userVariablesIdDelete(
@ApiParam(value = "id of UserVariable",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
