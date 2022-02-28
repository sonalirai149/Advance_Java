package com.org1;
import java.io.IOException;
import javax.servlet.jsp.*;
import org.apache.commons.lang.StringUtils;

import jakarta.servlet.jsp.JspWriter;

public class CountMatches extends TagSupport {
  private String inputstring;
  private String lookupstring;
	     
  public String getInputstring() {
    return inputstring;
  }

  public void setInputstring(String inputstring) {
    this.inputstring = inputstring;
  }

  public String getLookupstring() {
    return lookupstring;
  }

  public void setLookupstring(String lookupstring) {
    this.lookupstring = lookupstring;
  }

  public int doStartTag() throws JspException {
    try {
      Object pageContext;
	JspWriter out = ((Object) pageContext).getOut();
      out.println(StringUtils.countMatches(inputstring, lookupstring));
    } 
    catch (IOException e) {
      e.printStackTrace();
    }
    return SKIP_BODY;
  }
}

