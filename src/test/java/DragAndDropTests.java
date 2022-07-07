import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {
    @Test
    void dragAndDropTests() {
        //- Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //- Переесите прямоугольник А на место В
        $("#column-a").dragAndDropTo($("#column-b"));
        //- Проверьте, что прямоугольники действительно поменялись
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

//        actions().moveToElement($("#column-a")).clickAndHold().moveToElement($("#column-b")).release().perform();
//        $("#column-a").shouldHave(text("B"));
//        $("#column-b").shouldHave(text("A"));
    }
}