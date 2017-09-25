package com.example.demo.magasinservice.webservice;

import com.example.demo.magasinservice.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/magasin")
public class MagasinWS {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(path = "/employee", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Resource<Employee> getEmployee() {
        return restTemplate
                .exchange(
                    "http://employee-service/employees/1",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<Resource<Employee>>() {})
                .getBody();
    }

}
