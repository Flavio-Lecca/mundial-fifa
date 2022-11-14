package pe.ep3.mundialfifa.Menu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class LinkController {

    @GetMapping
    @RequestMapping("/mundial")
    public List<LinkResponse> getLink(){
        List<LinkResponse> linkResponses = List.of(LinkResponse.builder().link("https://app-mundial-fifa.herokuapp.com/api/v1/mundial/paises").build(),
                LinkResponse.builder().link("https://app-mundial-fifa.herokuapp.com/api/v1/mundial/jugadores").build(),
                LinkResponse.builder().link("https://app-mundial-fifa.herokuapp.com/api/v1/mundial/estadios").build(),
                LinkResponse.builder().link("https://app-mundial-fifa.herokuapp.com/api/v1/mundial/jugadores/add").build());
        return linkResponses;
    }
}
