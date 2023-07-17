package ApacheCommons.codec.language;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2010-02-09 16:40:18 GMT
// -----( ON-HOST: MCUKDXP

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.apache.commons.codec.EncoderException;
// --- <<IS-END-IMPORTS>> ---

public final class soundex

{
	// ---( internal utility methods )---

	final static soundex _instance = new soundex();

	static soundex _newInstance() { return new soundex(); }

	static soundex _cast(Object o) { return (soundex)o; }

	// ---( server methods )---




	public static final void difference (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(difference)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
		pipelineCursor.destroy();
		
		org.apache.commons.codec.language.Soundex soundex = new org.apache.commons.codec.language.Soundex();
		int resultInt = -1;
		try {
			resultInt = soundex.difference(str1, str2);
		} catch (EncoderException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e);
		} 
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Integer.toString(resultInt) );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void encode (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(encode)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [o] field:0:required encodedString
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		pipelineCursor.destroy();
		
		org.apache.commons.codec.language.Soundex soundex = new org.apache.commons.codec.language.Soundex();
		
		String result = soundex.encode(str1);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "encodedString", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void encodeObject (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(encodeObject)>> ---
		// @sigtype java 3.5
		// [i] object:0:required Object
		// [o] object:0:required EncodedObject
		
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Object	inObject = IDataUtil.get( pipelineCursor, "Object" );
		pipelineCursor.destroy();
		
		Object encodedObject = null;
		org.apache.commons.codec.language.Soundex soundex = new org.apache.commons.codec.language.Soundex();
		int resultInt = -1;
		try {
			encodedObject = soundex.encode(inObject);
		} catch (EncoderException e) {
			// TODO Auto-generated catch block
			throw new ServiceException(e);
		} 
		// pipeline
		
		pipelineCursor = pipeline.getCursor();
		
		IDataUtil.put( pipelineCursor, "EncodedObject", encodedObject );
		pipelineCursor.destroy();		
			
		// --- <<IS-END>> ---

                
	}



	public static final void soundex (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(soundex)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		pipelineCursor.destroy();
		
		org.apache.commons.codec.language.Soundex soundex = new org.apache.commons.codec.language.Soundex();
		String result = soundex.soundex(str1);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

