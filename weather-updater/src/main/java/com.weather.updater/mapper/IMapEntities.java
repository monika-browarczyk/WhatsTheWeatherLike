package com.weather.updater.mapper;

public interface IMapEntities<TDto, TEntity> {

    TEntity map(TDto dto);
    TEntity map(TDto dto, TEntity entity);
}
