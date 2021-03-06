package cn.itcast.ssm.Service.impl;

import cn.itcast.ssm.Service.ProductService;
import cn.itcast.ssm.dao.ProductDao;
import cn.itcast.ssm.domain.Product;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class Productimpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    public List<Product> findAll(int page,int size) throws Exception {
        PageHelper.startPage(page,size);
        return productDao.findAll();
    }

    @Override
    public void save(Product product)throws Exception {
         productDao.save(product);
    }
}
