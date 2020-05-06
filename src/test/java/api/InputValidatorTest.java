package api;

import com.warmke.mike.libcrud.LibraryApplication;
import com.warmke.mike.libcrud.api.InputValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.is;

import java.util.Map;

import static org.junit.Assert.assertThat;


/**
 * going to be testing out some of the antisamy functionality in this class
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
@SpringBootTest(classes = LibraryApplication.class)
public class InputValidatorTest {

    @Autowired
    private InputValidator inputValidator;

    @Test
    public void testUsernameValidation() {
        Map<String,Boolean> testUsernames = Map.of(
                "mikeWarmke" , true,
                "HelloDog!", false,
                "not_my_name", true,
                "select * from dog where name = leo;", false,
                "<div><p>something</p></div>", false
        );

        testUsernames.forEach((username, expectedResult) ->
                assertThat(inputValidator.validateUserName(username), is(expectedResult)));
    }

}
