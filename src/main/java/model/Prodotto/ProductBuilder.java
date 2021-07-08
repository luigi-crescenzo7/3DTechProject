package model.Prodotto;

import org.json.JSONObject;

import java.util.Map;

public class ProductBuilder {

    public static Prodotto createMaterialePlastico(Map<String, String[]> map, String fileName) {
        Prodotto prodotto = new Prodotto();
        prodotto.setNome(map.get("productName")[0]);
        prodotto.setMarchio(map.get("productMark")[0]);
        prodotto.setDescrizione(map.get("productDescription")[0]);
        prodotto.setUrlImage(fileName);
        JSONObject object = new JSONObject();
        object.put("Colore", map.get("productColor")[0]);
        object.put("Temperatura", Double.parseDouble(map.get("productTemp")[0]));
        prodotto.setCaratteristiche(object);
        prodotto.setPrezzo(Double.parseDouble(map.get("productPrice")[0]));
        prodotto.setPeso(Double.parseDouble(map.get("productWeight")[0]));
        prodotto.setSconto(Double.parseDouble(map.get("productDiscount")[0]));
        return prodotto;
    }

    public static Prodotto createStampante3D(Map<String, String[]> map, String fileName) {
        Prodotto prodotto = new Prodotto();
        prodotto.setNome(map.get("productName")[0]);
        prodotto.setMarchio(map.get("productMark")[0]);
        prodotto.setDescrizione(map.get("productDescription")[0]);
        prodotto.setUrlImage(fileName);
        prodotto.setCaratteristiche(new JSONObject());
        prodotto.setPrezzo(Double.parseDouble(map.get("productPrice")[0]));
        prodotto.setPeso(Double.parseDouble(map.get("productWeight")[0]));
        prodotto.setSconto(Double.parseDouble(map.get("productDiscount")[0]));
        return prodotto;
    }

    public static Prodotto createRicambio(Map<String, String[]> map, String fileName) {
        Prodotto prodotto = new Prodotto();
        prodotto.setNome(map.get("productName")[0]);
        prodotto.setMarchio(map.get("productMark")[0]);
        prodotto.setDescrizione(map.get("productDescription")[0]);
        prodotto.setUrlImage(fileName);
        prodotto.setCaratteristiche(new JSONObject());
        prodotto.setPrezzo(Double.parseDouble(map.get("productPrice")[0]));
        prodotto.setPeso(Double.parseDouble(map.get("productWeight")[0]));
        prodotto.setSconto(Double.parseDouble(map.get("productDiscount")[0]));
        return prodotto;
    }

    public static Prodotto createAccessorio(Map<String, String[]> map, String fileName) {
        Prodotto prodotto = new Prodotto();
        prodotto.setNome(map.get("productName")[0]);
        prodotto.setMarchio(map.get("productMark")[0]);
        prodotto.setDescrizione(map.get("productDescription")[0]);
        prodotto.setUrlImage(fileName);
        prodotto.setCaratteristiche(new JSONObject());
        prodotto.setPrezzo(Double.parseDouble(map.get("productPrice")[0]));
        prodotto.setPeso(Double.parseDouble(map.get("productWeight")[0]));
        prodotto.setSconto(Double.parseDouble(map.get("productDiscount")[0]));
        return prodotto;

    }

    public static Prodotto createUtensile(Map<String, String[]> map, String fileName) {
        Prodotto prodotto = new Prodotto();
        prodotto.setNome(map.get("productName")[0]);
        prodotto.setMarchio(map.get("productMark")[0]);
        prodotto.setDescrizione(map.get("productDescription")[0]);
        prodotto.setUrlImage(fileName);
        prodotto.setCaratteristiche(new JSONObject());
        prodotto.setPrezzo(Double.parseDouble(map.get("productPrice")[0]));
        prodotto.setPeso(Double.parseDouble(map.get("productWeight")[0]));
        prodotto.setSconto(Double.parseDouble(map.get("productDiscount")[0]));
        return prodotto;
    }

    public static Prodotto createResina(Map<String, String[]> map, String fileName) {
        Prodotto prodotto = new Prodotto();
        prodotto.setNome(map.get("productName")[0]);
        prodotto.setMarchio(map.get("productMark")[0]);
        prodotto.setDescrizione(map.get("productDescription")[0]);
        prodotto.setUrlImage(fileName);
        prodotto.setCaratteristiche(new JSONObject());
        prodotto.setPrezzo(Double.parseDouble(map.get("productPrice")[0]));
        prodotto.setPeso(Double.parseDouble(map.get("productWeight")[0]));
        prodotto.setSconto(Double.parseDouble(map.get("productDiscount")[0]));
        return prodotto;
    }

    public static JSONObject fromObjectToJson(Prodotto p) {
        JSONObject object = new JSONObject();
        object.put("Id", p.getId());
        object.put("Nome", p.getNome());
        object.put("Descrizione", p.getDescrizione());
        object.put("Marchio", p.getMarchio());
        object.put("Immagine", p.getUrlImage());
        object.put("Caratteristiche", p.getCaratteristiche());
        object.put("Prezzo", p.getPrezzo());
        object.put("Peso", p.getPeso());
        object.put("Sconto", p.getSconto());
        object.put("Categoria", p.getCategoria().getNome());
        return object;
    }
}
