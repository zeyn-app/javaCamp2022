package kodlama.io.Kodlama.io.Devs.webAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracs.IProgramLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;

// Bu sınıfın amacı API oluşturup, diğer servisler ile iletişim kurmamızı sağlamak
@RestController
@RequestMapping("/api/programLanguage")
public class ProgramLanguagesController {
	//Servis ile iletişim sağlanacağı için servis sınıfı çağrılır.
	IProgramLanguageService iProgramLanguageService;

	@Autowired
	public ProgramLanguagesController(IProgramLanguageService iProgramLanguageService) {
		super();
		this.iProgramLanguageService = iProgramLanguageService;
	}
	/*
	 * public ProgramLanguage getById(int id);
	public void add(ProgramLanguage programLanguage);
	public void delete(ProgramLanguage programLanguage);
	public void update(ProgramLanguage programLanguage);
	 */
	
	@GetMapping("/getall")
	public List<ProgramLanguage> getAll(){
		return iProgramLanguageService.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgramLanguage getById(int id) throws Exception {
		return iProgramLanguageService.getById(id);
	}
	
	@GetMapping("/add")
	public void add(ProgramLanguage programLanguage) throws Exception {
		iProgramLanguageService.add(programLanguage);
	}
	
	@GetMapping("/delete")
	public void delete(ProgramLanguage programLanguage) throws Exception {
		iProgramLanguageService.delete(programLanguage);
	}
	@GetMapping("/update")
	public void update(ProgramLanguage programLanguage) throws Exception {
		iProgramLanguageService.update(programLanguage);
	}

}
