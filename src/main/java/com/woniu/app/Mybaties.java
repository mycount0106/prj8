package com.woniu.app;




import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Mybaties {
	
	public void generator() throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		// ָ�� ���򹤳������ļ�
		File configFile = new File("src/main/resources/Mybatis.xml");   // <<--����Ҫ�ģ�����ʵ�������
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback, warnings);
		myBatisGenerator.generate(null);
		
		System.out.println("over");
	}
	
	public static void main(String[] args) throws Exception {
		try {
			Mybaties t = new Mybaties();
			t.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}