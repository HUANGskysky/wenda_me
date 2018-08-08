package com.nowcoder.dao;

/**
 * Created by Huangsky on 2018/8/4.
 */

import com.nowcoder.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface QuestionDao {

    @Insert({"insert into question(title,content,created_date,user_id,comment_count) values(#{title},#{content},#{createdDate},#{userId},#{commentCount})"})
    public void addQuestion(Question question);

    public List<Question> selectLatestQuestions(@Param("userId") int userId,
                                                @Param("offset") int offset,
                                                @Param("limit") int limit);

}
