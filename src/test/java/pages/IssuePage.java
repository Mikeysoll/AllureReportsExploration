package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class IssuePage {

    private SelenideElement
            repositoryTab = $("[data-tab-item=\"repositories\"]"),
            repositoryLink = $(byText("AllureReportsExploration")),
            issuesTab = $("#issues-tab"),
            issueTitle = $("[data-testid=\"issue-pr-title-link\"]");

    public void openProfile(String profileName) {
        open(profileName);
    }

    public void openRepositoryTab() {
        repositoryTab.click();
    }

    public void openRepositoryPage() {
        repositoryLink.click();
    }

    public void openIssueTab() {
        issuesTab.click();
    }

    public void checkIssueTitle(String titleText) {
        issueTitle.shouldHave(com.codeborne.selenide.Condition.text(titleText));
    }
}