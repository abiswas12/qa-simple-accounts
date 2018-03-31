package com.qa.demo_account2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qa.demo_account2.model.Account;

public class AccountStub {
	private static Map<Long, Account> accs = new HashMap<Long, Account>();
	private static Long idIndex = 3L;

	//populate initial accounts
	static {
		Account a = new Account(1L, "U869", "Anirban", "Biswas");
		accs.put(1L, a);
		Account b = new Account(2L, "U820", "Matthew", "Moore");
		accs.put(2L, b);
		Account c = new Account(3L, "U516", "Anthony", "FAIR");
		accs.put(3L, c);
	}

	public static List<Account> list() {
		return new ArrayList<Account>(accs.values());
	}

	public static Account create(Account acc) {
		idIndex += idIndex;
		acc.setId(idIndex);
		accs.put(idIndex, acc);
		return acc;
	}

	public static Account get(Long id) {
		return accs.get(id);
	}

	public static Account update(Long id, Account acc) {
		accs.put(id, acc);
		return acc;
	}

	public static Account delete(Long id) {
		return accs.remove(id);
	}
}
