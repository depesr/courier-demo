package com.fraktalio.courier.query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CourierRepository extends JpaRepository<CourierEntity, String> {

}
