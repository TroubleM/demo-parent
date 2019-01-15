package tm.provider;

import org.apache.ibatis.jdbc.SQL;

public class DuibaNoteBookProvider {

    /**
     * @Author zhangyi
     * @Description: 利用SQL对象动态生成sql语句
     * @Date  2019/1/15
     * @Param []
     * @return java.lang.String
     **/
    public String deleteDuibaNoteNookById() {
        SQL sql = new SQL();
        sql.DELETE_FROM("duiba_note_book");
        sql.WHERE("id = #{id}");
        return sql.toString();
    }

}
