import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JsonSerializerTest {

    @Test
    public void serializeTheObjectAndVerify() throws JsonSerializationException {
        Student student = new Student("sachin","kumar","30");
        JsonSerializer serializer = new JsonSerializer();
        String jsonString = serializer.serialize(student);
        assertEquals(
                "{\"firstName\":\"Sachin\",\"lastName\":\"Kumar\",\"studentAge\":\"30\"}",
                jsonString);
    }
}
