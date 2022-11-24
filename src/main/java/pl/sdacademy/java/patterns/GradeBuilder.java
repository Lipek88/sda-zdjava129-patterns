package pl.sdacademy.java.patterns;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class GradeBuilder {
    private UUID courseUuid;
    private GradeType gradeType;
    private BigDecimal value;
    private LocalDateTime issueDateTime;


    public GradeBuilder courseUuid(UUID courseUuid){
        this.courseUuid = courseUuid;
        return this;
    }
    public GradeBuilder gradeType(GradeType gradeType){
        this.gradeType = gradeType;
        return this;
    }
    public GradeBuilder value(BigDecimal value){
        this.value = value;
        return this;
    }
    public GradeBuilder issueDateTime(LocalDateTime issueDateTime){
        this.issueDateTime = issueDateTime;
        return this;
    }
    public Grade build(){
        return new Grade(courseUuid, gradeType, value, issueDateTime);
    }
}
