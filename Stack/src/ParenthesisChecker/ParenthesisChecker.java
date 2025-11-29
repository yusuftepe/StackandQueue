package ParenthesisChecker;

public class ParenthesisChecker {

	public static boolean check(String expression) {
		MyStack<Character> stack = new MyStack <>();
		
		for (int i = 0; i < expression.length(); i++) {
			char current = expression.charAt(i);
		
			if (current == '(' || current == '[' || current == '{') {
				stack.push(current);
			}
			
			else if (current == ')' || current == ']' || current == '}') {
				
				if (stack.isEmpty()) {
					System.out.println("HATA: Kapatma parantezi (" + current + ") için açma parantezi bulunamadı.");
					return false;
				}
				
				char topChar = stack.pop();
				
				if ((current == ')' && topChar != '(') ||
					(current == ']' && topChar != '[') ||
					(current == '}' && topChar != '{'))
				{
					System.out.println("HATA: Yanlış eşleşme. " + current + " parantezi " + topChar + " ile eşleşemedi.");
                    return false;
				}
			}
		}		
		
		if (stack.isEmpty()) {
            System.out.println("BAŞARILI: Tüm parantezler doğru eşleşti.");
            return true;
        } else {
            System.out.println("HATA: Kapanmamış parantezler kaldı.");
            return false;
	}}
		
}
