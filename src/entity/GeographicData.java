package entity;

/**
 * Created by SMasalykin on 29.01.2016.
 * Для передачи в С
 */
public interface GeographicData {
    String getCorrCountry();
    String getCorrRegion();
    String getCorrArea();
    String getCorrCity();
    String getCorrStreet();
    String getCorrHouse();
    String getCorrStructure();
    String getCorrFlat();
    String getCorrLocality();
}
