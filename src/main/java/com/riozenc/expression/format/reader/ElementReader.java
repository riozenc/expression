/**
 * 
 */
package com.riozenc.expression.format.reader;

import java.io.IOException;

import com.riozenc.expression.format.Element;
import com.riozenc.expression.format.ExpressionReader;
import com.riozenc.expression.format.FormatException;

/**
 * @author 林良益，卓诗垚
 * @version 2.0 
 * Oct 9, 2008
 */
public interface ElementReader {
	Element read(ExpressionReader sr) throws FormatException, IOException;
}
