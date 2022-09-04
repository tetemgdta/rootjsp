package bootjsp.mapper;


import bootjsp.pojo.Worker;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkerMapper extends BaseMapper<Worker> {
      public List<Worker> getWorkers();
      public int update(Worker worker);
      public Worker login(Worker worker);
//      public int add(Worker worker);

}
