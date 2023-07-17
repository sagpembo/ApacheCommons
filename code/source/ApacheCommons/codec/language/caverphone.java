package ApacheCommons.codec.language;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2010-02-09 17:00:47 GMT
// -----( ON-HOST: MCUKDXP

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.apache.commons.codec.EncoderException;
// --- <<IS-END-IMPORTS>> ---

public final class caverphone

{
	// ---( internal utility methods )---

	final static caverphone _instance = new caverphone();

	static caverphone _newInstance() { return new caverphone(); }

	static caverphone _cast(Object o) { return (caverphone)o; }

	// ---( server methods )---




	public static final void caverphone (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(caverphone)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		pipelineCursor.destroy();
		
		org.apache.commons.codec.language.Caverphone caverphone = new org.apache.commons.codec.language.Caverphone();
		String result = caverphone.caverphone(str1);
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
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
		
		org.apache.commons.codec.language.Caverphone caverphone = new org.apache.commons.codec.language.Caverphone();
		
		String result = caverphone.encode(str1);
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
		org.apache.commons.codec.language.Caverphone caverphone = new org.apache.commons.codec.language.Caverphone();
		int resultInt = -1;
		try {
			encodedObject = caverphone.encode(inObject);
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



	public static final void isCaverphoneEqual (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isCaverphoneEqual)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
		pipelineCursor.destroy();
		
		org.apache.commons.codec.language.Caverphone caverphone = new org.apache.commons.codec.language.Caverphone();
		
		boolean result = caverphone.isCaverphoneEqual(str1, str2);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result) );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

