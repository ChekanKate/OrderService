namespace sap.capire.orders;

using { cuid } from '@sap/cds/common';

entity Orders : cuid {
    title : String;
    price : Integer;
    amount : Integer;
    supplier_id : String;
 }