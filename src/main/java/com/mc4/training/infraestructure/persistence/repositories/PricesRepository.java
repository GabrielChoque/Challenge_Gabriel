package com.mc4.training.infraestructure.persistence.repositories;

import com.mc4.commons.base.infrastructure.persistence.repositories.BaseRepository;
import com.mc4.training.infraestructure.persistence.entities.Prices;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PricesRepository extends BaseRepository<Prices, Short> {
    @Query("SELECT p " +
           "FROM Prices p " +
           "WHERE p.startDate = :pStartDate AND p.productId = :pProductId AND p.curr = :pCurr")
    List<Prices> listByFilter (@Param("pStartDate") Date pStartDate,
                               @Param("pProductId") Short pProductId,
                               @Param("pCurr") String pCurr);
}
