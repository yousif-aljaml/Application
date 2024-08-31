package com.Nasa.Soft.Exzam.Editor35;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import uk.co.senab.photoview.BuildConfig;

public class CejelsActivity extends AppCompatActivity {
    private FloatingActionButton _fab;
    /* access modifiers changed from: private */
    public Timer _timer = new Timer();
    /* access modifiers changed from: private */
    public String book = BuildConfig.FLAVOR;
    private Calendar c7 = Calendar.getInstance();
    private SharedPreferences codee;
    /* access modifiers changed from: private */
    public AlertDialog.Builder dialog;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear_500;
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> list_map = new ArrayList<>();
    /* access modifiers changed from: private */
    public HashMap<String, Object> map_A = new HashMap<>();
    /* access modifiers changed from: private */
    public SharedPreferences sarveraz;
    /* access modifiers changed from: private */
    public SharedPreferences serveraz;
    private TextView textview1;
    private TextView textview2;
    /* access modifiers changed from: private */
    public TimerTask timer_5;
    private ScrollView vscroll1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.cejels);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this._fab = (FloatingActionButton) findViewById(R.id._fab);
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.linear5 = (LinearLayout) findViewById(R.id.linear5);
        this.linear6 = (LinearLayout) findViewById(R.id.linear6);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        this.linear4 = (LinearLayout) findViewById(R.id.linear4);
        this.linear_500 = (LinearLayout) findViewById(R.id.linear_500);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.serveraz = getSharedPreferences("serveraz", 0);
        this.codee = getSharedPreferences("codee", 0);
        this.dialog = new AlertDialog.Builder(this);
        this.sarveraz = getSharedPreferences("sarveraz", 0);
        this._fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                CejelsActivity cejelsActivity = CejelsActivity.this;
                cejelsActivity._dialog_(0.0d, "A", cejelsActivity.list_map);
            }
        });
    }

    private void initializeLogic() {
        if (this.codee.getString("Cod", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            Intent intent = new Intent();
            intent.setClass(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
            return;
        }
        if (!this.serveraz.getString("serv", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.list_map = (ArrayList) new Gson().fromJson(this.serveraz.getString("serv", BuildConfig.FLAVOR), new TypeToken<ArrayList<HashMap<String, Object>>>() {
            }.getType());
        }
        _start_A();
        try {
            this.textview2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.textview1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
        } catch (Exception unused) {
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), HomeActivity.class);
        startActivity(intent);
        finish();
    }

    public void _start_A() {
        this.linear_500.removeAllViews();
        for (final int size = this.list_map.size() - 1; size > -1; size--) {
            TextView textView = new TextView(getApplicationContext());
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, 65, 0.0f));
            textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            textView.setTextSize(16.0f);
            try {
                textView.setText("كشف - ".concat(this.list_map.get(size).get("3").toString().concat("_".concat(this.list_map.get(size).get("2").toString().concat("_".concat(this.list_map.get(size).get("1").toString()))))));
            } catch (Exception unused) {
                textView.setText(BuildConfig.FLAVOR);
            }
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(CejelsActivity.this.getApplicationContext(), Cashf_1Activity.class);
                    intent.putExtra("ID_7", ((HashMap) CejelsActivity.this.list_map.get(size)).get("0").toString());
                    intent.putExtra("N", "كشف - ".concat(((HashMap) CejelsActivity.this.list_map.get(size)).get("3").toString().concat("_".concat(((HashMap) CejelsActivity.this.list_map.get(size)).get("2").toString().concat("_".concat(((HashMap) CejelsActivity.this.list_map.get(size)).get("1").toString()))))));
                    CejelsActivity.this.startActivity(intent);
                    CejelsActivity.this.finish();
                }
            });
            this.linear_500.addView(textView);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 70, 0.0f);
            layoutParams.setMargins(50, 8, 50, 8);
            textView.setLayoutParams(layoutParams);
            textView.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    CejelsActivity cejelsActivity = CejelsActivity.this;
                    cejelsActivity._dialog_((double) size, "E", cejelsActivity.list_map);
                    return true;
                }
            });
            textView.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(20, 2, -2236963, -117901064));
            new GradientDrawable();
            int i = (int) getApplicationContext().getResources().getDisplayMetrics().density;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TR_BL, new int[]{-13611010, -1, -13611010});
            float f = (float) (i * 170);
            int i2 = i * 2;
            float f2 = (float) i2;
            gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f2, f2});
            gradientDrawable.setStroke(i2, -16740915);
            textView.setElevation((float) (i * 10));
            textView.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{-769226}), gradientDrawable, (Drawable) null));
            textView.setClickable(true);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:23|24|25|26|27|28|29|30|33|34|35|36|37) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x02ae */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x02c6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _dialog_(double r27, java.lang.String r29, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r30) {
        /*
            r26 = this;
            r10 = r26
            r11 = r27
            r13 = r29
            r14 = r30
            java.lang.String r0 = "fonts/font700.ttf"
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r10)
            android.app.AlertDialog r15 = r1.create()
            android.view.LayoutInflater r1 = r26.getLayoutInflater()
            r2 = 2131427384(0x7f0b0038, float:1.8476383E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            r15.setView(r1)
            r9 = 1
            r15.requestWindowFeature(r9)
            android.view.Window r2 = r15.getWindow()
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
            r7 = 2131231136(0x7f0801a0, float:1.8078344E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r7 = 2131231135(0x7f08019f, float:1.8078342E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r8 = 2131230970(0x7f0800fa, float:1.8078008E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r4 = 2131231477(0x7f0802f5, float:1.8079036E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r9 = 2131231482(0x7f0802fa, float:1.8079046E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r18 = r15
            r15 = 2131230911(0x7f0800bf, float:1.8077888E38)
            android.view.View r15 = r1.findViewById(r15)
            android.widget.EditText r15 = (android.widget.EditText) r15
            r19 = r0
            r0 = 2131231517(0x7f08031d, float:1.8079117E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r20 = r0
            r0 = 2131230912(0x7f0800c0, float:1.807789E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r14 = 2131231518(0x7f08031e, float:1.807912E38)
            android.view.View r14 = r1.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r21 = r14
            r14 = 2131230913(0x7f0800c1, float:1.8077892E38)
            android.view.View r14 = r1.findViewById(r14)
            android.widget.EditText r14 = (android.widget.EditText) r14
            r11 = 2131231519(0x7f08031f, float:1.8079121E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 2131230836(0x7f080074, float:1.8077736E38)
            android.view.View r12 = r1.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r22 = r4
            r4 = 2131231263(0x7f08021f, float:1.8078602E38)
            android.view.View r1 = r1.findViewById(r4)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$6 r1 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$6
            r1.<init>()
            r23 = r8
            r8 = 2
            r13 = -2236963(0xffffffffffdddddd, float:NaN)
            r24 = r11
            r11 = -117901064(0xfffffffff8f8f8f8, float:-4.0398103E34)
            r25 = r9
            r9 = 1
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r8, r9, r13, r11)
            r3.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$7 r1 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$7
            r1.<init>()
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r8, r9, r13, r11)
            r5.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$8 r1 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$8
            r1.<init>()
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r8, r9, r13, r11)
            r6.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$9 r1 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$9
            r1.<init>()
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r8, r8, r3, r5)
            r2.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$10 r1 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$10
            r1.<init>()
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r8, r8, r3, r5)
            r7.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$11 r1 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$11
            r1.<init>()
            r2 = 20
            r6 = 1
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r6, r3, r5)
            r4.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$12 r1 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$12
            r1.<init>()
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r6, r3, r5)
            r12.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$13 r1 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$13
            r1.<init>()
            r3 = -13421773(0xffffffffff333333, float:-2.3819765E38)
            r5 = -1
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r6, r3, r5)
            r15.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$14 r1 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$14
            r1.<init>()
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r6, r3, r5)
            r0.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$15 r1 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$15
            r1.<init>()
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r6, r3, r5)
            r14.setBackground(r1)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$16 r1 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$16
            r1.<init>()
            r5 = 0
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r2, r6, r3, r5)
            r9 = r25
            r9.setBackground(r1)
            java.lang.String r1 = "الفصل الدراسي"
            r11 = r24
            r11.setText(r1)
            r14.setHint(r1)
            java.lang.String r13 = "A"
            r8 = r29
            boolean r1 = r8.equals(r13)
            if (r1 == 0) goto L_0x01b9
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r10.c7 = r1
            long r1 = r1.getTimeInMillis()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r10.book = r1
            r1 = 8
            r6 = r23
            r6.setVisibility(r1)
            java.lang.String r1 = "انشاء كشف سجل درجات"
            r2 = r22
            r2.setText(r1)
            r5 = r30
            r3 = r0
            r6 = r27
            goto L_0x01eb
        L_0x01b9:
            r2 = r22
            r6 = r23
            java.lang.String r1 = "تعديل اسم كشف سجل درجات"
            r2.setText(r1)
            r6 = r27
            int r1 = (int) r6
            r5 = r30
            java.lang.Object r1 = r5.get(r1)     // Catch:{ Exception -> 0x01db }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x01db }
            java.lang.String r3 = "0"
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x01db }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01db }
            r10.book = r1     // Catch:{ Exception -> 0x01db }
            r3 = r0
            goto L_0x01eb
        L_0x01db:
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = 10000(0x2710, float:1.4013E-41)
            int r1 = com.Nasa.Soft.Exzam.Editor35.SketchwareUtil.getRandom(r1, r3)
            r3 = r0
            long r0 = (long) r1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.book = r0
        L_0x01eb:
            android.content.res.AssetManager r0 = r26.getAssets()     // Catch:{ Exception -> 0x0242 }
            r1 = r19
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0242 }
            r16 = r13
            r13 = 1
            r9.setTypeface(r0, r13)     // Catch:{ Exception -> 0x0245 }
            android.content.res.AssetManager r0 = r26.getAssets()     // Catch:{ Exception -> 0x0245 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0245 }
            r2.setTypeface(r0, r13)     // Catch:{ Exception -> 0x0245 }
            android.content.res.AssetManager r0 = r26.getAssets()     // Catch:{ Exception -> 0x0245 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0245 }
            r12.setTypeface(r0, r13)     // Catch:{ Exception -> 0x0245 }
            android.content.res.AssetManager r0 = r26.getAssets()     // Catch:{ Exception -> 0x0245 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0245 }
            r4.setTypeface(r0, r13)     // Catch:{ Exception -> 0x0245 }
            android.content.res.AssetManager r0 = r26.getAssets()     // Catch:{ Exception -> 0x0245 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0245 }
            r2 = r20
            r2.setTypeface(r0, r13)     // Catch:{ Exception -> 0x0245 }
            android.content.res.AssetManager r0 = r26.getAssets()     // Catch:{ Exception -> 0x0245 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0245 }
            r2 = r21
            r2.setTypeface(r0, r13)     // Catch:{ Exception -> 0x0245 }
            android.content.res.AssetManager r0 = r26.getAssets()     // Catch:{ Exception -> 0x0245 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x0245 }
            r11.setTypeface(r0, r13)     // Catch:{ Exception -> 0x0245 }
            goto L_0x0245
        L_0x0242:
            r16 = r13
            r13 = 1
        L_0x0245:
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$17 r0 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$17
            r11 = r18
            r0.<init>(r15, r11)
            r12.setOnClickListener(r0)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$18 r12 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$18
            r2 = r3
            r0 = r12
            r1 = r26
            r17 = r2
            r2 = r15
            r3 = r17
            r13 = r4
            r4 = r14
            r10 = r5
            r5 = r30
            r19 = r23
            r6 = r27
            r10 = r8
            r25 = r9
            r9 = r19
            r8 = r11
            r0.<init>(r2, r3, r4, r5, r6, r8)
            r9.setOnClickListener(r12)
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$19 r12 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$19
            r0 = r12
            r2 = r29
            r3 = r14
            r4 = r17
            r5 = r15
            r6 = r30
            r7 = r27
            r19 = r14
            r14 = r25
            r9 = r11
            r0.<init>(r2, r3, r4, r5, r6, r7, r9)
            r13.setOnClickListener(r12)
            java.lang.String r0 = "New"
            r14.setText(r0)     // Catch:{ Exception -> 0x028d }
            goto L_0x028e
        L_0x028d:
        L_0x028e:
            r0 = r16
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x02dc
            r0 = r27
            int r0 = (int) r0
            r1 = r30
            java.lang.Object r2 = r1.get(r0)     // Catch:{ Exception -> 0x02ae }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x02ae }
            java.lang.String r3 = "3"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x02ae }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02ae }
            r15.setText(r2)     // Catch:{ Exception -> 0x02ae }
        L_0x02ae:
            java.lang.Object r2 = r1.get(r0)     // Catch:{ Exception -> 0x02c4 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x02c4 }
            java.lang.String r3 = "2"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x02c4 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02c4 }
            r3 = r17
            r3.setText(r2)     // Catch:{ Exception -> 0x02c6 }
            goto L_0x02c6
        L_0x02c4:
            r3 = r17
        L_0x02c6:
            java.lang.Object r0 = r1.get(r0)     // Catch:{ Exception -> 0x02de }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x02de }
            java.lang.String r1 = "1"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x02de }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02de }
            r14 = r19
            r14.setText(r0)     // Catch:{ Exception -> 0x02e0 }
            goto L_0x02e0
        L_0x02dc:
            r3 = r17
        L_0x02de:
            r14 = r19
        L_0x02e0:
            com.Nasa.Soft.Exzam.Editor35.CejelsActivity$20 r0 = new com.Nasa.Soft.Exzam.Editor35.CejelsActivity$20
            r1 = r26
            r0.<init>(r15)
            r1.timer_5 = r0
            java.util.Timer r2 = r1._timer
            r4 = 70
            r2.schedule(r0, r4)
            r0 = 1
            r15.setTextIsSelectable(r0)
            r3.setTextIsSelectable(r0)
            r14.setTextIsSelectable(r0)
            r11.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.CejelsActivity._dialog_(double, java.lang.String, java.util.ArrayList):void");
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
