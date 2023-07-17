package ApacheCommons.codec.language;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.apache.commons.codec.EncoderException;
// --- <<IS-END-IMPORTS>> ---

public final class metaphone

{
	// ---( internal utility methods )---

	final static metaphone _instance = new metaphone();

	static metaphone _newInstance() { return new metaphone(); }

	static metaphone _cast(Object o) { return (metaphone)o; }

	// ---( server methods )---




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
		
		org.apache.commons.codec.language.Metaphone mp = new org.apache.commons.codec.language.Metaphone();
		
		String result = mp.encode(str1);
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
		org.apache.commons.codec.language.Metaphone mp = new org.apache.commons.codec.language.Metaphone();
		try {
			encodedObject = mp.encode(inObject);
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



	public static final void isMetaphoneEqual (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isMetaphoneEqual)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
		pipelineCursor.destroy();
		
		org.apache.commons.codec.language.Metaphone mp= new org.apache.commons.codec.language.Metaphone();
		
		boolean result = mp.isMetaphoneEqual(str1, str2);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result) );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void metaphone (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(metaphone)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [o] field:0:required encodedString
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		pipelineCursor.destroy();
		
		org.apache.commons.codec.language.Metaphone mp = new org.apache.commons.codec.language.Metaphone();
		
		String result = mp.metaphone(str1);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "encodedString", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}
}

