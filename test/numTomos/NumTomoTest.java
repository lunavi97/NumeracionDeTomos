package numTomos;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NumTomoTest {

  String dominioAnimales[] = {"MONOS", "LEONES", "CEBRAS", "GATOS"};
  String dominioTresLetras[] =
    {
        "AAA", "AAB", "AAC", "AAD", "AAE", "AAF",
        "AAG", "AAH", "AAI", "AAJ", "AAK", "AAL",
        "AAM", "AAN", "AAO", "AAP", "AAQ", "AAR",
        "AAS", "AAT", "AAU", "AAV", "AAW", "AAX",
        "AAY", "AAZ",
        "ABA", "ABB", "ABC", "ABD", "ABE", "ABF",
        "ABG", "ABH", "ABI", "ABJ", "ABK", "ABL",
        "ABM", "ABN", "ABO", "ABP", "ABQ", "ABR",
        "ABS", "ABT", "ABU", "ABV", "ABW", "ABX", 
        "ABY", "ABZ",
        "ACA", "ACB", "ACC", "ACD", "ACE", "ACF",
        "ACG", "ACH", "ACI", "ACJ", "ACK", "ACL",
        "ACM", "ACN", "ACO", "ACP", "ACQ", "ACR",
        "ACS", "ACT", "ACU", "ACV", "ACW", "ACX",
        "ACY", "ACZ", 
        "ADA", "ADB", "ADC", "ADD", "ADE", "ADF",
        "ADG", "ADH", "ADI", "ADJ", "ADK", "ADL",
        "ADM", "ADN", "ADO", "ADP", "ADQ", "ADR",
        "ADS", "ADT", "ADU", "ADV"
    };
  String dominioMax[] = {"AAAAAAAAAAAAAAAAAAAA","BBBBBBBBBBBBBBBBBBBB"};
  NumTomo numTomo = new NumTomo();

  @Test
  public void enunciado01() {
    int n = 132;
    Assert.assertEquals("LEONES-33", numTomo.numeracionDeTomos(n, dominioAnimales));
  }

  @Test
  public void enunciado02() {
    int n = 1;
    Assert.assertEquals("MONOS-01", numTomo.numeracionDeTomos(n, dominioAnimales));
  }

  @Test
  public void enunciado03() {
    int n = 99;
    Assert.assertEquals("MONOS-99", numTomo.numeracionDeTomos(n, dominioAnimales));
  }

  @Test
  public void enunciado04() {
    int n = 100;
    Assert.assertEquals("LEONES-01", numTomo.numeracionDeTomos(n, dominioAnimales));
  }

  @Test
  public void enunciado05() {
    int n = 56;
    String dominio[] = {"A", "B", "C", "D", "E", "F"};
    Assert.assertEquals("A-56", numTomo.numeracionDeTomos(n, dominio));
  }

  @Test
  public void enunciado06() {
    int n = 100;
    String dominio[] = {"@", "#", "$", "%", "^", "&", "*"};
    Assert.assertEquals("#-01", numTomo.numeracionDeTomos(n, dominio));
  }

  @Test
  public void limite01() {
    int n = 1;
    Assert.assertEquals("AAA-01", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite02() {
    int n = 99;
    Assert.assertEquals("AAA-99", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite03() {
    int n = 100;
    Assert.assertEquals("AAB-01", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite04() {
    int n = 9900;
    Assert.assertEquals("ADV-99", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite05() {
    int n = 9801;
    Assert.assertEquals("ADU-99", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite06() {
    int n = 9802;
    Assert.assertEquals("ADV-01", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite07() {
    int n = 9803;
    Assert.assertEquals("ADV-02", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite08() {
    int n = 9804;
    Assert.assertEquals("ADV-03", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite09() {
    int n = 9900;
    Assert.assertEquals("ADV-99", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite10() {
    int n = 9700;
    Assert.assertEquals("ADT-97", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite11() {
    int n = 9702;
    Assert.assertEquals("ADT-99", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite12() {
    int n = 9703;
    Assert.assertEquals("ADU-01", numTomo.numeracionDeTomos(n, dominioTresLetras));
  }

  @Test
  public void limite13() {
    int n = 198;
    Assert.assertEquals("BBBBBBBBBBBBBBBBBBBB-99", numTomo.numeracionDeTomos(n, dominioMax));
  }

}
