package GioiThieuBanThan;

public class Main {
    public static void main(String[] args) {

        System.out.println("Xin chào các bạn");

        String firstName;
        String lastName;

        firstName = "Quang";
        lastName = "Hiệp";

        System.out.println(firstName);
        System.out.println(lastName);

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        int age = 19;

        System.out.println("Xin chào các bạn, mình tên là " + fullName + ". Mình sinh năm "
                + (2022 - 19) + " và năm nay mình " + age + " tuổi" + ", giới tính nam"
                + ". Mình ở Hải Dương" + ". Hiện tại mình đang sống và làm việc tại Hà nội");
    }
}
