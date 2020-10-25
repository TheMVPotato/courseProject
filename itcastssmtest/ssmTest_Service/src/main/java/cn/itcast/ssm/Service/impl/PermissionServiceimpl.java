package cn.itcast.ssm.Service.impl;

import cn.itcast.ssm.Service.PermissionService;
import cn.itcast.ssm.dao.PermissionDao;
import cn.itcast.ssm.domain.Permission;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PermissionServiceimpl implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;
    @Override
    public List<Permission> findAll(int page,int size) throws Exception {
        PageHelper.startPage(page,size);
        return permissionDao.findAll();
    }

    @Override
    public void save(Permission permission) throws Exception {
        permissionDao.save(permission);
    }
}
