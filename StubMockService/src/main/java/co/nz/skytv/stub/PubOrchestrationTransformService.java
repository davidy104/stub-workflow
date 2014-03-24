package co.nz.skytv.stub;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface PubOrchestrationTransformService {

	TransformResponse transform(@WebParam TransformRequest transformRequest);
}
