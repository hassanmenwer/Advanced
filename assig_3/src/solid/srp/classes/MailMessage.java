package solid.srp.classes;

public class MailMessage extends Verify {
    private String mailAddressFrom;
    private String mailAddressTo;
    private String mailSubject;
    private String mailBody;


    public MailMessage(String mailAddressFrom, String mailAddressTo, String mailSubject, String mailBody) {
        if ((verifyMailAddressFrom(mailAddressFrom) == true)) {
            this.mailAddressFrom = mailAddressFrom;
        }

        if ((verifyMailAddressTo(mailAddressTo) == true)) {
            this.mailAddressTo = mailAddressTo;
        }

        if ((verifyMailSubject(mailSubject) == true)) {
            this.mailSubject = mailSubject;
        }

        if ((verifyMailBody(mailBody) == true)) {
            this.mailBody = mailBody;
        }
    }

    public boolean isValidMessage(){
        if(verifyMailAddressFrom(mailAddressFrom) == false){
            return false;
        }
        if(verifyMailAddressTo(mailAddressTo) == false){
            return false;
        }
        if(verifyMailSubject(mailSubject) == false){
            return false;
        }
        if(verifyMailBody(mailBody) == false){
            return false;
        }
        return true;
    }


}
