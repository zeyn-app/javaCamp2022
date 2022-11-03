package kodlama.io_ödev.dataAccess;

import kodlama.io_ödev.entities.Category;

public interface CategoryDao {
	public void add(Category category);
	public void delete(Category category);
	public void update(Category category);
}
