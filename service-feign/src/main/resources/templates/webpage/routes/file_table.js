var express = require('express');
var router = express.Router();

/* GET welcome page. */
router.get('/', function(req, res, next) {
  var filetable = [
    {id:1,name: "北京xxx局", year: "2018", writing: "2018-3-5", level: "1", pages: "无",titles:"重要文件一",original:"是",copies:"3"},
    {id:1,name: "上海xxx局", year: "2017", writing: "2013-9-12", level: "3", pages: "无",titles:"重要文件二",original:"否",copies:"15" },
    {id:1,name: "天津xxx局", year: "2018", writing: "2016-5-3", level: "2", pages: "无",titles:"重要文件三",original:"是",copies:"30" }
  ]
  res.render('file_table',{title:"文件信息表",files:filetable});
});

module.exports = router;
