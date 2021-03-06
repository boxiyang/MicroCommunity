package com.java110.po.notice;

import java.io.Serializable;

/**
 * @ClassName NoticePo
 * @Description TODO
 * @Author wuxw
 * @Date 2020/5/29 10:30
 * @Version 1.0
 * add by wuxw 2020/5/29
 **/
public class NoticePo implements Serializable {

    private String noticeId;
    private String title;
    private String noticeTypeCd;
    private String context;
    private String communityId;
    private String userId;
    private String startTime;

    private String endTime;


    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNoticeTypeCd() {
        return noticeTypeCd;
    }

    public void setNoticeTypeCd(String noticeTypeCd) {
        this.noticeTypeCd = noticeTypeCd;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCommunityId() {
        return communityId;
    }

    public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
