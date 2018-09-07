package main;

public class OperatorTestClass{
	public int addition(int operand1,int operand2) {
		return operand1+operand2;
	}
	
	public int subtruction(int operand1,int operand2) {
		return operand1-operand2;
	}
	
	public int multiplication(int operand1,int operand2) {
		return operand1*operand2;
	}
	
	public int division(int operand1,int operand2) {
		return operand1/operand2;
	}
	
	public int BitAnd(int operand1,int operand2) {
		return operand1 & operand2;
	}
	
	public int BitOr(int operand1,int operand2) {
		return operand1 | operand2;
	}
	
	public int BitNot(int operand1) {
		return  ~operand1;
	}
	
	public int Bitxor(int operand1,int operand2) {
		return  operand1^operand2;
	}
	
	public boolean logicalor(boolean op1,boolean op2) {
		return op1 || op2;	
	}
	public boolean logicalAnd(boolean op1,boolean op2) {
		return op1 && op2;	
	}
	public boolean logicalxor(boolean op1,boolean op2) {
		return op1 ^ op2;	
	}
	public boolean logicalNot(boolean op1) {
		return !op1;	
	}
}
