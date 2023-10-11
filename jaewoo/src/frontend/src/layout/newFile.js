import axios from 'axios';
import $ from 'jquery';

export default (await import('vue')).defineComponent({
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
};
},
methods: {
additem: function () {
axios.post("/api/item/add", {
productnum: this.productnum,
productname: this.productname,
price: this.price,
categoryid: this.categoryid
}).then(res => {
console.log(res);
}).catch(err => {
console.log(err);
});
}
},
const: readInputFile = (e) => {
$('#imagePreview').empty();
}
});
