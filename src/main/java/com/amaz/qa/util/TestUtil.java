package com.amaz.qa.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.amaz.qa.base.TestBase;

public class TestUtil extends TestBase {
	public  int PAGELOAD_TIMEOUT=30;
	public  int IMPLICTILY_WAIT=30;

	public void SwitchingWindow() {
		Set<String> handles = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
	    li.addAll(handles);
		String win = li.get(1);
		driver.switchTo().window(win);
	    }
}
