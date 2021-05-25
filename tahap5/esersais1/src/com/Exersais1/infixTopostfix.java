package com.Exersais1;
/**
->Tulis algoritma untuk mengubah ekspresi infix
  ke postfix dan infix ke awalan
->Tulis algoritme untuk mengevaluasi postfix dan ekspresi awalan
 */
public class infixTopostfix {
    static int Prioritas(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    //evaluasi******** postfix dan prefix
    static String postfix(String eks){
        stackInfix steck = new stackInfix();
        String result = "";
        for (int i = 0; i < eks.length(); i++) {
            char c = eks.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                result += c;
            } else if(c=='('){
                steck.push(c);
            } else if(c == ')'){
                while (!steck.inikosong()&& steck.peek() != '(') 
                    result += steck.peek();
                   
                    steck.peek();
            }else{
                while (!steck.inikosong() && Prioritas(c) <= Prioritas(steck.peek())) {
                    result += steck.peek();
                    steck.pop();
                }
                steck.push(c);
            }
        }
        while (!steck.inikosong()) {
            result += steck.peek();
            steck.pop();
        }
        return result;
    }
    static String prefix(String str){
        String eks = "";
        String prefix = "";
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == '(') {
                eks += ')';
            } else if(str.charAt(i)=='('){
                eks += '(';
            }else{
                eks += str.charAt(i);
            }
        }
        String post = postfix(eks);
        for (int i = post.length()-1; i >= 0; i--) {
            prefix += post.charAt(i);
        }
        return prefix;
    }
    public static void main(String[] args) {
        String eks = "A+B*C-D";
        System.out.println("infix   : " + eks);
        System.out.println("postfix : "+postfix(eks));
        System.out.println("prefix  : "+prefix(eks));
    }  
}
