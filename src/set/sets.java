package set;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;import javax.naming.ldap.HasControls;

public class sets {

	public static void main(String[] args) {
			
		
	Map<String,String> aNum=new TreeMap();
	aNum.put("ȫ�浿", "010-8520-7123");
	aNum.put("������", "010-1234-5678");
	aNum.put("�̼���", "010-9876-5432");
	
	
	Map<String,String> bNum=new TreeMap();
	bNum.put("������", "010-9898-9898");
	bNum.put("�迬��", "010-2580-1479");
	bNum.put("���缮", "010-8888-8888");
	
	Map<String,Map<String,String>> Phone=new TreeMap<String, Map<String,String>>();
	
	Phone.put("A��",aNum);
	Phone.put("B��", bNum);
	
	Set<String> set=Phone.keySet();
	Iterator<String> it1=set.iterator();
	
	while(it1.hasNext()) {
		String pkey=it1.next();
		System.out.print(pkey);
		Map<String,String> pvalue=Phone.get(pkey);
		
		Set<String> Class= pvalue.keySet();
		Iterator<String> it2=Class.iterator();
		while(it2.hasNext()) {
			String name=it2.next();
			String pb=pvalue.get(name);
			System.out.println(name+":"+pb);
		}
		
	}
	System.out.println();
	
	}
	

}
