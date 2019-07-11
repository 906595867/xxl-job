package com.xxl.job.core.biz.model;



import java.util.Date;

/**
 * @author: zoubin
 * @date: 11/5/18 09:58
 * @description: 通用新增自定义任务参数模型
 */

public class CustomizeJobInfo {

    private XxlJobInfo jobInfo;

    /**
     * 任务起始日期时间
     */
    private Date startDate;

    /**
     * 任务截止日期时间
     */
    private Date endDate;


    public XxlJobInfo getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(XxlJobInfo jobInfo) {
        this.jobInfo = jobInfo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
