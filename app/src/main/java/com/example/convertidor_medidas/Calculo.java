package com.example.convertidor_medidas;

import java.math.BigDecimal;
import java.math.MathContext;

public class Calculo {
    /**
     *Clase dedicada a realizar la conversion entre medidas retorno el resultado en texto
     * @param posicionDe: Parametro dedicado a indicar la posición del primer combo
     * @param posicionA: Parametro dedicado a indicar la posición del segundo combo
     * @param bigDatoDbl: bigDato base a la hora de hacer la conversión
     * @return El nuevo valor obtenido de la conversión
     */
    public String calculoMedida(int posicionDe, int posicionA, double bigDatoDbl){
        //Se declaran variables
        //Se declara variable dedicada a manerar cantidades con muchos decimales recibiendo
        //como bigDato el valor ingresado por el usuario
        BigDecimal bigDato = new BigDecimal (bigDatoDbl);
        //Se declara variable dedicada a almacenar cantidades largas por default a la hora de convertir
        BigDecimal bigConstante;
        //Se declara variable dedicada a almacenar el resultado obtenido de la conversion
        BigDecimal bigConversion = new BigDecimal(0);
        //Si las posiciones de ambos combos es la misma
        //(dando a entender que es el mismo tipo de longitud)
        if(posicionDe == posicionA){
            //Se coloca el mismo bigDato colocado en el editText
            bigConversion = bigDato;
        }else{
            //Si no verifica que tipo de longitud sera la base de bigConversion
            switch (posicionDe){
                case 0: //Kilometro
                    switch (posicionA){
                        case 1:// A metro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1000), MathContext.DECIMAL32);
                            break;
                        case 2:// A centimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(100000),MathContext.DECIMAL32);
                            break;
                        case 3: //A Milimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1000000),MathContext.DECIMAL32);
                            break;
                        case 4://A Micrometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1000000000),MathContext.DECIMAL32);
                            break;
                        case 5://A nanometro
                            bigConstante = new BigDecimal("1000000000000") ;
                            bigConversion = bigDato.multiply(bigConstante,MathContext.DECIMAL32);
                            break;
                        case 6://A milla
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1.609), MathContext.DECIMAL32);
                            break;
                        case 7://A Yarda
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1093.613),MathContext.DECIMAL32);
                            break;
                        case 8://A pie
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(3280.84),MathContext.DECIMAL32);
                            break;
                        case 9://A pulgada
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(39370.079),MathContext.DECIMAL32);
                            break;
                        case 10://A Milla nautica
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1.852),MathContext.DECIMAL32);
                            break;
                    }
                    break;
                case 1: //Metro
                    switch (posicionA){
                        case 0:// A Kilometro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1000),MathContext.DECIMAL32);
                            break;
                        case 2:// A centimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(100),MathContext.DECIMAL32);
                            break;
                        case 3: //A Milimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1000),MathContext.DECIMAL32);
                            break;
                        case 4://A Micrometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1000000),MathContext.DECIMAL32);
                            break;
                        case 5://A nanometro
                            bigConstante = new BigDecimal("1000000000") ;
                            bigConversion = bigDato.multiply(bigConstante,MathContext.DECIMAL32);
                            break;
                        case 6://A milla
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1609.344), MathContext.DECIMAL32);
                            break;
                        case 7://A Yarda
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1094),MathContext.DECIMAL32);
                            break;
                        case 8://A pie
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(3.281),MathContext.DECIMAL32);
                            break;
                        case 9://A pulgada
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(39.37),MathContext.DECIMAL32);
                            break;
                        case 10://A Milla nautica
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1852),MathContext.DECIMAL32);
                            break;
                    }
                    break;
                case 2: //Centimetro
                    switch (posicionA){
                        case 0:// A Kilometro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(100000),MathContext.DECIMAL32);
                            break;
                        case 1:// A metro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(100),MathContext.DECIMAL32);
                            break;
                        case 3: //A Milimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(10),MathContext.DECIMAL32);
                            break;
                        case 4://A Micrometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(10000),MathContext.DECIMAL32);
                            break;
                        case 5://A nanometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(10000000),MathContext.DECIMAL32);
                            break;
                        case 6://A milla
                            bigConversion = bigDato.divide(BigDecimal.valueOf(160934.4), MathContext.DECIMAL32);
                            break;
                        case 7://A Yarda
                            bigConversion = bigDato.divide(BigDecimal.valueOf(91.44), MathContext.DECIMAL32);
                            break;
                        case 8://A pie
                            bigConversion = bigDato.divide(BigDecimal.valueOf(30.48), MathContext.DECIMAL32);
                            break;
                        case 9://A pulgada
                            bigConversion = bigDato.divide(BigDecimal.valueOf(2.54), MathContext.DECIMAL32);
                            break;
                        case 10://A Milla nautica
                            bigConversion = bigDato.divide(BigDecimal.valueOf(185200),MathContext.DECIMAL32);
                            break;
                    }
                    break;
                case 3: //Milimetro
                    switch (posicionA){
                        case 0:// A Kilometro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1000000),MathContext.DECIMAL32);
                            break;
                        case 1:// A metro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1000),MathContext.DECIMAL32);
                            break;
                        case 2: //A centimetro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(10),MathContext.DECIMAL32);
                            break;
                        case 4://A Micrometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1000),MathContext.DECIMAL32);
                            break;
                        case 5://A nanometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1000000),MathContext.DECIMAL32);
                            break;
                        case 6://A milla
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1.609000000), MathContext.DECIMAL32);
                            break;
                        case 7://A Yarda
                            bigConversion = bigDato.divide(BigDecimal.valueOf(914.4), MathContext.DECIMAL32);
                            break;
                        case 8://A pie
                            bigConversion = bigDato.divide(BigDecimal.valueOf(304.8), MathContext.DECIMAL32);
                            break;
                        case 9://A pulgada
                            bigConversion = bigDato.divide(BigDecimal.valueOf(25.4), MathContext.DECIMAL32);
                            break;
                        case 10://A Milla nautica
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1.852000000),MathContext.DECIMAL32);
                            break;
                    }
                    break;
                case 4: //Micrometro
                    switch (posicionA){
                        case 0:// A Kilometro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1000000000),MathContext.DECIMAL32);
                            break;
                        case 1:// A metro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1000000),MathContext.DECIMAL32);
                            break;
                        case 2: //A centimetro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(10000),MathContext.DECIMAL32);
                            break;
                        case 3://A Milimetro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1000),MathContext.DECIMAL32);
                            break;
                        case 5://A nanometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1000),MathContext.DECIMAL32);
                            break;
                        case 6://A milla
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1.609000000000), MathContext.DECIMAL32);
                            break;
                        case 7://A Yarda
                            bigConversion = bigDato.divide(BigDecimal.valueOf(914400), MathContext.DECIMAL32);
                            break;
                        case 8://A pie
                            bigConversion = bigDato.divide(BigDecimal.valueOf(304800), MathContext.DECIMAL32);
                            break;
                        case 9://A pulgada
                            bigConversion = bigDato.divide(BigDecimal.valueOf(25400), MathContext.DECIMAL32);
                            break;
                        case 10://A Milla nautica
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1.852000000000),MathContext.DECIMAL32);
                            break;
                    }
                    break;
                case 5: //Nanometro
                    switch (posicionA){
                        case 0:// A Kilometro
                            bigConstante = new BigDecimal("1000000000000") ;
                            bigConversion = bigDato.divide(bigConstante,MathContext.DECIMAL32);
                            break;
                        case 1:// A metro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1000000000),MathContext.DECIMAL32);
                            break;
                        case 2: //A centimetro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(10000000),MathContext.DECIMAL32);
                            break;
                        case 3://A Milimetro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1000000),MathContext.DECIMAL32);
                            break;
                        case 4://A micrometro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1000),MathContext.DECIMAL32);
                            break;
                        case 6://A milla
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1.609000000000000), MathContext.DECIMAL32);
                            break;
                        case 7://A Yarda
                            bigConversion = bigDato.divide(BigDecimal.valueOf(9.14400000000), MathContext.DECIMAL32);
                            break;
                        case 8://A pie
                            bigConversion = bigDato.divide(BigDecimal.valueOf(3.04800000000), MathContext.DECIMAL32);
                            break;
                        case 9://A pulgada
                            bigConversion = bigDato.divide(BigDecimal.valueOf(2.540000000), MathContext.DECIMAL32);
                            break;
                        case 10://A Milla nautica
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1.852000000000000),MathContext.DECIMAL32);
                            break;
                    }
                    break;
                case 6: //Milla
                    switch (posicionA){
                        case 0:// A Kilometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1.609),MathContext.DECIMAL32);
                            break;
                        case 1:// A metro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1609.344),MathContext.DECIMAL32);
                            break;
                        case 2: //A centimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(160934.4),MathContext.DECIMAL32);
                            break;
                        case 3://A Milimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1.609000000),MathContext.DECIMAL32);
                            break;
                        case 4://A Micrometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1.609000000000),MathContext.DECIMAL32);
                            break;
                        case 5://A nanometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1.609000000000000), MathContext.DECIMAL32);
                            break;
                        case 7://A Yarda
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1760), MathContext.DECIMAL32);
                            break;
                        case 8://A pie
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(5280), MathContext.DECIMAL32);
                            break;
                        case 9://A pulgada
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(63360), MathContext.DECIMAL32);
                            break;
                        case 10://A Milla nautica
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1.151),MathContext.DECIMAL32);
                            break;
                    }
                    break;
                case 7: //Yarda
                    switch (posicionA){
                        case 0:// A Kilometro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1093.613),MathContext.DECIMAL32);
                            break;
                        case 1:// A metro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1.094),MathContext.DECIMAL32);
                            break;
                        case 2: //A centimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(91.44),MathContext.DECIMAL32);
                            break;
                        case 3://A Milimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(914.4),MathContext.DECIMAL32);
                            break;
                        case 4://A Micrometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(914400),MathContext.DECIMAL32);
                            break;
                        case 5://A Nanometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(9.14400000000), MathContext.DECIMAL32);
                            break;
                        case 6://A Milla
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1760),MathContext.DECIMAL32);
                            break;
                        case 8://A pie
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(3),MathContext.DECIMAL32);
                            break;
                        case 9://A pulgada
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(36),MathContext.DECIMAL32);
                            break;
                        case 10://A Milla nautica
                            bigConversion = bigDato.divide(BigDecimal.valueOf(2025.372),MathContext.DECIMAL32);
                            break;
                    }
                    break;
                case 8: //Pie
                    switch (posicionA){
                        case 0:// A Kilometro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(2025.372),MathContext.DECIMAL32);
                            break;
                        case 1:// A metro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(3.281),MathContext.DECIMAL32);
                            break;
                        case 2: //A centimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(30.48),MathContext.DECIMAL32);
                            break;
                        case 3://A Milimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(304.8),MathContext.DECIMAL32);
                            break;
                        case 4://A Micrometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(304800),MathContext.DECIMAL32);
                            break;
                        case 5://A Nanometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(3.04800000000), MathContext.DECIMAL32);
                            break;
                        case 6://A Milla
                            bigConversion = bigDato.divide(BigDecimal.valueOf(5280),MathContext.DECIMAL32);
                            break;
                        case 7://A Yarda
                            bigConversion = bigDato.divide(BigDecimal.valueOf(3),MathContext.DECIMAL32);
                            break;
                        case 9://A pulgada
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(12),MathContext.DECIMAL32);
                            break;
                        case 10://A Milla nautica
                            bigConversion = bigDato.divide(BigDecimal.valueOf(6076.115),MathContext.DECIMAL32);
                            break;
                    }
                    break;
                case 9: //Pulgada
                    switch (posicionA){
                        case 0:// A Kilometro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(39370.079),MathContext.DECIMAL32);
                            break;
                        case 1:// A metro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(39.37),MathContext.DECIMAL32);
                            break;
                        case 2: //A centimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(2.54),MathContext.DECIMAL32);
                            break;
                        case 3://A Milimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(25.4),MathContext.DECIMAL32);
                            break;
                        case 4://A Micrometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(25400),MathContext.DECIMAL32);
                            break;
                        case 5://A nanometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(2.540000000), MathContext.DECIMAL32);
                            break;
                        case 6://A Milla
                            bigConversion = bigDato.divide(BigDecimal.valueOf(63360),MathContext.DECIMAL32);
                            break;
                        case 7://A Yarda
                            bigConversion = bigDato.divide(BigDecimal.valueOf(36),MathContext.DECIMAL32);
                            break;
                        case 8://A pie
                            bigConversion = bigDato.divide(BigDecimal.valueOf(12),MathContext.DECIMAL32);
                            break;
                        case 10://A Milla nautica
                            bigConversion = bigDato.divide(BigDecimal.valueOf(72913.386),MathContext.DECIMAL32);
                            break;
                    }
                    break;
                case 10: //Milla nautica
                    switch (posicionA){
                        case 0:// A Kilometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1.852),MathContext.DECIMAL32);
                            break;
                        case 1:// A metro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1852),MathContext.DECIMAL32);
                            break;
                        case 2: //A centimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(185200),MathContext.DECIMAL32);
                            break;
                        case 3://A Milimetro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1.852000000),MathContext.DECIMAL32);
                            break;
                        case 4://A Micrometro
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1.852000000000),MathContext.DECIMAL32);
                            break;
                        case 5://A Nanometro
                            bigConversion = bigDato.divide(BigDecimal.valueOf(1.852000000000000), MathContext.DECIMAL32);
                            break;
                        case 6://A Milla
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(1.151),MathContext.DECIMAL32);
                            break;
                        case 7://A Yarda
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(2025.372),MathContext.DECIMAL32);
                            break;
                        case 8://A pie
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(6076.115),MathContext.DECIMAL32);
                            break;
                        case 9://A pulgada
                            bigConversion = bigDato.multiply(BigDecimal.valueOf(72913.386),MathContext.DECIMAL32);
                            break;
                    }
                    break;
            }
        }
        //Regresa transformado a texto el valor obtenido de la bigConversion
        return bigConversion.toString();
    }
}
