/* 
 * Copyright 2012, Coral Project 
 * 
 * Author: Vladimir Kostyukov <vladimir.kostukov@gmail.com>
 * License: http://www.apache.org/licenses/LICENSE-2.0.html
 * 
 */

package coral;

import coral.compiler.Compiler;
import coral.compiler.TinyCompiler;
import coral.compiler.err.CompileError;
import coral.vm.StackVirtualMachine;
import coral.vm.VirtualMachine;
import coral.vm.err.RuntimeError;

public class Launcher {
	
	public static void main(String[] args) throws CompileError, RuntimeError {
		
		Compiler compiler = new TinyCompiler();
		VirtualMachine vm = new StackVirtualMachine();
		
		System.exit(vm.execute(compiler.compile()));
	}
	
}
