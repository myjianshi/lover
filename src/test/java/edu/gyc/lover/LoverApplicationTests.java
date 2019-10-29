package edu.gyc.lover;

import edu.gyc.lover.dao.LoverDao;
import edu.gyc.lover.service.LoverService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class LoverApplicationTests {
    @Resource
    private LoverDao loverDao;

    @Resource
    private LoverService loverService;

    @Test
    void contextLoads() {
        log.info("All lovers: " + loverService.list());
    }

}
