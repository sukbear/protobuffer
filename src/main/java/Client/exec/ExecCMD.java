package Client.exec;
import java.io.IOException;
import java.lang.Runtime;
public class ExecCMD {
     static String strCmd = "D:\\weixin\\WeChat\\WeChat.exe";
     static void exe() {
    	 try {
			Runtime.getRuntime().exec(strCmd);
			System.out.println("ok");
		} catch (IOException e) {
			e.printStackTrace();
		}
     }
}
