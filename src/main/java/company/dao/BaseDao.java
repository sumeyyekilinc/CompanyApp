package company.dao;

import company.entitiy.BaseEntity;

import java.util.List;

public interface BaseDao {

    BaseEntity find(Long id);

    void delete(BaseEntity entity);

    BaseEntity save(BaseEntity entity);

    BaseEntity update (BaseEntity entity);

    List<BaseEntity> getList(int limit);
}
