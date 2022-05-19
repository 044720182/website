package com.beanary.website.entity.idm

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "web_users")
class User(

    @Column(name = "username", nullable = false)
    var username: String? = null,

    @Column(name = "firstname", nullable = false)
    var firstname: String? = null,

    @Column(name = "middlename", nullable = true)
    var middlename: String? = null,

    @Column(name = "lastname", nullable = true)
    var lastname: String? = null,

    @Column(name = "email", nullable = false)
    var email: String? = null

) : BaseEntity() {
    override fun toString(): String {
        return "User(id=$id, name='$username', email='$email')"
    }
}