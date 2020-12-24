package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Questions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "q_id", length = 20)
	private int qId;
	@Column(name = "ques", length = 20)
	private String que;
	@Column(name = "q_op1", length = 20)
	private String op1;
	@Column(name = "q_op2", length = 20)
	private String op2;
	@Column(name = "q_op3", length = 20)
	private String op3;
	@Column(name = "q_op4", length = 20)
	private String op4;
	@Column(name = "marks", length = 20)
	private int marks;

	@ManyToOne
	@JoinColumn(name = "test_id", nullable = false)
	private Tests Test1;
	
	@OneToMany(mappedBy = "que",cascade = CascadeType.ALL)
	private List<QuestionsResp>queresp=new ArrayList<>();

	public Questions(int qId, String que, String op1, String op2, String op3, String op4, int marks) {
		super();
		this.qId = qId;
		this.que = que;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.op4 = op4;
		this.marks = marks;
	}
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public String getOp1() {
		return op1;
	}
	public void setOp1(String op1) {
		this.op1 = op1;
	}
	public String getOp2() {
		return op2;
	}
	public void setOp2(String op2) {
		this.op2 = op2;
	}
	public String getOp3() {
		return op3;
	}
	public void setOp3(String op3) {
		this.op3 = op3;
	}
	public String getOp4() {
		return op4;
	}
	public void setOp4(String op4) {
		this.op4 = op4;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Tests getTest1() {
		return Test1;
	}
	public void setTest1(Tests test1) {
		Test1 = test1;
	}
	
	
	public List<QuestionsResp> getQueresp() {
		return queresp;
	}
	public void setQueresp(List<QuestionsResp> queresp) {
		this.queresp = queresp;
	}
	@Override
	public String toString() {
		return "Questions [qId=" + qId + ", que=" + que + ", op1=" + op1 + ", op2=" + op2 + ", op3=" + op3 + ", op4="
				+ op4 + ", marks=" + marks + "]";
	}
	
	}

	