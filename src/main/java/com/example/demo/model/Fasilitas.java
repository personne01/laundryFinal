package com.example.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fasilitas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fasilitas;
    private Integer harga;
    @ManyToOne
    @JoinColumn(name = "id_laundry", referencedColumnName = "id")
    private Laundry laundry;
}
