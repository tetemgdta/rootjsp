package bootjsp.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("worker")
public class Worker {
    @TableId("wid")
    private Integer wid;
    private String wname;
    private String wsex;
    private String wtel;
    private Integer deptid;
    //private String wimg;

    @TableField(exist = false)
    private Department department;
}
