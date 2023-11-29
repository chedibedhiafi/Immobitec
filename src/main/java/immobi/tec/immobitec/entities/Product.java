package immobi.tec.immobitec.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_product;

    private String name ;
    private float price ;
    private String description ;
    private int quantity ;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private AppUser user;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Card> cards;
}
