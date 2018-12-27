package tm.producer.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import tm.condition.DuibaAdCondition;
import tm.dao.DuibaAdMapper;
import tm.service.DuibaAdProducer;

@Service("duibaAdProducer")
public class DuibaAdProducerImpl implements DuibaAdProducer {

    @Autowired
    private DuibaAdMapper duibaAdMapper;

    @Override
    public String findDuibaAdList() {
        DuibaAdCondition duibaAdCondition = new DuibaAdCondition();
        duibaAdCondition.setTerminal(0);
        return JSONObject.toJSONString(duibaAdMapper.findDuibaAdList(duibaAdCondition));
    }
}
