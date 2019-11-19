
Tecnologias usadas:

 - Backend:
   - Framework java SpringBoot
   - Explicação dos diretorios:
- Frontend:
   - Framework javascript Vue.js

O projeto é dividido em dois modulos:
 - Backend que contém diretorio dos testes e diretorio do projeto em si, onde temos os diretorios:
   - dominio (onde ficam as classes de negocio)
   - repositorio (onde fica interfaces que fazem conexão com o banco de dados)
   - aplicacao (classes que fazem a ponte entre o controlador e a camada de dominio)
   - controlador (classes que recebem e tratam requisições REST)
 - Frontend, que contém algumas pastas de arquivos do framework e a pasta 'src'. A pasta é separada da seguinte forma:
   - assets: Contém ficheiros adicionais para o programa, tais como documentos e imagens;
   - components: Contém os componentes do projeto. Cada componente é separado por pacotes, e cada pacote possui um arquivo com o template (.vue), um arquivo com a lógica (.js) e um arquivo com o estilo (.css);
   - Arquivo App.vue: Template onde são injetados os componentes da aplicação.
   - Arquivo main.js: Arquivo com a lógica do template App.vue
