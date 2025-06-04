// attendance entites
package com.example.attendance.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attendanceId;
    private Long employeeId;
    private LocalDate date;
    private String status; // Present or Absent

    // Getters and Setters
}
