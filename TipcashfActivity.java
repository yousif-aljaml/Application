package com.Nasa.Soft.Exzam.Editor35;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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

public class TipcashfActivity extends AppCompatActivity {
    private String ID = BuildConfig.FLAVOR;
    private String Name = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Path = BuildConfig.FLAVOR;
    public final int REQ_CD_KHVDKHV = 101;
    /* access modifiers changed from: private */
    public double T500o = 0.0d;
    private FloatingActionButton _fab;
    private File _file_khvdkhv;
    /* access modifiers changed from: private */
    public Timer _timer = new Timer();
    private SharedPreferences codee;
    /* access modifiers changed from: private */
    public String file_name = BuildConfig.FLAVOR;
    private HorizontalScrollView hscroll1;
    private double k1 = 0.0d;
    private double k2 = 0.0d;
    private double k3 = 0.0d;
    private double k4 = 0.0d;
    private double k5 = 0.0d;
    private double k6 = 0.0d;
    private Intent khvdkhv = new Intent("android.media.action.IMAGE_CAPTURE");
    private LinearLayout linea_all;
    private LinearLayout linear1;
    private LinearLayout linear2;
    /* access modifiers changed from: private */
    public LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear40;
    private LinearLayout linear41;
    private LinearLayout linear42;
    private LinearLayout linear43;
    private LinearLayout linear44;
    private LinearLayout linear45;
    private LinearLayout linear46;
    private LinearLayout linear47;
    private LinearLayout linear48;
    private LinearLayout linear49;
    private LinearLayout linear_pdf_0;
    private LinearLayout lintop;
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> list_map = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> list_pdf = new ArrayList<>();
    private ListView listview1;
    private HashMap<String, Object> map = new HashMap<>();
    /* access modifiers changed from: private */
    public double n = 0.0d;
    private SharedPreferences sarveraz;
    private TextView text_00;
    private TextView text_001;
    private TextView text_00E1;
    private TextView text_00E2;
    private TextView text_00E3;
    private TextView text_00EE;
    private TextView text_00S1;
    private TextView text_00S2;
    private TextView text_00S3;
    private TextView text_00T1;
    private TextView text_00T2;
    private TextView text_00T3;
    private TextView text_00TT1;
    private TextView text_00TT2;
    private TextView text_00TT3;
    private TextView text_00Total;
    private TextView text_00m1;
    private TextView text_00m2;
    private TextView text_00m3;
    private TextView text_00w1;
    private TextView text_00w2;
    private TextView text_00w3;
    private TextView text_2;
    private TextView text_madah;
    private TextView text_muth001;
    private TextView text_muth002;
    private TextView text_muth003;
    private TextView textview1;
    private TextView textview2;
    private TextView textview6;
    private TextView textview7;
    private TextView textview8;
    private TextView textview9;
    private TextView textview_nasf;
    private TextView textview_savf;
    /* access modifiers changed from: private */
    public TimerTask timer_5;
    private double y = 0.0d;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.tipcashf);
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
        this.linear47 = (LinearLayout) findViewById(R.id.linear47);
        this.linear_pdf_0 = (LinearLayout) findViewById(R.id.linear_pdf_0);
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.linea_all = (LinearLayout) findViewById(R.id.linea_all);
        this.linear48 = (LinearLayout) findViewById(R.id.linear48);
        this.lintop = (LinearLayout) findViewById(R.id.lintop);
        this.listview1 = (ListView) findViewById(R.id.listview1);
        this.linear49 = (LinearLayout) findViewById(R.id.linear49);
        this.text_madah = (TextView) findViewById(R.id.text_madah);
        this.textview_savf = (TextView) findViewById(R.id.textview_savf);
        this.textview_nasf = (TextView) findViewById(R.id.textview_nasf);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.text_00Total = (TextView) findViewById(R.id.text_00Total);
        this.text_00EE = (TextView) findViewById(R.id.text_00EE);
        this.linear44 = (LinearLayout) findViewById(R.id.linear44);
        this.linear41 = (LinearLayout) findViewById(R.id.linear41);
        this.linear4 = (LinearLayout) findViewById(R.id.linear4);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.text_001 = (TextView) findViewById(R.id.text_001);
        this.text_00 = (TextView) findViewById(R.id.text_00);
        this.linear45 = (LinearLayout) findViewById(R.id.linear45);
        this.text_muth003 = (TextView) findViewById(R.id.text_muth003);
        this.linear46 = (LinearLayout) findViewById(R.id.linear46);
        this.text_00E3 = (TextView) findViewById(R.id.text_00E3);
        this.text_00TT3 = (TextView) findViewById(R.id.text_00TT3);
        this.text_00w3 = (TextView) findViewById(R.id.text_00w3);
        this.text_00m3 = (TextView) findViewById(R.id.text_00m3);
        this.text_00S3 = (TextView) findViewById(R.id.text_00S3);
        this.text_00T3 = (TextView) findViewById(R.id.text_00T3);
        this.linear42 = (LinearLayout) findViewById(R.id.linear42);
        this.text_muth002 = (TextView) findViewById(R.id.text_muth002);
        this.linear43 = (LinearLayout) findViewById(R.id.linear43);
        this.text_00E2 = (TextView) findViewById(R.id.text_00E2);
        this.text_00TT2 = (TextView) findViewById(R.id.text_00TT2);
        this.text_00w2 = (TextView) findViewById(R.id.text_00w2);
        this.text_00m2 = (TextView) findViewById(R.id.text_00m2);
        this.text_00S2 = (TextView) findViewById(R.id.text_00S2);
        this.text_00T2 = (TextView) findViewById(R.id.text_00T2);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.text_2 = (TextView) findViewById(R.id.text_2);
        this.text_muth001 = (TextView) findViewById(R.id.text_muth001);
        this.linear40 = (LinearLayout) findViewById(R.id.linear40);
        this.text_00E1 = (TextView) findViewById(R.id.text_00E1);
        this.text_00TT1 = (TextView) findViewById(R.id.text_00TT1);
        this.text_00w1 = (TextView) findViewById(R.id.text_00w1);
        this.text_00m1 = (TextView) findViewById(R.id.text_00m1);
        this.text_00S1 = (TextView) findViewById(R.id.text_00S1);
        this.text_00T1 = (TextView) findViewById(R.id.text_00T1);
        this.textview6 = (TextView) findViewById(R.id.textview6);
        this.textview7 = (TextView) findViewById(R.id.textview7);
        this.textview8 = (TextView) findViewById(R.id.textview8);
        this.textview9 = (TextView) findViewById(R.id.textview9);
        this.sarveraz = getSharedPreferences("sarveraz", 0);
        this._file_khvdkhv = FileUtil.createNewPictureFile(getApplicationContext());
        if (Build.VERSION.SDK_INT >= 24) {
            Context applicationContext = getApplicationContext();
            uri = FileProvider.getUriForFile(applicationContext, String.valueOf(getApplicationContext().getPackageName()) + ".provider", this._file_khvdkhv);
        } else {
            uri = Uri.fromFile(this._file_khvdkhv);
        }
        this.khvdkhv.putExtra("output", uri);
        this.khvdkhv.addFlags(1);
        this.codee = getSharedPreferences("codee", 0);
        this._fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TipcashfActivity tipcashfActivity = TipcashfActivity.this;
                tipcashfActivity._creat_pdf(tipcashfActivity.linear3);
            }
        });
    }

    private void initializeLogic() {
        try {
            this.ID = getIntent().getStringExtra("ID_7");
            this.Name = getIntent().getStringExtra("N");
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
        _start_A();
        this.lintop.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1509911));
        this.listview1.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1));
        _custam_start(this.text_00Total, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00EE, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_001, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_2, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_muth001, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00E1, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00TT1, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00w1, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00m1, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00S1, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00T1, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_muth002, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00E2, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00TT2, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00w2, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00m2, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00S2, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00T2, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_muth003, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00E3, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00TT3, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00w3, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00m3, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00S3, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.text_00T3, 0.0d, BuildConfig.FLAVOR, this.list_map);
        _custam_start(this.textview1, 0.0d, BuildConfig.FLAVOR, this.list_map);
        this.text_madah.setText("المادة : ".concat(this.sarveraz.getString(this.ID.concat("_".concat("madah")), BuildConfig.FLAVOR)));
        this.textview_savf.setText("الصف : ".concat(this.sarveraz.getString(this.ID.concat("_".concat("save")), BuildConfig.FLAVOR)));
        this.textview_nasf.setText("الفصل الدراسي : ".concat(this.sarveraz.getString(this.ID.concat("_".concat("name")), BuildConfig.FLAVOR)));
        try {
            this.text_madah.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview_savf.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview_nasf.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        } catch (Exception unused2) {
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), Cashf_1Activity.class);
        intent.putExtra("ID_7", this.ID);
        intent.putExtra("N", this.Name);
        startActivity(intent);
        finish();
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
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0055 */
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
            double r4 = r2.k1     // Catch:{ Exception -> 0x0055 }
            double r6 = r2.k2     // Catch:{ Exception -> 0x0055 }
            double r4 = r4 + r6
            double r6 = r2.k3     // Catch:{ Exception -> 0x0055 }
            double r4 = r4 + r6
            r2.k5 = r4     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            double r4 = r2.k5     // Catch:{ Exception -> 0x0060 }
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)     // Catch:{ Exception -> 0x0060 }
            r2.k6 = r4     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            java.lang.Object r4 = r11.get(r3)     // Catch:{ Exception -> 0x0080 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ Exception -> 0x0080 }
            double r5 = r2.k5     // Catch:{ Exception -> 0x0080 }
            long r5 = (long) r5     // Catch:{ Exception -> 0x0080 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0080 }
            r4.put(r9, r5)     // Catch:{ Exception -> 0x0080 }
            java.lang.Object r3 = r11.get(r3)     // Catch:{ Exception -> 0x0080 }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x0080 }
            double r4 = r2.k6     // Catch:{ Exception -> 0x0080 }
            long r4 = (long) r4     // Catch:{ Exception -> 0x0080 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0080 }
            r3.put(r10, r4)     // Catch:{ Exception -> 0x0080 }
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.TipcashfActivity._Fan(double, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    public void _start_A() {
        for (int i = 0; i < this.list_map.size(); i++) {
            _Fan((double) i, "8", "14", "20", BuildConfig.FLAVOR, "50", "55", this.list_map);
        }
        this.sarveraz.edit().putString(this.ID, new Gson().toJson((Object) this.list_map)).commit();
        try {
            ((BaseAdapter) this.listview1.getAdapter()).notifyDataSetChanged();
        } catch (Exception unused) {
            this.listview1.setAdapter(new Listview1Adapter(this.list_map));
            ((BaseAdapter) this.listview1.getAdapter()).notifyDataSetChanged();
        }
    }

    public void _creat_pdf(View view) {
        this.Path = "/sdcard/دفتر الامتحانات/السجلات/";
        this.file_name = this.Name.concat(".pdf");
        this.T500o = 0.0d;
        if (!FileUtil.isDirectory(this.Path)) {
            FileUtil.makeDir(this.Path);
        }
        PD(new PdfDocument(), view);
    }

    public void PD(final PdfDocument pdfDocument, final View view) {
        this.list_pdf.clear();
        for (int i = 0; i < 20; i++) {
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
        try {
            this.listview1.setAdapter(new Listview1Adapter(this.list_pdf));
            ((BaseAdapter) this.listview1.getAdapter()).notifyDataSetChanged();
        } catch (Exception unused2) {
        }
        AnonymousClass11 r0 = new TimerTask() {
            public void run() {
                TipcashfActivity tipcashfActivity = TipcashfActivity.this;
                final View view = view;
                final PdfDocument pdfDocument = pdfDocument;
                tipcashfActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            PdfDocument.Page startPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(view.getWidth(), view.getHeight(), 1).create());
                            view.draw(startPage.getCanvas());
                            pdfDocument.finishPage(startPage);
                        } catch (Exception unused) {
                        }
                        if (TipcashfActivity.this.T500o < ((double) TipcashfActivity.this.list_map.size())) {
                            TipcashfActivity.this.PD(pdfDocument, view);
                        } else {
                            TipcashfActivity.this.saveD(TipcashfActivity.this.Path, TipcashfActivity.this.file_name, pdfDocument, (int) TipcashfActivity.this.n);
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
            AnonymousClass12 r7 = new TimerTask() {
                public void run() {
                    TipcashfActivity tipcashfActivity = TipcashfActivity.this;
                    final String str = str;
                    final String str2 = str2;
                    final int i = i;
                    tipcashfActivity.runOnUiThread(new Runnable() {
                        public void run() {
                            Context applicationContext = TipcashfActivity.this.getApplicationContext();
                            SketchwareUtil.showMessage(applicationContext, "تم تصدير pdf الى المسار \n".concat(String.valueOf(str) + str2));
                            TipcashfActivity access$0 = TipcashfActivity.this;
                            final int i = i;
                            final String str = str;
                            final String str2 = str2;
                            access$0.timer_5 = new TimerTask() {
                                public void run() {
                                    TipcashfActivity access$0 = TipcashfActivity.this;
                                    final int i = i;
                                    final String str = str;
                                    final String str2 = str2;
                                    access$0.runOnUiThread(new Runnable() {
                                        public void run() {
                                            if (i == 0) {
                                                TipcashfActivity access$0 = TipcashfActivity.this;
                                                access$0.Tipping(String.valueOf(str) + str2);
                                                return;
                                            }
                                            try {
                                                Uri parse = Uri.parse(String.valueOf(str) + str2);
                                                Intent intent = new Intent("android.intent.action.SEND");
                                                intent.addFlags(524288);
                                                intent.setType("application/pdf");
                                                intent.putExtra("android.intent.extra.STREAM", parse);
                                                TipcashfActivity.this.startActivity(Intent.createChooser(intent, "مشاركه السند عبر"));
                                            } catch (Exception unused) {
                                            }
                                        }
                                    });
                                }
                            };
                            TipcashfActivity.this._timer.schedule(TipcashfActivity.this.timer_5, 150);
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
            View inflate = view == null ? TipcashfActivity.this.getLayoutInflater().inflate(R.layout.ccccokj, (ViewGroup) null) : view;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.lintop);
            LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.linear40);
            LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R.id.linear43);
            LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(R.id.linear46);
            double d = (double) i;
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00Total), d, "55", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00EE), d, "50", this._data);
            double d2 = d;
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.textview1), d2, "300", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_001), d2, "1", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00), d2, "0", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00E3), d2, "20", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00TT3), d2, "19", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00w3), d2, "18", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00m3), d2, "17", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00S3), d2, "16", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00T3), d2, "15", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00E2), d2, "14", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00TT2), d2, "13", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00w2), d2, "12", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00m2), d2, "11", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00S2), d2, "10", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00T2), d2, "9", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00E1), d2, "8", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00TT1), d2, "7", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00w1), d2, "6", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00m1), d2, "5", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00S1), d2, "4", this._data);
            TipcashfActivity.this._custamA((TextView) inflate.findViewById(R.id.text_00T1), d2, "3", this._data);
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
