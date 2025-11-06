package br.com.calculadora.tela;

import java.awt.Toolkit;

/**
 * Classe principal da Calculadora.
 * Desenvolvido por: Evanilson Carvalho Sousa
 * 
 * Essa classe representa a interface gráfica e também
 * a lógica principal de uma calculadora simples com operações:
 * soma, subtração, multiplicação, divisão e raiz quadrada.
 */
public class TelaCalculadora extends javax.swing.JFrame {
    // Atributos principais para armazenar valores e operação
    private double num1; // Primeiro número digitado
    private double num2; // Segundo número digitado
    private double resultado; // Resultado da operação
    private char operacao; // Operador escolhido (+, -, *, /, √)
  
   // Construtor da tela
    public TelaCalculadora() {
        initComponents(); // Método gerado automaticamente pelo NetBeans (monta a interface)
	
	setIcon();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LBTela = new javax.swing.JLabel();
        btum = new javax.swing.JButton();
        bt_dois = new javax.swing.JButton();
        bt_tres = new javax.swing.JButton();
        bt_quatro = new javax.swing.JButton();
        bt_cinco = new javax.swing.JButton();
        bt_seis = new javax.swing.JButton();
        bt_sete = new javax.swing.JButton();
        bt_oito = new javax.swing.JButton();
        bt_nove = new javax.swing.JButton();
        bt_limpar = new javax.swing.JButton();
        bt_zero = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        bt_soma = new javax.swing.JButton();
        bt_subitrair = new javax.swing.JButton();
        bt_dividir = new javax.swing.JButton();
        bt_multiplicar = new javax.swing.JButton();
        bt_igual = new javax.swing.JButton();
        bt_raiz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora ECS");

        LBTela.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LBTela.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LBTela.setText("0");
        LBTela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btum.setText("1");
        btum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btumActionPerformed(evt);
            }
        });

        bt_dois.setText("2");
        bt_dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_doisActionPerformed(evt);
            }
        });

        bt_tres.setText("3");
        bt_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tresActionPerformed(evt);
            }
        });

        bt_quatro.setText("4");
        bt_quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quatroActionPerformed(evt);
            }
        });

        bt_cinco.setText("5");
        bt_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cincoActionPerformed(evt);
            }
        });

        bt_seis.setText("6");
        bt_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_seisActionPerformed(evt);
            }
        });

        bt_sete.setText("7");
        bt_sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_seteActionPerformed(evt);
            }
        });

        bt_oito.setText("8");
        bt_oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_oitoActionPerformed(evt);
            }
        });

        bt_nove.setText("9");
        bt_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_noveActionPerformed(evt);
            }
        });

        bt_limpar.setText("c");
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });

        bt_zero.setText("0");
        bt_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_zeroActionPerformed(evt);
            }
        });

        jButton12.setText(".");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        bt_soma.setText("+");
        bt_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_somaActionPerformed(evt);
            }
        });

        bt_subitrair.setText("-");
        bt_subitrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_subitrairActionPerformed(evt);
            }
        });

        bt_dividir.setText("/");
        bt_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_dividirActionPerformed(evt);
            }
        });

        bt_multiplicar.setText("*");
        bt_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_multiplicarActionPerformed(evt);
            }
        });

        bt_igual.setText("=");
        bt_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_igualActionPerformed(evt);
            }
        });

        bt_raiz.setText("√");
        bt_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_raizActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("                  Desenvolvedor Evanilson Sousa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bt_raiz)
                                .addGap(112, 112, 112))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btum)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt_dois)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt_tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bt_quatro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt_cinco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bt_seis))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(bt_sete)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bt_oito))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(bt_limpar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bt_zero)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton12)
                                            .addComponent(bt_nove))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bt_subitrair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bt_dividir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_multiplicar, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(bt_igual)
                                .addComponent(bt_soma))
                            .addComponent(LBTela, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LBTela, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btum)
                                .addComponent(bt_dois))
                            .addComponent(bt_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_quatro)
                            .addComponent(bt_cinco)
                            .addComponent(bt_seis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_sete)
                            .addComponent(bt_oito)
                            .addComponent(bt_nove))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_limpar)
                            .addComponent(bt_zero)
                            .addComponent(jButton12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_raiz))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_soma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_subitrair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_dividir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_multiplicar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_igual)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // ==============================================
    // ========== SEÇÃO DE COMPONENTES ==============
    // ==============================================
    // O método initComponents() é gerado automaticamente
    // pelo NetBeans, contendo todos os botões e layout da interface.

    // ==============================================
    // ========== AÇÕES DOS BOTÕES NUMÉRICOS ========
    // ==============================================
    
    private void bt_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_seisActionPerformed
        setarValoresNoLabel('6');
    }//GEN-LAST:event_bt_seisActionPerformed

    private void bt_oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_oitoActionPerformed
        setarValoresNoLabel('8');
    }//GEN-LAST:event_bt_oitoActionPerformed

    private void bt_subitrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_subitrairActionPerformed
      pegarNum1();
              setOperacao('-');
    }//GEN-LAST:event_bt_subitrairActionPerformed

    private void btumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btumActionPerformed
        setarValoresNoLabel('1'); // adiciona o número 1 ao visor
    }//GEN-LAST:event_btumActionPerformed

    private void bt_doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_doisActionPerformed
      setarValoresNoLabel('2');
    }//GEN-LAST:event_bt_doisActionPerformed

    private void bt_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tresActionPerformed
        setarValoresNoLabel('3');
    }//GEN-LAST:event_bt_tresActionPerformed

    private void bt_quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quatroActionPerformed
      setarValoresNoLabel('4');
    }//GEN-LAST:event_bt_quatroActionPerformed

    private void bt_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cincoActionPerformed
        setarValoresNoLabel('5');
    }//GEN-LAST:event_bt_cincoActionPerformed

    private void bt_seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_seteActionPerformed
       setarValoresNoLabel('7');
    }//GEN-LAST:event_bt_seteActionPerformed

    private void bt_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_noveActionPerformed
        setarValoresNoLabel('9');
    }//GEN-LAST:event_bt_noveActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        setNum1(0);
        setNum2(0);
        setResultado(0);
        getLBTela().setText("0");
    }//GEN-LAST:event_bt_limparActionPerformed

    private void bt_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_zeroActionPerformed
      setarValoresNoLabel('0');
    }//GEN-LAST:event_bt_zeroActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      setarValoresNoLabel('.');
    }//GEN-LAST:event_jButton12ActionPerformed

    private void bt_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_raizActionPerformed
       pegarNum1();
        setOperacao('√');
        calcular();
    }//GEN-LAST:event_bt_raizActionPerformed

    private void bt_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_somaActionPerformed
       pegarNum1();
         setOperacao('+');
    }//GEN-LAST:event_bt_somaActionPerformed

    private void bt_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_dividirActionPerformed
       pegarNum1();
        setOperacao('/');
    }//GEN-LAST:event_bt_dividirActionPerformed

    private void bt_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_multiplicarActionPerformed
       pegarNum1();
          setOperacao('*');
    }//GEN-LAST:event_bt_multiplicarActionPerformed

    private void bt_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_igualActionPerformed
       pegarNum2();
       calcular();
    }//GEN-LAST:event_bt_igualActionPerformed

    private void setIcon() {
	setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icones/calc.jpg")));
    } 
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBTela;
    private javax.swing.JButton bt_cinco;
    private javax.swing.JButton bt_dividir;
    private javax.swing.JButton bt_dois;
    private javax.swing.JButton bt_igual;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_multiplicar;
    private javax.swing.JButton bt_nove;
    private javax.swing.JButton bt_oito;
    private javax.swing.JButton bt_quatro;
    private javax.swing.JButton bt_raiz;
    private javax.swing.JButton bt_seis;
    private javax.swing.JButton bt_sete;
    private javax.swing.JButton bt_soma;
    private javax.swing.JButton bt_subitrair;
    private javax.swing.JButton bt_tres;
    private javax.swing.JButton bt_zero;
    private javax.swing.JButton btum;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

public void setarValoresNoLabel (char numero){ 
   if ("0".equals(getLBTela().getText()))
        getLBTela().setText("");
    
    String texto = getLBTela().getText();
    texto = texto+numero;
        getLBTela().setText(texto);
    }

public void pegarNum1(){
        setNum1(Double.parseDouble(getLBTela().getText()));
        getLBTela().setText("");
    
}

public void pegarNum2(){
        setNum2(Double.parseDouble(getLBTela().getText()));
        getLBTela().setText("");
}
public void calcular(){
             if (getOperacao() == '+'){
            setResultado(getNum1() + getNum2());
    }
    else if (getOperacao() == '*'){
            setResultado(getNum1() * getNum2());
    }
    else if (getOperacao() == '-'){
            setResultado(getNum1() - getNum2());
    }
    else if (getOperacao() == '/'){
            setResultado(getNum1() / getNum2());
    }
    else{
            setResultado(Math.sqrt(getNum1()));
    }
        
        getLBTela().setText(String.valueOf(getResultado()));
    }

    public double getNum1() {
        return num1;
    }
      public void setNum1(double num1) {
        this.num1 = num1;
    }
     public double getNum2() {
        return num2;
    }
      public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double getResultado() {
        return resultado;
    }
       public void setResultado(double resultado) {
        this.resultado = resultado;
    }
       public char getOperacao() {
        return operacao;
    }
        public void setOperacao(char operacao) {
        this.operacao = operacao;
    }
        public javax.swing.JLabel getLBTela() {
        return LBTela;
    }
       public void setLBTela(javax.swing.JLabel LBTela) {
        this.LBTela = LBTela;
    }
      public javax.swing.JButton getBt_cinco() {
        return bt_cinco;
    }
    public void setBt_cinco(javax.swing.JButton bt_cinco) {
        this.bt_cinco = bt_cinco;
    }
       public javax.swing.JButton getBt_dividir() {
        return bt_dividir;
    }
       public void setBt_dividir(javax.swing.JButton bt_dividir) {
        this.bt_dividir = bt_dividir;
    }
      public javax.swing.JButton getBt_dois() {
        return bt_dois;
    }
        public void setBt_dois(javax.swing.JButton bt_dois) {
        this.bt_dois = bt_dois;
    }
     public javax.swing.JButton getBt_igual() {
        return bt_igual;
    }
        public void setBt_igual(javax.swing.JButton bt_igual) {
        this.bt_igual = bt_igual;
    }
       public javax.swing.JButton getBt_limpar() {
        return bt_limpar;
    }
      public void setBt_limpar(javax.swing.JButton bt_limpar) {
        this.bt_limpar = bt_limpar;
    }
       public javax.swing.JButton getBt_multiplicar() {
        return bt_multiplicar;
    }
       public void setBt_multiplicar(javax.swing.JButton bt_multiplicar) {
        this.bt_multiplicar = bt_multiplicar;
    }
      public javax.swing.JButton getBt_nove() {
        return bt_nove;
    }
    public void setBt_nove(javax.swing.JButton bt_nove) {
        this.bt_nove = bt_nove;
    }
       public javax.swing.JButton getBt_oito() {
        return bt_oito;
    }
       public void setBt_oito(javax.swing.JButton bt_oito) {
        this.bt_oito = bt_oito;
    }
    public javax.swing.JButton getBt_quatro() {
        return bt_quatro;
    }
        public void setBt_quatro(javax.swing.JButton bt_quatro) {
        this.bt_quatro = bt_quatro;
    }
        public javax.swing.JButton getBt_raiz() {
        return bt_raiz;
    }
        public void setBt_raiz(javax.swing.JButton bt_raiz) {
        this.bt_raiz = bt_raiz;
    }
        public javax.swing.JButton getBt_seis() {
        return bt_seis;
    }
        public void setBt_seis(javax.swing.JButton bt_seis) {
        this.bt_seis = bt_seis;
    }
        public javax.swing.JButton getBt_sete() {
        return bt_sete;
    }
    public void setBt_sete(javax.swing.JButton bt_sete) {
        this.bt_sete = bt_sete;
    }
    public javax.swing.JButton getBt_soma() {
        return bt_soma;
    }
    public void setBt_soma(javax.swing.JButton bt_soma) {
        this.bt_soma = bt_soma;
    }
     public javax.swing.JButton getBt_subitrair() {
        return bt_subitrair;
    }
    public void setBt_subitrair(javax.swing.JButton bt_subitrair) {
        this.bt_subitrair = bt_subitrair;
    }
     public javax.swing.JButton getBt_tres() {
        return bt_tres;
    }
     public void setBt_tres(javax.swing.JButton bt_tres) {
        this.bt_tres = bt_tres;
    }
     public javax.swing.JButton getBt_zero() {
        return bt_zero;
    }
    public void setBt_zero(javax.swing.JButton bt_zero) {
        this.bt_zero = bt_zero;
    }
    public javax.swing.JButton getBtum() {
        return btum;
    }
     public void setBtum(javax.swing.JButton btum) {
        this.btum = btum;
    }
     public javax.swing.JButton getjButton12() {
        return jButton12;
    }
    public void setjButton12(javax.swing.JButton jButton12) {
        this.jButton12 = jButton12;
    }
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }
     public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }
  }