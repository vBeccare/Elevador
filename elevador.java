import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class elevador extends JPanel {
	private JLabel lte,lpri,lseg,lter,lqua,lqui,lsex,lset,loit,lnon,ldec;
	private JButton btup, btdw, bten, btsa, btte;
	private JTextField pri, seg, ter, qua, qui, sex, set, out, non, dec, tfte;
	private JPanel panel1;
	int andar = 0;
	ImageIcon subir, descer, entrar, sair, terreo,elevava,elevach;

	public elevador() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		setLayout(null);
		
		elevava=new ImageIcon("F:\\imagens\\elevava.png");
		elevach=new ImageIcon("F:\\imagens\\elevach.png");
		lte=new JLabel("");
		lte.setIcon(elevava);
		lte.setBounds(320, 380, 60, 82);
		add(lte);
		lpri=new JLabel("");
		lpri.setBounds(320, 339, 60, 82);
		add(lpri);
		lseg=new JLabel("");
		lseg.setBounds(320, 298, 60, 82);
		add(lseg);
		lter=new JLabel("");
		lter.setBounds(320, 257, 60, 82);
		add(lter);
		lqua=new JLabel("");
		lqua.setBounds(320, 216, 60, 82);
		add(lqua);
		lqui=new JLabel("");
		lqui.setBounds(320, 175, 60, 82);
		add(lqui);
		lsex=new JLabel("");
		lsex.setBounds(320, 134, 60, 82);
		add(lsex);
		lset=new JLabel("");
		lset.setBounds(320, 93, 60, 82);
		add(lset);
		loit=new JLabel("");
		loit.setBounds(320, 52, 60, 82);
		add(loit);
		lnon=new JLabel("");
		lnon.setBounds(320, 11, 60, 82);
		add(lnon);
		ldec=new JLabel("");
		ldec.setBounds(320, 0, 60, 82);
		add(ldec);
		
		subir = new ImageIcon("F:\\imagens\\cima.png");
		descer = new ImageIcon("F:\\imagens\\descer.png");
		entrar = new ImageIcon("F:\\imagens\\entrar.png");
		sair = new ImageIcon("F:\\imagens\\sair.png");
		terreo = new ImageIcon("F:\\imagens\\terreo.png");

		dec = new JTextField("10 andar");
		dec.setBounds(400, 10, 80, 20);
		add(dec);

		non = new JTextField("9 andar");
		non.setBounds(400, 50, 80, 20);
		add(non);

		out = new JTextField("8 andar");
		out.setBounds(400, 90, 80, 20);
		add(out);

		set = new JTextField("7 andar");
		set.setBounds(400, 130, 80, 20);
		add(set);

		sex = new JTextField("6 andar");
		sex.setBounds(400, 170, 80, 20);
		add(sex);

		qui = new JTextField("5 andar");
		qui.setBounds(400, 210, 80, 20);
		add(qui);

		qua = new JTextField("4 andar");
		qua.setBounds(400, 250, 80, 20);
		add(qua);

		ter = new JTextField("3 andar");
		ter.setBounds(400, 290, 80, 20);
		add(ter);

		seg = new JTextField("2 andar");
		seg.setBounds(400, 330, 80, 20);
		add(seg);

		pri = new JTextField("1 andar");
		pri.setBounds(400, 370, 80, 20);
		add(pri);

		tfte = new JTextField("Terreo");
		tfte.setBackground(Color.GREEN);
		tfte.setBounds(400, 410, 80, 20);
		add(tfte);

		btup = new JButton(subir);
		btup.setBounds(10, 10, 100, 100);
		add(btup);

		btdw = new JButton(descer);
		btdw.setBounds(10, 110, 100, 100);
		add(btdw);

		btsa = new JButton(sair);
		btsa.setBounds(10, 210, 100, 100);
		add(btsa);

		bten = new JButton(entrar);
		bten.setBounds(10, 310, 100, 100);
		add(bten);

		btte = new JButton(terreo);
		btte.setBounds(10, 410, 100, 100);
		add(btte);

	}

	private void definirEventos() {
		btup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tfte.getBackground() == Color.green) {
					tfte.setBackground(Color.white);
					pri.setBackground(Color.green);
					lte.setIcon(null);
					lpri.setIcon(elevava);

				} else if (pri.getBackground() == Color.green) {
					pri.setBackground(Color.white);
					seg.setBackground(Color.green);
					lpri.setIcon(null);
					lseg.setIcon(elevava);
				} else if (seg.getBackground() == Color.green) {
					seg.setBackground(Color.white);
					ter.setBackground(Color.green);
					lseg.setIcon(null);
					lter.setIcon(elevava);
				} else if (ter.getBackground() == Color.green) {
					ter.setBackground(Color.white);
					qua.setBackground(Color.green);
					lter.setIcon(null);
					lqua.setIcon(elevava);
				} else if (qua.getBackground() == Color.green) {
					qua.setBackground(Color.white);
					qui.setBackground(Color.green);
					lqua.setIcon(null);
					lqui.setIcon(elevava);
				} else if (qui.getBackground() == Color.green) {
					qui.setBackground(Color.white);
					sex.setBackground(Color.green);
					lqui.setIcon(null);
					lsex.setIcon(elevava);
				} else if (sex.getBackground() == Color.green) {
					sex.setBackground(Color.white);
					set.setBackground(Color.green);
					lsex.setIcon(null);
					lset.setIcon(elevava);
				} else if (set.getBackground() == Color.green) {
					set.setBackground(Color.white);
					out.setBackground(Color.green);
					lset.setIcon(null);
					loit.setIcon(elevava);
				} else if (out.getBackground() == Color.green) {
					out.setBackground(Color.white);
					non.setBackground(Color.green);
					loit.setIcon(null);
					lnon.setIcon(elevava);
				} else if (non.getBackground() == Color.green) {
					non.setBackground(Color.white);
					dec.setBackground(Color.green);
					lnon.setIcon(null);
					ldec.setIcon(elevava);
				}
				 if (tfte.getBackground() == Color.red) {
					tfte.setBackground(Color.white);
					pri.setBackground(Color.red);
					lte.setIcon(null);
					lpri.setIcon(elevach);

				} else if (pri.getBackground() == Color.red) {
					pri.setBackground(Color.white);
					seg.setBackground(Color.red);
					lpri.setIcon(null);
					lseg.setIcon(elevach);
					
				} else if (seg.getBackground() == Color.red) {
					seg.setBackground(Color.white);
					ter.setBackground(Color.red);
					lseg.setIcon(null);
					lter.setIcon(elevach);
					
				} else if (ter.getBackground() == Color.red) {
					ter.setBackground(Color.white);
					qua.setBackground(Color.red);
					lter.setIcon(null);
					lqua.setIcon(elevach);
					
				} else if (qua.getBackground() == Color.red) {
					qua.setBackground(Color.white);
					qui.setBackground(Color.red);
					lqua.setIcon(null);
					lqui.setIcon(elevach);
					
				} else if (qui.getBackground() == Color.red) {
					qui.setBackground(Color.white);
					sex.setBackground(Color.red);
					lqui.setIcon(null);
					lsex.setIcon(elevach);
					
				} else if (sex.getBackground() == Color.red) {
					sex.setBackground(Color.white);
					set.setBackground(Color.red);
					lsex.setIcon(null);
					lset.setIcon(elevach);
					
				} else if (set.getBackground() == Color.red) {
					set.setBackground(Color.white);
					out.setBackground(Color.red);
					lset.setIcon(null);
					loit.setIcon(elevach);
					
				} else if (out.getBackground() == Color.red) {
					out.setBackground(Color.white);
					non.setBackground(Color.red);
					loit.setIcon(null);
					lnon.setIcon(elevach);
					
				} else if (non.getBackground() == Color.red) {
					non.setBackground(Color.white);
					dec.setBackground(Color.red);
					lnon.setIcon(null);
					ldec.setIcon(elevach);
					
				}

			}
		});

		btdw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (dec.getBackground() == Color.green) {
					dec.setBackground(Color.white);
					non.setBackground(Color.green);
					ldec.setIcon(null);
					lnon.setIcon(elevava);
				} else if (non.getBackground() == Color.green) {
					non.setBackground(Color.white);
					out.setBackground(Color.green);
					lnon.setIcon(null);
					loit.setIcon(elevava);
				} else if (out.getBackground() == Color.green) {
					out.setBackground(Color.white);
					set.setBackground(Color.green);
					loit.setIcon(null);
					lset.setIcon(elevava);
				} else if (set.getBackground() == Color.green) {
					set.setBackground(Color.white);
					sex.setBackground(Color.green);
					lset.setIcon(null);
					lsex.setIcon(elevava);
				} else if (sex.getBackground() == Color.green) {
					sex.setBackground(Color.white);
					qui.setBackground(Color.green);
					lsex.setIcon(null);
					lqui.setIcon(elevava);
				} else if (qui.getBackground() == Color.green) {
					qui.setBackground(Color.white);
					qua.setBackground(Color.green);
					lqui.setIcon(null);
					lqua.setIcon(elevava);
				} else if (qua.getBackground() == Color.green) {
					qua.setBackground(Color.white);
					ter.setBackground(Color.green);
					lqua.setIcon(null);
					lter.setIcon(elevava);
				} else if (ter.getBackground() == Color.green) {
					ter.setBackground(Color.white);
					seg.setBackground(Color.green);
					lter.setIcon(null);
					lseg.setIcon(elevava);
				} else if (seg.getBackground() == Color.green) {
					seg.setBackground(Color.white);
					pri.setBackground(Color.green);
					lseg.setIcon(null);
					lpri.setIcon(elevava);
				} else if (pri.getBackground() == Color.green) {
					pri.setBackground(Color.white);
					tfte.setBackground(Color.green);
					lpri.setIcon(null);
					lte.setIcon(elevava);
					
				} else if (dec.getBackground() == Color.red) {
					dec.setBackground(Color.white);
					non.setBackground(Color.red);
					ldec.setIcon(null);
					lnon.setIcon(elevach);
				} else if (non.getBackground() == Color.red) {
					non.setBackground(Color.white);
					out.setBackground(Color.red);
					lnon.setIcon(null);
					loit.setIcon(elevach);
				} else if (out.getBackground() == Color.red) {
					out.setBackground(Color.white);
					set.setBackground(Color.red);
					loit.setIcon(null);
					lset.setIcon(elevach);
				} else if (set.getBackground() == Color.red) {
					set.setBackground(Color.white);
					sex.setBackground(Color.red);
					lset.setIcon(null);
					lsex.setIcon(elevach);
				} else if (sex.getBackground() == Color.red) {
					sex.setBackground(Color.white);
					qui.setBackground(Color.red);
					lsex.setIcon(null);
					lqui.setIcon(elevach);
				} else if (qui.getBackground() == Color.red) {
					qui.setBackground(Color.white);
					qua.setBackground(Color.red);
					lqui.setIcon(null);
					lqua.setIcon(elevach);
				} else if (qua.getBackground() == Color.red) {
					qua.setBackground(Color.white);
					ter.setBackground(Color.red);
					lqua.setIcon(null);
					lter.setIcon(elevach);
				} else if (ter.getBackground() == Color.red) {
					ter.setBackground(Color.white);
					seg.setBackground(Color.red);
					lter.setIcon(null);
					lseg.setIcon(elevach);
				} else if (seg.getBackground() == Color.red) {
					seg.setBackground(Color.white);
					pri.setBackground(Color.red);
					lseg.setIcon(null);
					lpri.setIcon(elevach);
				} else if (pri.getBackground() == Color.red) {
					pri.setBackground(Color.white);
					tfte.setBackground(Color.red);
					lpri.setIcon(null);
					lte.setIcon(elevach);
				}

			}
		});

		btte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (pri.getBackground() == Color.green) {
					tfte.setBackground(Color.green);
					pri.setBackground(Color.white);
					lte.setIcon(elevava);
					lpri.setIcon(null);
				} else if (pri.getBackground() == Color.red) {
					tfte.setBackground(Color.red);
					pri.setBackground(Color.white);
					lte.setIcon(elevach);
					lpri.setIcon(null);
				} else if (seg.getBackground() == Color.green) {
					tfte.setBackground(Color.green);
					seg.setBackground(Color.white);
					lte.setIcon(elevava);
					lseg.setIcon(null);
				} else if (seg.getBackground() == Color.red) {
					tfte.setBackground(Color.red);
					seg.setBackground(Color.white);
					lte.setIcon(elevach);
					lseg.setIcon(null);
				} else if (ter.getBackground() == Color.green) {
					tfte.setBackground(Color.green);
					ter.setBackground(Color.white);
					lte.setIcon(elevava);
					lter.setIcon(null);
				} else if (ter.getBackground() == Color.red) {
					tfte.setBackground(Color.red);
					ter.setBackground(Color.white);
					lte.setIcon(elevach);
					lter.setIcon(null);
				} else if (qua.getBackground() == Color.green) {
					tfte.setBackground(Color.green);
					qua.setBackground(Color.white);
					lte.setIcon(elevava);
					lqua.setIcon(null);
				} else if (qua.getBackground() == Color.red) {
					tfte.setBackground(Color.red);
					qua.setBackground(Color.white);
					lte.setIcon(elevach);
					lqua.setIcon(null);
				} else if (qui.getBackground() == Color.green) {
					tfte.setBackground(Color.green);
					qui.setBackground(Color.white);
					lte.setIcon(elevava);
					lqui.setIcon(null);
				} else if (qui.getBackground() == Color.red) {
					tfte.setBackground(Color.red);
					qui.setBackground(Color.white);
					lte.setIcon(elevach);
					lqui.setIcon(null);
				} else if (sex.getBackground() == Color.green) {
					tfte.setBackground(Color.green);
					sex.setBackground(Color.white);
					lte.setIcon(elevava);
					lsex.setIcon(null);
				} else if (sex.getBackground() == Color.red) {
					tfte.setBackground(Color.red);
					sex.setBackground(Color.white);
					lte.setIcon(elevach);
					lsex.setIcon(null);
				} else if (set.getBackground() == Color.green) {
					tfte.setBackground(Color.green);
					set.setBackground(Color.white);
					lte.setIcon(elevava);
					lset.setIcon(null);
				} else if (set.getBackground() == Color.red) {
					tfte.setBackground(Color.red);
					set.setBackground(Color.white);
					lte.setIcon(elevach);
					lset.setIcon(null);
				} else if (out.getBackground() == Color.green) {
					tfte.setBackground(Color.green);
					out.setBackground(Color.white);
					lte.setIcon(elevava);
					loit.setIcon(null);
				} else if (out.getBackground() == Color.red) {
					tfte.setBackground(Color.red);
					out.setBackground(Color.white);
					lte.setIcon(elevach);
					loit.setIcon(null);
				} else if (non.getBackground() == Color.green) {
					tfte.setBackground(Color.green);
					non.setBackground(Color.white);
					lte.setIcon(elevava);
					lnon.setIcon(null);
				} else if (non.getBackground() == Color.red) {
					tfte.setBackground(Color.red);
					non.setBackground(Color.white);
					lte.setIcon(elevach);
					lnon.setIcon(null);
				} else if (dec.getBackground() == Color.green) {
					tfte.setBackground(Color.green);
					dec.setBackground(Color.white);
					lte.setIcon(elevava);
					ldec.setIcon(null);
				} else if (dec.getBackground() == Color.red) {
					tfte.setBackground(Color.red);
					dec.setBackground(Color.white);
					lte.setIcon(elevach);
					ldec.setIcon(null);
				}
			}
		});
		bten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tfte.getBackground() == Color.green) {
					tfte.setBackground(Color.red);
					lte.setIcon(elevach);
				} else if (pri.getBackground() == Color.green) {
					pri.setBackground(Color.red);
					lpri.setIcon(elevach);
				} else if (seg.getBackground() == Color.green) {
					seg.setBackground(Color.red);
					lseg.setIcon(elevach);
				} else if (ter.getBackground() == Color.green) {
					ter.setBackground(Color.red);
					lter.setIcon(elevach);
				} else if (qua.getBackground() == Color.green) {
					qua.setBackground(Color.red);
					lqua.setIcon(elevach);
				} else if (qui.getBackground() == Color.green) {
					qui.setBackground(Color.red);
					lqui.setIcon(elevach);
				} else if (sex.getBackground() == Color.green) {
					sex.setBackground(Color.red);
					lsex.setIcon(elevach);
				} else if (set.getBackground() == Color.green) {
					set.setBackground(Color.red);
					lset.setIcon(elevach);
				} else if (out.getBackground() == Color.green) {
					out.setBackground(Color.red);
					loit.setIcon(elevach);
				} else if (non.getBackground() == Color.green) {
					non.setBackground(Color.red);
					lnon.setIcon(elevach);
				} else if (dec.getBackground() == Color.green) {
					dec.setBackground(Color.red);
					ldec.setIcon(elevach);
				}
			}
		});
		btsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (dec.getBackground() == Color.red) {
					dec.setBackground(Color.green);
					ldec.setIcon(elevava);
				} else if (non.getBackground() == Color.red) {
					non.setBackground(Color.green);
					lnon.setIcon(elevava);
				} else if (out.getBackground() == Color.red) {
					out.setBackground(Color.green);
					loit.setIcon(elevava);
				} else if (set.getBackground() == Color.red) {
					set.setBackground(Color.green);
					lset.setIcon(elevava);
				} else if (sex.getBackground() == Color.red) {
					sex.setBackground(Color.green);
					lsex.setIcon(elevava);
				} else if (qui.getBackground() == Color.red) {
					qui.setBackground(Color.green);
					lqui.setIcon(elevava);
				} else if (qua.getBackground() == Color.red) {
					qua.setBackground(Color.green);
					lqua.setIcon(elevava);
				} else if (ter.getBackground() == Color.red) {
					ter.setBackground(Color.green);
					lter.setIcon(elevava);
				} else if (seg.getBackground() == Color.red) {
					seg.setBackground(Color.green);
					lseg.setIcon(elevava);
				} else if (pri.getBackground() == Color.red) {
					pri.setBackground(Color.green);
					lpri.setIcon(elevava);
				} else if (tfte.getBackground() == Color.red) {
					tfte.setBackground(Color.green);
					lte.setIcon(elevava);
				}

			}
		});
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Elevador");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new elevador());
		frame.setBounds(350, 120, 500, 600);
		frame.setVisible(true);
	}
}
