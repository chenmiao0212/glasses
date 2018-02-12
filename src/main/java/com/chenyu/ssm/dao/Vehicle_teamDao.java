package com.chenyu.ssm.dao;

import com.chenyu.ssm.model.Vehicle;
import com.chenyu.ssm.model.Vehicle_team;
import com.chenyu.ssm.model.Vehicle_team_agreement;
import com.chenyu.ssm.model.baseParam.VehicleTeamAgreementParam;
import com.chenyu.ssm.model.baseParam.VehicleTeamParam;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface Vehicle_teamDao {

    //获取车队列表
    List<VehicleTeamParam> getAllVehicleTeam();

    //添加车队
    int addVehicle_team(Vehicle_team vehicle_team);

    //修改车队
    int updateVehicle_team(Vehicle_team vehicle_team);

    //删除车队
    int deleteVehicle_team(int vt_id);

    //根据id获取协议
    List<VehicleTeamAgreementParam> getAllVehicleTeamAgreement(int vt_id);

    //模糊查询总数
    int findVehicleTeamCountBykeyWord(String keyWord);

    //模糊分页查询
    List<VehicleTeamParam> findVehicleTeamByLimit (@Param("keyWord") String keyWord, @Param("start") int start, @Param("number") int number);

    //添加协议
    int addVehicle_team_agreement(Vehicle_team_agreement vehicle_team_agreement);

    //修改协议
    int updateVehicle_team_agreement(Vehicle_team_agreement vehicle_team_agreement);

    //删除协议
    int deleteVehicle_team_agreement(int vta_id);

    //根据id获取车辆
    List<Vehicle> getAllVehicle(int vt_id);

    //添加车辆
    int addVehicle(Vehicle vehicle);

    //修改车辆
    int updateVehicle(Vehicle vehicle);

    //删除车辆
    int deleteVehicle(int vehicle_id);

}
