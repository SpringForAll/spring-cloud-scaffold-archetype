package $

import io.swagger.annotations.ApiModel;
import lombok.Data;

{package}.api.v1.dto;

/**
 * the DTO for example
 *
 * @author fangzhibin
 */
@Data
@ApiModel
public class ScaffoldDTO {

  private Long id;

  private String name;
}