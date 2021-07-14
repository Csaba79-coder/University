package specialization;

import model.UnitType;

public class Specialization {

    String nameOfSpecialization;
    String code;
    String nameOfUnit;
    UnitType unitType;
    String[] recommendedSemester;
    int credit;
    String[] requirement;

    public Specialization() {
    }

    public Specialization(String nameOfSpecialization, String code, String nameOfUnit, UnitType unitType, String[] recommendedSemester, int credit, String[] requirement) {
        this.nameOfSpecialization = nameOfSpecialization;
        this.code = code;
        this.nameOfUnit = nameOfUnit;
        this.unitType = unitType;
        this.recommendedSemester = recommendedSemester;
        this.credit = credit;
        this.requirement = requirement;
    }

    public String getNameOfSpecialization() {
        return nameOfSpecialization;
    }

    public void setNameOfSpecialization(String nameOfSpecialization) {
        this.nameOfSpecialization = nameOfSpecialization;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameOfUnit() {
        return nameOfUnit;
    }

    public void setNameOfUnit(String nameOfUnit) {
        this.nameOfUnit = nameOfUnit;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public String[] getRecommendedSemester() {
        return recommendedSemester;
    }

    public void setRecommendedSemester(String[] recommendedSemester) {
        this.recommendedSemester = recommendedSemester;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String[] getRequirement() {
        return requirement;
    }

    public void setRequirement(String[] requirement) {
        this.requirement = requirement;
    }
}
