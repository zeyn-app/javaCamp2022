package kodlama.io_ödev.business;

import java.util.List;

import kodlama.io_ödev.core.log.Logger;
import kodlama.io_ödev.dataAccess.CategoryDao;
import kodlama.io_ödev.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private List <Logger> loggers;
	private List <Category> categories;
	
	
	public CategoryManager() {
		super();
	}

	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}



	public void add(Category category) throws Exception{	
		
		for(Category ctgry:categories) {
			if((ctgry.getName()==category.getName()|| ctgry.getId()== category.getId())&& ctgry != category) {
				throw new Exception("The category id and name can not be repeated.");
			}
		}
		categoryDao.add(category);
		categories.add(category);
		
		for(Logger logger:loggers) {
			logger.log(category.getName());
		}
	}

}
