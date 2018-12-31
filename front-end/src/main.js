// css files
import 'vue2-admin-lte/src/lib/css'

// js files
import 'vue2-admin-lte/src/lib/script'

import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import axios from 'axios';
import Vuelidate from 'vuelidate';

Vue.config.productionTip = false;

// Bootstrap axios
axios.defaults.baseURL = '/api';
axios.defaults.headers.common.Accept = 'application/json';
axios.interceptors.response.use(response => response, error => {
  return Promise.reject(error);
});

// Enable Vuelidate
Vue.use(Vuelidate);

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app');
