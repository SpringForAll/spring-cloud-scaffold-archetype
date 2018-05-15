package $

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

{package}.api.v1;

/**
 * HeartBeatRestService the restful api for example
 *
 * @author fangzhibin
 */
@Api(value = "心跳接口")
@Path("heartbeat/v1")
@Produces(MediaType.APPLICATION_JSON)
public interface HeartBeatRestService {

  /**
   * 心跳检测
   */
  @GET
  @Path("/beat")
  @ApiOperation(value = "心跳检测", notes = "心跳检测")
  Boolean beat();

}
