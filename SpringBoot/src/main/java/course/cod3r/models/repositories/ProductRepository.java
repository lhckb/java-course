package course.cod3r.models.repositories;

import org.springframework.data.repository.CrudRepository;

import course.cod3r.models.entities.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

    public Iterable<Product> findByNameContaining(String name);
}
