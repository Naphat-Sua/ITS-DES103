package DES103_LAB02_PeopleID;

public class Address {
    //Properties
    String houseNo = "-";
    String soi = "-";
    String road = "-";
    String subDistrict = "-";
    String district = "-";
    String province = "-";
    String postcode = "-";
    //Constructor
    Address (String houseNo, String Soi, String Road, String subDistrict, String district, String province, String postcode) {
        this.houseNo = houseNo;
        this.soi = Soi;
        this.road = Road;
        this.subDistrict = subDistrict;
        this.district = district;
        this.province = province;
        this.postcode = postcode;
    }
    //Constructor 2
    Address (String province, String postcode) {
        this.province = province;
        this.postcode = postcode;
    }
    //Methods
    void printFullAddress() {
        System.out.println(houseNo +", " + soi +", " + road +", " + subDistrict +", " + district +", " + province +", " + postcode);
    }
    //Methods 2
    void printShortAddress() {
        System.out.println(district +", " + province);
    }
}