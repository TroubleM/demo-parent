package tm.service;

/**
 * @auther: zhangyi
 * @date: 2019/1/15
 * @Description: 用户图书业务层
 */
public interface IDuibaNoteBookService {

    /**
     * @Author zhangyi
     * @Description: 根据id删除用户图书
     * @Date  2019/1/15
     * @Param [id]
     * @return java.lang.Integer
     **/
    Integer deleteDuibaNoteBookById(Long id);

    /**
     * @Author zhangyi
     * @Description: 根据id通过Sql对象删除用户图书
     * @Date  2019/1/15
     * @Param [id]
     * @return java.lang.Integer
     **/
    Integer deleteDuibaNoteNookByIdForSqlBean(Long id);

}
