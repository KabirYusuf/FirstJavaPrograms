package classExercise.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
   private Bank wemaBank;


    @BeforeEach
    void setUp(){
        wemaBank = new Bank();
    }
    @Test
    public void bankExistsTest(){
        assertNotNull(wemaBank);
    }

    @Test
    public void accountCanBeCreatedTest(){
        //given that there is a bank
        //when i create an account
        //check that number of account created is one

        wemaBank.createAccountFor("banke", "2727");
        assertEquals(1, wemaBank.getNumberOfCustomers());
    }
    @Test
    public void createAccount_findAccountByAccountNumberTest(){
        wemaBank.createAccountFor("banke", "2727");
        assertEquals(1, wemaBank.getNumberOfCustomers());

        Account account = wemaBank.findAccount("1");
        assertEquals("banke", account.getName());
    }

    @Test
    public void customerCanDepositInHerAccount(){
        wemaBank.createAccountFor("banke", "2727");
        wemaBank.deposit(2000, "1");

        Account bankeAccount = wemaBank.findAccount("1");
        assertEquals(2000, bankeAccount.getBalance("2727"));
    }

    @Test
    public void customerCanWithdrawFromHerAccount(){
        //Given that bank exists
        //I can create an account
        //I can make deposit of 3000
        //I can withdraw 2000

        wemaBank.createAccountFor("banke", "2727");
        wemaBank.deposit(3000,"1");
        Account bankeAccount = wemaBank.findAccount("1");
        assertEquals(3000, bankeAccount.getBalance("2727"));
        wemaBank.withdrawal(2000,"1", "2727");
        assertEquals(1000, bankeAccount.getBalance("2727"));
        bankeAccount = wemaBank.findAccount("1");

    }

    @Test
    public void testTransfer(){


        wemaBank.createAccountFor("banke", "2727");
        wemaBank.createAccountFor("kabir", "1234");
        Account account = wemaBank.findAccount("2");
        assertEquals(2, wemaBank.getNumberOfCustomers());
        //assertEquals("kabir", account.getName());
        wemaBank.deposit(5000, "1");
        Account bankeAccount = wemaBank.findAccount("1");
        assertEquals(5000, bankeAccount.getBalance("2727"));
        Account kabirAccount = wemaBank.findAccount("2");
        wemaBank.transfer(8000,"2727", "1", "2");
        assertEquals(5000, bankeAccount.getBalance("2727"));
        assertEquals(0, kabirAccount.getBalance("1234"));

    }
}