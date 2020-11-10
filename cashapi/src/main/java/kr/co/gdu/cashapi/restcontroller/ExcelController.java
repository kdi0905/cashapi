package kr.co.gdu.cashapi.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExcelController {
	@GetMapping(path="/cashListExcel" ,produces ="application/vnd.ms-excel") //path ="리턴" , produces 액셀파일로 요청
	public String cashListExcel() {
		return "cashListExcel";  //액셀 view 로 리턴
	}
}
