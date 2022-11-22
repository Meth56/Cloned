package Day25_Classes;

public class Topic3_Static {
    public static void main(String[] args) {

        RenasTechStudentRegistirationForm MyForm=new RenasTechStudentRegistirationForm();
        MyForm.Name="Hayri";
        MyForm.Surname="Aslan";

        System.out.println(MyForm.Name);

        RenasTechStudentRegistirationForm MyNewForm=new RenasTechStudentRegistirationForm();

        System.out.println(MyNewForm.Name);
    }
}

class RenasTechStudentRegistirationForm{
    String Name;
    String Surname;

    static String School="RenasTech";


}
