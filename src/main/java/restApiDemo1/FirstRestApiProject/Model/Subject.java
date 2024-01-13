package restApiDemo1.FirstRestApiProject.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subject
{
    private int subjectId;
    private String subjectName;
    private double subjectFees;

}
