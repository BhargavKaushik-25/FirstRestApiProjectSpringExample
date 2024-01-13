package restApiDemo1.FirstRestApiProject.Service;

import org.springframework.stereotype.Service;
import restApiDemo1.FirstRestApiProject.Model.Subject;

import java.util.ArrayList;
import java.util.List;

@Service//this is functional class or business logic class all operation works here
public class SubjectService {
    List<Subject> subjectList = new ArrayList<>();

    {
        subjectList.add(new Subject(1,"JAVA",999.99));
        subjectList.add(new Subject(2,"SQL",899.99));
        subjectList.add(new Subject(3,"REACT",699.99));
    }

    public List<Subject> displaySubject(){
        return subjectList;
    }


    public Subject getSubjectObject(int id){
        for (Subject s:subjectList){
            if (s.getSubjectId() == id){
                return s;
            }
        }
        return null;
    }

    public void addData(Subject subject) {
        subjectList.add(subject);
    }

    public void updateData(Subject s, int id) {
        for (Subject s1:subjectList){
            if (s1.getSubjectId() == id){
                s1.setSubjectName(s.getSubjectName());
                break;
            }
        }
    }

    public void delete(int id) {
        for (Subject s : subjectList){
            if (s.getSubjectId() == id){
                subjectList.remove(s);
                break;
            }
        }
    }
}
