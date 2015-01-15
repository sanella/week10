package day2;

public class MyTreeOfStrings {

	private String data;
	private MyTreeOfStrings left;
	private MyTreeOfStrings right;

	public MyTreeOfStrings() {
		this.data = null;
		this.left = null;
		this.right = null;
	}

	public MyTreeOfStrings(String _data) {
		this.data = _data;
		this.left = null;
		this.right = null;
		
		}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public MyTreeOfStrings getLeft() {
		return left;
	}

	public void setLeft(MyTreeOfStrings left) {
		this.left = left;
	}

	public MyTreeOfStrings getRight() {
		return right;
	}

	public void setRight(MyTreeOfStrings right) {
		this.right = right;
	}

	public addData(String data) {
		if(this.data.compareToIgnoreCase(data) < 0){
			if(left == null){
				left = new MyTreeOfStrings(_data);
			} else{
				left.addData(data);
			} else {
				if(right == null){
					right = new MyTreeOfStrings(data);
				}else{
					right.add(data);
				}
			}
		}
	}
	
}