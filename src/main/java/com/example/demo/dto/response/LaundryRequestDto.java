package com.example.demo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LaundryRequestDto {
    String nama;
    String lokasi;
    String no_hp;
    String jam_buka;
    String jam_tutup;
}
