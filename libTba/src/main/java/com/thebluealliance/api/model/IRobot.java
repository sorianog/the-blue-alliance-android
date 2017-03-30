/**
 * The Blue Alliance APIv3
 * Access data about the FIRST Robotics Competition
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.thebluealliance.api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.annotation.Nullable;


/**
 * Robot
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-30T15:18:38.021-04:00")
public interface IRobot   {


   /**
   * A key identifying the robot object. Formed like [team_key]_[year]
   * @return key
  **/
  @ApiModelProperty(example = "null", required = true, value = "A key identifying the robot object. Formed like [team_key]_[year]")
  
  public String getKey();

  public void setKey(String key);



   /**
   * Timestamp this model was last modified
   * @return lastModified
  **/
  @ApiModelProperty(example = "null", value = "Timestamp this model was last modified")
  @Nullable
  public Long getLastModified();

  public void setLastModified(Long lastModified);



   /**
   * The robot name in this year
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The robot name in this year")
  
  public String getName();

  public void setName(String name);



   /**
   * The associated ITeam key
   * @return teamKey
  **/
  @ApiModelProperty(example = "null", required = true, value = "The associated ITeam key")
  
  public String getTeamKey();

  public void setTeamKey(String teamKey);



   /**
   * The year this IRobot model referes to
   * @return year
  **/
  @ApiModelProperty(example = "null", required = true, value = "The year this IRobot model referes to")
  
  public Integer getYear();

  public void setYear(Integer year);

}

