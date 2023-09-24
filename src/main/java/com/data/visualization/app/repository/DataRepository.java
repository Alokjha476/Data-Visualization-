package com.data.visualization.app.repository;

import com.data.visualization.app.entities.DataVisulization;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.crypto.Data;
import java.util.List;

public interface DataRepository extends JpaRepository<DataVisulization,Integer> {
    List<DataVisulization> findByEndYear(Integer endYear);
    List<DataVisulization> findByTopic(String topic);
    List<DataVisulization> findBySector(String sector);
    List<DataVisulization> findByregion(String  region);
    List<DataVisulization> findByPestle(String  pestle);
    List<DataVisulization> findBySource(String  source);
    List<DataVisulization> findBySwot(String swot);
    List<DataVisulization> findByCountry(String country);
    List<DataVisulization> findByCity(String city);






}
