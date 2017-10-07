package cn.sinjinsong.eshop.core.exception.order;

import cn.sinjinsong.eshop.common.exception.annotation.RestField;
import cn.sinjinsong.eshop.common.exception.annotation.RestResponseStatus;
import cn.sinjinsong.eshop.common.exception.base.BaseRestException;
import org.springframework.http.HttpStatus;

/**
 * Created by SinjinSong on 2017/10/7.
 */

@RestResponseStatus(value = HttpStatus.NOT_FOUND,code = 12)
@RestField("order")
public class OrderNotFoundException extends BaseRestException {
    public OrderNotFoundException(String order){
        super(order);
    }
}
