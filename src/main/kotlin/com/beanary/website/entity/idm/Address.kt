package com.beanary.website.entity.idm

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "addresses")
class Address (

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    var createdAt: LocalDateTime,

    @Column(name = "updated_at", updatable = false)
    @UpdateTimestamp
    var updatedAt: LocalDateTime
)