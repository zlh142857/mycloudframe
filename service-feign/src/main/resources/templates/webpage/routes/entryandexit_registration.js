var express = require('express');
var router = express.Router();

/* GET welcome page. */
router.get('/', function(req, res, next) {
  res.render('entryandexit_registration');
});

module.exports = router;
