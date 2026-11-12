public class Owner {
    private String ownerId;
    private String name;
    private String cnic;
    private String phone;
    private String email;
    private String address;

    public Owner(String ownerId, String name, String cnic, String phone, String email, String address) {
        this.ownerId = ownerId;
        this.name = name;
        this.cnic = cnic;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getOwnerId() { return ownerId; }
    public String getName()    { return name; }
    public String getCnic()    { return cnic; }
    public String getPhone()   { return phone; }
    public String getEmail()   { return email; }
    public String getAddress() { return address; }

    public void displayDetails() {
        System.out.println("Owner ID : " + ownerId);
        System.out.println("Name     : " + name);
        System.out.println("CNIC     : " + cnic);
        System.out.println("Phone    : " + phone);
        System.out.println("Email    : " + email);
        System.out.println("Address  : " + address);
    }
}