package jdbc;

import java.util.ArrayList;

public class EmailListDaoTest {

	public static void main(String[] args) {
		
		insertTest();
		fetchListTest();
	}
	
	public static void insertTest() {
		EmailListDao dao = new EmailListDao();
		
		EmailListVo vo = new EmailListVo();
		vo.setLasttName("고");
		vo.setFirstName("둘리");
		vo.setEmail("hoihoi2@gmail.com");
		
		dao.insert(vo);
	}
	
	public static void fetchTest() {
		EmailListDao dao  = new EmailListDao();
		EmailListVo vo = dao.fetch(2);
		
		System.out.println(vo.toString());
	}
	
	public static void fetchListTest() {
		EmailListDao dao = new EmailListDao() ;
		ArrayList<EmailListVo> list = dao.fetchList();
		
		//순회
		/*int count = list.size();
		for(int i = 0; i < count; i++) {
			EmailListVo vo = list.get(i);
			System.out.println(vo);
		}*/
		
		//순회2
		for(EmailListVo vo : list) {
			System.out.println(vo);
		}
		
	}

}
