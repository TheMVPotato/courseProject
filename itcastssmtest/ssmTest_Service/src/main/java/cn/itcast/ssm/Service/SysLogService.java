package cn.itcast.ssm.Service;

import cn.itcast.ssm.domain.SysLog;

import java.util.List;

public interface SysLogService {
//添加
    public void save(SysLog sysLog) throws Exception;
//查询所有日志
    List<SysLog> findAll(int page,int size) throws Exception;
}
