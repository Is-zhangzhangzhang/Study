package cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Phone;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainInterface.Apple;

public class ApplePhone extends Phone implements Apple {
	@Override
	public void use()
	{
		System.out.println("苹果手机");
		System.out.println("电子产品类型："+super.name+"品牌："+Apple.brand);
	}
}
