package com.example.android.reportcard;

public class ReportCard {

    /**
     * information about the student and year
     */
    private String studentLastName;
    private String studentFirstName;
    private int studentId;
    private String year;

    /**
     * grades in the various subjects (in French)
     */
    private float français;
    private float LV1;
    private float LV2;
    private float histoireGéographie;
    private float SVT;
    private float physiqueChimie;
    private float mathématiques;
    private float sport;

    /**
     * generate the report based on the datas from above
     */
    public ReportCard(String studentLastName, String studentFirstName, int studentId, String year, float français,
                      float LV1, float LV2, float histoireGéographie, float SVT, float physiqueChimie, float mathématiques,
                      float sport) {
        this.studentLastName = studentLastName;
        this.studentFirstName = studentFirstName;
        this.studentId = studentId;
        this.year = year;
        this.français = français;
        this.LV1 = LV1;
        this.LV2 = LV2;
        this.histoireGéographie = histoireGéographie;
        this.SVT = SVT;
        this.physiqueChimie = physiqueChimie;
        this.mathématiques = mathématiques;
        this.sport = sport;
    }

    /**
     * Calculate the global average of the student
     * @return global average
     */

    private float calculateGlobalAverage(float français, float LV1, float LV2, float histoireGéographie,
                                        float SVT, float physiqueChimie, float mathématiques, float sport){
        float globalAverage;

        globalAverage = français + LV1 + LV2 + histoireGéographie + SVT + physiqueChimie + mathématiques + sport;
        globalAverage = globalAverage / 8;
        return globalAverage;
    }

    private void globalAverage {
        float globalAverage = calculateGlobalAverage(français, LV1, LV2, histoireGéographie, SVT, physiqueChimie, mathématiques, sport);
    }

    /**
     *
     * Getters and Setters created with alt+ins
     */

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public float getFrançais() {
        return français;
    }

    public void setFrançais(float français) {
        this.français = français;
    }

    public float getLV1() {
        return LV1;
    }

    public void setLV1(float LV1) {
        this.LV1 = LV1;
    }

    public float getLV2() {
        return LV2;
    }

    public void setLV2(float LV2) {
        this.LV2 = LV2;
    }

    public float getHistoireGéographie() {
        return histoireGéographie;
    }

    public void setHistoireGéographie(float histoireGéographie) {
        this.histoireGéographie = histoireGéographie;
    }

    public float getSVT() {
        return SVT;
    }

    public void setSVT(float SVT) {
        this.SVT = SVT;
    }

    public float getPhysiqueChimie() {
        return physiqueChimie;
    }

    public void setPhysiqueChimie(float physiqueChimie) {
        this.physiqueChimie = physiqueChimie;
    }

    public float getMathématiques() {
        return mathématiques;
    }

    public void setMathématiques(float mathématiques) {
        this.mathématiques = mathématiques;
    }

    public float getSport() {
        return sport;
    }

    public void setSport(float sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return  "Student Name: " + studentLastName + " " + studentFirstName + "\n" +
                "Student ID: " + studentId + "\n" +
                "Year: " + year + "\n" +
                "Français: " + français + " / 20" + "\n" +
                "LV1: " + LV1+ " / 20" + "\n" +
                "LV2: " + LV2 + " / 20" + "\n" +
                "Histoire - Géographie: " + histoireGéographie + " / 20" + "\n" +
                "SVT: " + LV2 + " / 20" + "\n" +
                "Physique - Chimie: " + LV2 + " / 20" + "\n" +
                "Mathématiques: " + LV2 + " / 20" + "\n" +
                "sport: " + LV2 + " / 20" + "\n" +
                "Global Average: " + globalAverage + " / 20";

    }

}
