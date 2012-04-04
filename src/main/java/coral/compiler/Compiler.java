/* 
 * Copyright 2012, Coral Project 
 * 
 * Author: Vladimir Kostyukov <vladimir.kostukov@gmail.com>
 * License: http://www.apache.org/licenses/LICENSE-2.0.html
 * 
 */

package coral.compiler;

import coral.bytecode.Bytecode;
import coral.compiler.err.CompileError;

public interface Compiler {
	
	public Bytecode[] compile() throws CompileError;
	
}
