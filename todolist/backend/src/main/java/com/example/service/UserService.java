//package com.example.service;
//
//import com.example.entity.User;
//import com.example.repository.IUserRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService implements IUserService{
//   @Autowired
//    private IUserRepository repository ;
//
//   @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//       User user = repository.findByUsername(username);
//
//       if(user == null){
//           throw new UsernameNotFoundException(username);
//       }
//
//       return new User(
//               user.getUserName(),
//               user.getPassword(),
//               AuthorityUtils.createAuthorityList("user"));
//   }
//
//   @Override
//    public User getUserByUsername(String username){
//       return repository.findByUsername(username);
//   }
//}
