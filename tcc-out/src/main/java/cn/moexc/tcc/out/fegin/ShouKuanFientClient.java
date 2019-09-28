package cn.moexc.tcc.out.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "tcc-in")
public interface ShouKuanFientClient {
    @RequestMapping("/api/shoukuan")
    public String shouKuan(@RequestParam("monery")Double monery);
}
