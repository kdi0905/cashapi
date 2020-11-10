package kr.co.gdu.cashapi.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

@Component("cashListExcel")//CashListExcel x= new CashListExcel();
public class CashListExcel extends AbstractXlsView {//액셀파일 객체 만들기

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//응답 body의 내용을 파일로 전송(파일이름: cash_list.xls)
		
		//CashList를 가지고 와서 엑셀 파일 생성
		//매개변수로 입력받은 workbook(액셀파일객체)에 첫번째 시트를 접근//생성
		 // 응답 body의 내용을 파일로 전송(파일이름은 cash_list.xml)
		response.setHeader("Content-Disposition", "attachment; filename=\"cash_list.xls\"");
		// 1. 엑셀 시트 생성
		Sheet sheet = workbook.createSheet("sheet1"); // 매개변수로 입력받은 엑셀빈객체Workbook에 시트 생성
		// 2. 시트에 첫번째(인덱스 0) 행을 접근
		Row row0 = sheet.createRow(0);
		// 3. 첫번째 행의 첫번째 셀(인덱스 0) 접근
		Cell cell0 = row0.createCell(0);
		// 4. 첫번째 행의 첫번째 셀에 문자열 값 입력
		cell0.setCellValue("이름");
		// 5. 첫번째 행의 두번째 셀(인덱스 1) 접근
		Cell cell1 = row0.createCell(1);
		// 6. 첫번째 행의 두번째 셀에 문자열 값 입력
		cell1.setCellValue("GooDee");
		// 1~6 행과셀을 접근하는 코드를 반복하여 엑셀파일에 내용을 입력

	}
	
}
