package tm.controller;

import com.tm.excel.entity.out.LeadingExcelResponse;
import com.tm.excel.framework.ExcelFactory;
import com.tm.excel.framework.ProduceExcelInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tm.excel.bean.DuibaBookLibraryExcelReadBean;
import tm.request.DuibaAdRequest;
import tm.response.DuibaAdPageResponse;
import tm.service.IDuibaAdService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @auther: zhangyi
 * @date: 2018/10/26
 * @Description: 对啊帮广告控制层
 */
@RestController
@RequestMapping("ad")
public class DuibaAdController {

    @Autowired
    private IDuibaAdService duibaAdService;


    /**
     * @Author zhangyi
     * @Description:
     * @Date 2018/10/26
     * @Param [duibaAdRequest]
     * @return tm.response.DuibaAdPageResponse
     **/
    @GetMapping("findDuibaAdList")
    public DuibaAdPageResponse findDuibaAdList(DuibaAdRequest duibaAdRequest) {
        return duibaAdService.findDuibaAdList(duibaAdRequest);
    }

    /**
     * @Author zhangyi
     * @Description:
     * @Date 2018/10/26
     * @Param [duibaAdRequest]
     * @return tm.response.DuibaAdPageResponse
     **/
    @GetMapping("excelTest")
    public Object excelTest() throws Exception {

        LeadingExcelResponse<DuibaBookLibraryExcelReadBean> leadingExcelResponse =
                ExcelFactory.writeExcelOfInputStream(new FileInputStream(
                new File("/Users/trouble-man/Documents/对啊帮-库图书-手动输入.xlsx")),
                DuibaBookLibraryExcelReadBean.class);

        return leadingExcelResponse;
    }

}
