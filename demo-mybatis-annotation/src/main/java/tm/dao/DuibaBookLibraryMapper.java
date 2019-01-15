package tm.dao;

import org.apache.ibatis.annotations.Delete;
import tm.bean.DuibaBookLibrary;

public interface DuibaBookLibraryMapper {
    /**
     *
     * @mbg.generated 2019-01-04
     */
    @Delete("delete from ")
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2019-01-04
     */
    int insert(DuibaBookLibrary record);

    /**
     *
     * @mbg.generated 2019-01-04
     */
    int insertSelective(DuibaBookLibrary record);

    /**
     *
     * @mbg.generated 2019-01-04
     */
    DuibaBookLibrary selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated 2019-01-04
     */
    int updateByPrimaryKeySelective(DuibaBookLibrary record);

    /**
     *
     * @mbg.generated 2019-01-04
     */
    int updateByPrimaryKey(DuibaBookLibrary record);
}