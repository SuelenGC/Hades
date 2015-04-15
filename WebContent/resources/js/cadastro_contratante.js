function mascara(o,f){
    v_obj=o
    v_fun=f
    setTimeout("execmascara()",1)
}

function execmascara(){
    v_obj.value=v_fun(v_obj.value)
}
 function cpf(v){
    v=v.replace(/\D/g,"")                   
    v=v.replace(/(\d{3})(\d)/,"$1.$2")       
    v=v.replace(/(\d{3})(\d)/,"$1.$2")                                            
    v=v.replace(/(\d{3})(\d{1,2})$/,"$1-$2")
    //v=v.replace(/(\d{3}\.){3}-(\d{1,2})(.*)$/,"$1$2")
    return v
}
function rg(v){
    v=v.replace(/[^0-9X]/g,"")                   
    return v
}