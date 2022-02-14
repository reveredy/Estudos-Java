package entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){

    }

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }

    public String priceTag(){
        StringBuilder sb = new StringBuilder();

        sb.append(super.getName());
        sb.append(" $ ");
        sb.append(String.format("%.2f", super.getPrice()));
        sb.append(" (Customs fee: $ ");
        sb.append(String.format("%.2f", customsFee));

        return sb.toString();
    }
}
