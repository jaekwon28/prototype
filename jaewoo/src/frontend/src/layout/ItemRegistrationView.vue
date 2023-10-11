<template>
    <div class="box1">
        <div class="accordion">
            <input type="radio" name="accordion" id="menu01">
            <label for="menu01">물품관리</label>
            <div>
                <p><router-link class="nav-link" to="/itemadd">물품등록</router-link></p>
            </div>
            <input type="radio" name="accordion" id="menu02">
            <label for="menu02">계정관리</label>
            <div>
                <p><router-link class="nav-link" to="/management">계정관리</router-link></p>
            </div>
        </div>
    </div>
    <div id="box2">
        <div id="center">
            <form v-on:submit="additem" class="addform">
                <div class="regform">
                    <div> 
                        <label for="productnum" class="form-label"></label>
                        <input type="text" class="form-control" id="productnum" v-model="productnum" placeholder="물품 번호">
                    </div>
                    <div>
                        <label for="productname" class="form-label"></label>
                        <input type="text" class="form-control" id="productname" v-model="productname" placeholder="물품 이름">
                    </div>
                    <div>
                        <label for="price" class="form-label"></label>
                        <input type="text" class="form-control" id="price" v-model="price" placeholder="물품 가격">
                    </div>
                    <div>
                        <select v-model="categoryid">
                            <option v-for="category in categoryList" :value="category.value" v-bind:key="category"
                                id="selectbox">{{ category.text }}</option>
                        </select>
                    </div>
                </div>
                <button type="submit">등록</button>
            </form>
        </div>
    </div>
</template>

<script>
import axios from 'axios'
export default {
    name: "ItemaddView",
    data() {
        return {
            categoryList: [
                {
                    text: "카테고리를 선택하세요",
                    value: "0"
                },
                {
                    text: "식품",
                    value: "1"
                },
                {
                    text: "애견용품",
                    value: "2"
                },
                {
                    text: "전자기기",
                    value: "3"
                },
                {
                    text: "가구",
                    value: "4"
                }
            ]
        }
    },
    methods: {
        additem: function () {
            axios.post("/api/item/add", {
                productnum: this.productnum,
                productname: this.productname,
                price: this.price,
                categoryid: this.categoryid
            }).then(res => {
                console.log(res)
            }).catch(err => {
                console.log(err)
            })
        }
    }
}


</script>

<style>
.box1 {
    width: 20%;
    height: 600px;
    float: left;
    background-color: aqua;
}

#box2 {
    width: 80%;
    height: 600px;
    float: right;
    background-color: #fff;
}

input[id*="menu"] {
    display: none;
}

input[id*="menu"]+label {
    display: block;
    padding: 20px;
    border: 1px solid #232188;
    color: #fff;
    font-weight: 900;
    background: #3634a5;
    cursor: pointer;
}

input[id*="menu"]+label+div {
    max-height: 0;
    transition: all .35s;
    overflow: hidden;
    background: #ebf8ff;
    font-size: 15px;
}

input[id*="menu"]+label+div p {
    display: inline-block;
    padding: 20px;
}

input[id*="menu"]:checked+label+div {
    max-height: 100px;
}

.form-control {
    width: 400px;
}

.addform {
    text-align: center;
    width: 40%;
}

#center {
    display: inline-block;
    text-align: center;
}
</style>