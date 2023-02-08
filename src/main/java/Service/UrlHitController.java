package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    public UrlHitService urlHitService;

    @GetMapping("count")
    public int getHitCount() {
        return urlHitService.incrementCount();
    }

    @GetMapping("username/{username}/count")
    public UserHitCount getUserHitCount(@PathVariable String username) {
        return urlHitService.incrementUserCount(username);
    }
}
