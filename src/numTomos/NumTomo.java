package numTomos;

class NumTomo {

  String numeracionDeTomos(int n, String d[]) {
    return d[--n / 99] + ((n %= 99) > 8 ? "-" : "-0") + ++n;
  }

}
