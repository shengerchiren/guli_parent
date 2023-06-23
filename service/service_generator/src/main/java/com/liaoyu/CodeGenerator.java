package com.liaoyu;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

public class CodeGenerator {
    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/gulixueyuan", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("liaoyu") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .disableOpenDir()
                            .outputDir(System.getProperty("user.dir") + "/service/service_edu/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.liaoyu") // 设置父包名
                    /*.pathInfo(Collections.singletonMap(OutputFile.xml, "D://"))*/; // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("edu_teacher") // 设置需要生成的表名
                    /*.addTablePrefix("t_", "c_")表前缀*/
                            .entityBuilder()
                            .enableLombok()
                            //.logicDeleteColumnName("is_deleted")
                            //.logicDeletePropertyName("isDeleted")
                            .enableFileOverride()// 设置覆盖原先生成的文件
                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .enableFileOverride()// 设置覆盖原先生成的文件
                            .controllerBuilder()
                            .enableRestStyle()
                            .enableFileOverride(); // 设置覆盖原先生成的文件
                })
                .templateEngine(new VelocityTemplateEngine()) // 使用的是Velocity引擎模板
                .execute();
    }
}
