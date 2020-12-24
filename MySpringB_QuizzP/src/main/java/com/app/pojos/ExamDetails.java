package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "examdetails")
public class ExamDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="exam_id")
	private int ExamId;
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private Users e3;
	@ManyToOne
	@JoinColumn(name = "test_id", nullable = false)
	private Tests e2;
	@Column(name="total_que",length = 20)
	private int TotalQue;
	@Column(name="total_marks",length = 20)
	private int TotalMarks;
	@Column(name="corrans",length = 70)
	private String CorrAns;
	
	public ExamDetails(int examId, Users e3, Tests e2, int totalQue, int totalMarks, String corrAns) {
		super();
		ExamId = examId;
		this.e3 = e3;
		this.e2 = e2;
		TotalQue = totalQue;
		TotalMarks = totalMarks;
		CorrAns = corrAns;
	}
	public int getExamId() {
		return ExamId;
	}
	public void setExamId(int examId) {
		ExamId = examId;
	}
	public Users getE3() {
		return e3;
	}
	public void setE3(Users e3) {
		this.e3 = e3;
	}
	public Tests getE2() {
		return e2;
	}
	public void setE2(Tests e2) {
		this.e2 = e2;
	}
	public int getTotalQue() {
		return TotalQue;
	}
	public void setTotalQue(int totalQue) {
		TotalQue = totalQue;
	}
	public int getTotalMarks() {
		return TotalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		TotalMarks = totalMarks;
	}
	public String getCorrAns() {
		return CorrAns;
	}
	public void setCorrAns(String corrAns) {
		CorrAns = corrAns;
	}
	@Override
	public String toString() {
		return "ExamDetails [ExamId=" + ExamId + ", e3=" + e3 + ", e2=" + e2 + ", TotalQue=" + TotalQue
				+ ", TotalMarks=" + TotalMarks + ", CorrAns=" + CorrAns + "]";
	}

}