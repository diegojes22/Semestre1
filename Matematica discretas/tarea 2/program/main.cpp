#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
    int division, residuo, i = 7, num;
    char bits[] = "00000000";

    // entrada de datos
    do {
        cout << "Ingrese un numero entre 0 y 255: ";
        cin >> division;
    } while(division < 1 || division > 255);

    num = division;

    // dividir para la convercion
    while (division >= 2) {
        residuo = division % 2;
        division = division / 2;

        if(residuo == 1) {
            bits[i] = '1';
        }else {
            bits[i] = '0';
        }

        i--;
    }
    bits[i] = '1';

    cout << num << " dec -> " << bits << " bits" << "\n\n\a"; 

    system("pause");
    return 0;
}