package UAS;

public class twotwoone {

    public static String Longest(String arr1,String arr2) {
        String result = "";

        for (int index = 0; index < arr1.length(); index++) {
            for (int i = 0; i < arr2.length(); i++) {
                if (arr1.charAt(index) == arr2.charAt(i)) {

                    if (!result.contains((arr1.substring(index, index + 1)))) {
                        result += arr1.substring(index, index + 1);
                    }
                }

            }
        }
        return result + arr1 + arr2;
    }

    public static void main(String[] args) {
        System.out.println(twotwoone.Longest("aretheyhere","yestherearehere"));
        System.out.println(twotwoone.Longest("loopingisfunbutdangerus","lessdaangerusthancoding"));
        System.out.println(twotwoone.Longest("inmanylaguages","theresapairofuncctions"));


    }
}
