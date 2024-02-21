package co.edu.uniquindio.poo; 
public class Cuadrado{
    
    private float lado1;
   
    public void Longitud(float lado1){
        this.lado1 = lado1;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void CalcularPerimetro(float getLado1){
        float perimetro = lado1 * 4;
        System.out.println("el perimetro del cuadrado es: ");
        System.out.println(perimetro);
    }

    public void CalcularArea(float getLado1){
        float area = lado1 * lado1;
        System.out.println("el area del cuadrado es: ");
        System.out.println(area);
    }
}