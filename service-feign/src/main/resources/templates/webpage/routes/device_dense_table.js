var express = require('express');
var router = express.Router();

/* GET device_register page. */
router.get('/', function(req, res, next) {
    var deviceTable=[
        {id:1, network: "局域网", equipment: "三号打印机", num: "15", positions: "海淀", files: "文件",remarks:"并非机密文件" },
        {id:2, network: "国家内网", equipment: "二号打印机", num: "23", positions: "朝阳", files: "文件2",remarks:"备注哦22"  },
        {id:3, network: "电网", equipment: "机密文件机", num: "13", positions: "昌平", files: "文件3",remarks:"备注哦333"  },
    ]
  res.render('device_dense_table',{title:"设备信息管理",devs:deviceTable});
});

module.exports = router;
