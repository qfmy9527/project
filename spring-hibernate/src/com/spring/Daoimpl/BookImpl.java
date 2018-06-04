package com.spring.Daoimpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.spring.bean.Book;
import com.spring.dao.BookDao;

public class BookImpl implements BookDao {

	private SessionFactory sessionFactory;

	// ��ȡ�͵�ǰ�̰߳󶨵�Seesion
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	
	//����id���鱾�Ĳ�ѯ
	public String findById(int id) {
		// TODO Auto-generated method stub

        String hql="SELECT bookName from Book where id=?";
        Query query=getSession().createQuery(hql).setInteger(0, id);
        String str= query.uniqueResult().toString();
        return str;
	}
   //����鱾��Ϣ
	public void addBook(Book book) {
		// TODO Auto-generated method stub
      getSession().save(book);
	}

}
