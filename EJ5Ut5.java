import java.util.Arrays;

public class EJ5Ut5 {
public static class estudiante implements Comparable <estudiante>{
    String nombre;
    int edad;
    int altura;

    public estudiante(String nombre, int altura, int edad) {
    this.nombre=nombre;
    this.edad=edad;
    this.altura=altura;
    }

    public int getAltura(){
        return altura;
    }

    public int getEdad(){
        return edad;
    }

    public int compareTo(estudiante o) {
        int resultado = 0;
        if (this.getAltura() > o.getAltura()) {
        resultado = -1;
        }
        else if (this.getAltura() < o.getAltura()) {
            resultado = 1;
        }
        else if (this.getAltura() == o.getAltura()) {
            if (this.getEdad() < o.getEdad()){
                resultado = 1;
            }
            else if (this.getEdad() > o.getEdad()){
                resultado = -1;
            }
            else {
                resultado = 0;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }

    public static void main(String[] args) {
        estudiante[] fin = new estudiante[5];
        estudiante est1 = new estudiante("Patri",170,12);
        estudiante est2 = new estudiante("Manuel",173,43);
        estudiante est3 = new estudiante("Javier",189,72);
        estudiante est4 = new estudiante("Alicia",168,52);
        estudiante est5 = new estudiante("Alberto",189,35);

        fin[0] = est1;
        fin[1] = est2;
        fin[2] = est3;
        fin[3] = est4;
        fin[4] = est5;

        System.out.println("SIN ORDENAR:");
        System.out.println("-----------------------");
        for (int i = 0;i < fin.length;i++){
            System.out.println(fin[i]);
        }
        System.out.println("-----------------------");

        Arrays.sort(fin);
        System.out.println("ORDENADA:");
        System.out.println("-----------------------");
        for (int i = 0;i < fin.length;i++){
            System.out.println(fin[i].toString());
        }
        System.out.println("-----------------------");
    }
}
}
