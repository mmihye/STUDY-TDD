package chap02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PasswordStrengthMeterTest {
    private PasswordStrengthMeter meter = new PasswordStrengthMeter();

    private void assertStrength(String passwrod, PasswordStrength expStr){
        PasswordStrength result = meter.meter(passwrod);
        assertEquals(expStr,result);
    }

    @Test
    void meetsAllCriteria_Then_Strong(){
        assertEquals("ab12!@AB",PasswordStrength.STRONG);
        assertEquals("abc1!Add",PasswordStrength.STRONG);

    }

    @Test
    void meetsOtherCriteria_except_for_Length_Then_Normal(){
        assertEquals("ab12!@A",PasswordStrength.NORMAL);
    }

    @Test
    void meetsOtherCriteria_except_for_number_Then_Normal(){
        assertEquals("ab!@ABqwer",PasswordStrength.NORMAL);
    }
}
