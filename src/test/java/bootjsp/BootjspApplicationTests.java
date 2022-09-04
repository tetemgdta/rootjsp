package bootjsp;

import bootjsp.pojo.Worker;
import bootjsp.service.WorkerService;
import com.sun.corba.se.spi.orbutil.threadpool.Work;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootjspApplicationTests {
    @Autowired
    private WorkerService ws;

    @Test
    void contextLoads() {
        //System.out.println(ws.getWorkers());
        Worker w = new Worker(28, "李四", "男", "123456", 102,null);
        System.out.println(ws.update(w));
    }

}
