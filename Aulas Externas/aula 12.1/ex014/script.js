function carregar() {
    var msg = document.getElementById('msg');
    var img = document.getElementById('imagem');
    var data = new Date();
    var hora = data.getHours();
    var minuto = data.getMinutes();
    msg.innerHTML = `Agora são ${hora}:${minuto} Horas`;
    while(true){
    if (hora >= 0 && hora < 12) {
        //bom dia
        img.src = 'fotomanha.png'
        document.body.style.background = '#fcb787';
    } else if (hora >= 12 && hora < 18) {
        //boa tarde
        img.src = 'fototarde.png'
        document.body.style.background = 'rgb(150,36,645)';
    } else{
        //boa noite
        img.src = 'fotonoite.png'
        document.body.style.background = '#011e48';
    }} 
}