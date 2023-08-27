public class Retangulo
{
    private double base, altura, perimetro, area;

    public Retangulo( double a, double b)
    {
        base = a;
        altura = b;
        perimetro = 0;
        area = 0;
    }

    public void calcularArea()
    {
        area = base*altura;
        System.out.println(area);
    }

    public void calcularPerimetro()
    {
        perimetro = (double) altura*2 + base*2;
        System.out.println(perimetro);
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if ((base>0)&&(base<=20))
        {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if((altura>0)&&(altura<=20))
        {
            this.altura = altura;
        }
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
