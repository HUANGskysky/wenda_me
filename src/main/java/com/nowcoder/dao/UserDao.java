package com.nowcoder.dao;

import com.nowcoder.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


/**
 * Created by Huangsky on 2018/8/4.
 */
@Mapper
public interface UserDao {

   /* @Insert({"insert into user(name, password, salt, head_url) values(#{name},#{password},#{salt},#{headUrl})"})*/
    public void addUser(User user);

    @Update({"update user set password=#{password} where id = #{id}"})
    public void updatePassword(User user);

    @Delete({"delete from user where id = #{id}"})
    public void deleteUserById(@Param("id") int id);

    @Select({"select * from user"})
    public List<User> selectUser();

    public User selectById(@Param("id")int id);

    @Select({"select * from user order by id desc limit #{offset},#{limit}"})
    public List<User> selectUserByLimit(@Param("offset") int offset,
                                        @Param("limit") int limit);

    @Select({"select * from user where name = #{name}"})
    public User selectByName(String name);

}
