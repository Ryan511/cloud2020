package com.ryan.springcloud.common.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.builder.ConfigBuilder;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * <p>
 * * 如要使用该代码生成工具，请将该jar包添加到 pom文件中，
 * 否则会出现：java.lang.NoClassDefFoundError: org/apache/velocity/context/Context
 * (生成完之后也建议把该jar包去掉，工程代码瘦身)
 *
 * <dependency>
 * <groupId>org.apache.velocity</groupId>
 * <artifactId>velocity-engine-core</artifactId>
 * </dependency>
 * <p>
 * 代码生成器演示
 * </p>
 */
public class MpGenerator {


    /**
     * pg
     */
//    public static final String MAPPER = "mapper";
//    public static final String RESOURCES_MAPPER = "resources/mapper";
//    public static final DbType dbType = DbType.POSTGRE_SQL;
//    public static final String DRIVER = "org.postgresql.Driver";
//    private static String username = "postgres";
//    private static String password = "123456";
//    private static String dbUrl = "jdbc:postgresql://localhost:5432/paborms?useUnicode=true&characterEncoding=UTF-8";
//    //tb_grant_door tb_del_all_grant_log  tb_grant_door_his tb_grant_door_receive tb_person_pass_receive tb_person_over_time
//    public static final String[] INCLUDE = {"tb_person_pass_receive"};
    /**
     * mysql 第三方
     * //
     */
    public static final String MAPPER = "mapper";
    public static final String RESOURCES_MAPPER = "resources/mapper";
    public static final DbType dbType = DbType.MYSQL;
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String AUTHOR = "zhongziqi";
    public static final String CONTROLLER_NAME = "%sController";
    private static String username = "root";
    private static String password = "Revenco123";
    private static String dbUrl = "jdbc:mysql://localhost:3306/db2019";
    public static final String[] INCLUDE = {"payment"};

    /**
     * common
     */
    public static final String SERVICE = "service";
    public static final String SERVICE_IMPL = "service.impl";
    public static final String ENTITY = "entity";
    public static final String SERVICE_IMPL_NAME = "%sServiceImpl";
    public static final String SERVICE_NAME = "I%sService";
    public static final String PARENT = "com.ryan.springcloud.module";
    //表前缀，不需要则写空
    private static String tablePrefix = "tb_";
    public static final String OUT_PUT = "D:\\IdeaWork\\cloud2020\\cloud-provider-payment8001\\src\\main\\java";
//    public static final String OUT_PUT_MAPPER = "D:\\IdeaWork\\cloud2020\\cloud-provider-payment8001\\src\\main\\java";

    /**
     * @param args
     */
    public static void main(String[] args) {

        AutoGenerator mpg = new AutoGenerator();

        //        String outPut="E:\\intellij_workspace\\mybatis-test2\\main-bussiness\\src\\main\\";
        if (StringUtils.isEmpty(OUT_PUT)) {
            throw new RuntimeException("输出目录不能为空！");
        }
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(OUT_PUT);
        gc.setFileOverride(true);
        // 不需要ActiveRecord特性的请改为false
        gc.setActiveRecord(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        // XML ResultMap
        gc.setBaseResultMap(true);
        // XML columList
        gc.setBaseColumnList(false);
        // .setKotlin(true) 是否生成 kotlin 代码
        gc.setAuthor(AUTHOR);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // gc.setMapperName("%sDao");
        // gc.setXmlName("%sDao");
        // gc.setServiceName("MP%sService");
        gc.setServiceImplName(SERVICE_IMPL_NAME);
        gc.setServiceName(SERVICE_NAME);
        gc.setControllerName(CONTROLLER_NAME);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setDbType(DbType.MYSQL);
//        dsc.setTypeConvert(new MySqlTypeConvert(){
//            // 自定义数据库表字段类型转换【可选】
//            @Override
//            public DbColumnType processTypeConvert(String fieldType) {
//                System.out.println("转换类型：" + fieldType);
//        // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
//                return super.processTypeConvert(fieldType);
//            }
//        });
        dsc.setDbType(dbType);
        dsc.setDriverName(DRIVER);
        dsc.setUsername(username);
        dsc.setPassword(password);
        dsc.setUrl(dbUrl);
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        strategy.setTablePrefix(new String[]{tablePrefix});// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setEntityColumnConstant(true);//默认生成字段常量
        strategy.setEntityBuilderModel(true);//构建中模式
        strategy.setInclude(INCLUDE); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父类
        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
        // 自定义实体，公共字段
        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
        // 自定义 mapper 父类
        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
        // 自定义 service 父类
        // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
        // 自定义 service 实现类父类
        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
        // 自定义 controller 父类
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(true);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // strategy.setEntityBuilderModel(true);

//        strategy.setSuperMapperClass("com.hikvision.energy.")
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(PARENT);
        pc.setEntity(ENTITY);
        pc.setMapper(MAPPER);
        pc.setService(SERVICE);
        pc.setServiceImpl(SERVICE_IMPL);
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        //注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
//                Map<String, Object> map = new HashMap<String, Object>();
//                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
//                this.setMap(map);
            }
        };
        mpg.setCfg(cfg);

        // 自定义 xxList.jsp 生成
//        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
//        focList.add(new FileOutConfig("/template/list.jsp.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输入文件名称
//                return "D://my_" + tableInfo.getEntityName() + ".jsp";
//            }
//        });
//        cfg.setFileOutConfigList(focList);

//
//    // 调整 xml 生成目录演示
//         focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                return "/develop/code/xml/" + tableInfo.getEntityName() + ".xml";
//            }
//        });
//        cfg.setFileOutConfigList(focList);
//        mpg.setCfg(cfg);
//
//        // 关闭默认 xml 生成，调整生成 至 根目录
//        TemplateConfig tc = new TemplateConfig();
//        tc.setXml(null);
//        mpg.setTemplate(tc);

        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
        // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称
        TemplateConfig tc = new TemplateConfig();
        tc.setController(null);
        // tc.setEntity("...");
        // tc.setMapper("...");
        tc.setXml(null);
//         tc.setService("...");
        // tc.setServiceImpl("...");
        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
        // mpg.setTemplate(tc);

        // 执行生成

        mpg.setConfig(new ConfigBuilder(pc, dsc, strategy, tc, gc));

        ConfigBuilder config = mpg.getConfig();

        Map<String, String> pathInfo = config.getPathInfo();

        //目录设置修改
//        pathInfo.put(ConstVal.XML_PATH, OUT_PUT_MAPPER + RESOURCES_MAPPER);
        mpg.execute();

//         打印注入设置【可无】
//        System.err.println(mpg.getCfg().getMap().get("abc"));
    }

}
