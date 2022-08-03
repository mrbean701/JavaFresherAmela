//package com.example.repository;
//
//import com.example.entity.Status;
//import com.example.entity.Task;
//import com.example.utils.HibernateUtils;
//import org.hibernate.Session;
//import org.hibernate.query.Query;
//
//import java.util.List;
//
//public class TaskRepository {
//    private HibernateUtils hibernateUtils;
//
//    public TaskRepository() {
//        hibernateUtils = hibernateUtils.getInstance();
//    }
//
//    public List<Task> getAllTasks() {
//        Session session = null;
//        try {
//            session = hibernateUtils.openSession();
//
//            Query<Task> query = session.createQuery("FROM Task");
//
//            return query.list();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    public Task getTaskById(short id) {
//        Session session = null;
//        try {
//            session = hibernateUtils.openSession();
//
//            Task task = session.get(Task.class, id);
//
//            return task;
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    public Task getTaskByTitle(String title) {
//        Session session = null;
//        try {
//            session = hibernateUtils.openSession();
//
//            Query<Task> query = session.createQuery("FROM Task WHERE Title = :titleParameter");
//
//            query.setParameter("titleParameter", title);
//
//            Task task = query.uniqueResult();
//
//            return task;
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    public void createTask(Task task) {
//        Session session = null;
//        try {
//            session = hibernateUtils.openSession();
//
//            session.save(task);
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    public void updateTask(short id, String newTitle, String newContent, Status newstatus) {
//        Session session = null;
//        try {
//            session = hibernateUtils.openSession();
//            session.beginTransaction();
//
//            Task task = (Task) session.load(Task.class, id);
//
//            task.setTitle(newTitle);
//            task.setContent(newContent);
//            task.setStatus(newstatus);
//
//            session.getTransaction().commit();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    public void deleteTask(short id) {
//        Session session = null;
//        try {
//            session = hibernateUtils.openSession();
//
//            session.beginTransaction();
//
//            Task task = (Task) session.load(Task.class, id);
//
//            session.delete(task);
//
//            session.getTransaction().commit();
//    }finally {
//            if (session!= null) {
//                session.close();
//            }
//        }
//    }
//
//    public boolean isTaskExistsById(short id) {
//        Task task = getTaskById(id);
//
//        if (task == null){
//            return false;
//        }
//        return true;
//    }
//
//    public boolean isTaskExistsByTitle(String title) {
//        Task task = getTaskByTitle(title);
//
//        if (task == null){
//            return false;
//        }
//        return true;
//    }
//}
