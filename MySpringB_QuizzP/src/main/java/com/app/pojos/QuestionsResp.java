package com.app.pojos;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "QueResp")
public class QuestionsResp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="qr_id")
	private int QRId;
	 @Column(name="corrans",length=100)
	private String CorrAns;
	 @Column(name="resp_date")
	private LocalDate respDate;
	 @Column(name="resp_time")
	private LocalTime respTime;
	 @ManyToOne
	 @JoinColumn(name = "q_id", nullable = false)
	 private Questions que;
	 @ManyToOne
	 @JoinColumn(name = "user_id", nullable = false)
	 private Users us;
	public QuestionsResp(int qRId, String corrAns, LocalDate respDate, LocalTime respTime) {
		super();
		QRId = qRId;
		CorrAns = corrAns;
		this.respDate = respDate;
		this.respTime = respTime;
	
	}
	public int getQRId() {
		return QRId;
	}
	public void setQRId(int qRId) {
		QRId = qRId;
	}
	public String getCorrAns() {
		return CorrAns;
	}
	public void setCorrAns(String corrAns) {
		CorrAns = corrAns;
	}
	public LocalDate getRespDate() {
		return respDate;
	}
	public void setRespDate(LocalDate respDate) {
		this.respDate = respDate;
	}
	public LocalTime getRespTime() {
		return respTime;
	}
	public void setRespTime(LocalTime respTime) {
		this.respTime = respTime;
	}
	public Questions getQue() {
		return que;
	}
	public void setQue(Questions que) {
		this.que = que;
	}
	public Users getUs() {
		return us;
	}
	public void setUs(Users us) {
		this.us = us;
	}
	@Override
	public String toString() {
		return "QuestionsResp [QRId=" + QRId + ", CorrAns=" + CorrAns + ", respDate=" + respDate + ", respTime="
				+ respTime + "]";
	}
	 
}