package tm.dao;


import tm.entity.DuibaAd;

/**
 * @auther: zhangyi
 * @date: 2018/10/26
 * @Description: 对啊帮广告数据层
 */
public interface DuibaAdMapper {
    /**
     *
     * @mbg.generated 2018-10-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-26
     */
    int insert(DuibaAd record);

    /**
     *
     * @mbg.generated 2018-10-26
     */
    int insertSelective(DuibaAd record);

    /**
     *
     * @mbg.generated 2018-10-26
     */
    DuibaAd selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2018-10-26
     */
    int updateByPrimaryKeySelective(DuibaAd record);

    /**
     *
     * @mbg.generated 2018-10-26
     */
    int updateByPrimaryKey(DuibaAd record);

}
