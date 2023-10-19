package chap02;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String s){

        //두번째 테스트
        if (s.length() < 8) {
            return PasswordStrength.NORMAL;
        }

        //세번째 테스트
        boolean containsNum = meetsContainingNumberCriteria(s);
        if(!containsNum) return PasswordStrength.NORMAL;
        return PasswordStrength.STRONG;
    }

    private boolean meetsContainingNumberCriteria(String s){
        for(char ch: s.toCharArray()){
            if(ch >= '0' && ch <='9'){
                return true;
            }
        }
        return false;
    }
}
