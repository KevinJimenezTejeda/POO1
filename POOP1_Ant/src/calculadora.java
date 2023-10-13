/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kevin
 */
public class calculadora {
      public static int hex2Dec(String hex) {
        hex = hex.toUpperCase();
        int decimalValue = 0;
        int power = 0;
        String hexDigitos = "0123456789ABCDEF";
        
        for (int i = hex.length() - 1; i >= 0; i--) {
            char hexDigit = hex.charAt(i);  // Devuelve el digito segun la posicion empezando desde la derecha del valor ingresado
            int decimalDigit = hexDigitos.indexOf(hexDigit);  //Devuelve el valor entero de la posicion del digito seleccionado
            if(decimalDigit == -1 ) return -1;
            decimalValue += decimalDigit * Math.pow(16, power); //Crea la conversion con la formula de la suma
            power++;
        }
        
        return decimalValue;
    }

    public static String dec2Hex(int dec){
        String hexa = "0123456789ABCDEF";
        String out = ""; //resultado final
        int modd;
        while (dec > 0){
        modd = dec % 16;
        dec /= 16;
        out = hexa.charAt(modd) + out;
        }
        return out;
    }
    
    public static String dec2Oct(int dec){
       String oct = "";
       int modd = 0;
       while (dec > 0){
        modd = dec%8;
        dec/=8;
        oct = modd + oct;
       }
       return oct;
   }

    public static int oct2Dec(String och){
        int oct = 0;
        if(och.contains("8") || och.contains("9") ){
            System.out.println("Numero invalido: "+ och);
            return 0;
        }else{
         oct = Integer.parseInt(och);
        }
        int decimal = 0;
        int power = 0;
        int res = 1;
        int modd = 0;
        while (res > 0){
            modd = oct % 10;
            oct /= 10;
            res = oct;
            decimal += modd* Math.pow(8, power);
            power++;
        }        
        return decimal;
    }

    public static String hex2Oct(String hex){
        return dec2Oct(hex2Dec(hex));
    }

    public static String oct2Hex(String oct){
        return dec2Hex(oct2Dec(oct));
    }

    public static int bin2Dec(int bina) {
        int dec = 0;
        int base = 1;
        while (bina > 0) {
            int digit = bina % 10;
            dec += digit * base;
            base *= 2;
            bina /= 10;
        }
        return dec;
    }

    public static String dec2Bin(int dec) {
        String bin = "";
        if (dec == 0) {
            return "0";
        }
        while (dec > 0) {
            int res = dec % 2;
            bin = res + bin;
            dec /= 2;
        }
        return bin;
    }

    public static String bin2Hex(int bin){
        return dec2Hex(bin2Dec(bin));
    }

    public static String hex2Bin(String hex){
        return dec2Bin(hex2Dec(hex));
    }

    public static String bin2Oct(int bin){
        return dec2Oct(bin2Dec(bin));
    }

    public static String oct2Bin(String bin){
        return dec2Bin(oct2Dec(bin));
    }


    public static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Operaciones con binario");
        System.out.println("2. Operaciones con decimal");
        System.out.println("3. Operaciones con octal");
        System.out.println("4. Operaciones con hexadecimal");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void ejecutar(int opc, Scanner scanner) {
        switch (opc) {
            case 1:
                menuBinario(scanner);
                break;
            case 2:
                menuDecimal(scanner);
                break;
            case 3:
                menuOctal(scanner);
                break;
            case 4:
                menuHexa(scanner);
                break;
            case 5:
                System.out.println("Gracias por usar el programa.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void menuDecimal(Scanner scanner) {
        System.out.println("Operaciones con Decimal:"); 
        System.out.println("1. Decimal a Binario");
        System.out.println("2. Decimal a Octal");
        System.out.println("3. Decimal a Hexadecimal");
        System.out.println("4. Volver al menú principal");
        System.out.print("Selecciona una opción: ");
        scanner.nextLine();
        int opcion = scanner.nextInt();
         switch (opcion) {
            case 1:
        scanner.nextLine();
        System.out.println("Que numero quieres pasar de decimal a binario?");
        int decA = scanner.nextInt();
        String binDec = dec2Bin(decA);
        System.out.println(decA+ " = "+binDec);
                break;
            case 2:
        scanner.nextLine();
        System.out.println("Que numero quieres pasar de Decimal a Octal?");
        int doc = scanner.nextInt();
        String octdec = dec2Oct(doc);
        System.out.println(doc+ " = "+octdec);
                break;
            case 3:
        scanner.nextLine();
        System.out.println("Que numero quieres pasar de Decimal a Hexadecimal?");
        int des = scanner.nextInt();
        String dhex = dec2Hex(des);
        System.out.println(des+ " = "+dhex);
                break;
            case 4:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    
    public static void menuBinario(Scanner scanner) {
        System.out.println("Operaciones con Binario:");
        System.out.println("1. Binario a Decimal");
        System.out.println("2. Binario a Octal");
        System.out.println("3. Binario a Hexadecimal");
        System.out.println("4. Volver al menú principal");
        System.out.print("Selecciona una opción: ");
        scanner.nextLine();
        int op = scanner.nextInt();
        switch (op) {

            case 1:
        scanner.nextLine();
        System.out.println("Que numero quieres pasar de binario a decimal?");
        int binA = scanner.nextInt();
        int decBin = bin2Dec(binA);
        System.out.println(binA+ " = "+decBin);
                break;

            case 2:
        scanner.nextLine();
        System.out.println("Que numero quieres pasar de binario a Octadecimal?");
        int binC = scanner.nextInt();
        String binOct = bin2Oct(binC);
        System.out.println(binC+ " = "+binOct);
            break;

            case 3:
        scanner.nextLine();
         System.out.println("Que numero quieres pasar de binario a Hexadecimal?");
        int binB = scanner.nextInt();
        String hexaBin = bin2Hex(binB);
        System.out.println(binB+ " = "+hexaBin);
        scanner.nextLine();
            break;
            
            default:
                break;
        }
    }

    public static void menuOctal(Scanner scanner) {
        System.out.println("Operaciones con Octal:");
        System.out.println("1. Octal a Binario");
        System.out.println("2. Octal a Decimal");
        System.out.println("3. Octal a Hexadecimal");
        System.out.println("4. Volver al menú principal");
        System.out.print("Selecciona una opción: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:   
        scanner.nextLine();
        System.out.println("Que numero quieres pasar de Octal a binario?");
        String octAb = scanner.nextLine();
        String binOctA = oct2Bin(octAb);
        System.out.println(octAb+ " = "+binOctA);
                break;
            case 2:
        scanner.nextLine();
        System.out.println("Que numero quieres pasar de Octal a Decimal?");
        String oct = scanner.nextLine();
        int decOct = oct2Dec(oct);
        System.out.println(oct+ " = "+decOct);
        break;
            case 3:
        scanner.nextLine();
        System.out.println("Que numero quieres pasar de Octal a Hexadecimal?");
        String octo = scanner.nextLine();
        String octohex = oct2Hex(octo);
        System.out.println(octo+ " = "+octohex);
        break;
            case 4:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void menuHexa(Scanner scanner) {
        System.out.println("Operaciones con Hexadecimal:");
        System.out.println("1. Hexadecimal a Binario");
        System.out.println("2. Hexadecimal a Decimal");
        System.out.println("3. Hexadecimal a Octal");
        System.out.println("4. Volver al menú principal");
        System.out.print("Selecciona una opción: ");
        int opcion = scanner.nextInt();
         scanner.nextLine();
        switch (opcion) {
            case 1:
        scanner.nextLine();
        System.out.println("Que numero quieres pasar de hexadecimal a binario?");
        String hexAb = scanner.nextLine();
        String binHex = hex2Bin(hexAb);
        System.out.println(hexAb.toUpperCase()+ " = "+binHex);               
         break;   
         case 2:
        System.out.println("Que numero quieres pasar de Hexadecimal a Decimal?");
        String hex = scanner.nextLine();
        int dec = hex2Dec(hex.toUpperCase());
        if(dec == -1 ){
            System.out.println("Numero invalido");
        }else System.out.println(hex.toUpperCase()+ " = "+dec);
        break;
            case 3:
        System.out.println("Que numero quieres pasar de Hexadecimal a Octal?");
        String docA = scanner.nextLine();
        String octdecB = hex2Oct(docA);
        System.out.println(docA+ " = "+octdecB);
                break;
            case 4:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
   
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---CALCULADORA DE PROGRAMADOR---\n");
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            ejecutar(opcion, scanner);
        } while (opcion != 5);

        scanner.nextLine();
        scanner.close();
    }
}
