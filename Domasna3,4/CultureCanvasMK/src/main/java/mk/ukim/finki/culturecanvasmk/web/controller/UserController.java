package mk.ukim.finki.culturecanvasmk.web.controller;

import jakarta.servlet.http.HttpSession;
import mk.ukim.finki.culturecanvasmk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUsersPage(HttpSession session, Model model){
        model.addAttribute("users", userService.listUsers());
        model.addAttribute("bodyContent", "listUsers");
        return "masterTemplate";
    }

    @PostMapping("/delete/{userId}")
    public String deleteReview(@PathVariable Long userId, HttpSession session)
    {
        userService.deleteById(userId);
        return "redirect:/users";
    }
}
