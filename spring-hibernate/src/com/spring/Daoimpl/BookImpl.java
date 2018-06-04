package com.spring.Daoimpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spring.bean.Book;
import com.spring.dao.BookDao;

public class BookImpl implements BookDao {

	private SessionFactory sessionFactory;

	// 获取和当前线程绑定的Seesion
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	
	//按照id对书本的查询
	public String findById(int id) {
		// TODO Auto-generated method stub

        String hql="SELECT bookName from Book where id=?";
        Query query=getSession().createQuery(hql).setInteger(0, id);
        String str= query.uniqueResult().toString();
        return str;
	}
   //添加书本信息
	public void addBook(Book book) {
		// TODO Auto-generated method stub
      getSession().save(book);
	}

}
