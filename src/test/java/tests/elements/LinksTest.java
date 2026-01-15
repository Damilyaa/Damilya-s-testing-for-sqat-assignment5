package tests.elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {

    @Test
    public void testLink() {
        var links = homePage.goToElements().clickLinks();
        links.clickNotFoundLink();
        String actualResponse = links.getResponse();
        String expectedResponse = "Link has responded with staus 404 and status text Not Found";

        Assert.assertEquals(actualResponse, expectedResponse, "actual response and expected response do not match");
    }
}
