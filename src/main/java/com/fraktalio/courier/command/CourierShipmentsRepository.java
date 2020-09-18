package com.fraktalio.courier.command;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Projection - Query side aggregate model - Immediately consistent
 */
@Repository
interface CourierShipmentsRepository extends JpaRepository<CourierShipmentsEntity, String> {

}
