package com.capture.data.service.impl;

import com.capture.data.dao.FemanLabelDAO;
import com.capture.data.entity.FemanLabelEntity;
import com.capture.data.service.FemanLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * 标签的接口实现类
 * 模块名称：demo com.capture.data.service.impl
 * 功能说明：<br>
 * 开发人员：Luzx
 * 创建时间： 2019-04-10 14:27
 * 系统版本：1.0.0
 **/

@Service
public class FemanLabelImpl implements FemanLabelService{

    @Autowired
    private FemanLabelDAO femanLabelDAO;

    @Override
    public Page<FemanLabelEntity> findAll(int pageNum, int pageSize, FemanLabelEntity model) {
        Pageable pageable=new PageRequest(pageNum,pageSize);
        Page<FemanLabelEntity> page=femanLabelDAO.findAll(new Specification<FemanLabelEntity>() {
            @Nullable
            @Override
            public Predicate toPredicate(Root<FemanLabelEntity> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if(model.getParentId()>-1){
                    predicates.add(cb.equal(root.get("parentId").as(Integer.class),model.getParentId()));
                }if(model.getIsShow()>-1){
                    predicates.add(cb.equal(root.get("isShow").as(Integer.class),model.getIsShow()));
                }
                Predicate[] pre = new Predicate[predicates.size()];
                cq.where(predicates.toArray(pre));
                return cb.and(predicates.toArray(pre));
            }
        },pageable);
        return page;
    }


}