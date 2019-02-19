package aim.chat;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {

//        "src/test/resources/features/consult_dictionary/TSUITE1.feature",
//        "src/test/resources/features/consult_dictionary/TSUITE2.feature",
//        "src/test/resources/features/consult_dictionary/TSUITE3.feature",
//        "src/test/resources/features/consult_dictionary/TSUITE4.feature",
//        "src/test/resources/features/consult_dictionary/TSUITE5.feature",
        "src/test/resources/features/consult_dictionary/TSUITE8.feature",

},
        glue = "aim.chat")

public class DefinitionTestSuite {
}
