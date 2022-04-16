package entities;

import java.util.List;

public class Rota {

	public void upNo(List<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			a.set(i, a.get(i) + 1);
		}
	}

	public void downNo(List<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			a.set(i, a.get(i) - 1);
		}
	}

}
