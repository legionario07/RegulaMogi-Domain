package br.com.regulamogi.utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class RemoveAcentoUtil {

	 public static String semAcento(String str) {
	        String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD); 
	        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
	        return pattern.matcher(nfdNormalizedString).replaceAll("");
	    }
	
}
