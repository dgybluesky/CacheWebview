package me.dgy.cachewebview;

/**
 * Created by yale on 2017/10/24.
 */

public interface CacheInterceptor {

    boolean canCache(String url);
}
