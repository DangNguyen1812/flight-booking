/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivt.Flight_Booking_Online_System_Web.RestFulAPI;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author ADMIN
 */
@RestController
@RequestMapping("/api")
public class DemoWebservice {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public Object helo() {
        return "dang nguyen";
    }

    @RequestMapping(value = "/countries", method = RequestMethod.GET)
    public ResponseEntity<List<Integer>> getCounties() {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(150);
        list.add(250);
        list.add(250);
        list.add(250);
        list.add(250);
        list.add(350);
        list.add(350);
        list.add(350);
        list.add(350);
        return new ResponseEntity<List<Integer>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public ResponseEntity<Integer> getCountry() {

        return new ResponseEntity<Integer>(10, HttpStatus.OK);
    }
//    @RequestMapping(value = "/addBooking",method = RequestMethod.GET)
//    public ResponseEntity<?> addBooking(@RequestBody Integer xxx, UriComponentsBuilder builder) {
//        HttpHeaders header = new HttpHeaders();
//        header.setLocation(builder.path("/api/addBooking").buildAndExpand(uriVariableValues));
//    }
}
