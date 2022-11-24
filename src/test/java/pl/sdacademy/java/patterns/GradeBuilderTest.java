package pl.sdacademy.java.patterns;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.UUID;
import static org.assertj.core.api.Assertions.*;

class GradeBuilderTest {

    @Test
    void shouldCreateGrade(){
    Grade grade = new GradeBuilder()
            .courseUuid(UUID.randomUUID())
            .gradeType(GradeType.BOARD)
            .value(new BigDecimal(15))
            .issueDateTime(LocalDateTime.of(2022,Month.DECEMBER,12,12,30))
            .build();

    assertThat(grade).isNotNull();
    assertThat(grade.getGradeType()).isEqualTo(GradeType.BOARD);
    assertThat(grade.getValue()).isEqualTo(BigDecimal.valueOf(15));
    assertThat(grade.getIssueDateTime()).isEqualTo(LocalDateTime.of(2022,Month.DECEMBER,12,12,30));
    }
}