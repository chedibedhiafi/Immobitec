package immobi.tec.immobitec.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Transactional
@Table(name = "User")
public class AppUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;

    private String name ;
    private String lastname ;
    private String password ;
    private String email ;
    @Temporal(TemporalType.DATE)
    private Date birthday ;
    private int phoneNumber ;
    private float wallet ;
    private String picture ;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Auction> auctionsParticipation;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Auction> auctionscreator;

    @ManyToOne(cascade = CascadeType.ALL)
    private Role role;

    @ManyToOne(cascade = CascadeType.ALL)
    private Adresse adresse;



    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<DormRoom> dormRoomsOwner;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    Set<DormRoom> dormRoomsCustomer;


    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Property> properties;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Product> products;


    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Ordre> orders;


    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Service> services;


    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Appointement> appointements;

    @OneToMany(cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Comment> comments;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Post> posts;





}
