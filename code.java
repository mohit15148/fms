/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fms;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author mohit
 */
public class code extends JFrame implements ActionListener{
        JFrame f=new JFrame();
        JButton login=new JButton("LOGIN");
        JButton register=new JButton("REGISTER");
        JLabel heading = new JLabel("FACILITY MANAGEMENT SERVICE SYSTEM");
        Container c=f.getContentPane();
    code()
    {
        
    f.add(heading);
    heading.setVisible(true);
    heading.setBounds(250,150,360,40);
    login.setBounds(300,220,160,40);
    register.setBounds(300,300,160,40);
    f.add(register);
    f.add(login);
    login.addActionListener(this);
    register.addActionListener(this);
    f.setSize(800,600);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    //exitb.addActionListener(e -> System.exit(0));
 private void login()
{
    f.setVisible(false);
    JFrame second =new JFrame();
    second.setVisible(true);
    Container d=f.getContentPane();
    JButton username=new JButton("Username");
    JButton password=new JButton("password");
    JButton ok=new JButton("OK");
    ok.setVisible(true);
    second.add(ok);
    ok.setBounds(130,300,200,50);
    JTextField user =new JTextField();
    JTextField pass =new JTextField();
    second.add(user);
    second.add(pass);
    JLabel head=new JLabel("Login");
    second.add(username);
    second.add(password);
    second.add(head);
    head.setVisible(true);
    second.setLayout(null);
    second.setSize(500,500);
    head.setBounds(200,30,100,70);
    username.setBounds(60,100,150,50);
    password.setBounds(60,200,150,50);
    user.setBounds(240,100,150,50);
    pass.setBounds(240,200,150,50);
    user.setVisible(true);
    pass.setVisible(true);
    username.setVisible(true);
    password.setVisible(true);
}
 public void register()
 {
     f.setVisible(false);
     JFrame reg=new JFrame();
     Container d=reg.getContentPane();
     reg.setLayout(null);
     reg.setSize(500,730);
     reg.setVisible(true);
     JLabel newRegister=new JLabel("Registration Form");
     newRegister.setVisible(true);
     reg.add(newRegister);
     newRegister.setBounds(170,50,200,50);
     JButton registrationId=new JButton("Registration Id");
     registrationId.setBounds(50,120,150,50);
     registrationId.setVisible(true);
     reg.add(registrationId);
     JButton NAME=new JButton("NAME");
     NAME.setBounds(50,190,150,50);
     NAME.setVisible(true);
     reg.add(NAME);
     JButton USERNAME=new JButton("USERNAME");
     USERNAME.setBounds(50,260,150,50);
     USERNAME.setVisible(true);
     reg.add(USERNAME);
     JButton PASSWORD=new JButton("PASSWORD");
     PASSWORD.setBounds(50,330,150,50);
     PASSWORD.setVisible(true);
     reg.add(PASSWORD);
     JButton DOB=new JButton("DATE OF BIRTH");
     DOB.setBounds(50,400,150,50);
     DOB.setVisible(true);
     reg.add(DOB);
     JButton ADDRESS=new JButton("ADDRESS");
     ADDRESS.setBounds(50,470,150,50);
     ADDRESS.setVisible(true);
     reg.add(ADDRESS);
     JButton DEPARTMENT=new JButton("DEPARTMENT");
     DEPARTMENT.setBounds(50,540,150,50);
     DEPARTMENT.setVisible(true);
     reg.add(DEPARTMENT);
     JTextField Registrationid=new JTextField();
     Registrationid.setVisible(true);
     Registrationid.setBounds(240,120,150,50);
     reg.add(Registrationid);
     JTextField name=new JTextField();
     name.setVisible(true);
     name.setBounds(240,190,150,50);
     reg.add(name);
     JTextField username=new JTextField();
     username.setVisible(true);
     username.setBounds(240,260,150,50);
     reg.add(username);
     JTextField password=new JTextField();
     password.setVisible(true);
     password.setBounds(240,330,150,50);
     reg.add(password);
     JTextField dob=new JTextField();
     dob.setVisible(true);
     dob.setBounds(240,400,150,50);
     reg.add(dob);
     JTextField address=new JTextField();
     address.setVisible(true);
     address.setBounds(240,470,150,50);
     reg.add(address);
     JTextField department=new JTextField();
     department.setVisible(true);
     department.setBounds(240,540,150,50);
     reg.add(department);
     JButton RegisTer=new JButton("REGISTER");
     RegisTer.setBounds(150,610,150,50);
     RegisTer.setVisible(true);
     reg.add(RegisTer);   
 }
 protected void admin()
 {
     JFrame admin=new JFrame();
     Container d=admin.getContentPane();
     admin.setLayout(null);
     admin.setSize(500,730);
     admin.setVisible(true);
     JLabel adminHeading=new JLabel("Admin Section");
     adminHeading.setVisible(true);
     admin.add(adminHeading);
     adminHeading.setBounds(170,50,200,50);
     JButton staff=new JButton("Staff List");
     staff.setBounds(50,120,150,50);
     staff.setVisible(true);
     admin.add(staff);
     JButton task=new JButton("Assign Task");
     task.setBounds(50,190,150,50);
     task.setVisible(true);
     admin.add(task);
     JButton approval=new JButton("Pending Approvals");
     approval.setBounds(50,260,150,50);
     approval.setVisible(true);
     admin.add(approval);
     JButton supervisor=new JButton("Supervisor List");
     supervisor.setBounds(50,330,150,50);
     supervisor.setVisible(true);
     admin.add(supervisor);
     
 }
 protected void supervisor()
 {
     JFrame superv=new JFrame();
     Container d=superv.getContentPane();
     superv.setLayout(null);
     superv.setSize(500,730);
     superv.setVisible(true);
     JLabel superHeading=new JLabel("Suoervisor Section");
     superHeading.setVisible(true);
     superv.add(superHeading);
     superHeading.setBounds(170,50,200,50);
     JButton staff=new JButton("Staff List");
     staff.setBounds(50,120,150,50);
     staff.setVisible(true);
     superv.add(staff);
     JButton task=new JButton("Assign Task");
     task.setBounds(50,190,150,50);
     task.setVisible(true);
     superv.add(task);
     JButton approval=new JButton("Pending Approvals");
     approval.setBounds(50,260,150,50);
     approval.setVisible(true);
     superv.add(approval);
     JButton sendApprovals=new JButton("Send Approvals");
     sendApprovals.setBounds(50,330,150,50);
     sendApprovals.setVisible(true);
     superv.add(sendApprovals);
     JButton leave=new JButton("Apply For Leave");
     leave.setBounds(50,400,150,50);
     leave.setVisible(true);
     superv.add(leave);
     JButton taskReport=new JButton("Task Report");
     taskReport.setBounds(50,470,150,50);
     taskReport.setVisible(true);
     superv.add(taskReport);
 }
 protected void staff()
 {
     JFrame staf=new JFrame();
     Container d=staf.getContentPane();
     staf.setLayout(null);
     staf.setSize(500,730);
     staf.setVisible(true);
     JLabel staffHeading=new JLabel("Staff Section");
     staffHeading.setVisible(true);
     staf.add(staffHeading);
     staffHeading.setBounds(170,50,200,50);
     JButton logisticR=new JButton("Logistic Requirement");
     logisticR.setBounds(50,120,150,50);
     logisticR.setVisible(true);
     staf.add(logisticR);
     JButton status=new JButton("Recent Status");
     status.setBounds(50,190,150,50);
     status.setVisible(true);
     staf.add(status);
     JButton report=new JButton("Generate Task Report");
     report.setBounds(50,260,150,50);
     report.setVisible(true);
     staf.add(report);
     JButton stafS=new JButton("Staff Status");
     stafS.setBounds(50,330,150,50);
     stafS.setVisible(true);
     staf.add(stafS);
     JButton leave=new JButton("Apply For Leave");
     leave.setBounds(50,400,150,50);
     leave.setVisible(true);
     staf.add(leave);
     
 }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
       //mainpart(); //To change body of generated methods, choose Tools | Templates.
       if(e.getSource()==login)
       {
           String name="supervisor";
         login();
         if(name.equals("admin"))
         {
             
             admin();
         }
         if(name.equals("supervisor"))
         {
             
             supervisor();
         }
         
       }
       if(e.getSource()==register)
       {
           register();
       }
       
    }
   
   
    
    
}

