/*******************************************************************************
 *
 * Pentaho Data Profiling
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.profiling.api.doc.rest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bryan on 4/6/15.
 */
public class DocEntry {
  private String message;
  private String returnDescription;
  private List<DocParameter> parameters;

  public DocEntry() {
    this( null, null, new ArrayList<DocParameter>() );
  }

  public DocEntry( String message, String returnDescription, List<DocParameter> parameters ) {
    this.message = message;
    this.returnDescription = returnDescription;
    this.parameters = parameters;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage( String message ) {
    this.message = message;
  }

  public String getReturnDescription() {
    return returnDescription;
  }

  public void setReturnDescription( String returnDescription ) {
    this.returnDescription = returnDescription;
  }

  public List<DocParameter> getParameters() {
    return parameters;
  }

  public void setParameters( List<DocParameter> parameters ) {
    this.parameters = parameters;
  }

  //OperatorWrap isn't helpful for autogenerated methods
  //CHECKSTYLE:OperatorWrap:OFF
  @Override public boolean equals( Object o ) {
    if ( this == o ) {
      return true;
    }
    if ( o == null || getClass() != o.getClass() ) {
      return false;
    }

    DocEntry docEntry = (DocEntry) o;

    if ( message != null ? !message.equals( docEntry.message ) : docEntry.message != null ) {
      return false;
    }
    if ( returnDescription != null ? !returnDescription.equals( docEntry.returnDescription ) :
      docEntry.returnDescription != null ) {
      return false;
    }
    return !( parameters != null ? !parameters.equals( docEntry.parameters ) : docEntry.parameters != null );

  }

  @Override public int hashCode() {
    int result = message != null ? message.hashCode() : 0;
    result = 31 * result + ( returnDescription != null ? returnDescription.hashCode() : 0 );
    result = 31 * result + ( parameters != null ? parameters.hashCode() : 0 );
    return result;
  }

  @Override public String toString() {
    return "DocEntry{" +
      "message='" + message + '\'' +
      ", returnDescription='" + returnDescription + '\'' +
      ", parameters=" + parameters +
      '}';
  }
  //CHECKSTYLE:OperatorWrap:ON
}
