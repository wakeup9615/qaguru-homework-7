import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsTests {

    @Test
    void checkCodeAboutJunitTest() {
        // -   Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // - Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".wiki-pages-box").$$("ul li").last().$("button").click();
        // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(".wiki-pages-box").$$(".wiki-more-pages").last().click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}