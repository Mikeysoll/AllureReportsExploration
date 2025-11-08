package steps;

import io.qameta.allure.Step;
import pages.IssuePage;

public class IssueSteps {

    private final IssuePage issuePage = new IssuePage();

    @Step("Opening GitHub profile")
    public void openGitProfile(String profileName) {
        issuePage.openProfile(profileName);
    }

    @Step("Opening repository tab")
    public void openRepositoryTab() {
        issuePage.openRepositoryTab();
    }

    @Step("Opening repository page")
    public void openRepositoryPage() {
        issuePage.openRepositoryPage();
    }

    @Step("Opening issue tab")
    public void openIssueTab() {
        issuePage.openIssueTab();
    }

    @Step("Checking issue title: {issueTitle}")
    public void checkIssueTitle(String issueTitle) {
        issuePage.checkIssueTitle(issueTitle);
    }
}