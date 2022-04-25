package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: zfy
 * @Date: 2022/4/20 15:02
 * @Description:
 */
@Mapper
public interface CommentMapper {

    // 查询评论(根据entityType和entityId)，并且指定偏移量和查询数量
    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit);

    // 查询评论数量
    int selectCountByEntity(int entityType, int entityId);

    // 插入评论
    int insertComment(Comment comment);

    // 查询评论(根据评论id)
    Comment selectCommentById(int id);

    // 查询评论(根据用户查)
    List<Comment> selectCommentsByUser(int userId, int offset, int limit);

    // 查询用户的评论数量
    int selectCountByUser(int userId);
}
