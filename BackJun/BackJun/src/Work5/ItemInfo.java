package Work5;

public class ItemInfo {
	private int pencilBox;
	private int pencilCount;
	private int pencilPrice;

	public ItemInfo(int pencilBox, int pencilCount, int pencilPrice) {

		this.pencilBox = pencilBox;
		this.pencilCount = pencilCount;
		this.pencilPrice = pencilPrice;
	}

	public int getPencilBox() {
		return pencilBox;
	}

	public void setPencilBox(int pencilBox) {
		this.pencilBox = pencilBox;
	}

	public int getPencilCount() {
		return pencilCount;
	}

	public void setPencilCount(int pencilCount) {
		this.pencilCount = pencilCount;
	}

	public int getPencilPrice() {
		return pencilPrice;
	}

	public void setPencilPrice(int pencilPrice) {
		this.pencilPrice = pencilPrice;
	}

}
