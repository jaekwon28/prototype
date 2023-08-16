<template>
    <div class="card card-body">
        <form v-on:submit="joinaction" class="join">
            <div class="joinform">
                <div>
                    <label for="id" class="form-label"></label>
                    <input type="text" class="form-control" id="id" v-model="id" placeholder="아이디를 입력해주세요">
                </div>
                <div>
                    <label for="password" class="form-label"></label>
                    <input type="text" class="form-control" id="password" v-model="password" placeholder="비밀번호를 입력해주세요">
                </div>
                <div>
                    <label for="name" class="form-label"></label>
                    <input type="text" class="form-control" id="name" v-model="name" placeholder="이름을 입력해주세요">
                </div>
                <div>
                    <label for="telnum" class="form-label"></label>
                    <input type="text" class="form-control" id="telnum" v-model="telnum" placeholder="010-1111-1111">
                </div>
                <div>
                    <label for="email" class="form-label"></label>
                    <input type="email" class="form-control" id="email" v-model="email" placeholder="test@gmail.com">
                </div>
                <div class="genderbtn">
                    <label for="gender">남성</label>
                    <input type="radio" name="radio" v-model="gender" value="남성">
                    <label for="gender">여성</label>
                    <input type="radio" name="radio" v-model="gender" value="여성">
                </div>
            </div>
            <button type="submit">회원가입</button>
        </form>
    </div>
</template>

<script>
import axios from 'axios';

export default {
    name: "JoinView",
    methods: {
        joinaction:function(){
            axios.post("/api/user/join", {
                id: this.id,
                password: this.password,
                name: this.name,
                telnum: this.telnum,
                email: this.email,
                gender: this.gender
            }).then(res => {
                console.log(res)
            }).catch(err => {
                console.log(err)
            })
            this.$router.replace('/login')
        }
    } 
}
</script>

<style>
.card {
    text-align: center;
}

.joinform {
    border-color: black;
    width: 30%;
    margin-left: 35%;
}

/* label {
  font-size: 18px;
  line-height: 2rem;
  padding: 0.2em 0.4em;
} */

[type="radio"],
span {
    vertical-align: middle;
}

[type="radio"] {
    appearance: none;
    border: max(2px, 0.1em) solid gray;
    border-radius: 50%;
    width: 1.25em;
    height: 1.25em;
    transition: border 0.5s ease-in-out;
}

[type="radio"]:checked {
    border: 0.4em solid tomato;
}

[type="radio"]:focus-visible {
    outline-offset: max(2px, 0.1em);
    outline: max(2px, 0.1em) dotted tomato;
}

[type="radio"]:hover {
    box-shadow: 0 0 0 max(4px, 0.2em) lightgray;
    cursor: pointer;
}

[type="radio"]:hover+span {
    cursor: pointer;
}

[type="radio"]:disabled {
    background-color: lightgray;
    box-shadow: none;
    opacity: 0.7;
    cursor: not-allowed;
}

[type="radio"]:disabled+span {
    opacity: 0.7;
    cursor: not-allowed;
}

/* Global CSS */
fieldset {
    display: flex;
    justify-content: center;
    border: none;
    margin: 0;
    padding: 40px 20px;
}

*,
*::before,
*::after {
    box-sizing: border-box;
}
</style>