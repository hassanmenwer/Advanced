package solid.srp;

import edu.najah.eng.solid.srp.classes.MailMessage;

public class Demo {
    private DB database = new DB();


    public void add() {
        database.insert();
        MailMessage mailMessage = new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
        this.sendEmail(mailMessage);
        database.closeConnectionToDatabase();
    }

    public void delete()  {
        database.delete();
        database.closeConnectionToDatabase();
    }

    public void sendEmail(MailMessage mailMessage)  {
        if (mailMessage.isValidMessage()){
            // Code for getting Email setting and send invoice mail
        } else {
            //show error message for the user
        }
    }
}
