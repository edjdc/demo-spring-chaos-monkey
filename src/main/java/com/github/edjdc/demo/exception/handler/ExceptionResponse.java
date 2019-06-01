package com.github.edjdc.demo.exception.handler;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = -4685608519418586575L;

	private String message;

}