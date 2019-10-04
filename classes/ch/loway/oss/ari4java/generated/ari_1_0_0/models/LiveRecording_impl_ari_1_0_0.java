package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Oct 02 15:49:49 SAST 2019
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * A recording that is in progress
 * 
 * Defined in file: recordings.json
 * Generated by: Model
 *********************************************************/

public class LiveRecording_impl_ari_1_0_0 implements LiveRecording, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Cause for recording failure if failed  */
  private String cause;
 public String getCause() {
   return cause;
 }

 @JsonDeserialize( as=String.class )
 public void setCause(String val ) {
   cause = val;
 }

  /**    */
  private String format;
 public String getFormat() {
   return format;
 }

 @JsonDeserialize( as=String.class )
 public void setFormat(String val ) {
   format = val;
 }

  /**  Base name for the recording  */
  private String name;
 public String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(String val ) {
   name = val;
 }

  /**    */
  private String state;
 public String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(String val ) {
   state = val;
 }

/**********************************************************
 * URI for the channel or bridge being recorded
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getTarget_uri(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration of talking, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTalking_duration(int val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration in seconds of the recording
 * 
 * @since ari_1_5_0
 *********************************************************/
 public int getDuration(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * URI for the channel or bridge being recorded
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTarget_uri(String val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration in seconds of the recording
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDuration(int val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration of silence, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public int getSilence_duration(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration of talking, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public int getTalking_duration(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Duration of silence, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setSilence_duration(int val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

}

