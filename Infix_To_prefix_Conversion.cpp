#include <iostream>
#include <stack>

// Function to determine the precedence of operators
int precedence(char op) {
    if (op == '+' || op == '-')
        return 1;
    else if (op == '*' || op == '/')
        return 2;
    else
        return 0;
}

// Function to reverse a string
void reverseString(std::string& str) {
    std::reverse(str.begin(), str.end());
}

// Function to convert infix to prefix
std::string infixToPrefix(const std::string& infix) {
    std::string prefix;
    std::stack<char> stack;
    std::string reversedInfix = infix;
    reverseString(reversedInfix);

    for (char ch : reversedInfix) {
        if (isalnum(ch)) {
            prefix += ch;
        }
        else if (ch == ')') {
            stack.push(ch);
        }
        else if (ch == '(') {
            while (!stack.empty() && stack.top() != ')') {
                prefix += stack.top();
                stack.pop();
            }
            stack.pop(); // Discard the ')' from stack
        }
        else {
            while (!stack.empty() && precedence(ch) < precedence(stack.top())) {
                prefix += stack.top();
                stack.pop();
            }
            stack.push(ch);
        }
    }

    // Pop any remaining operators from the stack
    while (!stack.empty()) {
        prefix += stack.top();
        stack.pop();
    }

    reverseString(prefix);
    return prefix;
}

int main() {
    std::string infixExpression;
    std::cout << "Enter an infix expression: ";
    std::getline(std::cin, infixExpression);

    std::string prefixExpression = infixToPrefix(infixExpression);
    std::cout << "Prefix expression: " << prefixExpression << std::endl;

    return 0;
}
