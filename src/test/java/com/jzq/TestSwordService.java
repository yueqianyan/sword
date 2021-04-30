package com.jzq;

import com.jzq.service.SwordService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jianzhiqiang
 * @date 2021/4/23 15:19
 */
@Component
public class TestSwordService {
    private Map map = new HashMap();
    @Autowired
    private SwordService swordService;

    @Test
    public void testSelectSword() {
        swordService.selectSword(map);
    }
}
