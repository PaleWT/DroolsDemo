package com.absa.africa.droolsdemo.controller.CashsendController;

import com.absa.africa.droolsdemo.cofiguration.droolsconfig.DroolConfig;
import com.absa.africa.droolsdemo.entity.Cashsend;
import com.absa.africa.droolsdemo.util.Helpers;
import org.drools.core.util.Drools;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping("v1/cashsend")
public class CashsendController {

   private DroolConfig droolsConfig;
    /*@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
   @Autowired*/
    @Autowired
   private KieContainer kieContainer;


    private Helpers helper = new Helpers();

    public CashsendController() {
    }

    @GetMapping("/getcash")
   public String testEndpoint(Cashsend cashsend) {
       cashsend = new Cashsend("+27813564839", "12345", 3000);
       String cashSendCode = helper.generateCode();
       cashsend.setMessage("Hi You have received a cashsend cardless withdrwal code is: " + cashSendCode + " enter cashsend code and your pin is: " + cashsend.getPin());
       System.out.println(cashsend.getMessage());
       return cashsend.getMessage();
   }

    @PostMapping("/sendcash")
    public Cashsend sendCash(@RequestBody Cashsend cashsend) {
        KieSession session = kieContainer.newKieSession("rulesSession");
        session.insert(cashsend);
        session.fireAllRules();
        return cashsend;
    }
}
