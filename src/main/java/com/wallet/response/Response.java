package com.wallet.response;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor 
public class Response<T> {

	private T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	private List<String> errors;
	
}
