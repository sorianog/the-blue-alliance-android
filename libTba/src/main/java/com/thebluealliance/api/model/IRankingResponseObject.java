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
import com.thebluealliance.api.model.IRankingItem;
import com.thebluealliance.api.model.IRankingSortOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;


/**
 * RankingResponseObject
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-30T15:18:38.021-04:00")
public interface IRankingResponseObject   {




   /**
   * Get extraStatsInfo
   * @return extraStatsInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  @Nullable
  public List<IRankingSortOrder> getExtraStatsInfo();

  public void setExtraStatsInfo(List<IRankingSortOrder> extraStatsInfo);



   /**
   * Timestamp this model was last modified
   * @return lastModified
  **/
  @ApiModelProperty(example = "null", value = "Timestamp this model was last modified")
  @Nullable
  public Long getLastModified();

  public void setLastModified(Long lastModified);





   /**
   * Get rankings
   * @return rankings
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  
  public List<IRankingItem> getRankings();

  public void setRankings(List<IRankingItem> rankings);





   /**
   * Get sortOrderInfo
   * @return sortOrderInfo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  
  public List<IRankingSortOrder> getSortOrderInfo();

  public void setSortOrderInfo(List<IRankingSortOrder> sortOrderInfo);

}

