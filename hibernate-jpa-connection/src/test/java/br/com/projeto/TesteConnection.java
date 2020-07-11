package br.com.projeto;

import javax.persistence.Persistence;

public class TesteConnection {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("hibernate-jpa-connection");
	}
}
