package api;
import io.dropwizard.jersey.validation.Validators;
import org.junit.Test;

import javax.validation.Validator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.junit.Assert.*;

public class CreateTagRequestTest {

    private final Validator validator = Validators.newValidator();

    @Test
    public void testTag() {
        CreateTagRequest tag = new CreateTagRequest();
        tag.receiptId = 1;

        tag.tag = new String ("tagTest");
        assertThat(validator.validate(tag), empty());

    }

    @Test
    public void testTagInsert() {
        CreateTagRequest tag = new CreateTagRequest();
        tag.receiptId = 1;

        //tag.tag = new String ("tagTest2");
        assertThat(validator.validate(tag), hasSize(1));

    }
}