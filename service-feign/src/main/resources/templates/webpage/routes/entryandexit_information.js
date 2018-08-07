var express = require('express');
var router = express.Router();

/* GET welcome page. */
router.get('/', function(req, res, next) {
  var information = [
    {id:1, name: "张三", department: "公安部", go_ountry: "美国", reason: "出差", involvement: "是",process:"-----",go_date:"2018-2-5",rerurn_date:"2019-2-3" },
    {id:2, name: "打圣地", department: "国安部", go_ountry: "英国", reason: "旅游", involvement: "是",process:"-----",go_date:"2018-2-5",rerurn_date:"2019-2-3" },
    {id:3, name: "西蓝花", department: "城管部", go_ountry: "德国", reason: "出差", involvement: "是",process:"-----",go_date:"2018-2-5",rerurn_date:"2019-2-3" },
    {id:4, name: "犀牛皮", department: "税务局", go_ountry: "西班牙", reason: "公式", involvement: "否",process:"-----",go_date:"2018-2-5",rerurn_date:"2019-2-3" },
    {id:5, name: "芙蓉王", department: "国企", go_ountry: "阿莱西亚", reason: "忙", involvement: "是",process:"-----",go_date:"2018-2-5",rerurn_date:"2019-2-3" },
    {id:6, name: "煊赫门", department: "百度", go_ountry: "印度", reason:"私事" , involvement: "是",process:"-----",go_date:"2018-2-5",rerurn_date:"2019-2-3" },
    {id:7, name: "天台县", department: "阿里巴巴", go_ountry: "非洲", reason: "工作", involvement: "是",process:"-----",go_date:"2018-2-5",rerurn_date:"2019-2-3" },
    {id:8, name: "丝绸", department: "萨瓦迪卡", go_ountry: "韩国", reason: "合作", involvement: "是",process:"-----",go_date:"2018-2-5",rerurn_date:"2019-2-3" },
    {id:9, name: "怕怕呦", department: "公安部", go_ountry: "朝鲜", reason: "你猜", involvement: "是",process:"-----",go_date:"2018-2-5",rerurn_date:"2019-2-3" }
  ]
  res.render('entryandexit_information',{title:"出入境人员信息",infos:information});
});

module.exports = router;
