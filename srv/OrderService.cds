using { sap.capire.orders as db } from '../db/schema';

service ServiceOrder {
    entity Orders as projection on db.Orders;
}