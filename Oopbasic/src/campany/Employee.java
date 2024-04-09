package campany;

public class Employee {
    
    // フィールド(属性)の定義
    protected final String name;
    private final Departmennt department;
    private final String position;
    private final int employeeId;

    // コンストラクターの定義＝インスタンスの初期化
    public Employee(String name, Departmennt department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }

    // 報告メソッド
    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職：" + position + "、名前：" + name);
    }

    // 報告メソッド（オーバーロード）
    public void report() {
        report(1);
    }
    
 // 会議に参加するメソッド
    public void joinMeeting() {
        department.meeting();
        System.out.println("→上記の会議に参加します。部署：" + department.getName() + "名前：" + name);
    }

}
