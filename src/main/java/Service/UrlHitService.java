package Service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    private AtomicInteger count = new AtomicInteger(0);
    private ConcurrentHashMap<String, AtomicInteger> userHitCountMap = new ConcurrentHashMap<>();

    public int incrementCount() {
        return count.incrementAndGet();
    }

    public UserHitCount incrementUserCount(String username) {
        userHitCountMap.putIfAbsent(username, new AtomicInteger(0));
        AtomicInteger userCount = userHitCountMap.get(username);
        return new UserHitCount(username, userCount.incrementAndGet());
    }
}
