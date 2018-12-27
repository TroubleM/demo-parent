package tm.dao;

import com.github.pagehelper.Page;

import tm.entity.DuibaAd;
import tm.condition.DuibaAdCondition;
import tm.vo.DuibaAdVo;

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

    /**
     * @Author zhangyi
     * @Description: 分页查询广告信息
     * @Date 2018/10/26
     * @Param [duibaAdQuery]
     * @return com.github.pagehelper.Page<tm.vo.DuibaAdVo>
     **/
    Page<DuibaAdVo> findDuibaAdList(DuibaAdCondition duibaAdQuery);
}
