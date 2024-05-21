const cachorro = {
        raca: 'Sem Raça',
    uivar: function(){
        console.log("AUUU");
    },
    rosnar: function(){
        console.log("grrrrrr");
    },
    setRaca: function(raca){
        this.raca = raca;
    },
    getRaca: function(){
        return "A raça é: " + 
    }
}

// Exemplo 2
let dog = {
    patas: 4,
    raca:'Sem raça',

    latir: function(){
        console.log(" Au AU");
    }
}
let labrador = Object.create(dog);
 labrador.latir();

 labrador.raca = 'Labrador';
 console.log(labrador.raca);
 console.log(dog.raca);

let pastorAlemao = Object.create(dog);
pastorAlemao.raca = 'Pastor Alemão';
console.log(pastorAlemao.raca);

//EXEMPLO 3
//CONSTRUTORES

function criarCachorro(raca,patas,cor){
    let cachorro = Object.create();
    cachorro.raca = raca;
    cachorro.patas = patas;
    cachorro.cor = cor;

    return cachorro;
}
    let pug = criarCachorro('pug', 4 , 'preto');
    console.log(pug);
    pug.latir();

//EXEMPLO 4 
//HERANÇA

class Mamifero{
    constructor(patas){
        this.patas = patas;
    }
}
class Cachorro extends Mamifero{
    constructor(patas,raca){
        super(patas);
        this.raca=raca;
    }
    latir(){
        console.log("Au Au")
    }
}
let bob = new Cachorro (4, 'Fila');
console.log()