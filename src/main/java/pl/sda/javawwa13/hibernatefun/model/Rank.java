package pl.sda.javawwa13.hibernatefun.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Rank {

    @Id
    @GeneratedValue
    private Long id;

    private String opinion;

    private Double score;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private MovieInfo movieInfo;

}
