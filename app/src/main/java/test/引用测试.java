package test;

public class 引用测试 {

    public static void main(String[] args) {

        Person a = new Person("张三",18);
        Person b = new Person("李四",20);
        System.out.println(a);
        System.out.println(b);
        a = b;
        System.out.println(a);

    }

    static class Person{

        String name;
        int ege;

        public Person(String name, int ege) {
            this.name = name;
            this.ege = ege;
        }

//        @Override
//        public String toString() {
//            return "Person{" +
//                    "name='" + name + '\'' +
//                    ", ege=" + ege +
//                    '}';
//        }

    }

}
