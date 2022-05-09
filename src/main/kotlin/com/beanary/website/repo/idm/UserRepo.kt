package com.beanary.website.repo.idm

import com.beanary.website.entity.idm.Address
import com.beanary.website.entity.idm.User
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepo: CrudRepository<User, Long> {
    override fun findById(id: Long): Optional<User>

    override fun findAll(): List<User>
}