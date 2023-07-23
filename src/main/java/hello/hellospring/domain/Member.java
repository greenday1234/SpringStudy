package hello.hellospring.domain;

public class Member {
    private Long id;    //데이터를 구분하기 위해 System이 정하는 id
    private String name;    //이름

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
