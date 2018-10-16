package com.rjha.tic_tac_toe;

        import android.content.DialogInterface;
        import android.content.Intent;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;
        import com.google.android.gms.ads.AdListener;
        import com.google.android.gms.ads.AdRequest;
        import com.google.android.gms.ads.AdView;
        import com.google.android.gms.ads.InterstitialAd;
        import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    AdView mAdView;
    private InterstitialAd interstitialAd;
    int turn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this,"ca-app-pub-8928299189790970/7496783390");
        mAdView=(AdView)findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
//interstial's add
        interstitialAd=new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-8928299189790970/3795720844");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener()
        {
            public void onAdClosed()
            {
               finish();
                System.exit(0);
                System.gc();
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });



        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        turn=1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b1.getText().toString().equals(""))
                {
                    if(turn==1){
                        turn=2;
                        b1.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b1.setText("0");
                    }
                }
                endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b2.getText().toString().equals(""))
                {
                    if(turn==1){
                        turn=2;
                        b2.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b2.setText("0");
                    }
                }
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals(""))
                {
                    if(turn==1){
                        turn=2;
                        b3.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b3.setText("0");
                    }
                }
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals(""))
                {
                    if(turn==1){
                        turn=2;
                        b4.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b4.setText("0");
                    }
                }
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals(""))
                {
                    if(turn==1){
                        turn=2;
                        b5.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b5.setText("0");
                    }
                }
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if(b6.getText().toString().equals(""))
                {
                    if(turn==1){
                        turn=2;
                        b6.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b6.setText("0");
                    }
                }
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals(""))
                {
                    if(turn==1){
                        turn=2;
                        b7.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b7.setText("0");
                    }
                }
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b8.getText().toString().equals(""))
                {
                    if(turn==1){
                        turn=2;
                        b8.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b8.setText("0");
                    }
                }
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(b9.getText().toString().equals(""))
                {
                    if(turn==1){
                        turn=2;
                        b9.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        b9.setText("0");
                    }
                }
                endGame();
            }
        });


    }


    public void endGame()
    {
        String a,b,c,d,e,f,g,h,i;
        boolean end=false;

        a=b1.getText().toString();
        b=b2.getText().toString();
        c=b3.getText().toString();


        d=b4.getText().toString();
        e=b5.getText().toString();
        f=b6.getText().toString();


        g=b7.getText().toString();
        h=b8.getText().toString();
        i=b9.getText().toString();


        if(a.equalsIgnoreCase("x") && b.equalsIgnoreCase("x") && c.equalsIgnoreCase("x"))
        {


            Toast.makeText(this,"Winner Player is X",Toast.LENGTH_SHORT).show();


            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is X");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();

            end=true;
        }

        if(a.equalsIgnoreCase("x") && e.equalsIgnoreCase("x") && i.equalsIgnoreCase("x"))
        {
            Toast.makeText(this,"Winner Player is X",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is X");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    if(interstitialAd.isLoaded()) {
                        interstitialAd.show();
                    }
                    else
                    {
                    finish();
                    System.exit(0);
                    System.gc();
                }}
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }
        if(a.equalsIgnoreCase("x") && d.equalsIgnoreCase("x") && g.equalsIgnoreCase("x"))
        {
            Toast.makeText(this,"Winner Player is X",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is X");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }

        if(b.equalsIgnoreCase("x") && e.equalsIgnoreCase("x") && h.equalsIgnoreCase("x"))
        {
            Toast.makeText(this,"Winner Player is X",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is X");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }
        if(c.equalsIgnoreCase("x") && f.equalsIgnoreCase("x") && i.equalsIgnoreCase("x"))
        {
            Toast.makeText(this,"Winner Player is X",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is X");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }

        if(c.equalsIgnoreCase("x") && e.equalsIgnoreCase("x") && g.equalsIgnoreCase("x"))
        {
            Toast.makeText(this,"Winner Player is X",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is X");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }
        if(d.equalsIgnoreCase("x") && e.equalsIgnoreCase("x") && f.equalsIgnoreCase("x"))
        {
            Toast.makeText(this,"Winner Player is X",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is X");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }

        if(g.equalsIgnoreCase("x") && h.equalsIgnoreCase("x") && i.equalsIgnoreCase("x"))
        {
            Toast.makeText(this,"Winner Player is X",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is X");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }
        //0 win
        if(a.equalsIgnoreCase("0") && b.equalsIgnoreCase("0") && c.equalsIgnoreCase("0"))
        {
            Toast.makeText(this,"Winner Player is 0",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is 0");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }

        if(a.equalsIgnoreCase("0") && e.equalsIgnoreCase("0") && i.equalsIgnoreCase("0"))
        {
            Toast.makeText(this,"Winner Player is 0",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is 0");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }
        if(a.equalsIgnoreCase("0") && d.equalsIgnoreCase("0") && g.equalsIgnoreCase("0"))
        {
            Toast.makeText(this,"Winner Player is 0",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is 0");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }

        if(b.equalsIgnoreCase("0") && e.equalsIgnoreCase("0") && h.equalsIgnoreCase("0"))
        {
            Toast.makeText(this,"Winner Player is 0",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is 0");
            builder.setTitle("Game Over!!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();

                }
            });

            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }
        if(c.equalsIgnoreCase("0") && f.equalsIgnoreCase("0") && i.equalsIgnoreCase("0"))
        {
            Toast.makeText(this,"Winner Player is 0",Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is 0");
            builder.setTitle("Game Over!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();

            alertDialog.isShowing();
            end=true;
        }

        if(c.equalsIgnoreCase("0") && e.equalsIgnoreCase("0") && g.equalsIgnoreCase("0"))
        {
            Toast.makeText(this,"Winner Player is 0",Toast.LENGTH_LONG).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is 0");
            builder.setTitle("Game Over!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }
        if(d.equalsIgnoreCase("0") && e.equalsIgnoreCase("0") && f.equalsIgnoreCase("0"))
        {
            Toast.makeText(this,"Winner Player is 0",Toast.LENGTH_LONG).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Game Over!!");
            builder.setMessage("Winner Player Is 0");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }

        if(g.equalsIgnoreCase("0") && h.equalsIgnoreCase("0") && i.equalsIgnoreCase("0"))
        {
            Toast.makeText(this,"Winner Player is 0",Toast.LENGTH_LONG).show();
            final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Winner Player Is 0");
            builder.setTitle("Game Over!!");
            builder.setCancelable(false);
            builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            builder.setPositiveButton("Replay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    finish();
                    Intent i=new Intent(MainActivity.this,MainActivity.class);
                    startActivity(i);
                }
            });
            AlertDialog alertDialog=builder.create();
            alertDialog.show();
            alertDialog.isShowing();
            end=true;
        }
        if(end)
        {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

        }
    }
    // on back pressed
    @Override
    public void onBackPressed()
    {
        if(interstitialAd.isLoaded()) {
            interstitialAd.show();
        }
        else {
            final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Sure To Exit TIC_TAC_TOE");
            builder.setCancelable(false);
            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();
                    dialog.cancel();
                }
            });
            builder.setPositiveButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                    System.exit(0);
                    System.gc();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            alertDialog.isShowing();
        }
    }
}
