package com.capture.data.service;

import com.capture.data.entity.FemanLabelEntity;
import org.springframework.data.domain.Page;

/**
 * 标签的接口类
 * 模块名称：demo com.capture.data.service
 * 功能说明：<br>
 * 开发人员：Luzx
 * 创建时间： 2019-04-10 14:26
 * 系统版本：1.0.0
 **/
public interface FemanLabelService {

    public Page<FemanLabelEntity> findAll(int pageNum, int pageSize, FemanLabelEntity model);
}
