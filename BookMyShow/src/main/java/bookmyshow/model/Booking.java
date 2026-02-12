package bookmyshow.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name="Bookings")
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
//boking user ki many to one hohogi
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)//check validadtion of this code here
    private  String bookingNumber;

    @Column(nullable = false)
    private LocalDateTime bookingTime;

    @ManyToOne
    @Column(name="show_id", nullable = false)
    private User user;


    @Column(nullable = false)
    private String status;//confirm pending , cancell

    @Column(nullable = false)
    private Double totalAmount;

    @OneToMany(mappedBy = "Booking", cascade = CascadeType.ALL)
    private List<ShowSeat> showSeats;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="payment_id")
    private Payment payment;
}
