package org.example.reggie.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

//自定义元数据处理器
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Autowired
    HttpServletRequest httpServletRequest;

    //    新增数据时插入公共字段
    @Override
    public void insertFill(MetaObject metaObject) {
        metaObject.setValue("createTime", LocalDateTime.now());
        metaObject.setValue("updateTime", LocalDateTime.now());
        metaObject.setValue("createUser", httpServletRequest.getSession().getAttribute("employee"));
        metaObject.setValue("updateUser", httpServletRequest.getSession().getAttribute("employee"));
    }

    //    更新数据时插入公共字段
    @Override
    public void updateFill(MetaObject metaObject) {
        metaObject.setValue("updateTime", LocalDateTime.now());
        metaObject.setValue("updateUser", httpServletRequest.getSession().getAttribute("employee"));
    }
}
