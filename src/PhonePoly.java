public class PhonePoly {
    public PhoneComp phAccess(String type, String model){
        if(type.equalsIgnoreCase("iphone")){
            return new iPhone(model);
        }
        else if(type.equalsIgnoreCase("Samsung")){
            return new Samsung(model);
        }
        else{
            return null;
        }
    }
}
