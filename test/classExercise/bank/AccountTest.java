package classExercise.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account bankeAccount;

    @BeforeEach
    void setUp(){
        bankeAccount = new Account("banke", "0023458", "1234");
    }




    @Test
    public void depositMoney_balanceIncreaseTest(){
        //given that i have an account and balance is zero
        //when i deposit 200
        //check that balance is 200;


        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(200);
        assertEquals(200,bankeAccount.getBalance("1234"));
    }



    @Test
    public void cannotDepositNegativeAmountTest(){
        //given that i have an account and balance is zero
        //when i try to deposit -2500
        //check that balance is zero

        assertEquals(0, bankeAccount.getBalance("1234"));
        bankeAccount.deposit(-2500);
        assertEquals(0, bankeAccount.getBalance("1234"));

    }
    @Test
    @DisplayName("Getting balance with invalid pin returns")

    public void testBalanceWithInvalidPin_returnZeroTest(){
        //given i have money in my account
        //when i check my balance with wrong pin
        //balance is zero;

        bankeAccount.deposit(2000);
        int myBalance = bankeAccount.getBalance("13");
        assertEquals(0, myBalance);
    }

    @Test
    @DisplayName("Withdrawal")
    public void testToWithdraw(){
        //given that i have money in my account after making deposit
        //when i withdraw
        //balance should be less than previous balance by amount withdrawn

        bankeAccount.deposit(5000);
        assertEquals(5000, bankeAccount.getBalance("1234"));
        bankeAccount.withdraw(3000, "1234");
        assertEquals(2000, bankeAccount.getBalance("1234"));
    }

    @Test
    @DisplayName("Withdrawal with wrong pin")
    public void testToWithdraw_withWrongPin(){
        //given that i have money in my account after making deposit
        //when i attempt to withdraw with a wrong pin and balance is less than withdrawal
        //balance remains the same

        bankeAccount.deposit(5000);
        assertEquals(5000, bankeAccount.getBalance("1234"));
        bankeAccount.withdraw(5000,"1232");
        assertEquals(5000, bankeAccount.getBalance("1234"));
    }

    @Test
    @DisplayName("Withdrawal with balance less than amount to be withdrawn")
    public void testToWithdraw_withBalanceLessThanBalance(){
        //given that i have money in my account after making deposit of 3000
        //when i attempt to withdraw with balance  less than withdrawal amount(6000)
        //balance remains the same

        bankeAccount.deposit(3000);
        assertEquals(3000, bankeAccount.getBalance("1234"));
        bankeAccount.withdraw(6000,"1234");
        assertEquals(3000, bankeAccount.getBalance("1234"));
    }






}

