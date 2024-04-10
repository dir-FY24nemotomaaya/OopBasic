package campany;

public class ObjectSample {

    public static void main(String[] args) {
     // インスタンスの作成（鈴木さんver）
        var salesDepartment = new Departmennt("営業部", "xx", 1000000);
        Employee sales = new Sales("鈴木", salesDepartment, "課長", 100);

        // インスタンスメソッドの呼び出し
        sales.report();
        sales.report(2);
        sales.joinMeeting();

        
        // 1行空ける
        System.out.println("");

        // インスタンスの作成(田中さんver)
        var Departmennt = new Departmennt("開発部", "yy", 0);
        var engineer = new Engineer("田中", Departmennt, "一般社員", 88, "Java");

        // インスタンスメソッドの呼び出し
        engineer.report(); //基底クラスのメソッドも呼び出し可能
        engineer.joinMeeting();  //オーバーライドの結果を出力
        engineer.developSoftware(); //派生クラスで定義したメソッド
        
     // ポリモーフィズムの確認
        Employee projectManager = new Engineer("佐藤", Departmennt, "PM", 99, "Java");
        //varではなくEmployeeクラスを指定してEmployeeオブジェクト代入
        
        // インスタンスメソッドの呼び出し
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            // developSoftwareメソッドを呼び出す
            ((Engineer) projectManager).developSoftware();
        }
     // ----- 追記（ここから） -----
        // 1行空ける
        System.out.println("");

        // アルバイトインスタンスの作成
        var parttimeWorker = new ParttimeWorker("太田", salesDepartment);
        
        // 実装したメソッドの呼び出し
        ((Workable) sales).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();
        // ----- 追記（ここまで） -----

    }

}
