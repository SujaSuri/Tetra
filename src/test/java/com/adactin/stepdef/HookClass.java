package com.adactin.stepdef;

import com.adactin.utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass {

    @Before
    public void beforeExecution()
    {
        launchBrowser(readProperties("Browser"));
        iwait(Integer.parseInt(readProperties("implicitywait")));
        maxi();
    }


    @After
    public void afterExecution()
    {
        driver.manage().deleteAllCookies();
        closeBrowser();
    }
}
