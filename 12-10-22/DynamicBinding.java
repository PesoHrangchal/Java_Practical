package practical;

class TestBinding1 {
	void show() {// Dynamic Binding
		System.out.println("Ab Samjhee");
	}
}


class DynamicBinding extends TestBinding1 {
	void show() {// Dynamic Binding
		System.out.println("Override");
	}

public static void main(String[] args) {
	TestBinding1 obj = new DynamicBinding();
	obj.show();
	}
}