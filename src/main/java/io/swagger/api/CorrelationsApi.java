package io.swagger.api;

import io.swagger.model.*;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.Correlation;
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
@RequestMapping(value = "/correlations", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/correlations", description = "the correlations API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-05T03:17:12.243Z")
public class CorrelationsApi {
  

  @ApiOperation(value = "Get all Correlations", notes = "Get all Correlations", response = InlineResponse2007.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2007> correlationsGet(@ApiParam(value = "timestamp") @RequestParam(value = "timestamp", required = false) Integer timestamp


,
    @ApiParam(value = "user_id") @RequestParam(value = "userId", required = false) Integer userId


,
    @ApiParam(value = "correlation") @RequestParam(value = "correlation", required = false) BigDecimal correlation


,
    @ApiParam(value = "cause_id") @RequestParam(value = "causeId", required = false) Integer causeId


,
    @ApiParam(value = "effect_id") @RequestParam(value = "effectId", required = false) Integer effectId


,
    @ApiParam(value = "onset_delay") @RequestParam(value = "onsetDelay", required = false) Integer onsetDelay


,
    @ApiParam(value = "duration_of_action") @RequestParam(value = "durationOfAction", required = false) Integer durationOfAction


,
    @ApiParam(value = "number_of_pairs") @RequestParam(value = "numberOfPairs", required = false) Integer numberOfPairs


,
    @ApiParam(value = "value_predicting_high_outcome") @RequestParam(value = "valuePredictingHighOutcome", required = false) BigDecimal valuePredictingHighOutcome


,
    @ApiParam(value = "value_predicting_low_outcome") @RequestParam(value = "valuePredictingLowOutcome", required = false) BigDecimal valuePredictingLowOutcome


,
    @ApiParam(value = "optimal_pearson_product") @RequestParam(value = "optimalPearsonProduct", required = false) BigDecimal optimalPearsonProduct


,
    @ApiParam(value = "vote") @RequestParam(value = "vote", required = false) BigDecimal vote


,
    @ApiParam(value = "statistical_significance") @RequestParam(value = "statisticalSignificance", required = false) BigDecimal statisticalSignificance


,
    @ApiParam(value = "cause_unit") @RequestParam(value = "causeUnit", required = false) String causeUnit


,
    @ApiParam(value = "cause_unit_id") @RequestParam(value = "causeUnitId", required = false) Integer causeUnitId


,
    @ApiParam(value = "cause_changes") @RequestParam(value = "causeChanges", required = false) Integer causeChanges


,
    @ApiParam(value = "effect_changes") @RequestParam(value = "effectChanges", required = false) Integer effectChanges


,
    @ApiParam(value = "qm_score") @RequestParam(value = "qmScore", required = false) BigDecimal qmScore


,
    @ApiParam(value = "error") @RequestParam(value = "error", required = false) String error


,
    @ApiParam(value = "created_at") @RequestParam(value = "createdAt", required = false) String createdAt


,
    @ApiParam(value = "updated_at") @RequestParam(value = "updatedAt", required = false) String updatedAt


,
    @ApiParam(value = "reverse_pearson_correlation_coefficient") @RequestParam(value = "reversePearsonCorrelationCoefficient", required = false) BigDecimal reversePearsonCorrelationCoefficient


,
    @ApiParam(value = "predictive_pearson_correlation_coefficient") @RequestParam(value = "predictivePearsonCorrelationCoefficient", required = false) BigDecimal predictivePearsonCorrelationCoefficient


,
    @ApiParam(value = "limit") @RequestParam(value = "limit", required = false) Integer limit


,
    @ApiParam(value = "offset") @RequestParam(value = "offset", required = false) Integer offset


,
    @ApiParam(value = "sort") @RequestParam(value = "sort", required = false) String sort


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2007>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store Correlation", notes = "Store Correlation", response = InlineResponse2008.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse2008> correlationsPost(

@ApiParam(value = "Correlation that should be stored"  ) Correlation body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2008>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get Correlation", notes = "Get Correlation", response = InlineResponse2008.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2008> correlationsIdGet(
@ApiParam(value = "id of Correlation",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2008>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update Correlation", notes = "Update Correlation", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> correlationsIdPut(
@ApiParam(value = "id of Correlation",required=true ) @PathVariable("id") Integer id

,
    

@ApiParam(value = "Correlation that should be updated"  ) Correlation body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete Correlation", notes = "Delete Correlation", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> correlationsIdDelete(
@ApiParam(value = "id of Correlation",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
