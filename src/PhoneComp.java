public class PhoneComp {
    int price;
    public void Camera(){}
    public void Lock(boolean yes){}
    public void softwareUpdate(double version){}
    public void voiceAssistant(){}

}
class iPhone extends PhoneComp{
    private iphone14pm ip14pm;
    private iphone14 ip14;
    private iphone13pm ip13pm;
    private iphone13 ip13;
    private iphone12pm ip12pm;
    private iphone12 ip12;
    private iphone11pm ip11pm;
    private iphone11 ip11;
    private iphonese ipse;
    private String model;

    public iPhone(String model){
        ip14pm = new iphone14pm();
        ip14 = new iphone14();
        ip13pm = new iphone13pm();
        ip13 = new iphone13();
        ip12pm = new iphone12pm();
        ip12 = new iphone12();
        ip11pm = new iphone11pm();
        ip11 = new iphone11();
        ipse = new iphonese();
        this.model=model;
    }
    public void Camera(){
        String check = model.toLowerCase();
        switch (check){
            case "iphone 14 pro max" -> ip14pm.camera();
            case "iphone 14" -> ip14.camera();
            case "iphone 13 pro max" -> ip13pm.camera();
            case "iphone 13" -> ip13.camera();
            case "iphone 12 pro max" -> ip12pm.camera();
            case "iphone 12" -> ip12.camera();
            case "iphone 11 pro max" -> ip11pm.camera();
            case "iphone 11" -> ip11.camera();
            case "iphone se" -> ipse.camera();
        }
    }
    public void Lock(boolean yes){
        String check = model.toLowerCase();
        switch (check){
            case "iphone 14 pro max" -> ip14pm.Lock(yes);
            case "iphone 14" -> ip14.Lock(yes);
            case "iphone 13 pro max" -> ip13pm.Lock(yes);
            case "iphone 13" -> ip13.Lock(yes);
            case "iphone 12 pro max" -> ip12pm.Lock(yes);
            case "iphone 12" -> ip12.Lock(yes);
            case "iphone 11 pro max" -> ip11pm.Lock(yes);
            case "iphone 11" -> ip11.Lock(yes);
            case "iphone se" -> ipse.Lock(yes);
        }
    }
    public void softwareUpdate(double version){
        String check = model.toLowerCase();
        switch (check){
            case "iphone 14 pro max" -> ip14pm.softwareUpdate(version);
            case "iphone 14" -> ip14.softwareUpdate(version);
            case "iphone 13 pro max" -> ip13pm.softwareUpdate(version);
            case "iphone 13" -> ip13.softwareUpdate(version);
            case "iphone 12 pro max" -> ip12pm.softwareUpdate(version);
            case "iphone 12" -> ip12.softwareUpdate(version);
            case "iphone 11 pro max" -> ip11pm.softwareUpdate(version);
            case "iphone 11" -> ip11.softwareUpdate(version);
            case "iphone se" -> ipse.softwareUpdate(version);
        }
    }
    public void voiceAssistant(){
        String check = model.toLowerCase();
        switch (check){
            case "iphone 14 pro max" -> ip14pm.voiceAssistant();
            case "iphone 14" -> ip14.voiceAssistant();
            case "iphone 13 pro max" -> ip13pm.voiceAssistant();
            case "iphone 13" -> ip13.voiceAssistant();
            case "iphone 12 pro max" -> ip12pm.voiceAssistant();
            case "iphone 12" -> ip12.voiceAssistant();
            case "iphone 11 pro max" -> ip11pm.voiceAssistant();
            case "iphone 11" -> ip11.voiceAssistant();
            case "iphone se" -> ipse.voiceAssistant();
        }
    }


}
class Samsung extends PhoneComp{
    private Galaxys23u gs23u;
    private Galaxys22u gs22u;
    private Galaxys21u gs21u;
    private GalaxyNote gnote;
    private GalaxyA71 ga71;
    private GalaxyA53 ga53;
    String model;
    public Samsung(String model){
        gs23u = new Galaxys23u();
        gs22u = new Galaxys22u();
        gs21u = new Galaxys21u();
        gnote = new GalaxyNote();
        ga71 = new GalaxyA71();
        ga53 = new GalaxyA53();
        this.model=model;
    }
    public void Camera(){
        String check = model.toLowerCase();
        switch (check){
            case "galaxy s23 ultra" -> gs23u.camera();
            case "galaxy s22 ultra" -> gs22u.camera();
            case "galaxy s21 ultra" -> gs21u.camera();
            case "galaxy note" -> gnote.camera();
            case "galaxy a71" -> ga71.camera();
            case "galaxy a53" -> ga53.camera();
        }
    }
    public void Lock(boolean yes){
        String check = model.toLowerCase();
        switch (check){
            case "galaxy s23 ultra" -> gs23u.Lock(yes);
            case "galaxy s22 ultra" -> gs22u.Lock(yes);
            case "galaxy s21 ultra" -> gs21u.Lock(yes);
            case "galaxy note" -> gnote.Lock(yes);
            case "galaxy a71" -> ga71.Lock(yes);
            case "galaxy a53" -> ga53.Lock(yes);
        }
    }
    public void softwareUpdate(double version){
        String check = model.toLowerCase();
        switch (check){
            case "galaxy s23 ultra" -> gs23u.softwareUpdate(version);
            case "galaxy s22 ultra" -> gs22u.softwareUpdate(version);
            case "galaxy s21 ultra" -> gs21u.softwareUpdate(version);
            case "galaxy note" -> gnote.softwareUpdate(version);
            case "galaxy a71" -> ga71.softwareUpdate(version);
            case "galaxy a53" -> ga53.softwareUpdate(version);
        }
    }
    public void voiceAssistant(){
        String check = model.toLowerCase();
        switch (check){
            case "galaxy s23 ultra" -> gs23u.voiceAssistant();
            case "galaxy s22 ultra" -> gs22u.voiceAssistant();
            case "galaxy s21 ultra" -> gs21u.voiceAssistant();
            case "galaxy note" -> gnote.voiceAssistant();
            case "galaxy a71" -> ga71.voiceAssistant();
            case "galaxy a53" -> ga53.voiceAssistant();
        }
    }


}