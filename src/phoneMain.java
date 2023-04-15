public class phoneMain {
    public static void main(String[] args) {
        PhonePoly p1 = new PhonePoly();
        PhoneComp newPhone = p1.phAccess("Samsung","galaxy s23 ultra");
        newPhone.Camera();
        newPhone.Lock(false);
        newPhone.softwareUpdate(4.3);
    }
}
