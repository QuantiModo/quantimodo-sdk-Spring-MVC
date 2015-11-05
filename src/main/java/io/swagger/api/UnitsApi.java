package io.swagger.api;

import io.swagger.model.*;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse20017;
import io.swagger.model.InlineResponse20018;
import io.swagger.model.Unit;
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
@RequestMapping(value = "/units", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/units", description = "the units API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-05T03:17:12.243Z")
public class UnitsApi {
  

  @ApiOperation(value = "Get all Units", notes = "Get all Units", response = InlineResponse20017.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20017> unitsGet(@ApiParam(value = "client_id") @RequestParam(value = "clientId", required = false) String clientId


,
    @ApiParam(value = "name") @RequestParam(value = "name", required = false) String name


,
    @ApiParam(value = "abbreviated_name") @RequestParam(value = "abbreviatedName", required = false) String abbreviatedName


,
    @ApiParam(value = "category_id") @RequestParam(value = "categoryId", required = false) Boolean categoryId


,
    @ApiParam(value = "minimum_value") @RequestParam(value = "minimumValue", required = false) BigDecimal minimumValue


,
    @ApiParam(value = "maximum_value") @RequestParam(value = "maximumValue", required = false) BigDecimal maximumValue


,
    @ApiParam(value = "updated") @RequestParam(value = "updated", required = false) Integer updated


,
    @ApiParam(value = "multiply") @RequestParam(value = "multiply", required = false) BigDecimal multiply


,
    @ApiParam(value = "add") @RequestParam(value = "add", required = false) BigDecimal add


,
    @ApiParam(value = "created_at") @RequestParam(value = "createdAt", required = false) String createdAt


,
    @ApiParam(value = "updated_at") @RequestParam(value = "updatedAt", required = false) String updatedAt


,
    @ApiParam(value = "limit") @RequestParam(value = "limit", required = false) Integer limit


,
    @ApiParam(value = "offset") @RequestParam(value = "offset", required = false) Integer offset


,
    @ApiParam(value = "sort") @RequestParam(value = "sort", required = false) String sort


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20017>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store Unit", notes = "Store Unit", response = InlineResponse20018.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse20018> unitsPost(

@ApiParam(value = "Unit that should be stored"  ) Unit body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20018>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get Unit", notes = "Get Unit", response = InlineResponse20018.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20018> unitsIdGet(
@ApiParam(value = "id of Unit",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20018>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update Unit", notes = "Update Unit", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> unitsIdPut(
@ApiParam(value = "id of Unit",required=true ) @PathVariable("id") Integer id

,
    

@ApiParam(value = "Unit that should be updated"  ) Unit body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete Unit", notes = "Delete Unit", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> unitsIdDelete(
@ApiParam(value = "id of Unit",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
