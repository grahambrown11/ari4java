package ch.loway.oss.ari4java.generated.ari_1_10_0.models;

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
 * Event showing the continuation of a media playback operation from one media URI to the next in the list.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class PlaybackContinuing_impl_ari_1_10_0 extends Event_impl_ari_1_10_0 implements PlaybackContinuing, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Playback control object  */
  private Playback playback;
 public Playback getPlayback() {
   return playback;
 }

 @JsonDeserialize( as=Playback_impl_ari_1_10_0.class )
 public void setPlayback(Playback val ) {
   playback = val;
 }

/** No missing signatures from interface */
}

