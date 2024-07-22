package com.yupi.generator;

import com.yupi.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @author ZuoXuXuan
 * @version 1.0
 * @date 2024/07/22 19:17
 */
public class MainGenerator {
    public static void main(String[] args) throws TemplateException, IOException {
        //1.静态文件生成
        String projectPath = System.getProperty("user.dir");
        //输入路径
        String inputPath = projectPath + File.separator + "sweetegg-generator-demo-projects" + File.separator + "acm-template";
        System.out.println(inputPath);
        //输出路径
        String outputPath = projectPath;
        //复制
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);

//        动态文件生成
        String dynamicInputPath = projectPath + File.separator + "sweetegg-generator-basic"+File.separator+"src/main/resources/templates/MainTemplate.java.ftl";
        String dynamicOutputPath = projectPath + File.separator + "acm-template/src/com/yupi/acm/MainTemplate.java";
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("yupi");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("求和结果：");
        DynamicGenerator.doGenerate(dynamicInputPath, dynamicOutputPath, mainTemplateConfig);
    }
}
