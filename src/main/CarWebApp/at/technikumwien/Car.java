package at.technikumwien;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table (name = "t_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 15)
    private Brand brand;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false)
    private Integer buildYear;

    public Car (Brand brand,String name,Integer buildYear)
    {
        this(null,brand,name,buildYear);
    }
}
