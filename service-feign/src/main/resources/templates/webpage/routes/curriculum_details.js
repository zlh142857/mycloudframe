var express = require('express');
var router = express.Router();

/* GET curriculum_details page. */
router.get('/', function(req, res, next) {
  var curriculum = [
    {id:1,name: "机要项目培训1", time: "一小时", local: "视频授课模式", teacher: "机要领导", remarks: "无" },
    {id:2,name: "机要项目培训2", time: "二小时", local: "视频授课模式", teacher: "机要负责人", remarks: "无" },
    {id:3,name: "机要项目培训3", time: "一个半小时", local: "视频授课模式", teacher: "机要大神", remarks: "无" }
  ]
  res.render('curriculum_details',{title:"培训课程管理",curr:curriculum});
});

module.exports = router;
