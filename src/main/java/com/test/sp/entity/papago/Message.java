package com.test.sp.entity.papago;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true) // 내가 모르는건, 내가 없는건 무시하겠다
public class Message {

		private Result result;
	}

