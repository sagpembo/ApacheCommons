package ApacheCommons.codec.language;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.apache.commons.codec.EncoderException;
// --- <<IS-END-IMPORTS>> ---

public final class doubleMetaphone

{
	// ---( internal utility methods )---

	final static doubleMetaphone _instance = new doubleMetaphone();

	static doubleMetaphone _newInstance() { return new doubleMetaphone(); }

	static doubleMetaphone _cast(Object o) { return (doubleMetaphone)o; }

	// ---( server methods )---




	public static final void doubleMetaphone (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(doubleMetaphone)>> ---
		// @sigtype java 3.5
		// [i] field:0:required value
		// [i] field:0:optional alternate
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	value = IDataUtil.getString( pipelineCursor, "value" );
		String	alternate = IDataUtil.getString( pipelineCursor, "alternate" );
		pipelineCursor.destroy();
		
		boolean alt = false;
		if(alternate!=null && alternate.equalsIgnoreCase("true"))
		{
			alt = true;
		}
		
		org.apache.commons.codec.language.DoubleMetaphone dmp = new org.apache.commons.codec.language.DoubleMetaphone();
		
		String result = dmp.doubleMetaphone(value, alt);
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
			
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
		
		org.apache.commons.codec.language.DoubleMetaphone dmp = new org.apache.commons.codec.language.DoubleMetaphone();
		
		String result = dmp.encode(str1);
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
		org.apache.commons.codec.language.DoubleMetaphone dmp = new org.apache.commons.codec.language.DoubleMetaphone();
		try {
			encodedObject = dmp.encode(inObject);
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



	public static final void isDoubleMetaphoneEqual (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isDoubleMetaphoneEqual)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [i] field:0:optional alternate
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
			String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
			String	alternate = IDataUtil.getString( pipelineCursor, "alternate" );
		pipelineCursor.destroy();
		
		boolean alt = false;
		if(alternate!=null && alternate.equalsIgnoreCase("true"))
		{
			alt = true;
		}
		org.apache.commons.codec.language.DoubleMetaphone dmp = new org.apache.commons.codec.language.DoubleMetaphone();
		boolean result = dmp.isDoubleMetaphoneEqual(str1, str2,alt);
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", Boolean.toString(result));
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}
}

