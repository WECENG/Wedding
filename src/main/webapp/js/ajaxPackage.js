/*Ajax 封装*/

/*option对象的属性
 *
 * url:请求的路径
 * data:请求的参数（可以是字符串格式，如果用jquery，也可以是对象）
 * method:请求方式（get或post)
 * success():回调函数，返回获取的数据供前端使用。
 * */

/*使用格式
 *
 *
 * ajax(option{
 * 	url:"XXXXXXXXX"
 * 	data:"name=value&name==value...."
 * 	method:"post or get"
 *     success:function(){}
 * })
 *
 * 对象属性顺序随意
 *
 */
function ajax(option){
    //创建请求对象
    var xhr=new XMLHttpRequest();
    //请求行
    if(option.method=="get"&&option.data){
        option.url+="?";
        option.url+=option.data;
        option.data=null;				//为了下面send(data)
    }
    xhr.open(option.method, option.url,true);
    //设置请求头
    if(option.method=="post"&&option.data){
        xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    }

    //回调函数
    xhr.onreadystatechange=function(){
        if(xhr.readyState==4&&xhr.status==200){
            var type=xhr.getResponseHeader("content-type");
            //返回的数据类型为json
            if(type.indexOf("json")!=-1){
                option.success(JSON.parse(xhr.responseText));
            }
            //返回的数据类型为xml
            else if(type.indexOf("xml")!=-1){
                option.success(xhr.responseXML);
            }
            //返回的数据类型为普通字符串
            else{
                option.success(xhr.responseText);
            }
        }
    }
    //请求主体
    xhr.send(option.data);

}