<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="pt-br" contentType="text/html; charset=utf-8">
<head>
    <!-- Bootstrap Core CSS -->
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" >
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../resources/css/contratante.css" rel="stylesheet"/>
    <link href="../resources/css/form_style.css" rel="stylesheet"/>

</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container" id="cabecalho">
            <a class="navbar-brand" href="#">Hades - Sistema Funerário</a>
            <p class="navbar-text navbar-right">Usuário: <a href="#" class="navbar-link">João da Silva</a></p>
        </div>
    </nav>
    <div class="caixa_barra_progresso" id="barra_de_progresso">
       <ul class="barra_progresso"> 
            <li class="visited first">
                <a href="#">Entrar</a>
            </li>
            <li class="previous visited">Filtro</li>
            <li class="active">Cadastro de Contratante</li>
            <li class="next">Cadastro do Falecido</li>
            <li class="">Pagamento</li>
        </ul>
    </div>
    <form action="salvar" method="POST">
	    <div class="container" id="formulario-dados-pessoais">
	        <div class="row col-md-12">
	            <div class="col-md-12">
	                <div class="shadow">
	                    <div class="over-shadow">
	                        <div id="dadosPessoais">
	                            <h1 class="titulo_caixa">Dados pessoais</h1>
	                           		<div class="row">
	                                    <div class="col-md-6 col-xs-12">
	                                    	<form:errors path="*" />
	                                        <div class="form-group">
	                                            <label>CPF</label>
	                                            <input class="form-control " name="cpf" id="cpf" onblur="buscaPorCpf()" placeholder="CPF" onkeypress="mascara(this,cpf)" maxlength="14">
	                                        </div>
	                                    </div>                             
	                                </div>
	                                <div class="row">
	                                    <div class="col-sm-12">
	                                        <div class="form-group">
	                                            <label>Nome completo</label>
	                                            <input  class="form-control" name="nomeCompleto" id="nomeCompleto" placeholder="Nome Completo">
	                                        </div>
	                                    </div>                        
	                                </div>
	                                <div class="row">
	                                    <div class="col-md-4">
	                                        <div class="form-group">
	                                            <label>RG</label>
	                                            <input  class="form-control" name="rg" id="rg" placeholder="RG">
	                                        </div>
	                                    </div>
	                                    <div class="col-sm-8">
	                                        <div class="form-group">
	                                            <label>Nome da mãe</label>
	                                            <input  class="form-control" name="nomeMae" id="nomeMae"  placeholder="Nome da mãe">
	                                        </div>
	                                    </div>                                
	                                </div>
	                                <div class="row">
	                                    <div class="col-sm-6">
	                                        <div class="form-group">
	                                            <label>Profissão</label>
	                                            <input  class="form-control" name="profissao" id="profissao" placeholder="Profissão">
	                                        </div>
	                                    </div>
	                                    <div class="col-sm-6">
	                                        <div class="form-group">
	                                            <label>Parentesco</label>
	                                            <input  class="form-control" name="grauParentesco" id="grauParentesco"  placeholder="Parentesco">
	                                        </div>
	                                    </div>
	                                </div>
	                        </div>
	                    </div>
	                </div>
	            </div>    
	        </div>
	        <div class="row col-md-12">
	            <div class="col-md-8">
	                <div class="shadow">
	                    <div class="over-shadow">
	                        <h1 class="titulo_caixa">Endereço</h1>
	                            <div class="row">
	                                <div class="col-sm-6">
	                                    <div class="form-group">
	                                        <label>CEP</label>
	                                        <input  class="form-control" name="cep" id="cep"  placeholder="CEP" onkeypress="mascara(this,cep)" maxlength="9">
	                                    </div>
	                                </div>
	                            </div>
	                            <div class="row">
	                                <div class="col-sm-5">
	                                    <div class="form-group">
	                                        <label>Endereço</label>
	                                        <input  class="form-control" name="endereco" id="endereco" placeholder="Endereço">
	                                    </div>
	                                </div>
	                                <div class="col-sm-2">
	                                    <div class="form-group">
	                                        <label>Número</label>
	                                        <input type="number" class="form-control" name="numeroEndereco" id="numeroEndereco" placeholder="nº">
	                                    </div>
	                                </div>
	                                <div class="col-sm-5">
	                                    <div class="form-group">
	                                        <label>Complemento</label>
	                                        <input  class="form-control" name="complementoEndereco" id="complementoEndereco" placeholder="Complemento">
	                                    </div>
	                                </div>
	                            </div>
	                            <div class="row">
	                                <div class="col-sm-5">
	                                    <div class="form-group">
	                                        <label>Bairro</label>
	                                        <input  class="form-control" name="bairro" id="bairro" placeholder="Bairro">
	                                    </div>
	                                </div>
	                                <div class="col-sm-5">
	                                    <div class="form-group">
	                                        <label>Cidade</label>
	                                        <input  class="form-control" name="cidade" id="cidade" placeholder="Cidade">
	                                    </div>
	                                </div>
	                                <div class="col-sm-2">
	                                    <div class="form-group">
	                                        <label>UF</label>
	                                        <select name="estado" id="estado" class="form-control">
	                                        <!--Adicionar estados com o controler-->
	                                            <option>AC</option>
	                                            <option>AL</option>
	                                            <option>AM</option>
	                                            <option>AP</option>
	                                            <option>BA</option>
	                                            <option>CE</option>
	                                            <option>DF</option>
	                                            <option>ES</option>
	                                            <option>GO</option>
	                                            <option>MA</option>
	                                            <option>MG</option>
	                                            <option>MS</option>
	                                            <option>MT</option>
	                                            <option>PA</option>
	                                            <option>PB</option>
	                                            <option>PE</option>
	                                            <option>PI</option>
	                                            <option>PR</option>
	                                            <option>RJ</option>
	                                            <option>RN</option>
	                                            <option>RO</option>
	                                            <option>RR</option>
	                                            <option>RS</option>
	                                            <option>SC</option>
	                                            <option>SE</option>
	                                            <option>SP</option>
	                                            <option>TO</option>
	                                        </select>
	                                    </div>
	                                </div>
	                            </div>
	                    </div>
	                </div>
	            </div>
	            <div class="col-md-4">
	                <div class="shadow">
	                    <div class="over-shadow">
	                        <h1 class="titulo_caixa">Contatos</h1>
	                            <div class="row">
	                                <div class="col-sm-12">
	                                    <div class="form-group">
	                                        <label>Tel Residencial</label>
	                                        <input  class="form-control" name="telResidencial" id="telResidencial" placeholder="Tel Residencial" onkeypress="mascara(this,telefone)" maxlength="15">
	                                    </div>
	                                </div>
	                            </div>
	                            <div class="row">
	                                <div class="col-sm-12">
	                                    <div class="form-group">
	                                        <label>Tel Celular</label>
	                                        <input  class="form-control" name="telCelular" id="telCelular"  placeholder="Tel Celular" onkeypress="mascara(this,telefone)" maxlength="15">
	                                    </div>
	                                </div>
	                            </div>
	                            <div class="row">
	                                <div class="col-sm-12">
	                                    <div class="form-group">
	                                        <label>Email</label>
	                                        <input type="email" class="form-control" name="email" id="email" placeholder="Email">
	                                    </div>
	                                </div>
	                            </div>
	                    </div>
	                </div>
	            </div>
	        </div>
	        <div class="row col-md-12" id="botoes-navegacao">
	            <div class="col-xs-12">
	                <button type="button" class="col-xs-1 btn btn-default" style="visibility:hidden"><span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span></button>
	                <button type="button" class="col-xs-offset-4 col-xs-2 btn btn-default">Cancelar</button>
	                <input type="submit" class="col-xs-offset-4 col-xs-1 btn btn-default"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></button>
	            </div>
	        </div>
	    </div>
    </form>
</body>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script type="text/javascript" src="https://raw.github.com/digitalBush/jquery.maskedinput/1.3.1/dist/jquery.maskedinput.min.js"></script>
<script type="text/javascript" src="../resources/js/contratante.js"></script>
</html>