package com.leyou.upload.api;

import com.leyou.upload.pojo.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("brand")
public interface BrandApi {

    @GetMapping("{id}")
    public Brand queryBrandById(@PathVariable("id") Long id);
}