package Clases;

import com.sun.mail.smtp.SMTPSendFailedException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnviarCorreo {

    public static void enviarCorreo(String to, String subject, String body) {
        final String username = "yormancaballero781@gmail.com";
        final String password = "aktj msky wmsx evob";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);

            // Configura el contenido como HTML
            message.setContent(body, "text/html");

            Transport.send(message);
            System.out.println("Correo enviado correctamente");

        } catch (SMTPSendFailedException e) {
            System.out.println("SMTP Send Failed: " + e);
            e.printStackTrace();
        } catch (MessagingException e) {
            System.out.println("Messaging Exception: " + e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
            e.printStackTrace();
        }
    }
}