public class Teacher {
    String name ;
    String mpno;
    String branch;

Teacher(String name, String mpno, String branch){
    this.name= name;
    this.mpno= mpno;
    this.branch=branch;

}
void print(){
    System.out.println("adı:"+ this.name);
    System.out.println("telefon no:"+ this.mpno);
    System.out.println("bölümü:"+ this.branch);
}
}
