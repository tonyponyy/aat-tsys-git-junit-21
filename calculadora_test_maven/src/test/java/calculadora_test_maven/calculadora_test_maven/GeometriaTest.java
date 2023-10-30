package calculadora_test_maven.calculadora_test_maven;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class GeometriaTest 
{
    /**
     * Rigorous Test :-)
     */
	 private double delta = 0.3;
	Geometria geometria = new Geometria();
	
    @Test
    public void areaCuadradoTest() {
        double resultado = geometria.areacuadrado(5);
        assertEquals(25, resultado);
    }
    @Test
    public void areaCirculoTest() {
        double resultado = geometria.areaCirculo(5);
        assertEquals(78.54, resultado,delta);
    }
    
	//metodo area del triangulo
    @Test
	public void areatrianguloTest(){
		 double resultado = geometria.areatriangulo(2,5);
	        assertEquals(5, resultado,delta);
		}
	
	//metodo area del rectangulo
    @Test
	public void arearectanguloTest(){
    	 double resultado = geometria.arearectangulo(2,5);
	        assertEquals(10, resultado,delta);
		}
	
	//metodo area del rectangulo
    @Test
	public void areapentagonoTest(){
    	 double resultado = geometria.areapentagono(2,5);
	        assertEquals(5, resultado,delta);
		}
	
	//metodo area del rectangulo
    @Test
	public void arearomboTest(){
    	 double resultado = geometria.arearombo(5,5);
	        assertEquals(12, resultado,delta);
		}
	
	//metodo area del rectangulo
    @Test
	public void arearomboideTest(){
    	double resultado = geometria.arearombo(5,5);
        assertEquals(12, resultado,delta);
		}
	
	//metodo area del rectangulo
    @Test
	public void areatrapecioTest (){ 
    	double resultado = geometria.areatrapecio(4,2,2);
        assertEquals(6, resultado,delta);
		}
	
	//Selector de figuras
    @Test
	public void figuraTest() {
    	
    	String resultado = geometria.figura(1);
        assertEquals("cuadrado", resultado);
		
	}
	

    @Test
	public void getIdTest() {
    	geometria.setId(1);
    	int resultado = geometria.getId();
    	assertEquals(1, resultado);
	}


    @Test
	public void getNomTest() {
    	geometria.setNom("cuadrado");
    	String resultado = geometria.getNom();
    	assertEquals("cuadrado", resultado);
	}


	
	/**
	 * @return the area
	 */
    @Test
	public void getAreaTest() {
    	geometria.setArea(13);
    	double resultado = geometria.getArea();
    	assertEquals(13, resultado);
	}



    @Test
	public void toStringTest() {
    	String resultado = geometria.toString();
    	assertEquals("Geometria [id=9, nom=Default, area=0.0]", resultado);
    	

	}
	
    


    
}

