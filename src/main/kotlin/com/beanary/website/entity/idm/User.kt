package com.beanary.website.entity.idm

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "users")
class User(

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,

    @Column(name = "created_at", updatable = false)
    @CreationTimestamp
    var createdAt: LocalDateTime,

    @Column(name = "updated_at", updatable = false)
    @UpdateTimestamp
    var updatedAt: LocalDateTime,

    @Column(name = "firstname", nullable = false)
    var firstname: String? = null,

    @Column(name = "middlename", nullable = false)
    var middlename: String? = null,

    @Column(name = "lastname", nullable = false)
    var lastname: String? = null
)