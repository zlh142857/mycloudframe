var express = require('express');
var router = express.Router();

/* GET device_register page. */
router.get('/', function(req, res, next) {
  res.render('curriculum_register');
});

module.exports = router;
