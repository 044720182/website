package com.beanary.website.entity

import javax.persistence.*

@Entity
@Table(name = "addresses")
class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null
}