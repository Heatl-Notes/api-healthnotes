package com.ufcg.apihealthnotes.dto;

import com.ufcg.apihealthnotes.entities.Caregiver;
import com.ufcg.apihealthnotes.entities.Exam;
import com.ufcg.apihealthnotes.entities.Patient;
import com.ufcg.apihealthnotes.entities.Surgery;

import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PatientDTO {

    private String caregiverCpf;
    private String cpf;
    private String name;
    private String birthday;
    private List<String> medicines;
    private List<String> vaccines;
    private List<SurgeryDTO> surgeries;
    private List<ExamDTO> exams;

    public PatientDTO(String caregiverCpf, String cpf, String name, String birthday,
                      List<String> medicines, List<String> vaccines, List<SurgeryDTO> surgeries, List<ExamDTO> exams) {

        this.caregiverCpf = caregiverCpf;
        this.cpf = cpf;
        this.name = name;
        this.birthday = birthday;
        this.medicines = medicines;
        this.vaccines = vaccines;
        this.surgeries = surgeries;
        this.exams = exams;
    }

    public String getCaregiverCpf() {
        return caregiverCpf;
    }

    public void setCaregiverCpf(String caregiverCpf) {
        this.caregiverCpf = caregiverCpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<String> medicines) {
        this.medicines = medicines;
    }

    public List<String> getVaccines() {
        return vaccines;
    }

    public void setVaccines(List<String> vaccines) {
        this.vaccines = vaccines;
    }

    public List<SurgeryDTO> getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(List<SurgeryDTO> surgeries) {
        this.surgeries = surgeries;
    }

    public List<ExamDTO> getExams() {
        return exams;
    }

    public void setExams(List<ExamDTO> exams) {
        this.exams = exams;
    }
}