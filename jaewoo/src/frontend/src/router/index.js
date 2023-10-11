import { createRouter, createWebHistory } from "vue-router";

import LoginView from '@/pages/LoginView.vue'
import JoinView from '@/pages/JoinView.vue'
import ItemaddView from '@/pages/ItemaddView.vue'
import ItemRegistration from '@/layout/ItemRegistrationView.vue'
import AccountManager from '@/layout/AccountManagerView.vue'


const router = createRouter({
    history: createWebHistory(),
    routes: [
        { path: '/login', component: LoginView },
        { path: '/join', component: JoinView },
        { path: '/add', component: ItemaddView },
        { path: '/itemadd', component: ItemRegistration },
        { path: '/management', component: AccountManager }
    ]
})

export default router;