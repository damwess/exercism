import java.lang.Character;

class SqueakyClean {

  static String clean(String identifier) {
    StringBuilder squeakyClean = new StringBuilder();
    char[] identifierArray = identifier.toCharArray();

    for (int i = 0; i < identifierArray.length; i++) {
      char c = identifierArray[i];

      if (Character.toString(c).equals("-")) {
        char upperChar = Character.toUpperCase(identifierArray[i + 1]);
        squeakyClean.append(upperChar);
        i++;
        continue;
      }

      if (!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)) {
        continue;
      }

      if (Character.isDigit(c)) {
        if (Character.toString(c).equals("4")) squeakyClean.append("a");
        if (Character.toString(c).equals("3")) squeakyClean.append("e");
        if (Character.toString(c).equals("0")) squeakyClean.append("o");
        if (Character.toString(c).equals("1")) squeakyClean.append("l");
        if (Character.toString(c).equals("7")) squeakyClean.append("t");
        continue;
      }

      if (Character.isSpaceChar(c)) {
        squeakyClean.append("_");
        continue;
      }

      squeakyClean.append(c);
    }

    return squeakyClean.toString();
  }
}
