package com.jzq.service;

import com.jzq.bean.Page;
import com.jzq.bean.Rate;
import com.jzq.dao.SwordMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author jianzhiqiang
 * @date 2021/3/12 23:22
 */
@Service
public class SwordService {
    @Resource
    private SwordMapper swordDao;

    public int insertSword(Map<String, Object> map) {
        int count = swordDao.selectSwordByName((String) map.get("name"));
        if(count != 0) {
            return updateSword(map);
        }
        int ability = Integer.parseInt((String) map.get("ability"));
        int code = ability / 10 + 1;
        map.put("designation", code);
        swordDao.insertSword(map);
        return 1;
    }

    public List<Map<String, String>> selectSword(Map<String, Object> map) {
        Page page = Page.getInstance();
        List<Rate> list = swordDao.selectSword(page);

        List<Map<String, String>> resultList = new ArrayList<Map<String, String>>();
        Map<String, String> map2 = new LinkedHashMap<>();
        // 给人员按战斗力数值排序，高的在前。LinkedHashMap 保证顺序。
        Comparator<Rate> com = (o1, o2) -> o2.getAbility() - o1.getAbility();
        Collections.sort(list, com);
        // 将不同称号的人分类
        for(Rate rate: list) {
            if(map2.containsKey(rate.getDesignation())) {
                map2.put(rate.getDesignation(),
                        map2.get(rate.getDesignation()) + rate.getName() + ": " + rate.getAbility() + "，");
            } else {
                map2.put(rate.getDesignation(), rate.getName() + ": " + rate.getAbility() + "，");
            }
        }
        // 把称号和一群人物信息当作一个整体存到 map 里，再放到 list 中。
        Set<Map.Entry<String, String>> entries = map2.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            Map<String, String> temMap = new HashMap<String, String>();
            temMap.put("key", next.getKey());
            temMap.put("value", next.getValue().substring(0, next.getValue().length() - 1));
            resultList.add(temMap);
        }
        return resultList;
    }

    public int updateSword(Map<String, Object> map) {
        int ability = Integer.parseInt((String) map.get("ability"));
        int code = ability / 10 + 1;

        map.put("designation", code);
        swordDao.updateSword(map);
        return 1;
    }
}
