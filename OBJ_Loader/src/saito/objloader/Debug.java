package saito.objloader;

import processing.core.PApplet;

public class Debug {
	
	public boolean enabled = true;
	
	PApplet parent;
	
	public Debug(PApplet parent){
		this.parent = parent;
	}
	public void println(String str){
		if(enabled)
			PApplet.println(str);
	}
	
	public void println(int i){
		if(enabled)
			PApplet.println(i);
	}
	public void println(int[] i){
		if(enabled)
			PApplet.println(i);
	}
	public void println(float[] f){
		if(enabled)
			PApplet.println(f);
	}
	public void println(Vertex v){
		if(enabled)
			PApplet.println(v.vx + " : " + v.vy + " : " + v.vz);
	}
	public void print(String str){
		if(enabled)
			PApplet.print(str);
	}
}
