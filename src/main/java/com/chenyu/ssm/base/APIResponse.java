package com.chenyu.ssm.base;

public class APIResponse {
    private int code;
    private String message;
    private Object data;
    private boolean more;


    public APIResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public APIResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
    public APIResponse() {
        this.code = Status.SUCCESS.getCode();
        this.message = Status.SUCCESS.getStandardMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public static APIResponse ofMessage(int code, String message){
        return new APIResponse(code,message,null);
    }

    public static APIResponse ofSuccess(){
        return new APIResponse(Status.SUCCESS.getCode(), Status.SUCCESS.getStandardMessage(),null);
    }

    public static APIResponse ofStatus(Status status){
        return new APIResponse(status.getCode(),status.getStandardMessage(),null);
    }

    public static APIResponse ofData(Object object){
        return new APIResponse(Status.SUCCESS.getCode(), Status.SUCCESS.getStandardMessage(),object);
    }

    public enum Status{
        SUCCESS(200,"OK"),
        BAD_REQUEST(400,"bad Request"),
        NOT_FOUND(404,"no found data"),
        INTRNAL_SERVER_ERROR(500,"Unknown Internal Error"),
        NOT_SUPPORTED(405,"Request method not supported"),
        NOT_VALID_PARAM(40005,"not valid Params"),
        NOT_SUPPORTEND_OPERATION(40006,"Operation not supported"),
        RESOURCES_ALREADY_EXIST(40007,"Resources already exist"),
        WRONG_USER_NAME_OR_PASSWORD(40008,"wrong user name or password"),
        NOT_LOGIN(50000,"Not Login");


        private int code;
        private String standardMessage;

        Status(int code,String standardMessage){
            this.code=code;
            this.standardMessage=standardMessage;
        }


        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getStandardMessage() {
            return standardMessage;
        }

        public void setStandardMessage(String standardMessage) {
            this.standardMessage = standardMessage;
        }
    }

}
