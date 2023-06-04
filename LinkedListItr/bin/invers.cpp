#include <conio.h>
#include <cstdlib>
#include <iomanip>
#include <iostream>
using namespace std;

double matrix[10][10], identitas[10][10], solusi[10], hasil = 0,
                                                      identitasi[10][10];
double vektorB[10] = {1, -1, 1, -1, 1, -1, 1, -1, 1, -8};

void tampilmatriks(double matrix[][10]) {
  for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
      cout << setw(15) << matrix[i][j];
    }
    cout << endl;
  }
  cout << endl;
}
// void isirandom(double matrix[10][10]){
//	for(int i=0; i<10; i++){
//		for(int j=0; j<10; j++){
//			double y = rand()%10;
//				matrix[i][j]=y;
//			}
//		}
//	}
// void isiidentity(double matriks[][10]){
//	for (int i=0; i<10; i++){
//		for(int j=0; j<10; j++){
//  			if(i!=j){
//			 matriks[i][j]=0;
//  			}
//			else{
//				matriks[i][j]=1;
//				}
//			}
//		}
//	}
void isiidentitas(double identitasi[10][10]) {
  for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
      if (i == j) {
        cout << setw(15) << "1";
      } else {
        cout << setw(15) << "0";
      }
    }
    cout << endl;
  }
}

void tukarkalaukosong(double matrix[10][10], double identitas[10][10]) {
  for (int i = 0; i < 10; i++) {
    if (matrix[i][i] == 0) {
      int a;
      for (int a = 0; a < 10; a++) {
        if (a == i) {
          continue;
        }
        if (matrix[a][i] != 0) {
          break;
        }
      }
      for (int m = 0; m < 10; m++) {
        int tampil = matrix[a][m];
        matrix[a][m] = matrix[i][m];
        matrix[i][m] = tampil;
        tampil = identitas[a][m];
        identitas[a][m] = identitas[i][a];
        identitas[i][a] = tampil;
      }
    }
  }
}
void invers(double matrix[10][10], double identitas[10][10],
            double vektorB[10]) {
  double diagonal, kunci;
  for (int i = 0; i < 10; i++) {
    diagonal = matrix[i][i];
    for (int j = 0; j < 10; j++) {
      matrix[i][j] /= diagonal;
    }
    for (int m = 0; m < 10; m++) {
      kunci = matrix[m][i];
      if (i != m) {
        for (int l = 0; l < 10; l++) {
          matrix[m][l] = matrix[m][l] - (matrix[i][l] * kunci);
          identitas[m][l] = identitas[m][l] - (identitas[i][l] * kunci);
        }
      }
    }
  }
}
int main() {
  for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
      double y = rand() % 10;
      matrix[i][j] = y;
    }
  }

  for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
      if (i != j) {
        identitas[i][j] = 0;
      } else {
        identitas[i][j] = 1;
      }
    }
  }
  //	isirandom(matrix); isiidentity(identitas);
  cout << setw(38) << "===== MATRIKS AWAL =====" << endl;
  tampilmatriks(matrix);
  tukarkalaukosong(matrix, identitas);
  invers(matrix, identitas, vektorB);
  cout << setw(43) << "===== MATRIKS IDENTITAS =====" << endl;
  isiidentitas(identitasi);
  cout << "\n" << setw(50) << "===== MATRIKS AWAL SETELAH OBE =====" << endl;
  tampilmatriks(matrix);
  cout << setw(48) << "===== HASIL DARI OPERASI OBE =====" << endl;
  tampilmatriks(identitas);
  cout << setw(46) << "===== HASIL INVERS MATRIKS =====" << endl;
  //	hasil=0;
  for (int i = 0; i < 10; i++) {
    hasil = 0;
    for (int j = 0; j < 10; j++) {
      hasil += (identitas[i][j] * vektorB[j]);
    }
    solusi[i] = hasil;
  }
  for (int i = 0; i < 10; i++) {
    cout << setw(15) << "X" << i << " : " << solusi[i] << endl;
  }
  getch();
}