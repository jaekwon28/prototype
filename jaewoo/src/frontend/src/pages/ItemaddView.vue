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
    <div class="box2">

    </div>
</template>

<script>
export default {
    name: "ItemaddView"
}
</script>

<style>
.box1 {
    width: 20%;
    float: left;
    background-color: aqua;
}

.box2 {
    width: 80%;
    float: right;
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
}</style>