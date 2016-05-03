/**
 * @author theauthor
 *
 */
public enum SetOperation {
	intersection("I"), union("U");

	// the name of the operation
	String name;

	private SetOperation(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
