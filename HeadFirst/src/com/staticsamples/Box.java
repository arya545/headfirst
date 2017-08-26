package com.staticsamples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	
	

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}



	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}



	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}



	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box=new Box();
		box.setWidth(50);
		box.setHeight(20);
		FileOutputStream fos=null;
		ObjectOutputStream os=null;
		try
		{
			fos=new FileOutputStream("foo.ser");
			os=new ObjectOutputStream(fos);
			os.writeObject(box);
			os.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
