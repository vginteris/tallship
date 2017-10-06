//package lt.codeacademy.project.model;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table (name = "classroom")
//public class Classroom {
//
//    private
//    int id;
//    private String name;
//    private String description;
//
//
//    private List <Lecture> lectures;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @OneToMany(mappedBy = "classroom")
//    public List<Lecture> getLectures() {
//        return lectures;
//    }
//
//    public void setLectures(List<Lecture> lectures) {
//        this.lectures = lectures;
//    }
//}