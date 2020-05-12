package org.teasir.paramconverter;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class MyDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        if(s!=null&&!"".equals(s)){
            try {
                return sdf.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public JavaType getInputType(TypeFactory typeFactory) {
        return null;
    }

    @Override
    public JavaType getOutputType(TypeFactory typeFactory) {
        return null;
    }
}
