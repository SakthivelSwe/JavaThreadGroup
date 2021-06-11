package ThreadGroup;

import javax.swing.*;

public class ThreadGroupEx {
    public static void main(String[] args){
        sampleThread sampleThread=new sampleThread();
        ThreadGroup projectX=new ThreadGroup("projectX");
        ThreadGroup uiTeam=new ThreadGroup(projectX,"uiTeam");
        ThreadGroup backEndTeam=new ThreadGroup(projectX,"backEndTeam");

        Thread t1=new Thread(projectX,sampleThread,"projectX Manager");
        Thread t2=new Thread(uiTeam,sampleThread,"uiTeam Member=sunil");
        Thread t3=new Thread(uiTeam,sampleThread,"uiTeam member=naresh");
        Thread t4=new Thread(uiTeam,sampleThread,"uiTema member=arul");
        Thread t5=new Thread(backEndTeam,sampleThread,"backendmember=varun");
        Thread t6=new Thread(backEndTeam,sampleThread,"backendmember=tharun");
        Thread t7=new Thread(backEndTeam,sampleThread,"backendmember=Riayz");
        Thread t8=new Thread(backEndTeam,sampleThread,"backendmember=sakthi");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

        //activecountmethod
        System.out.println("Thread project x is threadcount= "+projectX.activeCount());
        System.out.println("Thread project x is uiTeam count= "+uiTeam.activeCount());
        System.out.println("Thread project x is backendtema count= "+backEndTeam.activeCount());

        //activeGroupcountMethod
        System.out.println("Thread project x is groupcount= "+projectX.activeGroupCount());
        System.out.println("Thread projectx uiTeam groupcount= "+uiTeam.activeGroupCount());
        System.out.println("Thread projectx backendteam groupcount= "+backEndTeam.activeGroupCount());

        //getNameMethod
        System.out.println("Thread projectx manager getName= "+projectX.getName());
        System.out.println("Thread projectx uiteam getName= "+uiTeam.getName());
        System.out.println("Thread projectx backendteam getName= "+backEndTeam.getName());

        //getparantNameMethod
        System.out.println("Thread projectx manager getparentName= "+projectX.getParent().getName());
        System.out.println("Thread projectx uiTeam getParentName= "+uiTeam.getParent().getName());
        System.out.println("Thread  projextx backendTeam getParentName= "+backEndTeam.getParent().getName());
    }
}
