package entities;

public class OutsourceEmployee extends Employee{
    private Double additionalCharge;

    public OutsourceEmployee(){}

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge){
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge(){
        return additionalCharge;
    }

    @Override
    public Double payment(){
        return super.payment() + (additionalCharge * 1.10);
    }
}
