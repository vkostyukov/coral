/* 
 * Copyright 2012, Coral Project 
 * 
 * Author: Vladimir Kostyukov <vladimir.kostukov@gmail.com>
 * License: http://www.apache.org/licenses/LICENSE-2.0.html
 * 
 */

package coral.vm;

import coral.bytecode.Bytecode;
import coral.vm.err.RuntimeError;

public class StackVirtualMachine implements VirtualMachine {

	@Override
	public int execute(Bytecode[] code) throws RuntimeError {
		return 0;
	}
}
