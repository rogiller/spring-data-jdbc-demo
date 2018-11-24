package com.demo.springdatajdbcdemo

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ResourceRepo extends CrudRepository<Resource, String> {

    @Query("select id, resource_name, created_by_date from st_biz_managed_resource limit 25")
    List<Resource> findLimited()
}