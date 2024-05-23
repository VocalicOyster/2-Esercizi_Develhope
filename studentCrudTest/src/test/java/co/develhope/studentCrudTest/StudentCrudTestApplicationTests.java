package co.develhope.studentCrudTest;

import co.develhope.studentCrudTest.controllers.StudentController;
import co.develhope.studentCrudTest.entities.Student;
import co.develhope.studentCrudTest.services.StudentServices;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
class StudentControllerTest {

	@Autowired
	private StudentServices studentServices;
	@Autowired
	private StudentController studentController;
	@Autowired
	private MockMvc mockMvc;
	@Test
	void contextLoads() {
	}

	@Test
	void createStudent() throws Exception {
		Student student = new Student("giovanni", "innaimi");
		mockMvc.perform(post("/")
				.content(asJsonString(student))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().is(200))
				.andExpect(MockMvcResultMatchers.jsonPath("$.id").exists());
	}

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
