package plata;

import junit.framework.TestCase;
public class jTest extends TestCase {
		public void test() {
		plata testing = new plata();//Присваивание класса
		assertNotNull("Объем потрачнной горячей воды", testing.arrTf[6]);//Проверка, что объект не null
		assertNotNull("Объем потраченной холодной воды", testing.arrTf[7]);//Проверка, что объект не null
		assertNotNull("Объем потраченного газа", testing.arrTf[8]);//Проверка, что объект не null
	}

}
