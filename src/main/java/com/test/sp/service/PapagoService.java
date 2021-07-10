package com.test.sp.service;

import com.test.sp.entity.papago.PaPagoParam;
import com.test.sp.entity.papago.PaPagoResult;

public interface PapagoService {

	PaPagoResult getPaPagoResult(PaPagoParam pp);
}