package com.testng.features;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Transformer_Class implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation) {
		
		annotation.setRetryAnalyzer(Retry_Class.class);
	}

}
