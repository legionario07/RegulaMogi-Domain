package br.com.regulamogi.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static SessionFactory sessao = null;

	/**
	 * 
	 * @return Session do Hibernate
	 */
	public static Session getSession() {

		if (sessao == null) {
			final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			sessao = new MetadataSources(registry).buildMetadata().buildSessionFactory();


		} else {
			return sessao.openSession();
		}

		return sessao.openSession();
	}
	


}
