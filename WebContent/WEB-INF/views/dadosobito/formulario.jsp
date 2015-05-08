
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
    <!-- Bootstrap Core CSS -->
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" >
    <link href="../../../resources/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../../../resources/css/barra_progresso.css" rel="stylesheet"/>
    <link href="../../../resources/css/contratante.css" rel="stylesheet"/>
    <link href="../../../resources/css/form_style.css" rel="stylesheet"/>
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
            <li class="visited first  col-sm-2">Filtro de Processos</li>
            <li class="visited col-sm-2">Cadastro de Contratante</li>
            <li class="previous visited col-sm-2">Cadastro de Falecido</li>
            <li class="active col-sm-2">Dados do Óbito</li>
            <li class="col-sm-2 next">Escolha de Produtos</li>
            <li class="col-sm-2">Emissão de Notas</li>
        </ul>
    </div>
    <form action="salvar" method="post">
		<div class="container" id="formulario-dados-pessoais">
			<form:errors path="*" />
			<div class="row col-md-6">
            	<div class="col-md-12">
            	    <div class="shadow">
            	        <div class="over-shadow">
                	        <div id="dadosPessoais">
                            <h1 class="titulo_caixa">Informações do Óbito</h1>
					  	      	<div class="row">
                                    <div class="col-sm-12">
                                        <div class="form-group">
                                            <label>Local do Falecimento</label>
                                            <input type="text" class="form-control" id="localFalecimento" name="localFalecimento" placeholder="Local do Falecimento">
                                        </div>
                                    </div>                      
                                </div>
                                <div class="row">
									<div class="col-sm-12">		
                                        <div class="form-group">
                                            <label>Cartório</label>
                                            <input type="text" class="form-control" id="cartorio" name="cartorio" placeholder="Cartório">
                                        </div>
                                    </div>  
                                </div>
                                <div class="row">
                                    <div class="col-sm-4">
                                        <div class="form-group">
                                            <label>Data de Falecimento</label>
                                            <input  class="form-control" name="dataFalecimento" id="dataFalecimento"  placeholder="01/01/1900" onkeypress="mascara(this,data_mask)">
                                        </div>
                                    </div>
                                    <div class="col-sm-3">
                                        <div class="form-group">
                                            <label>Hora de Falecimento</label>
                                            <input  class="form-control" name="horaFalecimento" id="horaFalecimento"  placeholder="00:00">
                                        </div>
                                    </div>
                                    <div class="col-sm-5">
                                        <div class="form-group" style="margin-top:11%">
                                            <label>PROAIM</label>
                                            <input  class="form-control" name="proaim" id="proaim"  placeholder="PROAIM">
                                        </div>
                                    </div>                       
                                </div>
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <label>Causa Mortis</label>
                                            <input type="text" class="form-control" name="causaMortis" id="causaMortis" placeholder="Causa Mortis">
                                        </div>
                                    </div>                            
                                </div>
                            </div>
                        </div>
					</div>
				</div>
			</div>
			<div class="row col-md-6">
                <div class="col-md-12">
                    <div class="shadow">
                        <div class="over-shadow">
                            <h1 class="titulo_caixa">Dados do Sepultamento</h1>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <label>Cemitério</label>
                                        <input type="text" class="form-control" name="cemiterio" id="cemiterio" placeholder="Cemitério">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <label>Endereço</label>
                                        <input type="text" class="form-control" name="endereco" id="endereco" placeholder="Endereço">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label>Data de Falecimento</label>
                                        <input  class="form-control" name="dataFalecimento" id="dataFalecimento"  placeholder="01/01/1900" onkeypress="mascara(this,data_mask)">
                                    </div>
                                </div>
                                <div class="col-sm-3">
                                    <div class="form-group">
                                        <label>Hora de Falecimento</label>
                                        <input  class="form-control" name="horaFalecimento" id="horaFalecimento"  placeholder="00:00">
                                    </div>
                                </div>                
                            </div>
                            <div class="row">
                                <div class="col-sm-7">
                                    <div class="form-group">
                                        <label>Médico</label>
                                        <input  class="form-control" name="medico" id="medico"  placeholder="Nome do Médico">
                                    </div>
                                </div>
                                <div class="col-sm-5">
                                    <div class="form-group">
                                        <label>CRM</label>
                                        <input  class="form-control" name="crm" id="crm"  placeholder="CRM">
                                    </div>
                                </div>                
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row col-md-12">
                <div class="col-md-12">
                    <div class="shadow">
                        <div class="over-shadow">
                            <h1 class="titulo_caixa">Observações</h1>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <input type="text" class="form-control" name="observaçoes" id="observaçoes" 
                                         placeholder="Observações">
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
<script type="text/javascript" src="../../../resources/js/contratante.js"></script>
<script type="text/javascript" src="../../../resources/js/Util.js"></script>
</html>