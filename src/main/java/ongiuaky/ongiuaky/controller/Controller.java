package ongiuaky.ongiuaky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ongiuaky.ongiuaky.entity.ChuyenBay;
import ongiuaky.ongiuaky.repository.ChuyenBayRepository;


@RestController
@RequestMapping("")
public class Controller {
	@Autowired
	private ChuyenBayRepository repo;

	@GetMapping("/chuyen-bay-toi-dalat")
    @PreAuthorize("hasAnyAuthority('USER_READ')")
	public List<ChuyenBay> toDalat() {
		List<ChuyenBay> lstChuyenBay = (List<ChuyenBay>) repo.findFlightsTo("DAD");
		System.out.println(lstChuyenBay);
		return lstChuyenBay;
	}

//	@GetMapping("/may-bay-lon-hon-10000")
//	public List<ChuyenBay> greater10000() {
//		List<ChuyenBay> lstChuyenBay = (List<ChuyenBay>) repo.findFlightsTo("DAD");
//		System.out.println(lstChuyenBay);
//		return lstChuyenBay;
//	}
	

//	@PostMapping("")
//	public ChuyenBay add(@RequestBody ChuyenBay chuyenBay) {
//		repo.save(chuyenBay);
//		System.out.println(chuyenBay);
//		return chuyenBay;
//	}
}

