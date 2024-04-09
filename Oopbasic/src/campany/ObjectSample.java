package campany;

public class ObjectSample {

    public static void main(String[] args) {
     // インスタンスの作成
        var department = new Departmennt("営業部", "xx", 1000000);
        var employee = new Employee("鈴木", department, "課長", 100);

        // インスタンスメソッドの呼び出し
        employee.report();
        employee.report(2);
        
        // 1行空ける
        System.out.println("");

        // インスタンスの作成
        var Departmennt = new Departmennt("開発部", "yy", 0);
        var engineer = new Employee("田中", Departmennt, "一般社員", 88);

        // インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();

    }

}
