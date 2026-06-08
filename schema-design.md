# Smart Clinic Management System - Database Schema Design

## Overview

The Smart Clinic Management System manages doctors, patients, appointments, and prescriptions.

---

# Doctor Table

| Column Name | Data Type | Constraints |
|-------------|-----------|------------|
| doctor_id | BIGINT | PRIMARY KEY, AUTO_INCREMENT |
| name | VARCHAR(100) | NOT NULL |
| email | VARCHAR(100) | UNIQUE, NOT NULL |
| phone | VARCHAR(15) | NOT NULL |
| specialty | VARCHAR(100) | NOT NULL |
| available_times | TEXT | |

---

# Patient Table

| Column Name | Data Type | Constraints |
|-------------|-----------|------------|
| patient_id | BIGINT | PRIMARY KEY, AUTO_INCREMENT |
| name | VARCHAR(100) | NOT NULL |
| email | VARCHAR(100) | UNIQUE, NOT NULL |
| phone | VARCHAR(15) | UNIQUE |
| address | VARCHAR(255) | |
| password | VARCHAR(255) | NOT NULL |

---

# Appointment Table

| Column Name | Data Type | Constraints |
|-------------|-----------|------------|
| appointment_id | BIGINT | PRIMARY KEY, AUTO_INCREMENT |
| doctor_id | BIGINT | FOREIGN KEY |
| patient_id | BIGINT | FOREIGN KEY |
| appointment_time | DATETIME | NOT NULL |
| status | VARCHAR(30) | NOT NULL |

---

# Prescription Table

| Column Name | Data Type | Constraints |
|-------------|-----------|------------|
| prescription_id | BIGINT | PRIMARY KEY, AUTO_INCREMENT |
| appointment_id | BIGINT | FOREIGN KEY |
| medicine | VARCHAR(255) | NOT NULL |
| dosage | VARCHAR(100) | NOT NULL |
| notes | TEXT | |

---

# Relationships

1. One Doctor can have many Appointments.
2. One Patient can have many Appointments.
3. One Appointment belongs to one Doctor.
4. One Appointment belongs to one Patient.
5. One Appointment can have one Prescription.

---

# Foreign Keys

Appointment.doctor_id → Doctor.doctor_id

Appointment.patient_id → Patient.patient_id

Prescription.appointment_id → Appointment.appointment_id