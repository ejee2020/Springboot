package health.weightlifting.controller;
import health.weightlifting.Service.ExerciseService;
import health.weightlifting.Service.MemberService;
import health.weightlifting.Service.WeightService;
import health.weightlifting.dto.PageRequestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/main")
@Log4j2
@RequiredArgsConstructor
public class MainController {
    private final WeightService weightService;
    private final MemberService memberService;
    @GetMapping("/list")
    public void list(Model model){

    }
}
