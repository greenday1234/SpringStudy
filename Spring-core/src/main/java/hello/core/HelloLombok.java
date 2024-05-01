package hello.core;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//게터세터, 생성자도 자동으로 생성해줄 수 있음, 추가 기능 더 많음 (롬복)
@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("name");

        System.out.println("helloLombok = " + helloLombok);
    }
}
