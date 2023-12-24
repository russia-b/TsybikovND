package Task3;

public class School {
    private Integer studentCount;
    private String schoolName;
    private seasons currSeason;

    public School(Integer studentCount, String schoolName, seasons currSeason){
        this.currSeason = currSeason;
        this.schoolName = schoolName;
        this.studentCount = studentCount;
    }


    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public seasons getCurrSeason() {
        return currSeason;
    }

    public void setCurrSeason(seasons currSeason) {
        this.currSeason = currSeason;
    }

    public void WriteInfo(){

        String areLearning = switch (currSeason){
            case Зима -> "не учимся";
            default -> "учимся";
        };

        System.out.printf("Школа %s, учащихся %d, сейчас мы &s", this.schoolName, this.studentCount, areLearning);
    }
}