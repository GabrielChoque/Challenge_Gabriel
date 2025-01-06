package com.mc4.training.application.usecases;

import com.mc4.training.domain.model.PricesModel;

import java.util.Date;
import java.util.List;

public interface ListByFilterUseCase {
    List<PricesModel> execute(Date startDate, Short productId, String curr);
}
