public class Main {
    public static void main(String[] args) {

//        Emploee emploee1 = new Emploee("Vasiliy Pupkin", "emploee", "Pupcin@mail.com", "8-986575176", 35600.6, 34);

        Emploee [] emploees = new Emploee[5];
        emploees[0] = new Emploee("Vasiliy Pupkin", "emploee1", "emploee1@mail.com", "000001", 32600.6, 34);
        emploees[1] = new Emploee("Roman trusk", "emploee2", "emploee2.com", "000002", 35600.7, 44);
        emploees[2] = new Emploee("Helen Helen", "emploee3", "emploee3@mail.com", "00003", 31600.6, 20);
        emploees[3] = new Emploee("Olga Uy", "emploee4", "emploee4@mail.com", "000004", 35400.0, 58);
        emploees[4] = new Emploee("Nguen Ho", "emploee5", "emploee5@mail.com", "000005", 35200.2, 18);

        for (int i = 0; i < emploees.length; i++) {
            if (emploees[i].age > 40){
                emploees[i].printEmploee();
                System.out.println();
            }

        }

    }
}