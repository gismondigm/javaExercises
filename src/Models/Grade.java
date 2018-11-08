package Models;

public class Grade 
{
    public int Score;
    public String LetterGrade;
    public Student Student;
    public Grade(){}
    public Grade(int score, String grade, Student student)
    {
        Score = score;
        LetterGrade = grade;
        Student = student;
    }
}
