package tm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tm.dao.DuibaNoteBookMapper;
import tm.service.IDuibaNoteBookService;

@Service
@Transactional
public class DuibaNoteBookService implements IDuibaNoteBookService {

    @Autowired
    private DuibaNoteBookMapper duibaNoteBookMapper;

    @Override
    public Integer deleteDuibaNoteBookById(Long id) {
        return duibaNoteBookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer deleteDuibaNoteNookByIdForSqlBean(Long id) {
        return duibaNoteBookMapper.deleteDuibaNoteBookById(id);
    }


}
