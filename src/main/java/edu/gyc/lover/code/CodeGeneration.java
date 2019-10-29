package edu.gyc.lover.code;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGeneration {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("/Users/Apple/Desktop/codes/lover/src/main/java");
        gc.setFileOverride(true);
        gc.setActiveRecord(false);//不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);//XML二级缓存
        gc.setBaseResultMap(true);//XML ResultMap
        gc.setBaseColumnList(false);//XML columList
        gc.setAuthor("ls");//作者

        //自定义文件命名，注意%s 会自动填充表实体属性
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sDao");
        gc.setXmlName("%sMapper");
        mpg.setGlobalConfig(gc);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mysql://localhost:3306/lover?serverTimezone=GMT%2B8");
        mpg.setDataSource(dsc);

        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setTablePrefix(new String[]{});//此处可以修改您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);//表名生成策略
        strategy.setInclude(new String[]{"lover"});//需要生成的表

        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);

        mpg.setStrategy(strategy);

        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("edu.gyc.lover");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("dao");
        pc.setEntity("model");
        pc.setXml("mapper");
        mpg.setPackageInfo(pc);

        //执行生成
        mpg.execute();
    }
}
