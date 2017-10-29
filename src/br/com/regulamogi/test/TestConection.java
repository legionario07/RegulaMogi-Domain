package br.com.regulamogi.test;
import org.hibernate.Session;

import br.com.regulamogi.factory.HibernateUtil;

public class TestConection {

	private static Session session = null;
	
	
	public static void main(String[] args) {
		
//	}
//	
//	public void testarConexao(){
		
		
		session = HibernateUtil.getSession();
		
		if(session==null||!session.isOpen()){
			System.out.println("Não foi possível conectar ao Banco de Dados");
		} else {
			System.out.println("Conectado com sucesso!");
		}
		
	}
}
