//package com.esheejo.stats.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicLong;
//
//import org.springframework.stereotype.Service;
//
//
//import com.esheejo.stats.model.User;
//
//@Service("userService")
//public class UserServiceImpl implements UserService {
//
//	private static final AtomicLong counter = new AtomicLong();
//	
//	private static List<User> users;
//	
//	static{
//		users= populateDummyUsers();
//	}
//	
//	public List<User> findAllUsers() {
//		// TODO Auto-generated method stub
//		return users;
//	}
//
//	private static List<User> populateDummyUsers(){
//		List<User> users = new ArrayList<User>();
//		users.add(new User(counter.incrementAndGet(),"Sam",30, 70000));
//		users.add(new User(counter.incrementAndGet(),"Tom",40, 50000));
//		users.add(new User(counter.incrementAndGet(),"Jerome",45, 30000));
//		users.add(new User(counter.incrementAndGet(),"Silvia",50, 40000));
//		return users;
//	}
//
//
//	@Override
//	public long count() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public void delete(Long arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(User arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void delete(Iterable<? extends User> arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAll() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public boolean exists(Long arg0) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Iterable<User> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Iterable<User> findAll(Iterable<Long> arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public User findOne(Long arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <S extends User> S save(S arg0) {
//		System.out.print("Saving "+ arg0.toString() );
//		return null;
//	}
//
//	@Override
//	public <S extends User> Iterable<S> save(Iterable<S> arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//}
