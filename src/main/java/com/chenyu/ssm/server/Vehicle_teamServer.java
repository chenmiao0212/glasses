package com.chenyu.ssm.server;

import com.chenyu.ssm.dao.Vehicle_teamDao;
import com.chenyu.ssm.model.Vehicle;
import com.chenyu.ssm.model.Vehicle_team;
import com.chenyu.ssm.model.Vehicle_team_agreement;
import com.chenyu.ssm.model.baseParam.VehicleTeamAgreementParam;
import com.chenyu.ssm.model.baseParam.VehicleTeamParam;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("Vehicle_teamServer")
@Scope("prototype")
public class Vehicle_teamServer {

    @Resource
    private Vehicle_teamDao vehicle_teamDao;

    //获取车队列表
    public List<VehicleTeamParam> getAllVehicleTeam(){ return this.vehicle_teamDao.getAllVehicleTeam();}

    //添加车队
    public int addVehicle_team(Vehicle_team vehicle_team){ return this.vehicle_teamDao.addVehicle_team(vehicle_team);}

    //修改车队
    public int updateVehicle_team(Vehicle_team vehicle_team){ return this.vehicle_teamDao.updateVehicle_team(vehicle_team);}

    //删除车队
    public int deleteVehicle_team(int vt_id){ return this.vehicle_teamDao.deleteVehicle_team(vt_id);}

    //根据id获取协议
    public  List<VehicleTeamAgreementParam> getAllVehicleTeamAgreement(int vt_id)
    { return this.vehicle_teamDao.getAllVehicleTeamAgreement(vt_id);}

    //模糊查询总数
    public int findVehicleTeamCountBykeyWord(String keyWord)
    { return this.vehicle_teamDao.findVehicleTeamCountBykeyWord(keyWord);}

    //模糊分页查询
    public  List<VehicleTeamParam> findVehicleTeamByLimit (String keyWord,int currentPage,int pageSize)
    { return this.vehicle_teamDao.findVehicleTeamByLimit(keyWord,(currentPage-1)*pageSize,pageSize);}

    //添加协议
    public int addVehicle_team_agreement(Vehicle_team_agreement vehicle_team_agreement)
    {return this.vehicle_teamDao.addVehicle_team_agreement(vehicle_team_agreement);}

    //修改协议
    public int updateVehicle_team_agreement(Vehicle_team_agreement vehicle_team_agreement)
    {return this.vehicle_teamDao.updateVehicle_team_agreement(vehicle_team_agreement);}

    //删除协议
    public int deleteVehicle_team_agreement(int vta_id){ return this.vehicle_teamDao.deleteVehicle_team_agreement(vta_id);}

    //根据id获取车辆
    public List<Vehicle> getAllVehicle(int vt_id){ return this.vehicle_teamDao.getAllVehicle(vt_id);}

    //添加车辆
    public int addVehicle(Vehicle vehicle){ return this.vehicle_teamDao.addVehicle(vehicle);}

    //修改车辆
    public int updateVehicle(Vehicle vehicle){ return this.vehicle_teamDao.updateVehicle(vehicle);}

    //删除车辆
    public int deleteVehicle(int vehicle_id){ return this.vehicle_teamDao.deleteVehicle(vehicle_id);}

}
