package cn.tares.service.impl;


import cn.tares.dao.UserDao;
import cn.tares.pojo.User;
import cn.tares.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUser(String username){
        return userDao.selectByUsername(username);
    }

}
