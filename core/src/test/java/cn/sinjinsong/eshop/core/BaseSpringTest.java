package cn.sinjinsong.eshop.core;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
/**
 * Created by SinjinSong on 2017/5/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=EShopApplication.class)
@WebAppConfiguration
@Transactional
public class BaseSpringTest {
    
}
