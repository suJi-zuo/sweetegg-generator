package com.yupi.model;

import lombok.Data;

/**
 * @author ZuoXuXuan
 * @version 1.0
 * @date 2024/07/22 18:47
 * 静态模板配置
 */
@Data
public class MainTemplateConfig {
    /**
     * 作者（字符串，填充值）
     */
    private String author;
    private String outputText;
    /**
     * 是否循环
     */
    private boolean loop;
}
