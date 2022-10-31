package Corona;

public class PhoneInfo { //일반
		protected String name;
		protected String phoneNumber;
		
		PhoneInfo(String name, String phoneNumber){ //일반
			this.name=name;
			this.phoneNumber=phoneNumber;
		}
		public String getName() {
			return name;
		}
		public void showPhoneInfo()	{
			System.out.println("name: "+name);
			System.out.println("phone: "+phoneNumber);
		}
	}
	class PhoneUnivInfo extends PhoneInfo{ //대학
		private String major;
		private String year;
		
		PhoneUnivInfo(String name, String phoneNumber, String major,
				String year){ // 대학
			super(name, phoneNumber);
			this.major = major;
			this.year = year;
		}
		public void showPhoneInfo() {
			System.out.println("name: "+name);
			System.out.println("phone: "+phoneNumber);
			System.out.println("major: "+major);
			System.out.println("year : "+year);
		}
	}
	class PhoneCompanyInfo extends PhoneInfo{ //회사
		private String company;
		PhoneCompanyInfo(String name, String phonenumber, String company){ //회사
			super(name,phonenumber);
			this.company = company;
		}
		public void showPhoneInfo()	{
			System.out.println("name: "+name);
			System.out.println("phone: "+phoneNumber);
			System.out.println("company: "+company);
		}
	}


