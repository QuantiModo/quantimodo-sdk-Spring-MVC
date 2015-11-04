package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.InlineResponse20023;
import java.math.BigDecimal;
import io.swagger.model.VariableCategory;
import io.swagger.model.InlineResponse20024;
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
@RequestMapping(value = "/variableCategories", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/variableCategories", description = "the variableCategories API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-03T22:25:20.334Z")
public class VariableCategoriesApi {
  

  @ApiOperation(value = "Get all VariableCategories", notes = "Get all VariableCategories", response = InlineResponse20023.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20023> variableCategoriesGet(@ApiParam(value = "name") @RequestParam(value = "name", required = false) String name


,
    @ApiParam(value = "filling_value") @RequestParam(value = "fillingValue", required = false) BigDecimal fillingValue


,
    @ApiParam(value = "maximum_allowed_value") @RequestParam(value = "maximumAllowedValue", required = false) BigDecimal maximumAllowedValue


,
    @ApiParam(value = "minimum_allowed_value") @RequestParam(value = "minimumAllowedValue", required = false) BigDecimal minimumAllowedValue


,
    @ApiParam(value = "duration_of_action") @RequestParam(value = "durationOfAction", required = false) Integer durationOfAction


,
    @ApiParam(value = "onset_delay") @RequestParam(value = "onsetDelay", required = false) Integer onsetDelay


,
    @ApiParam(value = "combination_operation") @RequestParam(value = "combinationOperation", required = false) String combinationOperation


,
    @ApiParam(value = "updated") @RequestParam(value = "updated", required = false) Integer updated


,
    @ApiParam(value = "cause_only") @RequestParam(value = "causeOnly", required = false) Boolean causeOnly


,
    @ApiParam(value = "public") @RequestParam(value = "_public", required = false) Integer _public


,
    @ApiParam(value = "outcome") @RequestParam(value = "outcome", required = false) Boolean outcome


,
    @ApiParam(value = "created_at") @RequestParam(value = "createdAt", required = false) String createdAt


,
    @ApiParam(value = "updated_at") @RequestParam(value = "updatedAt", required = false) String updatedAt


,
    @ApiParam(value = "image_url") @RequestParam(value = "imageUrl", required = false) String imageUrl


,
    @ApiParam(value = "default_unit_id") @RequestParam(value = "defaultUnitId", required = false) Integer defaultUnitId


,
    @ApiParam(value = "limit") @RequestParam(value = "limit", required = false) Integer limit


,
    @ApiParam(value = "offset") @RequestParam(value = "offset", required = false) Integer offset


,
    @ApiParam(value = "sort") @RequestParam(value = "sort", required = false) String sort


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20023>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store VariableCategory", notes = "Store VariableCategory", response = InlineResponse20024.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse20024> variableCategoriesPost(

@ApiParam(value = "VariableCategory that should be stored"  ) VariableCategory body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20024>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get VariableCategory", notes = "Get VariableCategory", response = InlineResponse20024.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20024> variableCategoriesIdGet(
@ApiParam(value = "id of VariableCategory",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20024>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update VariableCategory", notes = "Update VariableCategory", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> variableCategoriesIdPut(
@ApiParam(value = "id of VariableCategory",required=true ) @PathVariable("id") Integer id

,
    

@ApiParam(value = "VariableCategory that should be updated"  ) VariableCategory body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete VariableCategory", notes = "Delete VariableCategory", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> variableCategoriesIdDelete(
@ApiParam(value = "id of VariableCategory",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
