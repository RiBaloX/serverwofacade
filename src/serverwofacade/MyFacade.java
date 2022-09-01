
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

/**
 *
 * @author kant2
 */
public class MyFacade {
    private static MyFacade myFacadeObject = null;
    private MyFacade(){
        
    }
    public static MyFacade getMyFacadeObject(){
        if(myFacadeObject == null){
            myFacadeObject = new MyFacade();
        }
        return myFacadeObject;
    }
    public void classScheduleServer(){
        ScheduleServer  schedule = new ScheduleServer();
        schedule.startBooting();
	schedule.readSystemConfigFile();
	schedule.init();
	schedule.initializeContext();
	schedule.initializeListeners();
	schedule.createSystemObjects();
	System.out.println("Start working......");
	System.out.println("After work done.........");
	schedule.releaseProcesses();
	schedule.destory();
	schedule.destroySystemObjects();
	schedule.destoryListeners();
	schedule.destoryContext();
	schedule.shutdown();
    }
}
