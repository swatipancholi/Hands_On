package oneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int qid;
	private String qName;
	private String createdBy;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="QuestionAnswer",joinColumns= {@JoinColumn(name="QuestionID", referencedColumnName="qid")},
	inverseJoinColumns= {@JoinColumn(name="AnswerId", referencedColumnName="aid")})
	private List<Answer> answers;
	
	public Question() {
		
	}
	public Question(String qName, String createdBy, List<Answer> answers) {
		super();
		this.qName = qName;
		this.createdBy = createdBy;
		this.answers = answers;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getqName() {
		return qName;
	}
	public void setqName(String qName) {
		this.qName = qName;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
}
