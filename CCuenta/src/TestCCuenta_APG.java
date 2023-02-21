import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

import org.junit.Test;
//import org.testng.annotations.Test;

public class TestCCuenta_APG {

        @Test
        public void testCreacionNoNulo_APG() {
            Ccuenta c1 = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
            assertNotNull(c1);
        }

        @Test
        public void testCreacionCompleta_APG() {
            Ccuenta c1 = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
            assertEquals("Ana", c1.getNombre());
            assertEquals("ES08-3456-2343-2345-1234-1234", c1.getCuenta());
            assertEquals(3200.0, c1.getSaldo());
        }

        @Test
        public void testIngresoPositivo_APG() {
            Ccuenta c1 = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
            c1.ingresar(1000.0);
            assertEquals(4200.0, c1.getSaldo());
        }

        @Test
        public void testIngresoNegativo_APG() {
            Ccuenta c1 = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
            c1.ingresar(-1000.0);
            assertEquals(3200.0, c1.getSaldo());
        }

        @Test
        public void testRetiradaCorrecta_APG() {
            Ccuenta miCuenta = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
            miCuenta.retirar(2000.0);
            assertEquals(1200.0, miCuenta.getSaldo());
        }

        @Test
        public void testGranRetirada_APG() {
            Ccuenta miCuenta = new Ccuenta("Ana", "ES08-3456-2343-2345-1234-1234", 3200, 1);
            miCuenta.retirar(8000.0);
            assertEquals(3200.0, miCuenta.getSaldo());
        }
    }
