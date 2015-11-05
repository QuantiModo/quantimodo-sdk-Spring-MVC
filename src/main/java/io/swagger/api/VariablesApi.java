package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.InlineResponse20027;
import java.math.BigDecimal;
import io.swagger.model.InlineResponse20028;
import io.swagger.model.Variable;
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
@RequestMapping(value = "/variables", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/variables", description = "the variables API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-05T03:17:12.243Z")
public class VariablesApi {
  

  @ApiOperation(value = "Get all Variables", notes = "Get all Variables", response = InlineResponse20027.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20027> variablesGet(@ApiParam(value = "id") @RequestParam(value = "id", required = false) Integer id


,
    @ApiParam(value = "client_id") @RequestParam(value = "clientId", required = false) String clientId


,
    @ApiParam(value = "parent_id") @RequestParam(value = "parentId", required = false) Integer parentId


,
    @ApiParam(value = "name") @RequestParam(value = "name", required = false) String name


,
    @ApiParam(value = "variable_category_id") @RequestParam(value = "variableCategoryId", required = false) Integer variableCategoryId


,
    @ApiParam(value = "default_unit_id") @RequestParam(value = "defaultUnitId", required = false) Integer defaultUnitId


,
    @ApiParam(value = "combination_operation") @RequestParam(value = "combinationOperation", required = false) String combinationOperation


,
    @ApiParam(value = "filling_value") @RequestParam(value = "fillingValue", required = false) BigDecimal fillingValue


,
    @ApiParam(value = "maximum_allowed_value") @RequestParam(value = "maximumAllowedValue", required = false) BigDecimal maximumAllowedValue


,
    @ApiParam(value = "minimum_allowed_value") @RequestParam(value = "minimumAllowedValue", required = false) BigDecimal minimumAllowedValue


,
    @ApiParam(value = "onset_delay") @RequestParam(value = "onsetDelay", required = false) Integer onsetDelay


,
    @ApiParam(value = "duration_of_action") @RequestParam(value = "durationOfAction", required = false) Integer durationOfAction


,
    @ApiParam(value = "public") @RequestParam(value = "_public", required = false) Integer _public


,
    @ApiParam(value = "cause_only") @RequestParam(value = "causeOnly", required = false) Boolean causeOnly


,
    @ApiParam(value = "most_common_value") @RequestParam(value = "mostCommonValue", required = false) BigDecimal mostCommonValue


,
    @ApiParam(value = "most_common_unit_id") @RequestParam(value = "mostCommonUnitId", required = false) Integer mostCommonUnitId


,
    @ApiParam(value = "standard_deviation") @RequestParam(value = "standardDeviation", required = false) BigDecimal standardDeviation


,
    @ApiParam(value = "variance") @RequestParam(value = "variance", required = false) BigDecimal variance


,
    @ApiParam(value = "mean") @RequestParam(value = "mean", required = false) BigDecimal mean


,
    @ApiParam(value = "median") @RequestParam(value = "median", required = false) BigDecimal median


,
    @ApiParam(value = "number_of_measurements") @RequestParam(value = "numberOfMeasurements", required = false) BigDecimal numberOfMeasurements


,
    @ApiParam(value = "number_of_unique_values") @RequestParam(value = "numberOfUniqueValues", required = false) BigDecimal numberOfUniqueValues


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
    @ApiParam(value = "status") @RequestParam(value = "status", required = false) String status


,
    @ApiParam(value = "error_message") @RequestParam(value = "errorMessage", required = false) String errorMessage


,
    @ApiParam(value = "last_successful_update_time") @RequestParam(value = "lastSuccessfulUpdateTime", required = false) String lastSuccessfulUpdateTime


,
    @ApiParam(value = "created_at") @RequestParam(value = "createdAt", required = false) String createdAt


,
    @ApiParam(value = "updated_at") @RequestParam(value = "updatedAt", required = false) String updatedAt


,
    @ApiParam(value = "product_url") @RequestParam(value = "productUrl", required = false) String productUrl


,
    @ApiParam(value = "image_url") @RequestParam(value = "imageUrl", required = false) String imageUrl


,
    @ApiParam(value = "price") @RequestParam(value = "price", required = false) BigDecimal price


,
    @ApiParam(value = "number_of_user_variables") @RequestParam(value = "numberOfUserVariables", required = false) Integer numberOfUserVariables


,
    @ApiParam(value = "outcome") @RequestParam(value = "outcome", required = false) Boolean outcome


,
    @ApiParam(value = "minimum_recorded_value") @RequestParam(value = "minimumRecordedValue", required = false) BigDecimal minimumRecordedValue


,
    @ApiParam(value = "maximum_recorded_value") @RequestParam(value = "maximumRecordedValue", required = false) BigDecimal maximumRecordedValue


,
    @ApiParam(value = "limit") @RequestParam(value = "limit", required = false) Integer limit


,
    @ApiParam(value = "offset") @RequestParam(value = "offset", required = false) Integer offset


,
    @ApiParam(value = "sort") @RequestParam(value = "sort", required = false) String sort


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20027>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store Variable", notes = "Store Variable", response = InlineResponse20028.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse20028> variablesPost(

@ApiParam(value = "Variable that should be stored"  ) Variable body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20028>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get Variable", notes = "Get Variable", response = InlineResponse20028.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20028> variablesIdGet(
@ApiParam(value = "id of Variable",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20028>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update Variable", notes = "Update Variable", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> variablesIdPut(
@ApiParam(value = "id of Variable",required=true ) @PathVariable("id") Integer id

,
    

@ApiParam(value = "Variable that should be updated"  ) Variable body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete Variable", notes = "Delete Variable", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> variablesIdDelete(
@ApiParam(value = "id of Variable",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
