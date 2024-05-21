// ATIVIDADE 1
function imprimir(){
    console.log("Hello Word");
}
imprimir();

//ATIVIDADE 2
function mostrarIdade(idade){
    console.log(`Você tem ${idade} anos`);
}
mostrarIdade(20);
mostrarIdade(24);
mostrarIdade(21);

//ATIVIDADE 3
function somar(n1,n2){
    return n1 + n2;
}
console.log(somar(123,456));
console.log(somar(789,963));

//ATIVIDADE 4
function numeroAleatorio(numero){
    return Math.floor(Math.random()*numero) + 1;
}
console.log(numeroAleatorio(33));
console.log(numeroAleatorio(762));
console.log(numeroAleatorio(38));

//ATIVIDADE 5
function Entrada(idade){
    if (idade >= 18 && idade <= 65) {
        console.log("Legivel para se matricular!");
    }else{
        console.log("Ilegivel para se matricular!")
    }
}
Entrada(17);
Entrada(18);
Entrada(21);
Entrada(70);

//ATIVIDADE 6
function autenticaçaoDeDados(dados){
    if(typeof dados === 'string'){
        console.log("Esta informação é uma String!");
    }else if(typeof dados === 'number'){
        console.log("Esta informação é um Number!");
    }else if(typeof dados === 'boolean'){
        console.log("Esta informação é um Boolean");
    }
}
autenticaçaoDeDados(false);
autenticaçaoDeDados(20);
autenticaçaoDeDados("prova");

//ATIVIDADE 7
function numPositivo(numNegativo){
    return Math.abs(numNegativo);
}
console.log(numPositivo(-26));
console.log(numPositivo(5));
console.log(numPositivo(-66.6));

//ATIVIDADE 8
function verificarTamanhoTexto(texto){
    if(texto.length > 10){
        console.log("Texto muito longo");
    }else{
        console.log("Texto dentro do limite");
    }
    console.log(texto.length);
}
verificarTamanhoTexto("Teste");
verificarTamanhoTexto("Verificando...");
verificarTamanhoTexto("10-");

//ATIVIDADE 9
function potencia(a,b){
    return Math.pow(a,b)
    return a ** b;
}
console.log(potencia(3,2));
console.log(potencia(6,2));
console.log(potencia(9,2));
console.log(potencia(5,2));

//ATIVIDADE 10
function numerosPares(num){
    for(let i = num; i >= 0; i--){
        if(i % 2 == 0){
            console.log(i);
        }
    }
}
impressaoPar(30);
impressaoPar(446);
impressaoPar(24);