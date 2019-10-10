package com.elastic.job.config;

import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.elastic.job.task.SimpleDemoJob;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @version v2.0
 * Description
 * @auther gaotiedun
 * Created Date 2019/10/9 0009 14:20
 * Updated Date      by
 */
@Component
@Configuration
public class ElasticJobConfig {
    // 定义作业核心配置
    JobCoreConfiguration simpleCoreConfig = JobCoreConfiguration.newBuilder("demoSimpleJob", "0/15 * * * * ?", 10).build();
    // 定义SIMPLE类型配置
    SimpleJobConfiguration simpleJobConfig = new SimpleJobConfiguration(simpleCoreConfig, SimpleDemoJob.class.getCanonicalName());
    // 定义Lite作业根配置
    LiteJobConfiguration simpleJobRootConfig = LiteJobConfiguration.newBuilder(simpleJobConfig).build();
}
