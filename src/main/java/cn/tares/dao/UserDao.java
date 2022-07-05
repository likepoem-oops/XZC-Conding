package cn.tares.dao;

import cn.tares.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    @Select("select * from tb_user where username = #{username}")
    User selectByUsername(String username);


}
