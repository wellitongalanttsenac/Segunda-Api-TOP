package br.com.senac.api.dto;


public class CalculatorDto {
    private double result;

    public CalculatorDto(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
