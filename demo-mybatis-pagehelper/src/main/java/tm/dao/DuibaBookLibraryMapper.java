package tm.dao;

import tm.entity.DuibaBookLibrary;

public interface DuibaBookLibraryMapper {
    /**
     *
     * @mbg.generated 2019-01-04
     */
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