package com.app.pojos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tests")
public class Tests {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "test_id")
	private int testId;
	@Column(name = "testName", length = 20, nullable = false)
	private String testName;
	@Column(name="test_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate testDate;
	@Column(name="test_duration")
	private LocalTime testDuration;
	// @ManyToMany
	// private List<Users> user = new ArrayList<>();
	@OneToMany(mappedBy = "Test1", cascade = CascadeType.ALL)
	private List<Questions> question = new ArrayList<>();

	@OneToMany(mappedBy = "e2", cascade = CascadeType.ALL)
	private List<ExamDetails> examd2= new ArrayList<>();

	public Tests(int testId, String testName, LocalDate testDate, LocalTime testDuration) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testDate = testDate;
		this.testDuration = testDuration;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public LocalDate getTestDate() {
		return testDate;
	}

	public void setTestDate(LocalDate testDate) {
		this.testDate = testDate;
	}

	public LocalTime getTestDuration() {
		return testDuration;
	}

	public void setTestDuration(LocalTime testDuration) {
		this.testDuration = testDuration;
	}

	public List<Questions> getQuestion() {
		return question;
	}

	public void setQuestion(List<Questions> question) {
		this.question = question;
	}



	public List<ExamDetails> getExamd2() {
		return examd2;
	}

	public void setExamd2(List<ExamDetails> examd2) {
		this.examd2 = examd2;
	}

	@Override
	public String toString() {
		return "Tests [testId=" + testId + ", testName=" + testName + ", testDate=" + testDate + ", testDuration="
				+ testDuration + "]";
	}

}
