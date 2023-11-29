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
public class DormRoom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Room;

    private String name ;
    private String Picture ;
    private int nbPlace;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private AppUser user;


    @ManyToMany(mappedBy = "dormRoomsCustomer",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<AppUser> users;


    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Adresse adresse;
}
