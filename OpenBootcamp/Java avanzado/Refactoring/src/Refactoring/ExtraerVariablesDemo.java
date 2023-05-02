package Refactoring;

public class ExtraerVariablesDemo {
    public static void main(String[] args) {
        esOpenJDKEnOs();
        System.out.println(System.getProperty("java.runtime.name"));
        System.out.println(System.getProperty("os.version"));
    }
    public static boolean esOpenJDKEnOs(){

        boolean runtimeOracle= System.getProperty("java.runtime.name").contains("OpenJDK");
        boolean osVersion=System.getProperty("os.version").compareTo("10.0")==0 ?true : false;

                if(runtimeOracle && osVersion){
                    System.out.println("EsOracleJVM en Windows");
                    return true;
                }
        return false;
//        if(System.getProperty("java.runtime.name").contains("Oracle")
//            && System.getProperty("os.version").compareTo("11.6")==0) {
//            return true;
//        }
//
//        return false;
    }
}
