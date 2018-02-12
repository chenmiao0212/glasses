package com.chenyu.ssm.Controller;

/**
 * Created by chenyu on 2018/1/9.
 */
import com.chenyu.ssm.base.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@RequestMapping(value = "/test", produces = { "application/json;charset=utf-8" })
@Api(value = "/test", description = "测试Contrler")
public class TestController {

    @RequestMapping(value = "/restStyle/{id}", method = RequestMethod.GET)
    @ApiOperation(notes = "/restStyle", httpMethod = "GET", value = "rest风格方法")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public StringAPIResponse restStyle(@ApiParam(required = true, value = "主键") @PathVariable(value = "id") long id) throws CustomException {
        System.err.println(id);
        int a=Integer.parseInt("nihao");
        StringAPIResponse apiResponse = new StringAPIResponse();
        apiResponse.setMsg("操作成功");
        apiResponse.setData("你好");
        return apiResponse;
    }

    @RequestMapping(value = "/getStyle", method = RequestMethod.GET)
    @ApiOperation(notes = "/getStyle", httpMethod = "GET", value = "get风格方法")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public StringAPIResponse getStyle(@ApiParam(required = true, value = "主键") @RequestParam("id") long id) {
        System.err.println(id);
        StringAPIResponse apiResponse = new StringAPIResponse();
        apiResponse.setMsg("操作成功");
        apiResponse.setData("你好");
        return apiResponse;
    }

    @RequestMapping(value = "/postStyle", method = RequestMethod.POST)
    @ApiOperation(notes = "/postStyle", httpMethod = "POST", value = "post风格方法")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    @ResponseBody
    public StringAPIResponse postStyle(@ApiParam(required = true, value = "简单数据") @RequestBody SimpleData data) {
        System.err.println(data.getName());
        StringAPIResponse apiResponse = new StringAPIResponse();
        apiResponse.setMsg("操作成功");
        apiResponse.setData("你好");
        return apiResponse;
    }

    @RequestMapping(value = "/traditionStyle", method = RequestMethod.GET, produces = { "application/xml;charset=utf-8" })
    @ApiOperation(notes = "转入页面:/WEB-INF/jsp/test.jsp", httpMethod = "GET", value = "传统风格方法")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "正常操作", response = StringAPIResponse.class) })
    public String traditionStyle() {
        return "/test";
    }

}

class SimpleData {

    @ApiModelProperty(value = "主键", hidden = false)
    private long id;

    @ApiModelProperty(value = "名称", required = true)
    private String name;

    @ApiModelProperty(value = "年龄")
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

abstract class APIResponse1<T> {

    @ApiModelProperty(value = "操作是否成功")
    private boolean optSuc = true;

    @ApiModelProperty(value = "操作后的提示信息")
    private String msg;

    @ApiModelProperty(value = "返回结果")
    private T data;

    public boolean getOptSuc() {
        return optSuc;
    }


    public void setOptSuc(boolean optSuc) {
        this.optSuc = optSuc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class StringAPIResponse extends APIResponse1<String> {

}
class LoginAPIResponse extends APIResponse1<LoginResponseData>{


}


class LoginResponseData{

    private int userId;
    private String userToken;
    private String avatarAddress;
    private String nickName;
    private String userName;

    public LoginResponseData(){}

    public LoginResponseData(int userId,String userToken,String avatarAddress,String nickName,String userName){
        this.userId=userId;
        this.userToken=userToken;
        this.avatarAddress = avatarAddress;
        this.nickName = nickName;
        this.userName=userName;
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getAvatarAddress() {
        return avatarAddress;
    }

    public void setAvatarAddress(String avatarAddress) {
        this.avatarAddress = avatarAddress;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}


