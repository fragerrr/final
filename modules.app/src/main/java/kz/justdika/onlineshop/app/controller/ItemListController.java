package kz.justdika.onlineshop.app.controller;

import kz.justdika.onlineshop.app.model.item.list.response.ItemListResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemListController {


    @GetMapping("/list")
    public ResponseEntity<List<ItemListResponse>> getList(){
        return null;
    }
}
