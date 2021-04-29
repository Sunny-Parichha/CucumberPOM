package stepDefs;

import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class AccountPageSteps {

    @Given("user has already logged in to aplication")
    public void user_has_already_logged_in_to_aplication(DataTable dataTable) {

        List<Map<String, String>> credList = dataTable.asMaps();
        String username = credList.get(0).get("username");
        String password = credList.get(1).get("password");

        DriverFactory.getDriver().get("");
    }

    @Given("user is on Account Page")
    public void userIsOnAccountPage() {

    }

    @And("accounts section count should be {int}")
    public void accountsSectionCountShouldBe(int arg0) {
    }

    @Then("user gets accounts section")
    public void user_gets_accounts_section(DataTable dataTable) {
    }
}