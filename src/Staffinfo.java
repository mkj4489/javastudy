

class Staff {
    String name;
    int staffid;
    String email;

    public void sayhello(){
        System.out.println("Hello " + this.name);
    }

    /*
    public Staff(String name, int staffid, String email) {
        super();
        this.name = name;
        this.staffid = staffid;
        this.email = email;
    }
    */

    public Staff(String name, int staffid, String email) {
        this.name = name;
        this.staffid = staffid;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getStaffid() {
        return staffid;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStaffid() {
        return staffid;
    }

    public void setStaffid(int staffid) {
        this.staffid = staffid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
*/
}
class RemoteStaff extends Staff {
    public String location;
    // コンストラクタ
    public RemoteStaff(String name, int staffid, String email) {
        super(name, staffid, email);
    }
}
public class Staffinfo {
    public static void main(String[] args) {
        Staff yamada = new Staff("Taro Yamada",12345, "yamada@abc.co.jp");
        RemoteStaff tanaka = new RemoteStaff("Hanako Tanaka", 123456, "tanaka@abc.co.jp");
        tanaka.location = "大阪";

        //yamada.sayhello();
        // System.out.println(yamada.name);
        System.out.println("[社員情報]");
        System.out.println("氏名：" + yamada.getName());
        System.out.println("社員番号：" + yamada.getStaffid());
        System.out.println("Email：" + yamada.getEmail());

        System.out.println("[社員情報]");
        System.out.println("氏名：" + tanaka.getName());
        System.out.println("社員番号：" + tanaka.getStaffid());
        System.out.println("Email：" + tanaka.getEmail());
        System.out.println("Email：" + tanaka.location);
    }

}
