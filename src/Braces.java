public class Braces {
	public static void main(String[] args) {
		//String[] data = new String[] { "[]{}", "[]" };
		String[] data = new String[] { "{[]{}", "[]}" };
		String[] braces = braces(data);
	for (int i = 0; i < braces.length; i++) {
		System.out.println(braces[i]);
	}
	}

	static String[] braces(String[] data) {
		String[] op = new String[data.length];
		for (int i = 0; i < data.length; i++) {
			boolean isValid = isValid(data[i]);
			if (isValid) {
				op[i] = "YES";
			} else {
				op[i] = "NO";
			}
		}
		return op;
	}

	private static boolean isValid(String string) {

		boolean isValid = false;

		for (int i = 0; i < string.length(); i = i + 2) {
			char first = string.charAt(i);
			char next = string.charAt(i + 1);
			switch (first) {
			case '{':
				if (next != '}') {
					return false;
				}
				break;
			case '[':
				if (next != ']') {
					return false;
				}

				break;

				
			case '(':
				if (next != ')') {
					return false;
				}

				break;

			default:
				break;
			}
		}
		return true;
	}
}
