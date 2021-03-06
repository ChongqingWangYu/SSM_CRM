package com.cqut.wangyu.crm.system.follow.dao;

import com.cqut.wangyu.crm.system.dto.FollowDTO;
import com.cqut.wangyu.crm.system.dto.PageQueryDTO;
import com.cqut.wangyu.crm.system.follow.entity.Follow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FollowDao {

    Integer insertFollow(Follow follow);

    List<FollowDTO> selectPageFollow(PageQueryDTO pageQueryDTO);

    Integer deleteFollow(Integer folId);

    Integer updateFollow(Follow follow);

    List<Follow> findFollowByCustomerName(String cusName);

    Follow selectFollowById(Integer folId);

    Integer insertForeach(@Param("list") List<Follow> followList);

    List<FollowDTO> selectAllFollow();

    List<FollowDTO> selectFollowByCusID(Integer cusID);

    List<Integer> selectMonthlyStatistics();
}
