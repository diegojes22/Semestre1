#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
   int unidad = 0;
   int numero = 0;
   int contador = 0;
   int centena = 0;
   int decena = 0;

   do {
      cout << "Ingrese un numero entre 1 y 999" << endl;
      cin >> numero;
   } while(numero < 0 || numero > 999);

   while (contador <= numero)
   {
      unidad ++;

      if (unidad == 10)
      {
         unidad = 0;
         decena ++;
      }
      if (decena == 10)
      {
         decena = 0;
         centena ++;
      }

      contador ++;
   }

   cout << "Numero ingresado: " << numero << '\n';   
   cout << "Unidades: " << unidad << '\n';   
   cout << "Decenas: " << decena << '\n';   
   cout << "Centena: " << centena << "\n\n\a";

   system("pause");

   return 0;
}
