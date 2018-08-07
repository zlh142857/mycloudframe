var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');
var request = require("request");
var fs = require("fs");
var http = require("http");


var indexRouter = require('./routes/index');
var pdts = require('./routes/product');
var welcomeRouter = require("./routes/welcome")
var add_personnelRouter = require("./routes/add_personnel");
var entryandexit_infoRouter = require("./routes/entryandexit_information");
var entryandexit_registRouter = require("./routes/entryandexit_registration");
var device_registRouter = require("./routes/device_register");
var device_tableRouter = require("./routes/device_dense_table");
var curriculum_detailsRouter = require("./routes/curriculum_details");
var curriculum_registerRouter = require("./routes/curriculum_register");
var device_administrationRouter = require("./routes/device_administration");
var device_denseRouter = require("./routes/device_dense_register");
var file_tableRouter = require("./routes/file_table");
var file_registerRouter = require("./routes/file_table_register");


var app = express();

//指定视图引擎为ejs
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'ejs');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));
app.use(express.static(__dirname + '/public'));

app.use('/', indexRouter);
app.use('/pdt', pdts);
app.use("/welcome", welcomeRouter);
app.use("/add_personnel", add_personnelRouter);
app.use("/entryandexit_information", entryandexit_infoRouter);
app.use("/entryandexit_registration", entryandexit_registRouter);
app.use("/device_register", device_registRouter);
app.use("/curriculum_details", curriculum_detailsRouter);
app.use("/curriculum_register", curriculum_registerRouter);
app.use("/device_administration", device_administrationRouter);
app.use("/device_dense_register", device_denseRouter);
app.use("/device_dense_table", device_tableRouter);
app.use("/file_table", file_tableRouter);
app.use("/file_table_register", file_registerRouter);



// catch 404 and forward to error handler
app.use(function (req, res, next) {
  next(createError(404));
});

// error handler
app.use((err, req, res, next) => {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});




module.exports = app;
