import java.util.*;
class Base64Demo
{
	public static void main(String args[])
	{
		char c = 'M';
		int asciiVal = (int)c;
		System.out.println(asciiVal);

		System.out.println(Integer.toBinaryString(asciiVal));

		c = 'I';
		asciiVal= (int)c;
		System.out.println(Integer.toBinaryString(asciiVal));

		c = 'E';
		asciiVal = (int)c;
		System.out.println(asciiVal);

		System.out.println(Integer.toBinaryString(asciiVal));

		c = 'T';
		asciiVal= (int)c;
		System.out.println(Integer.toBinaryString(asciiVal));

		String[] strs = {"010011", "010100", "100101", "010100"};
		for(String str : strs)
			System.out.println(Integer.parseInt(str,2));

		Base64.Encoder encoder = Base64.getEncoder();
		Base64.Decoder decoder = Base64.getDecoder();

		String input = "MIET";

		String encodedForm = encoder.encodeToString(input.getBytes());

		System.out.println(encodedForm);

		byte[] decodedForm = decoder.decode(encodedForm);
		System.out.println(new String(decodedForm));


	}

}