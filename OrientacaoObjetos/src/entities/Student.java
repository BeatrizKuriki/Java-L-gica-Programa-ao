package entities;



public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	public double media;

	public Student() {
		
	}


	public Student(String name, double n1, double n2, double n3, double media) {
	this.name = name;
	this.n1 = n1;
	this.n2 = n2;
	this.n3 = n3;
	this.media = media;
		
	}
	
	public double average() {
		media = n1+n2+n3;
		return media;
	}
	public void isApproved() {
		if(media >= 60) {
			System.out.println("APROVADO");
		}else {
			System.out.println("REPROVADO");
		}
		
		
	}
	public void missingPoints() {
		if(media < 60) {
		 double missing = 60-media;
		 System.out.print("Pontos que faltam:");
		  System.out.println(missing);
		}
		
	}
	
	public String toString() {
		return "Nota final: "
				+String.format("%.2f", average());
				
	}

}
