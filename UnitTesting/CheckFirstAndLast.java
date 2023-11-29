package UnitTesting;

public class CheckFirstAndLast {
    public boolean check(String st){
        int len = st.length();
        if (len == 0)
            return true;
        return st.charAt(0) == st.charAt(st.length()-1);
    }
}
