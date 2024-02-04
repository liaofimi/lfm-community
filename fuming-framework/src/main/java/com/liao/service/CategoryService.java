package com.liao.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liao.domain.ResponseResult;
import com.liao.domain.entity.Category;

/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2024-02-03 08:54:15
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}

