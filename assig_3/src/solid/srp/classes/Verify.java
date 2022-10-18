package solid.srp.classes;

public class Verify {

    boolean verifyMailAddressFrom(String AddressFrom){
        if(AddressFrom != null && !AddressFrom.isEmpty() && AddressFrom.contains("@") && AddressFrom.contains(".")){
            return true;
        }
        return false;
    }

    boolean verifyMailAddressTo(String mailAddressTo){
        if(mailAddressTo != null && !mailAddressTo.isEmpty() && mailAddressTo.contains("@") && mailAddressTo.contains(".")){
            return true;
        }
        return false;
    }

    boolean verifyMailSubject(String mailSubject){
        if(mailSubject != null && !mailSubject.isEmpty() && mailSubject.length() <= 30) {
            return true;
        }
        return false;
    }

    boolean verifyMailBody(String mailBody) {
        if(mailBody != null && !mailBody.isEmpty()){
            return true;
        }
        return false;
    }

}
