//Progam to demostrate Infix to postfix conversion
#include <iostream>
#include <stack>
#include <string>


int precedence(char op) {
    if (op == '+' || op == '-')
        return 1;
    else if (op == '*' || op == '/')
        return 2;
    else
        return 0;
}

std::string infixToPostfix(const std::string& infix) {
    std::string postfix;
    std::stack<char> stack;

    for (char ch : infix) {
        if (isalnum(ch)) {
            postfix += ch;
        }
        else if (ch == '(') {
            stack.push(ch);
        }
        else if (ch == ')') {
            while (!stack.empty() && stack.top() != '(') {
                postfix += stack.top();
                stack.pop();
            }
            stack.pop(); // Discard the '(' from stack
        }
        else {
            while (!stack.empty() && precedence(ch) <= precedence(stack.top())) {
                postfix += stack.top();
                stack.pop();
            }
            stack.push(ch);
        }
    }

    while (!stack.empty()) {
        postfix += stack.top();
        stack.pop();
    }

    return postfix;
}

int main() {
    std::string infixExpression;
    std::cout << "Enter an infix expression: ";
    std::getline(std::cin, infixExpression);

    std::string postfixExpression = infixToPostfix(infixExpression);
    std::cout << "Postfix expression: " << postfixExpression << std::endl;

    return 0;
}
