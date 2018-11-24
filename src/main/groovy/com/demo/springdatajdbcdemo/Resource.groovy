package com.demo.springdatajdbcdemo

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

import java.time.LocalDateTime

@Table('st_biz_managed_resource')
class Resource {

    @Id
    String id;

    @Column('resource_name')
    String resourceyNamey;

    @Column('created_by_date')
    LocalDateTime createdDate

}
