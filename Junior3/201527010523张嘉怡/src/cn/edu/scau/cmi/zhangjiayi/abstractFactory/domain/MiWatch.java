package cn.edu.scau.cmi.zhangjiayi.abstractFactory.domain;

import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainAbstactClass.Watch;
import cn.edu.scau.cmi.zhangjiayi.abstractFactory.domainInterface.Mi;

public class MiWatch extends Watch implements Mi {
	@Override
	public void use()
	{
		System.out.println("小米手表");
		System.out.println("电子产品类型："+super.name+"品牌："+Mi.brand);
	}
}
