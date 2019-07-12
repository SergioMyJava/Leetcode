package validparentheses;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesTest {
    ValidParentheses exp = new ValidParentheses();

    @Test
    void isValid() {
        assertEquals( true,exp.isValid("(((((())))))"));
        assertEquals( true,exp.isValid("()()()()"));
        assertEquals( false,exp.isValid("(((((((()"));
        assertEquals( true,exp.isValid("((()(())))"));
        assertEquals( false,exp.isValid("(])"));
        assertEquals( false,exp.isValid("(][)"));
        assertEquals( false,exp.isValid("(])))))))))))"));
    }
}
