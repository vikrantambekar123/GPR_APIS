package Pojos;

public class GetCardLimit 
{

private String 	cardRefNumber;
public String getCardRefNumber() {
	return cardRefNumber;
}
public void setCardRefNumber(String cardRefNumber) {
	this.cardRefNumber = cardRefNumber;
}
public String getTransactionKey() {
	return transactionKey;
}
public void setTransactionKey(String transactionKey) {
	this.transactionKey = transactionKey;
}
public String getFrequency() {
	return frequency;
}
public void setFrequency(String frequency) {
	this.frequency = frequency;
}
public String getCardUsage() {
	return cardUsage;
}
public void setCardUsage(String cardUsage) {
	this.cardUsage = cardUsage;
}
private String 	transactionKey;
private String 	frequency;
private String 	cardUsage;

}
