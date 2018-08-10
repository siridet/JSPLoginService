/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callwsdl;
import test.GnLogin;
/**
 *
 * @author cas1
 */
public class CallWSDL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        loginByEmail("dddd", "123456", null, null);
    }

    private static void loginByEmail(java.lang.String email, java.lang.String password, javax.xml.ws.Holder<test.GnLogin> loginResponse, javax.xml.ws.Holder<Integer> returnCode) {
        test.Gndbss service = new test.Gndbss();
        test.GndbssPortType port = service.getGndbss();
        port.loginByEmail(email, password, loginResponse, returnCode);
    }
    
}
