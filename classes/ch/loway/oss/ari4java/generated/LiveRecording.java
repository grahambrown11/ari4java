package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Oct 02 15:49:49 SAST 2019
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface LiveRecording {

// String getTarget_uri
/**********************************************************
 * URI for the channel or bridge being recorded
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getTarget_uri();



// void setTalking_duration int
/**********************************************************
 * Duration of talking, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTalking_duration(int val );



// String getName
/**********************************************************
 * Base name for the recording
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getName();



// int getDuration
/**********************************************************
 * Duration in seconds of the recording
 * 
 * @since ari_1_5_0
 *********************************************************/
 public int getDuration();



// String getFormat
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getFormat();



// void setFormat String
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setFormat(String val );



// String getState
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getState();



// void setState String
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setState(String val );



// void setTarget_uri String
/**********************************************************
 * URI for the channel or bridge being recorded
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTarget_uri(String val );



// String getCause
/**********************************************************
 * Cause for recording failure if failed
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getCause();



// void setDuration int
/**********************************************************
 * Duration in seconds of the recording
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDuration(int val );



// int getSilence_duration
/**********************************************************
 * Duration of silence, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public int getSilence_duration();



// int getTalking_duration
/**********************************************************
 * Duration of talking, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public int getTalking_duration();



// void setCause String
/**********************************************************
 * Cause for recording failure if failed
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setCause(String val );



// void setName String
/**********************************************************
 * Base name for the recording
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setName(String val );



// void setSilence_duration int
/**********************************************************
 * Duration of silence, in seconds, detected in the recording. This is only available if the recording was initiated with a non-zero maxSilenceSeconds.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setSilence_duration(int val );


}
;
