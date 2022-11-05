package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracs.IProgramLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.IProgramLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.*;
@Service
public class ProgramLanguageManager implements IProgramLanguageService{
	private List<ProgramLanguage> programLanguages;
	private IProgramLanguageRepository iProgramLanguageRepository; 
	
	@Autowired
	public ProgramLanguageManager(List<ProgramLanguage> programLanguages, IProgramLanguageRepository iProgramLanguageRepository) {
		super();
		this.programLanguages = programLanguages;
		this.iProgramLanguageRepository = iProgramLanguageRepository;
	}

	@Override
	public void add(ProgramLanguage programLanguage) throws Exception {
		for(ProgramLanguage progLang:programLanguages) {
			if(progLang!=programLanguage && progLang.getName()== programLanguage.getName()) {
				throw new Exception("Language names can not repeated.");
			}
		}
		if(programLanguage.getName().isEmpty()) {
			throw new Exception("Language name can not be empty.");
		}
		
		//şartların sağlanması durumunda yeni dil hem veri tabanına hem de listeye eklenecektir.
		iProgramLanguageRepository.add(programLanguage);
		programLanguages.add(programLanguage);
	}

	@Override
	public void delete(ProgramLanguage programLanguage) throws Exception {
		boolean flag = false;
		for(ProgramLanguage progLang:programLanguages) {
			flag = (progLang != programLanguage && progLang.getId() == programLanguage.getId()) ? true : false;
		}
		
		if(!flag) {
			// listede ilgili dilin olmadığını belirtir. 
			throw new Exception("The language is not in this list.");
		}
		// veri tabanından ve listeden siliniyor.
		iProgramLanguageRepository.delete(programLanguage);
		programLanguages.remove(programLanguage);
		
	}

	@Override
	public void update(ProgramLanguage programLanguage) throws Exception {
		for(ProgramLanguage progLang:programLanguages) {
			if(progLang!=programLanguage && (progLang.getId()==programLanguage.getId() && progLang.getName() == programLanguage.getName())) {
				throw new Exception("There is no any changes.");
			}
			if(progLang!=programLanguage && progLang.getId()==programLanguage.getId()) {
				throw new Exception("The ID numbers can not repeated.");
			}
		}
		//int index = programLAnguage
		
		iProgramLanguageRepository.update(programLanguage);
		// liste nasıl güncellenebilir?
	}

	
	@Override
	public ProgramLanguage getById(int id) throws Exception {
//		boolean flag = false;
//		for(ProgramLanguage progLang:programLanguages) {
//			flag = (progLang != programLanguage && id==progLang.getId()) ? true : false;
//		}
//		if(!flag) {
//			throw new Exception("The language can not found.");
//		}
		// veri tabanındaki aranan değer veri tabanından çekliiyor.
		return iProgramLanguageRepository.getById(id);
	}

	@Override
	public List<ProgramLanguage> getAll() {
		// listelenecek değerler veri tabanından çekiliyor.
		return iProgramLanguageRepository.getAll();
	}
	

}
