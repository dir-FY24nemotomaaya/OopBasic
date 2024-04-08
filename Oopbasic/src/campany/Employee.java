package campany;

public class Employee {
    
    // フィールド(属性)の定義
    String name;
    String department;
    String position;
    int employeeId;

    // コンストラクターの定義＝インスタンスの初期化
    public Employee(String name, String department, String position, int employeeId) {
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

}
