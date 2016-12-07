package mum.edu.webflow;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mum.edu.service.AdviceService;

@Component
public class AdviceControllerHelper {
	@Autowired
    private AdviceService adviceService;
	
	public Map<Integer, String> getAllRoasts() {
		return adviceService.getAllRoasts();
	}

	public String getRoastByKey(Integer roastKey) {
		return adviceService.getRoast(roastKey);
	}

	public List<String> getAdviceList(String type) {
		return adviceService.getListByType(type);
 	}

}
