package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		String imageUrl = "http://nv1.adcreative.naver.net/ad3/1099/1099880/B_1.jpg";
		try {
			URL url = new URL(imageUrl);
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/logo.jpg")) {
				int result;
				byte[] b = new byte[400];
				
				while((result = is.read(b)) != -1) {
					os.write(b, 0, result);
				}
				
				System.out.println("끝");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
