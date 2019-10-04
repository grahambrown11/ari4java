package ch.loway.oss.ari4java.generated.ari_4_0_2.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Oct 02 15:49:50 SAST 2019
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Notification that the source of video in a bridge has changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeVideoSourceChanged_impl_ari_4_0_2 extends Event_impl_ari_4_0_2 implements BridgeVideoSourceChanged, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Bridge bridge;
 public Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_4_0_2.class )
 public void setBridge(Bridge val ) {
   bridge = val;
 }

  /**    */
  private String old_video_source_id;
 public String getOld_video_source_id() {
   return old_video_source_id;
 }

 @JsonDeserialize( as=String.class )
 public void setOld_video_source_id(String val ) {
   old_video_source_id = val;
 }

/** No missing signatures from interface */
}

