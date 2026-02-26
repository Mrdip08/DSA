package Stack.Evaluation;

public class TestEvaluation {
    public static void main(String args[]){
        String infix="A+B*(C-D)";
        InfixToPostfix itp=new InfixToPostfix(infix);
        itp.conversion();
        InfixToPrefix itp2=new InfixToPrefix(infix);
        itp2.conversion();
    }   
}
