package controller;

import specialization.Specialization;
import utils.Reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SpecializationController {


    public List<String> orderBySpecializations(String nameOfSpecialization, List<Specialization> arrayList) {
        List<String> specByName = new ArrayList<>();
        for (Specialization specialization : arrayList) {
            if (nameOfSpecialization.equals(specialization.getNameOfSpecialization())) {
                specByName.add(specialization.getNameOfSpecialization() + specialization.getCode() +
                        specialization.getNameOfUnit() + specialization.getUnitType() +
                        Arrays.toString(specialization.getRecommendedSemester()) + specialization.getCredit() +
                        Arrays.toString(specialization.getRequirement()));
            }
        }
        return specByName;
    }

    public boolean contains(String[] array, String key) {
        for (final String i : array) {
            if (i.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public HashMap<String, String> getListOfNoPreviousRequirement(List<Specialization> arrayList) {
        HashMap<String, String> noPrevRequirements = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            // TODO check the condition
            // if (Arrays.asList(arrayList.get(i).getRequirement()).contains("NULL")) {
                noPrevRequirements.put(arrayList.get(i).getCode(), arrayList.get(i).getNameOfSpecialization());
            }
        return noPrevRequirements;
    }

    public void printListOfNoPreviousRequirement() {
        System.out.println(getListOfNoPreviousRequirement(Reader.getSpecializations()));
    }
}
