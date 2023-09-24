package com.data.visualization.app.Service;

import com.data.visualization.app.entities.DataVisulization;
import com.data.visualization.app.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataService {
    @Autowired
    private DataRepository dataRepository;
    public Map<String, List<DataVisulization>> getData(Map<String, String> requestParam){
        Map<String, List<DataVisulization>> resultMap = new HashMap<>();
        if (requestParam.isEmpty()) {
                resultMap.put("total", dataRepository.findAll());
        }else {
            if (requestParam.get("endYear") != null) {
                resultMap.put("endYear", dataRepository.findByEndYear(Integer.parseInt(requestParam.get("endYear"))));
            }
            if (requestParam.get("topic") != null) {
                resultMap.put("topic", dataRepository.findByTopic(requestParam.get("topic")));
            }
            if (requestParam.get("sector") != null) {
                resultMap.put("sector", dataRepository.findBySector(requestParam.get("sector")));
            }
            if (requestParam.get("region ") != null){
                resultMap.put("region ",dataRepository.findByregion(requestParam.get("region ")));
            }
            if (requestParam.get("pestle") != null){
                resultMap.put("pestle", dataRepository.findByPestle(requestParam.get("pestle")));
            }
            if (requestParam.get("source") != null){
                resultMap.put("source", dataRepository.findBySource(requestParam.get("source")));
            }
            if (requestParam.get("swot") != null){
                resultMap.put("swot", dataRepository.findBySwot(requestParam.get("swot")));
            }
            if (requestParam.get("country") != null){
                resultMap.put("country", dataRepository.findByCountry(requestParam.get("country")));
            }
            if (requestParam.get("city") != null){
                resultMap.put("city", dataRepository.findByCity(requestParam.get("city")));
            }

        }
       return resultMap;
    }
}
