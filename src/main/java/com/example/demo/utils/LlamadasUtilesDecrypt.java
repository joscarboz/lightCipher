package com.example.demo.utils;

import java.util.Base64;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public class LlamadasUtilesDecrypt {
	
	public static String Simon32(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = Base64.getDecoder().decode(inputText);
			String key = keytext;
			byte[] keyByte = key.getBytes();
			SimonEngine.printBytes(inputByte);
			SimonEngine.decrypt(SimonEngine.SIMON_32, keyByte, inputByte);
			SimonEngine.printBytes(inputByte);
			 s = new String(inputByte);
			 modelo.addAttribute("algorithm", "Simon32");
				modelo.addAttribute("word", input);
				modelo.addAttribute("key", key );
				modelo.addAttribute("encrypted", "Your decrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}
	
	public static String Simon48(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = Base64.getDecoder().decode(inputText);
			String key = keytext;
			byte[] keyByte = key.getBytes();
			SimonEngine.printBytes(inputByte);
			SimonEngine.decrypt(SimonEngine.SIMON_48, keyByte, inputByte);
			SimonEngine.printBytes(inputByte);
			 s = new String(inputByte);
			 modelo.addAttribute("algorithm", "Simon48");
				modelo.addAttribute("word", input);
				modelo.addAttribute("key", key );
				modelo.addAttribute("encrypted", "Your decrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}

	public static String Simon64(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = Base64.getDecoder().decode(inputText);
			String key = keytext;
			byte[] keyByte = key.getBytes();
			SimonEngine.printBytes(inputByte);
			SimonEngine.decrypt(SimonEngine.SIMON_64, keyByte, inputByte);
			SimonEngine.printBytes(inputByte);
			 s = new String(inputByte);
			 modelo.addAttribute("algorithm", "Simon64");
				modelo.addAttribute("word", input);
				modelo.addAttribute("key", key );
				modelo.addAttribute("encrypted", "Your decrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}
	
	public static String Simon96(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = Base64.getDecoder().decode(inputText);
			String key = keytext;
			byte[] keyByte = key.getBytes();
			SimonEngine.printBytes(inputByte);
			SimonEngine.decrypt(SimonEngine.SIMON_96, keyByte, inputByte);
			SimonEngine.printBytes(inputByte);
			 s = new String(inputByte);
			 modelo.addAttribute("algorithm", "Simon96");
				modelo.addAttribute("word", input);
				modelo.addAttribute("key", key );
				modelo.addAttribute("encrypted", "Your decrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}
	
	public static String Simon128(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = Base64.getDecoder().decode(inputText);
			String key = keytext;
			byte[] keyByte = key.getBytes();
			SimonEngine.printBytes(inputByte);
			SimonEngine.decrypt(SimonEngine.SIMON_128, keyByte, inputByte);
			SimonEngine.printBytes(inputByte);
			 s = new String(inputByte);
				modelo.addAttribute("algorithm", "Simon128");
				modelo.addAttribute("word", input);
				modelo.addAttribute("key", key );
				modelo.addAttribute("encrypted", "Your decrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}
}
