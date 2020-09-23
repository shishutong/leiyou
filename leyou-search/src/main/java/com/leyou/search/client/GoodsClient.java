package com.leyou.search.client;

import com.leyou.upload.api.GoodApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "item-service")
public interface GoodsClient extends GoodApi {

}