package mobile.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mobile.pages.ApiDemoHomePage;
import mobile.utils.MobileCommonUtils;

import static org.junit.Assert.*;

import static mobile.stepDefs.MobileHooks.*;

public class ApiDemoStepDefs {
    String actualOptionText;

    @Given("user gets text of Accessibility option")
    public void userGetsTextOfAccessibilityOption() {
        actualOptionText = MobileHooks.apiDemoHomePage.accessibilityOption.getText();
    }

    @Then("user validates that it is {string}")
    public void userValidatesThatItIs(String expectedOptionText) {
        assertEquals(expectedOptionText, actualOptionText);
    }

    @Given("user taps on {string}")
    public void userTapsOn(String visibleText) {
        MobileCommonUtils.getElementByText(androidDriver,visibleText).click();
    }

    @Then("user should be able to see {string}")
    public void userShouldBeAbleToSee(String expectedElement) {
        assertTrue(apiDemoHomePage.customView.isDisplayed());
        assertEquals(expectedElement, apiDemoHomePage.customView.getText());
    }
}
