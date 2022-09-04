package bootjsp.service.impl;

import bootjsp.mapper.WorkerMapper;
import bootjsp.pojo.Worker;
import bootjsp.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerMapper wm;


    @Override
    public List<Worker> getWorkers() {
        return wm.selectList(null);
    }

    @Override
    public int add(Worker worker) {
        return wm.insert(worker);
    }

    @Override
    public int update(Worker worker) {

        return wm.updateById(worker);
    }

    @Override
    public int delet(Integer wid) {
        return wm.deleteById(wid);
    }

    @Override
    public Worker login(Worker worker) {
        //SqlSession session = DBUtil.getSession();
        //orkerMapper wm = session.getMapper(WorkerMapper.class);
        Worker dbWorker =wm.login(worker);
        if(dbWorker==null){
            return null;
        }
        if(dbWorker.getWname().equals(worker.getWname()) ){
            return dbWorker;
        }else{
            return null;
        }
    }

}
