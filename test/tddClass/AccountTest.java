package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AccountTest {
    @Test
    @DisplayName("deposit money, balance increases test")
    public void depositMoneyBalanceIncreasesTest(){
        //given that
        Account jennyAccount  = new Account();
        //when
        jennyAccount.deposit(500);
        //check
        assertEquals(500, jennyAccount.getBalance());
    }

    @Test
    @DisplayName("deposit money, balance increases test")
    public void depositMoneyBelowBalanceIncreasesTest(){
        //given that
        Account jennyAccount  = new Account();
        //when
        jennyAccount.deposit(300);
        //check
        assertEquals(500, jennyAccount.getBalance());
    }

}
