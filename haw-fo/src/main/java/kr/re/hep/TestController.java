package kr.re.hep;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class TestController {

	@RequestMapping("/abc.do")
	public String main(){
		return "/index";
	}
}
