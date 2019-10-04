package ch.loway.oss.ari4java.generated.ari_1_6_0.models;

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
 * Dialplan location (context/extension/priority)
 * 
 * Defined in file: channels.json
 * Generated by: Model
 *********************************************************/

public class DialplanCEP_impl_ari_1_6_0 implements DialplanCEP, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Context in the dialplan  */
  private String context;
 public String getContext() {
   return context;
 }

 @JsonDeserialize( as=String.class )
 public void setContext(String val ) {
   context = val;
 }

  /**  Extension in the dialplan  */
  private String exten;
 public String getExten() {
   return exten;
 }

 @JsonDeserialize( as=String.class )
 public void setExten(String val ) {
   exten = val;
 }

  /**  Priority in the dialplan  */
  private long priority;
 public long getPriority() {
   return priority;
 }

 @JsonDeserialize( as=long.class )
 public void setPriority(long val ) {
   priority = val;
 }

/**********************************************************
 * Parameter of current dialplan application
 * 
 * @since ari_4_0_2
 *********************************************************/
 public String getApp_data(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Name of current dialplan application
 * 
 * @since ari_4_0_2
 *********************************************************/
 public void setApp_name(String val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Name of current dialplan application
 * 
 * @since ari_4_0_2
 *********************************************************/
 public String getApp_name(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Parameter of current dialplan application
 * 
 * @since ari_4_0_2
 *********************************************************/
 public void setApp_data(String val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

}

