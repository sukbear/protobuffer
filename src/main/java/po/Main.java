package po;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

public class Main {
public static void main(String[] args) {
	System.out.println("======������ʼ======");
	Demo.demo.Builder demoBuilder = Demo.demo.newBuilder();
	demoBuilder.setEmail("fuck");
	demoBuilder.setId(22);
	demoBuilder.setName("a yuan");
	Demo.demo demo = demoBuilder.build();
	System.out.println(demo.toString());
	System.out.println("======��������======");
	System.out.println();
	System.out.println();
	
	System.out.println("===== ʹ��demo�����л����ɶ���ʼ =====");
	Demo.demo d = null;
	try {
		d = Demo.demo.parseFrom(demo.toByteArray());
	} catch (InvalidProtocolBufferException e) {
		e.printStackTrace();
	}
	System.out.println(d.toString());
	System.out.println("===== ʹ��demo�����л����ɶ������ =====");
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("===== ʹ��demoת��json����ʼ =====");
	String jsonFormatM = "";
	try {
		jsonFormatM = JsonFormat.printer().print(d);
	} catch (InvalidProtocolBufferException e) {
		e.printStackTrace();
	}
	System.out.println(jsonFormatM.toString());
	System.out.println("===== ʹ��demoת��json������� =====");
}
}
