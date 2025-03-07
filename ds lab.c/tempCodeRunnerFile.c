
#include <stdio.h>
#include <stdlib.h>

struct Node {
    int coeff;
    int pow;
    struct Node* next;
};

struct Node* createTerm(int coeff, int pow) {
    struct Node* newTerm = (struct Node*)malloc(sizeof(struct Node));
    newTerm->coeff = coeff;
    newTerm->pow = pow;
    newTerm->next = NULL;
    return newTerm;
}

void appendTerm(struct Node** poly, int coeff, int pow) {
    struct Node* newTerm = createTerm(coeff, pow);
    if (*poly == NULL) {
        (*poly) = newTerm;
        return;
    }
    struct Node* temp = *poly;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = newTerm;
}

void showPolynomial(struct Node* poly) {
    while (poly != NULL) {
        printf("%dx^%d", poly->coeff, poly->pow);
        poly = poly->next;
        if (poly != NULL)
            printf(" + ");
    }
    printf("\n");
}

struct Node* combinePolynomials(struct Node* poly1, struct Node* poly2) {
    struct Node* result = NULL;
    while (poly1 != NULL || poly2 != NULL) {
        int coeff, pow;
        if (poly1 == NULL) {
            appendTerm(&result, poly2->coeff, poly2->pow);
            poly2 = poly2->next;
        } else if (poly2 == NULL) {
            appendTerm(&result, poly1->coeff, poly1->pow);
            poly1 = poly1->next;
        } else if (poly1->pow == poly2->pow) {
            coeff = poly1->coeff + poly2->coeff;
            appendTerm(&result, coeff, poly1->pow);
            poly1 = poly1->next;
            poly2 = poly2->next;
        } else if (poly1->pow > poly2->pow) {
            appendTerm(&result, poly1->coeff, poly1->pow);
            poly1 = poly1->next;
        } else {
            appendTerm(&result, poly2->coeff, poly2->pow);
            poly2 = poly2->next;
        }
    }
    return result;
}

struct Node* subtractPolynomials(struct Node* poly1, struct Node* poly2) {
    struct Node* result = NULL;
    while (poly2 != NULL) {
        poly2->coeff = -poly2->coeff;
        poly2 = poly2->next;
    }
    result = combinePolynomials(poly1, poly2);
    return result;
}

struct Node* multiplyPolynomials(struct Node* poly1, struct Node* poly2) {
    struct Node* result = NULL;
    for (struct Node* term1 = poly1; term1 != NULL; term1 = term1->next) {
        for (struct Node* term2 = poly2; term2 != NULL; term2 = term2->next) {
            appendTerm(&result, term1->coeff * term2->coeff, term1->pow + term2->pow);
        }
    }
    return result;
}

int main() {
    struct Node *poly1 = NULL, *poly2 = NULL, *result = NULL;
    
    appendTerm(&poly1, 3, 2);
    appendTerm(&poly1, 5, 1);
    appendTerm(&poly1, 6, 0);
    
    appendTerm(&poly2, 4, 1);
    appendTerm(&poly2, 2, 0);

    printf("Polynomial 1: ");
    showPolynomial(poly1);
    printf("Polynomial 2: ");
    showPolynomial(poly2);

    result = combinePolynomials(poly1, poly2);
    printf("Addition: ");
    showPolynomial(result);

    result = subtractPolynomials(poly1, poly2);
    printf("Subtraction: ");
    showPolynomial(result);

    result = multiplyPolynomials(poly1, poly2);
    printf("Multiplication: ");
    showPolynomial(result);

    return 0;
}
