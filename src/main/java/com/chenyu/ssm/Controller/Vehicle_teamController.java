package com.chenyu.ssm.Controller;

import com.chenyu.ssm.base.APIResponse;
import com.chenyu.ssm.model.Vehicle;
import com.chenyu.ssm.model.Vehicle_team;
import com.chenyu.ssm.model.Vehicle_team_agreement;
import com.chenyu.ssm.model.baseParam.VehicleTeamAgreementParam;
import com.chenyu.ssm.model.baseParam.VehicleTeamParam;
import com.chenyu.ssm.model.baseParam.Vo;
import com.chenyu.ssm.server.Vehicle_teamServer;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Vehicle_team")
@Api(value = "/Vehicle_team",description = "车队管理")
public class Vehicle_teamController {

    @Resource
    private Vehicle_teamServer vehicle_teamServer;

    /**
     * 获取车队列表
     * @return
     */
    @RequestMapping(value = "/getAllVehicleTeam", method = RequestMethod.GET)
    @ApiOperation(notes = "/getAllVehicleTeam", httpMethod = "GET", value = "获取车队列表")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = APIResponse.class) })
    @ResponseBody
    public APIResponse getAllVehicleTeam() {
        try {
            List<VehicleTeamParam> list = vehicle_teamServer.getAllVehicleTeam();
            APIResponse apiResponse=new APIResponse(200,"查询成功");
            return apiResponse;
        } catch (Exception e) {
            APIResponse apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }

    /**
     * 添加车队信息
     * @param vehicle_team
     * @return
     */
    @RequestMapping(value = "/addVehicle_team", method = RequestMethod.POST)
    @ApiOperation(notes = "/addVehicle_team", httpMethod = "POST", value = "添加车队信息")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public APIResponse addVehicle_team(@ApiParam(required = true, value = "车队信息") @RequestBody Vehicle_team vehicle_team) {
        APIResponse apiResponse;
        try{
            vehicle_teamServer.addVehicle_team(vehicle_team);
            apiResponse=new APIResponse(200,"添加成功",vehicle_team);
            return apiResponse;
        }catch (Exception e){
            apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }

    /**
     * 修改车队
     * @param vehicle_team
     * @return
     */
    @RequestMapping(value = "/updateVehicle_team", method = RequestMethod.POST)
    @ApiOperation(notes = "/updateVehicle_team", httpMethod = "POST", value = "修改车队信息")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public APIResponse updateVehicle_team(@ApiParam(required = true, value = "车队信息") @RequestBody Vehicle_team vehicle_team) {
        APIResponse apiResponse;
        try{
            vehicle_teamServer.updateVehicle_team(vehicle_team);
            apiResponse = new APIResponse(200, "修改车队成功", vehicle_team);
            return apiResponse;
        }
        catch (Exception e){
           apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }

    /**
     * 删除车队
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteVehicle_team", method = RequestMethod.GET)
    @ApiOperation(notes = "/deleteVehicle_team", httpMethod = "GET", value = "删除车队信息")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public APIResponse deleteVehicle_team(@RequestParam int id) {
        APIResponse apiResponse;
        try{
            vehicle_teamServer.deleteVehicle_team(id);
            apiResponse = new APIResponse(200, "删除车队成功", id);
            return apiResponse;
        }catch (Exception e){
            apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }

    /**
     * 根据id获取协议
     * @param id
     * @return
     */
    @RequestMapping(value = "/getAllVehicleTeamAgreement", method = RequestMethod.POST)
    @ApiOperation(notes = "/getAllVehicleTeamAgreement", httpMethod = "POST", value = "根据id获取协议")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public APIResponse getAllVehicleTeamAgreement(@RequestParam int id) {
        APIResponse apiResponse;
        try{
            List<VehicleTeamAgreementParam> list = vehicle_teamServer.getAllVehicleTeamAgreement(id);
            apiResponse = new APIResponse(200, "获取协议成功", id);
            return apiResponse;
        }catch (Exception e){
            apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }

    /**
     * 模糊、分页查找账户信息
     * @param
     * @return
     */
    @RequestMapping(value = "findVehicleTeamByLimit",method = RequestMethod.GET)
    @ApiOperation(notes = "/findVehicleTeamByLimit", httpMethod = "GET", value = "模糊、分页查找车队信息")
    @ApiResponses(value = { @io.swagger.annotations.ApiResponse(code = 200, message = "模糊、分页查找车队信息", response = APIResponse.class) })
    @ResponseBody
    public APIResponse findAccount_infoByStateLimit(
            @RequestParam(required = false) String keyWord,
            @RequestParam int currentPage,
            @RequestParam int pageSize){
        APIResponse apiResponse;
        int totalNumber = this.vehicle_teamServer.findVehicleTeamCountBykeyWord(keyWord);
        int totalPage = totalNumber%pageSize==0?totalNumber/pageSize:totalNumber/pageSize+1;
        List<VehicleTeamParam> vehicleTeamParams = this.vehicle_teamServer.findVehicleTeamByLimit(keyWord,currentPage,pageSize);
        Vo vo = new Vo(totalPage,totalNumber,currentPage,pageSize);
        List list = new ArrayList();
        list.add(vehicleTeamParams);
        list.add(vo);
        apiResponse=new APIResponse(200,"查询成功",list);
        return apiResponse;
    }

    /**
     * 添加协议
     * @param vehicle_team_agreement
     * @return
     */
    @RequestMapping(value = "/addVehicle_team_agreement", method = RequestMethod.POST)
    @ApiOperation(notes = "/addVehicle_team_agreement", httpMethod = "POST", value = "添加协议")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public APIResponse addVehicle_team_agreement(@ApiParam(required = true, value = "协议信息") @RequestBody Vehicle_team_agreement vehicle_team_agreement) {
        APIResponse apiResponse;
        try{
            vehicle_teamServer.addVehicle_team_agreement(vehicle_team_agreement);
            apiResponse=new APIResponse(200,"添加成功",vehicle_team_agreement);
            return apiResponse;
        }catch (Exception e){
            apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }

    /**
     * 修改协议
     * @param vehicle_team_agreement
     * @return
     */
    @RequestMapping(value = "/updateVehicle_team_agreement", method = RequestMethod.POST)
    @ApiOperation(notes = "/updateVehicle_team_agreement", httpMethod = "POST", value = "修改协议")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public APIResponse updateVehicle_team_agreement(@ApiParam(required = true, value = "协议信息") @RequestBody Vehicle_team_agreement vehicle_team_agreement) {
        APIResponse apiResponse;
        try{
            vehicle_teamServer.updateVehicle_team_agreement(vehicle_team_agreement);
            apiResponse = new APIResponse(200, "修改协议成功", vehicle_team_agreement);
            return apiResponse;
        }
        catch (Exception e){
            apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }

    /**
     * 删除协议
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteVehicle_team_agreement", method = RequestMethod.GET)
    @ApiOperation(notes = "/deleteVehicle_team_agreement", httpMethod = "GET", value = "删除协议")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public APIResponse deleteVehicle_team_agreement(@RequestParam int id) {
        APIResponse apiResponse;
        try{
            vehicle_teamServer.deleteVehicle_team_agreement(id);
            apiResponse = new APIResponse(200, "删除协议成功", id);
            return apiResponse;
        }catch (Exception e){
            apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }

    /**
     * 根据id获取车辆
     * @param vt_id
     * @return
     */
    @RequestMapping(value = "/getAllVehicle", method = RequestMethod.POST)
    @ApiOperation(notes = "/getAllVehicle", httpMethod = "POST", value = "根据id获取车辆")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public APIResponse getAllVehicle(@RequestParam int vt_id) {
        APIResponse apiResponse;
        try{
            List<Vehicle> list = vehicle_teamServer.getAllVehicle(vt_id);
            apiResponse = new APIResponse(200, "获取车辆成功", vt_id);
            return apiResponse;
        }catch (Exception e){
            apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }

    /**
     * 添加车辆
     * @param vehicle
     * @return
     */
    @RequestMapping(value = "/addVehicle", method = RequestMethod.POST)
    @ApiOperation(notes = "/addVehicle", httpMethod = "POST", value = "添加车辆")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public APIResponse addVehicle(@ApiParam(required = true, value = "车辆信息") @RequestBody Vehicle vehicle) {
        APIResponse apiResponse;
        try{
            vehicle_teamServer.addVehicle(vehicle);
            apiResponse=new APIResponse(200,"添加成功",vehicle);
            return apiResponse;
        }catch (Exception e){
            apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }

    /**
     * 修改车辆
     * @param vehicle
     * @return
     */
    @RequestMapping(value = "/updateVehicle", method = RequestMethod.POST)
    @ApiOperation(notes = "/updateVehicle", httpMethod = "POST", value = "修改车辆")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public APIResponse updateVehicle(@ApiParam(required = true, value = "车辆信息") @RequestBody Vehicle vehicle) {
        APIResponse apiResponse;
        try{
            vehicle_teamServer.updateVehicle(vehicle);
            apiResponse=new APIResponse(200,"修改成功",vehicle);
            return apiResponse;
        }catch (Exception e){
            apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }

    /**
     * 删除车辆
     * @param vehicle_id
     * @return
     */
    @RequestMapping(value = "/deleteVehicle", method = RequestMethod.POST)
    @ApiOperation(notes = "/deleteVehicle", httpMethod = "POST", value = "删除车辆")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public APIResponse deleteVehicle(@ApiParam(required = true, value = "车辆信息") @RequestBody int vehicle_id) {
        APIResponse apiResponse;
        try{
            vehicle_teamServer.deleteVehicle(vehicle_id);
            apiResponse=new APIResponse(200,"删除成功",vehicle_id);
            return apiResponse;
        }catch (Exception e){
            apiResponse=new APIResponse(400,e.getMessage());
            return apiResponse;
        }
    }
}
