package model;

public class Ejercicios {

	// Ejercicio 1
	public void ejercicio1() {
		Node n1 = new Node('1', null);
		Node n2 = new Node('2', null);
		n1.next = n2;
		Node p = n2; // p se refiere al nodo con info '2'
		System.out.println("Ejercicio 1: p.info = " + p.info);
	}

	// Ejercicio 2
	public void ejercicio2() {
		Node p = new Node('1', null);
		Node q = new Node('2', null);
		p.next = q; // p se refiere a '1' y q a '2'
		System.out.println("Ejercicio 2: p.info = " + p.info + ", q.info = " + q.info);
	}

	// Ejercicio 3
	public void ejercicio3() {
		Node n1 = new Node('1', null);
		Node n2 = new Node('2', null);
		n1.next = n2;
		Node q = n1; // q se refiere al nodo con info '1'
		System.out.println("Ejercicio 3: q.info = " + q.info);
	}

	// Ejercicio 4
	public void ejercicio4() {
		Node n1 = new Node('1', null);
		Node n2 = new Node('2', null);
		n1.next = n2;
		Node r = n2; // r se refiere al nodo con info '2'
		System.out.println("Ejercicio 4: r.info = " + r.info);
	}

	// Ejercicio 5
	public void ejercicio5() {
		Node p = new Node('3', null);
		Node r = new Node('3', null);
		p.info = r.info; // p ahora tiene el mismo info que r
		System.out.println("Ejercicio 5: p.info = " + p.info);
	}

	// Ejercicio 6
	public void ejercicio6() {
		Node p = new Node('3', null);
		p.info = p.next.info; // p toma el valor del siguiente nodo (simulado)
		System.out.println("Ejercicio 6: p.info = " + p.info);
	}

	// Ejercicio 7
	public void ejercicio7() {
		Node p = new Node('1', null);
		Node r = new Node('2', null);
		p.next = r;
		r.next = p; // La lista se convierte en circular
		System.out.println("Ejercicio 7: p.next.info = " + p.next.info + ", r.next.info = " + r.next.info);
	}

	// Ejercicio 8
	public void ejercicio8() {
		Node p = new Node('1', null);
		Node q = new Node('2', null);
		p.next = q;
		q.next = p; // La lista se convierte en circular usando p y q
		System.out.println("Ejercicio 8: p.next.info = " + p.next.info + ", q.next.info = " + q.next.info);
	}

	// Ejercicio 9
	public void ejercicio9() {
		Node p = new Node('1', null);
		p.next = new Node('2', null);
		p.next.next = p; // Usando solo p, la lista se convierte en circular
		System.out.println("Ejercicio 9: p.next.next.info = " + p.next.next.info);
	}

	// Ejercicio 10
	public void ejercicio10() {
		Node p = new Node('A', null);
		Node q = new Node('B', null);
		p.next = q;
		q.next = new Node('C', null);
		p.next = p.next.next; // Elimina el nodo 'B' refiriéndose a p y q
		System.out.println("Ejercicio 10: p.next.info = " + p.next.info);
	}

	// Ejercicio 11
	public void ejercicio11() {
		Node p = new Node('A', null);
		p.next = new Node('B', null);
		p.next.next = new Node('C', null);
		p.next = p.next.next; // Elimina el nodo 'B' refiriéndose solo a p
		System.out.println("Ejercicio 11: p.next.info = " + p.next.info);
	}

	// Ejercicio 12
	public void ejercicio12() {
		Node p = new Node('A', null);
		p.next = new Node('B', null);
		p.next.next = new Node('C', null);
		Node q = p;
		while (q.next != null) {
			q = q.next;
		}
		System.out.println("Ejercicio 12: q.info = " + q.info);
	}

	// Ejercicio 13
	public void ejercicio13() {
		Node p = new Node('A', null);
		p.next = new Node('b', null);
		p.next.next = new Node('c', null);
		Node q = p;
		while (q != null && q.info != 'c') {
			q = q.next;
		}
		System.out.println("Ejercicio 13: q.info = " + q.info);
	}

	// Ejercicio 14
	public void ejercicio14() {
		Node p = new Node('A', null);
		p.next = new Node('B', null);
		p.next.next = new Node('C', null);
		p.next.next.next = new Node('D', null);
		System.out.println("Ejercicio 14: p.info = " + p.info + ", p.next.next.next.info = " + p.next.next.next.info);
	}

	// Ejercicio 15
	public void ejercicio15() {
		Node p = new Node('B', null);
		p = new Node('A', p); // Inserta 'A' al principio
		System.out.println("Ejercicio 15: p.info = " + p.info);
	}

	// Ejercicio 16
	public void ejercicio16() {
		Node p = new Node('A', null);
		p.next = new Node('B', null);
		Node q = p;
		while (q.next != null) {
			q = q.next;
		}
		q.next = new Node('D', null); // Inserta 'D' al final
		System.out.println("Ejercicio 16: p.next.next.next.info = " + p.next.next.next.info);
	}

	// Ejercicio 17
	public void ejercicio17() {
		Node p = new Node('A', null);
		p.next = new Node('B', null);
		Node q = p;
		while (q.next != null) {
			q = q.next;
		}
		q.next = p; // Coloca el nodo del principio al final
		p = p.next; // Actualiza p para que apunte al segundo nodo
		q.next.next = null; // El último nodo apunta a null
		System.out.println("Ejercicio 17: p.info = " + p.info);
	}

	// Ejercicio 18
	public void ejercicio18() {
		Node p = new Node('A', null);
		p.next = new Node('B', null);
		Node temp = p;
		while (p.next != null) {
			p = p.next;
		}
		p.next = temp; // Mueve el primer nodo al final
		p = temp.next; // Actualiza p al segundo nodo
		temp.next = null; // El último nodo debe apuntar a null
		System.out.println("Ejercicio 18: p.info = " + p.info);
	}

	// Ejercicio 19
	public void ejercicio19() {
		Node p = new Node('A', null);
		Node q = new Node('C', null);
		Node dummy = new Node('0', null); // Nodo auxiliar
		Node r = dummy;
		while (p != null && q != null) {
			if (p.info < q.info) {
				r.next = p;
				p = p.next;
			} else {
				r.next = q;
				q = q.next;
			}
			r = r.next;
		}
		r.next = (p != null) ? p : q; // Agrega los nodos restantes
		p = dummy.next; // p apunta a la lista fusionada
		System.out.println("Ejercicio 19: p.info = " + p.info);
	}

	// Ejercicio 20
	public void ejercicio20() {
		Node p = new Node('A', null);
		p.next = new Node('B', null);
		p.next.next = new Node('C', null);
		Node q = null; // Inicializamos q como null para usarlo como anterior
		Node r;
		while (p != null) {
			r = p.next; // Guarda el siguiente nodo
			p.next = q; // Invierte el enlace
			q = p; // Mueve q a p
			p = r; // Mueve p al siguiente nodo
		}
		p = q; // p ahora es el último nodo, convertido en la cabeza de la lista invertida
		System.out.println("Ejercicio 20: p.info = " + p.info);
	}
}
