package chap02;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String s){

        //네번째 테스트
        if(s==null || s.isEmpty()) return PasswordStrength.INVALID;

        //두번째 테스트
        if (s.length() < 8) {
            return PasswordStrength.NORMAL;
        }

        //세번째 테스트
        boolean containsNum = meetsContainingNumberCriteria(s);
        if(!containsNum) return PasswordStrength.NORMAL;

        //다섯번째 테스트
        boolean containsUpp = meetsContainingUppercaseCriteria(s);
        if(!containsUpp) return PasswordStrength.NORMAL;


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

    private boolean meetsContainingUppercaseCriteria(String s){
        for(char ch: s.toCharArray()){
            if(Character.isUpperCase(ch)){
                return true;
            }
        }
        return false;
    }
}
