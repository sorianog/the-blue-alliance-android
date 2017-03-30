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
import com.thebluealliance.api.model.IDistrict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.annotation.Nullable;


/**
 * Event
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-30T15:18:38.021-04:00")
public interface IEvent   {


   /**
   * Address of the event venue
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "Address of the event venue")
  @Nullable
  public String getAddress();

  public void setAddress(String address);



   /**
   * Get district
   * @return district
  **/
  @ApiModelProperty(example = "null", value = "")
  @Nullable
  public IDistrict getDistrict();

  public void setDistrict(IDistrict district);



   /**
   * When the event ends
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "When the event ends")
  @Nullable
  public Date getEndDate();

  public void setEndDate(Date endDate);



   /**
   * IEvent short code, as provided by FIRST
   * @return eventCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "Event short code, as provided by FIRST")
  
  public String getEventCode();

  public void setEventCode(String eventCode);



   /**
   * An integer that represents the event type as a constant.
   * @return eventType
  **/
  @ApiModelProperty(example = "null", value = "An integer that represents the event type as a constant.")
  @Nullable
  public Integer getEventType();

  public void setEventType(Integer eventType);



   /**
   * A human readable string that defines the event type.
   * @return eventTypeString
  **/
  @ApiModelProperty(example = "null", value = "A human readable string that defines the event type.")
  @Nullable
  public String getEventTypeString();

  public void setEventTypeString(String eventTypeString);



   /**
   * URL for the venue on Google Maps
   * @return gmapsUrl
  **/
  @ApiModelProperty(example = "null", value = "URL for the venue on Google Maps")
  @Nullable
  public String getGmapsUrl();

  public void setGmapsUrl(String gmapsUrl);



   /**
   * TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.
   * @return key
  **/
  @ApiModelProperty(example = "null", required = true, value = "TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.")
  
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
   * Short name of the venue
   * @return locationName
  **/
  @ApiModelProperty(example = "null", value = "Short name of the venue")
  @Nullable
  public String getLocationName();

  public void setLocationName(String locationName);



   /**
   * Official name of event on record either provided by FIRST or organizers of offseason event.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Official name of event on record either provided by FIRST or organizers of offseason event.")
  
  public String getName();

  public void setName(String name);



   /**
   * Same as name but doesn't include event specifiers, such as 'Regional' or 'District'. May be null.
   * @return shortName
  **/
  @ApiModelProperty(example = "null", value = "Same as name but doesn't include event specifiers, such as 'Regional' or 'District'. May be null.")
  @Nullable
  public String getShortName();

  public void setShortName(String shortName);



   /**
   * When the event starts
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "When the event starts")
  @Nullable
  public Date getStartDate();

  public void setStartDate(Date startDate);



   /**
   * Timezone name
   * @return timezone
  **/
  @ApiModelProperty(example = "null", value = "Timezone name")
  @Nullable
  public String getTimezone();

  public void setTimezone(String timezone);



   /**
   * If the event has webcast data associated with it, this contains JSON data of the streams
   * @return webcasts
  **/
  @ApiModelProperty(example = "null", value = "If the event has webcast data associated with it, this contains JSON data of the streams")
  @Nullable
  public String getWebcasts();

  public void setWebcasts(String webcasts);



   /**
   * The event's website, if any.
   * @return website
  **/
  @ApiModelProperty(example = "null", value = "The event's website, if any.")
  @Nullable
  public String getWebsite();

  public void setWebsite(String website);



   /**
   * Week of the season the event occurs on
   * @return week
  **/
  @ApiModelProperty(example = "null", value = "Week of the season the event occurs on")
  @Nullable
  public Integer getWeek();

  public void setWeek(Integer week);



   /**
   * Year the event data is for.
   * @return year
  **/
  @ApiModelProperty(example = "null", required = true, value = "Year the event data is for.")
  
  public Integer getYear();

  public void setYear(Integer year);

}

