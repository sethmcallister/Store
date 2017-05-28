package us.enlco.store.managers;

import us.enlco.store.entity.Category;

import java.util.List;

/**
 * Created by Sethy on 28/05/2017.
 */
public interface CategoryManager
{
    void addCategory(String name, String description);

    void saveCategory(Category category);

    void editCategory(int categoryId, String name, String description);

    void deleteCategory(int categoryId);

    Category findCategoryById(int categoryId);

    List<Category> findAllCategories();
}
