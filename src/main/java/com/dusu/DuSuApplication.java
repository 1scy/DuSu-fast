package com.dusu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author dusu
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DuSuApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DuSuApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  独苏 启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  *******          ********   \n" +
                " /**////**        **//////    \n" +
                " /**    /**      /**          \n" +
                " /**    /**      /*********   \n" +
                " /**    /**      ////////**   \n" +
                " /**    **              /**   \n" +
                " /*******         ********    \n" +
                " ///////         ////////     \n"
        );
    }
}