package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.InlineResponse2003;
import io.swagger.model.InlineResponse2004;
import io.swagger.model.Connection;
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
@RequestMapping(value = "/connections", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/connections", description = "the connections API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-05T03:17:12.243Z")
public class ConnectionsApi {
  

  @ApiOperation(value = "Get all Connections", notes = "Get all Connections", response = InlineResponse2003.class, authorizations = {
    @Authorization(value = "quantimodo_oauth2", scopes = {
      @AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
      })
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2003> connectionsGet(@ApiParam(value = "user_id") @RequestParam(value = "userId", required = false) Integer userId


,
    @ApiParam(value = "connector_id") @RequestParam(value = "connectorId", required = false) Integer connectorId


,
    @ApiParam(value = "connect_status") @RequestParam(value = "connectStatus", required = false) String connectStatus


,
    @ApiParam(value = "connect_error") @RequestParam(value = "connectError", required = false) String connectError


,
    @ApiParam(value = "update_requested_at") @RequestParam(value = "updateRequestedAt", required = false) String updateRequestedAt


,
    @ApiParam(value = "update_status") @RequestParam(value = "updateStatus", required = false) String updateStatus


,
    @ApiParam(value = "update_error") @RequestParam(value = "updateError", required = false) String updateError


,
    @ApiParam(value = "last_successful_updated_at") @RequestParam(value = "lastSuccessfulUpdatedAt", required = false) String lastSuccessfulUpdatedAt


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
      return new ResponseEntity<InlineResponse2003>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store Connection", notes = "Store Connection", response = InlineResponse2004.class, authorizations = {
    @Authorization(value = "quantimodo_oauth2", scopes = {
      @AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
      })
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse2004> connectionsPost(

@ApiParam(value = "Connection that should be stored"  ) Connection body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get Connection", notes = "Get Connection", response = InlineResponse2004.class, authorizations = {
    @Authorization(value = "quantimodo_oauth2", scopes = {
      @AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
      })
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2004> connectionsIdGet(
@ApiParam(value = "id of Connection",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2004>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update Connection", notes = "Update Connection", response = InlineResponse2002.class, authorizations = {
    @Authorization(value = "quantimodo_oauth2", scopes = {
      @AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
      })
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> connectionsIdPut(
@ApiParam(value = "id of Connection",required=true ) @PathVariable("id") Integer id

,
    

@ApiParam(value = "Connection that should be updated"  ) Connection body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete Connection", notes = "Delete Connection", response = InlineResponse2002.class, authorizations = {
    @Authorization(value = "quantimodo_oauth2", scopes = {
      @AuthorizationScope(scope = "basic", description = "allows you to read user info (displayname, email, etc).")
      })
  })
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> connectionsIdDelete(
@ApiParam(value = "id of Connection",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
