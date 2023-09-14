var u_name=document.getElementById("username");
var uname_icon=document.getElementById("uicon");
var password=document.getElementById("pwd");
var password_icon=document.getElementById("picon");

u_name.addEventListener("keypress",function(){
    uname_icon.style.color="#0ef";
});

password.addEventListener("keypress",function(){
    password_icon.style.color="#0ef";
});

function validateForm(form){
    var uvalue=form.username.value;
    var pvalue=form.pwd.value;
    if(uvalue==""){
        u_name.classList.add('placeholder-class');
        uname_icon.style.color="red";
        return false;
    }

    if(pvalue==""){
        password.classList.add('placeholder-class');
        password_icon.style.color="red";
        return false;
    }

    fetch("./vendors.json")
    .then((res)=>res.json())
    .then(function(data1){
       for(let i=0;i<data1.vendors.length;i++){
        var u=data1.vendors[i].name;
        var p=data1.vendors[i].pwd;

        if(uvalue==u && pvalue==p){
            window.location.replace("vendor.html");
            return false;
        }
       }
       alert("Invalid username or password");
    })
    return false;
}