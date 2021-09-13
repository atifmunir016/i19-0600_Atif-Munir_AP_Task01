




class create_account extends Account{
	
create_account(String n,int acc_num,int b,String a_t){ 
	
name=n;

Account_num=acc_num;

Account_Balance=b;


account_type=a_t;

}

create_account(){
	
super();
}

void insert(String n,int acc_num,String a_t){ 
	
name=n;

account_type=a_t;



Account_num=acc_num;



Account_Balance=0;
}

void display_details(){
	
System.out.println("Depositor Name :" +name);

System.out.println("Account Number : "+Account_num);

System.out.println("Account Balance : "+Account_Balance);

System.out.println("Account Type : "+account_type);

}

void deposite(int account_num,int money){
	
	
Account_Balance=money;

}

int withdraw(int withd){
	
Account_Balance=Account_Balance-withd;

return Account_Balance;

}

} 