package restApi;

public class CalculadoraWrapper {
	
	private int dividendo;
	
	private int divisor;
	
	public CalculadoraWrapper(){}
	
	public CalculadoraWrapper(int dividendo, int divisor){
		this.dividendo = dividendo;
		this.divisor = divisor;
	}
	
	
    public int getDividendo() {
		return dividendo;
	}

	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	@Override
    public String toString() {
        return "Wrapper [dividendo=" + dividendo + ", divisor=" + divisor + "]";
    }

}
