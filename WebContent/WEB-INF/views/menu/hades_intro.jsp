<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="pt-br" contentType="text/html; charset=utf-8">
<head>
	<!-- Bootstrap Core CSS -->
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8" >
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet"/>
	<link href="../../../resources/css/hades_intro.css" rel="stylesheet"/>
    <link href="../../../resources/css/form_style.css" rel="stylesheet"/>

</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container" id="cabecalho">
			<a class="navbar-brand" href="#">ServiÃ§o</a>
            <p class="navbar-text navbar-right">UsuÃ¡rio: <a href="#" class="navbar-link">JoÃ£o da Silva</a></p>
        </div>
    </nav>
    <div class="container" id="intro_caixa_pagina">
    	<div class="row">
            <div class="col-md-6" id="caixa_coluna">
                <div class="shadow">
                    <div class="over-shadow">
                        <div id ="titulo_caixa">
                            <h1>Tipo de OperaÃ§Ã£o</h1>
                        </div>
                        <div id="intro_caixa_botoes">
					    	<button type="button" id="pago" class="btn btn-block" style="margin-top:10%;">1. <b><u>P</u></b>ago</button>
							<button type="button" id="gratuito" class="btn btn-block" style="margin-top:5%;">2. <b><u>G</u></b>ratuito</button>
							<button type="button" id="registro_de_obito" class="btn btn-block" style="margin-top:5%;margin-bottom:5%;">3. <b><u>R</u></b>egistro de Ãbito</button>
					    </div>
                        <div id="caixa_btn_cancelar_ant">
                            <button type="button" id="cancelar" href="" class="btn btn-default">Cancelar</button>
                        </div>
                    </div>
                </div>
            </div>    
        </div>    	
    </div>
</body>
   	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
    <script type="text/javascript" src="../../../resources/js/hades_intro.js"></script>
</html>