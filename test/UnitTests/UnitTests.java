/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTests;

import Models.Grade;
import Models.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class UnitTests {
    
    public UnitTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void Test()
    {
        Student student = new Student("TestName");
        Grade grade = new Grade(11, "A", student);
        System.out.println("DisplayName: " + grade.Student.DisplayName);
        System.out.println("Score: " + grade.Score);
        System.out.println("Letter Grade: " + grade.LetterGrade);
    }
}
