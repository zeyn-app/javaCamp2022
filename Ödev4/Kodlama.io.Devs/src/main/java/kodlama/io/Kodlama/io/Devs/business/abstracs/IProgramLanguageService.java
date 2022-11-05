package kodlama.io.Kodlama.io.Devs.business.abstracs;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.entities.concretes.*;
@Service
public interface IProgramLanguageService {
	// returns a list
	List<ProgramLanguage> getAll();
	// returns a program language by id
	public ProgramLanguage getById(int id) throws Exception; 
	public void add(ProgramLanguage programLanguage) throws Exception;
	public void delete(ProgramLanguage programLanguage) throws Exception;
	public void update(ProgramLanguage programLanguage) throws Exception;
}
