package mk.ukim.finki.culturecanvasmk.service;

import mk.ukim.finki.culturecanvasmk.model.Monument;
import mk.ukim.finki.culturecanvasmk.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface MonumentService {

    Monument findById(Long id);

    List<Monument> listAllPlaces();

    List<Monument> searchByName(String name);

    List<Monument> filterByCity(String city);

    Optional<Monument> searchById(long id);

    List<Double> getLatitudes();

    List<Double> getLongitudes();

    List<Monument> filterByDistance(Double latFrom, Double lngFrom, Double distance);

    void deleteById(Long id);
    void saveMonument(String nameMk, String nameEn, String city, String region, String municipality, String suburb, String longitude, String latitude, String address, long id, String imageUrl);

    void addReviewToMonument(Review review, Long monumentId);
    List<Review> listAllReviewsForMonument(Long id);
    void deleteReviewById(Long monument_id,Long review_id);

    Page<Monument> listMonumentsPageable(Pageable pageable);
    Page<Monument> searchByNamePageable(String name, Pageable pageable);
    Page<Monument> filterByCityPageable(String city, Pageable pageable);
    Page<Monument> filterByCityAndNamePageable(String city, String nameMk, String nameEn, Pageable pageable);
}


