package com.Nasa.Soft.Exzam.Editor35;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import uk.co.senab.photoview.BuildConfig;

public class HomeActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    public double A30 = 0.0d;
    /* access modifiers changed from: private */
    public String Ty_num = BuildConfig.FLAVOR;
    private AppBarLayout _app_bar;
    private CoordinatorLayout _coordinator;
    /* access modifiers changed from: private */
    public DrawerLayout _drawer;
    private ImageView _drawer_imageview1;
    private ImageView _drawer_imageview2;
    private ImageView _drawer_imageview3;
    private ImageView _drawer_imageview4;
    private LinearLayout _drawer_linear1;
    /* access modifiers changed from: private */
    public LinearLayout _drawer_linear3;
    private LinearLayout _drawer_linear4;
    private LinearLayout _drawer_linear5;
    private LinearLayout _drawer_linear6;
    private LinearLayout _drawer_linear7;
    private LinearLayout _drawer_linear9;
    private TextView _drawer_textview1;
    private TextView _drawer_textview2;
    private TextView _drawer_textview3;
    private TextView _drawer_textview4;
    private TextView _drawer_textview5;
    private TextView _drawer_textview6;
    private TextView _drawer_textview7;
    private FloatingActionButton _fab;
    /* access modifiers changed from: private */
    public Timer _timer = new Timer();
    private Toolbar _toolbar;
    /* access modifiers changed from: private */
    public String book = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public Button button1op;
    private Calendar c7 = Calendar.getInstance();
    private Calendar c70 = Calendar.getInstance();
    private SharedPreferences codee;
    /* access modifiers changed from: private */
    public double color = 0.0d;
    /* access modifiers changed from: private */
    public AlertDialog.Builder dialog;
    private ArrayList<String> diaters = new ArrayList<>();
    /* access modifiers changed from: private */
    public EditText edittext1;
    private GridView gridview1;
    /* access modifiers changed from: private */
    public Intent i = new Intent();
    private ImageView imag_chat;
    private ImageView image_password;
    /* access modifiers changed from: private */
    public ImageView imagempety;
    private ImageView imagevi_baek;
    private ImageView imageview18;
    private ImageView imageview19;
    private ImageView imageview20;
    private ImageView imageview21;
    /* access modifiers changed from: private */
    public LinearLayout linea_search;
    /* access modifiers changed from: private */
    public LinearLayout linear10;
    /* access modifiers changed from: private */
    public LinearLayout linear12;
    private LinearLayout linear13;
    /* access modifiers changed from: private */
    public LinearLayout linear17;
    /* access modifiers changed from: private */
    public LinearLayout linear2;
    private LinearLayout linear21;
    /* access modifiers changed from: private */
    public LinearLayout linear3;
    private LinearLayout linear35;
    private LinearLayout linear4;
    private LinearLayout linear5;
    /* access modifiers changed from: private */
    public LinearLayout linear_main;
    private LinearLayout linear_maine;
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> list_map = new ArrayList<>();
    private HashMap<String, Object> map = new HashMap<>();
    private HashMap<String, Object> map_A = new HashMap<>();
    /* access modifiers changed from: private */
    public DatabaseHelper myDb;
    /* access modifiers changed from: private */
    public SharedPreferences pass_word;
    /* access modifiers changed from: private */
    public SharedPreferences save;
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> search_map = new ArrayList<>();
    private TextView textview1;
    private TextView textview16;
    private TextView textview17;
    private TextView textview3;
    /* access modifiers changed from: private */
    public TimerTask timer_5;
    private double tm_difference = 0.0d;
    private double x = 0.0d;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.home);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this._app_bar = (AppBarLayout) findViewById(R.id._app_bar);
        this._coordinator = (CoordinatorLayout) findViewById(R.id._coordinator);
        Toolbar toolbar = (Toolbar) findViewById(R.id._toolbar);
        this._toolbar = toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        this._toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this.onBackPressed();
            }
        });
        this._fab = (FloatingActionButton) findViewById(R.id._fab);
        this._drawer = (DrawerLayout) findViewById(R.id._drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, this._drawer, this._toolbar, R.string.app_name, R.string.app_name);
        this._drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id._nav_view);
        this.linear_maine = (LinearLayout) findViewById(R.id.linear_maine);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.linear17 = (LinearLayout) findViewById(R.id.linear17);
        this.gridview1 = (GridView) findViewById(R.id.gridview1);
        this.textview17 = (TextView) findViewById(R.id.textview17);
        this.linear35 = (LinearLayout) findViewById(R.id.linear35);
        this.linear10 = (LinearLayout) findViewById(R.id.linear10);
        this.linear5 = (LinearLayout) findViewById(R.id.linear5);
        this.linear13 = (LinearLayout) findViewById(R.id.linear13);
        this.linear12 = (LinearLayout) findViewById(R.id.linear12);
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(R.id.linear4);
        this.linear21 = (LinearLayout) findViewById(R.id.linear21);
        this.linear_main = (LinearLayout) findViewById(R.id.linear_main);
        this.linea_search = (LinearLayout) findViewById(R.id.linea_search);
        this.imageview18 = (ImageView) findViewById(R.id.imageview18);
        this.imageview21 = (ImageView) findViewById(R.id.imageview21);
        this.imageview19 = (ImageView) findViewById(R.id.imageview19);
        this.textview16 = (TextView) findViewById(R.id.textview16);
        this.imagevi_baek = (ImageView) findViewById(R.id.imagevi_baek);
        this.edittext1 = (EditText) findViewById(R.id.edittext1);
        this.imagempety = (ImageView) findViewById(R.id.imagempety);
        this.button1op = (Button) findViewById(R.id.button1op);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.image_password = (ImageView) findViewById(R.id.image_password);
        this.imag_chat = (ImageView) findViewById(R.id.imag_chat);
        this.imageview20 = (ImageView) findViewById(R.id.imageview20);
        this.textview3 = (TextView) findViewById(R.id.textview3);
        this._drawer_linear1 = (LinearLayout) linearLayout.findViewById(R.id.linear1);
        this._drawer_linear3 = (LinearLayout) linearLayout.findViewById(R.id.linear3);
        this._drawer_linear4 = (LinearLayout) linearLayout.findViewById(R.id.linear4);
        this._drawer_textview1 = (TextView) linearLayout.findViewById(R.id.textview1);
        this._drawer_imageview1 = (ImageView) linearLayout.findViewById(R.id.imageview1);
        this._drawer_textview3 = (TextView) linearLayout.findViewById(R.id.textview3);
        this._drawer_textview2 = (TextView) linearLayout.findViewById(R.id.textview2);
        this._drawer_textview4 = (TextView) linearLayout.findViewById(R.id.textview4);
        this._drawer_linear5 = (LinearLayout) linearLayout.findViewById(R.id.linear5);
        this._drawer_linear6 = (LinearLayout) linearLayout.findViewById(R.id.linear6);
        this._drawer_linear9 = (LinearLayout) linearLayout.findViewById(R.id.linear9);
        this._drawer_linear7 = (LinearLayout) linearLayout.findViewById(R.id.linear7);
        this._drawer_textview5 = (TextView) linearLayout.findViewById(R.id.textview5);
        this._drawer_imageview2 = (ImageView) linearLayout.findViewById(R.id.imageview2);
        this._drawer_textview6 = (TextView) linearLayout.findViewById(R.id.textview6);
        this._drawer_imageview3 = (ImageView) linearLayout.findViewById(R.id.imageview3);
        this._drawer_imageview4 = (ImageView) linearLayout.findViewById(R.id.imageview4);
        this._drawer_textview7 = (TextView) linearLayout.findViewById(R.id.textview7);
        this.save = getSharedPreferences("save", 0);
        this.dialog = new AlertDialog.Builder(this);
        this.pass_word = getSharedPreferences("pass_word", 0);
        this.codee = getSharedPreferences("codee", 0);
        this.textview17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(HomeActivity.this.getApplicationContext(), CejelsActivity.class);
                HomeActivity.this.startActivity(intent);
                HomeActivity.this.finish();
            }
        });
        this.imageview18.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                SketchwareUtil.showMessage(HomeActivity.this.getApplicationContext(), String.valueOf((long) HomeActivity.this.color));
                HomeActivity homeActivity = HomeActivity.this;
                homeActivity.getApplicationContext();
                ((ClipboardManager) homeActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("clipboard", String.valueOf((long) HomeActivity.this.color)));
                return true;
            }
        });
        this.imageview21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (HomeActivity.this._drawer.isDrawerOpen((int) GravityCompat.START)) {
                    HomeActivity.this._drawer.closeDrawer((int) GravityCompat.START);
                } else {
                    HomeActivity.this._drawer.openDrawer((int) GravityCompat.START);
                }
            }
        });
        this.image_password.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        this.imag_chat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this.i.setAction("android.intent.action.VIEW");
                HomeActivity.this.i.setData(Uri.parse("https://chat.whatsapp.com/ILuuglhrYPkJ1zn6687dja"));
                HomeActivity homeActivity = HomeActivity.this;
                homeActivity.startActivity(homeActivity.i);
            }
        });
        this._fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity homeActivity = HomeActivity.this;
                homeActivity._dialog_(0.0d, "A", homeActivity.list_map);
            }
        });
        this._drawer_linear1.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                return true;
            }
        });
        this._drawer_linear1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        this._drawer_linear5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this.i.setAction("android.intent.action.VIEW");
                HomeActivity.this.i.setData(Uri.parse("https://t.me/Nasa_Soft_Android_n2024"));
                HomeActivity homeActivity = HomeActivity.this;
                homeActivity.startActivity(homeActivity.i);
            }
        });
        this._drawer_linear6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this.i.setAction("android.intent.action.VIEW");
                HomeActivity.this.i.setData(Uri.parse("https://chat.whatsapp.com/CUp4loRJEPiHzfMBpWXqCg"));
                HomeActivity homeActivity = HomeActivity.this;
                homeActivity.startActivity(homeActivity.i);
            }
        });
        this._drawer_linear7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this.i.setAction("android.intent.action.VIEW");
                HomeActivity.this.i.setData(Uri.parse("https://wa.me/967772666391"));
                HomeActivity homeActivity = HomeActivity.this;
                homeActivity.startActivity(homeActivity.i);
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|4|(1:6)|7|8|9|12|13|14|15|16|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void initializeLogic() {
        /*
            r7 = this;
            java.lang.String r0 = "B500"
            java.lang.String r1 = "fonts/exzam_bold.ttf"
            com.Nasa.Soft.Exzam.Editor35.DatabaseHelper r2 = new com.Nasa.Soft.Exzam.Editor35.DatabaseHelper
            r2.<init>(r7)
            r7.myDb = r2
            androidx.appcompat.app.ActionBar r2 = r7.getSupportActionBar()     // Catch:{ Exception -> 0x0013 }
            r2.hide()     // Catch:{ Exception -> 0x0013 }
            goto L_0x0014
        L_0x0013:
        L_0x0014:
            android.content.SharedPreferences r2 = r7.save
            java.lang.String r3 = "nu9"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0033
            android.content.SharedPreferences r2 = r7.save
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r5 = "2"
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r5)
            r2.commit()
        L_0x0033:
            r7._set_chiq_screen1200()
            android.content.SharedPreferences r2 = r7.save     // Catch:{ Exception -> 0x0043 }
            java.lang.String r2 = r2.getString(r0, r4)     // Catch:{ Exception -> 0x0043 }
            double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x0043 }
            r7.color = r2     // Catch:{ Exception -> 0x0043 }
            goto L_0x005b
        L_0x0043:
            r2 = -14352129(0xffffffffff2500ff, float:-2.193278E38)
            android.content.SharedPreferences r3 = r7.save
            android.content.SharedPreferences$Editor r3 = r3.edit()
            long r5 = (long) r2
            java.lang.String r5 = java.lang.String.valueOf(r5)
            android.content.SharedPreferences$Editor r0 = r3.putString(r0, r5)
            r0.commit()
            double r2 = (double) r2
            r7.color = r2
        L_0x005b:
            r7._shaql_90()
            r7._on_click()
            r7._star_A()
            android.content.SharedPreferences r0 = r7.save
            java.lang.String r2 = "yyt667"
            java.lang.String r0 = r0.getString(r2, r4)
            r0.equals(r4)
            android.widget.TextView r0 = r7.textview3     // Catch:{ Exception -> 0x007d }
            r2 = 1082130432(0x40800000, float:4.0)
            java.lang.String r3 = "#FF000000"
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x007d }
            r4 = 0
            r0.setShadowLayer(r2, r4, r4, r3)     // Catch:{ Exception -> 0x007d }
        L_0x007d:
            android.widget.TextView r0 = r7._drawer_textview7     // Catch:{ Exception -> 0x00fe }
            android.content.res.AssetManager r2 = r7.getAssets()     // Catch:{ Exception -> 0x00fe }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x00fe }
            r3 = 1
            r0.setTypeface(r2, r3)     // Catch:{ Exception -> 0x00fe }
            android.widget.TextView r0 = r7._drawer_textview1     // Catch:{ Exception -> 0x00fe }
            android.content.res.AssetManager r2 = r7.getAssets()     // Catch:{ Exception -> 0x00fe }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x00fe }
            r0.setTypeface(r2, r3)     // Catch:{ Exception -> 0x00fe }
            android.widget.TextView r0 = r7._drawer_textview2     // Catch:{ Exception -> 0x00fe }
            android.content.res.AssetManager r2 = r7.getAssets()     // Catch:{ Exception -> 0x00fe }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x00fe }
            r0.setTypeface(r2, r3)     // Catch:{ Exception -> 0x00fe }
            android.widget.TextView r0 = r7._drawer_textview3     // Catch:{ Exception -> 0x00fe }
            android.content.res.AssetManager r2 = r7.getAssets()     // Catch:{ Exception -> 0x00fe }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x00fe }
            r0.setTypeface(r2, r3)     // Catch:{ Exception -> 0x00fe }
            android.widget.TextView r0 = r7._drawer_textview4     // Catch:{ Exception -> 0x00fe }
            android.content.res.AssetManager r2 = r7.getAssets()     // Catch:{ Exception -> 0x00fe }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x00fe }
            r0.setTypeface(r2, r3)     // Catch:{ Exception -> 0x00fe }
            android.widget.TextView r0 = r7._drawer_textview5     // Catch:{ Exception -> 0x00fe }
            android.content.res.AssetManager r2 = r7.getAssets()     // Catch:{ Exception -> 0x00fe }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x00fe }
            r0.setTypeface(r2, r3)     // Catch:{ Exception -> 0x00fe }
            android.widget.TextView r0 = r7._drawer_textview6     // Catch:{ Exception -> 0x00fe }
            android.content.res.AssetManager r2 = r7.getAssets()     // Catch:{ Exception -> 0x00fe }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x00fe }
            r0.setTypeface(r1, r3)     // Catch:{ Exception -> 0x00fe }
            android.widget.TextView r0 = r7._drawer_textview4     // Catch:{ Exception -> 0x00fe }
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$13 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$13     // Catch:{ Exception -> 0x00fe }
            r1.<init>()     // Catch:{ Exception -> 0x00fe }
            r2 = 80
            r3 = 4
            r4 = -1
            r5 = 0
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r3, r4, r5)     // Catch:{ Exception -> 0x00fe }
            r0.setBackground(r1)     // Catch:{ Exception -> 0x00fe }
            android.widget.LinearLayout r0 = r7._drawer_linear3     // Catch:{ Exception -> 0x00fe }
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$14 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$14     // Catch:{ Exception -> 0x00fe }
            r1.<init>()     // Catch:{ Exception -> 0x00fe }
            double r2 = r7.color     // Catch:{ Exception -> 0x00fe }
            int r4 = (int) r2     // Catch:{ Exception -> 0x00fe }
            int r2 = (int) r2     // Catch:{ Exception -> 0x00fe }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r5, r5, r4, r2)     // Catch:{ Exception -> 0x00fe }
            r0.setBackground(r1)     // Catch:{ Exception -> 0x00fe }
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.HomeActivity.initializeLogic():void");
    }

    public void onBackPressed() {
        if (this._drawer.isDrawerOpen((int) GravityCompat.START)) {
            this._drawer.closeDrawer((int) GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public void _star_A() {
        try {
            this.list_map.clear();
            this.diaters.clear();
        } catch (Exception unused) {
        }
        Cursor allData = this.myDb.getAllData("Tuall");
        if (allData.getCount() != 0) {
            while (allData.moveToNext()) {
                if (!this.diaters.contains(allData.getString(0))) {
                    this.diaters.add(allData.getString(0));
                }
                HashMap<String, Object> hashMap = new HashMap<>();
                this.map_A = hashMap;
                hashMap.put("0", allData.getString(0));
                try {
                    this.map_A.put("1", allData.getString(1));
                } catch (Exception unused2) {
                    this.map_A.put("1", BuildConfig.FLAVOR);
                }
                try {
                    this.map_A.put("2", allData.getString(2));
                } catch (Exception unused3) {
                    this.map_A.put("2", BuildConfig.FLAVOR);
                }
                try {
                    this.map_A.put("3", allData.getString(3));
                } catch (Exception unused4) {
                    this.map_A.put("3", BuildConfig.FLAVOR);
                }
                this.list_map.add(this.map_A);
            }
            Collections.reverse(this.list_map);
            try {
                this.gridview1.setNumColumns((int) Double.parseDouble(this.save.getString("nu9", BuildConfig.FLAVOR)));
                this.gridview1.setColumnWidth(2);
                this.gridview1.setVerticalSpacing(8);
                this.gridview1.setHorizontalSpacing(8);
            } catch (Exception unused5) {
                this.gridview1.setColumnWidth(2);
                this.gridview1.setVerticalSpacing(8);
                this.gridview1.setHorizontalSpacing(8);
            }
            this.gridview1.setAdapter(new Gridview1Adapter(this.list_map));
            this.button1op.setText("اجمالي عدد  = 0".replace("0", String.valueOf((long) this.list_map.size())));
        }
    }

    public void _shaql_90() {
        int i2;
        try {
            this.textview1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.button1op.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview16.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview17.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        } catch (Exception unused) {
        }
        this.linea_search.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -6381922, -1));
        this.textview17.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -6381922, -1));
        this.linea_search.setVisibility(8);
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i3 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
        gradientDrawable.setColor(-657931);
        float f = (float) (i3 * 360);
        float f2 = (float) (i3 * 0);
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f2, f2, f2, f2});
        this.linear4.setElevation((float) (i3 * 1));
        this.linear4.setBackground(gradientDrawable);
        try {
            this.color = Double.parseDouble(this.save.getString("B500", BuildConfig.FLAVOR));
            LinearLayout linearLayout = this._drawer_linear3;
            AnonymousClass17 r6 = new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            };
            double d = this.color;
            linearLayout.setBackground(r6.getIns(0, 0, (int) d, (int) d));
            if (Build.VERSION.SDK_INT > 19) {
                Window window = getWindow();
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor((int) this.color);
            }
            this.linear2.setBackgroundColor((int) this.color);
            this.linear3.setBackgroundColor((int) this.color);
            this.linear17.setBackgroundColor((int) this.color);
            this.linear10.setBackgroundColor((int) this.color);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            int i4 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
            gradientDrawable2.setColor((int) this.color);
            float f3 = (float) (i4 * 360);
            float f4 = (float) (i4 * 0);
            gradientDrawable2.setCornerRadii(new float[]{f3, f3, f3, f3, f4, f4, f4, f4});
            this.linear12.setElevation((float) (i4 * 1));
            this.linear12.setBackground(gradientDrawable2);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            int i5 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
            gradientDrawable3.setColor((int) this.color);
            float f5 = (float) (i5 * 360);
            float f6 = (float) (i5 * 0);
            float f7 = f6;
            gradientDrawable3.setCornerRadii(new float[]{f5, f5, f6, f6, f5, f5, f7, f7});
            this.button1op.setElevation((float) (i5 * 1));
            this.button1op.setBackground(gradientDrawable3);
            i2 = 20;
        } catch (Exception unused2) {
            if (Build.VERSION.SDK_INT > 19) {
                Window window2 = getWindow();
                window2.clearFlags(67108864);
                window2.addFlags(Integer.MIN_VALUE);
                window2.setStatusBarColor(-16537100);
            }
            this.linear2.setBackgroundColor(-1499549);
            this.linear3.setBackgroundColor(-1499549);
            this.linear17.setBackgroundColor(-1499549);
            this.linear10.setBackgroundColor(-1499549);
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            int i6 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
            gradientDrawable4.setColor(-1499549);
            float f8 = (float) (i6 * 360);
            float f9 = (float) (i6 * 0);
            gradientDrawable4.setCornerRadii(new float[]{f8, f8, f8, f8, f9, f9, f9, f9});
            this.linear12.setElevation((float) (i6 * 1));
            this.linear12.setBackground(gradientDrawable4);
            GradientDrawable gradientDrawable5 = new GradientDrawable();
            int i7 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
            gradientDrawable5.setColor(-2614432);
            float f10 = (float) (i7 * 360);
            float f11 = (float) (i7 * 0);
            gradientDrawable5.setCornerRadii(new float[]{f10, f10, f11, f11, f10, f10, f11, f11});
            this.button1op.setElevation((float) (i7 * 1));
            this.button1op.setBackground(gradientDrawable5);
            i2 = 20;
            this.imagevi_baek.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(20, 2, -6381922, ViewCompat.MEASURED_STATE_MASK));
            this.imageview19.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(20, 2, -6381922, ViewCompat.MEASURED_STATE_MASK));
        }
        this.textview16.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(i2, 2, ViewCompat.MEASURED_STATE_MASK, -1));
    }

    public void _searh_about(String str, ArrayList<HashMap<String, Object>> arrayList, ArrayList<HashMap<String, Object>> arrayList2) {
        this.search_map.clear();
        if (!str.equals(BuildConfig.FLAVOR)) {
            int i2 = 0;
            while (i2 < arrayList.size()) {
                try {
                    if (arrayList.get(i2).get("1").toString().contains(str) || arrayList.get(i2).get("2").toString().contains(str) || arrayList.get(i2).get("3").toString().contains(str)) {
                        HashMap<String, Object> hashMap = arrayList.get(i2);
                        this.map = hashMap;
                        this.search_map.add(hashMap);
                    }
                    i2++;
                } catch (Exception unused) {
                    return;
                }
            }
            this.gridview1.setAdapter(new Gridview1Adapter(this.search_map));
            this.button1op.setText("عدد النتائج = 0".replace("0", String.valueOf((long) this.search_map.size())));
            return;
        }
        this.button1op.setText("عدد المستندات = 0".replace("0", String.valueOf((long) arrayList.size())));
        this.gridview1.setAdapter(new Gridview1Adapter(arrayList));
    }

    public void _on_click() {
        this.imagevi_baek.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this.linear_main.setVisibility(0);
                HomeActivity.this.edittext1.setText(BuildConfig.FLAVOR);
                HomeActivity.this.linea_search.setVisibility(8);
                HomeActivity.this.imagempety.setVisibility(8);
                HomeActivity.this.timer_5 = new TimerTask() {
                    public void run() {
                        HomeActivity.this.runOnUiThread(new Runnable() {
                            public void run() {
                                HomeActivity.this.edittext1.requestFocus();
                                HomeActivity.this.edittext1.setShowSoftInputOnFocus(false);
                                HomeActivity.this.edittext1.setEnabled(false);
                            }
                        });
                    }
                };
                HomeActivity.this._timer.schedule(HomeActivity.this.timer_5, 50);
            }
        });
        this.imageview19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this.linear_main.setVisibility(8);
                HomeActivity.this.linea_search.setVisibility(0);
                HomeActivity.this.imagempety.setVisibility(8);
                HomeActivity.this.edittext1.setEnabled(true);
                HomeActivity.this.timer_5 = new TimerTask() {
                    public void run() {
                        HomeActivity.this.runOnUiThread(new Runnable() {
                            public void run() {
                                HomeActivity.this.edittext1.setEnabled(true);
                                HomeActivity.this.edittext1.requestFocus();
                                ((InputMethodManager) HomeActivity.this.getSystemService("input_method")).showSoftInput(HomeActivity.this.edittext1, 1);
                                HomeActivity.this.edittext1.setSelection(HomeActivity.this.edittext1.getText().toString().length(), HomeActivity.this.edittext1.getText().toString().length());
                                try {
                                    HomeActivity.this.edittext1.setSelection(HomeActivity.this.edittext1.getText().toString().length(), HomeActivity.this.edittext1.getText().toString().length());
                                } catch (Exception unused) {
                                }
                            }
                        });
                    }
                };
                HomeActivity.this._timer.schedule(HomeActivity.this.timer_5, 50);
            }
        });
        this.imagempety.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this.edittext1.setText(BuildConfig.FLAVOR);
                HomeActivity.this.imagempety.setVisibility(8);
                HomeActivity.this.timer_5 = new TimerTask() {
                    public void run() {
                        HomeActivity.this.runOnUiThread(new Runnable() {
                            public void run() {
                                HomeActivity.this.edittext1.setEnabled(true);
                                HomeActivity.this.edittext1.requestFocus();
                                ((InputMethodManager) HomeActivity.this.getSystemService("input_method")).showSoftInput(HomeActivity.this.edittext1, 1);
                                HomeActivity.this.edittext1.setSelection(HomeActivity.this.edittext1.getText().toString().length(), HomeActivity.this.edittext1.getText().toString().length());
                                try {
                                    HomeActivity.this.edittext1.setSelection(HomeActivity.this.edittext1.getText().toString().length(), HomeActivity.this.edittext1.getText().toString().length());
                                } catch (Exception unused) {
                                }
                            }
                        });
                    }
                };
                HomeActivity.this._timer.schedule(HomeActivity.this.timer_5, 50);
            }
        });
        this.edittext1.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String charSequence2 = charSequence.toString();
                if (charSequence2.equals(BuildConfig.FLAVOR)) {
                    HomeActivity.this.imagempety.setVisibility(8);
                } else {
                    HomeActivity.this.imagempety.setVisibility(0);
                }
                HomeActivity homeActivity = HomeActivity.this;
                homeActivity._searh_about(charSequence2, homeActivity.list_map, HomeActivity.this.search_map);
            }
        });
        this.image_password.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this._creat_new_password();
            }
        });
        this.imageview18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity homeActivity = HomeActivity.this;
                new ColorPickerDialog(homeActivity, new UpdateColor_1(), -14352129).show();
            }
        });
        this.imageview20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this._dialog_set(0.0d, 0.0d, 0.0d);
            }
        });
    }

    public class UpdateColor_1 implements ColorPickerDialog.OnColorChangedListener {
        public UpdateColor_1() {
        }

        public void colorChanged(int i) {
            if (Build.VERSION.SDK_INT > 19) {
                Window window = HomeActivity.this.getWindow();
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(i);
            }
            HomeActivity.this.linear2.setBackgroundColor(i);
            HomeActivity.this.linear3.setBackgroundColor(i);
            HomeActivity.this.linear17.setBackgroundColor(i);
            HomeActivity.this.linear10.setBackgroundColor(i);
            HomeActivity.this.save.edit().putString("B500", String.valueOf((long) i)).commit();
            HomeActivity.this._drawer_linear3.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(0, 0, i, i));
            HomeActivity.this.i.setClass(HomeActivity.this.getApplicationContext(), HomeActivity.class);
            HomeActivity.this.i.setFlags(67108864);
            HomeActivity homeActivity = HomeActivity.this;
            homeActivity.startActivity(homeActivity.i);
            HomeActivity.this.finish();
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i2 = (int) HomeActivity.this.getApplicationContext().getResources().getDisplayMetrics().density;
            gradientDrawable.setColor(i);
            float f = (float) (i2 * 360);
            float f2 = (float) (i2 * 0);
            gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f2, f2, f2, f2});
            HomeActivity.this.linear12.setElevation((float) (i2 * 1));
            HomeActivity.this.linear12.setBackground(gradientDrawable);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            int i3 = (int) HomeActivity.this.getApplicationContext().getResources().getDisplayMetrics().density;
            gradientDrawable2.setColor(i);
            float f3 = (float) (i3 * 360);
            float f4 = (float) (i3 * 0);
            gradientDrawable2.setCornerRadii(new float[]{f3, f3, f4, f4, f3, f3, f4, f4});
            HomeActivity.this.button1op.setElevation((float) (i3 * 1));
            HomeActivity.this.button1op.setBackground(gradientDrawable2);
        }
    }

    public static class ColorPickerDialog extends Dialog {
        private int mInitialColor;
        /* access modifiers changed from: private */
        public OnColorChangedListener mListener;

        public interface OnColorChangedListener {
            void colorChanged(int i);
        }

        private static class ColorPickerView extends View {
            private static final float PI = 3.1415925f;
            private int CENTER_RADIUS = dpToPx(40);
            private int CENTER_X = dpToPx(132);
            private int CENTER_Y = dpToPx(132);
            private Paint mCenterPaint;
            private final int[] mColors;
            private boolean mHighlightCenter;
            private OnColorChangedListener mListener;
            private Paint mPaint;
            private boolean mTrackingCenter;

            private int pinToByte(int i) {
                if (i < 0) {
                    return 0;
                }
                if (i > 255) {
                    return 255;
                }
                return i;
            }

            ColorPickerView(Context context, OnColorChangedListener onColorChangedListener, int i) {
                super(context);
                this.mListener = onColorChangedListener;
                int[] iArr = {-1, -65281, -16776961, -16711681, -16711936, InputDeviceCompat.SOURCE_ANY, SupportMenu.CATEGORY_MASK, ViewCompat.MEASURED_STATE_MASK, -1};
                this.mColors = iArr;
                SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, iArr, (float[]) null);
                Paint paint = new Paint(1);
                this.mPaint = paint;
                paint.setShader(sweepGradient);
                this.mPaint.setStyle(Paint.Style.STROKE);
                this.mPaint.setStrokeWidth((float) dpToPx(64));
                Paint paint2 = new Paint(1);
                this.mCenterPaint = paint2;
                paint2.setColor(i);
                this.mCenterPaint.setStrokeWidth(5.0f);
            }

            /* access modifiers changed from: protected */
            public void onDraw(Canvas canvas) {
                float strokeWidth = ((float) this.CENTER_X) - (this.mPaint.getStrokeWidth() * 0.5f);
                int i = this.CENTER_X;
                canvas.translate((float) i, (float) i);
                float f = -strokeWidth;
                canvas.drawOval(new RectF(f, f, strokeWidth, strokeWidth), this.mPaint);
                canvas.drawCircle(0.0f, 0.0f, (float) this.CENTER_RADIUS, this.mCenterPaint);
                if (this.mTrackingCenter) {
                    int color = this.mCenterPaint.getColor();
                    this.mCenterPaint.setStyle(Paint.Style.STROKE);
                    if (this.mHighlightCenter) {
                        this.mCenterPaint.setAlpha(255);
                    } else {
                        this.mCenterPaint.setAlpha(128);
                    }
                    canvas.drawCircle(0.0f, 0.0f, ((float) this.CENTER_RADIUS) + this.mCenterPaint.getStrokeWidth(), this.mCenterPaint);
                    this.mCenterPaint.setStyle(Paint.Style.FILL);
                    this.mCenterPaint.setColor(color);
                }
            }

            /* access modifiers changed from: protected */
            public void onMeasure(int i, int i2) {
                setMeasuredDimension(this.CENTER_X * 2, this.CENTER_Y * 2);
            }

            private int floatToByte(float f) {
                return Math.round(f);
            }

            private int dpToPx(int i) {
                return Math.round(((float) i) * (getContext().getResources().getDisplayMetrics().xdpi / 160.0f));
            }

            private int ave(int i, int i2, float f) {
                return i + Math.round(f * ((float) (i2 - i)));
            }

            private int interpColor(int[] iArr, float f) {
                if (f <= 0.0f) {
                    return iArr[0];
                }
                if (f >= 1.0f) {
                    return iArr[iArr.length - 1];
                }
                float length = f * ((float) (iArr.length - 1));
                int i = (int) length;
                float f2 = length - ((float) i);
                int i2 = iArr[i];
                int i3 = iArr[i + 1];
                return Color.argb(ave(Color.alpha(i2), Color.alpha(i3), f2), ave(Color.red(i2), Color.red(i3), f2), ave(Color.green(i2), Color.green(i3), f2), ave(Color.blue(i2), Color.blue(i3), f2));
            }

            private int rotateColor(int i, float f) {
                int red = Color.red(i);
                int green = Color.green(i);
                int blue = Color.blue(i);
                ColorMatrix colorMatrix = new ColorMatrix();
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix.setRGB2YUV();
                colorMatrix2.setRotate(0, (f * 180.0f) / 3.1415927f);
                colorMatrix.postConcat(colorMatrix2);
                colorMatrix2.setYUV2RGB();
                colorMatrix.postConcat(colorMatrix2);
                float[] array = colorMatrix.getArray();
                float f2 = (float) red;
                float f3 = (float) green;
                float f4 = (float) blue;
                return Color.argb(Color.alpha(i), pinToByte(floatToByte((array[0] * f2) + (array[1] * f3) + (array[2] * f4))), pinToByte(floatToByte((array[5] * f2) + (array[6] * f3) + (array[7] * f4))), pinToByte(floatToByte((array[10] * f2) + (array[11] * f3) + (array[12] * f4))));
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
                if (r12 != 2) goto L_0x007c;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean onTouchEvent(android.view.MotionEvent r12) {
                /*
                    r11 = this;
                    float r0 = r12.getX()
                    int r1 = r11.CENTER_X
                    float r1 = (float) r1
                    float r0 = r0 - r1
                    float r1 = r12.getY()
                    int r2 = r11.CENTER_Y
                    float r2 = (float) r2
                    float r1 = r1 - r2
                    double r2 = (double) r0
                    double r0 = (double) r1
                    double r4 = java.lang.Math.hypot(r2, r0)
                    int r6 = r11.CENTER_RADIUS
                    double r6 = (double) r6
                    r8 = 0
                    r9 = 1
                    int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r10 > 0) goto L_0x0021
                    r4 = 1
                    goto L_0x0022
                L_0x0021:
                    r4 = 0
                L_0x0022:
                    int r12 = r12.getAction()
                    if (r12 == 0) goto L_0x0045
                    if (r12 == r9) goto L_0x002e
                    r5 = 2
                    if (r12 == r5) goto L_0x004f
                    goto L_0x007c
                L_0x002e:
                    boolean r12 = r11.mTrackingCenter
                    if (r12 == 0) goto L_0x007c
                    if (r4 == 0) goto L_0x003f
                    com.Nasa.Soft.Exzam.Editor35.HomeActivity$ColorPickerDialog$OnColorChangedListener r12 = r11.mListener
                    android.graphics.Paint r0 = r11.mCenterPaint
                    int r0 = r0.getColor()
                    r12.colorChanged(r0)
                L_0x003f:
                    r11.mTrackingCenter = r8
                    r11.invalidate()
                    goto L_0x007c
                L_0x0045:
                    r11.mTrackingCenter = r4
                    if (r4 == 0) goto L_0x004f
                    r11.mHighlightCenter = r9
                    r11.invalidate()
                    goto L_0x007c
                L_0x004f:
                    boolean r12 = r11.mTrackingCenter
                    if (r12 == 0) goto L_0x005d
                    boolean r12 = r11.mHighlightCenter
                    if (r12 == r4) goto L_0x007c
                    r11.mHighlightCenter = r4
                    r11.invalidate()
                    goto L_0x007c
                L_0x005d:
                    double r0 = java.lang.Math.atan2(r0, r2)
                    float r12 = (float) r0
                    r0 = 1086918618(0x40c90fda, float:6.283185)
                    float r12 = r12 / r0
                    r0 = 0
                    int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L_0x006e
                    r0 = 1065353216(0x3f800000, float:1.0)
                    float r12 = r12 + r0
                L_0x006e:
                    android.graphics.Paint r0 = r11.mCenterPaint
                    int[] r1 = r11.mColors
                    int r12 = r11.interpColor(r1, r12)
                    r0.setColor(r12)
                    r11.invalidate()
                L_0x007c:
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.HomeActivity.ColorPickerDialog.ColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
            }
        }

        public ColorPickerDialog(Context context, OnColorChangedListener onColorChangedListener, int i) {
            super(context);
            this.mListener = onColorChangedListener;
            this.mInitialColor = i;
        }

        /* access modifiers changed from: protected */
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(new ColorPickerView(getContext(), new OnColorChangedListener() {
                public void colorChanged(int i) {
                    ColorPickerDialog.this.mListener.colorChanged(i);
                    ColorPickerDialog.this.dismiss();
                }
            }, this.mInitialColor));
            getWindow().setBackgroundDrawableResource(17170445);
        }
    }

    public void _set_chiq_screen1200() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        this.A30 = (double) displayMetrics.widthPixels;
    }

    public void _txt_ground(TextView textView, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i3 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
        gradientDrawable.setColor(i2);
        float f = (float) i3;
        gradientDrawable.setCornerRadii(new float[]{Float.parseFloat(String.valueOf(13)) * f, Float.parseFloat(String.valueOf(13)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(13)) * f, Float.parseFloat(String.valueOf(13)) * f, Float.parseFloat(String.valueOf(0)) * f, f * Float.parseFloat(String.valueOf(0))});
        gradientDrawable.setStroke(i3 * 1, i2);
        textView.setElevation((float) (i3 * 4));
        textView.setBackground(gradientDrawable);
    }

    public void _creat_new_password() {
        AlertDialog create = new AlertDialog.Builder(this).create();
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout2.setPadding(8, 8, 8, 8);
        linearLayout2.setBackgroundColor(-1);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(getApplicationContext());
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout3.setBackgroundColor(-1);
        linearLayout3.setGravity(17);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout4.setPadding(4, 4, 4, 4);
        linearLayout4.setBackgroundColor(-6381922);
        linearLayout4.setGravity(17);
        linearLayout3.addView(linearLayout4);
        TextView textView = new TextView(getApplicationContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, 100, 0.0f));
        textView.setPadding(4, 4, 4, 4);
        textView.setText("تغير كلمه المرور");
        textView.setTextSize(18.0f);
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        linearLayout4.addView(textView);
        LinearLayout linearLayout5 = new LinearLayout(getApplicationContext());
        linearLayout5.setOrientation(0);
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout5.setPadding(1, 1, 1, 1);
        linearLayout5.setBackgroundColor(-1);
        linearLayout3.addView(linearLayout5);
        final EditText editText = new EditText(getApplicationContext());
        editText.setLayoutParams(new LinearLayout.LayoutParams(-2, 100, 1.0f));
        editText.setTextSize(18.0f);
        editText.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        editText.setGravity(17);
        linearLayout5.addView(editText);
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(100, 100, 1.0f));
        textView2.setPadding(2, 2, 2, 2);
        textView2.setBackgroundColor(-657931);
        textView2.setText("كلمة المرور القديمه");
        textView2.setTextSize(12.0f);
        textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView2.setGravity(17);
        linearLayout5.addView(textView2);
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        linearLayout6.setOrientation(0);
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout6.setPadding(1, 1, 1, 1);
        linearLayout6.setBackgroundColor(-1);
        linearLayout6.setGravity(17);
        linearLayout3.addView(linearLayout6);
        final EditText editText2 = new EditText(getApplicationContext());
        LinearLayout linearLayout7 = linearLayout;
        editText2.setLayoutParams(new LinearLayout.LayoutParams(-2, 100, 1.0f));
        editText2.setTextSize(18.0f);
        editText2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        editText2.setGravity(17);
        linearLayout6.addView(editText2);
        TextView textView3 = new TextView(getApplicationContext());
        textView3.setLayoutParams(new LinearLayout.LayoutParams(100, 100, 1.0f));
        textView3.setPadding(2, 2, 2, 2);
        textView3.setBackgroundColor(-657931);
        textView3.setText("كلمة المرور الجديده");
        textView3.setTextSize(12.0f);
        textView3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView3.setGravity(17);
        linearLayout6.addView(textView3);
        LinearLayout linearLayout8 = new LinearLayout(getApplicationContext());
        linearLayout8.setOrientation(0);
        LinearLayout linearLayout9 = linearLayout2;
        TextView textView4 = textView3;
        linearLayout8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout8.setBackgroundColor(-1);
        linearLayout3.addView(linearLayout8);
        EditText editText3 = new EditText(getApplicationContext());
        TextView textView5 = textView2;
        editText3.setLayoutParams(new LinearLayout.LayoutParams(-2, 100, 1.0f));
        editText3.setTextSize(18.0f);
        editText3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        editText3.setGravity(17);
        linearLayout8.addView(editText3);
        TextView textView6 = new TextView(getApplicationContext());
        textView6.setLayoutParams(new LinearLayout.LayoutParams(100, 100, 1.0f));
        textView6.setBackgroundColor(-657931);
        textView6.setText("تاكيد كلمة المرور");
        textView6.setTextSize(12.0f);
        textView6.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView6.setGravity(17);
        linearLayout8.addView(textView6);
        LinearLayout linearLayout10 = new LinearLayout(getApplicationContext());
        linearLayout10.setOrientation(0);
        String str = "fonts/font.ttf";
        TextView textView7 = textView6;
        linearLayout10.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout10.setPadding(4, 4, 4, 4);
        linearLayout10.setBackgroundColor(-6381922);
        linearLayout10.setGravity(17);
        linearLayout3.addView(linearLayout10);
        TextView textView8 = new TextView(getApplicationContext());
        AlertDialog alertDialog = create;
        textView8.setLayoutParams(new LinearLayout.LayoutParams(210, 80, 1.0f));
        textView8.setPadding(4, 4, 4, 4);
        textView8.setBackgroundColor(-1118482);
        textView8.setText("إلغاء");
        textView8.setTextSize(18.0f);
        textView8.setTextColor(-1499549);
        textView8.setGravity(17);
        linearLayout10.addView(textView8);
        TextView textView9 = new TextView(getApplicationContext());
        LinearLayout linearLayout11 = linearLayout4;
        textView9.setLayoutParams(new LinearLayout.LayoutParams(210, 80, 1.0f));
        textView9.setPadding(4, 4, 4, 4);
        textView9.setBackgroundColor(-1118482);
        textView9.setText("حفظ");
        textView9.setTextSize(18.0f);
        textView9.setTextColor(-14983648);
        textView9.setGravity(17);
        linearLayout10.addView(textView9);
        if (this.pass_word.getString("pass_word", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            linearLayout5.setVisibility(8);
            textView.setText("إعداد كلمه مرور");
            AnonymousClass28 r4 = new TimerTask() {
                public void run() {
                    HomeActivity homeActivity = HomeActivity.this;
                    final EditText editText = editText2;
                    homeActivity.runOnUiThread(new Runnable() {
                        public void run() {
                            editText.setEnabled(true);
                            editText.requestFocus();
                            ((InputMethodManager) HomeActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                            EditText editText = editText;
                            editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                        }
                    });
                }
            };
            this.timer_5 = r4;
            this._timer.schedule(r4, 50);
        } else {
            AnonymousClass29 r42 = new TimerTask() {
                public void run() {
                    HomeActivity homeActivity = HomeActivity.this;
                    final EditText editText = editText;
                    homeActivity.runOnUiThread(new Runnable() {
                        public void run() {
                            editText.setEnabled(true);
                            editText.requestFocus();
                            ((InputMethodManager) HomeActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                            EditText editText = editText;
                            editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                        }
                    });
                }
            };
            this.timer_5 = r42;
            this._timer.schedule(r42, 50);
        }
        editText3.setTextIsSelectable(true);
        editText.setTextIsSelectable(true);
        TextView textView10 = textView;
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(8, 1, -6381922, -1));
        linearLayout6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(8, 1, -6381922, -1));
        linearLayout8.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(8, 1, -6381922, -1));
        textView9.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(88, 1, ViewCompat.MEASURED_STATE_MASK, -1));
        textView8.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(360, 1, ViewCompat.MEASURED_STATE_MASK, -1));
        linearLayout3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 2, ViewCompat.MEASURED_STATE_MASK, -1));
        linearLayout11.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout10.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        editText2.setInputType(12290);
        editText.setInputType(12290);
        editText3.setInputType(12290);
        LinearLayout linearLayout12 = linearLayout5;
        final EditText editText4 = editText;
        LinearLayout linearLayout13 = linearLayout8;
        EditText editText5 = editText;
        final EditText editText6 = editText3;
        LinearLayout linearLayout14 = linearLayout6;
        final EditText editText7 = editText2;
        LinearLayout linearLayout15 = linearLayout11;
        final AlertDialog alertDialog2 = alertDialog;
        textView9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!editText4.getText().toString().equals(HomeActivity.this.pass_word.getString("pass_word", BuildConfig.FLAVOR))) {
                    editText4.setError("كلمه المرور القديمه خاطئه!!!");
                    editText4.selectAll();
                    editText4.requestFocus();
                    SketchwareUtil.showMessage(HomeActivity.this.getApplicationContext(), "كلمه المرو خطا");
                } else if (editText6.getText().toString().equals(editText7.getText().toString())) {
                    HomeActivity.this.pass_word.edit().putString("pass_word", editText7.getText().toString()).commit();
                    SketchwareUtil.showMessage(HomeActivity.this.getApplicationContext(), "تم تحديث كلمه السر بنجاح ... ");
                    editText7.requestFocus();
                    editText7.setShowSoftInputOnFocus(false);
                    editText7.setEnabled(false);
                    alertDialog2.dismiss();
                    Intent intent = new Intent();
                    intent.setClass(HomeActivity.this.getApplicationContext(), MainActivity.class);
                    HomeActivity.this.startActivity(intent);
                    HomeActivity.this.finish();
                } else {
                    editText6.setError("كلمتي المرور غير متطابقتين");
                    editText6.selectAll();
                    SketchwareUtil.showMessage(HomeActivity.this.getApplicationContext(), "غير متطابقتين");
                    editText6.requestFocus();
                }
            }
        });
        final AlertDialog alertDialog3 = alertDialog;
        textView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                editText2.requestFocus();
                editText2.setShowSoftInputOnFocus(false);
                editText2.setEnabled(false);
                alertDialog3.dismiss();
            }
        });
        editText5.setHint("Old password ");
        editText2.setHint("New password ");
        editText3.setHint("New password ");
        try {
            String str2 = str;
            textView10.setTypeface(Typeface.createFromAsset(getAssets(), str2), 1);
            textView5.setTypeface(Typeface.createFromAsset(getAssets(), str2), 1);
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), str2), 1);
            textView7.setTypeface(Typeface.createFromAsset(getAssets(), str2), 1);
            textView8.setTypeface(Typeface.createFromAsset(getAssets(), str2), 1);
            textView9.setTypeface(Typeface.createFromAsset(getAssets(), str2), 1);
        } catch (Exception unused) {
        }
        linearLayout9.setPadding(16, 16, 16, 16);
        linearLayout10.setPadding(8, 8, 8, 8);
        linearLayout15.setPadding(8, 8, 8, 8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 100, 0.0f);
        layoutParams.setMargins(2, 2, 2, 2);
        linearLayout12.setLayoutParams(layoutParams);
        linearLayout14.setLayoutParams(layoutParams);
        linearLayout13.setLayoutParams(layoutParams);
        alertDialog3.setView(linearLayout7);
        alertDialog3.show();
        alertDialog3.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        alertDialog3.getWindow().setLayout(-1, -2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0138 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _setTime(double r10, android.widget.TextView r12) {
        /*
            r9 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x014c }
            r9.c70 = r0     // Catch:{ Exception -> 0x014c }
            long r0 = r0.getTimeInMillis()     // Catch:{ Exception -> 0x014c }
            double r0 = (double) r0     // Catch:{ Exception -> 0x014c }
            double r0 = r0 - r10
            r9.tm_difference = r0     // Catch:{ Exception -> 0x014c }
            r2 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x003c
            r10 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r0 / r10
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x002b
            java.lang.String r10 = " a seconds ago"
            r12.setText(r10)     // Catch:{ Exception -> 0x014c }
            goto L_0x014c
        L_0x002b:
            double r0 = r0 / r10
            long r10 = (long) r0     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r11 = " seconds ago"
            java.lang.String r10 = r10.concat(r11)     // Catch:{ Exception -> 0x014c }
            r12.setText(r10)     // Catch:{ Exception -> 0x014c }
            goto L_0x014c
        L_0x003c:
            r6 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0063
            double r10 = r0 / r2
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0052
            java.lang.String r10 = " a minute ago"
            r12.setText(r10)     // Catch:{ Exception -> 0x014c }
            goto L_0x014c
        L_0x0052:
            double r0 = r0 / r2
            long r10 = (long) r0     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r11 = " minutes ago"
            java.lang.String r10 = r10.concat(r11)     // Catch:{ Exception -> 0x014c }
            r12.setText(r10)     // Catch:{ Exception -> 0x014c }
            goto L_0x014c
        L_0x0063:
            r2 = 4725570615333879808(0x4194997000000000, double:8.64E7)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x0094
            double r10 = r0 / r6
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0083
            double r0 = r0 / r6
            long r10 = (long) r0     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r11 = " hour ago"
            java.lang.String r10 = r10.concat(r11)     // Catch:{ Exception -> 0x014c }
            r12.setText(r10)     // Catch:{ Exception -> 0x014c }
            goto L_0x014c
        L_0x0083:
            double r0 = r0 / r6
            long r10 = (long) r0     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r11 = " hours ago"
            java.lang.String r10 = r10.concat(r11)     // Catch:{ Exception -> 0x014c }
            r12.setText(r10)     // Catch:{ Exception -> 0x014c }
            goto L_0x014c
        L_0x0094:
            r6 = 4738356638484791296(0x41c2064200000000, double:6.048E8)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00c5
            double r10 = r0 / r2
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00b4
            double r0 = r0 / r2
            long r10 = (long) r0     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r11 = " day ago"
            java.lang.String r10 = r10.concat(r11)     // Catch:{ Exception -> 0x014c }
            r12.setText(r10)     // Catch:{ Exception -> 0x014c }
            goto L_0x014c
        L_0x00b4:
            double r0 = r0 / r2
            long r10 = (long) r0     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r11 = " days ago"
            java.lang.String r10 = r10.concat(r11)     // Catch:{ Exception -> 0x014c }
            r12.setText(r10)     // Catch:{ Exception -> 0x014c }
            goto L_0x014c
        L_0x00c5:
            java.util.Calendar r0 = r9.c7     // Catch:{ Exception -> 0x014c }
            long r10 = (long) r10     // Catch:{ Exception -> 0x014c }
            r0.setTimeInMillis(r10)     // Catch:{ Exception -> 0x014c }
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "d,MM,YYYY 'at' h:mm a"
            r10.<init>(r11)     // Catch:{ Exception -> 0x0138 }
            java.util.Calendar r11 = r9.c7     // Catch:{ Exception -> 0x0138 }
            java.util.Date r11 = r11.getTime()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r10 = r10.format(r11)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "٠"
            java.lang.String r0 = "0"
            java.lang.String r10 = r10.replace(r11, r0)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "١"
            java.lang.String r0 = "1"
            java.lang.String r10 = r10.replace(r11, r0)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "٢"
            java.lang.String r0 = "2"
            java.lang.String r10 = r10.replace(r11, r0)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "٣"
            java.lang.String r0 = "3"
            java.lang.String r10 = r10.replace(r11, r0)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "٤"
            java.lang.String r0 = "4"
            java.lang.String r10 = r10.replace(r11, r0)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "٥"
            java.lang.String r0 = "5"
            java.lang.String r10 = r10.replace(r11, r0)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "٦"
            java.lang.String r0 = "6"
            java.lang.String r10 = r10.replace(r11, r0)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "٧"
            java.lang.String r0 = "7"
            java.lang.String r10 = r10.replace(r11, r0)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "٨"
            java.lang.String r0 = "8"
            java.lang.String r10 = r10.replace(r11, r0)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "٩"
            java.lang.String r0 = "9"
            java.lang.String r10 = r10.replace(r11, r0)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r11 = "/"
            java.lang.String r0 = "-"
            java.lang.String r10 = r10.replace(r11, r0)     // Catch:{ Exception -> 0x0138 }
            r12.setText(r10)     // Catch:{ Exception -> 0x0138 }
            goto L_0x014c
        L_0x0138:
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x014c }
            java.lang.String r11 = "yyyy/MM/dd hh:mm:ss"
            r10.<init>(r11)     // Catch:{ Exception -> 0x014c }
            java.util.Calendar r11 = r9.c7     // Catch:{ Exception -> 0x014c }
            java.util.Date r11 = r11.getTime()     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = r10.format(r11)     // Catch:{ Exception -> 0x014c }
            r12.setText(r10)     // Catch:{ Exception -> 0x014c }
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.HomeActivity._setTime(double, android.widget.TextView):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0430  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _dialog_set(double r24, double r26, double r28) {
        /*
            r23 = this;
            r0 = r23
            java.lang.String r1 = "fonts/font.ttf"
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r0)
            android.app.AlertDialog r2 = r2.create()
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r4 = r23.getApplicationContext()
            r3.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            r3.setLayoutParams(r4)
            r4 = 1
            r3.setOrientation(r4)
            r6 = 17
            r3.setGravity(r6)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            android.content.Context r8 = r23.getApplicationContext()
            r7.<init>(r8)
            r7.setOrientation(r4)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r10 = 0
            r8.<init>(r5, r9, r10)
            r7.setLayoutParams(r8)
            r8 = 8
            r7.setPadding(r8, r8, r8, r8)
            r7.setBackgroundColor(r5)
            r7.setGravity(r6)
            r3.addView(r7)
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            android.content.Context r12 = r23.getApplicationContext()
            r11.<init>(r12)
            r12 = 0
            r11.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r5, r9, r10)
            r11.setLayoutParams(r13)
            r11.setPadding(r8, r8, r8, r8)
            r13 = -1118482(0xffffffffffeeeeee, float:NaN)
            r11.setBackgroundColor(r13)
            r7.addView(r11)
            android.widget.ImageView r14 = new android.widget.ImageView
            android.content.Context r15 = r23.getApplicationContext()
            r14.<init>(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r4 = 105(0x69, float:1.47E-43)
            r8 = 70
            r15.<init>(r4, r8, r10)
            r14.setLayoutParams(r15)
            r15 = 2131165406(0x7f0700de, float:1.7945028E38)
            r14.setImageResource(r15)
            r11.addView(r14)
            android.widget.TextView r15 = new android.widget.TextView
            android.content.Context r13 = r23.getApplicationContext()
            r15.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r12 = 1065353216(0x3f800000, float:1.0)
            r13.<init>(r9, r5, r12)
            r15.setLayoutParams(r13)
            java.lang.String r13 = "إعدادات العرض"
            r15.setText(r13)
            r13 = 1098907648(0x41800000, float:16.0)
            r15.setTextSize(r13)
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r15.setTextColor(r13)
            r15.setGravity(r6)
            r11.addView(r15)
            android.widget.ImageView r6 = new android.widget.ImageView
            android.content.Context r13 = r23.getApplicationContext()
            r6.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r4, r8, r10)
            r6.setLayoutParams(r13)
            r13 = 2131165404(0x7f0700dc, float:1.7945024E38)
            r6.setImageResource(r13)
            r11.addView(r6)
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            android.content.Context r4 = r23.getApplicationContext()
            r13.<init>(r4)
            r4 = 0
            r13.setOrientation(r4)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r5, r9, r10)
            r13.setLayoutParams(r8)
            r7.addView(r13)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            android.content.Context r10 = r23.getApplicationContext()
            r8.<init>(r10)
            r8.setOrientation(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r10 = 350(0x15e, float:4.9E-43)
            r4.<init>(r10, r9, r12)
            r8.setLayoutParams(r4)
            r4 = 4
            r8.setPadding(r4, r4, r4, r4)
            r4 = 21
            r8.setGravity(r4)
            r13.addView(r8)
            android.widget.RadioButton r4 = new android.widget.RadioButton
            android.content.Context r10 = r23.getApplicationContext()
            r4.<init>(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r9, r5, r12)
            r4.setLayoutParams(r10)
            java.lang.String r10 = "ثائي"
            r4.setText(r10)
            r10 = 1098907648(0x41800000, float:16.0)
            r4.setTextSize(r10)
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.setTextColor(r10)
            r10 = 17
            r4.setGravity(r10)
            r8.addView(r4)
            android.widget.ImageView r10 = new android.widget.ImageView
            android.content.Context r5 = r23.getApplicationContext()
            r10.<init>(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r18 = r3
            r3 = 0
            r9 = 70
            r12 = 105(0x69, float:1.47E-43)
            r5.<init>(r12, r9, r3)
            r10.setLayoutParams(r5)
            r3 = -1118482(0xffffffffffeeeeee, float:NaN)
            r10.setBackgroundColor(r3)
            r3 = 2131165303(0x7f070077, float:1.794482E38)
            r10.setImageResource(r3)
            r8.addView(r10)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r5 = r23.getApplicationContext()
            r3.<init>(r5)
            r5 = 0
            r3.setOrientation(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r9 = 350(0x15e, float:4.9E-43)
            r10 = 1065353216(0x3f800000, float:1.0)
            r12 = -2
            r5.<init>(r9, r12, r10)
            r3.setLayoutParams(r5)
            r5 = 4
            r3.setPadding(r5, r5, r5, r5)
            r13.addView(r3)
            android.widget.RadioButton r5 = new android.widget.RadioButton
            android.content.Context r9 = r23.getApplicationContext()
            r5.<init>(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r13 = -1
            r9.<init>(r12, r13, r10)
            r5.setLayoutParams(r9)
            java.lang.String r9 = "أحادي"
            r5.setText(r9)
            r9 = 1098907648(0x41800000, float:16.0)
            r5.setTextSize(r9)
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setTextColor(r9)
            r9 = 17
            r5.setGravity(r9)
            r3.addView(r5)
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r10 = r23.getApplicationContext()
            r9.<init>(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r19 = r14
            r12 = 70
            r13 = 105(0x69, float:1.47E-43)
            r14 = 0
            r10.<init>(r13, r12, r14)
            r9.setLayoutParams(r10)
            r10 = -1118482(0xffffffffffeeeeee, float:NaN)
            r9.setBackgroundColor(r10)
            r10 = 2131165302(0x7f070076, float:1.7944817E38)
            r9.setImageResource(r10)
            r3.addView(r9)
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            android.content.Context r10 = r23.getApplicationContext()
            r9.<init>(r10)
            r10 = 0
            r9.setOrientation(r10)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r13 = -2
            r12.<init>(r10, r13, r14)
            r9.setLayoutParams(r12)
            r7.addView(r9)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            android.content.Context r12 = r23.getApplicationContext()
            r10.<init>(r12)
            r12 = 0
            r10.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r20 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r14 = 350(0x15e, float:4.9E-43)
            r12.<init>(r14, r13, r6)
            r10.setLayoutParams(r12)
            r12 = 4
            r10.setPadding(r12, r12, r12, r12)
            r12 = 21
            r10.setGravity(r12)
            r9.addView(r10)
            android.widget.RadioButton r12 = new android.widget.RadioButton
            android.content.Context r14 = r23.getApplicationContext()
            r12.<init>(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r21 = r2
            r2 = -1
            r14.<init>(r13, r2, r6)
            r12.setLayoutParams(r14)
            java.lang.String r2 = "رباعي "
            r12.setText(r2)
            r2 = 1098907648(0x41800000, float:16.0)
            r12.setTextSize(r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12.setTextColor(r2)
            r2 = 17
            r12.setGravity(r2)
            r10.addView(r12)
            android.widget.ImageView r2 = new android.widget.ImageView
            android.content.Context r6 = r23.getApplicationContext()
            r2.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r22 = r12
            r12 = 0
            r13 = 70
            r14 = 105(0x69, float:1.47E-43)
            r6.<init>(r14, r13, r12)
            r2.setLayoutParams(r6)
            r6 = -1118482(0xffffffffffeeeeee, float:NaN)
            r2.setBackgroundColor(r6)
            r6 = 2131165305(0x7f070079, float:1.7944823E38)
            r2.setImageResource(r6)
            r10.addView(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r6 = r23.getApplicationContext()
            r2.<init>(r6)
            r6 = 0
            r2.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r12 = 350(0x15e, float:4.9E-43)
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = -2
            r6.<init>(r12, r14, r13)
            r2.setLayoutParams(r6)
            r6 = 4
            r2.setPadding(r6, r6, r6, r6)
            r6 = 21
            r2.setGravity(r6)
            r9.addView(r2)
            android.widget.RadioButton r6 = new android.widget.RadioButton
            android.content.Context r9 = r23.getApplicationContext()
            r6.<init>(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r12 = -1
            r9.<init>(r14, r12, r13)
            r6.setLayoutParams(r9)
            java.lang.String r9 = "ثلاثي"
            r6.setText(r9)
            r9 = 1098907648(0x41800000, float:16.0)
            r6.setTextSize(r9)
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setTextColor(r9)
            r9 = 17
            r6.setGravity(r9)
            r2.addView(r6)
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r12 = r23.getApplicationContext()
            r9.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r16 = r6
            r6 = 0
            r13 = 70
            r14 = 105(0x69, float:1.47E-43)
            r12.<init>(r14, r13, r6)
            r9.setLayoutParams(r12)
            r12 = -1118482(0xffffffffffeeeeee, float:NaN)
            r9.setBackgroundColor(r12)
            r12 = 2131165304(0x7f070078, float:1.7944821E38)
            r9.setImageResource(r12)
            r2.addView(r9)
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            android.content.Context r12 = r23.getApplicationContext()
            r9.<init>(r12)
            r12 = 0
            r9.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r13 = -2
            r14 = -1
            r12.<init>(r14, r13, r6)
            r9.setLayoutParams(r12)
            r6 = 4
            r9.setPadding(r6, r6, r6, r6)
            r6 = -1118482(0xffffffffffeeeeee, float:NaN)
            r9.setBackgroundColor(r6)
            r7.addView(r9)
            android.widget.Button r6 = new android.widget.Button
            android.content.Context r7 = r23.getApplicationContext()
            r6.<init>(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r12 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r14, r13, r12)
            r6.setLayoutParams(r7)
            r7 = 8
            r6.setPadding(r7, r7, r7, r7)
            java.lang.String r7 = "cancel"
            r6.setText(r7)
            r7 = 1094713344(0x41400000, float:12.0)
            r6.setTextSize(r7)
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setTextColor(r12)
            r9.addView(r6)
            android.widget.Button r12 = new android.widget.Button
            android.content.Context r13 = r23.getApplicationContext()
            r12.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r17 = r6
            r6 = -1
            r7 = -2
            r14 = 1065353216(0x3f800000, float:1.0)
            r13.<init>(r6, r7, r14)
            r12.setLayoutParams(r13)
            r13 = 8
            r12.setPadding(r13, r13, r13, r13)
            java.lang.String r13 = "OK"
            r12.setText(r13)
            r13 = 1094713344(0x41400000, float:12.0)
            r12.setTextSize(r13)
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12.setTextColor(r13)
            r9.addView(r12)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r6, r7, r14)
            r7 = 2
            r14 = 4
            r13.setMargins(r14, r7, r14, r7)
            r2.setLayoutParams(r13)
            r10.setLayoutParams(r13)
            r11.setLayoutParams(r13)
            r9.setLayoutParams(r13)
            r8.setLayoutParams(r13)
            r3.setLayoutParams(r13)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$40 r13 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$40
            r13.<init>()
            r14 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.GradientDrawable r13 = r13.getIns(r7, r7, r14, r6)
            r2.setBackground(r13)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$41 r2 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$41
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r7, r7, r14, r6)
            r10.setBackground(r2)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$42 r2 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$42
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r7, r7, r14, r6)
            r8.setBackground(r2)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$43 r2 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$43
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r7, r7, r14, r6)
            r3.setBackground(r2)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$44 r2 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$44
            r2.<init>()
            r3 = -2039584(0xffffffffffe0e0e0, float:NaN)
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r7, r7, r14, r3)
            r11.setBackground(r2)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$45 r2 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$45
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r7, r7, r14, r3)
            r9.setBackground(r2)
            android.content.res.AssetManager r2 = r23.getAssets()     // Catch:{ Exception -> 0x0410 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x0410 }
            r3 = 1
            r15.setTypeface(r2, r3)     // Catch:{ Exception -> 0x0410 }
            android.content.res.AssetManager r2 = r23.getAssets()     // Catch:{ Exception -> 0x0410 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x0410 }
            r4.setTypeface(r2, r3)     // Catch:{ Exception -> 0x0410 }
            android.content.res.AssetManager r2 = r23.getAssets()     // Catch:{ Exception -> 0x0410 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x0410 }
            r5.setTypeface(r2, r3)     // Catch:{ Exception -> 0x0410 }
            android.content.res.AssetManager r2 = r23.getAssets()     // Catch:{ Exception -> 0x0410 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x0410 }
            r6 = r17
            r6.setTypeface(r2, r3)     // Catch:{ Exception -> 0x040d }
            android.content.res.AssetManager r2 = r23.getAssets()     // Catch:{ Exception -> 0x040d }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x040d }
            r12.setTypeface(r2, r3)     // Catch:{ Exception -> 0x040d }
            android.content.res.AssetManager r2 = r23.getAssets()     // Catch:{ Exception -> 0x040d }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x040d }
            r7 = r22
            r7.setTypeface(r2, r3)     // Catch:{ Exception -> 0x040a }
            android.content.res.AssetManager r2 = r23.getAssets()     // Catch:{ Exception -> 0x040a }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x040a }
            r2 = r16
            r2.setTypeface(r1, r3)     // Catch:{ Exception -> 0x0416 }
            goto L_0x0417
        L_0x040a:
            r2 = r16
            goto L_0x0416
        L_0x040d:
            r2 = r16
            goto L_0x0414
        L_0x0410:
            r2 = r16
            r6 = r17
        L_0x0414:
            r7 = r22
        L_0x0416:
        L_0x0417:
            android.content.SharedPreferences r1 = r0.save
            java.lang.String r3 = "nu9"
            java.lang.String r8 = ""
            java.lang.String r1 = r1.getString(r3, r8)
            r0.Ty_num = r1
            java.lang.String r3 = "1"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0430
            r1 = 1
            r5.setChecked(r1)
            goto L_0x045e
        L_0x0430:
            r1 = 1
            java.lang.String r3 = r0.Ty_num
            java.lang.String r8 = "2"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x043f
            r4.setChecked(r1)
            goto L_0x045e
        L_0x043f:
            java.lang.String r3 = r0.Ty_num
            java.lang.String r8 = "3"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x044d
            r2.setChecked(r1)
            goto L_0x045e
        L_0x044d:
            java.lang.String r3 = r0.Ty_num
            java.lang.String r8 = "4"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x045b
            r7.setChecked(r1)
            goto L_0x045e
        L_0x045b:
            r4.setChecked(r1)
        L_0x045e:
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$46 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$46
            r3 = r21
            r1.<init>(r3)
            r8 = r20
            r8.setOnClickListener(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$47 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$47
            r1.<init>(r3)
            r8 = r19
            r8.setOnClickListener(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$48 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$48
            r24 = r1
            r25 = r23
            r26 = r5
            r27 = r4
            r28 = r2
            r29 = r7
            r24.<init>(r26, r27, r28, r29)
            r5.setOnCheckedChangeListener(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$49 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$49
            r24 = r1
            r26 = r4
            r27 = r5
            r24.<init>(r26, r27, r28, r29)
            r4.setOnCheckedChangeListener(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$50 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$50
            r24 = r1
            r26 = r2
            r28 = r4
            r24.<init>(r26, r27, r28, r29)
            r2.setOnCheckedChangeListener(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$51 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$51
            r24 = r1
            r26 = r7
            r28 = r2
            r29 = r4
            r24.<init>(r26, r27, r28, r29)
            r7.setOnCheckedChangeListener(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$52 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$52
            r1.<init>(r3)
            r6.setOnClickListener(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$53 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$53
            r1.<init>(r3)
            r12.setOnClickListener(r1)
            r1 = r18
            r3.setView(r1)
            r3.show()
            android.view.Window r1 = r3.getWindow()
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r4 = 0
            r2.<init>(r4)
            r1.setBackgroundDrawable(r2)
            android.view.Window r1 = r3.getWindow()
            r2 = -2
            r1.setLayout(r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.HomeActivity._dialog_set(double, double, double):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|(5:23|24|25|26|27)|30|31|(5:32|33|34|35|36)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x028f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x02a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _dialog_(double r26, java.lang.String r28, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r29) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r10 = r28
            r11 = r29
            java.lang.String r0 = "fonts/font700.ttf"
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r7)
            android.app.AlertDialog r12 = r1.create()
            android.view.LayoutInflater r1 = r25.getLayoutInflater()
            r2 = 2131427384(0x7f0b0038, float:1.8476383E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            r12.setView(r1)
            r13 = 1
            r12.requestWindowFeature(r13)
            android.view.Window r2 = r12.getWindow()
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r4 = 0
            r3.<init>(r4)
            r2.setBackgroundDrawable(r3)
            r2 = 2131231060(0x7f080154, float:1.807819E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2 = 2131231073(0x7f080161, float:1.8078217E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = 2131231115(0x7f08018b, float:1.8078302E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r5 = 2131231128(0x7f080198, float:1.8078328E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r6 = 2131231133(0x7f08019d, float:1.8078338E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r14 = 2131231136(0x7f0801a0, float:1.8078344E38)
            android.view.View r14 = r1.findViewById(r14)
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r14 = 2131231135(0x7f08019f, float:1.8078342E38)
            android.view.View r14 = r1.findViewById(r14)
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r15 = 2131230970(0x7f0800fa, float:1.8078008E38)
            android.view.View r15 = r1.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r4 = 2131231477(0x7f0802f5, float:1.8079036E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r13 = 2131231482(0x7f0802fa, float:1.8079046E38)
            android.view.View r13 = r1.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r17 = r12
            r12 = 2131230911(0x7f0800bf, float:1.8077888E38)
            android.view.View r12 = r1.findViewById(r12)
            android.widget.EditText r12 = (android.widget.EditText) r12
            r18 = r0
            r0 = 2131231517(0x7f08031d, float:1.8079117E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r19 = r0
            r0 = 2131230912(0x7f0800c0, float:1.807789E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r11 = 2131231518(0x7f08031e, float:1.807912E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r20 = r11
            r11 = 2131230913(0x7f0800c1, float:1.8077892E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.EditText r11 = (android.widget.EditText) r11
            r8 = 2131231519(0x7f08031f, float:1.8079121E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131230836(0x7f080074, float:1.8077736E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r21 = r8
            r8 = 2131231263(0x7f08021f, float:1.8078602E38)
            android.view.View r1 = r1.findViewById(r8)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$54 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$54
            r1.<init>()
            r22 = r4
            r4 = 2
            r23 = r15
            r15 = -2236963(0xffffffffffdddddd, float:NaN)
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r24 = r13
            r13 = 1
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r4, r13, r15, r10)
            r3.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$55 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$55
            r1.<init>()
            r3 = -117901064(0xfffffffff8f8f8f8, float:-4.0398103E34)
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r4, r13, r15, r3)
            r5.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$56 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$56
            r1.<init>()
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r4, r13, r15, r3)
            r6.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$57 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$57
            r1.<init>()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r4, r4, r3, r5)
            r2.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$58 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$58
            r1.<init>()
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r4, r4, r3, r10)
            r14.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$59 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$59
            r1.<init>()
            r2 = 20
            r4 = 1
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r4, r3, r5)
            r8.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$60 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$60
            r1.<init>()
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r4, r3, r5)
            r9.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$61 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$61
            r1.<init>()
            r3 = -13421773(0xffffffffff333333, float:-2.3819765E38)
            r5 = -1
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r4, r3, r5)
            r12.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$62 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$62
            r1.<init>()
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r4, r3, r5)
            r0.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$63 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$63
            r1.<init>()
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r4, r3, r5)
            r11.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$64 r1 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$64
            r1.<init>()
            r5 = 0
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r4, r3, r5)
            r13 = r24
            r13.setBackground(r1)
            java.lang.String r10 = "A"
            r14 = r28
            boolean r1 = r14.equals(r10)
            if (r1 == 0) goto L_0x01b0
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r7.c7 = r1
            long r1 = r1.getTimeInMillis()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7.book = r1
            r1 = 8
            r15 = r23
            r15.setVisibility(r1)
            java.lang.String r1 = "إضافه إمتحان جديد"
            r4 = r22
            r4.setText(r1)
            r5 = r26
            r3 = r29
            goto L_0x01e0
        L_0x01b0:
            r4 = r22
            r15 = r23
            java.lang.String r1 = "تعديل اسم الامتحان"
            r4.setText(r1)
            r5 = r26
            int r1 = (int) r5
            r3 = r29
            java.lang.Object r1 = r3.get(r1)     // Catch:{ Exception -> 0x01d1 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r2 = "0"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01d1 }
            r7.book = r1     // Catch:{ Exception -> 0x01d1 }
            goto L_0x01e0
        L_0x01d1:
            r1 = 1000(0x3e8, float:1.401E-42)
            r2 = 10000(0x2710, float:1.4013E-41)
            int r1 = com.Nasa.Soft.Exzam.Editor35.SketchwareUtil.getRandom(r1, r2)
            long r1 = (long) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7.book = r1
        L_0x01e0:
            android.content.res.AssetManager r1 = r25.getAssets()     // Catch:{ Exception -> 0x0239 }
            r2 = r18
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r2)     // Catch:{ Exception -> 0x0239 }
            r16 = r0
            r0 = 1
            r13.setTypeface(r1, r0)     // Catch:{ Exception -> 0x023b }
            android.content.res.AssetManager r1 = r25.getAssets()     // Catch:{ Exception -> 0x023b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r2)     // Catch:{ Exception -> 0x023b }
            r4.setTypeface(r1, r0)     // Catch:{ Exception -> 0x023b }
            android.content.res.AssetManager r1 = r25.getAssets()     // Catch:{ Exception -> 0x023b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r2)     // Catch:{ Exception -> 0x023b }
            r9.setTypeface(r1, r0)     // Catch:{ Exception -> 0x023b }
            android.content.res.AssetManager r1 = r25.getAssets()     // Catch:{ Exception -> 0x023b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r2)     // Catch:{ Exception -> 0x023b }
            r8.setTypeface(r1, r0)     // Catch:{ Exception -> 0x023b }
            android.content.res.AssetManager r1 = r25.getAssets()     // Catch:{ Exception -> 0x023b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r2)     // Catch:{ Exception -> 0x023b }
            r4 = r19
            r4.setTypeface(r1, r0)     // Catch:{ Exception -> 0x023b }
            android.content.res.AssetManager r1 = r25.getAssets()     // Catch:{ Exception -> 0x023b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r2)     // Catch:{ Exception -> 0x023b }
            r4 = r20
            r4.setTypeface(r1, r0)     // Catch:{ Exception -> 0x023b }
            android.content.res.AssetManager r1 = r25.getAssets()     // Catch:{ Exception -> 0x023b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r2)     // Catch:{ Exception -> 0x023b }
            r2 = r21
            r2.setTypeface(r1, r0)     // Catch:{ Exception -> 0x023b }
            goto L_0x023b
        L_0x0239:
            r16 = r0
        L_0x023b:
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$65 r0 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$65
            r4 = r17
            r0.<init>(r12, r4)
            r9.setOnClickListener(r0)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$66 r0 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$66
            r0.<init>(r11, r12, r4)
            r15.setOnClickListener(r0)
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$67 r9 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$67
            r15 = r16
            r0 = r9
            r1 = r25
            r2 = r11
            r7 = r3
            r3 = r15
            r16 = r4
            r4 = r12
            r18 = r11
            r17 = r12
            r11 = r5
            r5 = r28
            r6 = r16
            r0.<init>(r2, r3, r4, r5, r6)
            r8.setOnClickListener(r9)
            java.lang.String r0 = "New"
            r13.setText(r0)     // Catch:{ Exception -> 0x026f }
            goto L_0x0270
        L_0x026f:
        L_0x0270:
            boolean r0 = r14.equals(r10)
            if (r0 != 0) goto L_0x02b8
            int r0 = (int) r11
            java.lang.Object r1 = r7.get(r0)     // Catch:{ Exception -> 0x028d }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x028d }
            java.lang.String r2 = "3"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x028d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x028d }
            r12 = r17
            r12.setText(r1)     // Catch:{ Exception -> 0x028f }
            goto L_0x028f
        L_0x028d:
            r12 = r17
        L_0x028f:
            java.lang.Object r1 = r7.get(r0)     // Catch:{ Exception -> 0x02a2 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r2 = "2"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x02a2 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02a2 }
            r15.setText(r1)     // Catch:{ Exception -> 0x02a2 }
        L_0x02a2:
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x02ba }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x02ba }
            java.lang.String r1 = "1"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x02ba }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02ba }
            r11 = r18
            r11.setText(r0)     // Catch:{ Exception -> 0x02bc }
            goto L_0x02bc
        L_0x02b8:
            r12 = r17
        L_0x02ba:
            r11 = r18
        L_0x02bc:
            com.Nasa.Soft.Exzam.Editor35.HomeActivity$68 r0 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$68
            r1 = r25
            r0.<init>(r12)
            r1.timer_5 = r0
            java.util.Timer r2 = r1._timer
            r3 = 70
            r2.schedule(r0, r3)
            r0 = 1
            r12.setTextIsSelectable(r0)
            r15.setTextIsSelectable(r0)
            r11.setTextIsSelectable(r0)
            r16.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.HomeActivity._dialog_(double, java.lang.String, java.util.ArrayList):void");
    }

    public class Gridview1Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public long getItemId(int i) {
            return (long) i;
        }

        public Gridview1Adapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        public int getCount() {
            return this._data.size();
        }

        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(1:2)(1:3)|4|5|6|7|8|(2:9|10)|11|(5:13|14|15|16|17)|20|22|23|24|(2:26|27)|28|(2:30|31)|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0092 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r20, android.view.View r21, android.view.ViewGroup r22) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                java.lang.String r2 = ""
                java.lang.String r3 = "nu9"
                java.lang.String r4 = "fonts/font.ttf"
                java.lang.String r5 = "0"
                com.Nasa.Soft.Exzam.Editor35.HomeActivity r6 = com.Nasa.Soft.Exzam.Editor35.HomeActivity.this
                android.view.LayoutInflater r6 = r6.getLayoutInflater()
                if (r21 != 0) goto L_0x001d
                r7 = 2131427364(0x7f0b0024, float:1.8476342E38)
                r8 = 0
                android.view.View r6 = r6.inflate(r7, r8)
                goto L_0x001f
            L_0x001d:
                r6 = r21
            L_0x001f:
                r7 = 2131231060(0x7f080154, float:1.807819E38)
                android.view.View r7 = r6.findViewById(r7)
                android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
                r8 = 2131231492(0x7f080304, float:1.8079067E38)
                android.view.View r8 = r6.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                r9 = 2131230988(0x7f08010c, float:1.8078044E38)
                android.view.View r9 = r6.findViewById(r9)
                android.widget.ImageView r9 = (android.widget.ImageView) r9
                r10 = 2131231473(0x7f0802f1, float:1.8079028E38)
                android.view.View r10 = r6.findViewById(r10)
                android.widget.TextView r10 = (android.widget.TextView) r10
                r11 = 2131231484(0x7f0802fc, float:1.807905E38)
                android.view.View r11 = r6.findViewById(r11)
                android.widget.TextView r11 = (android.widget.TextView) r11
                r12 = 2131231385(0x7f080299, float:1.807885E38)
                android.view.View r12 = r6.findViewById(r12)
                android.widget.TextView r12 = (android.widget.TextView) r12
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r13 = r0._data     // Catch:{ Exception -> 0x007d }
                java.lang.Object r13 = r13.get(r1)     // Catch:{ Exception -> 0x007d }
                java.util.HashMap r13 = (java.util.HashMap) r13     // Catch:{ Exception -> 0x007d }
                java.lang.Object r13 = r13.get(r5)     // Catch:{ Exception -> 0x007d }
                java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x007d }
                r8.setText(r13)     // Catch:{ Exception -> 0x007d }
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r13 = r0._data     // Catch:{ Exception -> 0x007d }
                java.lang.Object r13 = r13.get(r1)     // Catch:{ Exception -> 0x007d }
                java.util.HashMap r13 = (java.util.HashMap) r13     // Catch:{ Exception -> 0x007d }
                java.lang.String r14 = "1"
                java.lang.Object r13 = r13.get(r14)     // Catch:{ Exception -> 0x007d }
                java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x007d }
                r12.setText(r13)     // Catch:{ Exception -> 0x007d }
            L_0x007d:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r12 = r0._data     // Catch:{ Exception -> 0x0092 }
                java.lang.Object r12 = r12.get(r1)     // Catch:{ Exception -> 0x0092 }
                java.util.HashMap r12 = (java.util.HashMap) r12     // Catch:{ Exception -> 0x0092 }
                java.lang.String r13 = "2"
                java.lang.Object r12 = r12.get(r13)     // Catch:{ Exception -> 0x0092 }
                java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0092 }
                r10.setText(r12)     // Catch:{ Exception -> 0x0092 }
            L_0x0092:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r12 = r0._data     // Catch:{ Exception -> 0x00a7 }
                java.lang.Object r12 = r12.get(r1)     // Catch:{ Exception -> 0x00a7 }
                java.util.HashMap r12 = (java.util.HashMap) r12     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r13 = "3"
                java.lang.Object r12 = r12.get(r13)     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x00a7 }
                r11.setText(r12)     // Catch:{ Exception -> 0x00a7 }
            L_0x00a7:
                com.Nasa.Soft.Exzam.Editor35.HomeActivity$Gridview1Adapter$1 r12 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$Gridview1Adapter$1
                r12.<init>(r1)
                r7.setOnClickListener(r12)
                com.Nasa.Soft.Exzam.Editor35.HomeActivity$Gridview1Adapter$2 r12 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$Gridview1Adapter$2
                r12.<init>(r1)
                r7.setOnLongClickListener(r12)
                android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x00fa }
                com.Nasa.Soft.Exzam.Editor35.HomeActivity r13 = com.Nasa.Soft.Exzam.Editor35.HomeActivity.this     // Catch:{ Exception -> 0x00fa }
                double r13 = r13.A30     // Catch:{ Exception -> 0x00fa }
                com.Nasa.Soft.Exzam.Editor35.HomeActivity r15 = com.Nasa.Soft.Exzam.Editor35.HomeActivity.this     // Catch:{ Exception -> 0x00fa }
                android.content.SharedPreferences r15 = r15.save     // Catch:{ Exception -> 0x00fa }
                java.lang.String r15 = r15.getString(r3, r2)     // Catch:{ Exception -> 0x00fa }
                double r15 = java.lang.Double.parseDouble(r15)     // Catch:{ Exception -> 0x00fa }
                r17 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r15 = r15 + r17
                double r13 = r13 / r15
                int r13 = (int) r13     // Catch:{ Exception -> 0x00fa }
                com.Nasa.Soft.Exzam.Editor35.HomeActivity r14 = com.Nasa.Soft.Exzam.Editor35.HomeActivity.this     // Catch:{ Exception -> 0x00fa }
                double r14 = r14.A30     // Catch:{ Exception -> 0x00fa }
                r16 = r6
                com.Nasa.Soft.Exzam.Editor35.HomeActivity r6 = com.Nasa.Soft.Exzam.Editor35.HomeActivity.this     // Catch:{ Exception -> 0x00fc }
                android.content.SharedPreferences r6 = r6.save     // Catch:{ Exception -> 0x00fc }
                java.lang.String r2 = r6.getString(r3, r2)     // Catch:{ Exception -> 0x00fc }
                double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x00fc }
                double r2 = r2 + r17
                double r14 = r14 / r2
                int r2 = (int) r14     // Catch:{ Exception -> 0x00fc }
                r3 = 0
                r12.<init>(r13, r2, r3)     // Catch:{ Exception -> 0x00fc }
                r9.setLayoutParams(r12)     // Catch:{ Exception -> 0x00fc }
                android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ Exception -> 0x00fc }
                r9.setScaleType(r2)     // Catch:{ Exception -> 0x00fc }
                goto L_0x00fc
            L_0x00fa:
                r16 = r6
            L_0x00fc:
                r2 = 1
                com.Nasa.Soft.Exzam.Editor35.HomeActivity r3 = com.Nasa.Soft.Exzam.Editor35.HomeActivity.this     // Catch:{ Exception -> 0x0117 }
                android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ Exception -> 0x0117 }
                android.graphics.Typeface r3 = android.graphics.Typeface.createFromAsset(r3, r4)     // Catch:{ Exception -> 0x0117 }
                r11.setTypeface(r3, r2)     // Catch:{ Exception -> 0x0117 }
                com.Nasa.Soft.Exzam.Editor35.HomeActivity r3 = com.Nasa.Soft.Exzam.Editor35.HomeActivity.this     // Catch:{ Exception -> 0x0117 }
                android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ Exception -> 0x0117 }
                android.graphics.Typeface r3 = android.graphics.Typeface.createFromAsset(r3, r4)     // Catch:{ Exception -> 0x0117 }
                r10.setTypeface(r3, r2)     // Catch:{ Exception -> 0x0117 }
            L_0x0117:
                com.Nasa.Soft.Exzam.Editor35.HomeActivity$Gridview1Adapter$3 r3 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$Gridview1Adapter$3
                r3.<init>()
                r4 = 20
                r6 = -2039584(0xffffffffffe0e0e0, float:NaN)
                r9 = -1
                android.graphics.drawable.GradientDrawable r3 = r3.getIns(r4, r2, r6, r9)
                r7.setBackground(r3)
                com.Nasa.Soft.Exzam.Editor35.HomeActivity r3 = com.Nasa.Soft.Exzam.Editor35.HomeActivity.this     // Catch:{ Exception -> 0x0142 }
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r4 = r0._data     // Catch:{ Exception -> 0x0142 }
                java.lang.Object r1 = r4.get(r1)     // Catch:{ Exception -> 0x0142 }
                java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x0142 }
                java.lang.Object r1 = r1.get(r5)     // Catch:{ Exception -> 0x0142 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0142 }
                double r4 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x0142 }
                r3._setTime(r4, r8)     // Catch:{ Exception -> 0x0142 }
            L_0x0142:
                r1 = 8
                com.Nasa.Soft.Exzam.Editor35.HomeActivity$Gridview1Adapter$4 r3 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$Gridview1Adapter$4     // Catch:{ Exception -> 0x0160 }
                r3.<init>()     // Catch:{ Exception -> 0x0160 }
                r4 = 0
                com.Nasa.Soft.Exzam.Editor35.HomeActivity r5 = com.Nasa.Soft.Exzam.Editor35.HomeActivity.this     // Catch:{ Exception -> 0x0160 }
                double r5 = r5.color     // Catch:{ Exception -> 0x0160 }
                int r5 = (int) r5     // Catch:{ Exception -> 0x0160 }
                com.Nasa.Soft.Exzam.Editor35.HomeActivity r6 = com.Nasa.Soft.Exzam.Editor35.HomeActivity.this     // Catch:{ Exception -> 0x0160 }
                double r6 = r6.color     // Catch:{ Exception -> 0x0160 }
                int r6 = (int) r6     // Catch:{ Exception -> 0x0160 }
                android.graphics.drawable.GradientDrawable r3 = r3.getIns(r1, r4, r5, r6)     // Catch:{ Exception -> 0x0160 }
                r8.setBackground(r3)     // Catch:{ Exception -> 0x0160 }
                goto L_0x016e
            L_0x0160:
                com.Nasa.Soft.Exzam.Editor35.HomeActivity$Gridview1Adapter$5 r3 = new com.Nasa.Soft.Exzam.Editor35.HomeActivity$Gridview1Adapter$5
                r3.<init>()
                r4 = -65536(0xffffffffffff0000, float:NaN)
                android.graphics.drawable.GradientDrawable r1 = r3.getIns(r1, r2, r9, r4)
                r8.setBackground(r1)
            L_0x016e:
                return r16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.HomeActivity.Gridview1Adapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    @Deprecated
    public void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[1];
    }

    @Deprecated
    public int getRandom(int i2, int i3) {
        return new Random().nextInt((i3 - i2) + 1) + i2;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
            if (checkedItemPositions.valueAt(i2)) {
                arrayList.add(Double.valueOf((double) checkedItemPositions.keyAt(i2)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int i2) {
        return TypedValue.applyDimension(1, (float) i2, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }
}
