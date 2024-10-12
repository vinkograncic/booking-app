package hr.fer.demo.booking_app.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="booking")
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "property_id")
    private Property property;

    private String status;



}
