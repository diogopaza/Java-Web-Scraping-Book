function buscarNome(frase, palavraBuscada) {   
    regex = new RegExp(palavraBuscada);
    var result = regex.test(frase) ? true : false;
    return result;
}