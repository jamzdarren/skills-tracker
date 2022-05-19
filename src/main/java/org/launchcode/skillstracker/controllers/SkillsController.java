package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String displayLanguages() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is a list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</br><a href='http://localhost:8080/form'>Choose your favorite</a>";
    }

    @GetMapping("form")
    public String getFavoriteLanguages() {
        return  "<form action='form' method='post'>" +
                "Name:</br> <input type='text' name='name'></br>" +
                "My favorite language:</br> <select name='language1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></br>" +
                "My second favorite language:</br> <select name='language2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></br>" +
                "My third favorite language:</br> <select name='language3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select></br>" +
                "<input type='submit' value='Submit'>" +
                "</form>";
    }

    @PostMapping("form")
    public String displayFormData(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
        return "<h1>" + name + "</h1>" +
                "<table cellpadding='10'>" +
                "<tr><th>Favorite</th><th>Second Favorite</th><th>Third Favorite</th><tr>" +
                "<tr><td>" + language1 + "</td>" +
                "<td>" + language2 + "</td>" +
                "<td>" + language3 + "</td></tr></table>";
    }
}
