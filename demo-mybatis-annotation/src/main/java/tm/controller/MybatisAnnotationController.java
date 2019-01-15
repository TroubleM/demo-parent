package tm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tm.service.IDuibaNoteBookService;

@RestController
@RequestMapping(value = "mybatisAnno")
public class MybatisAnnotationController {

    @Autowired
    private IDuibaNoteBookService duibaNoteBookService;

    /**
     * @Author zhangyi
     * @Description: 根据id删除用户图书
     * @Date  2019/1/15
     * @Param [id]
     * @return java.lang.Object
     **/
    @GetMapping(value = "test1")
    public Object test1(Long id){
        return duibaNoteBookService.deleteDuibaNoteBookById(id);
    }

    /**
     * @Author zhangyi
     * @Description: 根据id通过SQL对象动态生成sql语句删除用户图书
     * @Date  2019/1/15
     * @Param [id]
     * @return java.lang.Object
     **/
    @GetMapping(value = "test2")
    public Object test2(Long id){
        return duibaNoteBookService.deleteDuibaNoteNookByIdForSqlBean(id);
    }

}
