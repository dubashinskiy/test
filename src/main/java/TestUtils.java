import java.math.BigDecimal;

public class TestUtils {

  public static final String FONDOR = "Отчисления в ФОР";
  public static final String ASV = "Отчисления в АСВ";
  public static final String KS = "Ключевая ставка ЦБ";
  public static final String ALLOWANCE = "Надбавка";
  public static final String SPREAD_INDIVIDUAL = "Индивидуальный спред";
  public static final String SPREAD_PROMO_HOLD = "Спред-промо, удержание";
  public static final String SPREAD_PROMO_NEW = "Спред-промо, новые деньги";
  public static final String COMMA = ",";
  public static final String DOT = ".";
  private static String params;

  static {
    StringBuilder pm = new StringBuilder();
    pm = pm.append(FONDOR).append(COMMA).append(ASV).append(COMMA).append(KS).append(COMMA)
        .append(ALLOWANCE).append(COMMA);
    pm = pm.append(SPREAD_INDIVIDUAL).append(COMMA).append(SPREAD_PROMO_HOLD).append(COMMA)
        .append(SPREAD_PROMO_NEW);
    params = pm.toString();
  }

  public static String getParams() {

    StringBuilder pm = new StringBuilder();

    long long1 = 12;
    long long2 = 12;

    if (compareParams(BigDecimal.valueOf(long1), BigDecimal.valueOf(long2))) {
      pm.append(FONDOR).append(COMMA);
    }

    if (pm.length() > 0) {
      pm.replace(pm.length() - 1, pm.length(), DOT);
      params = pm.toString();
    }

    return params;
  }

  public static Boolean compareParams(BigDecimal newParam, BigDecimal actualParam) {

    Boolean isChanged = false;

    if (newParam == null && actualParam != null) {
      isChanged =  true;
    } else if (newParam != null && actualParam == null) {
      isChanged =  true;
    } else if (newParam != null && actualParam != null) {
      if (newParam.compareTo(actualParam) != 0) {
        isChanged =  true;
      }
    }
    return isChanged;
  }
}
