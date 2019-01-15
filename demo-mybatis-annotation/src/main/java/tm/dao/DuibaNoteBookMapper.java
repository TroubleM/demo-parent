package tm.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Mapper;
import tm.bean.DuibaNoteBook;
import tm.provider.DuibaNoteBookProvider;

@Mapper
public interface DuibaNoteBookMapper {
    /**
     *
     * @mbg.generated 2018-12-28
     */
    @Delete("delete from duiba_note_book where id = #{id}")
    int deleteByPrimaryKey(Long id);

    @DeleteProvider(type = DuibaNoteBookProvider.class,method = "deleteDuibaNoteNookById")
    int deleteDuibaNoteBookById(Long id);

    /**
     *
     * @mbg.generated 2018-12-28
     */
    int insert(DuibaNoteBook record);

    /**
     *
     * @mbg.generated 2018-12-28
     */
    int insertSelective(DuibaNoteBook record);

    /**
     *
     * @mbg.generated 2018-12-28
     */
    DuibaNoteBook selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2018-12-28
     */
    int updateByPrimaryKeySelective(DuibaNoteBook record);

    /**
     *
     * @mbg.generated 2018-12-28
     */
    int updateByPrimaryKey(DuibaNoteBook record);
}