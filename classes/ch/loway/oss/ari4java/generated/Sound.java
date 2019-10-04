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


public interface Sound {

// List<FormatLangPair> getFormats
/**********************************************************
 * The formats and languages in which this sound is available.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public List<FormatLangPair> getFormats();



// String getText
/**********************************************************
 * Text description of the sound, usually the words spoken.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getText();



// void setFormats List<FormatLangPair>
/**********************************************************
 * The formats and languages in which this sound is available.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setFormats(List<FormatLangPair> val );



// void setId String
/**********************************************************
 * Sound's identifier.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setId(String val );



// String getId
/**********************************************************
 * Sound's identifier.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getId();



// void setText String
/**********************************************************
 * Text description of the sound, usually the words spoken.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setText(String val );


}
;
