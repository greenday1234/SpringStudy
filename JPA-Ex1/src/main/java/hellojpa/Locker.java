package hellojpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Locker {

    @Id @GeneratedValue
    private Long id;

    private String name;
}
