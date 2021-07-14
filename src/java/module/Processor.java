package module;

import controller.SpecializationController;
import specialization.Specialization;
import utils.FileHandler;
import utils.Reader;

import java.util.Arrays;
import java.util.List;

public class Processor {

    public static void run() {

        List<Specialization> tempList = Reader.getSpecializations();

        List<String> anglisztika;
        List<String> germanisztika;
        List<String> informatikusKonyvtaros;
        List<String> japan;
        List<String> magyar;
        List<String> skandinavisztika;
        List<String> tortenelem;
        List<String> klasszikusFilologia;


        FileHandler fileHandler = new FileHandler();
        fileHandler.readFile("specialization.txt");

        Reader.printSpecializations();

        SpecializationController specializationController = new SpecializationController();
        anglisztika = specializationController.orderBySpecializations("anglisztika", tempList);
        germanisztika = specializationController.orderBySpecializations("germanisztika", tempList);
        informatikusKonyvtaros = specializationController.orderBySpecializations("informatikus könyvtáros", tempList);
        japan = specializationController.orderBySpecializations("japán", tempList);
        magyar = specializationController.orderBySpecializations("magyar", tempList);
        skandinavisztika = specializationController.orderBySpecializations("skandinavisztika", tempList);
        tortenelem = specializationController.orderBySpecializations("történelem", tempList);
        klasszikusFilologia = specializationController.orderBySpecializations("klasszikus filológia", tempList);

        specializationController.getListOfNoPreviousRequirement(Reader.getSpecializations());
        specializationController.printListOfNoPreviousRequirement();
    }
}
