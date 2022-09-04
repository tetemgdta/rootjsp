package bootjsp.service;



import bootjsp.pojo.Worker;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkerService {
    public List<Worker> getWorkers();
    public int add(Worker worker);
    //public int update(@Param("wname") String wname, @Param("wsex") String wsex, @Param("wtel") String wel, @Param("deptId") Integer deptId);
    public int update(Worker worker);
    public int delet(Integer wid);
    public Worker login(Worker worker);
}
