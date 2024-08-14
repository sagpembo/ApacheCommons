package ApacheCommons.lang;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import org.apache.commons.lang.RandomStringUtils;
// --- <<IS-END-IMPORTS>> ---

public final class RandomStringUtil

{
	// ---( internal utility methods )---

	final static RandomStringUtil _instance = new RandomStringUtil();

	static RandomStringUtil _newInstance() { return new RandomStringUtil(); }

	static RandomStringUtil _cast(Object o) { return (RandomStringUtil)o; }

	// ---( server methods )---




	public static final void randomAlphaNumeric (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(randomAlphaNumeric)>> ---
		// @sigtype java 3.5
		// [i] field:0:required count
		// [o] field:0:required string
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	count = IDataUtil.getString( pipelineCursor, "count" );
		pipelineCursor.destroy();
		
		String result = RandomStringUtils.randomAlphanumeric(Integer.parseInt(count));
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "string", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

