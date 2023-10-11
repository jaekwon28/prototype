import { createApp } from 'vue'
import App from './App.vue'
import 'bootstrap/dist/css/bootstrap.css'
import router from './router'
import axios from 'axios'
// createApp(App).mount('#app')

const app = createApp(App)
app.mount('#app')
app.use(router)
app.config.globalProperties.$axios = axios
