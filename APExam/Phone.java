package APExam;

import java.util.ArrayList;

public class Phone {


    private ArrayList<App> allApps;

    public void updateRecentlyUsedApps()
    {
        for (App app : allApps) {
            if(app.getUsed() == true)
            {
                app.setNumTimes(app.getNumTimes() + 1);
            }
        }
    }

    public ArrayList<App> updateAppStatus()
    {
        ArrayList<App> leastused = new ArrayList<App>();

        for (App app : allApps) {
            if(app.getNumTimes() <= 5)
            {
                app.setRemovable(true);
                leastused.add(app);
            }
            else
            {
                app.setRemovable(false);
            }
        }

        return leastused;
    }


    public App 
    
}