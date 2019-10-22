package hibernate.dao;

import hibernate.model.Planet;
import hibernate.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import static hibernate.util.HibernateSessionFactoryUtil.getSessionFactory;

public class DaoPlanet {

    @Transactional
    public Planet findById(int id) {
        return HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .get(Planet.class, id);
    }

    @Transactional
    public Planet save(Planet galaxy) {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(galaxy);
        transaction.commit();
        session.close();
        return galaxy;
    }

    @Transactional
    public Planet delete(Planet galaxy) {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(galaxy);
        transaction.commit();
        session.close();
        return galaxy;
    }
}
