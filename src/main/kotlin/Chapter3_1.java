public class Chapter3_1 {

    private void test() {

        /**
         * primitive는 묵시적 형변환이 자바는 가능함 (Wrapper는 자바도 감싸줘야 함)
         */

        int number1 = 3;

        long number2 = number1;
    }

    private static void printAgeIfPersonJava(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }
}
