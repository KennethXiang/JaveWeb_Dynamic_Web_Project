package cn.itcast.service;

import cn.itcast.dao.OrdersDao;

public class OrdersService {
    private OrdersDao ordersDao;



    public void setOrdersDao(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }


    //service层 要 调用 dao层  的方法
    //业务逻辑层，写转账业务
    public void accountMoney() {
        //小王少1000
        ordersDao.lessMoney();


        // 出现异常
        // int i=10/0;

        //小马多1000
        ordersDao.moreMoney();
    }
}
