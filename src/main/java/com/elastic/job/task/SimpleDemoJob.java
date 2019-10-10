package com.elastic.job.task;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.stereotype.Component;

/**
 * @version v2.0
 * Description
 * @auther gaotiedun
 * Created Date 2019/10/9 0009 16:53
 * Updated Date      by
 */
@Component
public class SimpleDemoJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {

    }
}
