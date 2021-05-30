var idade = 66;

if(idade < 16){
    console.log('nao vota')
}else if(idade >= 18 && idade < 65){
    console.log('vota')
}else if(idade >= 16 || idade >= 65 ){
    console.log('voto opcional')
}