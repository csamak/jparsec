/*****************************************************************************
 * Copyright (C) jparsec.org                                                *
 * ------------------------------------------------------------------------- *
 * Licensed under the Apache License, Version 2.0 (the "License");           *
 * you may not use this file except in compliance with the License.          *
 * You may obtain a copy of the License at                                   *
 *                                                                           *
 * http://www.apache.org/licenses/LICENSE-2.0                                *
 *                                                                           *
 * Unless required by applicable law or agreed to in writing, software       *
 * distributed under the License is distributed on an "AS IS" BASIS,         *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
 * See the License for the specific language governing permissions and       *
 * limitations under the License.                                            *
 *****************************************************************************/
package org.codehaus.jparsec.examples.java.ast.declaration;

import java.util.Collections;
import java.util.List;

import org.codehaus.jparsec.examples.common.Strings;
import org.codehaus.jparsec.examples.common.ValueObject;

/**
 * Represents the body of interface, class, or annotation.
 * 
 * @author Ben Yu
 */
public final class DefBody extends ValueObject {
  public final List<Member> members;

  public DefBody(List<Member> members) {
    this.members = Collections.unmodifiableList(members);
  }
  
  @Override public String toString() {
    return "{" + Strings.join(" ", members) + "}";
  }
}
