var express = require('express');
var router = express.Router();

/* GET device_administration page. */
router.get('/', function(req, res, next) {
  var device = [
    {id:1, network: "以太网", equipment: "一号打印机", num: "1", positions: "北京", files: "文件",remarks:"备注哦1" },
    {id:2, network: "因特网", equipment: "碎纸机", num: "2", positions: "山西", files: "文件2",remarks:"备注哦22"  },
    {id:3, network: "无线网", equipment: "机密文件机", num: "3", positions: "天津", files: "文件3",remarks:"备注哦333"  },
  ]
  res.render('device_administration',{title:"设备信息管理",devs:device});
});

module.exports = router;
