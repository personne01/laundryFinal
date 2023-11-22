package com.example.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Laundry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String nama;
    @Column(nullable = false)
    private String lokasi;
    @Column(nullable = false, length = 20)
    private String no_hp;
    @Column(nullable = false, length = 4)
    private String jam_buka;

    @Column(nullable = false, length = 4)
    private String jam_tutup;

    @OneToMany(mappedBy = "laundry")
    private List<Fasilitas> fasilitasList;

}