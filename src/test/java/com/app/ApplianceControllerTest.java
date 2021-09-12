package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.app.services.ApplianceServices;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@Tag("appliance")
@AutoConfigureMockMvc(addFilters = false)
public class ApplianceControllerTest {
	
	 	@MockBean
	    private transient ApplianceServices applianceServices;
	 	@Autowired
	    private MockMvc mockMvc;
	 	private static final String URL = "/appliance";
	 	
	 	private static final int STATUS_OK = 200;

	    @Test
	    public void testFindAllActiveAppliances() throws Exception {
	        this.applianceServices.findAllActiveAppliances();
	        ResultActions actions = this.mockMvc.perform(get(URL)
	                .contentType(MediaType.APPLICATION_JSON).content(convertBeanToJson(getApplianceDetails()))).andDo(print());
	        assertEquals(STATUS_OK, actions.andReturn().getResponse().getStatus(), "Test success Get appliances");
	    }
	    @Test
	    public void testFindAllActiveAppliancesWithInMinute() throws Exception {
	        this.applianceServices.findAllActiveAppliances();
	        ResultActions actions = this.mockMvc.perform(get(URL)
	                .contentType(MediaType.APPLICATION_JSON).content(convertBeanToJson(getApplianceDetailsWithInMinute()))).andDo(print());
	        assertEquals(STATUS_OK, actions.andReturn().getResponse().getStatus(), "Test success Get appliances with minute message");
	    }
	    
	    private String convertBeanToJson(Object obj) throws JsonProcessingException {
	        return new ObjectMapper().writeValueAsString(obj);
	    }
	    
	    /**
		 * Gets the user details.
		 *
		 * @return the user details
		 */
		private static List<Map<String, Object>> getApplianceDetails() {
			
			List<Map<String, Object>> appliances = new ArrayList<Map<String, Object>>();
			Map<String, Object> appliance = new HashMap<>();
			
			appliance.put("id", 0);
			appliance.put("customerName", "Haralds Värdetransporter AB");
			appliance.put("customerAddress", "Budgetvägen 1, 333 33 Uppsala");
			appliance.put("applianceId", "YS2R4X20009048066");
			appliance.put("factoryNR", "PQR678");
			appliances.add(appliance);
			return appliances;
		}
		
		 /**
		 * Gets the user details with there are no active machineries.
		 *
		 * @return the user details
		 */
		private static List<Map<String, Object>> getApplianceDetailsWithInMinute() {
			
			List<Map<String, Object>> appliances = new ArrayList<Map<String, Object>>();
			Map<String, Object> appliance = new HashMap<>();
			appliance.put("message", "Please try after 1 mintue");
			appliances.add(appliance);
			return appliances;
		}

}
