import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DifferenceOfElementsTests {

    @Test
    void case1() {
        open("file:///Users/user/IdeaProjects/qaguru-homework-7/src/test/resources/index.html");
        SelenideElement str = $("h1 div");
        SelenideElement str1 = $("h1").$("div");
        System.out.println("$(\"h1 div\") " + str);
        System.out.println("$(\"h1\").$(\"div\")" + str1);
    }
}
// разница в алгоритме поиска
// $("h1 div") находит пару эл-тов h1 div
// $("h1").$("div") находит сначала первый h1 затем в нем ищется div, если в первом h1 не будет div, то след h1 искать не будет