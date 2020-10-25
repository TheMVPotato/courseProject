package cn.itcast.ssm.Service.impl;

import cn.itcast.ssm.Service.SysLogService;
import cn.itcast.ssm.dao.SysLogDao;
import cn.itcast.ssm.domain.SysLog;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class SysLogServiceimpl implements SysLogService {
    @Autowired
    private SysLogDao sysLogDao;
    @Override
    public void save(SysLog sysLog) throws Exception {
        sysLogDao.save(sysLog);
    }

    @Override
    public List<SysLog> findAll(int page,int size) throws Exception {
        PageHelper.startPage(page,size);
        return sysLogDao.findAll();
    }
}
