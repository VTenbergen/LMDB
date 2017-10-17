package com.capgemini.LMDBforAssessment.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.ArrayList;
import java.util.List;

public class ErrorMapping {

    public static List<String> mapErrorFields(MethodArgumentNotValidException ex) {
        BindingResult result = ex.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();
        ArrayList<String> errors = new ArrayList<>();
        for (FieldError field : fieldErrors){
            errors.add(field.getDefaultMessage());
        }
        return errors;
    }
}
//[Famous error message]
//
//        \ / _
//        ___,,,
//        \_[o o]
//        Errare humanum est!              C\  _\/
//        /                     _____),_/__
//        ________                  /     \/   /
//        _|       .|                /      o   /
//        | |       .|               /          /
//        \|       .|              /          /
//        |________|             /_        \/
//        __|___|__             _//\        \
//        _____|_________|____       \  \ \        \
//        _|       ///  \        \
//        |               \       /
//        |               /      /
//        |              /      /
//        ________________  |             /__    /_
//        b'ger        ...|_|.............. /______\.......
