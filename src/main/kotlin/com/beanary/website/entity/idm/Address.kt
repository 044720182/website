package com.beanary.website.entity.idm

import org.springframework.data.annotation.Id
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Table

@Entity
@Table(name = "addresses")
class Address(
    @javax.persistence.Id
    @Column(name = "id", nullable = false)
    open var id: Long? = null

)