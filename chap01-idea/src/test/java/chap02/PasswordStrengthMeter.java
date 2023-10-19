package chap02;

public class PasswordStrengthMeter {
    public PasswordStrength meter(String s){

        if(s==null || s.isEmpty()) return PasswordStrength.INVALID;
        int metCounts = 0;

        if(s.length() >= 8) metCounts++;
        if(meetsContainingNumberCriteria(s)) metCounts ++;
        if(meetsContainingUppercaseCriteria(s)) metCounts ++;

        if(metCounts == 1) return PasswordStrength.WEAK;
        if(metCounts == 2) return PasswordStrength.NORMAL;

//        boolean lengthEnough = s.length() >= 8;
//        boolean containsNum = meetsContainingNumberCriteria(s);
//        boolean containsUpp = meetsContainingUppercaseCriteria(s);
//
//        if(lengthEnough && !containsNum && !containsUpp) return  PasswordStrength.WEAK;
//        if(!lengthEnough && containsNum && !containsUpp) return PasswordStrength.WEAK;
//        if(!lengthEnough && !containsNum && containsUpp) return PasswordStrength.WEAK;
//
//        if(!containsNum) return PasswordStrength.NORMAL;
//        if(!containsUpp) return PasswordStrength.NORMAL;
//        if(!lengthEnough) return PasswordStrength.NORMAL;

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
