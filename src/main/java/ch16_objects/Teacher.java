package ch16_objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // toString을 override, ???선생님의 근무지는 ???학교입니다. 로 출력될 수 있겠끔 재정의

    @Override
    public String toString() {
        return name +"선생님의 근무지는 " + schoolName + "학교 입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }
    // 객체명1.equals(객체명2)

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
