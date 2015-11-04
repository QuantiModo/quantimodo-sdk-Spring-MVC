package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.InlineResponse20025;
import io.swagger.model.InlineResponse20026;
import io.swagger.model.VariableUserSource;
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
@RequestMapping(value = "/variableUserSources", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/variableUserSources", description = "the variableUserSources API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-03T22:25:20.334Z")
public class VariableUserSourcesApi {
  

  @ApiOperation(value = "Get all VariableUserSources", notes = "Get all VariableUserSources", response = InlineResponse20025.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20025> variableUserSourcesGet(@ApiParam(value = "variable_id") @RequestParam(value = "variableId", required = false) Integer variableId


,
    @ApiParam(value = "user_id") @RequestParam(value = "userId", required = false) Integer userId


,
    @ApiParam(value = "timestamp") @RequestParam(value = "timestamp", required = false) Integer timestamp


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
      return new ResponseEntity<InlineResponse20025>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store VariableUserSource", notes = "Store VariableUserSource", response = InlineResponse20026.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse20026> variableUserSourcesPost(

@ApiParam(value = "VariableUserSource that should be stored"  ) VariableUserSource body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20026>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get VariableUserSource", notes = "Get VariableUserSource", response = InlineResponse20026.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20026> variableUserSourcesIdGet(
@ApiParam(value = "id of VariableUserSource",required=true ) @PathVariable("id") Integer id

,
    @ApiParam(value = "source id of VariableUserSource", required = true) @RequestParam(value = "sourceId", required = true) Integer sourceId


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20026>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update VariableUserSource", notes = "Update VariableUserSource", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> variableUserSourcesIdPut(
@ApiParam(value = "variable_id of VariableUserSource",required=true ) @PathVariable("id") Integer id

,
    @ApiParam(value = "source id of VariableUserSource", required = true) @RequestParam(value = "sourceId", required = true) Integer sourceId


,
    

@ApiParam(value = "VariableUserSource that should be updated"  ) VariableUserSource body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete VariableUserSource", notes = "Delete VariableUserSource", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> variableUserSourcesIdDelete(
@ApiParam(value = "variable_id of VariableUserSource",required=true ) @PathVariable("id") Integer id

,
    @ApiParam(value = "source id of VariableUserSource", required = true) @RequestParam(value = "sourceId", required = true) Integer sourceId


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
