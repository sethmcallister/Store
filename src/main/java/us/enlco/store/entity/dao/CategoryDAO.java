package us.enlco.store.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import us.enlco.store.entity.Category;

/**
 * Created by Sethy on 28/05/2017.
 */
public interface CategoryDAO extends JpaRepository<Category, Integer>
{
    @Query("select c from Category c where c.name like :name")
    Category findCategoryByName(@Param("name") String name);

    @Query("select c from Category c where c.description like :description")
    Category findCategoryByDescription(@Param("description") String description);
}
