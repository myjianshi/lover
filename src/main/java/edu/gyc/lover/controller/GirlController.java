package edu.gyc.lover.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import edu.gyc.lover.dao.LoverDao;
import edu.gyc.lover.model.Lover;
import edu.gyc.lover.service.LoverService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GirlController {

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
    public String all(Model model) {
        List<Lover> data = loverService.list();
        model.addAttribute("list", data);
        return "index";
    }


}
