package gt.csv.formatter;

import gt.Pair;
import gt.ScrapData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GujratTourismDataFormatter implements CsvDataFormatter {
    public static final Map<String, String> keyMapper = new LinkedHashMap<>();
    static {
        keyMapper.put("Title", "title");
        keyMapper.put("Address", "address");
        keyMapper.put("Email", "Email");
        keyMapper.put("Mobile", "Mobile");
    }

    @Override
    public LinkedHashMap<String, String> format(ScrapData scrapData) {
        return keyMapper.keySet().stream().map(key-> new Pair<>(key, scrapData.getParamOr(keyMapper.get(key), "").toString())).collect(Collectors.toMap(Pair::getKey, Pair::getValue, (x, y) -> y, LinkedHashMap::new));
    }
}
