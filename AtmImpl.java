package com.atm.service;

import javax.jws.HandlerChain;
import javax.jws.WebService;

import com.atm.dto.Accountinfo;
import com.atm.dto.InvoiceInfo;
import com.atm.dto.TransactionInfo;

@HandlerChain(file="handler-chain.xml")
@WebService(endpointInterface="com.atm.service.IAtm")
//endpoint implemented class
public class AtmImpl implements IAtm {

	@Override
	public InvoiceInfo withdraw(Accountinfo ainfo, TransactionInfo tifo) {
		// bussiness logic to withdraw goes here
		//constructing response object
		
		InvoiceInfo invc=new InvoiceInfo();
		invc.setInvoiceGenDate("28-10-2019");
		invc.setInvoiceNum("789466");
		invc.setStatus("sucessfull");
		invc.setTxNo("238777");
		//returning response
		return invc;
	}

}
