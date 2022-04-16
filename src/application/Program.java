package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Rota;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] no1 = { 0, 8.4, 14.4, 18.4, 3.2, 14.8, 7.4, 4.5, 9.5, 8.3, 3.6, 1.6, 5.2, 10.8, 3.5 };
		double[] no2 = { 9.8, 0, 7.5, 14.9, 5.5, 11.1, 5.9, 11.3, 11.8, 0.5, 7.6, 8.4, 7.8, 12.5, 9.3 };
		double[] no3 = { 15.1, 7, 0, 12.3, 10.1, 18.7, 13.3, 14.9, 18.9, 7.1, 10.2, 15, 14.8, 19.6, 12.9 };
		double[] no4 = { 13.9, 12.4, 12.5, 0, 10.9, 23.3, 17.3, 13.8, 21.7, 13.3, 10.4, 13.8, 16.8, 22.5, 11.4 };
		double[] no5 = { 3.4, 5.7, 11.5, 14, 0, 12.7, 7.1, 6.2, 10.8, 5.3, 3, 4.1, 6.5, 11.7, 4 };
		double[] no6 = { 12.9, 12.5, 19.9, 29.1, 13.4, 0, 8.4, 14, 6.4, 12.9, 17.3, 13.3, 8.1, 7, 14.2 };
		double[] no7 = { 9, 6, 13.4, 21.4, 7.5, 6.8, 0, 12.1, 8.5, 6.3, 9.8, 9, 4.4, 9.2, 9 };
		double[] no8 = { 3.4, 11.7, 16, 16.2, 5.7, 14.8, 11.5, 0, 10.4, 11.3, 4.4, 3.2, 8.3, 11.3, 3.8 };
		double[] no9 = { 9, 13.4, 20.8, 25.5, 14.6, 5.1, 8, 10.3, 0, 13.8, 13.6, 9.7, 4.7, 2.9, 11.7 };
		double[] no10 = { 8.6, 0.85, 7.3, 15.5, 4.9, 11.5, 5.6, 10.7, 12.6, 0, 8.1, 7.9, 7.2, 13.4, 11.2 };
		double[] no11 = { 4.3, 9.5, 11.4, 13.3, 3, 14.9, 8.7, 4.3, 11.5, 9.1, 0, 4.3, 7.1, 13.5, 1.2 };
		double[] no12 = { 1.2, 9.5, 15.5, 18.8, 4.3, 12.8, 9.2, 3.6, 8.4, 9.6, 4.5, 0, 6.3, 9.1, 4.2 };
		double[] no13 = { 5.3, 8.4, 14.2, 21, 6.9, 8.6, 4, 8.2, 4.7, 8.1, 7.4, 5.7, 0, 5.4, 7.4 };
		double[] no14 = { 10.5, 14.9, 20.2, 26.6, 15.7, 7.4, 9.1, 11.4, 3.3, 14.9, 14.8, 10.8, 5.8, 0, 13 };
		double[] no15 = { 3, 10.6, 13.4, 14.4, 3.9, 15.9, 11.4, 3.1, 10.6, 10.4, 1.4, 2.7, 9.4, 11.8, 0 };

		Rota rota = new Rota();
		boolean jafoi = false;

		int contador = 0;
		double valorAlter = 0;
		double valorComp = 0;
		double valorRota = 0;
		double menorN = 9999;

		List<Integer> passagem = new ArrayList<Integer>();
		List<Integer> passagemComp = new ArrayList<Integer>();
		List<Integer> passagemAlter = new ArrayList<Integer>();

		System.out.println("Digite o nó que quer começar: ");
		Integer escolhaNo = sc.nextInt();

		Integer proxx = 0;
		Integer prox = escolhaNo - 1;

		for (int p = 0; p < no1.length; p++) {
			// pegar o proximo nó de menor valor para construcao da rota
			if (prox == 0) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no1[i] < menorN && no1[i] != 0) {
						menorN = no1[i];
						proxx = i;
					}

					jafoi = false;
				}
			}

			else if (prox == 1) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no2[i] < menorN && no2[i] != 0) {
						menorN = no2[i];
						proxx = i;
					}

					jafoi = false;
				}
			}

			else if (prox == 2) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no3[i] < menorN && no3[i] != 0) {
						menorN = no3[i];
						proxx = i;
					}

					jafoi = false;
				}
			}

			else if (prox == 3) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no4[i] < menorN && no4[i] != 0) {
						menorN = no4[i];
						proxx = i;
					}

					jafoi = false;
				}
			} else if (prox == 4) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no5[i] < menorN && no5[i] != 0) {
						menorN = no5[i];
						proxx = i;
					}

					jafoi = false;
				}
			}

			else if (prox == 5) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no6[i] < menorN && no6[i] != 0) {
						menorN = no6[i];
						proxx = i;
					}

					jafoi = false;
				}
			}

			else if (prox == 6) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no7[i] < menorN && no7[i] != 0) {
						menorN = no7[i];
						proxx = i;
					}

					jafoi = false;
				}
			} else if (prox == 7) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no8[i] < menorN && no8[i] != 0) {
						menorN = no8[i];
						proxx = i;
					}

					jafoi = false;
				}
			}

			else if (prox == 8) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no9[i] < menorN && no9[i] != 0) {
						menorN = no9[i];
						proxx = i;
					}

					jafoi = false;
				}
			}

			else if (prox == 9) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no10[i] < menorN && no10[i] != 0) {
						menorN = no10[i];
						proxx = i;
					}

					jafoi = false;
				}
			} else if (prox == 10) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no11[i] < menorN && no11[i] != 0) {
						menorN = no11[i];
						proxx = i;
					}

					jafoi = false;
				}
			}

			else if (prox == 11) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no12[i] < menorN && no12[i] != 0) {
						menorN = no12[i];
						proxx = i;
					}

					jafoi = false;
				}
			}

			else if (prox == 12) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no13[i] < menorN && no13[i] != 0) {
						menorN = no4[i];
						proxx = i;
					}

					jafoi = false;
				}
			} else if (prox == 13) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no14[i] < menorN && no14[i] != 0) {
						menorN = no14[i];
						proxx = i;
					}

					jafoi = false;
				}
			}

			else if (prox == 14) {
				for (int i = 0; i < no1.length; i++) {
					for (int a = 0; a < passagem.size(); a++) {
						if (i == passagem.get(a)) {
							jafoi = true;
						}
					}
					if (jafoi == false && no15[i] < menorN && no15[i] != 0) {
						menorN = no15[i];
						proxx = i;
					}

					jafoi = false;
				}
			}

			passagem.add(prox);
			passagemAlter.add(prox);
			passagemComp.add(prox);
			prox = proxx;

			if (p >= 0 && p < 2) { // mostrar na tela o passo 1 e 2
				passagem.add(passagem.get(0));
				rota.upNo(passagem);
				System.out.println("PASSO " + (p + 1));
				System.out.println(passagem.toString());
				passagem.remove(passagem.size() - 1);
				rota.downNo(passagem);
			}
			valorRota = menorN + valorRota;
			menorN = 9999;

			if (passagem.size() > 2) { // testar as varias opcoes de caminho a partir do passo 3

				passagem.add(passagem.get(0));
				passagemAlter.add(passagemAlter.get(0));
				passagemComp.add(passagem.get(0));
				System.out.println("PASSO " + (p + 1));

				// somar o total da primeira rota alternativa
				for (int u = 0; u < passagem.size() - 1; u++) {
					int proxNo = passagem.get(u);
					if (proxNo == 0) {
						int valorNo1 = passagem.get(u + 1);
						valorAlter = no1[valorNo1] + valorAlter;
					} else if (proxNo == 1) {
						int valorNo2 = passagem.get(u + 1);
						valorAlter = no2[valorNo2] + valorAlter;
					} else if (proxNo == 2) {
						int valorNo3 = passagem.get(u + 1);
						valorAlter = no3[valorNo3] + valorAlter;
					} else if (proxNo == 3) {
						int valorNo4 = passagem.get(u + 1);
						valorAlter = no4[valorNo4] + valorAlter;
					} else if (proxNo == 4) {
						int valorNo5 = passagem.get(u + 1);
						valorAlter = no5[valorNo5] + valorAlter;
					} else if (proxNo == 5) {
						int valorNo6 = passagem.get(u + 1);
						valorAlter = no6[valorNo6] + valorAlter;
					} else if (proxNo == 6) {
						int valorNo7 = passagem.get(u + 1);
						valorAlter = no7[valorNo7] + valorAlter;
					} else if (proxNo == 7) {
						int valorNo8 = passagem.get(u + 1);
						valorAlter = no8[valorNo8] + valorAlter;
					} else if (proxNo == 8) {
						int valorNo9 = passagem.get(u + 1);
						valorAlter = no9[valorNo9] + valorAlter;
					} else if (proxNo == 9) {
						int valorNo10 = passagem.get(u + 1);
						valorAlter = no10[valorNo10] + valorAlter;
					} else if (proxNo == 10) {
						int valorNo11 = passagem.get(u + 1);
						valorAlter = no11[valorNo11] + valorAlter;
					} else if (proxNo == 11) {
						int valorNo12 = passagem.get(u + 1);
						valorAlter = no12[valorNo12] + valorAlter;
					} else if (proxNo == 12) {
						int valorNo13 = passagem.get(u + 1);
						valorAlter = no13[valorNo13] + valorAlter;
					} else if (proxNo == 13) {
						int valorNo14 = passagem.get(u + 1);
						valorAlter = no14[valorNo14] + valorAlter;
					} else if (proxNo == 14) {
						int valorNo15 = passagem.get(u + 1);
						valorAlter = no15[valorNo15] + valorAlter;
					}
				}
				// printar na tela a opcao 1
				rota.upNo(passagem);
				contador++;
				System.out.println(
						contador + "º Opção:" + passagem.toString() + "Custo = " + String.format("%.2f", valorAlter));
				rota.downNo(passagem);
				// troca de posicoes do vetor
				for (int v = passagemAlter.size() - 2; v > 1; v--) {
					passagemComp.set(v, passagemAlter.get(v - 1));
					passagemComp.set(v - 1, passagemAlter.get(v));

					// somar o valor de todas as outras rotas alternativas
					for (int u = 0; u < passagemAlter.size() - 1; u++) {
						int proxNo = passagemComp.get(u);
						if (proxNo == 0) {
							int valorNo1 = passagemComp.get(u + 1);
							valorComp = no1[valorNo1] + valorComp;
						} else if (proxNo == 1) {
							int valorNo2 = passagemComp.get(u + 1);
							valorComp = no2[valorNo2] + valorComp;
						} else if (proxNo == 2) {
							int valorNo3 = passagemComp.get(u + 1);
							valorComp = no3[valorNo3] + valorComp;
						} else if (proxNo == 3) {
							int valorNo4 = passagemComp.get(u + 1);
							valorComp = no4[valorNo4] + valorComp;
						} else if (proxNo == 4) {
							int valorNo5 = passagemComp.get(u + 1);
							valorComp = no5[valorNo5] + valorComp;
						} else if (proxNo == 5) {
							int valorNo6 = passagemComp.get(u + 1);
							valorComp = no6[valorNo6] + valorComp;
						} else if (proxNo == 6) {
							int valorNo7 = passagemComp.get(u + 1);
							valorComp = no7[valorNo7] + valorComp;
						} else if (proxNo == 7) {
							int valorNo8 = passagemComp.get(u + 1);
							valorComp = no8[valorNo8] + valorComp;
						} else if (proxNo == 8) {
							int valorNo9 = passagemComp.get(u + 1);
							valorComp = no9[valorNo9] + valorComp;
						} else if (proxNo == 9) {
							int valorNo10 = passagemComp.get(u + 1);
							valorComp = no10[valorNo10] + valorComp;
						} else if (proxNo == 10) {
							int valorNo11 = passagemComp.get(u + 1);
							valorComp = no11[valorNo11] + valorComp;
						} else if (proxNo == 11) {
							int valorNo12 = passagemComp.get(u + 1);
							valorComp = no12[valorNo12] + valorComp;
						} else if (proxNo == 12) {
							int valorNo13 = passagemComp.get(u + 1);
							valorComp = no13[valorNo13] + valorComp;
						} else if (proxNo == 13) {
							int valorNo14 = passagemComp.get(u + 1);
							valorComp = no14[valorNo14] + valorComp;
						} else if (proxNo == 14) {
							int valorNo15 = passagemComp.get(u + 1);
							valorComp = no15[valorNo15] + valorComp;
						}

					}
					// printar na tela a rota com o valor total
					contador++;
					rota.upNo(passagemComp);
					System.out.println(contador + "º Opção:" + passagemComp.toString() + "Custo = "
							+ String.format("%.2f", valorComp));
					rota.downNo(passagemComp);
					// testar se a rota criada e maior que a anterior, se for trocar
					if (valorComp < valorAlter) {
						for (int i = 0; i < passagemAlter.size(); i++) {
							passagem.set(i, passagemComp.get(i));
						}
						valorAlter = valorComp;
					}
					for (int i = 0; i < passagemAlter.size(); i++) {
						passagemAlter.set(i, passagemComp.get(i));
					}

					valorComp = 0;
				} // fim do teste de rotas alternativas(depois da rota alternativa 1)
				contador = 0;
				valorRota = valorAlter;
				valorAlter = 0;

				passagemAlter.remove(passagemAlter.size() - 1);
				passagemComp.remove(passagemComp.size() - 1);
				passagem.remove(passagem.size() - 1);

				prox = proxx;

			} // fim das rotas alternativas

		} // fim da insercao de nó na construcao da rota

		// printar resultado na tela
		passagem.add(passagem.get(0));
		rota.upNo(passagem);
		System.out.println("\nConclusão da rota\nValor final: " + String.format("%.2f", valorRota));
		System.out.println("Rota: " + passagem.toString());

		sc.close();

	}
}