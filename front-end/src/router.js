import Vue from 'vue'
import Router from 'vue-router'
import LoginPage from "./views/LoginPage";
import RegisterPage from "./views/RegisterPage";
import HomePage from "./views/HomePage";
import UserPage from "./views/UserPage";
import ItemPage from "./views/ItemPage";
import OrderPage from "./views/OrderPage";
import ItemsPage from "./views/ItemsPage";
import UsersPage from "./views/UsersPage";
import OrdersPage from "./views/OrdersPage";
import LayoutPage from "./components/LayoutPage";

Vue.use(Router);

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    /*{
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/!* webpackChunkName: "about" *!/ './views/About.vue')
    }*/

    {
      path: '/login',
      name: 'login',
      component: LoginPage
    },
    {
      path: '/register',
      name: 'register',
      component: RegisterPage
    },
    {
      path: '/',
      name: 'layout',
      component: LayoutPage,
      children: [
        {
          path: '',
          name: 'home',
          component: HomePage
        },
        {
          path: '/item',
          name: 'item',
          component: ItemPage
        },
        {
          path: '/items',
          name: 'items',
          component: ItemsPage
        },
        {
          path: '/user',
          name: 'user',
          component: UserPage
        },
        {
          path: '/users',
          name: 'users',
          component: UsersPage
        },
        {
          path: '/order',
          name: 'order',
          component: OrderPage
        },
        {
          path: '/orders',
          name: 'orders',
          component: OrdersPage
        },
      ]

    },


  ]
})
