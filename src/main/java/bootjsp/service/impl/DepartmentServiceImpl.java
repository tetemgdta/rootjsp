package bootjsp.service.impl;

import bootjsp.mapper.DepartmentMapper;
import bootjsp.pojo.Department;
import bootjsp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentMapper dm;

    @Override
    public List<Department> getAll() {
        return dm.selectList(null);
    }
}
