package ch.loway.oss.ari4java.generated.ari_1_8_0.models;

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
 * Notification that a blind transfer has occurred.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeBlindTransfer_impl_ari_1_8_0 extends Event_impl_ari_1_8_0 implements BridgeBlindTransfer, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The bridge being transferred  */
  private Bridge bridge;
 public Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_8_0.class )
 public void setBridge(Bridge val ) {
   bridge = val;
 }

  /**  The channel performing the blind transfer  */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

  /**  The context transferred to  */
  private String context;
 public String getContext() {
   return context;
 }

 @JsonDeserialize( as=String.class )
 public void setContext(String val ) {
   context = val;
 }

  /**  The extension transferred to  */
  private String exten;
 public String getExten() {
   return exten;
 }

 @JsonDeserialize( as=String.class )
 public void setExten(String val ) {
   exten = val;
 }

  /**  Whether the transfer was externally initiated or not  */
  private boolean is_external;
 public boolean getIs_external() {
   return is_external;
 }

 @JsonDeserialize( as=boolean.class )
 public void setIs_external(boolean val ) {
   is_external = val;
 }

  /**  The channel that is replacing transferer when the transferee(s) can not be transferred directly  */
  private Channel replace_channel;
 public Channel getReplace_channel() {
   return replace_channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setReplace_channel(Channel val ) {
   replace_channel = val;
 }

  /**  The result of the transfer attempt  */
  private String result;
 public String getResult() {
   return result;
 }

 @JsonDeserialize( as=String.class )
 public void setResult(String val ) {
   result = val;
 }

  /**  The channel that is being transferred  */
  private Channel transferee;
 public Channel getTransferee() {
   return transferee;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setTransferee(Channel val ) {
   transferee = val;
 }

/** No missing signatures from interface */
}

