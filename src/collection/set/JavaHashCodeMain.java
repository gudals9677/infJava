package collection.set;

import collection.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println("o1 = " + o1.hashCode());
        System.out.println("o2 = " + o2.hashCode());

        Member memberA = new Member("memberA");
        Member memberB = new Member("memberA");

        System.out.println("111 = " + (memberA == memberB));
        System.out.println("222 = " + (memberA.equals(memberB)));

        System.out.println("memberA.hashCode() = " + memberA.hashCode());
        System.out.println("memberB.hashCode() = " + memberB.hashCode());
    }
}
