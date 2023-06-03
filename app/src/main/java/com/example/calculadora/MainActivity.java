package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private enum Operador {
        SUMA, RESTA, MULTIPLICACION, DIVISION
    }

    private TextView display;
    private Button btnClear, btnBackspace, btnIgual;
    private Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnCero;
    private Button btnPunto, btnAns, btnSuma, btnResta, btnMult, btnDiv;

    private Operador operador;
    private double primerOperando;
    private double segundoOperando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);
        btnClear = findViewById(R.id.btnClear);
        btnBackspace = findViewById(R.id.btnBackspace);
        btnIgual = findViewById(R.id.btnIgual);
        btnUno = findViewById(R.id.btnUno);
        btnDos = findViewById(R.id.btnDos);
        btnTres = findViewById(R.id.btnTres);
        btnCuatro = findViewById(R.id.btnCuatro);
        btnCinco = findViewById(R.id.btnCinco);
        btnSeis = findViewById(R.id.btnSeis);
        btnSiete = findViewById(R.id.btnSiete);
        btnOcho = findViewById(R.id.btnOcho);
        btnNueve = findViewById(R.id.btnNueve);
        btnCero = findViewById(R.id.btnCero);
        btnPunto = findViewById(R.id.btnPunto);
        btnAns = findViewById(R.id.btnAns);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = display.getText().toString();
                if (currentText.length() > 0) {
                    String newText = currentText.substring(0, currentText.length() - 1);
                    display.setText(newText);
                }
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = display.getText().toString();
                if (currentText.length() > 0) {
                    segundoOperando = Double.parseDouble(currentText);
                    double resultado = 0;

                    switch (operador) {
                        case SUMA:
                            resultado = primerOperando + segundoOperando;
                            break;
                        case RESTA:
                            resultado = primerOperando - segundoOperando;
                            break;
                        case MULTIPLICACION:
                            resultado = primerOperando * segundoOperando;
                            break;
                        case DIVISION:
                            if (segundoOperando != 0) {
                                resultado = primerOperando / segundoOperando;
                            } else {
                                // Manejar división entre cero
                                Toast.makeText(MainActivity.this, "Error: División entre cero", Toast.LENGTH_SHORT).show();
                            }
                            break;
                    }

                    // Mostrar el resultado en la pantalla
                    display.setText(String.valueOf(resultado));
                }
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = display.getText().toString();
                if (currentText.length() > 0) {
                    operador = Operador.SUMA;
                    primerOperando = Double.parseDouble(currentText);
                    display.setText("");
                }
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = display.getText().toString();
                if (currentText.length() > 0) {
                    operador = Operador.RESTA;
                    primerOperando = Double.parseDouble(currentText);
                    display.setText("");
                }
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = display.getText().toString();
                if (currentText.length() > 0) {
                    operador = Operador.MULTIPLICACION;
                    primerOperando = Double.parseDouble(currentText);
                    display.setText("");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = display.getText().toString();
                if (currentText.length() > 0) {
                    operador = Operador.DIVISION;
                    primerOperando = Double.parseDouble(currentText);
                    display.setText("");
                }
            }
        });

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("1");
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("2");
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("3");
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("4");
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("5");
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("6");
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("7");
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("8");
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("9");
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("0");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = display.getText().toString();
                if (!currentText.contains(".")) {
                    display.append(".");
                }
            }
        });

        btnAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el resultado actual en la pantalla y establecerlo como primer operando
                String currentText = display.getText().toString();
                if (currentText.length() > 0) {
                    primerOperando = Double.parseDouble(currentText);
                }
            }
        });
    }
}
