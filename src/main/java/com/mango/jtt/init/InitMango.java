package com.mango.jtt.init;

import com.mango.jtt.po.MangoUser;
import com.mango.jtt.po.Product;
import com.mango.jtt.service.IProductService;
import com.mango.jtt.service.IUserService;
import com.mango.jtt.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Administrator on 2017/6/15.
 * spring����������bean��ʼ��ʱ����ã���ʼ�����ݣ�����һ��Ĭ����Ʒ����ͨ�û��͹���Ա�û���
 */
@Component
public class InitMango{

    @Autowired
    private IProductService productService;
    @Autowired
    private IUserService userService;

    @PostConstruct
    public void init() {
        //����û����Ʒ�����һ��
        List<Product> products = productService.getProductList();
        if (null == products || products.isEmpty()){
            Product product = new Product();
            product.setProductName("Mango");
            product.setQuantity(100);
            product.setUnit("��");
            product.setUnitPrice(100);
            productService.saveProduct(product);
        }

        //����û���û��������ͨ�û��͹���Ա�û�
        List<MangoUser> mangoUsers = userService.getUserList();
        if(null == mangoUsers || mangoUsers.isEmpty()){
            MangoUser mangoUser = new MangoUser();
            mangoUser.setUserName("mango");
            mangoUser.setPassword(StringUtil.md5("123456"));
            mangoUser.setRole("ROLE_USER");
            userService.saveUser(mangoUser);

            MangoUser mangoUser1 = new MangoUser();
            mangoUser1.setUserName("manager");
            mangoUser1.setPassword(StringUtil.md5("123456"));
            mangoUser1.setRole("ROLE_MANAGER");
            userService.saveUser(mangoUser1);
        }
    }

}
