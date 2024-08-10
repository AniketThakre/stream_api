public class Student {

    private int sId;
    private String sName;
    private double score;

    public Student(int sId, String sName, double score) {
        this.sId = sId;
        this.sName = sName;
        this.score = score;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", score=" + score +
                '}';
    }
}
