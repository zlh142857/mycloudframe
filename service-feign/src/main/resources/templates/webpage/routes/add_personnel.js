var express = require('express');
var router = express.Router();


router.get('/',  (req, res, next)=> {
  //将product视图与指定的对象渲染后输出到客户端
  res.render('add_personnel');
});



module.exports = router;