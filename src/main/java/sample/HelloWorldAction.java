package sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *  HelloWorldAction Javaクラス
 *  @author miya
 */
public class HelloWorldAction {
	/** ログ出力用のプライベート変数 */
    private Logger logger = LogManager.getLogger(HelloWorldAction.class);

    /** 名前 */
    private String name;

    /**
     * [アクション実行処理]<br>
     * HelloWorldを出力する処理を実行する。<br>
     * 実行するメソッドは、struts.xmlで指定したメソッド名を使用して実装する。<br>
     * Struts2ではアクションの処理結果でページの遷移先を決定するが、
     * 今回は"success"の固定文字列を返却する。<br>
     * <br>
     * @return
     */
    public String execute() {
        logger.info("入力されたパラメータは「{}」です。", name);
        return "success";
    }

    /**
     * NameのGetter関数
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * NameのSetter関数
     * @param name 名前
     */
    public void setName(String name) {
        this.name = name;
    }
}
