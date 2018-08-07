$('#example').DataTable({
    "paging": true,
    "lengthChange": true,
    "searching": true,
    "ordering": true,
    "info": true,
    "autoWidth": false,
    "lengthMenu": [5, 10, 20, 50],//表格行数选择框内数目 显示2条,4条,20条,50条
    "displayLength": "10",//默认的显示行数 (也就是每页显示几条数据)
    "language": {//自定义语言提示
        "processing": "处理中...",
        "lengthMenu": "显示 _MENU_ 项结果",
        "zeroRecords": "没有找到相应的结果",
        "info": "第 _START_ 至 _END_ 行，共 _TOTAL_ 行",
        "infoEmpty": "第 0 至 0 项结果，共 0 项",
        "infoFiltered": "(由 _MAX_ 项结果过滤)",
        "infoPostFix": "",
        "search": "搜索：",
        "searchPlaceholder": "请输入要搜索内容...",
        "url": "",
        "thousands": "'",
        "emptyTable": "表中数据为空",
        "loadingRecords": "载入中...",
        "infoThousands": ",",
        "paginate": {
            "first": "首页",
            "previous": "上页",
            "next": "下页",
            "last": "末页"
        }
    }
});