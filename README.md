# Deploy local da aplicação no Tomcat

1. Download do Tomcat 7 http://tomcat.apache.org/download-70.cgi e extrai/descompactar o arquivo baixado em algum diretório, este será o diretório do Tomcat 

2. No Eclipse abrir a View "Servers", Ctrl+3 (windows ou linux), Cmd+3 (MacOS) e digitar Servers

3. Na View Servers clicar com o botão direito no mouse > New > Server e selecionar a versão 7 do Apache Tomcat e seguir o passo-a-passo (next>next>finish)

4. Dois cliques no servidor criado na View "Servers" irá abrir o arquivo de configuração do servidor, na parte de "Server Locations" marcar a opção do meio, Use Tomcat installation, takes control of Tomcat installation. 

5. Clicar com o botão direito do mouse sobre o servidor criado > Add and Remove... adicionar o HadesWeb > Finish

6. Selecionar o servidor Tomcat, e clicar no botão de "Play" verde para iniciar o servidor

7. Deve ser possível acessar a url http://localhost:8080/HadesWeb
