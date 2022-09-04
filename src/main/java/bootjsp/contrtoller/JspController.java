package bootjsp.contrtoller;

import bootjsp.pojo.Worker;
import bootjsp.service.DepartmentService;
import bootjsp.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class JspController {
    @Autowired
    private WorkerService ws;
    @Autowired
    private DepartmentService ds;
    //验证登陆
    @GetMapping("/login")
    @ResponseBody
    public String login(Worker worker, ModelMap mm){
        Worker w = ws.login(worker);
        if(w == null){
            mm.addAttribute("error", "账号或密码错误");
            mm.addAttribute("worker",worker);
            //跳转登录页
            return "login";
        }else{
            //请求转发给查询全部
            return "redirect:/index";
        }
    }
    @GetMapping("/index")
    public String page1(Model model){
        model.addAttribute("list",ws.getWorkers());
        return "index";
    }
    @GetMapping("/delet")
    public String delet(int wid){
        int no = ws.delet(wid);
        if(no > 0){
            //删除成功，跳转到显示请求
            return  "redirect:/index";
        }else{
            return null;
        }
    }
    @GetMapping("/add")
    public String add(Worker worker){
        int no = ws.add(worker);
        if(no > 0){
            //保存成功，跳转到显示请求
            return  "redirect:/index";
        }
        return null;
    }
    @GetMapping(value = "/update")
    public String update(Worker worker) {
        int no = ws.update(worker);
        if (no > 0) {
            return "redirect:/index";
        } else {
            return null;
        }
    }
}
