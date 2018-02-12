package com.chenyu.ssm.util;


import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.Properties;


/**
 * Java Mail 工具类
 *
 * @author XueQi
 * @version 1.0
 *
 */
public class SendEmailZ {

    public static final String host= "smtp.163.com";//GetData.getSystemEmail().getSentMailServal();
    public static final String username="m15927493776@163.com";//GetData.getSystemEmail().getEmailName();
    public static final String password="chenmiao19940212";//GetData.getSystemEmail().getEmailPassword();
    public static final String from="m15927493776@163.com"; // GetData.getSystemEmail().getSenderName();


    /**
     * 发送邮件
     *
     * @param to
     *            收件人列表，以","分割
     * @param subject
     *            标题
     * @param body
     *            内容
     * @param filepath
     *            附件列表,无附件传递null
     * @return
     * @throws MessagingException
     * @throws AddressException
     * @throws UnsupportedEncodingException
     */
    public static boolean sendMail(String to, String subject, String body,
                                   List<String> filepath) throws AddressException, MessagingException,
            UnsupportedEncodingException {
        String nick= "狮子来了国际旅行社";
        // 参数修饰
        if (body == null) {
            body = "";
        }
        if (subject == null) {
            subject = "无主题";
        }
        // 创建Properties对象
        Properties props = System.getProperties();
        // 创建信件服务器
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true"); // 通过验证
        // 得到默认的对话对象
        Session session = Session.getDefaultInstance(props, null);
        // 创建一个消息，并初始化该消息的各项元素
        MimeMessage msg = new MimeMessage(session);
        nick = MimeUtility.encodeText(nick);
        msg.setFrom(new InternetAddress(nick + "<" + from + ">"));
        // 创建收件人列表
        if (to != null && to.trim().length() > 0) {
            String[] arr = to.split(",");
            int receiverCount = arr.length;
            if (receiverCount > 0) {
                InternetAddress[] address = new InternetAddress[receiverCount];
                for (int i = 0; i < receiverCount; i++) {
                    address[i] = new InternetAddress(arr[i]);
                }
                msg.addRecipients(Message.RecipientType.TO, address);
                msg.setSubject(subject);
                // 后面的BodyPart将加入到此处创建的Multipart中
                Multipart mp = new MimeMultipart();
                // 附件操作
                if (filepath != null && filepath.size() > 0) {
                    for (String filename : filepath) {
                        MimeBodyPart mbp = new MimeBodyPart();
                        // 得到数据源
                        FileDataSource fds = new FileDataSource(filename);
                        // 得到附件本身并至入BodyPart
                        mbp.setDataHandler(new DataHandler(fds));
                        // 得到文件名同样至入BodyPart
                        mbp.setFileName(fds.getName());
                        mp.addBodyPart(mbp);
                    }
                    MimeBodyPart mbp = new MimeBodyPart();
                    mbp.setText(body);
                    mp.addBodyPart(mbp);
                    // 移走集合中的所有元素
                    filepath.clear();
                    // Multipart加入到信件
                    msg.setContent(mp);
                } else {
                    // 设置邮件正文
                    msg.setContent(body, "text/html;charset=UTF-8");
                }
                // 设置信件头的发送日期
                msg.setSentDate(new Date());
                msg.saveChanges();
                // 发送信件
                Transport transport = session.getTransport("smtp");
                transport.connect(host, username, password);
                transport.sendMessage(msg,
                        msg.getRecipients(Message.RecipientType.TO));
                transport.close();
                return true;
            } else {
                System.out.println("None receiver!");
                return false;
            }
        } else {
            System.out.println("None receiver!");
            return false;
        }
    }

    /*public static void main(String[] args) throws AddressException,
            UnsupportedEncodingException, MessagingException {
        List<String> filepath = new ArrayList<>();
        filepath.add("C:\\Users\\Public\\Music\\Sample Music\\1.mp3");
        filepath.add("D:\\360安全浏览器下载\\shizilaile1.sql");
        sendMail("1458714279@qq.com,17612776310@163.com", "注册信息邮件", "注册邮件，有附件",
                filepath);
    }*/

   /* public static void main(String[] args) throws AddressException,
            UnsupportedEncodingException, MessagingException {
        List<String> filepath = new ArrayList<>();
        filepath.add("C:\\Users\\Public\\Music\\Sample Music\\1.mp3");
        filepath.add("D:\\360安全浏览器下载\\shizilaile1.sql");
        sendMail("1458714279@qq.com,17612776310@163.com", "注册信息邮件", "注册邮件，有附件",
                filepath);
    }*/
}

