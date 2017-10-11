package cn.sinjinsong.eshop.common.controller.advice;


import cn.sinjinsong.eshop.common.exception.base.BaseRestException;
import cn.sinjinsong.eshop.common.exception.domain.RestError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RESTExceptionHandler {
	
	@ExceptionHandler(BaseRestException.class)
	public ResponseEntity<RestError> handle(BaseRestException e) {
		return new ResponseEntity<>(new RestError(e.getStatus(), e.getCode(), e.getErrors(), e.getMoreInfoURL()), e.getStatus());
	}
	
}
