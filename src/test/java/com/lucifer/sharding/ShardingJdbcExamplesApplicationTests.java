package com.lucifer.sharding;

import com.lucifer.sharding.dao.DictDao;
import com.lucifer.sharding.dao.OrderDao;
import com.lucifer.sharding.pojo.Dict;
import com.lucifer.sharding.pojo.Order;
import io.shardingsphere.transaction.annotation.ShardingTransactionType;
import io.shardingsphere.transaction.api.TransactionType;
import org.apache.shardingsphere.transaction.core.TransactionTypeHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ShardingJdbcExamplesApplication.class})
public class ShardingJdbcExamplesApplicationTests {

    @Resource
    DictDao dictDao;

    @Resource
    OrderDao orderDao;

    //@ShardingTransactionType(value = TransactionType.XA)
    @Transactional(rollbackFor = Exception.class)
    @Test
    public void add() {
       /* Dict dict = new Dict();
        dict.setCode("111");
        dict.setType("性别");
        dict.setValue("男");
        dictDao.insert(dict);
*/
        Order order = new Order();
        order.setPrice(BigDecimal.valueOf(0.1));
        order.setStatus("0");
        orderDao.insert(order);

        int a=1/0;

    }

}
