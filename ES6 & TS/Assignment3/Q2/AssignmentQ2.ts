class Account{
    constructor(id, name, balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    totalBalance(){
        return this.balance;
    }
}

class SavingAccount extends Account{
    constructor(id, name, balance, interest){
        super(id, name, balance = balance + (balance*interest)/100);
    }
}
class CurrentAccount extends Account{
    constructor(id, name, balance, cash_credit){
        super(id, name, balance+cash_credit);
    }
}

let s1 = new SavingAccount(101, "Aniket", 20000, 10);
let c1 = new CurrentAccount(102, "Shivam", 10000, 5);

console.log(s1.totalBalance() + c1.totalBalance());