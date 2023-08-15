import { createRouter, createWebHistory } from "vue-router";

import LoginView from '@/pages/LoginView.vue'
import JoinView from '@/pages/JoinView.vue'

const router = createRouter({
    history: createWebHistory(),
    routes: [
        { path: '/login', component: LoginView },
        { path: '/join', component: JoinView }
    ]
})

export default router;