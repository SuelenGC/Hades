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
    return v
}
function cep(v){
    v=v.replace(/\D/g,"")       
    v=v.replace(/(\d{5})(\d{1,3})$/,"$1-$2")
    return v
}
function telefone(v){
    v=v.replace(/\D/g,"")                   
    v=v.replace(/(\d{2})(\d)/,"($1) $2")       
    v=v.replace(/(\d{4,5})(\d{4})/,"$1-$2")                                            
    return v
}