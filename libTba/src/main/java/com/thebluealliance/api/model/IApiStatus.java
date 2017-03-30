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
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;


/**
 * ApiStatus
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-30T15:18:38.021-04:00")
public interface IApiStatus   {


   /**
   * Last update of CMP pit location
   * @return champsPitLocationsUpdateTime
  **/
  @ApiModelProperty(example = "null", value = "Last update of CMP pit location")
  @Nullable
  public Long getChampsPitLocationsUpdateTime();

  public void setChampsPitLocationsUpdateTime(Long champsPitLocationsUpdateTime);



   /**
   * Location of data file for CMP pits
   * @return champsPitLocationsUrl
  **/
  @ApiModelProperty(example = "null", value = "Location of data file for CMP pits")
  @Nullable
  public String getChampsPitLocationsUrl();

  public void setChampsPitLocationsUrl(String champsPitLocationsUrl);



   /**
   * Current default year to show
   * @return currentSeason
  **/
  @ApiModelProperty(example = "null", value = "Current default year to show")
  @Nullable
  public Integer getCurrentSeason();

  public void setCurrentSeason(Integer currentSeason);





   /**
   * A list of event keys that are not publishing data
   * @return downEvents
  **/
  @ApiModelProperty(example = "null", value = "A list of event keys that are not publishing data")
  @Nullable
  public List<String> getDownEvents();

  public void setDownEvents(List<String> downEvents);



   /**
   * Is FIRST's datafeed down?
   * @return fmsApiDown
  **/
  @ApiModelProperty(example = "null", value = "Is FIRST's datafeed down?")
  @Nullable
  public Boolean getFmsApiDown();

  public void setFmsApiDown(Boolean fmsApiDown);



   /**
   * Is there an admin message to show?
   * @return hasMessage
  **/
  @ApiModelProperty(example = "null", value = "Is there an admin message to show?")
  @Nullable
  public Boolean getHasMessage();

  public void setHasMessage(Boolean hasMessage);



   /**
   * Timestamp this model was last modified
   * @return lastModified
  **/
  @ApiModelProperty(example = "null", value = "Timestamp this model was last modified")
  @Nullable
  public Long getLastModified();

  public void setLastModified(Long lastModified);



   /**
   * Ensure that the app's network caches are cleared by this timestamp
   * @return lastOkHttpCacheClear
  **/
  @ApiModelProperty(example = "null", value = "Ensure that the app's network caches are cleared by this timestamp")
  @Nullable
  public Long getLastOkHttpCacheClear();

  public void setLastOkHttpCacheClear(Long lastOkHttpCacheClear);



   /**
   * Newest app version code
   * @return latestAppVersion
  **/
  @ApiModelProperty(example = "null", value = "Newest app version code")
  @Nullable
  public Integer getLatestAppVersion();

  public void setLatestAppVersion(Integer latestAppVersion);



   /**
   * Max year we have data for
   * @return maxSeason
  **/
  @ApiModelProperty(example = "null", value = "Max year we have data for")
  @Nullable
  public Integer getMaxSeason();

  public void setMaxSeason(Integer maxSeason);



   /**
   * Expiration of the admin message
   * @return messageExpiration
  **/
  @ApiModelProperty(example = "null", value = "Expiration of the admin message")
  @Nullable
  public Long getMessageExpiration();

  public void setMessageExpiration(Long messageExpiration);



   /**
   * Admin message
   * @return messageText
  **/
  @ApiModelProperty(example = "null", value = "Admin message")
  @Nullable
  public String getMessageText();

  public void setMessageText(String messageText);



   /**
   * Lowest allowed app version code
   * @return minAppVersion
  **/
  @ApiModelProperty(example = "null", value = "Lowest allowed app version code")
  @Nullable
  public Integer getMinAppVersion();

  public void setMinAppVersion(Integer minAppVersion);

}

