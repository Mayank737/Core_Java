package Interface;

public class TestBusinessman {

	public static void main(String[] args) {
		Richman r  = new Businessman();
		r.donation();
		r.earnmoney();
		r.party();
		 SocialWorker s = new Businessman();
		 s.helpToOther();
		 Businessman b = new Businessman();
		 b.earnmoney();
	}
	}


