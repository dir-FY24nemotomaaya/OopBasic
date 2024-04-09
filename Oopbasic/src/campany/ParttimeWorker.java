package campany;

public class ParttimeWorker implements Workable{  //インタフェースの記述
    // フィールド
    protected final String name;
    private final Departmennt department;

    // コンストラクター
    public ParttimeWorker(String name, Departmennt department) {
        this.name = name;
        this.department = department;
    }
    
    // 働くメソッドを実装
    @Override
    public void work() {
        System.out.println("アルバイトとして働きます。名前：" + name + slogan);
    }

}
