var express = require('express');
var router = express.Router();


/* GET welcome page. */
router.get('/', function(req, res, next) {
  var products = [
    {id:1, name: "张三",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"},
    {id:2, name: "李四",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"},
    {id:3, name: "马库斯",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"},
    {id:4, name: "张飞天",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"},
    {id:5, name: "张飞",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"},
    {id:6, name: "关羽",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"},
    {id:7, name: "曹操",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"},
    {id:8, name: "刘邦",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"},
    {id:9, name: "项羽",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"},
    {id:10, name: "孙尚香",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"},
    {id:11, name: "诸葛",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"},
    {id:12, name: "玛瑙",sex: "男",place_brith: "山西", nation: "汉", nativeplace:"北京",healthy:"健康",date_brith:"1985-5-12",join_party:"1999-5-30",date_work:"2003-2-15",education:"本科",school:"北京大学",duty_now:"程序猿",major:"计算机"}
    
  ]
  res.render('product',{title:"出入境人员信息",data:products});
});


module.exports = router;