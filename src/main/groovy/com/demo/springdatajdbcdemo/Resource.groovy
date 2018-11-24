package com.demo.springdatajdbcdemo

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table('st_biz_managed_resource')
class Resource {

    @Id
    String id;

    String resourceName;

}
