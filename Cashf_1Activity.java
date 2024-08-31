package com.Nasa.Soft.Exzam.Editor35;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import uk.co.senab.photoview.BuildConfig;

public class Cashf_1Activity extends AppCompatActivity {
    /* access modifiers changed from: private */
    public String ID = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Name = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Path = BuildConfig.FLAVOR;
    public final int REQ_CD_HIFFIDJ = 101;
    /* access modifiers changed from: private */
    public double T500o = 0.0d;
    private FloatingActionButton _fab;
    private File _file_hiffidj;
    /* access modifiers changed from: private */
    public Timer _timer = new Timer();
    private LinearLayout base;
    /* access modifiers changed from: private */
    public SharedPreferences codee;
    /* access modifiers changed from: private */
    public AlertDialog.Builder dialog;
    /* access modifiers changed from: private */
    public String file_name = BuildConfig.FLAVOR;
    private Intent hiffidj = new Intent("android.media.action.IMAGE_CAPTURE");
    private ImageView image_tipi;
    private ImageView image_tiping;
    private ImageView imageview20;
    private ImageView imageview22;
    private ImageView imageview24;
    private double k1 = 0.0d;
    private double k2 = 0.0d;
    private double k3 = 0.0d;
    private double k4 = 0.0d;
    private double k5 = 0.0d;
    private double k6 = 0.0d;
    /* access modifiers changed from: private */
    public LinearLayout layout1;
    /* access modifiers changed from: private */
    public LinearLayout layout2;
    /* access modifiers changed from: private */
    public LinearLayout layout3;
    private LinearLayout layout4;
    private LinearLayout layouts;
    private LinearLayout linear1;
    private LinearLayout linear11_all;
    private LinearLayout linear1_2;
    private LinearLayout linear1_3;
    private LinearLayout linear1_50;
    private LinearLayout linear2;
    private LinearLayout linear2_2;
    private LinearLayout linear2_3;
    private LinearLayout linear35;
    private LinearLayout linear37;
    private LinearLayout linear38;
    private LinearLayout linear39;
    private LinearLayout linear40;
    private LinearLayout linear40_2;
    private LinearLayout linear40_3;
    private LinearLayout linear41;
    private LinearLayout linear42;
    private LinearLayout linear43;
    private LinearLayout linear48;
    private LinearLayout linear_crea5;
    private LinearLayout linear_oc;
    private LinearLayout linear_oc_2;
    private LinearLayout linear_oc_3;
    /* access modifiers changed from: private */
    public LinearLayout linear_pdf50;
    private LinearLayout linear_view_1;
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> list_map = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> list_pdf = new ArrayList<>();
    private ListView listview1;
    private ListView listview1_2;
    private ListView listview1_3;
    private ListView listview1_50;
    private HashMap<String, Object> map = new HashMap<>();
    /* access modifiers changed from: private */
    public HashMap<String, Object> map_A = new HashMap<>();
    /* access modifiers changed from: private */
    public double n = 0.0d;
    /* access modifiers changed from: private */
    public double position_number = 0.0d;
    /* access modifiers changed from: private */
    public double positionsss = 0.0d;
    /* access modifiers changed from: private */
    public SharedPreferences sarveraz;
    TabLayout tabLayout;
    private LinearLayout tablayout;
    private TextView text_0;
    private TextView text_0_2;
    private TextView text_0_3;
    private TextView text_0_50;
    private TextView text_1;
    private TextView text_1_2;
    private TextView text_1_3;
    private TextView text_1_50;
    private TextView text_2;
    private TextView text_2_50;
    private TextView text_3;
    private TextView text_3_2;
    private TextView text_3_3;
    private TextView text_3_50;
    private TextView text_4;
    private TextView text_4_2;
    private TextView text_4_3;
    private TextView text_4_50;
    private TextView text_5;
    private TextView text_5_2;
    private TextView text_5_3;
    private TextView text_5_50;
    private TextView text_6;
    private TextView text_6_2;
    private TextView text_6_3;
    private TextView text_6_50;
    private TextView text_7;
    private TextView text_7_2;
    private TextView text_7_3;
    private TextView text_7_50;
    private TextView text_8;
    private TextView text_8_2;
    private TextView text_8_3;
    private TextView text_8_50;
    private TextView text_madah;
    /* access modifiers changed from: private */
    public TextView text_name_c5;
    private TextView text_shahr2;
    private TextView text_shahr3;
    private TextView textview1;
    private TextView textview1_50;
    private TextView textview2;
    private TextView textview96;
    private TextView textview_nasf;
    private TextView textview_savf;
    /* access modifiers changed from: private */
    public TimerTask timer_5;
    /* access modifiers changed from: private */
    public LinearLayout trash;
    ViewPager viewPager;
    private double y = 0.0d;

    private void foo() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.cashf_1);
        initialize(bundle);
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") == -1 || ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == -1 || ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1000);
        } else {
            initializeLogic();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1000) {
            initializeLogic();
        }
    }

    private void initialize(Bundle bundle) {
        Uri uri;
        this._fab = (FloatingActionButton) findViewById(R.id._fab);
        this.linear39 = (LinearLayout) findViewById(R.id.linear39);
        this.linear11_all = (LinearLayout) findViewById(R.id.linear11_all);
        this.linear_pdf50 = (LinearLayout) findViewById(R.id.linear_pdf50);
        this.linear_crea5 = (LinearLayout) findViewById(R.id.linear_crea5);
        this.linear37 = (LinearLayout) findViewById(R.id.linear37);
        this.linear35 = (LinearLayout) findViewById(R.id.linear35);
        this.linear_view_1 = (LinearLayout) findViewById(R.id.linear_view_1);
        this.imageview22 = (ImageView) findViewById(R.id.imageview22);
        this.text_name_c5 = (TextView) findViewById(R.id.text_name_c5);
        this.image_tiping = (ImageView) findViewById(R.id.image_tiping);
        this.imageview20 = (ImageView) findViewById(R.id.imageview20);
        this.image_tipi = (ImageView) findViewById(R.id.image_tipi);
        this.imageview24 = (ImageView) findViewById(R.id.imageview24);
        this.linear38 = (LinearLayout) findViewById(R.id.linear38);
        this.layouts = (LinearLayout) findViewById(R.id.layouts);
        this.tablayout = (LinearLayout) findViewById(R.id.tablayout);
        this.base = (LinearLayout) findViewById(R.id.base);
        this.trash = (LinearLayout) findViewById(R.id.trash);
        this.layout1 = (LinearLayout) findViewById(R.id.layout1);
        this.layout2 = (LinearLayout) findViewById(R.id.layout2);
        this.layout3 = (LinearLayout) findViewById(R.id.layout3);
        this.layout4 = (LinearLayout) findViewById(R.id.layout4);
        this.linear_oc = (LinearLayout) findViewById(R.id.linear_oc);
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.listview1 = (ListView) findViewById(R.id.listview1);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.text_2 = (TextView) findViewById(R.id.text_2);
        this.text_1 = (TextView) findViewById(R.id.text_1);
        this.text_0 = (TextView) findViewById(R.id.text_0);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.linear40 = (LinearLayout) findViewById(R.id.linear40);
        this.text_8 = (TextView) findViewById(R.id.text_8);
        this.text_7 = (TextView) findViewById(R.id.text_7);
        this.text_6 = (TextView) findViewById(R.id.text_6);
        this.text_5 = (TextView) findViewById(R.id.text_5);
        this.text_4 = (TextView) findViewById(R.id.text_4);
        this.text_3 = (TextView) findViewById(R.id.text_3);
        this.linear_oc_2 = (LinearLayout) findViewById(R.id.linear_oc_2);
        this.linear1_2 = (LinearLayout) findViewById(R.id.linear1_2);
        this.listview1_2 = (ListView) findViewById(R.id.listview1_2);
        this.linear2_2 = (LinearLayout) findViewById(R.id.linear2_2);
        this.textview96 = (TextView) findViewById(R.id.textview96);
        this.text_1_2 = (TextView) findViewById(R.id.text_1_2);
        this.text_0_2 = (TextView) findViewById(R.id.text_0_2);
        this.text_shahr2 = (TextView) findViewById(R.id.text_shahr2);
        this.linear40_2 = (LinearLayout) findViewById(R.id.linear40_2);
        this.text_8_2 = (TextView) findViewById(R.id.text_8_2);
        this.text_7_2 = (TextView) findViewById(R.id.text_7_2);
        this.text_6_2 = (TextView) findViewById(R.id.text_6_2);
        this.text_5_2 = (TextView) findViewById(R.id.text_5_2);
        this.text_4_2 = (TextView) findViewById(R.id.text_4_2);
        this.text_3_2 = (TextView) findViewById(R.id.text_3_2);
        this.linear_oc_3 = (LinearLayout) findViewById(R.id.linear_oc_3);
        this.linear1_3 = (LinearLayout) findViewById(R.id.linear1_3);
        this.listview1_3 = (ListView) findViewById(R.id.listview1_3);
        this.linear2_3 = (LinearLayout) findViewById(R.id.linear2_3);
        this.text_1_3 = (TextView) findViewById(R.id.text_1_3);
        this.text_0_3 = (TextView) findViewById(R.id.text_0_3);
        this.text_shahr3 = (TextView) findViewById(R.id.text_shahr3);
        this.linear40_3 = (LinearLayout) findViewById(R.id.linear40_3);
        this.text_8_3 = (TextView) findViewById(R.id.text_8_3);
        this.text_7_3 = (TextView) findViewById(R.id.text_7_3);
        this.text_6_3 = (TextView) findViewById(R.id.text_6_3);
        this.text_5_3 = (TextView) findViewById(R.id.text_5_3);
        this.text_4_3 = (TextView) findViewById(R.id.text_4_3);
        this.text_3_3 = (TextView) findViewById(R.id.text_3_3);
        this.linear41 = (LinearLayout) findViewById(R.id.linear41);
        this.linear48 = (LinearLayout) findViewById(R.id.linear48);
        this.linear1_50 = (LinearLayout) findViewById(R.id.linear1_50);
        this.listview1_50 = (ListView) findViewById(R.id.listview1_50);
        this.text_madah = (TextView) findViewById(R.id.text_madah);
        this.textview_savf = (TextView) findViewById(R.id.textview_savf);
        this.textview_nasf = (TextView) findViewById(R.id.textview_nasf);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.linear42 = (LinearLayout) findViewById(R.id.linear42);
        this.text_2_50 = (TextView) findViewById(R.id.text_2_50);
        this.text_1_50 = (TextView) findViewById(R.id.text_1_50);
        this.text_0_50 = (TextView) findViewById(R.id.text_0_50);
        this.textview1_50 = (TextView) findViewById(R.id.textview1_50);
        this.linear43 = (LinearLayout) findViewById(R.id.linear43);
        this.text_8_50 = (TextView) findViewById(R.id.text_8_50);
        this.text_7_50 = (TextView) findViewById(R.id.text_7_50);
        this.text_6_50 = (TextView) findViewById(R.id.text_6_50);
        this.text_5_50 = (TextView) findViewById(R.id.text_5_50);
        this.text_4_50 = (TextView) findViewById(R.id.text_4_50);
        this.text_3_50 = (TextView) findViewById(R.id.text_3_50);
        this.sarveraz = getSharedPreferences("sarveraz", 0);
        this.codee = getSharedPreferences("codee", 0);
        this._file_hiffidj = FileUtil.createNewPictureFile(getApplicationContext());
        if (Build.VERSION.SDK_INT >= 24) {
            Context applicationContext = getApplicationContext();
            uri = FileProvider.getUriForFile(applicationContext, String.valueOf(getApplicationContext().getPackageName()) + ".provider", this._file_hiffidj);
        } else {
            uri = Uri.fromFile(this._file_hiffidj);
        }
        this.hiffidj.putExtra("output", uri);
        this.hiffidj.addFlags(1);
        this.dialog = new AlertDialog.Builder(this);
        this.imageview22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Cashf_1Activity.this.getApplicationContext(), CejelsActivity.class);
                Cashf_1Activity.this.startActivity(intent);
                Cashf_1Activity.this.finish();
            }
        });
        this.text_name_c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        this.imageview20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Cashf_1Activity.this.getApplicationContext(), TipcashfActivity.class);
                intent.putExtra("ID_7", Cashf_1Activity.this.ID);
                intent.putExtra("N", Cashf_1Activity.this.Name);
                Cashf_1Activity.this.startActivity(intent);
                Cashf_1Activity.this.finish();
            }
        });
        this.image_tipi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Cashf_1Activity.this.codee.getString("Cod", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                    Intent intent = new Intent();
                    intent.setClass(Cashf_1Activity.this.getApplicationContext(), MainActivity.class);
                    Cashf_1Activity.this.startActivity(intent);
                    Cashf_1Activity.this.finish();
                    return;
                }
                Cashf_1Activity.this.n = 1.0d;
                Cashf_1Activity cashf_1Activity = Cashf_1Activity.this;
                cashf_1Activity._creat_pdf(cashf_1Activity.linear_pdf50);
            }
        });
        this.imageview24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Cashf_1Activity.this.codee.getString("Cod", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                    Intent intent = new Intent();
                    intent.setClass(Cashf_1Activity.this.getApplicationContext(), MainActivity.class);
                    Cashf_1Activity.this.startActivity(intent);
                    Cashf_1Activity.this.finish();
                    return;
                }
                Cashf_1Activity.this.n = 0.0d;
                Cashf_1Activity cashf_1Activity = Cashf_1Activity.this;
                cashf_1Activity._creat_pdf(cashf_1Activity.linear_pdf50);
            }
        });
        this._fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Cashf_1Activity.this.codee.getString("Cod", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                    Intent intent = new Intent();
                    intent.setClass(Cashf_1Activity.this.getApplicationContext(), MainActivity.class);
                    Cashf_1Activity.this.startActivity(intent);
                    Cashf_1Activity.this.finish();
                    return;
                }
                Cashf_1Activity cashf_1Activity = Cashf_1Activity.this;
                cashf_1Activity._dialog_edat7(cashf_1Activity.text_name_c5, "A", 0.0d, Cashf_1Activity.this.list_map);
            }
        });
    }

    private void initializeLogic() {
        try {
            this.ID = getIntent().getStringExtra("ID_7");
            this.Name = getIntent().getStringExtra("N");
            this.text_madah.setText("المادة : ".concat(this.sarveraz.getString(this.ID.concat("_".concat("madah")), BuildConfig.FLAVOR)));
            this.textview_savf.setText("الصف : ".concat(this.sarveraz.getString(this.ID.concat("_".concat("save")), BuildConfig.FLAVOR)));
            this.textview_nasf.setText("الفصل الدراسي : ".concat(this.sarveraz.getString(this.ID.concat("_".concat("name")), BuildConfig.FLAVOR)));
            this.text_name_c5.setText(this.Name);
            if (!this.sarveraz.getString(this.ID, BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                this.list_map = (ArrayList) new Gson().fromJson(this.sarveraz.getString(this.ID, BuildConfig.FLAVOR), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                }.getType());
            }
        } catch (Exception unused) {
            Intent intent = new Intent();
            intent.setClass(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
            finish();
        }
        _custam_start(this.textview1, 0.0d, "شهر اكتوبر 2024", this.list_map);
        _custam_start(this.text_0, 0.0d, "م", this.list_map);
        _custam_start(this.text_1, 0.0d, "إسم الطالب رباعيا", this.list_map);
        _custam_start(this.text_2, 0.0d, "الرقم المدرسي", this.list_map);
        _custam_start(this.text_3, 0.0d, "تحريري", this.list_map);
        _custam_start(this.text_4, 0.0d, "شفوي", this.list_map);
        _custam_start(this.text_5, 0.0d, "واجبات", this.list_map);
        _custam_start(this.text_6, 0.0d, "مواظبه", this.list_map);
        _custam_start(this.text_7, 0.0d, "مجموع", this.list_map);
        _custam_start(this.text_8, 0.0d, "محصله", this.list_map);
        this.linear1.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1968642));
        this.listview1.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1));
        _custam_start(this.text_shahr2, 0.0d, "شهر ديسنمبر 2024", this.list_map);
        _custam_start(this.text_0_2, 0.0d, "م", this.list_map);
        _custam_start(this.text_1_2, 0.0d, "إسم الطالب رباعيا", this.list_map);
        _custam_start(this.text_3_2, 0.0d, "تحريري", this.list_map);
        _custam_start(this.text_4_2, 0.0d, "شفوي", this.list_map);
        _custam_start(this.text_5_2, 0.0d, "واجبات", this.list_map);
        _custam_start(this.text_6_2, 0.0d, "مواظبه", this.list_map);
        _custam_start(this.text_7_2, 0.0d, "مجموع", this.list_map);
        _custam_start(this.text_8_2, 0.0d, "محصله", this.list_map);
        this.linear1_2.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1968642));
        this.listview1_2.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1));
        _custam_start(this.text_shahr3, 0.0d, "شهر ديسنمبر 2024", this.list_map);
        _custam_start(this.text_0_3, 0.0d, "م", this.list_map);
        _custam_start(this.text_1_3, 0.0d, "إسم الطالب رباعيا", this.list_map);
        _custam_start(this.text_3_3, 0.0d, "تحريري", this.list_map);
        _custam_start(this.text_4_3, 0.0d, "شفوي", this.list_map);
        _custam_start(this.text_5_3, 0.0d, "واجبات", this.list_map);
        _custam_start(this.text_6_3, 0.0d, "مواظبه", this.list_map);
        _custam_start(this.text_7_3, 0.0d, "مجموع", this.list_map);
        _custam_start(this.text_8_3, 0.0d, "محصله", this.list_map);
        this.linear1_3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1968642));
        this.listview1_3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1));
        _ss();
        _start_A();
        _custam_start(this.textview1_50, 0.0d, "شهر اكتوبر 2024", this.list_map);
        _custam_start(this.text_0_50, 0.0d, "م", this.list_map);
        _custam_start(this.text_1_50, 0.0d, "إسم الطالب رباعيا", this.list_map);
        _custam_start(this.text_2_50, 0.0d, "الرقم المدرسي", this.list_map);
        _custam_start(this.text_3_50, 0.0d, "تحريري", this.list_map);
        _custam_start(this.text_4_50, 0.0d, "شفوي", this.list_map);
        _custam_start(this.text_5_50, 0.0d, "واجبات", this.list_map);
        _custam_start(this.text_6_50, 0.0d, "مواظبه", this.list_map);
        _custam_start(this.text_7_50, 0.0d, "مجموع", this.list_map);
        _custam_start(this.text_8_50, 0.0d, "محصله", this.list_map);
        this.linear1_50.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1968642));
        this.listview1_50.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1));
        try {
            this.text_madah.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview_savf.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview_nasf.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.text_name_c5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        } catch (Exception unused2) {
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), CejelsActivity.class);
        startActivity(intent);
        finish();
    }

    public void _custamA(TextView textView, double d, String str, ArrayList<HashMap<String, Object>> arrayList) {
        int i = (int) d;
        try {
            textView.setText(arrayList.get(i).get(str).toString());
        } catch (Exception unused) {
            textView.setText(BuildConfig.FLAVOR);
            arrayList.get(i).put(str, BuildConfig.FLAVOR);
        }
        if (str.equals("0")) {
            textView.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1838339));
        } else if (str.equals("2")) {
            textView.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -328966));
        } else if (str.equals("7") || str.equals("13") || str.equals("19")) {
            textView.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1968642));
        } else if (str.equals("8") || str.equals("14") || str.equals("20")) {
            textView.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -476208));
        } else {
            textView.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1));
        }
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/u4_5899792387474983078.ttf"), 1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(4:1|2|3|(2:4|5))|8|(5:10|11|12|13|14)|17|18|19|20|21|22|23|24|25|27) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|(2:4|5)|8|(5:10|11|12|13|14)|17|18|19|20|21|22|23|24|25|27) */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|8|(5:10|11|12|13|14)|17|18|19|20|21|22|23|24|25|27) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x02b6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x02cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x02e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x02f8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _dialog_edat(double r32, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r38) {
        /*
            r31 = this;
            r12 = r31
            r13 = r38
            java.lang.String r0 = "fonts/font700.ttf"
            r1 = r32
            r12.positionsss = r1
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r12)
            android.app.AlertDialog r14 = r1.create()
            android.view.LayoutInflater r1 = r31.getLayoutInflater()
            r2 = 2131427383(0x7f0b0037, float:1.847638E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            r14.setView(r1)
            r15 = 1
            r14.requestWindowFeature(r15)
            android.view.Window r2 = r14.getWindow()
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
            r3 = 2131231482(0x7f0802fa, float:1.8079046E38)
            android.view.View r3 = r1.findViewById(r3)
            r11 = r3
            android.widget.TextView r11 = (android.widget.TextView) r11
            r3 = 2131231477(0x7f0802f5, float:1.8079036E38)
            android.view.View r3 = r1.findViewById(r3)
            r10 = r3
            android.widget.TextView r10 = (android.widget.TextView) r10
            r3 = 2131231115(0x7f08018b, float:1.8078302E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r5 = 2131231517(0x7f08031d, float:1.8079117E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2131230911(0x7f0800bf, float:1.8077888E38)
            android.view.View r6 = r1.findViewById(r6)
            r9 = r6
            android.widget.EditText r9 = (android.widget.EditText) r9
            r6 = 2131231128(0x7f080198, float:1.8078328E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r7 = 2131230912(0x7f0800c0, float:1.807789E38)
            android.view.View r7 = r1.findViewById(r7)
            r8 = r7
            android.widget.EditText r8 = (android.widget.EditText) r8
            r7 = 2131231518(0x7f08031e, float:1.807912E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r4 = 2131231133(0x7f08019d, float:1.8078338E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4 = 2131230913(0x7f0800c1, float:1.8077892E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.EditText r4 = (android.widget.EditText) r4
            r15 = 2131231519(0x7f08031f, float:1.8079121E38)
            android.view.View r15 = r1.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r13 = 2131231134(0x7f08019e, float:1.807834E38)
            android.view.View r13 = r1.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r16 = r14
            r14 = 2131230914(0x7f0800c2, float:1.8077894E38)
            android.view.View r14 = r1.findViewById(r14)
            android.widget.EditText r14 = (android.widget.EditText) r14
            r17 = r15
            r15 = 2131231520(0x7f080320, float:1.8079123E38)
            android.view.View r15 = r1.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r18 = r15
            r15 = 2131231135(0x7f08019f, float:1.8078342E38)
            android.view.View r15 = r1.findViewById(r15)
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            r19 = r7
            r7 = 2131230836(0x7f080074, float:1.8077736E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r20 = r5
            r5 = 2131231263(0x7f08021f, float:1.8078602E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r21 = r10
            r10 = 2131231136(0x7f0801a0, float:1.8078344E38)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r10 = 2131230970(0x7f0800fa, float:1.8078008E38)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r22 = r10
            r10 = 2131230971(0x7f0800fb, float:1.807801E38)
            android.view.View r1 = r1.findViewById(r10)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$21 r10 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$21
            r10.<init>()
            r23 = r1
            r1 = 2
            r24 = r0
            r0 = -2236963(0xffffffffffdddddd, float:NaN)
            r25 = r11
            r11 = -117901064(0xfffffffff8f8f8f8, float:-4.0398103E34)
            r26 = r14
            r14 = 1
            android.graphics.drawable.GradientDrawable r10 = r10.getIns(r1, r14, r0, r11)
            r3.setBackground(r10)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$22 r3 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$22
            r3.<init>()
            android.graphics.drawable.GradientDrawable r3 = r3.getIns(r1, r14, r0, r11)
            r6.setBackground(r3)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$23 r3 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$23
            r3.<init>()
            android.graphics.drawable.GradientDrawable r0 = r3.getIns(r1, r14, r0, r11)
            r13.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$24 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$24
            r0.<init>()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r1, r3, r6)
            r2.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$25 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$25
            r0.<init>()
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r1, r3, r6)
            r15.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$26 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$26
            r0.<init>()
            r1 = 20
            r2 = 1
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r2, r3, r6)
            r5.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$27 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$27
            r0.<init>()
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r2, r3, r6)
            r7.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$28 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$28
            r0.<init>()
            r6 = -1
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r2, r3, r6)
            r9.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$29 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$29
            r0.<init>()
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r2, r3, r6)
            r8.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$30 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$30
            r0.<init>()
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r2, r3, r6)
            r4.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$31 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$31
            r0.<init>()
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r2, r3, r6)
            r14 = r26
            r14.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$32 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$32
            r0.<init>()
            r3 = -13421773(0xffffffffff333333, float:-2.3819765E38)
            r6 = 0
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r2, r3, r6)
            r11 = r25
            r11.setBackground(r0)
            android.content.res.AssetManager r0 = r31.getAssets()     // Catch:{ Exception -> 0x0221 }
            r1 = r24
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0221 }
            r11.setTypeface(r0, r2)     // Catch:{ Exception -> 0x0221 }
            android.content.res.AssetManager r0 = r31.getAssets()     // Catch:{ Exception -> 0x0221 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0221 }
            r10 = r21
            r10.setTypeface(r0, r2)     // Catch:{ Exception -> 0x0223 }
            android.content.res.AssetManager r0 = r31.getAssets()     // Catch:{ Exception -> 0x0223 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0223 }
            r7.setTypeface(r0, r2)     // Catch:{ Exception -> 0x0223 }
            android.content.res.AssetManager r0 = r31.getAssets()     // Catch:{ Exception -> 0x0223 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0223 }
            r5.setTypeface(r0, r2)     // Catch:{ Exception -> 0x0223 }
            android.content.res.AssetManager r0 = r31.getAssets()     // Catch:{ Exception -> 0x0223 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0223 }
            r3 = r20
            r3.setTypeface(r0, r2)     // Catch:{ Exception -> 0x0223 }
            android.content.res.AssetManager r0 = r31.getAssets()     // Catch:{ Exception -> 0x0223 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0223 }
            r3 = r19
            r3.setTypeface(r0, r2)     // Catch:{ Exception -> 0x0223 }
            android.content.res.AssetManager r0 = r31.getAssets()     // Catch:{ Exception -> 0x0223 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0223 }
            r15 = r17
            r15.setTypeface(r0, r2)     // Catch:{ Exception -> 0x0223 }
            android.content.res.AssetManager r0 = r31.getAssets()     // Catch:{ Exception -> 0x0223 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0223 }
            r15 = r18
            r15.setTypeface(r0, r2)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0223
        L_0x0221:
            r10 = r21
        L_0x0223:
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$33 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$33
            r13 = r16
            r0.<init>(r14, r13)
            r7.setOnClickListener(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$34 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$34
            r0.<init>(r14, r13)
            r1 = r22
            r1.setOnClickListener(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$35 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$35
            r0.<init>()
            r1 = r23
            r1.setOnClickListener(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$36 r15 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$36
            r0 = r15
            r1 = r31
            r2 = r38
            r3 = r34
            r7 = r4
            r4 = r9
            r6 = r5
            r5 = r35
            r12 = r6
            r6 = r8
            r32 = r7
            r7 = r36
            r27 = r8
            r8 = r32
            r28 = r9
            r9 = r37
            r29 = r10
            r10 = r14
            r30 = r11
            r11 = r13
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.setOnClickListener(r15)
            r6 = r28
            r0 = 1
            r6.setTextIsSelectable(r0)
            r7 = r27
            r7.setTextIsSelectable(r0)
            r4 = r32
            r4.setTextIsSelectable(r0)
            r14.setTextIsSelectable(r0)
            r13.show()
            r0 = r31
            double r1 = r0.positionsss     // Catch:{ Exception -> 0x02b4 }
            int r1 = (int) r1
            r2 = r38
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x02b6 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r3 = "0"
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02b6 }
            r3 = r30
            r3.setText(r1)     // Catch:{ Exception -> 0x02b6 }
            double r8 = r0.positionsss     // Catch:{ Exception -> 0x02b6 }
            int r1 = (int) r8     // Catch:{ Exception -> 0x02b6 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x02b6 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r3 = "1"
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x02b6 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02b6 }
            r3 = r29
            r3.setText(r1)     // Catch:{ Exception -> 0x02b6 }
            goto L_0x02b6
        L_0x02b4:
            r2 = r38
        L_0x02b6:
            double r8 = r0.positionsss     // Catch:{ Exception -> 0x02cc }
            int r1 = (int) r8     // Catch:{ Exception -> 0x02cc }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x02cc }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x02cc }
            r3 = r34
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x02cc }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02cc }
            r6.setText(r1)     // Catch:{ Exception -> 0x02cc }
        L_0x02cc:
            double r8 = r0.positionsss     // Catch:{ Exception -> 0x02e2 }
            int r1 = (int) r8     // Catch:{ Exception -> 0x02e2 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x02e2 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x02e2 }
            r3 = r35
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x02e2 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02e2 }
            r7.setText(r1)     // Catch:{ Exception -> 0x02e2 }
        L_0x02e2:
            double r7 = r0.positionsss     // Catch:{ Exception -> 0x02f8 }
            int r1 = (int) r7     // Catch:{ Exception -> 0x02f8 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x02f8 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x02f8 }
            r3 = r36
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x02f8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02f8 }
            r4.setText(r1)     // Catch:{ Exception -> 0x02f8 }
        L_0x02f8:
            double r3 = r0.positionsss     // Catch:{ Exception -> 0x030e }
            int r1 = (int) r3     // Catch:{ Exception -> 0x030e }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x030e }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x030e }
            r2 = r37
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x030e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x030e }
            r14.setText(r1)     // Catch:{ Exception -> 0x030e }
        L_0x030e:
            r1 = 1
            r6.setEnabled(r1)
            r6.requestFocus()
            java.lang.String r2 = "input_method"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            r2.showSoftInput(r6, r1)
            android.text.Editable r1 = r6.getText()
            java.lang.String r1 = r1.toString()
            int r1 = r1.length()
            android.text.Editable r2 = r6.getText()
            java.lang.String r2 = r2.toString()
            int r2 = r2.length()
            r6.setSelection(r1, r2)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$37 r1 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$37
            r1.<init>(r6)
            r0.timer_5 = r1
            java.util.Timer r2 = r0._timer
            r3 = 50
            r2.schedule(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity._dialog_edat(double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    public void _custam_start(TextView textView, double d, String str, ArrayList<HashMap<String, Object>> arrayList) {
        textView.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1838339));
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_n.ttf"), 1);
        textView.setText(str);
        this.textview1.setText("الشهر الثالث");
        this.text_shahr2.setText("الشهر الثاني");
        this.text_shahr3.setText("الشهر الاول");
    }

    public void _start_A() {
        for (int i = 0; i < this.list_map.size(); i++) {
            double d = (double) i;
            _Fan(d, "3", "4", "5", "6", "7", "8", this.list_map);
            _Fan(d, "9", "10", "11", "12", "13", "14", this.list_map);
            _Fan(d, "15", "16", "17", "18", "19", "20", this.list_map);
        }
        try {
            SketchwareUtil.sortListMap(this.list_map, "1", false, true);
        } catch (Exception unused) {
        }
        this.sarveraz.edit().putString(this.ID, new Gson().toJson((Object) this.list_map)).commit();
        try {
            ((BaseAdapter) this.listview1.getAdapter()).notifyDataSetChanged();
        } catch (Exception unused2) {
            this.listview1.setAdapter(new Listview1Adapter(this.list_map));
            ((BaseAdapter) this.listview1.getAdapter()).notifyDataSetChanged();
        }
        try {
            ((BaseAdapter) this.listview1_2.getAdapter()).notifyDataSetChanged();
        } catch (Exception unused3) {
            this.listview1_2.setAdapter(new Listview1_2Adapter(this.list_map));
            ((BaseAdapter) this.listview1_2.getAdapter()).notifyDataSetChanged();
        }
        try {
            ((BaseAdapter) this.listview1_3.getAdapter()).notifyDataSetChanged();
        } catch (Exception unused4) {
            this.listview1_3.setAdapter(new Listview1_3Adapter(this.list_map));
            ((BaseAdapter) this.listview1_3.getAdapter()).notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:5|6|7|(4:8|9|(1:11)(4:13|14|15|16)|12)|23|24|25|26|27|28|(2:29|30)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x038c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _dialog_edat7(android.widget.TextView r20, java.lang.String r21, double r22, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r24) {
        /*
            r19 = this;
            r9 = r19
            java.lang.String r0 = "fonts/font.ttf"
            java.lang.String r1 = "fonts/nasa_soft44.ttf"
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r9)
            android.app.AlertDialog r10 = r2.create()
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            android.content.Context r2 = r19.getApplicationContext()
            r11.<init>(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r12 = -1
            r2.<init>(r12, r12)
            r11.setLayoutParams(r2)
            r13 = 1
            r11.setOrientation(r13)
            r2 = 17
            r11.setGravity(r2)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r4 = r19.getApplicationContext()
            r3.<init>(r4)
            r3.setOrientation(r13)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r14 = -2
            r5 = 0
            r4.<init>(r12, r14, r5)
            r6 = 2
            r4.setMargins(r6, r6, r6, r6)
            r3.setLayoutParams(r4)
            r4 = 12
            r3.setPadding(r4, r4, r4, r4)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            android.content.Context r8 = r19.getApplicationContext()
            r7.<init>(r8)
            r15 = 0
            r7.setOrientation(r15)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r15 = 80
            r8.<init>(r12, r15, r5)
            r15 = 4
            r8.setMargins(r13, r13, r13, r15)
            r7.setLayoutParams(r8)
            r7.setPadding(r4, r4, r4, r4)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$39 r4 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$39
            r4.<init>()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r15 = -657931(0xfffffffffff5f5f5, float:NaN)
            android.graphics.drawable.GradientDrawable r4 = r4.getIns(r6, r13, r8, r15)
            r7.setBackground(r4)
            r3.setGravity(r2)
            android.widget.EditText r4 = new android.widget.EditText
            android.content.Context r15 = r19.getApplicationContext()
            r4.<init>(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r15.<init>(r12, r14, r8)
            r15.setMargins(r6, r6, r6, r6)
            r4.setLayoutParams(r15)
            r15 = 53
            r4.setGravity(r15)
            android.widget.ImageView r15 = new android.widget.ImageView
            android.content.Context r8 = r19.getApplicationContext()
            r15.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r6 = 45
            r8.<init>(r6, r12, r5)
            r8.setMargins(r13, r13, r13, r13)
            r15.setLayoutParams(r8)
            r6 = 2131165414(0x7f0700e6, float:1.7945044E38)
            r15.setImageResource(r6)
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            r15.setScaleType(r6)
            r7.addView(r15)
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r8 = r19.getApplicationContext()
            r6.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r13 = 80
            r8.<init>(r12, r13, r5)
            r6.setLayoutParams(r8)
            r8 = -1499549(0xffffffffffe91e63, float:NaN)
            r6.setTextColor(r8)
            r8 = 1096810496(0x41600000, float:14.0)
            r6.setTextSize(r8)
            r6.setGravity(r2)
            r7.addView(r6)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r12, r14, r5)
            r13 = 0
            r14 = 2
            r8.setMargins(r14, r14, r14, r13)
            r6.setLayoutParams(r8)
            r3.addView(r7)
            r4.setGravity(r2)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            android.content.Context r8 = r19.getApplicationContext()
            r7.<init>(r8)
            r7.setOrientation(r13)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r2 = 3
            r8.<init>(r12, r2, r5)
            r8.setMargins(r13, r14, r14, r13)
            r7.setLayoutParams(r8)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$40 r8 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$40
            r8.<init>()
            r13 = -6381922(0xffffffffff9e9e9e, float:NaN)
            r2 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r8 = r8.getIns(r14, r14, r13, r2)
            r7.setBackground(r8)
            r3.addView(r7)
            android.widget.ImageView r7 = new android.widget.ImageView
            android.content.Context r8 = r19.getApplicationContext()
            r7.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r13 = 350(0x15e, float:4.9E-43)
            r8.<init>(r12, r13, r5)
            r8.setMargins(r14, r14, r14, r14)
            r7.setLayoutParams(r8)
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.FIT_CENTER
            r7.setScaleType(r8)
            r3.addView(r7)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$41 r8 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$41
            r8.<init>()
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.GradientDrawable r8 = r8.getIns(r14, r14, r13, r12)
            r7.setBackground(r8)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            android.content.Context r13 = r19.getApplicationContext()
            r8.<init>(r13)
            r13 = 0
            r8.setOrientation(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r2 = 1065353216(0x3f800000, float:1.0)
            r5 = -2
            r13.<init>(r12, r5, r2)
            r2 = 3
            r13.setMargins(r14, r2, r2, r14)
            r8.setLayoutParams(r13)
            r2 = 53
            r8.setGravity(r2)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$42 r2 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$42
            r2.<init>()
            r5 = -6381922(0xffffffffff9e9e9e, float:NaN)
            r13 = -657931(0xfffffffffff5f5f5, float:NaN)
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r14, r14, r5, r13)
            r8.setBackground(r2)
            r8.addView(r4)
            r3.addView(r8)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r5 = r19.getApplicationContext()
            r2.<init>(r5)
            r5 = 0
            r2.setOrientation(r5)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r13 = 3
            r14 = 0
            r8.<init>(r12, r13, r14)
            r13 = 4
            r8.setMargins(r5, r13, r5, r13)
            r2.setLayoutParams(r8)
            r3.addView(r2)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$43 r8 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$43
            r8.<init>()
            r13 = -1118482(0xffffffffffeeeeee, float:NaN)
            r14 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.GradientDrawable r8 = r8.getIns(r5, r5, r14, r13)
            r2.setBackground(r8)
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r5 = r19.getApplicationContext()
            r2.<init>(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r8 = 60
            r13 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r12, r8, r13)
            r2.setLayoutParams(r5)
            r5 = -59580(0xffffffffffff1744, float:NaN)
            r2.setTextColor(r5)
            r5 = 1097859072(0x41700000, float:15.0)
            r2.setTextSize(r5)
            java.lang.String r13 = "هل تريد الحفظ ؟"
            r2.setText(r13)
            r13 = 17
            r2.setGravity(r13)
            r3.addView(r2)
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            android.content.Context r14 = r19.getApplicationContext()
            r13.<init>(r14)
            r14 = 0
            r13.setOrientation(r14)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r14 = 0
            r8.<init>(r12, r5, r14)
            r5 = 8
            r12 = 1
            r14 = 0
            r8.setMargins(r14, r5, r12, r14)
            r13.setLayoutParams(r8)
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r12 = r19.getApplicationContext()
            r8.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r14 = 120(0x78, float:1.68E-43)
            r5 = 50
            r17 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.<init>(r14, r5, r0)
            r8.setLayoutParams(r12)
            r0 = -1499549(0xffffffffffe91e63, float:NaN)
            r8.setTextColor(r0)
            r0 = 1097859072(0x41700000, float:15.0)
            r8.setTextSize(r0)
            java.lang.String r0 = "cancel"
            r8.setText(r0)
            r0 = 17
            r8.setGravity(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$44 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$44
            r0.<init>(r4, r10)
            r8.setOnClickListener(r0)
            r13.addView(r8)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r5 = 200(0xc8, float:2.8E-43)
            r12 = 60
            r14 = 0
            r0.<init>(r5, r12, r14)
            r5 = 10
            r12 = 1
            r0.setMargins(r5, r12, r12, r5)
            r8.setLayoutParams(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$45 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$45
            r0.<init>()
            r12 = 20
            r18 = r10
            r5 = 3
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r14 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r12, r5, r10, r14)
            r8.setBackground(r0)
            android.widget.TextView r10 = new android.widget.TextView
            android.content.Context r0 = r19.getApplicationContext()
            r10.<init>(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r5 = 150(0x96, float:2.1E-43)
            r12 = 45
            r14 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r5, r12, r14)
            r10.setLayoutParams(r0)
            r0 = -59580(0xffffffffffff1744, float:NaN)
            r10.setTextColor(r0)
            r0 = 1097859072(0x41700000, float:15.0)
            r10.setTextSize(r0)
            java.lang.String r0 = "ok"
            r10.setText(r0)
            r0 = 17
            r10.setGravity(r0)
            r13.addView(r10)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r5 = 200(0xc8, float:2.8E-43)
            r12 = 60
            r14 = 0
            r0.<init>(r5, r12, r14)
            r5 = 10
            r12 = 1
            r0.setMargins(r5, r12, r12, r5)
            r10.setLayoutParams(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$46 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$46
            r0.<init>()
            r5 = 20
            r16 = r7
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12 = 3
            r14 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r5, r12, r7, r14)
            r10.setBackground(r0)
            r0 = -1
            r3.setBackgroundColor(r0)
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$47 r5 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$47
            r5.<init>()
            r12 = 1
            r14 = 2
            android.graphics.drawable.GradientDrawable r5 = r5.getIns(r14, r12, r7, r0)
            r4.setBackground(r5)
            r3.addView(r13)
            r11.addView(r3)
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch:{ Exception -> 0x02fb }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x02fb }
            r2.setTypeface(r0, r12)     // Catch:{ Exception -> 0x02fb }
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch:{ Exception -> 0x02fb }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x02fb }
            r6.setTypeface(r0, r12)     // Catch:{ Exception -> 0x02fb }
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch:{ Exception -> 0x02fb }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x02fb }
            r10.setTypeface(r0, r12)     // Catch:{ Exception -> 0x02fb }
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch:{ Exception -> 0x02fb }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x02fb }
            r8.setTypeface(r0, r12)     // Catch:{ Exception -> 0x02fb }
        L_0x02fb:
            java.lang.String r0 = ""
            r4.setText(r0)
            java.lang.String r0 = "هل تريد حفظ هذا الاسم ؟"
            r2.setText(r0)     // Catch:{ Exception -> 0x03af }
            java.lang.String r0 = "A"
            r7 = r21
            boolean r0 = r7.equals(r0)     // Catch:{ Exception -> 0x0352 }
            if (r0 == 0) goto L_0x0325
            r0 = 8
            r15.setVisibility(r0)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r0 = "إضافه إسم طالب "
            r6.setText(r0)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r0 = ""
            r4.setText(r0)     // Catch:{ Exception -> 0x0352 }
            r12 = r22
            r8 = r24
        L_0x0322:
            r0 = r16
            goto L_0x035d
        L_0x0325:
            r0 = 2131165381(0x7f0700c5, float:1.7944978E38)
            r15.setImageResource(r0)     // Catch:{ Exception -> 0x0352 }
            r0 = -65536(0xffffffffffff0000, float:NaN)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ Exception -> 0x0352 }
            r15.setColorFilter(r0, r1)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r0 = "تعديل إسم الطالب"
            r6.setText(r0)     // Catch:{ Exception -> 0x0352 }
            r12 = r22
            int r0 = (int) r12
            r8 = r24
            java.lang.Object r0 = r8.get(r0)     // Catch:{ Exception -> 0x0356 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0356 }
            java.lang.String r1 = "1"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0356 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0356 }
            r4.setText(r0)     // Catch:{ Exception -> 0x0356 }
            goto L_0x0322
        L_0x0350:
            r7 = r21
        L_0x0352:
            r12 = r22
            r8 = r24
        L_0x0356:
            r0 = r16
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x03b3 }
        L_0x035d:
            java.lang.String r1 = "إكتب إسم الطالب"
            r4.setHint(r1)     // Catch:{ Exception -> 0x03b3 }
            r1 = 2131165299(0x7f070073, float:1.7944811E38)
            r0.setImageResource(r1)     // Catch:{ Exception -> 0x03b3 }
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch:{ Exception -> 0x038c }
            r1 = r17
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x038c }
            r3 = 1
            r6.setTypeface(r0, r3)     // Catch:{ Exception -> 0x038c }
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch:{ Exception -> 0x038c }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x038c }
            r2.setTypeface(r0, r3)     // Catch:{ Exception -> 0x038c }
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch:{ Exception -> 0x038c }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x038c }
            r4.setTypeface(r0, r3)     // Catch:{ Exception -> 0x038c }
        L_0x038c:
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$48 r14 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$48     // Catch:{ Exception -> 0x03b3 }
            r0 = r14
            r1 = r19
            r2 = r4
            r3 = r24
            r6 = r4
            r4 = r22
            r12 = r6
            r6 = r18
            r0.<init>(r2, r3, r4, r6)     // Catch:{ Exception -> 0x03b4 }
            r15.setOnClickListener(r14)     // Catch:{ Exception -> 0x03b4 }
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$49 r0 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$49     // Catch:{ Exception -> 0x03b4 }
            r0.<init>(r12)     // Catch:{ Exception -> 0x03b4 }
            r9.timer_5 = r0     // Catch:{ Exception -> 0x03b4 }
            java.util.Timer r1 = r9._timer     // Catch:{ Exception -> 0x03b4 }
            r2 = 54
            r1.schedule(r0, r2)     // Catch:{ Exception -> 0x03b4 }
            goto L_0x03b4
        L_0x03af:
            r7 = r21
            r8 = r24
        L_0x03b3:
            r12 = r4
        L_0x03b4:
            com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$50 r13 = new com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity$50
            r0 = r13
            r1 = r19
            r2 = r12
            r3 = r21
            r4 = r24
            r5 = r22
            r7 = r20
            r8 = r18
            r0.<init>(r2, r3, r4, r5, r7, r8)
            r10.setOnClickListener(r13)
            r0 = 1
            r12.setEnabled(r0)     // Catch:{ Exception -> 0x03f7 }
            r12.requestFocus()     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r1 = "input_method"
            java.lang.Object r1 = r9.getSystemService(r1)     // Catch:{ Exception -> 0x03f7 }
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1     // Catch:{ Exception -> 0x03f7 }
            r1.showSoftInput(r12, r0)     // Catch:{ Exception -> 0x03f7 }
            android.text.Editable r0 = r12.getText()     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03f7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x03f7 }
            android.text.Editable r1 = r12.getText()     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x03f7 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x03f7 }
            r12.setSelection(r0, r1)     // Catch:{ Exception -> 0x03f7 }
        L_0x03f7:
            r0 = r18
            r0.setView(r11)
            r0.show()
            android.view.Window r1 = r0.getWindow()
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = 0
            r2.<init>(r3)
            r1.setBackgroundDrawable(r2)
            android.view.Window r0 = r0.getWindow()
            r1 = -2
            r2 = -1
            r0.setLayout(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity._dialog_edat7(android.widget.TextView, java.lang.String, double, java.util.ArrayList):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _Fan(double r3, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r11) {
        /*
            r2 = this;
            r0 = 0
            r2.k1 = r0
            r2.k2 = r0
            r2.k3 = r0
            r2.k4 = r0
            r2.k5 = r0
            r2.k6 = r0
            int r3 = (int) r3
            java.lang.Object r4 = r11.get(r3)     // Catch:{ Exception -> 0x0023 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x0023 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0023 }
            double r4 = java.lang.Double.parseDouble(r4)     // Catch:{ Exception -> 0x0023 }
            r2.k1 = r4     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            java.lang.Object r4 = r11.get(r3)     // Catch:{ Exception -> 0x0037 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x0037 }
            java.lang.Object r4 = r4.get(r6)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0037 }
            double r4 = java.lang.Double.parseDouble(r4)     // Catch:{ Exception -> 0x0037 }
            r2.k2 = r4     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            java.lang.Object r4 = r11.get(r3)     // Catch:{ Exception -> 0x004b }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x004b }
            java.lang.Object r4 = r4.get(r7)     // Catch:{ Exception -> 0x004b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x004b }
            double r4 = java.lang.Double.parseDouble(r4)     // Catch:{ Exception -> 0x004b }
            r2.k3 = r4     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            java.lang.Object r4 = r11.get(r3)     // Catch:{ Exception -> 0x005f }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x005f }
            java.lang.Object r4 = r4.get(r8)     // Catch:{ Exception -> 0x005f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x005f }
            double r4 = java.lang.Double.parseDouble(r4)     // Catch:{ Exception -> 0x005f }
            r2.k4 = r4     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            double r4 = r2.k1     // Catch:{ Exception -> 0x006c }
            double r6 = r2.k2     // Catch:{ Exception -> 0x006c }
            double r4 = r4 + r6
            double r6 = r2.k3     // Catch:{ Exception -> 0x006c }
            double r4 = r4 + r6
            double r6 = r2.k4     // Catch:{ Exception -> 0x006c }
            double r4 = r4 + r6
            r2.k5 = r4     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            double r4 = r2.k5     // Catch:{ Exception -> 0x0077 }
            r6 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)     // Catch:{ Exception -> 0x0077 }
            r2.k6 = r4     // Catch:{ Exception -> 0x0077 }
        L_0x0077:
            java.lang.Object r4 = r11.get(r3)     // Catch:{ Exception -> 0x0097 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x0097 }
            double r5 = r2.k5     // Catch:{ Exception -> 0x0097 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0097 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0097 }
            r4.put(r9, r5)     // Catch:{ Exception -> 0x0097 }
            java.lang.Object r3 = r11.get(r3)     // Catch:{ Exception -> 0x0097 }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x0097 }
            double r4 = r2.k6     // Catch:{ Exception -> 0x0097 }
            long r4 = (long) r4     // Catch:{ Exception -> 0x0097 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0097 }
            r3.put(r10, r4)     // Catch:{ Exception -> 0x0097 }
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.Cashf_1Activity._Fan(double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    public void _ss() {
        this.position_number = 3.0d;
        try {
            this.position_number = Double.parseDouble(this.sarveraz.getString(this.ID.concat("pooos"), BuildConfig.FLAVOR));
        } catch (Exception unused) {
        }
        ViewPager viewPager2 = new ViewPager(this);
        this.viewPager = viewPager2;
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.viewPager.setAdapter(new MyPagerAdapter(this, (MyPagerAdapter) null));
        this.viewPager.setCurrentItem((int) this.position_number);
        this.base.addView(this.viewPager);
        this.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                Cashf_1Activity.this.position_number = (double) i;
                if (Cashf_1Activity.this.position_number == 0.0d) {
                    Cashf_1Activity.this.sarveraz.edit().putString(Cashf_1Activity.this.ID.concat("pooos"), String.valueOf((long) Cashf_1Activity.this.position_number)).commit();
                } else if (Cashf_1Activity.this.position_number == 1.0d) {
                    Cashf_1Activity.this.sarveraz.edit().putString(Cashf_1Activity.this.ID.concat("pooos"), String.valueOf((long) Cashf_1Activity.this.position_number)).commit();
                } else if (Cashf_1Activity.this.position_number == 2.0d) {
                    Cashf_1Activity.this.sarveraz.edit().putString(Cashf_1Activity.this.ID.concat("pooos"), String.valueOf((long) Cashf_1Activity.this.position_number)).commit();
                }
            }
        });
        TabLayout tabLayout2 = new TabLayout(this);
        this.tabLayout = tabLayout2;
        tabLayout2.setTabGravity(0);
        this.tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        this.tabLayout.setTabTextColors(Color.parseColor("#EEEEEE"), Color.parseColor("#FFFFFF"));
        this.tabLayout.setupWithViewPager(this.viewPager);
        this.tabLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 45, 1.0f));
        this.tablayout.addView(this.tabLayout);
    }

    private class MyPagerAdapter extends PagerAdapter {
        public int getCount() {
            return 3;
        }

        public Parcelable saveState() {
            return null;
        }

        private MyPagerAdapter() {
        }

        /* synthetic */ MyPagerAdapter(Cashf_1Activity cashf_1Activity, MyPagerAdapter myPagerAdapter) {
            this();
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View inflate = ((LayoutInflater) Cashf_1Activity.this.getBaseContext().getSystemService("layout_inflater")).inflate(R.layout.empty, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.linear1);
            if (i == 0) {
                ViewGroup viewGroup2 = (ViewGroup) Cashf_1Activity.this.layout1.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(Cashf_1Activity.this.layout1);
                }
                linearLayout.addView(Cashf_1Activity.this.layout1);
            } else if (i == 1) {
                ViewGroup viewGroup3 = (ViewGroup) Cashf_1Activity.this.layout2.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(Cashf_1Activity.this.layout2);
                }
                linearLayout.addView(Cashf_1Activity.this.layout2);
            } else if (i == 2) {
                ViewGroup viewGroup4 = (ViewGroup) Cashf_1Activity.this.layout3.getParent();
                if (viewGroup4 != null) {
                    viewGroup4.removeView(Cashf_1Activity.this.layout3);
                }
                linearLayout.addView(Cashf_1Activity.this.layout3);
            }
            viewGroup.addView(inflate, 0);
            return inflate;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            View view = (View) obj;
            viewGroup.removeView(view);
            Cashf_1Activity.this.trash.addView(view);
        }

        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                return "الشهر الثالث";
            }
            if (i == 1) {
                return "الشهر الثاني";
            }
            if (i == 2) {
                return "الشهر الاول";
            }
            return "page " + i;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == ((View) obj);
        }
    }

    public void _creat_pdf(View view) {
        this.Path = "/sdcard/دفتر الامتحانات/السجلات/";
        String str = this.Name;
        StringBuilder sb = new StringBuilder();
        sb.append((int) this.position_number);
        this.file_name = str.concat(sb.toString()).concat(".pdf");
        this.T500o = 0.0d;
        if (!FileUtil.isDirectory(this.Path)) {
            FileUtil.makeDir(this.Path);
        }
        PD(new PdfDocument(), view);
    }

    public void PD(final PdfDocument pdfDocument, final View view) {
        this.list_pdf.clear();
        for (int i = 0; i < 27; i++) {
            try {
                HashMap<String, Object> hashMap = this.list_map.get((int) this.T500o);
                this.map = hashMap;
                this.list_pdf.add(hashMap);
            } catch (Exception unused) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                this.list_pdf.add(hashMap2);
            }
            this.T500o += 1.0d;
        }
        double d = this.position_number;
        if (d == 0.0d) {
            this.textview1_50.setText("الشهر الثالث");
        } else if (d == 1.0d) {
            this.textview1_50.setText("الشهر الثاني");
        } else {
            this.textview1_50.setText("الشهر الاول");
        }
        try {
            this.listview1_50.setAdapter(new Listview1_50Adapter(this.list_pdf));
            ((BaseAdapter) this.listview1_50.getAdapter()).notifyDataSetChanged();
        } catch (Exception unused2) {
        }
        AnonymousClass52 r0 = new TimerTask() {
            public void run() {
                Cashf_1Activity cashf_1Activity = Cashf_1Activity.this;
                final View view = view;
                final PdfDocument pdfDocument = pdfDocument;
                cashf_1Activity.runOnUiThread(new Runnable() {
                    public void run() {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        int i = (int) (((double) height) * 0.707d);
                        if (width >= height) {
                            height = (int) (((double) width) / 0.707d);
                        } else if (width < i) {
                            width = i;
                        }
                        try {
                            PdfDocument.Page startPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(width, height, 1).create());
                            view.draw(startPage.getCanvas());
                            pdfDocument.finishPage(startPage);
                        } catch (Exception unused) {
                        }
                        if (Cashf_1Activity.this.T500o < ((double) Cashf_1Activity.this.list_map.size())) {
                            Cashf_1Activity.this.PD(pdfDocument, view);
                        } else {
                            Cashf_1Activity.this.saveD(Cashf_1Activity.this.Path, Cashf_1Activity.this.file_name, pdfDocument, (int) Cashf_1Activity.this.n);
                        }
                    }
                });
            }
        };
        this.timer_5 = r0;
        this._timer.schedule(r0, 250);
    }

    public void saveD(final String str, final String str2, PdfDocument pdfDocument, final int i) {
        FileOutputStream fileOutputStream;
        Throwable th = null;
        try {
            fileOutputStream = new FileOutputStream(String.valueOf(str) + str2);
            pdfDocument.writeTo(fileOutputStream);
            fileOutputStream.close();
            pdfDocument.close();
            fileOutputStream.close();
            AnonymousClass53 r7 = new TimerTask() {
                public void run() {
                    Cashf_1Activity cashf_1Activity = Cashf_1Activity.this;
                    final String str = str;
                    final String str2 = str2;
                    final int i = i;
                    cashf_1Activity.runOnUiThread(new Runnable() {
                        public void run() {
                            Context applicationContext = Cashf_1Activity.this.getApplicationContext();
                            SketchwareUtil.showMessage(applicationContext, "تم تصدير pdf الى المسار \n".concat(String.valueOf(str) + str2));
                            Cashf_1Activity access$0 = Cashf_1Activity.this;
                            final int i = i;
                            final String str = str;
                            final String str2 = str2;
                            access$0.timer_5 = new TimerTask() {
                                public void run() {
                                    Cashf_1Activity access$0 = Cashf_1Activity.this;
                                    final int i = i;
                                    final String str = str;
                                    final String str2 = str2;
                                    access$0.runOnUiThread(new Runnable() {
                                        public void run() {
                                            if (i == 0) {
                                                Cashf_1Activity access$0 = Cashf_1Activity.this;
                                                access$0.Tipping(String.valueOf(str) + str2);
                                                return;
                                            }
                                            try {
                                                Uri parse = Uri.parse(String.valueOf(str) + str2);
                                                Intent intent = new Intent("android.intent.action.SEND");
                                                intent.addFlags(524288);
                                                intent.setType("application/pdf");
                                                intent.putExtra("android.intent.extra.STREAM", parse);
                                                Cashf_1Activity.this.startActivity(Intent.createChooser(intent, "مشاركه السند عبر"));
                                            } catch (Exception unused) {
                                            }
                                        }
                                    });
                                }
                            };
                            Cashf_1Activity.this._timer.schedule(Cashf_1Activity.this.timer_5, 150);
                        }
                    });
                }
            };
            this.timer_5 = r7;
            this._timer.schedule(r7, 250);
        } catch (Throwable th2) {
            th = th2;
            if (th != null) {
                if (th != th) {
                    try {
                        th.addSuppressed(th);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                th = th;
            }
            throw th;
        }
    }

    public void Tipping(String str) {
        new Intent();
        if (Build.VERSION.SDK_INT >= 24) {
            File file = new File(str);
            Uri uriForFile = FileProvider.getUriForFile(this, String.valueOf(getPackageName()) + ".provider", file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uriForFile);
            intent.setFlags(1);
            startActivity(intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setDataAndType(Uri.parse(str), "application/pdf");
        Intent createChooser = Intent.createChooser(intent2, "Open File");
        createChooser.addFlags(268435456);
        startActivity(createChooser);
    }

    public class Listview1Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public long getItemId(int i) {
            return (long) i;
        }

        public Listview1Adapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        public int getCount() {
            return this._data.size();
        }

        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            final int i2 = i;
            View inflate = view == null ? Cashf_1Activity.this.getLayoutInflater().inflate(R.layout.coostam, (ViewGroup) null) : view;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.linear2);
            final TextView textView = (TextView) inflate.findViewById(R.id.text_1);
            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.linear3);
            double d = (double) i2;
            double d2 = d;
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_0), d, "0", this._data);
            Cashf_1Activity.this._custamA(textView, d2, "1", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_2), d2, "2", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_3), d2, "3", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_4), d2, "4", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_5), d2, "5", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_6), d2, "6", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_7), d2, "7", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_8), d2, "8", this._data);
            ((LinearLayout) inflate.findViewById(R.id.linear1)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Cashf_1Activity.this._dialog_edat((double) i2, "3", "4", "5", "6", Listview1Adapter.this._data);
                }
            });
            textView.setTypeface(Typeface.createFromAsset(Cashf_1Activity.this.getAssets(), "fonts/nasa_n.ttf"), 1);
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Cashf_1Activity.this._dialog_edat7(textView, "E", (double) i2, Listview1Adapter.this._data);
                }
            });
            return inflate;
        }
    }

    public class Listview1_2Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public long getItemId(int i) {
            return (long) i;
        }

        public Listview1_2Adapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        public int getCount() {
            return this._data.size();
        }

        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            final int i2 = i;
            View inflate = view == null ? Cashf_1Activity.this.getLayoutInflater().inflate(R.layout.coostam, (ViewGroup) null) : view;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.linear2);
            final TextView textView = (TextView) inflate.findViewById(R.id.text_1);
            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.linear3);
            double d = (double) i2;
            double d2 = d;
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_0), d, "0", this._data);
            Cashf_1Activity.this._custamA(textView, d2, "1", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_2), d2, "2", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_3), d2, "9", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_4), d2, "10", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_5), d2, "11", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_6), d2, "12", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_7), d2, "13", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_8), d2, "14", this._data);
            ((LinearLayout) inflate.findViewById(R.id.linear1)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Cashf_1Activity.this._dialog_edat((double) i2, "9", "10", "11", "12", Listview1_2Adapter.this._data);
                }
            });
            textView.setTypeface(Typeface.createFromAsset(Cashf_1Activity.this.getAssets(), "fonts/nasa_n.ttf"), 1);
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Cashf_1Activity.this._dialog_edat7(textView, "E", (double) i2, Listview1_2Adapter.this._data);
                }
            });
            return inflate;
        }
    }

    public class Listview1_3Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public long getItemId(int i) {
            return (long) i;
        }

        public Listview1_3Adapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        public int getCount() {
            return this._data.size();
        }

        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            final int i2 = i;
            View inflate = view == null ? Cashf_1Activity.this.getLayoutInflater().inflate(R.layout.coostam, (ViewGroup) null) : view;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.linear2);
            final TextView textView = (TextView) inflate.findViewById(R.id.text_1);
            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.linear3);
            double d = (double) i2;
            double d2 = d;
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_0), d, "0", this._data);
            Cashf_1Activity.this._custamA(textView, d2, "1", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_2), d2, "2", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_3), d2, "15", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_4), d2, "16", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_5), d2, "17", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_6), d2, "18", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_7), d2, "19", this._data);
            Cashf_1Activity.this._custamA((TextView) inflate.findViewById(R.id.text_8), d2, "20", this._data);
            ((LinearLayout) inflate.findViewById(R.id.linear1)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Cashf_1Activity.this._dialog_edat((double) i2, "15", "16", "17", "18", Listview1_3Adapter.this._data);
                }
            });
            textView.setTypeface(Typeface.createFromAsset(Cashf_1Activity.this.getAssets(), "fonts/nasa_n.ttf"), 1);
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Cashf_1Activity.this._dialog_edat7(textView, "E", (double) i2, Listview1_3Adapter.this._data);
                }
            });
            return inflate;
        }
    }

    public class Listview1_50Adapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public long getItemId(int i) {
            return (long) i;
        }

        public Listview1_50Adapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        public int getCount() {
            return this._data.size();
        }

        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2 = i;
            View inflate = view == null ? Cashf_1Activity.this.getLayoutInflater().inflate(R.layout.coostam, (ViewGroup) null) : view;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.linear1);
            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.linear2);
            TextView textView = (TextView) inflate.findViewById(R.id.text_2);
            TextView textView2 = (TextView) inflate.findViewById(R.id.text_1);
            TextView textView3 = (TextView) inflate.findViewById(R.id.text_0);
            LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R.id.linear3);
            TextView textView4 = (TextView) inflate.findViewById(R.id.text_8);
            TextView textView5 = (TextView) inflate.findViewById(R.id.text_7);
            TextView textView6 = (TextView) inflate.findViewById(R.id.text_6);
            TextView textView7 = (TextView) inflate.findViewById(R.id.text_5);
            TextView textView8 = (TextView) inflate.findViewById(R.id.text_4);
            TextView textView9 = (TextView) inflate.findViewById(R.id.text_3);
            if (Cashf_1Activity.this.position_number == 0.0d) {
                double d = (double) i2;
                double d2 = d;
                Cashf_1Activity.this._custamA(textView3, d, "0", this._data);
                Cashf_1Activity.this._custamA(textView2, d2, "1", this._data);
                Cashf_1Activity.this._custamA(textView, d2, "2", this._data);
                Cashf_1Activity.this._custamA(textView9, d2, "3", this._data);
                Cashf_1Activity.this._custamA(textView8, d2, "4", this._data);
                Cashf_1Activity.this._custamA(textView7, d2, "5", this._data);
                Cashf_1Activity.this._custamA(textView6, d2, "6", this._data);
                Cashf_1Activity.this._custamA(textView5, d2, "7", this._data);
                Cashf_1Activity.this._custamA(textView4, d2, "8", this._data);
            } else if (Cashf_1Activity.this.position_number == 1.0d) {
                double d3 = (double) i2;
                double d4 = d3;
                Cashf_1Activity.this._custamA(textView3, d3, "0", this._data);
                Cashf_1Activity.this._custamA(textView2, d4, "1", this._data);
                Cashf_1Activity.this._custamA(textView, d4, "2", this._data);
                Cashf_1Activity.this._custamA(textView9, d4, "9", this._data);
                Cashf_1Activity.this._custamA(textView8, d4, "10", this._data);
                Cashf_1Activity.this._custamA(textView7, d4, "11", this._data);
                Cashf_1Activity.this._custamA(textView6, d4, "12", this._data);
                Cashf_1Activity.this._custamA(textView5, d4, "13", this._data);
                Cashf_1Activity.this._custamA(textView4, d4, "14", this._data);
            } else {
                double d5 = (double) i2;
                double d6 = d5;
                Cashf_1Activity.this._custamA(textView3, d5, "0", this._data);
                Cashf_1Activity.this._custamA(textView2, d6, "1", this._data);
                Cashf_1Activity.this._custamA(textView, d6, "2", this._data);
                Cashf_1Activity.this._custamA(textView9, d6, "15", this._data);
                Cashf_1Activity.this._custamA(textView8, d6, "16", this._data);
                Cashf_1Activity.this._custamA(textView7, d6, "17", this._data);
                Cashf_1Activity.this._custamA(textView6, d6, "18", this._data);
                Cashf_1Activity.this._custamA(textView5, d6, "19", this._data);
                Cashf_1Activity.this._custamA(textView4, d6, "20", this._data);
            }
            textView2.setTypeface(Typeface.createFromAsset(Cashf_1Activity.this.getAssets(), "fonts/nasa_n.ttf"), 1);
            return inflate;
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
    public int getRandom(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            if (checkedItemPositions.valueAt(i)) {
                arrayList.add(Double.valueOf((double) checkedItemPositions.keyAt(i)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int i) {
        return TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
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
