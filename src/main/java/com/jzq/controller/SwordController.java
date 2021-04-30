package com.jzq.controller;

import com.jzq.bean.Rate;
import com.jzq.service.SwordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author jianzhiqiang
 * @date 2021/3/12 23:14
 */
@RestController
public class SwordController {
    @Autowired
    private SwordService swordService;

    @PostMapping("/insertSword")
    public int insertSword(@RequestBody Map<String, Object> map) {
        swordService.insertSword(map);
        return 1;
    }

    @PostMapping("/selectSword")
    public List<Map<String, String>> selectSword(@RequestBody Map<String, Object> map) {
        return swordService.selectSword(map);
    }

    @PostMapping("/updateSword")
    public int updateSword(@RequestBody Map<String, Object> map) {
        swordService.updateSword(map);
        return 1;
    }
}
