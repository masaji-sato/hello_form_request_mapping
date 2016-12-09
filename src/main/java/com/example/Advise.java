package com.example;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * Created by fujioka on 2016/11/01.
 */
@ControllerAdvice
class Advise {

//    private static final String[] allowFields ;
//    private static final String[] disallowFields;

    static {
//        allowFields = new String[] {
//                "to be specified",
//        };
//
//        disallowFields = new String[] {
//                "protected*",
//        };
    }

    @InitBinder
    void init(WebDataBinder binder) {
        binder.initDirectFieldAccess();
//        binder.setAllowedFields(allowFields);
//        binder.setDisallowedFields(disallowFields);
        binder.registerCustomEditor(Object.class, new StringTrimmerEditor(false));
    }
}