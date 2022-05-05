
public class TestZahlensystemwandler {

	public static void main(String[] args) {
		//get Digit (char)
		System.out.println("get Digit:");
		System.out.println("0 = " + MeinZahlensystemwandler.getDigit('0'));
		System.out.println("1 = " + MeinZahlensystemwandler.getDigit('1'));
		System.out.println("9 = " + MeinZahlensystemwandler.getDigit('9'));
		System.out.println("A = " + MeinZahlensystemwandler.getDigit('A'));
		System.out.println("B = " + MeinZahlensystemwandler.getDigit('B'));
		System.out.println("Z = " + MeinZahlensystemwandler.getDigit('Z'));
		System.out.println("? = " + MeinZahlensystemwandler.getDigit('?'));
		
		//get Digit (int)
		System.out.println("\nget Digit:");
		System.out.println("0 = " + MeinZahlensystemwandler.getDigit(0));
		System.out.println("1 = " + MeinZahlensystemwandler.getDigit(1));
		System.out.println("9 = " + MeinZahlensystemwandler.getDigit(9));
		System.out.println("10 = " + MeinZahlensystemwandler.getDigit(10));
		System.out.println("11 = " + MeinZahlensystemwandler.getDigit(11));
		System.out.println("35 = " + MeinZahlensystemwandler.getDigit(35));
		System.out.println("63 = " + MeinZahlensystemwandler.getDigit(63));
		
		//numToDec (num(String), basis(int))
		System.out.println("\nnumToDec:");
		System.out.println("01110110 mit der Basis 2 = " + MeinZahlensystemwandler.numToDec("01110110", 2));
		System.out.println("170712 mit der Basis 8 = " + MeinZahlensystemwandler.numToDec("170712", 8));
		System.out.println("170712 mit der Basis 7 = " + MeinZahlensystemwandler.numToDec("170712", 7));
		System.out.println("null mit der Basis 7 = " + MeinZahlensystemwandler.numToDec(null, 7));
		System.out.println(" mit der Basis 7 = " + MeinZahlensystemwandler.numToDec("", 7));
		
		//decToNum (dec(int), basis(int))
		System.out.println("\ndecToNum:");
		System.out.println("118 im 2-Zahlensystem = " + MeinZahlensystemwandler.decToNum(118,2));
		System.out.println("61898 im 8-Zahlensystem = " + MeinZahlensystemwandler.decToNum(61898,8));
		System.out.println("-5 im 2-Zahlensystem = " + MeinZahlensystemwandler.decToNum(-5,2));
		System.out.println("118 im 0-Zahlensystem = " + MeinZahlensystemwandler.decToNum(118, 0));
		
		//hexToDec (num(int))
		System.out.println("\nhexToDec:");
		System.out.println("AFE = " + MeinZahlensystemwandler.hexToDec("AFE"));
		System.out.println("D5 = " + MeinZahlensystemwandler.hexToDec("D5"));
		System.out.println("null = " + MeinZahlensystemwandler.hexToDec(null));
		
		//DecToHex
		System.out.println("\ndecToNum:");
		System.out.println("118 im Hexadezimalsystem = " + MeinZahlensystemwandler.decToHex(118));
		System.out.println("618 im Hexadezimalsystem = " + MeinZahlensystemwandler.decToHex(618));
		
		//dualToDec
		System.out.println("\ndualToDec:");
		System.out.println("01110110 im Dezimalsystem = " + MeinZahlensystemwandler.dualToDec("01110110"));
		System.out.println("10101010 im Dezimalsystem = " + MeinZahlensystemwandler.dualToDec("10101010"));
		
		//decToDual
		System.out.println("\ndecToDual:");
		System.out.println("118 im Binärsystem = " + MeinZahlensystemwandler.decToDual(118));
		System.out.println("170 im Binärsystem = " + MeinZahlensystemwandler.decToDual(170));
		
		//numToNum
		System.out.println("\nnumToNum:");
		System.out.println("118 von 9-system ins 2-system = " + MeinZahlensystemwandler.numToNum("118", 9, 2));
		System.out.println("1100010 von 2-system ins 9-system = " + MeinZahlensystemwandler.numToNum("1100010", 2, 9));

	}

}
