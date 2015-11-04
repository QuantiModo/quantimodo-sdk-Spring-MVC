package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.InlineResponse20029;
import io.swagger.model.Vote;
import io.swagger.model.InlineResponse20030;
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
@RequestMapping(value = "/votes", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/votes", description = "the votes API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-03T22:25:20.334Z")
public class VotesApi {
  

  @ApiOperation(value = "Get all Votes", notes = "Get all Votes", response = InlineResponse20029.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20029> votesGet(@ApiParam(value = "client_id") @RequestParam(value = "clientId", required = false) String clientId


,
    @ApiParam(value = "user_id") @RequestParam(value = "userId", required = false) Integer userId


,
    @ApiParam(value = "cause_id") @RequestParam(value = "causeId", required = false) Integer causeId


,
    @ApiParam(value = "effect_id") @RequestParam(value = "effectId", required = false) Integer effectId


,
    @ApiParam(value = "value") @RequestParam(value = "value", required = false) Integer value


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
      return new ResponseEntity<InlineResponse20029>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store Vote", notes = "Store Vote", response = InlineResponse20030.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse20030> votesPost(

@ApiParam(value = "Vote that should be stored"  ) Vote body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20030>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get Vote", notes = "Get Vote", response = InlineResponse20030.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse20030> votesIdGet(
@ApiParam(value = "id of Vote",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse20030>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update Vote", notes = "Update Vote", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> votesIdPut(
@ApiParam(value = "id of Vote",required=true ) @PathVariable("id") Integer id

,
    

@ApiParam(value = "Vote that should be updated"  ) Vote body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete Vote", notes = "Delete Vote", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> votesIdDelete(
@ApiParam(value = "id of Vote",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
