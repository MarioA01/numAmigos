package app.m.numamigos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    EditText txtA,txtB;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtResult = findViewById(R.id.txtResult);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(txtA.getText().toString());
                int n2 = Integer.parseInt(txtB.getText().toString());
                int i,suma=0;
                for(i=1;i<n1;i++){  // for para sumar todos los divisores propios de n1
                    if(n1%i==0){
                        suma=suma+i;
                    }
                }
                // si la suma de los divisores de n1 es igual a n2
                if(suma==n2){
                    suma=0;
                    for(i=1;i<n2;i++){  // sumo los divisores propios de n2
                        if(n2%i==0){
                            suma=suma+i;
                        }
                    }
                    // si la suma de los divisores de n2 es igual a n1
                    if(suma==n1){
                        txtResult.setText("Son amigos");

                    }else{
                        txtResult.setText("No son amigos");

                    }
                }
                else{
                    txtResult.setText("No son amigos");

                }
            }
        });

    }
}