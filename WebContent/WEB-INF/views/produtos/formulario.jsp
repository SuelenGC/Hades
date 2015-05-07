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
            <li class="visited first col-sm-2">Filtro de Processos</li>
            <li class="visited col-sm-2">Cadastro de Contratante</li>
            <li class="visited col-sm-2">Cadastro de Falecido</li>
            <li class="visited previous col-sm-2">Dados do Óbito</li>
            <li class="active col-sm-2">Escolha de Produtos</li>
            <li class="next col-sm-2">Emissão de Notas</li>
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
                            <h1 class="titulo_caixa">Produtos</h1>
					  	    <div class="row">
                                <div class="col-md-12">
                                   <table class="table">
                                     	<thead>
                                     		<tr>
	                                     		<th colspan="2">Itens</th>
	                                     		<th>Dimensões</th>
	                                     		<th>QTD</th>
	                                     		<th>UDM</th>
	                                     		<th>Valor do Conj.</th>
	                                     		<th>Disponib. em Estoque</th>
	                                     	</tr>
                                     	</thead>
                                     	<tbody>
                                     		<tr>
                                     			<th>Urna:</th>
                                     			<td>Urna fixa</td>
												<td>
													<select class="form-control" name="estado" id="estado">
														<option>2,00x0,60x0,40</option>
														<option>1,90x0,60x0,40</option>
													</select>
												</td>
												<td>1</td>
												<td>PA</td>
												<!-- banco traz valor pra gente s2 -->
												<td name="valorUrna">PA</td>
												<td name="disponibilidadeUrna"><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
											</tr>
											<tr>
                                     			<th>Revestimento:</th>
                                     			<td>revestimento fixo</td>
												<td>
													<select class="form-control" name="dimensaoRevestimento" id="dimensaoRevestimento">
														<option>2,00x0,60x0,40</option>
														<option>1,90x0,60x0,40</option>
													</select>
												</td>
												<td>1</td>
												<td>PA</td>
												<!-- banco traz valor pra gente s2 -->
												<td name="valorRevestimento">PA</td>
												<td name="disponibilidadeRevestimento"><span class="glyphicon glyphicon-ok" aria-hidden="true"></span></td>
											</tr>
                                     	</tbody>
								   </table>
                                </div>                             
                           </div>   
                        </div>
					</div>
				</div>
			</div>
			<div class="row col-md-12">
               <div class="shadow">
                   <div class="over-shadow">
                       <h1 class="titulo_caixa">Taxa de Serviço</h1>
                       <table class="table">
                       	<thead>
                       		<tr>
                       			<td colspan="5">Serviço</td>
                       			<td>QTD</td>
                       			<td>Valor do Conj.</td>
                       		</tr>
                       	</thead>
                       	<tbody>
                       		<tr>
                       			<th>Tipo de sepultamento:</th>
                       			<td colspan="4">Qd. Geral Terra s/ Gaveta</td>
                       			<td></td>
                       			<td name="valorSepultamento">PA</td>
                       		</tr>
                       		<tr>
                       			<th rowspan="2">Transporte:</th>
                       			<td><input type="checkbox" value="carroCarreto" checked disabled></td>
                       			<td colspan="2">Carro Carreto</td>
                       			<td></td>
                       			<td>1</td>
                       			<td name="valorCarreto">PA</td>
                       		</tr>
                       		<tr>
                       			<td><input type="checkbox" value="carroEnterro" checked disabled></td>
                       			<td colspan="2">Carro Enterro</td>
                       			<td></td>
                       			<td>1</td>
                       			<td name="valorCarreto">PA</td>
                       		</tr>
                       		<tr>
                       			<th rowspan="2">Taxas:</th>
                       			<td><input type="checkbox" value="sepultamento" checked disabled></td>
                       			<td colspan="2">Sepultamento</td>
                       			<td></td>
                       			<td colspan="2"></td>
                       		</tr>
                       		<tr>
                       			<td>
                       				<input type="checkbox" value="carroCarreto" name="outrasTaxas">
                       			</td>
                       			<td  colspan="2">Outras</td>
                       			<td>
                       				<input type="radio" id="outrasTaxasTipo" name="outrasTaxasTipo" disabled>(+)Creditar</input>
                       				<input type="radio" id="outrasTaxasTipo" name="outrasTaxasTipo" disabled>(-)Debitar</input>
                       			</td>
                       			
                       			<td></td>
                       			<td>
                       			<input type="text" disabled id="outrasTaxas" name="outrasTaxas"></td>
                       		</tr>
                       	</tbody>
                       	
                       </table>
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