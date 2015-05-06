<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
    <!-- Bootstrap Core CSS -->
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" >
    <link href="../resources/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../resources/css/barra_progresso.css" rel="stylesheet"/>
    <link href="../resources/css/contratante.css" rel="stylesheet"/>
    <link href="../resources/css/form_style.css" rel="stylesheet"/>
</head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container" id="cabecalho">
            <a class="navbar-brand" href="#">Serviço</a>
            <p class="navbar-text navbar-right">Usuário: <a href="#" class="navbar-link">João da Silva</a></p>
        </div>
    </nav>
    <div class="caixa_barra_progresso" id="barra_de_progresso">
       <ul class="barra_progresso">
            <li class="visited first previous col-sm-2">Filtro de Processos</li>
            <li class="active col-sm-2">Cadastro de Contratante</li>
            <li class="next col-sm-2">Cadastro de Falecido</li>
            <li class="col-sm-2">Dados do Óbito</li>
            <li class="col-sm-2">Escolha de Produtos</li>
            <li class="col-sm-2">Emissão de Notas</li>
        </ul>
    </div>
    <form action="salvar" method="post">
		<div class="container" id="formulario-dados-pessoais">
			<form:errors path="*" />
			<div class="row col-md-12">
            	<div class="col-md-12">
            	    <div class="shadow">
            	        <div class="over-shadow">
                	        <div id="dadosPessoais">
                            <h1 class="titulo_caixa">Dados pessoais</h1>
					  	      	<div class="row">
                                    <div class="col-md-6 col-xs-12">
                                        <div class="form-group">
                                            <label>CPF</label>
                                            <input type="text" class="form-control" id="cpf" name="cpf" onblur="buscaPorCpf()" placeholder="CPF" onkeypress="mascara(this,cpf_mask)" maxlength="14">
                                        </div>
                                    </div>                             
                                </div>
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Nome completo</label>
                                            <input type="text" class="form-control" name="nomeCompleto" id="nomeCompleto" placeholder="Nome Completo">
                                        </div>
                                    </div>                        
                                </div>
                                <div class="row">
                                    <div class="col-md-4">
                                        <div class="form-group">
                                            <label>RG</label>
                                            <input type="text" class="form-control" name="rg" id="rg" placeholder="RG">
                                        </div>
                                    </div>
                                    <div class="col-sm-8">
                                        <div class="form-group">
                                            <label>Nome da mãe</label>
                                            <input type="text" class="form-control" name="nomeMae" id="nomeMae" placeholder="Nome da mãe">
                                        </div>
                                    </div>                                
                                </div>
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Profissão</label>
                                            <input type="text" class="form-control" name="profissao" id="profissao" placeholder="Profissão">
                                        </div>
                                    </div>
                                    <div class="col-sm-6">
                                        <div class="form-group">
                                            <label>Parentesco</label>
                                            <input type="text" class="form-control" name="grauParentesco" id="grauParentesco" placeholder="Parentesco">
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
                                        <input type="text" class="form-control" name="cep" id="cep" placeholder="CEP" onkeypress="mascara(this,cep_mask)" maxlength="9">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-5">
                                    <div class="form-group">
                                        <label>Endereço</label>
                                        <input type="text" class="form-control" name="endereco" id="endereco" placeholder="Endereço">
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
                                        <input type="text" class="form-control" name="complementoEndereco" id="complementoEndereco" placeholder="Complemento">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-5">
                                    <div class="form-group">
                                        <label>Bairro</label>
                                        <input type="text" class="form-control" name="bairro" id="bairro" placeholder="Bairro">
                                    </div>
                                </div>
                                <div class="col-sm-5">
                                    <div class="form-group">
                                        <label>Cidade</label>
                                        <input type="text" class="form-control" name="cidade" id="cidade" placeholder="Cidade">
                                    </div>
                                </div>
                                <div class="col-sm-2">
                                    <div class="form-group">
                                        <label>UF</label>
                                        <select class="form-control" name="estado" id="estado">
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
                                        <input type="text" class="form-control" name="telResidencial" id="telResidencial" placeholder="Tel Residencial" onkeypress="mascara(this,telefone)" maxlength="15">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <label>Tel Celular</label>
                                        <input type="text" class="form-control" name="telCelular" id="telCelular" placeholder="Tel Celular" onkeypress="mascara(this,telefone)" maxlength="15">
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
                    <input type="button" class="col-xs-1 btn btn-default" style="visibility:hidden"><span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span></input>
                    <input type="button" class="col-xs-offset-4 col-xs-2 btn btn-default">Cancelar</input>
                    <input class="col-xs-offset-4 col-xs-1 btn btn-default" value="Próximo" type="submit"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></input>
                </div>
            </div>
		</div>
	</form>
</body>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script type="text/javascript" src="https://raw.github.com/digitalBush/jquery.maskedinput/1.3.1/dist/jquery.maskedinput.min.js"></script>
<script type="text/javascript" src="../resources/js/contratante.js"></script>
<script type="text/javascript" src="../resources/js/Util.js"></script>
</html>