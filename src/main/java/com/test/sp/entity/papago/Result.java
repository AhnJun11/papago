package com.test.sp.entity.papago;

import lombok.Data;

@Data
public class Result {
	
		private String srcLangType;
		private String tarLangType;
		private String translatedText;
		private String engineType;
		private String pivot;
	}

