package tm.service.impl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import tm.condition.DuibaAdCondition;
import tm.dao.DuibaAdMapper;
import tm.request.DuibaAdRequest;
import tm.response.DuibaAdPageResponse;
import tm.service.IDuibaAdService;
import tm.vo.DuibaAdVo;

@Service
@Transactional
public class DuibaAdService implements IDuibaAdService {

    @Autowired
    private DuibaAdMapper duibaAdMapper;

    @Override
    public DuibaAdPageResponse findDuibaAdList(DuibaAdRequest duibaAdRequest) {

        // 返回参数
        DuibaAdPageResponse duibaAdPageResponse = new DuibaAdPageResponse();

        // pageHelper参数设置
        PageHelper.startPage(duibaAdRequest.getPageNum(), duibaAdRequest.getPageSize());

        // 查询参数创建
        DuibaAdCondition duibaAdQuery = new DuibaAdCondition();

        BeanUtils.copyProperties(duibaAdRequest, duibaAdQuery);

        // 分页详情返回
        Page<DuibaAdVo> duibaAdPage = duibaAdMapper.findDuibaAdList(duibaAdQuery);

        // 直接设置列表返回
        List<DuibaAdVo> duibaAdVos = duibaAdMapper.findDuibaAdList(duibaAdQuery);

        duibaAdPageResponse.setDuibaAdVos(duibaAdVos);

        duibaAdPageResponse.setPageNum(duibaAdPage.getPageNum());

        duibaAdPageResponse.setPages(duibaAdPage.getPages());

        duibaAdPageResponse.setPageSize(duibaAdPage.getPageSize());

        duibaAdPageResponse.setTotal(duibaAdPage.getTotal());

        // 事例Map枚举结果返回
        Map<Integer, Integer> resultEnumMap = duibaAdPage.getResult()
                .stream()
                .collect(Collectors.toMap(DuibaAdVo::getId, DuibaAdVo::getId));
        duibaAdPageResponse.setDuibaAdEnumMap(resultEnumMap);

        // 事例:从广告列表中筛选广告链接不为空,且广告位id为6的广告列表
        duibaAdPage.getResult()
                .stream()
                .filter(duibaAdVo -> !StringUtils.isEmpty(duibaAdVo.getAdLink())).forEach(duibaAdVo -> { if ("6".equals(duibaAdVo.getAdId())) {
                    System.out.println(duibaAdVo.getAdImgUrl());
                    }
                });

        // 事例：将查询结果的广告id相加
        AtomicReference<Integer> atomicReference = new AtomicReference<>();
        atomicReference.set(0);

        duibaAdVos.stream()
                .filter(duibaAdVo -> !StringUtils.isEmpty(duibaAdVo.getAdId()))
                .forEach(duibaAdVo -> {
                    atomicReference.set(atomicReference.get() + duibaAdVo.getId());
                });
        System.out.println(atomicReference.get());
        return duibaAdPageResponse;
    }
}
