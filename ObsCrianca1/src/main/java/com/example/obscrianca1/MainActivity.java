package com.example.obscrianca1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainActivity extends ActionBarActivity {

    Button btAdd, btRetroceder, btCTOS, btAES, btCIS, btCam;

    private Spinner sensibilidade_spinner;
    private Button btOK;

    private static final int REQUEST_PICTURE = 1000;
    private ImageView imageView;
    private File imageFile;


    public void Carregaobs(){

        setContentView(R.layout.obs);

        Button btadd = (Button) findViewById(R.id.btAdd);

        Button btctos = (Button) findViewById(R.id.btCTOS);

        Button btaes = (Button) findViewById(R.id.btAES);

        Button btcis = (Button) findViewById(R.id.btCIS);

        btadd.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {

                Carregaadd();

            }

        });

        btctos.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {

                Carregactos();

            }

        });

        btaes.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {

                Carregaaes();

            }

        });

        btcis.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {

                Carregacis();

            }

        });
    }

    public void Carregaadd() {

        setContentView(R.layout.add);

        Button btretroceder = (Button) findViewById(R.id.btRetroceder);

        btretroceder.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {

                Carregaobs();
            }
        });
    }

    public void Carregactos() {

        setContentView(R.layout.ctos);

        Button btretroceder = (Button) findViewById(R.id.btRetroceder);

        btretroceder.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {

                Carregaobs();

            }
        });


        Button btcam = (Button) findViewById(R.id.btCam);

        btcam.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {

                Carregacam();

            }
        });
    }


    public void Carregacam(){

        setContentView(R.layout.cam);

        Button btretroceder = (Button) findViewById(R.id.btRetroceder);

        btretroceder.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {
                Carregactos();
            }
        });

    }


    public void Carregaaes() {

        setContentView(R.layout.aes);

        //chamar os métodos para a Spinner (Drop Down List)
        addListenerOnButton();
        addListenerOnSpinnerItemSelection();

        Button btretroceder = (Button) findViewById(R.id.btRetroceder);

        btretroceder.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {
                Carregaobs();

            }
        });

    }


    private void addListenerOnSpinnerItemSelection() {
        sensibilidade_spinner = (Spinner) findViewById(R.id.sensibilidade_spinner);
        sensibilidade_spinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());

    }


    private void addListenerOnButton() {

        sensibilidade_spinner = (Spinner) findViewById(R.id.sensibilidade_spinner);
        btOK = (Button) findViewById(R.id.btOK);

        btOK.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,
                        "OnClickListener :" +
                                "\nsensibilidade_spinner : " + String.valueOf(sensibilidade_spinner.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();

            }

        });

    }


    public void Carregacis() {

        setContentView(R.layout.cis);

        Button btretroceder = (Button) findViewById(R.id.btRetroceder);

        btretroceder.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0) {

                Carregaobs();

            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //if (savedInstanceState == null) {
        //    getSupportFragmentManager().beginTransaction()
        //            .add(R.id.container, new PlaceholderFragment())
        //            .commit();
        //}

        Carregaobs();



        this.imageView = (ImageView) findViewById(R.id.imagem);

        // Obt�m o local onde as fotos s�o armazenadas na mem�ria externa do dispositivo
        File picsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);

        // Define o local completo onde a foto ser� armazenada (diret�rio + arquivo)
        this.imageFile = new File(picsDir, "foto.jpg");

    }



    public void takePicture(View v) {
        // Cria uma intent que ser� usada para abrir a aplica��o nativa de c�mera
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        // Indica na intent o local onde a foto tirada deve ser armazenada
        i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(imageFile));

        // Abre a aplica��o de c�mera
        startActivityForResult(i, REQUEST_PICTURE);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // Verifica o c�digo de requisi��o e se o resultado � OK (outro resultado indica que
        // o usu�rio cancelou a tirada da foto)
        if (requestCode == REQUEST_PICTURE && resultCode == RESULT_OK) {

            FileInputStream fis = null;

            try {
                try {
                    // Cria um FileInputStream para ler a foto tirada pela c�mera
                    fis = new FileInputStream(imageFile);

                    // Converte a stream em um objeto Bitmap
                    Bitmap picture = BitmapFactory.decodeStream(fis);

                    // Exibe o bitmap na view, para que o usu�rio veja a foto tirada
                    imageView.setImageBitmap(picture);
                } finally {
                    if (fis != null) {
                        fis.close();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
