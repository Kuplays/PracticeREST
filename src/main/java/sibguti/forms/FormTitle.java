package sibguti.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FormTitle {
	@NotNull
	@Size(min=1, max=40)
	private String searchTitle;

	public void setSearchTitle(String newTitle) {
		searchTitle = newTitle;
	}

	public String getSearchTitle() {
		return searchTitle;
	}
}