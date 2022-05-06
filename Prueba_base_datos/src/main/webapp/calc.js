function calcular(){
    var http;
    http = new XMLHttpRequest;

    http.onreadystatechange = function (){
        if (http.readyState==4 && http.status==200){
            document.getElementById("resultat").innerHTML=http.responseText;
        }
    }

    http.open("POST","http://localhost:8080/Prueba_base_datos/Suma",true);
    http.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    http.send("a="+document.getElementById("a").value+"&&b="+document.getElementById("b").value);
}

