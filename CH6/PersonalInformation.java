package CH6;

public class PersonalInformation {
    String name;
    String address;
    int age;
    int phoneNumber;

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }
    public String getAddresss(){
        return address;
    }
    public int getAge(){
        return age;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void display(){
        System.out.print(getName() + " ");
        System.out.print(getAddresss() + " ");
        System.out.print(getAge() + " ");
        System.out.println(getPhoneNumber());
    }
    public static void main(String[] args){
        PersonalInformation myInfo = new PersonalInformation();
        PersonalInformation myFriend1 = new PersonalInformation();
        PersonalInformation myFriend2 = new PersonalInformation();

        myInfo.setName("Zubair");
        myInfo.setAddress("Hyd");
        myInfo.setAge(20);
        myInfo.setPhoneNumber(12345);

        myFriend1.setName("Ali");
        myFriend1.setAddress("Hyd");
        myFriend1.setAge(22);
        myFriend1.setPhoneNumber(123445);

        myFriend2.setName("Ali");
        myFriend2.setAddress("Hyd");
        myFriend2.setAge(19);
        myFriend2.setPhoneNumber(123456);

        myInfo.display();
        myFriend1.display();
        myFriend2.display();

    }
}
