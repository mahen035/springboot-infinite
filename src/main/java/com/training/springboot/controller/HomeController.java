/*
 * package com.training.springboot.controller;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.training.springboot.model.User;
 * 
 * @RestController public class HomeController {
 * 
 * @GetMapping("/users") public ResponseEntity <List<User>> sayHi() {
 * 
 * List<User> userList = new ArrayList<>(); userList.add(new
 * User("Tim","Davis",39, 'M')); userList.add(new User("Priya","Gill",32, 'F'));
 * userList.add(new User("Harry","Porter",19, 'M')); userList.add(new
 * User("Nicole","Kidman",31, 'F')); return new ResponseEntity<> (userList,
 * HttpStatus.OK); }
 * 
 * }
 */
