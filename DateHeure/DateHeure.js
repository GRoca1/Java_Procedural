function affichedate()
{
chaine="";
var madate= new Date();
let datejour=madate.getDate();
let mois=madate.getMonth()+1;
let annee=madate.getFullYear();
if(datejour<10)
{
    chaine+="0"+datejour;

}
else 
{
    chaine+=datejour;
}
(mois<10)?chaine+="/0"+mois:chaine+="/"+mois;
chaine+="/"+annee;
return chaine;
}

let chainedepart= affichedate();

var objetbouton= document.querySelector("#btndate");
objetbouton.addEventListener('click', function() { document.getElementById('madate').value=affichedate() ;});

function afficheheure()
{
    var chaineheure='';
    var monheure=new Date();
    let heure=monheure.getHours();
    (heure<10)? chaineheure+='0'+heure:chaineheure+=heure;
    let min=monheure.getMinutes();
    (min<10)?chaineheure+=':0'+min:chaineheure+=':'+min;
    let sec=monheure.getSeconds();
    (sec<10)?chaineheure+=':0'+sec:chaineheure+=':'+sec;

    document.getElementById('monheure').value=chaineheure;
    setTimeout(function() {afficheheure();}, 1000);
}
var objetboutonheure=document.querySelector('#btnheure');
objetboutonheure.addEventListener('click',afficheheure);

/*function afficherdate(){
let madate = new Date();
let annee = madate.getFullYear();
let mois = (madate.getMonth()<9)? "0" +(madate.getMonth()+1):madate.getMonth()+1;
let jour = (madate.getDate()<10)? "0" + madate.getDate():madate.getDate();
let chaineDate = jour + "/" + mois + "/" + annee;

return chaineDate;


}

document.querySelector("#btndate").addEventListener("click",function(){
    document.querySelector("#txtdate").value = affichedate();

})*/