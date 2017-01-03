package one.outofmany.us;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by administrator on 1/2/17.
 */

public interface ImageRepository extends PagingAndSortingRepository<Image, Long>{

    public Image findByName(String name);

}
