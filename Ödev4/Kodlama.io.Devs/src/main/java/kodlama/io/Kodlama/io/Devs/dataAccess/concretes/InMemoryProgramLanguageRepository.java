package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.IProgramLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;

@Repository
public class InMemoryProgramLanguageRepository implements IProgramLanguageRepository{

	List<ProgramLanguage> programLanguages;
	
	
	// henüz bir veri tabanına bağlanılmadığı için liste burada manuel olarak tanımlanır.
	public InMemoryProgramLanguageRepository() {
		programLanguages = Arrays.asList(
				(new ProgramLanguage(1, "Python")),
				(new ProgramLanguage(2, "C")), 
				(new ProgramLanguage(3, "Pascal")), 
				(new ProgramLanguage(4, "JavaScript")));
//		progLangs.add(new ProgramLanguage(1, "Python"));
//		progLangs.add(new ProgramLanguage(2, "C"));
//		progLangs.add(new ProgramLanguage(3, "Pascal"));
//		progLangs.add(new ProgramLanguage(4, "JavaScript"));
	}

	public InMemoryProgramLanguageRepository(List<ProgramLanguage> programLanguages) {
		super();
		this.programLanguages = programLanguages;
	}

	@Override
	public void add(ProgramLanguage programLanguage) {
		// burda veri tabanı olarak programLanguages listesi kullanılacağı için bu listeye veriyi ekliyoruz.
		programLanguages.add(programLanguage);		
	}

	@Override
	public void delete(ProgramLanguage programLanguage) {
		// aynı şekilde silme işlemi de listeden yapılıyor.
		programLanguages.remove(programLanguage);		
	}

	@Override
	public void update(ProgramLanguage programLanguage) {
		// burada ne yapabileceğimi bilmiyorum.
	}

	@Override
	public List<ProgramLanguage> getAll() {
		// liste return edilir
		return programLanguages;
	}

	@Override
	public ProgramLanguage getById(int id) {
		// listedeki ilgili id ye ait değer return edilir.
		return programLanguages.get(id);
	}

}
