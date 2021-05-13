package beans;

import beans.User;

public class Billetera extends User{
	
	int userid;
	float doge;
	float ethereum;
	float bitcoin;
	float cardano;
	float bnb;
	
	public Billetera() {}
	public Billetera(int userid) {
		userid = super.id;
		
	}
	
	public Billetera(int userid, float doge, float ethereum, float bitcoin, float cardano, float bnb) {
		userid = super.id;
		this.doge = doge;
	}
	
	public float getdoge() {
		return doge;
	}
	
	public void setdoge(float doge) {
		this.doge = doge;
	}
	
	public float ethereum() {
		return ethereum;
	}
	
	public void setethereum(float ethereum) {
		this.ethereum = ethereum;
	}
	
	public float bitcoin() {
		return bitcoin;
	}
	
	public void setbitcoin(float bitcoin) {
		this.bitcoin = bitcoin;
	}
	
	public float cardano() {
		return cardano;
	}
	
	public void setcardano(float cardano) {
		this.cardano = cardano;
	}
	
	public float bnb() {
		return bnb;
	}
	
	public void setbnb(float bnb) {
		this.bnb = bnb;
	}
	
	
	
}
