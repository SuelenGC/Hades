<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br" contentType="text/html; charset=utf-8">
<head>
	<!-- Bootstrap Core CSS -->
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" >
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../../../resources/css/cadastro_contratante.css" rel="stylesheet"/>

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
            <li class="visited first">
                <a href="#">Entrar</a>
            </li>
            <li class="previous visited">Shipping & Billing</li>
            <li class="active">Shipping Options</li>
            <li class="next">Review & Payment</li>
            <li class="">Complete</li>
        </ul>
    </div>
    <form action="salvar" method="post">
		<div class="container" id="formulario-dados-pessoais">
			<div class="row">
				<div class="col-md-8">
					<div class="well" id="dadosPessoais">
						<h1 class="titulo_caixa">Dados pessoais</h1>
							<div class="row">
								<div class="col-sm-12">
									<div class="form-group">
										<label>Nome completo</label> <input type="string"
											class="form-control" name="nomeCompleto" id="nomeCompleto"
											placeholder="Nome Completo">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-12">
									<div class="form-group">
										<label>Nome da mãe</label> <input type="string"
											class="form-control" name="nomeMae" id="nomeMae" placeholder="Nome da mãe">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label>RG</label> <input type="string" class="form-control"
											name="rg" id="rg" placeholder="RG">
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label>CPF</label> <input type="string" class="form-control"
											name="cpf" id="cpf" placeholder="CPF" onkeypress="mascara(this,leech)">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label>Profissão</label> <input type="string"
											class="form-control" name="profissao" id="profissao" placeholder="Profissão">
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">
										<label>Parentesco</label> <input type="string"
											class="form-control" name="grauParentesco" id="grauParentesco" placeholder="Parentesco">
									</div>
								</div>
							</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="well" id="caixaContatos">
						<h1 class="titulo_caixa">Contatos</h1>
							<div class="row">
								<div class="col-sm-12">
									<div class="form-group">
										<label>Tel Residencial</label> <input type="string"
											class="form-control" name="telResidencial" id="telResidencial"
											placeholder="Tel Residencial">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-12">
									<div class="form-group">
										<label>Tel Celular</label> <input type="string"
											class="form-control" name="telCelular" id="telCelular" placeholder="Tel Celular">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-12">
									<div class="form-group">
										<label>Email</label> <input type="email" class="form-control"
											name="email" id="email" placeholder="Email">
									</div>
								</div>
							</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="well">
						<h1 class="titulo_caixa">Endereço</h1>
							<div class="row">
								<div class="col-sm-6">
									<div class="form-group">
										<label>Endereço</label> <input type="string"
											class="form-control" name="endereco" id="endereco" placeholder="Endereço">
									</div>
								</div>
								<div class="col-sm-2">
									<div class="form-group">
										<label>Número</label> <input type="number" class="form-control"
											name="numeroEndereco" id="numeroEndereco" placeholder="Número">
									</div>
								</div>
								<div class="col-sm-4">
									<div class="form-group">
										<label>Complemento</label> <input type="string"
											class="form-control" name="complementoEndereco" id="complementoEndereco"
											placeholder="Complemento">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-4">
									<div class="form-group">
										<label>Bairro</label> <input type="string" class="form-control"
											name="bairro" id="bairro" placeholder="Bairro">
									</div>
								</div>
								<div class="col-sm-3">
									<div class="form-group">
										<label>Cidade</label> <input type="string" class="form-control"
											name="cidade" id="cidade" placeholder="Cidade">
									</div>
								</div>
								<div class="col-sm-2">
									<div class="form-group">
										<label>UF</label> <input type="string" class="form-control"
											name="estado" id="estado" placeholder="UF">
									</div>
								</div>
								<div class="col-sm-3">
									<div class="form-group">
										<label>CEP</label> <input type="string" class="form-control"
											name="cep" id="cep" placeholder="CEP">
									</div>
								</div>
							</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12">
					<nav>
						<ul class="pager">
							<li class="previous disabled"><a href="#"><span aria-hidden="true">&larr;</span> Anterior</a></li>
							<li class="next"><input type="submit">Próximo <spanaria-hidden="true">&rarr;</span></input></li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</form>
</body>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
<script type="text/javascript" src="https://raw.github.com/digitalBush/jquery.maskedinput/1.3.1/dist/jquery.maskedinput.min.js"></script>
<script>
 $('#CPF').mask("999.999.999-99");
</script>
</html>