/* 
 * Copyright 2012, Coral Project 
 * 
 * Author: Vladimir Kostyukov <vladimir.kostukov@gmail.com>
 * License: http://www.apache.org/licenses/LICENSE-2.0.html
 * 
 */

package coral.compiler.lexer;

import coral.compiler.code.Token;

public interface Lexer {
	
	Token next();
	Token next(int skip);
	
}
