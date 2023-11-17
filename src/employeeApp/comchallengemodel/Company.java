package employeeApp.comchallengemodel;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(int id, String name, int giro, String[] developerNames) {
        if(giro<0){
            giro = 0;
        }
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        try {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("İlgili index dolu.");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Olmayan idndex için atama yapıldı: " + index);
        }
    }
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
