/*esta funcao retorna verdadeiro ou falso, 
    usando expressoes regulares para verificar se o parametro palavraBuscada
    existe dentro do parametro frase
*/
function buscarNome(frase, palavraBuscada) {  
    regex = new RegExp(palavraBuscada);
    var result = regex.test(frase) ? true : false;
    return result;
}

function retornarTotal(lista){    
    lista.forEach(element => {
        console.log("ELEMENTO");
    });
}

function retonarSomatorioLista(texto){
    let somatorio = 0;
    todasLI = document.querySelectorAll("li");
    todasLI.forEach(element => {
        let valor = parseFloat(somarString(element));
        somatorio += valor;
    });
    return somatorio;
}

function somarString(frase){    
    var valor = /\d{2}.\d{2}/.exec(frase.innerText);      
    return parseFloat(valor[0]);
}