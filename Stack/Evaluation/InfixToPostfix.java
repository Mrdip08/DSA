package Stack.Evaluation;
import java.util.Stack;
public class InfixToPostfix {
    String infix;
    int size;
    String result;
    public InfixToPostfix(String infix) {
        this.infix=infix;
        this.size=infix.length();
    }
    
    
    public boolean isOperator(char ch){
        if(ch=='/'||ch=='*'||ch=='+'||ch=='-'){
            return true;
        }
        else{
            return false;
        }
       
    }

    public int Precedence(char ch){
        if (ch=='*'||ch=='/') return 2;
        if(ch=='+'||ch=='-')return 1;
        else return -1;

    }
    public void conversion(){
        String result="";
        Stack <Character> sa=new Stack<>();
        for(int i=0;i<size;i++){
            char ch= infix.charAt(i);

            if(Character.isLetter(ch)){
                result=result+ch;
            }

            else if(ch=='('){
              sa.push(ch);  
            }

            else if(ch==')'){
                while(!sa.empty()&& sa.peek()!='('){
                    result=result+sa.pop();
                }
                sa.pop();
            }

            else if(isOperator(ch)){
                while(!sa.empty() && Precedence(sa.peek())>=Precedence(ch)){
                    result=result+sa.pop();
                }
                sa.push(ch);
            }
        }
         while(!sa.isEmpty()){
                result=result+sa.pop();
            }
            System.out.println("The postfix of the infix expression is="+result);
    }
    
}
