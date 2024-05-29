package co.develhope.interceptor2.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Month {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int monthNumber;
    private String italianName;
    private String  englishName;
    private String germanName;

    public Month(int monthNumber, String italianName, String englishName, String germanName) {
        this.monthNumber = monthNumber;
        this.italianName = italianName;
        this.englishName = englishName;
        this.germanName = germanName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public String getItalianName() {
        return italianName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getGermanName() {
        return germanName;
    }

    public void setGermanName(String germanName) {
        this.germanName = germanName;
    }
}
