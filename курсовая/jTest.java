package plata;

import junit.framework.TestCase;
public class jTest extends TestCase {
		public void test() {
		plata testing = new plata();//������������ ������
		assertNotNull("����� ���������� ������� ����", testing.arrTf[6]);//��������, ��� ������ �� null
		assertNotNull("����� ����������� �������� ����", testing.arrTf[7]);//��������, ��� ������ �� null
		assertNotNull("����� ������������ ����", testing.arrTf[8]);//��������, ��� ������ �� null
	}

}
