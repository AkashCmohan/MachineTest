package Currency_project.CurrencyConvertor_Project.model;



import java.util.Map;

public class ExchangeRateResponse {
	private Map<String, Double> rates;

	public Map<String, Double> getRates() {
		return rates;
	}

	public void setRates(Map<String, Double> rates) {
		this.rates = rates;
	}
}