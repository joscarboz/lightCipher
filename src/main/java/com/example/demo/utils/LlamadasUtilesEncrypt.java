package com.example.demo.utils;

import java.util.Base64;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

public class LlamadasUtilesEncrypt {

	public static String Simon32(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = input.getBytes("UTF-8");
			String key = keytext;
			byte[] keyByte = key.getBytes("UTF-8");
			SimonEngine.printBytes(inputByte);
			SimonEngine.encrypt(SimonEngine.SIMON_32, keyByte, inputByte);
			SimonEngine.printBytes(inputByte);
			s = Base64.getEncoder().encodeToString(inputByte);
			modelo.addAttribute("algorithm", "Simon32");
			modelo.addAttribute("word", input);
			modelo.addAttribute("key", key);
			modelo.addAttribute("encrypted", "Your encrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}

	public static String Speck32(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = input.getBytes("UTF-8");
			String key = keytext;
			byte[] keyByte = key.getBytes("UTF-8");
			SpeckEngine.printBytes(inputByte);
			SpeckEngine.encrypt(SpeckEngine.SPECK_32, keyByte, inputByte);
			SpeckEngine.printBytes(inputByte);
			s = Base64.getEncoder().encodeToString(inputByte);
			modelo.addAttribute("algorithm", "Speck32");
			modelo.addAttribute("word", input);
			modelo.addAttribute("key", key);
			modelo.addAttribute("encrypted", "Your decrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}

	public static String Simon48(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = input.getBytes("UTF-8");
			String key = keytext;
			byte[] keyByte = key.getBytes("UTF-8");
			SimonEngine.printBytes(inputByte);
			SimonEngine.encrypt(SimonEngine.SIMON_48, keyByte, inputByte);
			SimonEngine.printBytes(inputByte);
			s = Base64.getEncoder().encodeToString(inputByte);
			modelo.addAttribute("algorithm", "Simon48");
			modelo.addAttribute("word", input);
			modelo.addAttribute("key", key);
			modelo.addAttribute("encrypted", "Your encrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}

	public static String Speck48(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = input.getBytes("UTF-8");
			String key = keytext;
			byte[] keyByte = key.getBytes("UTF-8");
			SpeckEngine.printBytes(inputByte);
			SpeckEngine.encrypt(SpeckEngine.SPECK_48, keyByte, inputByte);
			SpeckEngine.printBytes(inputByte);
			s = Base64.getEncoder().encodeToString(inputByte);
			modelo.addAttribute("algorithm", "Speck48");
			modelo.addAttribute("word", input);
			modelo.addAttribute("key", key);
			modelo.addAttribute("encrypted", "Your decrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}

	public static String Simon64(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = input.getBytes("UTF-8");
			String key = keytext;
			byte[] keyByte = key.getBytes("UTF-8");
			SimonEngine.printBytes(inputByte);
			SimonEngine.encrypt(SimonEngine.SIMON_64, keyByte, inputByte);
			SimonEngine.printBytes(inputByte);
			s = Base64.getEncoder().encodeToString(inputByte);
			modelo.addAttribute("algorithm", "Simon64");
			modelo.addAttribute("word", input);
			modelo.addAttribute("key", key);
			modelo.addAttribute("encrypted", "Your encrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}

	public static String Speck64(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = input.getBytes("UTF-8");
			String key = keytext;
			byte[] keyByte = key.getBytes("UTF-8");
			SpeckEngine.printBytes(inputByte);
			SpeckEngine.encrypt(SpeckEngine.SPECK_64, keyByte, inputByte);
			SpeckEngine.printBytes(inputByte);
			s = Base64.getEncoder().encodeToString(inputByte);
			modelo.addAttribute("algorithm", "Speck64");
			modelo.addAttribute("word", input);
			modelo.addAttribute("key", key);
			modelo.addAttribute("encrypted", "Your decrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}

	public static String Simon96(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = input.getBytes("UTF-8");
			String key = keytext;
			byte[] keyByte = key.getBytes("UTF-8");
			SimonEngine.printBytes(inputByte);
			SimonEngine.encrypt(SimonEngine.SIMON_96, keyByte, inputByte);
			SimonEngine.printBytes(inputByte);
			s = Base64.getEncoder().encodeToString(inputByte);
			modelo.addAttribute("algorithm", "Simon96");
			modelo.addAttribute("word", input);
			modelo.addAttribute("key", key);
			modelo.addAttribute("encrypted", "Your encrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}

	public static String Speck96(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = input.getBytes("UTF-8");
			String key = keytext;
			byte[] keyByte = key.getBytes("UTF-8");
			SpeckEngine.printBytes(inputByte);
			SpeckEngine.encrypt(SpeckEngine.SPECK_96, keyByte, inputByte);
			SpeckEngine.printBytes(inputByte);
			s = Base64.getEncoder().encodeToString(inputByte);
			modelo.addAttribute("algorithm", "Speck96");
			modelo.addAttribute("word", input);
			modelo.addAttribute("key", key);
			modelo.addAttribute("encrypted", "Your decrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}

	public static String Simon128(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = input.getBytes("UTF-8");
			String key = keytext;
			byte[] keyByte = key.getBytes("UTF-8");
			SimonEngine.printBytes(inputByte);
			SimonEngine.encrypt(SimonEngine.SIMON_128, keyByte, inputByte);
			SimonEngine.printBytes(inputByte);
			s = Base64.getEncoder().encodeToString(inputByte);
			modelo.addAttribute("algorithm", "Simon128");
			modelo.addAttribute("word", input);
			modelo.addAttribute("key", key);
			modelo.addAttribute("encrypted", "Your encrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}

	public static String Speck128(String inputText, String keytext, Model modelo) {
		String s = "";
		try {
			String input = inputText;
			byte[] inputByte = input.getBytes("UTF-8");
			String key = keytext;
			byte[] keyByte = key.getBytes("UTF-8");
			SpeckEngine.printBytes(inputByte);
			SpeckEngine.encrypt(SpeckEngine.SPECK_128, keyByte, inputByte);
			SpeckEngine.printBytes(inputByte);
			s = Base64.getEncoder().encodeToString(inputByte);
			modelo.addAttribute("algorithm", "Speck128");
			modelo.addAttribute("word", input);
			modelo.addAttribute("key", key);
			modelo.addAttribute("encrypted", "Your decrypted word is: " + s);
		} catch (Exception e) {

		}
		return s;
	}
}
