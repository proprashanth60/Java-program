package com.tnsif.interfacepgm;

//demo for multiple interface

interface Camera {
	void takephoto();
}

interface MusicPlayer {
	void playmusic();
}

//a class implementing multiple interface
class Smartphone implements Camera, MusicPlayer {

	@Override
	public void takephoto() {
		// TODO Auto-generated method stub
		System.out.println("take photo");

	}

	@Override
	public void playmusic() {
		// TODO Auto-generated method stub
		System.out.println("play music");

	}

}

public class Multipleinterface {
	public static void main(String[] args) {
		Smartphone s = new Smartphone();
		s.takephoto();
		s.playmusic();
	}
}