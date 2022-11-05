package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramLanguage;

@Repository
public interface IProgramLanguageRepository {
	// burada veri tabanından istenilen işlemler tanımlanır.
	List<ProgramLanguage> getAll();
	public ProgramLanguage getById(int id);
	public void add(ProgramLanguage programLanguage);
	public void delete(ProgramLanguage programLanguage);
	public void update(ProgramLanguage programLanguage);
}
