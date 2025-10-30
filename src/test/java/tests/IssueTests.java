package tests;

import base.TestBase;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.IssueSteps;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class IssueTests extends TestBase {

    @DisplayName("Looking for issue title by selenide")
    @Test
    public void selenideTest(){
        open("Mikeysoll");
        $("[data-tab-item=\"repositories\"]").click();
        $(byText("AllureReportsExploration")).click();
        $("#issues-tab").click();
        $("[data-testid=\"issue-pr-title-link\"]")
                .shouldHave(Condition.text("IssueForTest"));

    }

    @DisplayName("Looking for issue title by steps")
    @Test
    public void stepsTest(){
        step("Opening github profile", () -> {
            open("Mikeysoll");
        });

        step("Opening repository tab", () -> {
            $("[data-tab-item=\"repositories\"]").click();
        });

        step("Opening repository page", () -> {
            $(byText("AllureReportsExploration")).click();
        });

        step("Opening issue tab", () ->{
            $("#issues-tab").click();
        });

        step("Checking issue title", () -> {
            $("[data-testid=\"issue-pr-title-link\"]")
                    .shouldHave(Condition.text("IssueForTest"));
        });


    }

    @DisplayName("Looking for issue title by @Step")
    @Test
    public void annotationTest(){
        IssueSteps steps  = new IssueSteps();
        steps.openGitProfile("Mikeysoll");
        steps.openRepositoryTab();
        steps.openRepositoryPage();
        steps.openIssueTab();
        steps.checkIssueTitle("IssueForTest");
    }

}
