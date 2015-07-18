package com.jacada.creditcheck;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import com.jacada.creditcheck.entities.CreditCheckRequest;
import com.jacada.creditcheck.entities.CreditCheckResponse;

@WebService(targetNamespace = "http://jacada.com/creditcheck")
public interface CreditCheckService {
	@WebResult(name = "response") CreditCheckResponse creditCheck(@XmlElement(required=true) @WebParam(name = "request") CreditCheckRequest request);
}
