import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Decision {

  AGREED("Согласовано"),

  ARGEED_CHANGED("Согласовано с изменениями"),

  REFUSAL_BANK("Отказ банка");

  private final String name;
}
