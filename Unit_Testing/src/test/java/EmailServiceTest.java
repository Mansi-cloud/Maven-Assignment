import static org.junit.Assert.*;

import org.junit.Test;
public class EmailServiceTest {
   @Test
    public void Test_getInstance_return_Single_Instance()
    {
        EmailService Expected_EmailService_Instance=EmailService.getInstance();

        EmailService actual_EmailService_Instance=EmailService.getInstance();

        assertEquals(Expected_EmailService_Instance,actual_EmailService_Instance);
    }


    @Test
   public void Send_Email_throws_exception_IF_no_CC_provided() {
        order neworder = new order();
        @SuppressWarnings("unused")
		EmailService emailService=EmailService.getInstance();
      
		assertThrows(RuntimeException.class, () -> EmailService.sendEmail(neworder));
    }

    @Test
   public  void SendEmail_Returns_True_If_Mail_Sent() {
        order newOrder = new order();
        String expected_CC="mansi.bhandari@tothenew.com";
        EmailService emailService=EmailService.getInstance();

        boolean mailSend=emailService.sendEmail(newOrder,expected_CC);

        assertTrue(mailSend);
    }
}
