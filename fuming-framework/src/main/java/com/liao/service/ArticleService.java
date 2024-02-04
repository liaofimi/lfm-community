package com.liao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liao.domain.ResponseResult;
import com.liao.domain.entity.Article;

public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);
}
