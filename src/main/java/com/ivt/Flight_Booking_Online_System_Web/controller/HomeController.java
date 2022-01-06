/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivt.Flight_Booking_Online_System_Web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ADMIN
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/home","/"}, method = RequestMethod.GET)
    public String home(Model model) {
        return "index";
    }
    @RequestMapping("/helo")
    public String helo(Model model) {
        return "helo";
    }
}
