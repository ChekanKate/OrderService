//package com.chekan.OrderService.handlers;
//
//import cds.gen.orderservice.OrderService_;
//import com.sap.cds.services.cds.CdsService;
//import com.sap.cds.services.cds.CqnService;
//import com.sap.cds.services.handler.EventHandler;
//import com.sap.cds.services.handler.annotations.On;
//import com.sap.cds.services.handler.annotations.ServiceName;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component
//@ServiceName(OrderService_.CDS_NAME)
//public class OrdersHandler implements EventHandler {
//
//    @Autowired
//    @Qualifier(OrderService_.CDS_NAME)
//    CqnService service;
//
////    @On(entity = Orders_.CDS_NAME)
////    public Result readOrders(CdsReadEventContext context){
////        CqnSelect query = Select.from(Orders_.class)
////                .limit(1);
////        return orderService.run(query);
////    }
//
////    @On(event = CdsService.EVENT_READ, entity = "OrderService.Orders")
////    public void readOrders(List<Orders> orders){
////        CqnSelect query = Select.from("OrderService.Orders").limit(1);
////        service.run(query);
////    }
//
//    @On(event = CdsService.EVENT_CREATE)
//    public void addOrder(){
//        System.out.println("ADD ORDER METHOD");
//    }
//
////    @On(event = CdsService.EVENT_READ)
////    public Result getOrder(){
////        System.out.println("GET ORDER METHOD");
////        CqnSelect cqnSelect = Select.from(Orders_.class).limit(1);
////        return service.run(cqnSelect);
////    }
//}