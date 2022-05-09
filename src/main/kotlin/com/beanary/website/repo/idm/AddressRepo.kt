package com.beanary.website.repo.idm

import com.beanary.website.entity.idm.Address
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AddressRepo: CrudRepository<Address, Long> {

    override fun findById(id: Long): Optional<Address>

    override fun findAll(): List<Address>
}