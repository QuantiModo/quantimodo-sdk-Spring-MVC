package io.swagger.api;

import io.swagger.model.*;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse200;
import io.swagger.model.AggregatedCorrelation;
import io.swagger.model.InlineResponse2001;
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
@RequestMapping(value = "/aggregatedCorrelations", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/aggregatedCorrelations", description = "the aggregatedCorrelations API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-05T03:17:12.243Z")
public class AggregatedCorrelationsApi {
  

  @ApiOperation(value = "Get all AggregatedCorrelations", notes = "Get all AggregatedCorrelations", response = InlineResponse200.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse200> aggregatedCorrelationsGet(@ApiParam(value = "correlation") @RequestParam(value = "correlation", required = false) BigDecimal correlation


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
    @ApiParam(value = "number_of_users") @RequestParam(value = "numberOfUsers", required = false) Integer numberOfUsers


,
    @ApiParam(value = "number_of_correlations") @RequestParam(value = "numberOfCorrelations", required = false) Integer numberOfCorrelations


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
    @ApiParam(value = "aggregate_qm_score") @RequestParam(value = "aggregateQmScore", required = false) BigDecimal aggregateQmScore


,
    @ApiParam(value = "created_at") @RequestParam(value = "createdAt", required = false) String createdAt


,
    @ApiParam(value = "updated_at") @RequestParam(value = "updatedAt", required = false) String updatedAt


,
    @ApiParam(value = "status") @RequestParam(value = "status", required = false) String status


,
    @ApiParam(value = "error_message") @RequestParam(value = "errorMessage", required = false) String errorMessage


,
    @ApiParam(value = "last_successful_update_time") @RequestParam(value = "lastSuccessfulUpdateTime", required = false) String lastSuccessfulUpdateTime


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
      return new ResponseEntity<InlineResponse200>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Store AggregatedCorrelation", notes = "Store AggregatedCorrelation", response = InlineResponse2001.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<InlineResponse2001> aggregatedCorrelationsPost(

@ApiParam(value = "AggregatedCorrelation that should be stored"  ) AggregatedCorrelation body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get AggregatedCorrelation", notes = "Get AggregatedCorrelation", response = InlineResponse2001.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<InlineResponse2001> aggregatedCorrelationsIdGet(
@ApiParam(value = "id of AggregatedCorrelation",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Update AggregatedCorrelation", notes = "Update AggregatedCorrelation", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<InlineResponse2002> aggregatedCorrelationsIdPut(
@ApiParam(value = "id of AggregatedCorrelation",required=true ) @PathVariable("id") Integer id

,
    

@ApiParam(value = "AggregatedCorrelation that should be updated"  ) AggregatedCorrelation body
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Delete AggregatedCorrelation", notes = "Delete AggregatedCorrelation", response = InlineResponse2002.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })
  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<InlineResponse2002> aggregatedCorrelationsIdDelete(
@ApiParam(value = "id of AggregatedCorrelation",required=true ) @PathVariable("id") Integer id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<InlineResponse2002>(HttpStatus.OK);
  }

  
}
