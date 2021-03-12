package piedpipergamaacademia.projetofinaljava.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ApiResourceAdvice {
	
	@InitBinder
    private void activateDirectFieldAccess(DataBinder dataBinder) {
        dataBinder.initDirectFieldAccess();
    }
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ResponseEntity<Error> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		Error erro = new Error(ex.getClass().getSimpleName(), ex.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<Error>(erro, HttpStatus.BAD_REQUEST);
		
	}

	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ResponseEntity<Error>  handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {

		return new ResponseEntity<Error>(new Error(ex.getClass().getSimpleName(), ex.getLocalizedMessage()), HttpStatus.BAD_REQUEST);
	}

//	@ExceptionHandler(Exception.class)
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//	@ResponseBody
//	public ResponseEntity<Error>  handleException(Exception ex) {
//		return new ResponseEntity<Error>(new Error(ex.getClass().getSimpleName(), ex.getLocalizedMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ResponseEntity<Error> handleIllegalArgumentException(RuntimeException ex) {
		return new ResponseEntity<Error>(new Error(ex.getClass().getSimpleName(), ex.getLocalizedMessage()), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public ResponseEntity<Error> handleResourceNotFoundException(RuntimeException ex) {
		return new ResponseEntity<Error>(new Error(ex.getClass().getSimpleName(), ex.getLocalizedMessage()), HttpStatus.NOT_FOUND);
	}

	

}
