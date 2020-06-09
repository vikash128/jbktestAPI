package com.jbk.controller;

public class Quesetion {
	
	private String questionText;
	private String options1;
	private String options2;
	private String options3;
	private String options4;
	private String options5;
	private String correctOptions;
	private String explanation;
	
	public Quesetion() {
		super();
	}
	
	public Quesetion(String questionText, String options1, String options2, String options3, String options4,
			String options5, String correctOptions, String explanation) {
		super();
		this.questionText = questionText;
		this.options1 = options1;
		this.options2 = options2;
		this.options3 = options3;
		this.options4 = options4;
		this.options5 = options5;
		this.correctOptions = correctOptions;
		this.explanation = explanation;
	}
	
	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getOptions1() {
		return options1;
	}

	public void setOptions1(String options1) {
		this.options1 = options1;
	}

	public String getOptions2() {
		return options2;
	}

	public void setOptions2(String options2) {
		this.options2 = options2;
	}

	public String getOptions3() {
		return options3;
	}

	public void setOptions3(String options3) {
		this.options3 = options3;
	}

	public String getOptions4() {
		return options4;
	}

	public void setOptions4(String options4) {
		this.options4 = options4;
	}

	public String getOptions5() {
		return options5;
	}

	public void setOptions5(String options5) {
		this.options5 = options5;
	}

	public String getCorrectOptions() {
		return correctOptions;
	}

	public void setCorrectOptions(String correctOptions) {
		this.correctOptions = correctOptions;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	//for unique quesetion, we have implemented hashCode()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correctOptions == null) ? 0 : correctOptions.hashCode());
		result = prime * result + ((explanation == null) ? 0 : explanation.hashCode());
		result = prime * result + ((options1 == null) ? 0 : options1.hashCode());
		result = prime * result + ((options2 == null) ? 0 : options2.hashCode());
		result = prime * result + ((options3 == null) ? 0 : options3.hashCode());
		result = prime * result + ((options4 == null) ? 0 : options4.hashCode());
		result = prime * result + ((options5 == null) ? 0 : options5.hashCode());
		result = prime * result + ((questionText == null) ? 0 : questionText.hashCode());
		return result;
	}

	//for unique quesetion, we have implemented equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quesetion other = (Quesetion) obj;
		if (correctOptions == null) {
			if (other.correctOptions != null)
				return false;
		} else if (!correctOptions.equals(other.correctOptions))
			return false;
		if (explanation == null) {
			if (other.explanation != null)
				return false;
		} else if (!explanation.equals(other.explanation))
			return false;
		if (options1 == null) {
			if (other.options1 != null)
				return false;
		} else if (!options1.equals(other.options1))
			return false;
		if (options2 == null) {
			if (other.options2 != null)
				return false;
		} else if (!options2.equals(other.options2))
			return false;
		if (options3 == null) {
			if (other.options3 != null)
				return false;
		} else if (!options3.equals(other.options3))
			return false;
		if (options4 == null) {
			if (other.options4 != null)
				return false;
		} else if (!options4.equals(other.options4))
			return false;
		if (options5 == null) {
			if (other.options5 != null)
				return false;
		} else if (!options5.equals(other.options5))
			return false;
		if (questionText == null) {
			if (other.questionText != null)
				return false;
		} else if (!questionText.equals(other.questionText))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Quesetion [questionText=" + questionText + ", options1=" + options1 + ", options2=" + options2
				+ ", options3=" + options3 + ", options4=" + options4 + ", options5=" + options5 + ", correctOptions="
				+ correctOptions + ", explanation=" + explanation + "]";
	}
	
}
