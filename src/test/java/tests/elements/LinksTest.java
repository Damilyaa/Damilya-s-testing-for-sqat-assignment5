package tests.elements;

import base.BaseTest;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Listeners(TestListener.class)
public class LinksTest extends BaseTest {

    private static final Logger logger =
            LogManager.getLogger(LinksTest.class);

    @Test
    public void testLink() {
        logger.info("Test starting: testLink");
        var links = homePage.goToElements().clickLinks();
        logger.info("Navigating to Links page");
        links.clickNotFoundLink();
        logger.info("Triggering Not Found link");
        String actualResponse = links.getResponse();
        String expectedResponse = "Link has responded with staus 404 and status text Not Found"; //actually 'staus' -> 'status :) might be a fail'

        Assert.assertEquals(actualResponse, expectedResponse, "actual response and expected response do not match");
        logger.info("Assertion passed");
    }
}
