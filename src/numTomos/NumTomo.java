package numTomos;

class NumTomo {

  int i, a;
  
  String numeracionDeTomos(int n, String d[]) {
    i = ( n - 1 ) / 99;
    a = n - 99 * i;
    return d [ i ] + ( a > 9 ? "-" : "-0" ) + a;
  }

}
