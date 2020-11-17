package com.tdp.ms.prueba.expose;

import com.tdp.ms.prueba.business.PruebaService;
import com.tdp.ms.prueba.model.PruebaRequest;
import com.tdp.ms.prueba.model.PruebaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Class: PruebaController. <br/>
 * <b>Copyright</b>: &copy; 2019 Telef&oacute;nica del Per&uacute;<br/>
 * <b>Company</b>: Telef&oacute;nica del Per&uacute;<br/>
 *
 * @author Telef&oacute;nica del Per&uacute; (TDP) <br/>
 *         <u>Service Provider</u>: Everis Per&uacute; SAC (EVE) <br/>
 *         <u>Developed by</u>: <br/>
 *         <ul>
 *         <li>Developer name</li>
 *         </ul>
 *         <u>Changes</u>:<br/>
 *         <ul>
 *         <li>YYYY-MM-DD Creaci&oacute;n del proyecto.</li>
 *         </ul>
 * @version 1.0
 */
@RestController
@RequestMapping("/prueba/v1/greeting")
public class PruebaController {

    @Autowired
    private PruebaService pruebaService;

    @GetMapping
    public Mono<PruebaResponse> indexGet() {
    	return Mono.justOrEmpty(pruebaService.get());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<PruebaResponse> indexPost(@RequestBody PruebaRequest request) {
        return Mono.justOrEmpty(pruebaService.put(request.getName()));
    }



}
