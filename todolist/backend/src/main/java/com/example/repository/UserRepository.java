//package com.example.repository;
//
//import com.example.entity.User;
//import com.example.utils.HibernateUtils;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//
//import java.util.List;
//
//public class UserRepository {
//    private HibernateUtils hibernateUtils;
//
//    public UserRepository() {
//        hibernateUtils = HibernateUtils.getInstance();
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<User> getAllUsers() {
//        Session session = null;
//
//        try {
//            // openSession
//            session = hibernateUtils.openSession();
//            // hql query
//            Query<User> query = session.createQuery("FROM User");
//
//            return query.list();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    public User getUserByID(short id) {
//        Session session = null;
//
//        try {
//            // openSession
//            session = hibernateUtils.openSession();
//            // hql query
//            User user = session.get(User.class, id);
//
//            return user;
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    public User getUserByFullName(String fullName) {
//        Session session = null;
//
//        try {
//            // openSession
//            session = hibernateUtils.openSession();
//            // hql query
//            Query<User> query = session.createQuery("FROM User WHERE fullName='" + fullName + "'");
//            // get results
//            User user = query.getSingleResult();
//            return user;
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    public User getUserByUserName(String userName) {
//        Session session = null;
//
//        try {
//            // openSession
//            session = hibernateUtils.openSession();
//            // hql query
//            Query<User> query = session.createQuery("FROM User WHERE UserName= :userNameParameter");
//            // set parameters
//            query.setParameter("userNameParameter", userName);
//            // get results
//            User user = query.uniqueResult();
//
//            return user;
//        }finally {
//            if (session!= null) {
//                session.close();
//            }
//        }
//    }
//
//
//
//    public void createUser(User user) {
//        Session session = null;
//
//        try {
//            // openSession
//            session = hibernateUtils.openSession();
//            // hql query
//            session.save(user);
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    public boolean isUserExistsByID(short id) {
//        // get user
//        User user = getUserByID(id);
//
//        // return result
//        if (user != null) {
//            return false;
//        }
//        return true;
//    }
//
//    public boolean isUserExistsByUserName(String userName) {
//        User user = getUserByUserName(userName);
//
//        if (user != null) {
//            return false;
//        }
//        return true;
//    }
//}