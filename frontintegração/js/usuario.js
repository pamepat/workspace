function filtrar () {
    var valor = document.getElementById ("cmblancamento").value;
    if (valor=='0' || valor=='1'){
        fetch("http://localhost:8080/lancamento/" + valor)
        .then(res=>res.json())
        .then(res=>preenchertabela(res))
        .catch(err=>{
            window.alert("Não encontrado!");
        });
    }

}

function preenchertabela(lista){
    var tabela=
    "<table width='100%' border='1' cellpaidding='10' cellspacing='5' align='center'>" +
    "<tr>" + 
    "<th>Musica</th> <th>Artista</th> <th>Cadastro</th>" + 
    "<tr>"
    for (contador=0;contador<lista.length;contador++) {
        tabela+=
        "<tr>" +
        "<td>" + lista[contador].titulo + "</td>" +
        "<td>" + lista[contador].artista.nomeArtistico + "</td>" +
        "<td>" + lista[contador].cadastro + "</td>" +
        "</tr>";

    }
    tabela+="</table>"
    document.getElementById("resultado").innerHTML=tabela;
}

function carregarusuario () {
    var usuariologado = localStorage.getItem("logado");
    if (usuariologado==null) {
        window.location="index.html";
    }else{
        var usuariojson = JSON.parse(usuariologado);
        document.getElementById("foto").innerHTML =
        "<img alt='Imagem não existe' width='50%' src=imagens/" + usuariojson.foto + ">";
        document.getElementById("dados").innerHTML =
        "<h3>" + usuariojson.nome + "<br>" + usuariojson.email +
        "<br>ID: " + usuariojson.id + "</h3>";
    }
}