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
 * Info about Asterisk
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class SystemInfo_impl_ari_1_0_0 implements SystemInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private String entity_id;
 public String getEntity_id() {
   return entity_id;
 }

 @JsonDeserialize( as=String.class )
 public void setEntity_id(String val ) {
   entity_id = val;
 }

  /**  Asterisk version.  */
  private String version;
 public String getVersion() {
   return version;
 }

 @JsonDeserialize( as=String.class )
 public void setVersion(String val ) {
   version = val;
 }

/** No missing signatures from interface */
}

