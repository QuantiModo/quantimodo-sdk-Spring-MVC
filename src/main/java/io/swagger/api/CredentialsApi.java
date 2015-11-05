package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.InlineResponse2009;
import io.swagger.model.InlineResponse20010;
import io.swagger.model.Credential;
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
@RequestMapping(value = "/credentials", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/credentials", description = "the credentials API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-05T03:17:12.243Z")
public class CredentialsApi {
  

  @ApiOperation(value = "Get all Credentials", notes = "Get all Credentials", response = InlineResponse2009.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2009> credentialsGet(@ApiParam(value = "connector_id") @RequestParam(value = "connectorId", required = false) Boolean connectorId


,
    @ApiParam(value = "attr_key") @RequestParam(value = "attrKey", required = false) String attrKey


,
    @ApiParam(value = "attr_value") @RequestParam(value = "attrValue", required = false) String attrValue


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
      return new ResponseEntity<InlineResponse2009>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store Credential", notes = "Store Credential", response = InlineResponse20010.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse20010> credentialsPost(

@ApiParam(value = "Credential that should be stored"  ) Credential body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20010>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get Credential", notes = "Get Credential", response = InlineResponse20010.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20010> credentialsIdGet(
@ApiParam(value = "connector id",required=true ) @PathVariable("id") Integer id

,
    @ApiParam(value = "attrKey", required = true) @RequestParam(value = "attrKey", required = true) String attrKey


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20010>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update Credential", notes = "Update Credential", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> credentialsIdPut(
@ApiParam(value = "connector id",required=true ) @PathVariable("id") Integer id

,
    @ApiParam(value = "attrKey", required = true) @RequestParam(value = "attrKey", required = true) String attrKey


,
    

@ApiParam(value = "Credential that should be updated"  ) Credential body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete Credential", notes = "Delete Credential", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> credentialsIdDelete(
@ApiParam(value = "connector id",required=true ) @PathVariable("id") Integer id

,
    @ApiParam(value = "attrKey", required = true) @RequestParam(value = "attrKey", required = true) String attrKey


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
