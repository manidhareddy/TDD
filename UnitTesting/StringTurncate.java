package UnitTesting;

public class StringTurncate {
    public String  turncateA(String st){
        if(st.length()> 2)
            return st.substring(0,2).replace("A","") + st.substring(2);
        return st.replace("A","");
    }
}
