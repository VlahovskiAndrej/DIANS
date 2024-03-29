package mk.ukim.finki.culturecanvasmk.repository.jpa;

import mk.ukim.finki.culturecanvasmk.model.Monument;
import mk.ukim.finki.culturecanvasmk.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MonumentRepository extends JpaRepository<Monument, Long> {

    Optional<Monument> findById(Long id);

    List<Monument> findAllByNameMkContainingIgnoreCaseOrNameEnContainingIgnoreCase(String name, String name1);

    List<Monument> findAllByCityIgnoreCase(String city);

    @Query("SELECT m.latitude FROM Monument m")
    List<Double> findAllLatitudes();

    @Query("SELECT m.longitude FROM Monument m")
    List<Double> findAllLongitudes();

    void deleteById(Long id);

    default void addReviewToMonument(Long id,Review review)
    {
        Monument monument = findById(id).get();
        monument.getReviews().add(review);
        save(monument);
    }

    Page<Monument> findAllByNameMkContainingIgnoreCaseOrNameEnContainingIgnoreCase(String nameMk, String nameEn, Pageable pageable);

    Page<Monument> findAllByCityIgnoreCase(String city, Pageable pageable);
    Page<Monument> findAllByCityIgnoreCaseAndNameMkContainingIgnoreCaseOrCityIgnoreCaseAndNameEnContainingIgnoreCase(String city1, String nameMk, String city2, String nameEn, Pageable pageable);
}
