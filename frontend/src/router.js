
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrdersManager from "./components/listers/OrdersCards"
import OrdersDetail from "./components/listers/OrdersDetail"

import StoreOrdersManager from "./components/listers/StoreOrdersCards"
import StoreOrdersDetail from "./components/listers/StoreOrdersDetail"

import DeliveriesManager from "./components/listers/DeliveriesCards"
import DeliveriesDetail from "./components/listers/DeliveriesDetail"

import NotificationManager from "./components/listers/NotificationCards"
import NotificationDetail from "./components/listers/NotificationDetail"



import StatusView from "./components/StatusView"
import StatusViewDetail from "./components/StatusViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrdersManager',
                component: OrdersManager
            },
            {
                path: '/orders/:id',
                name: 'OrdersDetail',
                component: OrdersDetail
            },

            {
                path: '/storeOrders',
                name: 'StoreOrdersManager',
                component: StoreOrdersManager
            },
            {
                path: '/storeOrders/:id',
                name: 'StoreOrdersDetail',
                component: StoreOrdersDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveriesManager',
                component: DeliveriesManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveriesDetail',
                component: DeliveriesDetail
            },

            {
                path: '/notifications',
                name: 'NotificationManager',
                component: NotificationManager
            },
            {
                path: '/notifications/:id',
                name: 'NotificationDetail',
                component: NotificationDetail
            },



            {
                path: '/statuses',
                name: 'StatusView',
                component: StatusView
            },
            {
                path: '/statuses/:id',
                name: 'StatusViewDetail',
                component: StatusViewDetail
            },


    ]
})
