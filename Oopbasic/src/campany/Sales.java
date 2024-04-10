package campany;

public class Sales extends Employee {  //extends EmployeeでEmployeeクラスを継承
    
    // コンストラクター
    public Sales(String name, Departmennt department, String position, int employeeId) {
        super(name, department, position, employeeId);  //抽象クラスで定義したコンストラクターを呼出し
    }

    // 会議に参加するメソッド
    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("→営業として、上記の会議に参加します。部署：" + department.getName() + "名前：" + name);
    }

}
