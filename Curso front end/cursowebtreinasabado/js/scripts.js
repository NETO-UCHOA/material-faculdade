function generateTable(dados, columns, atribs) {
    //removendo a tabela antiga
    if (document.getElementById('tableApiRest') !== null) {
      document.getElementById('tableApiRest').remove();
    }
    if(dados.message !== undefined){
        alert(dados.message);
        return;
    }
    // criando o elemento <table>
    const tbl = document.createElement("table");
    // criando o elemento <thead>
    const tblHead = document.createElement("thead");
    // adicionando as coluna do cabeçaho da tabela
    const rowHead = document.createElement("tr");
    for (let i = 0; i < columns.length; i++) {
      const cellHead = document.createElement("th");
      const cellHeadText = document.createTextNode(columns[i]);
      cellHead.appendChild(cellHeadText);
      rowHead.appendChild(cellHead);
    }
    tblHead.appendChild(rowHead);
    //adicionando o cabeçalho a tabela
    tbl.appendChild(tblHead);
    
    //criando o corpo da tabela
    const tblBody = document.createElement("tbody");
    //caso venha uma coleção de dados
    if(dados.length !== undefined){
        //adicionando os dados ao corpo da tabela  
        for (let i = 0; i < dados.length; i++) {
            row = document.createElement("tr");
            for (let j = 0; j < atribs.length; j++) {
                cell = document.createElement("td");
                cellText = document.createTextNode(dados[i][atribs[j]]);
                cell.appendChild(cellText);
                row.appendChild(cell);
            }
            tblBody.appendChild(row);
        }
    }else{
        row = document.createElement("tr");
        for (let j = 0; j < atribs.length; j++) {
            cell = document.createElement("td");
            cellText = document.createTextNode(dados[atribs[j]]);
            cell.appendChild(cellText);
            row.appendChild(cell);
        }
        tblBody.appendChild(row);
    }
    // adicionando o corpo a tabela
    tbl.appendChild(tblBody);
    // adicionando a tabela ao corpo da página
    document.body.appendChild(tbl);
    //definindo o estilo da tabela
    tbl.setAttribute("class", "table table-bordered table-hover");
    tbl.setAttribute("id", "tableApiRest");
  }
  
  //consumindo API REST
  async function getPostsAPIREST() {
    //chamando o serviço da API REST
    const response = await fetch("https://gorest.co.in/public/v2/posts");
    //recuperando o JSON de resposta da API
    const posts = await response.json();
  
    const columns = ["ID","ID USER","TITLE","BODY"];
    const atribs = ["id","user_id","title","body"];
    //chamando a função para gerar a tabela
    generateTable(posts, columns, atribs) ;
  }
  
  //consumindo API REST
  async function getUsersAPIREST(id) {
    //chamando o serviço da API REST
    const response = await fetch("https://gorest.co.in/public/v2/users/"+id);
    //recuperando o JSON de resposta da API
    const users = await response.json();
  
    const columns = ["id","name","email","gender","status"];
    const atribs = ["id","name","email","gender","status"];
    //chamando a função para gerar a tabela
    generateTable(users, columns, atribs) ;
  }