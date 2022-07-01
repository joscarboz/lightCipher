
// Java Program to Illustrate DemoController

// Importing package to code module
package com.example.demo.controller;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.utils.LlamadasUtilesEncrypt;
import com.example.demo.utils.LlamadasUtilesDecrypt;
import com.example.demo.utils.SimonEngine;

// Annotation
@Controller

// Class
public class MainController {

	// TODO: AÑADIR POR JS AVISO SI LA CLAVE ES CORTA O LARGA SEGÚN EL SPECK
	// ESCOGIDO

	@RequestMapping("/cipher")
	public String cipher(Model modelo) {
		modelo.addAttribute("outputEncrypt", "");
		modelo.addAttribute("outputDecrypt", "");
		modelo.addAttribute("outputEncryptError", "");
		modelo.addAttribute("outputDecryptError", "");
		return "cipher";
	}

	public static byte[] hexStringToByteArray(String s) {
		int len = s.length();
		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
		}
		return data;
	}

	public String toHex(String arg) {
		return String.format("%040x", new BigInteger(1, arg.getBytes(/* YOUR_CHARSET? */)));
	}

	@RequestMapping("/encrypt")
	public String encrypt(@RequestParam(name = "inputText", required = false, defaultValue = "") String inputText,
			@RequestParam(name = "keytext", required = false, defaultValue = "") String keytext,
			@RequestParam(name = "selectEncrypt", required = false, defaultValue = "") String select, Model modelo) {
		String res = "results";
		String selector = select;
		switch (selector) {
		case "Simon32":
			if (inputText.length() == 4 && keytext.length() == 8) {
				LlamadasUtilesEncrypt.Simon32(inputText, keytext, modelo);
			} else {
				String message = "Word must be 4 characters & key must be 8 characters";
				modelo.addAttribute("outputEncryptError", message);
				res = "cipher";
			}
			break;
		case "Speck32":
			if (inputText.length() == 6 && keytext.length() == 8) {
				LlamadasUtilesEncrypt.Speck32(inputText, keytext, modelo);
			} else {
				String message = "Word must be 6 characters & key must be 8 characters";
				modelo.addAttribute("outputEncryptError", message);
				res = "cipher";
			}
			break;

		case "Simon48":
			if (inputText.length() == 6 && (keytext.length() == 9 || keytext.length() == 12)) {
				LlamadasUtilesEncrypt.Simon48(inputText, keytext, modelo);
			} else {
				String message = "Word must be 6 characters & key must be 9 or 12 characters";
				modelo.addAttribute("outputEncryptError", message);
				res = "cipher";
			}
			break;

		case "Simon64":
			if (inputText.length() == 8 && (keytext.length() == 12 || keytext.length() == 16)) {
				LlamadasUtilesEncrypt.Simon64(inputText, keytext, modelo);
			} else {
				String message = "Word must be 8 characters & key must be 12 or 16 characters";
				modelo.addAttribute("outputEncryptError", message);
				res = "cipher";
			}
			break;

		case "Simon96":
			// 12 O 18
			if (inputText.length() == 12 && (keytext.length() == 12 || keytext.length() == 18)) {
				LlamadasUtilesEncrypt.Simon96(inputText, keytext, modelo);
			} else {
				String message = "Word must be 12 characters & key must be 12 or 18 characters";
				modelo.addAttribute("outputEncryptError", message);
				res = "cipher";
			}
			break;

		case "Simon128":
			// 12 24 32
			if (inputText.length() == 16
					&& (keytext.length() == 16 || keytext.length() == 24 || keytext.length() == 32)) {
				LlamadasUtilesEncrypt.Simon128(inputText, keytext, modelo);
			} else {
				String message = "Word must be 16 characters & key must be 16, 24 or 32 characters";
				modelo.addAttribute("outputEncryptError", message);
				res = "cipher";
			}
			break;

		}

		return res;
	}

	@RequestMapping("/decrypt")
	public String decrypt(@RequestParam(name = "inputText", required = false, defaultValue = "") String inputText,
			@RequestParam(name = "keytext", required = false, defaultValue = "") String keytext,
			@RequestParam(name = "selectDecrypt", required = false, defaultValue = "") String select, Model modelo) {
		String selector = select;
		String res = "results";
		switch (selector) {
		case "Simon32":
			if (keytext.length() == 8) {
				LlamadasUtilesDecrypt.Simon32(inputText, keytext, modelo);
			} else {
				String message = "Key must be 8 characters";
				modelo.addAttribute("outputDecryptError", message);
				res = "cipher";
			}
			break;
		case "Speck32":
			if (keytext.length() == 8) {
				LlamadasUtilesDecrypt.Speck32(inputText, keytext, modelo);
			} else {
				String message = "Key must be 8 characters";
				modelo.addAttribute("outputDecryptError", message);
				res = "cipher";
			}
			break;
		case "Simon48":
			if (keytext.length() == 9 || keytext.length() == 12) {
				LlamadasUtilesDecrypt.Simon48(inputText, keytext, modelo);
			} else {
				String message = "Key must be 9 or 12 characters";
				modelo.addAttribute("outputDecryptError", message);
				res = "cipher";
			}
			break;

		case "Simon64":
			if (keytext.length() == 12 || keytext.length() == 16) {
				LlamadasUtilesDecrypt.Simon64(inputText, keytext, modelo);
			} else {
				String message = "Key must be 12 or 16 characters";
				modelo.addAttribute("outputDecryptError", message);
				res = "cipher";
			}
			break;

		case "Simon96":
			// 12 O 18
			if (keytext.length() == 12 || keytext.length() == 18) {
				LlamadasUtilesDecrypt.Simon96(inputText, keytext, modelo);
			} else {
				String message = "Key must be 12 or 18 characters";
				modelo.addAttribute("outputDecryptError", message);
				res = "cipher";
			}
			break;

		case "Simon128":
			// 12 24 32
			if (keytext.length() == 16 || keytext.length() == 24 || keytext.length() == 32) {
				LlamadasUtilesDecrypt.Simon128(inputText, keytext, modelo);
			} else {
				String message = "Key must be 16, 24 or 32 characters";
				modelo.addAttribute("outputDecryptError", message);
				res = "cipher";
			}
			break;

		}

		return res;
	}

}