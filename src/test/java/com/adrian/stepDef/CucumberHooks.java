package stepDef;

import com.adrian.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class CucumberHooks extends BaseTest {

    @BeforeAll
    public static void setUp() {
    }

    @AfterAll
    public static void tearDown() {
    }

    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest() {
        closeDriver();
    }
}
