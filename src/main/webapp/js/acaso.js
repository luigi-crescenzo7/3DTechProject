$(document).ready(function () {
    const divElement = $("#div-test")
    $("#fieldProductCategory").change(function () {
        const category = $("#fieldProductCategory").val()
        if (typeof (category) === "string") {
            switch (category) {
                case "Materiale plastico":
                    divElement.load("/progettoTSW_war_exploded/form-prodotti/materiale-plastico.jsp",
                        () => console.log("Success on " + category))
                    break;
                case "Stampanti 3D":
                    divElement.load("/progettoTSW_war_exploded/form-prodotti/stampanti-3d.jsp",
                        () => console.log("Success on " + category))
                    break;
                case "":
                    break;
                default:
                    console.log("errore!!")
                    break;
            }
        }
    })
})