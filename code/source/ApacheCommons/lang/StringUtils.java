package ApacheCommons.lang;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2010-02-08 13:06:43 GMT
// -----( ON-HOST: mcukdxp.eur.ad.sag

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class StringUtils

{
	// ---( internal utility methods )---

	final static StringUtils _instance = new StringUtils();

	static StringUtils _newInstance() { return new StringUtils(); }

	static StringUtils _cast(Object o) { return (StringUtils)o; }

	// ---( server methods )---




	public static final void abbreviate (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(abbreviate)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required maxWidth
		// [i] field:0:optional offset
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	maxWidth = IDataUtil.getString( pipelineCursor, "maxWidth" );
		String	offset = IDataUtil.getString( pipelineCursor, "offset" );
		pipelineCursor.destroy();
		
		String result;
		if(offset==null||offset.length()<=0)
		{
			result = org.apache.commons.lang.StringUtils.abbreviate(str, Integer.parseInt(maxWidth));
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.abbreviate(str, Integer.parseInt(offset),Integer.parseInt(maxWidth));
		}
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void capitaliseAllWords (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(capitaliseAllWords)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.capitaliseAllWords(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void capitalize (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(capitalize)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.capitalize(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void center (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(center)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required size
		// [i] field:0:required padChar
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	size = IDataUtil.getString( pipelineCursor, "size" );
		String	padChar = IDataUtil.getString( pipelineCursor, "padChar" );
		pipelineCursor.destroy();
		
		String result;
		if(padChar==null||padChar.length()<=0)
		{
			result = org.apache.commons.lang.StringUtils.center(str, Integer.parseInt(size));
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.center(str, Integer.parseInt(size),padChar);
		}
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void chomp (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(chomp)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:optional separator
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	separator = IDataUtil.getString( pipelineCursor, "separator" );
		pipelineCursor.destroy();
		
		String result;
		if(separator!=null)
		{
			result = org.apache.commons.lang.StringUtils.chomp(str,separator);
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.chomp(str);
		}
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void chop (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(chop)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.chop(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void contains (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(contains)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.contains(str, searchStr);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result));
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void containsIgnoreCase (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(containsIgnoreCase)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.containsIgnoreCase(str, searchStr);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result));
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void containsNone (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(containsNone)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required invalidChars
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	invalidChars = IDataUtil.getString( pipelineCursor, "invalidChars" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.containsOnly(str, invalidChars);
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result) );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void containsOnly (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(containsOnly)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required validChars
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	validChars = IDataUtil.getString( pipelineCursor, "validChars" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.containsOnly(str, validChars);
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result) );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void countMatches (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(countMatches)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required sub
		// [o] field:0:required count
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	sub = IDataUtil.getString( pipelineCursor, "sub" );
		pipelineCursor.destroy();
		
		int countInt = org.apache.commons.lang.StringUtils.countMatches(str, sub);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "count", Integer.toString(countInt) );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void defaultIfEmpty (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(defaultIfEmpty)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required defaultStr
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	defaultStr = IDataUtil.getString( pipelineCursor, "defaultStr" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.defaultIfEmpty(str,defaultStr);
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void defaultString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(defaultString)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:optional defaultStr
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	defaultStr = IDataUtil.getString( pipelineCursor, "defaultStr" );
		pipelineCursor.destroy();
		
		String result = null;
		if(defaultStr==null)
		{
			result = org.apache.commons.lang.StringUtils.defaultString(str);
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.defaultString(str,defaultStr);
		}
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void deleteWhitespace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(deleteWhitespace)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.deleteWhitespace(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void difference (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(difference)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] field:0:required difference
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
		pipelineCursor.destroy();
		
		String difference = org.apache.commons.lang.StringUtils.difference(str1, str2);
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "difference", difference);
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void getLevenshteinDistance (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getLevenshteinDistance)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] field:0:required distance
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
		pipelineCursor.destroy();
		
		int dist = org.apache.commons.lang.StringUtils.getLevenshteinDistance(str1,str2);
		
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "distance", Integer.toString(dist) );
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void indexOf (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(indexOf)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required search
		// [i] field:0:optional startPos
		// [o] field:0:required index
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	searchChar = IDataUtil.getString( pipelineCursor, "search" );
		String	startPos = IDataUtil.getString( pipelineCursor, "startPos" );
		
		pipelineCursor.destroy();
		
		
		
		int index = -1;
		if(startPos==null)
		{
			index = org.apache.commons.lang.StringUtils.indexOf(str, searchChar);
		}
		else
		{
			index = org.apache.commons.lang.StringUtils.indexOf(str, searchChar, Integer.parseInt(startPos));
		}
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "index", Integer.toString(index) );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void indexOfAny (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(indexOfAny)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchChars
		// [o] field:0:required index
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String searchChars = IDataUtil.getString( pipelineCursor, "searchChars" );
		pipelineCursor.destroy();
		
		int result = org.apache.commons.lang.StringUtils.indexOfAny(str, searchChars);
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "index", Integer.toString(result) );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void indexOfAnyBut (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(indexOfAnyBut)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchChars
		// [o] field:0:required index
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String searchChars = IDataUtil.getString( pipelineCursor, "searchChars" );
		pipelineCursor.destroy();
		
		int result = org.apache.commons.lang.StringUtils.indexOfAnyBut(str, searchChars);
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "index", Integer.toString(result) );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void indexOfDifference (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(indexOfDifference)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] field:0:required index
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
		pipelineCursor.destroy();
		
		int indexInt = org.apache.commons.lang.StringUtils.indexOfDifference(str1, str2);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "index", Integer.toString(indexInt));
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isAlpha (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isAlpha)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isAlpha(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result));
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isAlphaSpace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isAlphaSpace)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isAlphaSpace(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result));
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isAlphanumeric (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isAlphanumeric)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isAlphanumeric(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result));
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isAlphanumericSpace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isAlphanumericSpace)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isAlphanumericSpace(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result));
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isAsciiPrintable (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isAsciiPrintable)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isAsciiPrintable(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result));
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isBlank (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isBlank)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isBlank(str);
		String resultStr = Boolean.toString(result); 
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result",resultStr );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isEmpty (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isEmpty)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isEmpty(str);
		String resultStr = Boolean.toString(result); 
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result",resultStr );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isNotBlank (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isNotBlank)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isNotBlank(str);
		String resultStr = Boolean.toString(result); 
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result",resultStr );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isNotEmpty (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isNotEmpty)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isNotEmpty(str);
		String resultStr = Boolean.toString(result);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result",resultStr );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isNumeric (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isNumeric)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isNumeric(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result));
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isNumericSpace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isNumericSpace)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isNumericSpace(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result));
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void isWhitespace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(isWhitespace)>> ---
		// @subtype unknown
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		boolean result = org.apache.commons.lang.StringUtils.isWhitespace(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(result));
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void join (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(join)>> ---
		// @sigtype java 3.5
		// [i] object:1:required array
		// [i] field:0:optional separator
		// [i] field:0:optional startIndex
		// [i] field:0:optional endIndex
		// [o] field:0:required result
		
		// pipeline
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		Object[]	array = IDataUtil.getObjectArray( pipelineCursor, "array" );
		String	separator = IDataUtil.getString( pipelineCursor, "separator" );
		String	startIndex = IDataUtil.getString( pipelineCursor, "startIndex" );
		String	endIndex = IDataUtil.getString( pipelineCursor, "endIndex" );
		pipelineCursor.destroy();
		
		String result = null;
		if(separator==null)
		{
			result = org.apache.commons.lang.StringUtils.join(array);
		}
		else if(startIndex==null||startIndex.length()<=0)
		{
			result = org.apache.commons.lang.StringUtils.join(array,separator);	
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.join(array,separator,Integer.parseInt(startIndex),Integer.parseInt(endIndex));
		}
		
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void lastIndexOf (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(lastIndexOf)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchStr
		// [i] field:0:optional startPos
		// [o] field:0:required index
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	searchStr = IDataUtil.getString( pipelineCursor, "searchStr" );
		String	startPos = IDataUtil.getString( pipelineCursor, "startPos" );
		pipelineCursor.destroy();
		
		int startPosInt = 0;
		int index = -1;
		if(startPos!=null && startPos.length()>0)
		{
			index = org.apache.commons.lang.StringUtils.lastIndexOf(str, searchStr,startPosInt);	
		}
		else
		{
			index = org.apache.commons.lang.StringUtils.lastIndexOf(str, searchStr);
		}
		
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "index", Integer.toString(index) );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void lastIndexOfAny (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(lastIndexOfAny)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:1:required searchStrs
		// [o] field:0:required index
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String[]	searchStrs = IDataUtil.getStringArray( pipelineCursor, "searchStrs" );
		pipelineCursor.destroy();
		
		int index = org.apache.commons.lang.StringUtils.lastIndexOfAny(str, searchStrs);
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "index", Integer.toString(index) );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void left (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(left)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required len
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	len = IDataUtil.getString( pipelineCursor, "len" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.left(str, Integer.parseInt(len));
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void leftPad (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(leftPad)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required size
		// [i] field:0:optional padStr
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	size = IDataUtil.getString( pipelineCursor, "size" );
		String	padStr = IDataUtil.getString( pipelineCursor, "padStr" );
		pipelineCursor.destroy();
		
		String result;
		if(padStr==null||padStr.length()<=0)
		{
			result = org.apache.commons.lang.StringUtils.leftPad(str, Integer.parseInt(size));
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.leftPad(str, Integer.parseInt(size),padStr);
		}
			
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void lowerCase (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(lowerCase)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.lowerCase(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void mid (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(mid)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required pos
		// [i] field:0:required len
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	pos = IDataUtil.getString( pipelineCursor, "pos" );
		String	len = IDataUtil.getString( pipelineCursor, "len" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.mid(str, Integer.parseInt(pos), Integer.parseInt(len));
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void ordinalIndexOf (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(ordinalIndexOf)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required search
		// [i] field:0:required ordinal
		// [o] field:0:required index
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	searchChar = IDataUtil.getString( pipelineCursor, "search" );
		String	ordinal = IDataUtil.getString( pipelineCursor, "ordinal" );
		
		pipelineCursor.destroy();
		
		 int index = org.apache.commons.lang.StringUtils.ordinalIndexOf(str, searchChar,Integer.parseInt(ordinal));
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "index", Integer.toString(index) );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void overlay (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(overlay)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required overlay
		// [i] field:0:required start
		// [i] field:0:required end
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	overlay = IDataUtil.getString( pipelineCursor, "overlay" );
		String	start = IDataUtil.getString( pipelineCursor, "start" );
		String	end = IDataUtil.getString( pipelineCursor, "end" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.overlay(str,overlay,Integer.parseInt(start),Integer.parseInt(end));
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void overlayString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(overlayString)>> ---
		// @sigtype java 3.5
		// [i] field:0:required text
		// [i] field:0:required overlay
		// [i] field:0:required start
		// [i] field:0:required end
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	text = IDataUtil.getString( pipelineCursor, "text" );
		String	overlay = IDataUtil.getString( pipelineCursor, "overlay" );
		String	start = IDataUtil.getString( pipelineCursor, "start" );
		String	end = IDataUtil.getString( pipelineCursor, "end" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.overlayString(text, overlay, Integer.parseInt(start), Integer.parseInt(end));
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void remove (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(remove)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required remove
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	remove = IDataUtil.getString( pipelineCursor, "remove" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.remove(str, remove);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void removeEnd (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(removeEnd)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required remove
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	remove = IDataUtil.getString( pipelineCursor, "remove" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.removeEnd(str, remove);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void removeStart (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(removeStart)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required remove
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	remove = IDataUtil.getString( pipelineCursor, "remove" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.removeStart(str, remove);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void repeat (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(repeat)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required repeat
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	repeat = IDataUtil.getString( pipelineCursor, "repeat" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.repeat(str, Integer.parseInt(repeat));
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void replace (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(replace)>> ---
		// @sigtype java 3.5
		// [i] field:0:required text
		// [i] field:0:required searchString
		// [i] field:0:required replacement
		// [i] field:0:required max
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	text = IDataUtil.getString( pipelineCursor, "text" );
		String	searchString = IDataUtil.getString( pipelineCursor, "searchString" );
		String	replacement = IDataUtil.getString( pipelineCursor, "replacement" );
		String	max = IDataUtil.getString( pipelineCursor, "max" );
		pipelineCursor.destroy();
		
		String result = null;
		if(max==null||max.length()<=0)
		{
			result = org.apache.commons.lang.StringUtils.replace(text, searchString, replacement);
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.replace(text, searchString, replacement,Integer.parseInt(max));
		}
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void replaceChars (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(replaceChars)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required searchChars
		// [i] field:0:required replaceChars
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	searchChars = IDataUtil.getString( pipelineCursor, "searchChars" );
		String	replaceChars = IDataUtil.getString( pipelineCursor, "replaceChars" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.replaceChars(str, searchChars, replaceChars);
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void replaceOnce (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(replaceOnce)>> ---
		// @sigtype java 3.5
		// [i] field:0:required text
		// [i] field:0:required searchString
		// [i] field:0:required replacement
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	text = IDataUtil.getString( pipelineCursor, "text" );
		String	searchString = IDataUtil.getString( pipelineCursor, "searchString" );
		String	replacement = IDataUtil.getString( pipelineCursor, "replacement" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.replaceOnce(text, searchString, replacement);
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void reverse (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(reverse)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.reverse(str);
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void reverseDelimited (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(reverseDelimited)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separatorChar
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	separatorChar = IDataUtil.getString( pipelineCursor, "separatorChar" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.reverseDelimited(str, separatorChar.charAt(0));
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void right (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(right)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required len
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	len = IDataUtil.getString( pipelineCursor, "len" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.right(str, Integer.parseInt(len));
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void rightPad (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(rightPad)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required size
		// [i] field:0:optional padStr
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	size = IDataUtil.getString( pipelineCursor, "size" );
		String	padStr = IDataUtil.getString( pipelineCursor, "padStr" );
		pipelineCursor.destroy();
		
		String result;
		if(padStr==null||padStr.length()<=0)
		{
			result = org.apache.commons.lang.StringUtils.rightPad(str, Integer.parseInt(size));
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.rightPad(str, Integer.parseInt(size),padStr);
		}
			
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void split (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(split)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:optional separatorChars
		// [i] field:0:optional max
		// [o] field:1:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	separatorChars = IDataUtil.getString( pipelineCursor, "separatorChars" );
		String	max = IDataUtil.getString( pipelineCursor, "max" );
		pipelineCursor.destroy();
		
		String[] result = null;
		
		if(separatorChars==null)
		{
			result = org.apache.commons.lang.StringUtils.split(str);
		}
		else if(separatorChars!=null && (max==null||max.length()<=0))
		{
			result = org.apache.commons.lang.StringUtils.split(str,separatorChars);
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.split(str,separatorChars,Integer.parseInt(max));
		}
		
		
		// pipeline
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void splitByWholeSeparator (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(splitByWholeSeparator)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		// [i] field:0:optional max
		// [o] field:1:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	separator = IDataUtil.getString( pipelineCursor, "separator" );
		String	max = IDataUtil.getString( pipelineCursor, "max" );
		pipelineCursor.destroy();
		
		String[] result = null;
		
		if(max!=null && max.length()>0)
		{
			result = org.apache.commons.lang.StringUtils.splitByWholeSeparator(str,separator,Integer.parseInt(max));
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.splitByWholeSeparator(str,separator);
		}
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void splitPreserveAllTokens (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(splitPreserveAllTokens)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:optional separatorChars
		// [i] field:0:optional max
		// [o] field:1:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	separatorChars = IDataUtil.getString( pipelineCursor, "separatorChars" );
		String	max = IDataUtil.getString( pipelineCursor, "max" );
		pipelineCursor.destroy();
		
		String[] result = null;
		
		if(separatorChars==null)
		{
			result = org.apache.commons.lang.StringUtils.splitPreserveAllTokens(str);
		}
		else if(separatorChars!=null && (max==null||max.length()<=0))
		{
			result = org.apache.commons.lang.StringUtils.splitPreserveAllTokens(str,separatorChars);
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.splitPreserveAllTokens(str,separatorChars,Integer.parseInt(max));
		}
		
		
		// pipeline
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void stringEquals (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stringEquals)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
		pipelineCursor.destroy();
		
		boolean resultBool;
		resultBool = org.apache.commons.lang.StringUtils.equals(str1, str2);
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(resultBool) );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void stringEqualsIgnoreCase (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stringEqualsIgnoreCase)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str1
		// [i] field:0:required str2
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str1 = IDataUtil.getString( pipelineCursor, "str1" );
		String	str2 = IDataUtil.getString( pipelineCursor, "str2" );
		pipelineCursor.destroy();
		
		boolean resultBool;
		resultBool = org.apache.commons.lang.StringUtils.equalsIgnoreCase(str1, str2);
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", Boolean.toString(resultBool) );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void strip (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(strip)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required stripChars
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	stripChars = IDataUtil.getString( pipelineCursor, "stripChars" );
		pipelineCursor.destroy();
		
		String resultStr = "";
		if(stripChars==null || stripChars.length()<=0)
		{
			resultStr = org.apache.commons.lang.StringUtils.strip(str);	
		}
		else
		{
			resultStr = org.apache.commons.lang.StringUtils.strip(str,stripChars);	
		}
		
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		
		IDataUtil.put( pipelineCursor, "result",resultStr );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void stripAll (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stripAll)>> ---
		// @sigtype java 3.5
		// [i] field:1:required str
		// [i] field:0:required stripChars
		// [o] field:1:required result
		
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String[]	str = IDataUtil.getStringArray( pipelineCursor, "str" );
		String	stripChars = IDataUtil.getString( pipelineCursor, "stripChars" );
		pipelineCursor.destroy();
		
		
		String[] resultStr;
		if(stripChars==null || stripChars.length()<=0)
		{
			resultStr = org.apache.commons.lang.StringUtils.stripAll(str);	
		}
		else
		{
			resultStr = org.apache.commons.lang.StringUtils.stripAll(str,stripChars);	
		}
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", resultStr );
		pipelineCursor.destroy();		
			
		// --- <<IS-END>> ---

                
	}



	public static final void stripEnd (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stripEnd)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required stripChars
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	stripChars = IDataUtil.getString( pipelineCursor, "stripChars" );
		pipelineCursor.destroy();
		
		String resultStr = "";
		resultStr = org.apache.commons.lang.StringUtils.stripEnd(str,stripChars);	
		
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		
		IDataUtil.put( pipelineCursor, "result",resultStr );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void stripStart (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stripStart)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required stripChars
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	stripChars = IDataUtil.getString( pipelineCursor, "stripChars" );
		pipelineCursor.destroy();
		
		String resultStr = "";
		resultStr = org.apache.commons.lang.StringUtils.stripStart(str,stripChars);	
		
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		
		IDataUtil.put( pipelineCursor, "result",resultStr );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void stripToEmpty (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stripToEmpty)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String resultStr  = org.apache.commons.lang.StringUtils.stripToEmpty(str);
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result",resultStr );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void substring (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substring)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required start
		// [i] field:0:optional end
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	start = IDataUtil.getString( pipelineCursor, "start" );
		String	end = IDataUtil.getString( pipelineCursor, "end" );
		pipelineCursor.destroy();
		
		String result = null;
		if(end==null||end.length()<=0)
		{
			result = org.apache.commons.lang.StringUtils.substring(str, Integer.parseInt(start));
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.substring(str, Integer.parseInt(start),Integer.parseInt(end));
			
		}
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "result", result );
		pipelineCursor_1.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void substringAfter (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringAfter)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	separator = IDataUtil.getString( pipelineCursor, "separator" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.substringAfter(str, separator);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void substringAfterLast (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringAfterLast)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	separator = IDataUtil.getString( pipelineCursor, "separator" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.substringAfterLast(str, separator);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void substringBefore (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringBefore)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	separator = IDataUtil.getString( pipelineCursor, "separator" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.substringBefore(str, separator);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void substringBeforeLast (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringBeforeLast)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required separator
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	separator = IDataUtil.getString( pipelineCursor, "separator" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.substringBeforeLast(str, separator);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void substringBetween (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringBetween)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required open
		// [i] field:0:optional close
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	open = IDataUtil.getString( pipelineCursor, "open" );
		String	close = IDataUtil.getString( pipelineCursor, "close" );
		pipelineCursor.destroy();
		
		String result;
		if(close==null||close.length()<=0)
		{
			result = org.apache.commons.lang.StringUtils.substringBetween(str, open);
		}
		else
		{
			result = org.apache.commons.lang.StringUtils.substringBetween(str, open,close);
		}
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void substringsBetween (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(substringsBetween)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [i] field:0:required open
		// [i] field:0:required close
		// [o] field:1:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		String	open = IDataUtil.getString( pipelineCursor, "open" );
		String	close = IDataUtil.getString( pipelineCursor, "close" );
		pipelineCursor.destroy();
		
		String[] result = org.apache.commons.lang.StringUtils.substringsBetween(str, open, close);
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		//String[]	result = new String[1];
		//result[0] = "result";
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void swapCase (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(swapCase)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.swapCase(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void trim (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(trim)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String resultStr  = org.apache.commons.lang.StringUtils.trim(str);
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result",resultStr );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void trimToEmpty (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(trimToEmpty)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String resultStr  = org.apache.commons.lang.StringUtils.trimToEmpty(str);
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result",resultStr );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void trimToNull (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(trimToNull)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String resultStr  = org.apache.commons.lang.StringUtils.trimToNull(str);
		
		
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result",resultStr );
		pipelineCursor.destroy();
			
		// --- <<IS-END>> ---

                
	}



	public static final void uncapitalize (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(uncapitalize)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.uncapitalize(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}



	public static final void upperCase (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(upperCase)>> ---
		// @sigtype java 3.5
		// [i] field:0:required str
		// [o] field:0:required result
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	str = IDataUtil.getString( pipelineCursor, "str" );
		pipelineCursor.destroy();
		
		String result = org.apache.commons.lang.StringUtils.upperCase(str);
		// pipeline
		pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "result", result );
		pipelineCursor.destroy();
		
			
		// --- <<IS-END>> ---

                
	}
}

