package edu.gyc.lover.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import edu.gyc.lover.dao.LoverDao;
import edu.gyc.lover.model.Lover;
import edu.gyc.lover.service.LoverService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ls
 * @since 2019-10-29
 */
@RestController
@RequestMapping("/lover")
public class LoverController {

    @Resource
    private LoverDao loverDao;
    @Resource
    private LoverService loverService;

    @GetMapping("high")
    public Object getHighLovers(Integer n) {
        List<Lover> data = loverService.list(Wrappers.<Lover>lambdaQuery().ge(Lover::getPrice, n));
        return data;
    }

    @GetMapping("all")
    public Object all() {
        List<Lover> data = loverService.list();
        return data;
    }

    @GetMapping("names")
    public Object names() {
        List<String> data = loverDao.getAllLoverNames();
        return data;
    }
}

