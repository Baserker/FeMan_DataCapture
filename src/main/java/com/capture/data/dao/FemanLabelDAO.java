package com.capture.data.dao;

import com.capture.data.entity.FemanLabelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 番剧标签的持久层
 * 模块名称：demo com.capture.data.dao
 * 功能说明：<br>
 * 开发人员：Luzx
 * 创建时间： 2019-04-09 16:53
 * 系统版本：1.0.0
 **/

public interface FemanLabelDAO extends JpaRepository<FemanLabelEntity,Integer>,JpaSpecificationExecutor<FemanLabelEntity> {

    @Query(value = "SELECT * from feman_label WHERE PARENT_ID=? and IS_SHOW=?",nativeQuery = true)
    List<FemanLabelEntity> getListByCondition(int parentId,int isShow);
}