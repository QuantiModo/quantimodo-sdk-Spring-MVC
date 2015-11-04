package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.InlineResponse2005;
import io.swagger.model.Connector;
import io.swagger.model.InlineResponse2006;
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
@RequestMapping(value = "/connectors", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/connectors", description = "the connectors API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-03T22:25:20.334Z")
public class ConnectorsApi {
  

  @ApiOperation(value = "Get all Connectors", notes = "Get all Connectors", response = InlineResponse2005.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2005> connectorsGet(@ApiParam(value = "name") @RequestParam(value = "name", required = false) String name


,
    @ApiParam(value = "display_name") @RequestParam(value = "displayName", required = false) String displayName


,
    @ApiParam(value = "image") @RequestParam(value = "image", required = false) String image


,
    @ApiParam(value = "get_it_url") @RequestParam(value = "getItUrl", required = false) String getItUrl


,
    @ApiParam(value = "short_description") @RequestParam(value = "shortDescription", required = false) String shortDescription


,
    @ApiParam(value = "long_description") @RequestParam(value = "longDescription", required = false) String longDescription


,
    @ApiParam(value = "enabled") @RequestParam(value = "enabled", required = false) Boolean enabled


,
    @ApiParam(value = "oauth") @RequestParam(value = "oauth", required = false) Boolean oauth


,
    @ApiParam(value = "limit") @RequestParam(value = "limit", required = false) Integer limit


,
    @ApiParam(value = "offset") @RequestParam(value = "offset", required = false) Integer offset


,
    @ApiParam(value = "sort") @RequestParam(value = "sort", required = false) String sort


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2005>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store Connector", notes = "Store Connector", response = InlineResponse2006.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse2006> connectorsPost(

@ApiParam(value = "Connector that should be stored"  ) Connector body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2006>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get Connector", notes = "Get Connector", response = InlineResponse2006.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2006> connectorsIdGet(
@ApiParam(value = "id of Connector",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2006>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update Connector", notes = "Update Connector", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> connectorsIdPut(
@ApiParam(value = "id of Connector",required=true ) @PathVariable("id") Integer id

,
    

@ApiParam(value = "Connector that should be updated"  ) Connector body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete Connector", notes = "Delete Connector", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> connectorsIdDelete(
@ApiParam(value = "id of Connector",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
