package ApacheCommons.lang;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class StringEscapeUtils

{
	// ---( internal utility methods )---

	final static StringEscapeUtils _instance = new StringEscapeUtils();

	static StringEscapeUtils _newInstance() { return new StringEscapeUtils(); }

	static StringEscapeUtils _cast(Object o) { return (StringEscapeUtils)o; }

	// ---( server methods )---




	public static final void escapeHtml (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(escapeHtml)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringEscapeUtils.escapeHtml(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void escapeJava (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(escapeJava)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringEscapeUtils.escapeJava(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void escapeJavaScript (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(escapeJavaScript)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void escapeSql (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(escapeSql)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringEscapeUtils.escapeSql(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void escapeXml (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(escapeXml)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringEscapeUtils.escapeXml(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result);
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void escapeXmlIData (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(escapeXmlIData)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] record:0:required document
		// [o] record:0:required document
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		// document
		IData	document = IDataUtil.getIData( pipelineCursor, "document" );
		if ( document == null)
		{
			throw new ServiceException("Input document is null");
		}
		
		
		
		walkIData(document,ESCAPE);
		
		
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "document", document );
		pipelineCursor.destroy();
		
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void unescapeHtml (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unescapeHtml)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringEscapeUtils.unescapeHtml(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void unescapeJava (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unescapeJava)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringEscapeUtils.unescapeJava(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void unescapeJavaScript (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unescapeJavaScript)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void unescapeXml (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unescapeXml)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringEscapeUtils.unescapeXml(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void unescapeXmlIData (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(unescapeXmlIData)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] record:0:required document
		// [o] record:0:required document
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		// document
		IData	document = IDataUtil.getIData( pipelineCursor, "document" );
		if ( document == null)
		{
			throw new ServiceException("Input document is null");
		}
		
		
		
		walkIData(document,UNESCAPE);
		
		
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "document", document );
		pipelineCursor.destroy();
		
		
			
		// --- <<IS-END>> ---

                
	}

	// --- <<IS-START-SHARED>> ---
	public static final int ESCAPE = 0;
	public static final int UNESCAPE = 1;
	
	public static final void walkIData(com.wm.data.IData document, int direction)
	{
		//Walk the idata document structure
		IDataCursor docCursor = document.getCursor();
		docCursor.first();
		
		String key;
		String value;
		Class type;
		
		do
		{
			value = null;
			key = docCursor.getKey();
			type = docCursor.getValue().getClass();
			
			
			if(type.equals(java.lang.String.class))
			{
				value = (String)docCursor.getValue();
				if(direction==ESCAPE)
					value = org.apache.commons.lang.StringEscapeUtils.escapeXml(value);
				else
					value = org.apache.commons.lang.StringEscapeUtils.unescapeXml(value);
				
				docCursor.setValue(value);
								
			}
			
			if(type.equals(com.wm.data.ISMemDataImpl.class) || type.equals(com.wm.data.IData.class))
			{
				walkIData((com.wm.data.IData)docCursor.getValue(),direction);
			}
			
			if(type.equals(String[].class))
			{
				String[] list = (String[])docCursor.getValue();
				for(int i=0;i<list.length;i++)
				{
					if(direction==ESCAPE)
						list[i] = org.apache.commons.lang.StringEscapeUtils.escapeXml(list[i]);
					else
						list[i] = org.apache.commons.lang.StringEscapeUtils.unescapeXml(list[i]);
				}
				
				docCursor.setValue(list);
			}
			
			if(type.equals(com.wm.util.Values[].class) || type.equals(IData[].class))
			{
				
				IData[] objs = (IData[])docCursor.getValue();
				for(int i=0;i<objs.length;i++)
				{
					walkIData(objs[i],direction);
				}
			}			
			
	
		
	
		}
		while(docCursor.next()==true);
	}
		
	// --- <<IS-END-SHARED>> ---
}

