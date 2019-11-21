package epam.com;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TemperatureConventerTest {
    TemparatureConventer testobj;
    private double inputvalue;
    private double expectedvalueConvertFtoC;
    private double expectedvalueConvertCtoF;
    private double expectedvalueConvertCtoK;
    private double expectedvalueConvertKtoC;
    private double expectedvalueConvertFtoK;
    private double expectedvalueConvertKtoF;

    public TemperatureConventerTest(double inputvalue, double expectedvalueConvertCtoK, double expectedvalueConvertFtoC, double expectedvalueConvertCtoF, double expectedvalueConvertKtoC, double expectedvalueConvertFtoK, double expectedvalueConvertKtoF) {
        this.inputvalue = inputvalue;
        this.expectedvalueConvertCtoK = expectedvalueConvertCtoK;
        this.expectedvalueConvertFtoC = expectedvalueConvertFtoC;
        this.expectedvalueConvertCtoF = expectedvalueConvertCtoF;
        this.expectedvalueConvertKtoC = expectedvalueConvertKtoC;
        this.expectedvalueConvertFtoK = expectedvalueConvertFtoK;
        this.expectedvalueConvertKtoF = expectedvalueConvertKtoF;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {0, 273.2, -17.7778, 32, -273.2, 255.372 , -459.67},
            {6, 279.2, -14.4444,  42.8, -267.2, 258.706, -448.87 },
            {-273.2, 0, -169.555555, -459.76, -546.4, 103.61111111, -951.46 },
        });
    }

    @Before
    public void createObj () {
        testobj = new TemparatureConventer();
        assertNotNull(testobj);
    }
    @Test
    public void testConvertCtoK () {
      assertEquals(expectedvalueConvertCtoK, testobj.convertCtoK(inputvalue), 0);
        System.out.println("test testConvertCtoK is passed ");
    }
    @Test
    public void testConvertFtoC(){
        assertEquals(expectedvalueConvertFtoC, testobj.convertFtoC(inputvalue), 0.05);
        System.out.println("test testConvertFtoC is passed ");
    }
    @Test
    public void testConvertCtoF(){
        assertEquals(expectedvalueConvertCtoF, testobj.convertCtoF(inputvalue), 0.05);
        System.out.println("test testConvertCtoK is passed ");
    }
    @Test
    public void testConvertKtoC(){
        assertEquals(expectedvalueConvertKtoC, testobj.convertKtoC(inputvalue), 0.05);
        System.out.println("test testConvertKtoC is passed ");
    }
    @Test
    public void testConvertFtoK(){
        assertEquals(expectedvalueConvertFtoK, testobj.convertFtoK(inputvalue), 0.05);
        System.out.println("test testConvertFtoK is passed ");
    }
    @Test
    public void testConvertKtoF(){
        assertEquals(expectedvalueConvertKtoF, testobj.convertKtoF(inputvalue), 0.05);
        System.out.println("test testConvertKtoF is passed ");
    }


}







