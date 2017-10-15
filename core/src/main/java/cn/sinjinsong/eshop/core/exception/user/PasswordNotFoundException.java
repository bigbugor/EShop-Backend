package cn.sinjinsong.eshop.core.exception.user;

import cn.sinjinsong.eshop.common.exception.annotation.RestField;
import cn.sinjinsong.eshop.common.exception.annotation.RestResponseStatus;
import cn.sinjinsong.eshop.common.exception.base.BaseRestException;
import org.springframework.http.HttpStatus;

/**
 * Created by SinjinSong on 2017/10/15.
 */
@RestResponseStatus(value= HttpStatus.NOT_FOUND,code=12)
@RestField("password")
public class PasswordNotFoundException extends BaseRestException{
    public PasswordNotFoundException(){
        super(null);
    }
}
