package com.huaxin.onestopprocurement.po;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String userInfo;

    private String userAddress;

    private Long userMobilephone;

    private String userPhone;

    private Integer userBonuspoint;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo == null ? null : userInfo.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Long getUserMobilephone() {
        return userMobilephone;
    }

    public void setUserMobilephone(Long userMobilephone) {
        this.userMobilephone = userMobilephone;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserBonuspoint() {
        return userBonuspoint;
    }

    public void setUserBonuspoint(Integer userBonuspoint) {
        this.userBonuspoint = userBonuspoint;
    }
}