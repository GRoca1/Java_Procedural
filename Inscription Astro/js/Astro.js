function listeJour() {

    for (let i = 1; i <= 31; i++) {
        var monOption = new Option();
        monOption.text = i;
        monOption.value = i;
        document.getElementById("jour").options[i] = monOption;
    }
}
listeJour();

function listeMonth() {

    var tabMonths = ["Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"];
    for (let j = 1; j < 13; j++) {
        var monOption = new Option();
        monOption.text = tabMonths[j - 1];
        monOption.value = j;
        document.getElementById("mois").options[j] = monOption;
    }
} listeMonth();

function listeAnnee() {

    for (let i = 1910; i < 2000; i++) {
        var monOption = new Option();
        monOption.text = i;
        monOption.value = i;
        document.getElementById("annee").options[i - 1909] = monOption;
    }
} listeAnnee();

function daysInFebruary(year) {
    if (year % 4 === 0 && (year % 100 !== 0 || year % 400 === 0)) {
        return 29;
    } else {
        return 28;
    }
} listeAnnee();

var tabSigne = ["Verseau", "Poisson", "Belier", "Taureau", "Gémeaux", "Cancer", "Lion", "Vierge", "Balance", "Scorpion", "Sagittaire", "Capricorne", "Verseau"];
function ValNum(maChaine) {
    var result = 0;
    var maChaine2 = maChaine.toUpperCase();
    for (var i = 0; i < maChaine2.length; i++) {
        result += maChaine2.charCodeAt(i) - 64;
    }
    return result;
}

function calculPseudo() {
    let monMois = document.querySelector("#mois").value; num = monMois - 1;
    let monSigne = tabSigne[num];
    let monNum = ValNum(document.getElementById("txtnom").value) + ValNum(document.getElementById("txtprenom").value);
    let Pseudo = monSigne + monNum;
    document.getElementById("pseudo").value = Pseudo;
}
document.getElementById("valider").addEventListener("click", function () { calculPseudo(); });

