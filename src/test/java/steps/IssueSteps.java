package steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IssueSteps {

    @Step("Opening github profile")
    public void openGitProfile(String profileName) {
        open(profileName);
    }

    @Step("Opening repository tab")
    public void openRepositoryTab() {
        $("[data-tab-item=\"repositories\"]").click();
    }

    @Step("Opening repository page")
    public void openRepositoryPage() {
        $(byText("AllureReportsExploration")).click();
    }

    @Step("Opening issue tab")
    public void openIssueTab() {
        $("#issues-tab").click();
    }

    @Step("Checking issue title")
    public void checkIssueTitle(String issueTitle) {
        $("[data-testid=\"issue-pr-title-link\"]")
                .shouldHave(Condition.text(issueTitle));
    }
}
