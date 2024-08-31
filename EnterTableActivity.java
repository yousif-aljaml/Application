package com.Nasa.Soft.Exzam.Editor35;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
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

public class EnterTableActivity extends AppCompatActivity {
    private String Book = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Colar_bac = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> Data_Map = new ArrayList<>();
    /* access modifiers changed from: private */
    public String EE = BuildConfig.FLAVOR;
    private String Enter = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public double Etar = 0.0d;
    /* access modifiers changed from: private */
    public String Etar_color = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Font_Stayl = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Font_colorr = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Font_path = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public double Font_size = 0.0d;
    /* access modifiers changed from: private */
    public String ID = BuildConfig.FLAVOR;
    private String ID_one = BuildConfig.FLAVOR;
    private double K = 0.0d;
    private ArrayList<HashMap<String, Object>> List_K = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> List_PD = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> List_PL = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<String> List_fonts = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> List_startMap = new ArrayList<>();
    private HashMap<String, Object> Map_A = new HashMap<>();
    private double PD = 0.0d;
    private double PL = 0.0d;
    private String Page = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public TextView T50;
    /* access modifiers changed from: private */
    public String T_W = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String T_in = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String T_out = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String T_z5 = BuildConfig.FLAVOR;
    private String Text = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Ty_num = BuildConfig.FLAVOR;
    private String Type = BuildConfig.FLAVOR;
    private FloatingActionButton _fab;
    /* access modifiers changed from: private */
    public Timer _timer = new Timer();
    /* access modifiers changed from: private */
    public String abC = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String abC_color = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String beack_color = BuildConfig.FLAVOR;
    private ArrayList<String> color_list_0 = new ArrayList<>();
    private Calendar cot = Calendar.getInstance();
    private String dd = BuildConfig.FLAVOR;
    private AlertDialog.Builder dialog_6;
    private double h = 0.0d;
    private ImageView image_21_2;
    private ImageView image_ctral_2;
    private ImageView image_delet_2;
    private ImageView image_enter_2;
    private ImageView image_tiping;
    private ImageView imageview2;
    private ImageView imageview20;
    private LinearLayout linear2;
    /* access modifiers changed from: private */
    public LinearLayout linear3;
    private LinearLayout linear35;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear_1200;
    /* access modifiers changed from: private */
    public LinearLayout linear_pdf_0;
    private ArrayList<HashMap<String, Object>> list_all = new ArrayList<>();
    private HashMap<String, Object> maer4 = new HashMap<>();
    private HashMap<String, Object> map_A = new HashMap<>();
    private String name = BuildConfig.FLAVOR;
    private double opssd = 0.0d;
    /* access modifiers changed from: private */
    public double paggg = 0.0d;
    private SharedPreferences saveX;
    private double scol = 0.0d;
    /* access modifiers changed from: private */
    public String size = BuildConfig.FLAVOR;
    private double t = 0.0d;
    private TextView text_name;
    /* access modifiers changed from: private */
    public TimerTask timer_5;
    private String type = BuildConfig.FLAVOR;
    private double u = 0.0d;
    private double w = 0.0d;
    private double x = 0.0d;
    private double y = 0.0d;
    /* access modifiers changed from: private */
    public double z = 0.0d;

    public void _Creat_text() {
    }

    public void _creator() {
    }

    public void _dialog_A1() {
    }

    public void _dialog_color() {
    }

    public void _dialog_color_daeel() {
    }

    public void _dialog_daeel() {
    }

    public void _dialog_font() {
    }

    public void _dialog_images() {
    }

    public void _dialog_size() {
    }

    public void _dialog_size_swmk() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.enter_table);
        initialize(bundle);
        if (ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == -1) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1000);
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
        this._fab = (FloatingActionButton) findViewById(R.id._fab);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.linear35 = (LinearLayout) findViewById(R.id.linear35);
        this.linear_1200 = (LinearLayout) findViewById(R.id.linear_1200);
        this.linear5 = (LinearLayout) findViewById(R.id.linear5);
        this.imageview2 = (ImageView) findViewById(R.id.imageview2);
        this.text_name = (TextView) findViewById(R.id.text_name);
        this.image_tiping = (ImageView) findViewById(R.id.image_tiping);
        this.image_enter_2 = (ImageView) findViewById(R.id.image_enter_2);
        this.image_delet_2 = (ImageView) findViewById(R.id.image_delet_2);
        this.image_21_2 = (ImageView) findViewById(R.id.image_21_2);
        this.image_ctral_2 = (ImageView) findViewById(R.id.image_ctral_2);
        this.imageview20 = (ImageView) findViewById(R.id.imageview20);
        this.linear6 = (LinearLayout) findViewById(R.id.linear6);
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.T50 = (TextView) findViewById(R.id.T50);
        this.linear_pdf_0 = (LinearLayout) findViewById(R.id.linear_pdf_0);
        this.saveX = getSharedPreferences("saveX", 0);
        this.dialog_6 = new AlertDialog.Builder(this);
        this.imageview2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterTableActivity.this._get_back(1.0d);
            }
        });
        this.image_tiping.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterTableActivity.this._get_back(0.0d);
            }
        });
        this.image_enter_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterTableActivity.this._get_back(0.0d);
            }
        });
        this._fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterTableActivity.this._dialog_chater();
            }
        });
    }

    private void initializeLogic() {
        _ss();
        this.text_name.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, ViewCompat.MEASURED_STATE_MASK, -657931));
        this.text_name.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
    }

    public void onBackPressed() {
        _get_back(0.0d);
    }

    public void _Creat_chat(double d, double d2) {
        final int i;
        this.u = 0.0d;
        this.linear_pdf_0.removeAllViews();
        int i2 = 0;
        final int i3 = 0;
        while (i3 < this.Data_Map.size()) {
            LinearLayout linearLayout = new LinearLayout(getApplicationContext());
            int i4 = -2;
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
            if (this.Data_Map.get(i3).get("2").toString().length() > 2) {
                try {
                    this.List_startMap = (ArrayList) new Gson().fromJson(this.Data_Map.get(i3).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                    }.getType());
                } catch (Exception unused) {
                    this.List_startMap.clear();
                }
            } else {
                this.List_startMap.clear();
            }
            if (i3 == 0) {
                LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, 60, 0.0f));
                linearLayout2.setOrientation(i2);
                final int i5 = 0;
                while (i5 < this.List_startMap.size()) {
                    TextView textView = new TextView(getApplicationContext());
                    textView.setLayoutParams(new LinearLayout.LayoutParams(i4, i4, 1.0f));
                    textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    textView.setTextSize(12.0f);
                    try {
                        textView.setText("A".concat(String.valueOf((long) (this.List_startMap.size() - i5))));
                    } catch (Exception unused2) {
                        textView.setText(BuildConfig.FLAVOR);
                    }
                    textView.setGravity(17);
                    textView.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            EnterTableActivity.this.dialogE(i5, 0, 0);
                        }
                    });
                    linearLayout2.addView(textView);
                    textView.setOnLongClickListener(new View.OnLongClickListener() {
                        public boolean onLongClick(View view) {
                            EnterTableActivity.this._dialog_set((double) i5, (double) i3, 0.0d);
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
                    }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -1968642));
                    try {
                        this.size = this.List_startMap.get(i5).get("1").toString();
                    } catch (Exception unused3) {
                        this.size = "-1,-2,1";
                    }
                    int i6 = i3;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) Double.parseDouble(Spliter(this.size, i2)), -1, (float) ((int) Double.parseDouble(Spliter(this.size, 2))));
                    layoutParams.setMargins(1, 1, 1, 1);
                    textView.setLayoutParams(layoutParams);
                    if (i5 == this.List_startMap.size() - 1) {
                        TextView textView2 = new TextView(getApplicationContext());
                        textView2.setLayoutParams(new LinearLayout.LayoutParams(80, -1, 0.0f));
                        textView2.setTextColor(SupportMenu.CATEGORY_MASK);
                        textView2.setTextSize(12.0f);
                        try {
                            textView2.setText("□");
                        } catch (Exception unused4) {
                            textView2.setText(BuildConfig.FLAVOR);
                        }
                        textView2.setGravity(17);
                        textView2.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                EnterTableActivity.this.dialogE(i5, 0, 1);
                            }
                        });
                        linearLayout2.addView(textView2);
                        textView2.setBackground(new GradientDrawable() {
                            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                                setCornerRadius((float) i);
                                setStroke(i2, i3);
                                setColor(i4);
                                return this;
                            }
                        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -1968642));
                    }
                    i5++;
                    i3 = i6;
                    i2 = 0;
                    i4 = -2;
                }
                this.linear_pdf_0.addView(linearLayout2);
            }
            int i7 = i3;
            final int i8 = 0;
            while (i8 < this.List_startMap.size()) {
                String obj = this.List_startMap.get(i8).get("0").toString();
                this.Type = obj;
                if (obj.equals("3")) {
                    i = i7;
                    linearLayout.addView(Creat_C(i8, i));
                } else {
                    i = i7;
                }
                if (i8 == this.List_startMap.size() - 1) {
                    TextView textView3 = new TextView(getApplicationContext());
                    textView3.setLayoutParams(new LinearLayout.LayoutParams(80, -1, 0.0f));
                    textView3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                    textView3.setTextSize(12.0f);
                    try {
                        textView3.setText("B ".concat(String.valueOf((long) (i + 1))));
                    } catch (Exception unused5) {
                        textView3.setText(BuildConfig.FLAVOR);
                    }
                    textView3.setGravity(17);
                    textView3.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            EnterTableActivity.this.dialogE(0, i, 2);
                        }
                    });
                    linearLayout.addView(textView3);
                    textView3.setBackground(new GradientDrawable() {
                        public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                            setCornerRadius((float) i);
                            setStroke(i2, i3);
                            setColor(i4);
                            return this;
                        }
                    }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -1968642));
                    textView3.setOnLongClickListener(new View.OnLongClickListener() {
                        public boolean onLongClick(View view) {
                            EnterTableActivity.this._dialog_set((double) i8, (double) i, 2.0d);
                            return true;
                        }
                    });
                }
                i8++;
                i7 = i;
            }
            this.linear_pdf_0.addView(linearLayout);
            i3 = i7 + 1;
            i2 = 0;
        }
        this.T50.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterTableActivity.this.T50.setVisibility(4);
                EnterTableActivity.this.List_startMap = (ArrayList) new Gson().fromJson(((HashMap) EnterTableActivity.this.Data_Map.get(EnterTableActivity.this.Data_Map.size() - 1)).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                }.getType());
                for (int i = 0; i < EnterTableActivity.this.List_startMap.size(); i++) {
                    ((HashMap) EnterTableActivity.this.List_startMap.get(i)).put("20", BuildConfig.FLAVOR);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("2", new Gson().toJson((Object) EnterTableActivity.this.List_startMap));
                EnterTableActivity.this.Data_Map.add(hashMap);
                EnterTableActivity.this._cret_chat(0.0d, 0.0d);
                EnterTableActivity.this.timer_5 = new TimerTask() {
                    public void run() {
                        EnterTableActivity.this.runOnUiThread(new Runnable() {
                            public void run() {
                                EnterTableActivity.this.T50.setVisibility(0);
                            }
                        });
                    }
                };
                EnterTableActivity.this._timer.schedule(EnterTableActivity.this.timer_5, 500);
            }
        });
        this.T50.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 1, ViewCompat.MEASURED_STATE_MASK, -1968642));
        if (this.Data_Map.size() > 0) {
            this._fab.hide();
        } else {
            this._fab.show();
        }
    }

    public void _cret_chat(double d, double d2) {
        for (int i = 0; i < ((int) d); i++) {
            this.List_startMap.clear();
            for (int i2 = 0; i2 < ((int) d2); i2++) {
                HashMap<String, Object> hashMap = new HashMap<>();
                this.map_A = hashMap;
                hashMap.put("0", "3");
                this.map_A.put("20", BuildConfig.FLAVOR);
                this.map_A.put("1", "100,-1,1");
                this.map_A.put("2", "0,0,0,0");
                this.map_A.put("3", "0,0,1,1");
                this.map_A.put("4", "0,0,0,0");
                this.map_A.put("5", "#00000000");
                this.map_A.put("6", "1");
                this.map_A.put("7", "#FF000000");
                this.map_A.put("21", "12");
                this.map_A.put("22", "#FF000000");
                this.map_A.put("23", "nasa_soft44.ttf");
                this.map_A.put("24", "0");
                this.map_A.put("25", "3");
                this.map_A.put("26", "0,0,0");
                this.map_A.put("27", "#FF000000");
                this.map_A.put("60", this.ID_one);
                this.List_startMap.add(this.map_A);
            }
            HashMap<String, Object> hashMap2 = new HashMap<>();
            this.map_A = hashMap2;
            hashMap2.put("2", new Gson().toJson((Object) this.List_startMap));
            this.Data_Map.add(this.map_A);
        }
        _Creat_chat(d, d2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|5|6|9|10|13|14|17|18|21|22|25|26|29|30|31|32|33|34|36|37|39|40|51) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x02b0 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0382 A[FALL_THROUGH] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView Creat_C(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "#00000000"
            java.lang.String r4 = "3"
            java.lang.String r5 = "2"
            java.lang.String r6 = "1"
            java.lang.String r7 = "0,0,0,0"
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r9 = r16.getApplicationContext()
            r8.<init>(r9)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$17 r9 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$17
            r9.<init>(r8, r1, r2)
            r8.setOnClickListener(r9)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$18 r9 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$18
            r9.<init>(r1, r2)
            r8.setOnLongClickListener(r9)
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap     // Catch:{ Exception -> 0x003c }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x003c }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x003c }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ Exception -> 0x003c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x003c }
            r0.size = r2     // Catch:{ Exception -> 0x003c }
            goto L_0x0040
        L_0x003c:
            java.lang.String r2 = "-1,-2,1"
            r0.size = r2
        L_0x0040:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap     // Catch:{ Exception -> 0x0053 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x0053 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x0053 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0053 }
            r0.T_in = r2     // Catch:{ Exception -> 0x0053 }
            goto L_0x0055
        L_0x0053:
            r0.T_in = r7
        L_0x0055:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap     // Catch:{ Exception -> 0x0068 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x0068 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x0068 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0068 }
            r0.T_out = r2     // Catch:{ Exception -> 0x0068 }
            goto L_0x006a
        L_0x0068:
            r0.T_out = r7
        L_0x006a:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap     // Catch:{ Exception -> 0x007f }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x007f }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x007f }
            java.lang.String r9 = "4"
            java.lang.Object r2 = r2.get(r9)     // Catch:{ Exception -> 0x007f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x007f }
            r0.T_z5 = r2     // Catch:{ Exception -> 0x007f }
            goto L_0x0081
        L_0x007f:
            r0.T_z5 = r7
        L_0x0081:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x0096 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x0096 }
            java.lang.String r7 = "5"
            java.lang.Object r2 = r2.get(r7)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0096 }
            r0.beack_color = r2     // Catch:{ Exception -> 0x0096 }
            goto L_0x0098
        L_0x0096:
            r0.beack_color = r3
        L_0x0098:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap     // Catch:{ Exception -> 0x00b1 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x00b1 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r7 = "6"
            java.lang.Object r2 = r2.get(r7)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b1 }
            double r9 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x00b1 }
            r0.Etar = r9     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b5
        L_0x00b1:
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.Etar = r9
        L_0x00b5:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap     // Catch:{ Exception -> 0x00ca }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x00ca }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x00ca }
            java.lang.String r7 = "7"
            java.lang.Object r2 = r2.get(r7)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00ca }
            r0.Etar_color = r2     // Catch:{ Exception -> 0x00ca }
            goto L_0x00cc
        L_0x00ca:
            r0.Etar_color = r3
        L_0x00cc:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            android.content.Context r3 = r16.getApplicationContext()
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r3 = (int) r3
            java.lang.String r7 = r0.beack_color
            int r7 = android.graphics.Color.parseColor(r7)
            r2.setColor(r7)
            r7 = 8
            float[] r7 = new float[r7]
            float r9 = (float) r3
            java.lang.String r10 = r0.T_z5
            r11 = 0
            java.lang.String r10 = r0.Spliter(r10, r11)
            double r12 = java.lang.Double.parseDouble(r10)
            long r12 = (long) r12
            java.lang.String r10 = java.lang.String.valueOf(r12)
            float r10 = java.lang.Float.parseFloat(r10)
            float r10 = r10 * r9
            r7[r11] = r10
            java.lang.String r10 = r0.T_z5
            java.lang.String r10 = r0.Spliter(r10, r11)
            double r12 = java.lang.Double.parseDouble(r10)
            long r12 = (long) r12
            java.lang.String r10 = java.lang.String.valueOf(r12)
            float r10 = java.lang.Float.parseFloat(r10)
            float r10 = r10 * r9
            r12 = 1
            r7[r12] = r10
            java.lang.String r10 = r0.T_z5
            java.lang.String r10 = r0.Spliter(r10, r12)
            double r13 = java.lang.Double.parseDouble(r10)
            long r13 = (long) r13
            java.lang.String r10 = java.lang.String.valueOf(r13)
            float r10 = java.lang.Float.parseFloat(r10)
            float r10 = r10 * r9
            r13 = 2
            r7[r13] = r10
            java.lang.String r10 = r0.T_z5
            java.lang.String r10 = r0.Spliter(r10, r12)
            double r14 = java.lang.Double.parseDouble(r10)
            long r14 = (long) r14
            java.lang.String r10 = java.lang.String.valueOf(r14)
            float r10 = java.lang.Float.parseFloat(r10)
            float r10 = r10 * r9
            r14 = 3
            r7[r14] = r10
            java.lang.String r10 = r0.T_z5
            java.lang.String r10 = r0.Spliter(r10, r13)
            double r11 = java.lang.Double.parseDouble(r10)
            long r10 = (long) r11
            java.lang.String r10 = java.lang.String.valueOf(r10)
            float r10 = java.lang.Float.parseFloat(r10)
            float r10 = r10 * r9
            r11 = 4
            r7[r11] = r10
            r10 = 5
            java.lang.String r12 = r0.T_z5
            java.lang.String r12 = r0.Spliter(r12, r13)
            double r11 = java.lang.Double.parseDouble(r12)
            long r11 = (long) r11
            java.lang.String r11 = java.lang.String.valueOf(r11)
            float r11 = java.lang.Float.parseFloat(r11)
            float r11 = r11 * r9
            r7[r10] = r11
            r10 = 6
            java.lang.String r11 = r0.T_z5
            java.lang.String r11 = r0.Spliter(r11, r14)
            double r11 = java.lang.Double.parseDouble(r11)
            long r11 = (long) r11
            java.lang.String r11 = java.lang.String.valueOf(r11)
            float r11 = java.lang.Float.parseFloat(r11)
            float r11 = r11 * r9
            r7[r10] = r11
            r10 = 7
            java.lang.String r11 = r0.T_z5
            java.lang.String r11 = r0.Spliter(r11, r14)
            double r11 = java.lang.Double.parseDouble(r11)
            long r11 = (long) r11
            java.lang.String r11 = java.lang.String.valueOf(r11)
            float r11 = java.lang.Float.parseFloat(r11)
            float r9 = r9 * r11
            r7[r10] = r9
            r2.setCornerRadii(r7)
            double r9 = r0.Etar
            long r9 = (long) r9
            java.lang.String r7 = java.lang.String.valueOf(r9)
            int r7 = java.lang.Integer.parseInt(r7)
            int r7 = r7 * r3
            java.lang.String r9 = r0.Etar_color
            int r9 = android.graphics.Color.parseColor(r9)
            r2.setStroke(r7, r9)
            r7 = 4
            int r3 = r3 * 4
            float r3 = (float) r3
            r8.setElevation(r3)
            r8.setBackground(r2)
            java.lang.String r2 = r0.T_in
            r3 = 0
            java.lang.String r2 = r0.Spliter(r2, r3)
            double r2 = java.lang.Double.parseDouble(r2)
            int r2 = (int) r2
            java.lang.String r3 = r0.T_in
            r7 = 1
            java.lang.String r3 = r0.Spliter(r3, r7)
            double r9 = java.lang.Double.parseDouble(r3)
            int r3 = (int) r9
            java.lang.String r7 = r0.T_in
            java.lang.String r7 = r0.Spliter(r7, r13)
            double r9 = java.lang.Double.parseDouble(r7)
            int r7 = (int) r9
            java.lang.String r9 = r0.T_in
            java.lang.String r9 = r0.Spliter(r9, r14)
            double r9 = java.lang.Double.parseDouble(r9)
            int r9 = (int) r9
            r8.setPadding(r2, r3, r7, r9)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            java.lang.String r3 = r0.size
            r7 = 0
            java.lang.String r3 = r0.Spliter(r3, r7)
            double r9 = java.lang.Double.parseDouble(r3)
            int r3 = (int) r9
            java.lang.String r7 = r0.size
            r9 = 1
            java.lang.String r7 = r0.Spliter(r7, r9)
            double r9 = java.lang.Double.parseDouble(r7)
            int r7 = (int) r9
            java.lang.String r9 = r0.size
            java.lang.String r9 = r0.Spliter(r9, r13)
            double r9 = java.lang.Double.parseDouble(r9)
            int r9 = (int) r9
            float r9 = (float) r9
            r2.<init>(r3, r7, r9)
            java.lang.String r3 = r0.T_out
            r7 = 0
            java.lang.String r3 = r0.Spliter(r3, r7)
            double r9 = java.lang.Double.parseDouble(r3)
            int r3 = (int) r9
            java.lang.String r7 = r0.T_out
            r9 = 1
            java.lang.String r7 = r0.Spliter(r7, r9)
            double r9 = java.lang.Double.parseDouble(r7)
            int r7 = (int) r9
            java.lang.String r9 = r0.T_out
            java.lang.String r9 = r0.Spliter(r9, r13)
            double r9 = java.lang.Double.parseDouble(r9)
            int r9 = (int) r9
            java.lang.String r10 = r0.T_out
            java.lang.String r10 = r0.Spliter(r10, r14)
            double r10 = java.lang.Double.parseDouble(r10)
            int r10 = (int) r10
            r2.setMargins(r3, r7, r9, r10)
            r8.setLayoutParams(r2)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$19 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$19
            r2.<init>()
            r8.addTextChangedListener(r2)
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap
            java.lang.Object r2 = r2.get(r1)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r3 = "20"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = r2.toString()
            r8.setText(r2)
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap
            java.lang.Object r2 = r2.get(r1)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r3 = "21"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = r2.toString()
            double r2 = java.lang.Double.parseDouble(r2)
            int r2 = (int) r2
            float r2 = (float) r2
            r8.setTextSize(r2)
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap     // Catch:{ Exception -> 0x02b0 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x02b0 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r3 = "22"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x02b0 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x02b0 }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ Exception -> 0x02b0 }
            r8.setTextColor(r2)     // Catch:{ Exception -> 0x02b0 }
        L_0x02b0:
            android.content.res.AssetManager r2 = r16.getAssets()     // Catch:{ Exception -> 0x02f2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r7 = "fonts/"
            r3.<init>(r7)     // Catch:{ Exception -> 0x02f2 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r7 = r0.List_startMap     // Catch:{ Exception -> 0x02f2 }
            java.lang.Object r7 = r7.get(r1)     // Catch:{ Exception -> 0x02f2 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r9 = "23"
            java.lang.Object r7 = r7.get(r9)     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x02f2 }
            r3.append(r7)     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02f2 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r3)     // Catch:{ Exception -> 0x02f2 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r3 = r0.List_startMap     // Catch:{ Exception -> 0x02f2 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ Exception -> 0x02f2 }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r7 = "24"
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x02f2 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02f2 }
            double r9 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x02f2 }
            int r3 = (int) r9     // Catch:{ Exception -> 0x02f2 }
            r8.setTypeface(r2, r3)     // Catch:{ Exception -> 0x02f2 }
        L_0x02f2:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap
            java.lang.Object r2 = r2.get(r1)
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r3 = "26"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = r2.toString()
            r0.abC = r2
            r3 = 0
            java.lang.String r2 = r0.Spliter(r2, r3)     // Catch:{ Exception -> 0x0340 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0340 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x0340 }
            java.lang.String r3 = r0.abC     // Catch:{ Exception -> 0x0340 }
            r7 = 1
            java.lang.String r3 = r0.Spliter(r3, r7)     // Catch:{ Exception -> 0x0340 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x0340 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0340 }
            java.lang.String r7 = r0.abC     // Catch:{ Exception -> 0x0340 }
            java.lang.String r7 = r0.Spliter(r7, r13)     // Catch:{ Exception -> 0x0340 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ Exception -> 0x0340 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r9 = r0.List_startMap     // Catch:{ Exception -> 0x0340 }
            java.lang.Object r9 = r9.get(r1)     // Catch:{ Exception -> 0x0340 }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ Exception -> 0x0340 }
            java.lang.String r10 = "27"
            java.lang.Object r9 = r9.get(r10)     // Catch:{ Exception -> 0x0340 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0340 }
            int r9 = android.graphics.Color.parseColor(r9)     // Catch:{ Exception -> 0x0340 }
            r8.setShadowLayer(r2, r3, r7, r9)     // Catch:{ Exception -> 0x0340 }
            goto L_0x0341
        L_0x0340:
        L_0x0341:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r0.List_startMap
            java.lang.Object r1 = r2.get(r1)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "25"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r1.hashCode()
            r3 = 17
            switch(r2) {
                case 49: goto L_0x0375;
                case 50: goto L_0x0368;
                case 51: goto L_0x035d;
                default: goto L_0x035c;
            }
        L_0x035c:
            goto L_0x0382
        L_0x035d:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0364
            goto L_0x0382
        L_0x0364:
            r8.setGravity(r3)
            goto L_0x0385
        L_0x0368:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x036f
            goto L_0x0382
        L_0x036f:
            r1 = 19
            r8.setGravity(r1)
            goto L_0x0385
        L_0x0375:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x037c
            goto L_0x0382
        L_0x037c:
            r1 = 21
            r8.setGravity(r1)
            goto L_0x0385
        L_0x0382:
            r8.setGravity(r3)
        L_0x0385:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterTableActivity.Creat_C(int, int):android.widget.TextView");
    }

    public String Spliter(String str, int i) {
        return str.split(",")[i];
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0351 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x03af A[Catch:{ Exception -> 0x03b4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sav(android.widget.TextView r20, int r21, int r22) {
        /*
            r19 = this;
            r7 = r19
            r4 = r21
            r5 = r22
            java.lang.String r0 = "fonts/nasa_soft44.ttf"
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r7)
            android.app.AlertDialog r8 = r1.create()
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            android.content.Context r1 = r19.getApplicationContext()
            r9.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r1.<init>(r10, r10)
            r9.setLayoutParams(r1)
            r11 = 1
            r9.setOrientation(r11)
            r1 = 17
            r9.setGravity(r1)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r3 = r19.getApplicationContext()
            r2.<init>(r3)
            r2.setOrientation(r11)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r12 = -2
            r6 = 0
            r3.<init>(r10, r12, r6)
            r13 = 2
            r3.setMargins(r13, r13, r13, r13)
            r2.setLayoutParams(r3)
            r3 = 12
            r2.setPadding(r3, r3, r3, r3)
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            android.content.Context r15 = r19.getApplicationContext()
            r14.<init>(r15)
            r15 = 0
            r14.setOrientation(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r12 = 80
            r15.<init>(r10, r12, r6)
            r12 = 4
            r15.setMargins(r11, r11, r11, r12)
            r14.setLayoutParams(r15)
            r14.setPadding(r3, r3, r3, r3)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$20 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$20
            r3.<init>()
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12 = -657931(0xfffffffffff5f5f5, float:NaN)
            android.graphics.drawable.GradientDrawable r3 = r3.getIns(r13, r11, r15, r12)
            r14.setBackground(r3)
            r2.setGravity(r1)
            android.widget.EditText r3 = new android.widget.EditText
            android.content.Context r12 = r19.getApplicationContext()
            r3.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r15 = 1065353216(0x3f800000, float:1.0)
            r1 = -2
            r12.<init>(r10, r1, r15)
            r12.setMargins(r13, r13, r13, r13)
            r3.setLayoutParams(r12)
            r1 = 53
            r3.setGravity(r1)
            android.widget.ImageView r12 = new android.widget.ImageView
            android.content.Context r1 = r19.getApplicationContext()
            r12.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r15 = 45
            r1.<init>(r15, r10, r6)
            r1.setMargins(r11, r11, r11, r11)
            r12.setLayoutParams(r1)
            r1 = 2131165414(0x7f0700e6, float:1.7945044E38)
            r12.setImageResource(r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r12.setScaleType(r1)
            r14.addView(r12)
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r15 = r19.getApplicationContext()
            r1.<init>(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r11 = 80
            r15.<init>(r10, r11, r6)
            r1.setLayoutParams(r15)
            r11 = -1499549(0xffffffffffe91e63, float:NaN)
            r1.setTextColor(r11)
            r15 = 1096810496(0x41600000, float:14.0)
            r1.setTextSize(r15)
            r15 = 17
            r1.setGravity(r15)
            r14.addView(r1)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r15 = -2
            r11.<init>(r10, r15, r6)
            r15 = 0
            r11.setMargins(r13, r13, r13, r15)
            r1.setLayoutParams(r11)
            r2.addView(r14)
            r11 = 17
            r3.setGravity(r11)
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            android.content.Context r14 = r19.getApplicationContext()
            r11.<init>(r14)
            r11.setOrientation(r15)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r16 = r12
            r12 = 3
            r14.<init>(r10, r12, r6)
            r14.setMargins(r15, r13, r13, r15)
            r11.setLayoutParams(r14)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$21 r14 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$21
            r14.<init>()
            r15 = -6381922(0xffffffffff9e9e9e, float:NaN)
            r12 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r14 = r14.getIns(r13, r13, r15, r12)
            r11.setBackground(r14)
            r2.addView(r11)
            android.widget.ImageView r11 = new android.widget.ImageView
            android.content.Context r14 = r19.getApplicationContext()
            r11.<init>(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r15 = 350(0x15e, float:4.9E-43)
            r14.<init>(r10, r15, r6)
            r14.setMargins(r13, r13, r13, r13)
            r11.setLayoutParams(r14)
            android.widget.ImageView$ScaleType r14 = android.widget.ImageView.ScaleType.FIT_CENTER
            r11.setScaleType(r14)
            r2.addView(r11)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$22 r14 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$22
            r14.<init>()
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.GradientDrawable r14 = r14.getIns(r13, r13, r15, r10)
            r11.setBackground(r14)
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            android.content.Context r15 = r19.getApplicationContext()
            r14.<init>(r15)
            r15 = 0
            r14.setOrientation(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r12 = 1065353216(0x3f800000, float:1.0)
            r15.<init>(r10, r6, r12)
            r6 = 3
            r15.setMargins(r13, r6, r6, r13)
            r14.setLayoutParams(r15)
            r6 = 53
            r14.setGravity(r6)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$23 r6 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$23
            r6.<init>()
            r12 = -6381922(0xffffffffff9e9e9e, float:NaN)
            r15 = -657931(0xfffffffffff5f5f5, float:NaN)
            android.graphics.drawable.GradientDrawable r6 = r6.getIns(r13, r13, r12, r15)
            r14.setBackground(r6)
            r14.addView(r3)
            r2.addView(r14)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            android.content.Context r12 = r19.getApplicationContext()
            r6.<init>(r12)
            r12 = 0
            r6.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r13 = 0
            r15 = 3
            r14.<init>(r10, r15, r13)
            r13 = 4
            r14.setMargins(r12, r13, r12, r13)
            r6.setLayoutParams(r14)
            r2.addView(r6)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$24 r13 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$24
            r13.<init>()
            r14 = -1118482(0xffffffffffeeeeee, float:NaN)
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.GradientDrawable r13 = r13.getIns(r12, r12, r15, r14)
            r6.setBackground(r13)
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r12 = r19.getApplicationContext()
            r6.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r13 = 60
            r14 = 1065353216(0x3f800000, float:1.0)
            r12.<init>(r10, r13, r14)
            r6.setLayoutParams(r12)
            r12 = -59580(0xffffffffffff1744, float:NaN)
            r6.setTextColor(r12)
            r12 = 1097859072(0x41700000, float:15.0)
            r6.setTextSize(r12)
            java.lang.String r14 = "هل تريد الحفظ ؟"
            r6.setText(r14)
            r14 = 17
            r6.setGravity(r14)
            r2.addView(r6)
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            android.content.Context r15 = r19.getApplicationContext()
            r14.<init>(r15)
            r15 = 0
            r14.setOrientation(r15)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r12 = -2
            r15 = 0
            r13.<init>(r10, r12, r15)
            r12 = 8
            r10 = 1
            r15 = 0
            r13.setMargins(r15, r12, r10, r15)
            r14.setLayoutParams(r13)
            android.widget.TextView r10 = new android.widget.TextView
            android.content.Context r12 = r19.getApplicationContext()
            r10.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r13 = 120(0x78, float:1.68E-43)
            r15 = 50
            r17 = r11
            r11 = 1065353216(0x3f800000, float:1.0)
            r12.<init>(r13, r15, r11)
            r10.setLayoutParams(r12)
            r11 = -1499549(0xffffffffffe91e63, float:NaN)
            r10.setTextColor(r11)
            r11 = 1097859072(0x41700000, float:15.0)
            r10.setTextSize(r11)
            java.lang.String r11 = "cancel"
            r10.setText(r11)
            r11 = 17
            r10.setGravity(r11)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$25 r11 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$25
            r11.<init>(r3, r8)
            r10.setOnClickListener(r11)
            r14.addView(r10)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r12 = 200(0xc8, float:2.8E-43)
            r13 = 60
            r15 = 0
            r11.<init>(r12, r13, r15)
            r12 = 10
            r13 = 1
            r11.setMargins(r12, r13, r13, r12)
            r10.setLayoutParams(r11)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$26 r11 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$26
            r11.<init>()
            r13 = 20
            r18 = r8
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12 = 3
            r15 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r11 = r11.getIns(r13, r12, r8, r15)
            r10.setBackground(r11)
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r11 = r19.getApplicationContext()
            r8.<init>(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r12 = 150(0x96, float:2.1E-43)
            r13 = 45
            r15 = 1065353216(0x3f800000, float:1.0)
            r11.<init>(r12, r13, r15)
            r8.setLayoutParams(r11)
            r11 = -59580(0xffffffffffff1744, float:NaN)
            r8.setTextColor(r11)
            r11 = 1097859072(0x41700000, float:15.0)
            r8.setTextSize(r11)
            java.lang.String r11 = "ok"
            r8.setText(r11)
            r11 = 17
            r8.setGravity(r11)
            r14.addView(r8)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r12 = 200(0xc8, float:2.8E-43)
            r13 = 60
            r15 = 0
            r11.<init>(r12, r13, r15)
            r12 = 10
            r13 = 1
            r11.setMargins(r12, r13, r13, r12)
            r8.setLayoutParams(r11)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$27 r11 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$27
            r11.<init>()
            r12 = 20
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r13 = 3
            r15 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r11 = r11.getIns(r12, r13, r4, r15)
            r8.setBackground(r11)
            r11 = -1
            r2.setBackgroundColor(r11)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$28 r12 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$28
            r12.<init>()
            r13 = 1
            r15 = 2
            android.graphics.drawable.GradientDrawable r4 = r12.getIns(r15, r13, r4, r11)
            r3.setBackground(r4)
            r2.addView(r14)
            r9.addView(r2)
            android.content.res.AssetManager r2 = r19.getAssets()     // Catch:{ Exception -> 0x0302 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r0)     // Catch:{ Exception -> 0x0302 }
            r6.setTypeface(r2, r13)     // Catch:{ Exception -> 0x0302 }
            android.content.res.AssetManager r2 = r19.getAssets()     // Catch:{ Exception -> 0x0302 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r0)     // Catch:{ Exception -> 0x0302 }
            r1.setTypeface(r2, r13)     // Catch:{ Exception -> 0x0302 }
            android.content.res.AssetManager r2 = r19.getAssets()     // Catch:{ Exception -> 0x0302 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r0)     // Catch:{ Exception -> 0x0302 }
            r8.setTypeface(r2, r13)     // Catch:{ Exception -> 0x0302 }
            android.content.res.AssetManager r2 = r19.getAssets()     // Catch:{ Exception -> 0x0302 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r2, r0)     // Catch:{ Exception -> 0x0302 }
            r10.setTypeface(r0, r13)     // Catch:{ Exception -> 0x0302 }
        L_0x0302:
            java.lang.String r0 = ""
            r3.setText(r0)
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch:{ Exception -> 0x034f }
            r0.<init>()     // Catch:{ Exception -> 0x034f }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r7.Data_Map     // Catch:{ Exception -> 0x034f }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x034f }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x034f }
            java.lang.String r4 = "2"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x034f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x034f }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$29 r4 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$29     // Catch:{ Exception -> 0x034f }
            r4.<init>()     // Catch:{ Exception -> 0x034f }
            java.lang.reflect.Type r4 = r4.getType()     // Catch:{ Exception -> 0x034f }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r2, (java.lang.reflect.Type) r4)     // Catch:{ Exception -> 0x034f }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x034f }
            r7.List_startMap = r0     // Catch:{ Exception -> 0x034f }
            r4 = r21
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x0351 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0351 }
            java.lang.String r2 = "n"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0351 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0351 }
            java.lang.String r2 = "1"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0351 }
            if (r0 == 0) goto L_0x0351
            r0 = 12290(0x3002, float:1.7222E-41)
            r3.setInputType(r0)     // Catch:{ Exception -> 0x0351 }
            goto L_0x0351
        L_0x034f:
            r4 = r21
        L_0x0351:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f0 }
            java.lang.String r2 = "العمود "
            r0.<init>(r2)     // Catch:{ Exception -> 0x03f0 }
            r0.append(r4)     // Catch:{ Exception -> 0x03f0 }
            java.lang.String r2 = "  الصف "
            r0.append(r2)     // Catch:{ Exception -> 0x03f0 }
            r0.append(r5)     // Catch:{ Exception -> 0x03f0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03f0 }
            r1.setText(r0)     // Catch:{ Exception -> 0x03f0 }
            java.lang.CharSequence r0 = r20.getText()     // Catch:{ Exception -> 0x03f0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03f0 }
            r3.setText(r0)     // Catch:{ Exception -> 0x03f0 }
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x03f0 }
            r1 = 100
            r2 = 1065353216(0x3f800000, float:1.0)
            r6 = -1
            r0.<init>(r6, r1, r2)     // Catch:{ Exception -> 0x03f0 }
            r3.setLayoutParams(r0)     // Catch:{ Exception -> 0x03f0 }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$30 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$30     // Catch:{ Exception -> 0x03f0 }
            r10 = r18
            r0.<init>(r4, r5, r10)     // Catch:{ Exception -> 0x03f2 }
            r1 = r16
            r1.setOnClickListener(r0)     // Catch:{ Exception -> 0x03f2 }
            r0 = 8
            r1 = r17
            r1.setVisibility(r0)     // Catch:{ Exception -> 0x03f2 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r7.List_startMap     // Catch:{ Exception -> 0x03b4 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x03b4 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x03b4 }
            java.lang.String r1 = "n"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x03b4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03b4 }
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x03b4 }
            if (r0 == 0) goto L_0x03b4
            r0 = 12290(0x3002, float:1.7222E-41)
            r3.setInputType(r0)     // Catch:{ Exception -> 0x03b4 }
        L_0x03b4:
            r0 = 1
            r3.setEnabled(r0)     // Catch:{ Exception -> 0x03f2 }
            r3.requestFocus()     // Catch:{ Exception -> 0x03f2 }
            java.lang.String r1 = "input_method"
            java.lang.Object r1 = r7.getSystemService(r1)     // Catch:{ Exception -> 0x03f2 }
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1     // Catch:{ Exception -> 0x03f2 }
            r1.showSoftInput(r3, r0)     // Catch:{ Exception -> 0x03f2 }
            android.text.Editable r0 = r3.getText()     // Catch:{ Exception -> 0x03f2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03f2 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x03f2 }
            android.text.Editable r1 = r3.getText()     // Catch:{ Exception -> 0x03f2 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x03f2 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x03f2 }
            r3.setSelection(r0, r1)     // Catch:{ Exception -> 0x03f2 }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$31 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$31     // Catch:{ Exception -> 0x03f2 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x03f2 }
            r7.timer_5 = r0     // Catch:{ Exception -> 0x03f2 }
            java.util.Timer r1 = r7._timer     // Catch:{ Exception -> 0x03f2 }
            r11 = 50
            r1.schedule(r0, r11)     // Catch:{ Exception -> 0x03f2 }
            goto L_0x03f2
        L_0x03f0:
            r10 = r18
        L_0x03f2:
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$32 r11 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$32
            r0 = r11
            r1 = r19
            r2 = r20
            r12 = r3
            r4 = r21
            r5 = r22
            r6 = r10
            r0.<init>(r2, r3, r4, r5, r6)
            r8.setOnClickListener(r11)
            r0 = 1
            r12.setEnabled(r0)     // Catch:{ Exception -> 0x0432 }
            r12.requestFocus()     // Catch:{ Exception -> 0x0432 }
            java.lang.String r1 = "input_method"
            java.lang.Object r1 = r7.getSystemService(r1)     // Catch:{ Exception -> 0x0432 }
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1     // Catch:{ Exception -> 0x0432 }
            r1.showSoftInput(r12, r0)     // Catch:{ Exception -> 0x0432 }
            android.text.Editable r0 = r12.getText()     // Catch:{ Exception -> 0x0432 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0432 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0432 }
            android.text.Editable r1 = r12.getText()     // Catch:{ Exception -> 0x0432 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0432 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0432 }
            r12.setSelection(r0, r1)     // Catch:{ Exception -> 0x0432 }
        L_0x0432:
            r10.setView(r9)
            r10.show()
            android.view.Window r0 = r10.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r1.<init>(r2)
            r0.setBackgroundDrawable(r1)
            android.view.Window r0 = r10.getWindow()
            r1 = -2
            r2 = -1
            r0.setLayout(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterTableActivity.sav(android.widget.TextView, int, int):void");
    }

    public void dialogE(int i, int i2, int i3) {
        final AlertDialog create = new AlertDialog.Builder(this).create();
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams.setMargins(2, 2, 2, 2);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setPadding(12, 12, 12, 12);
        LinearLayout linearLayout3 = new LinearLayout(getApplicationContext());
        linearLayout3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 80, 0.0f);
        layoutParams2.setMargins(1, 1, 1, 4);
        linearLayout3.setLayoutParams(layoutParams2);
        linearLayout3.setPadding(12, 12, 12, 12);
        linearLayout3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -657931));
        linearLayout2.setGravity(17);
        ImageView imageView = new ImageView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(45, -1, 0.0f);
        layoutParams3.setMargins(1, 1, 1, 1);
        imageView.setLayoutParams(layoutParams3);
        imageView.setImageResource(R.drawable.ulang_19);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        linearLayout3.addView(imageView);
        TextView textView = new TextView(getApplicationContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 0.0f));
        textView.setTextColor(-1499549);
        textView.setTextSize(14.0f);
        textView.setGravity(17);
        linearLayout3.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams4.setMargins(2, 2, 2, 0);
        textView.setLayoutParams(layoutParams4);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams5.setMargins(0, 2, 2, 0);
        linearLayout4.setLayoutParams(layoutParams5);
        linearLayout4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -1118482));
        linearLayout2.addView(linearLayout4);
        LinearLayout linearLayout5 = new LinearLayout(getApplicationContext());
        linearLayout5.setOrientation(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams6.setMargins(2, 3, 3, 2);
        linearLayout5.setLayoutParams(layoutParams6);
        linearLayout5.setGravity(53);
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -657931));
        linearLayout5.removeAllViews();
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        linearLayout6.setOrientation(1);
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        LinearLayout linearLayout7 = new LinearLayout(getApplicationContext());
        linearLayout7.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, 0, 0));
        LinearLayout linearLayout8 = linearLayout5;
        AlertDialog alertDialog = create;
        TextView textView2 = textView;
        LinearLayout linearLayout9 = linearLayout7;
        LinearLayout linearLayout10 = linearLayout6;
        int i4 = i;
        int i5 = i2;
        LinearLayout linearLayout11 = linearLayout10;
        int i6 = i3;
        linearLayout9.addView(E0(alertDialog, "للون الخلفيه", "ic_format_color_fill_black", i4, i5, i6));
        linearLayout9.addView(E0(alertDialog, "سمك الاطار", "ic_crop_din_black", i4, i5, i6));
        linearLayout9.addView(E0(alertDialog, "للون الاطار", "ic_format_color_fill_black", i4, i5, i6));
        linearLayout9.addView(E0(alertDialog, "تقوس الزوياء", "ic_format_bold_black", i4, i5, i6));
        linearLayout11.addView(linearLayout9);
        LinearLayout linearLayout12 = new LinearLayout(getApplicationContext());
        linearLayout12.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, 0, 0));
        AlertDialog alertDialog2 = create;
        linearLayout12.addView(E0(alertDialog2, "تباعد داخلي", "ic_open_with_black", i4, i5, i6));
        linearLayout12.addView(E0(alertDialog2, "تباعد خارجي", "ic_keyboard_tab_black", i4, i5, i6));
        linearLayout12.addView(E0(alertDialog2, "توازن الخط", "ic_format_bold_black", i4, i5, i6));
        linearLayout12.addView(E0(alertDialog2, "ظل الخط", "ic_format_bold_black", i4, i5, i6));
        linearLayout11.addView(linearLayout12);
        LinearLayout linearLayout13 = new LinearLayout(getApplicationContext());
        linearLayout13.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, 0, 0));
        AlertDialog alertDialog3 = create;
        linearLayout13.addView(E0(alertDialog3, "للون الخط", "ic_format_color_fill_black", i4, i5, i6));
        linearLayout13.addView(E0(alertDialog3, "سمك الخط", "ic_format_color_fill_black", i4, i5, i6));
        linearLayout13.addView(E0(alertDialog3, "حجم الخط", "ic_format_size_black", i4, i5, i6));
        linearLayout13.addView(E0(alertDialog3, "نوعية الخط", "ic_spellcheck_black", i4, i5, i6));
        linearLayout11.addView(linearLayout13);
        LinearLayout linearLayout14 = new LinearLayout(getApplicationContext());
        linearLayout14.addView(E0(alertDialog3, "الحجم", "ic_border_inner_black", i4, i5, i6));
        linearLayout14.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, 0, 0));
        linearLayout11.addView(linearLayout14);
        linearLayout8.addView(linearLayout11);
        linearLayout2.addView(linearLayout8);
        LinearLayout linearLayout15 = new LinearLayout(getApplicationContext());
        linearLayout15.setOrientation(0);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams7.setMargins(0, 4, 0, 4);
        linearLayout15.setLayoutParams(layoutParams7);
        linearLayout2.addView(linearLayout15);
        linearLayout15.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 0, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView3 = new TextView(getApplicationContext());
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-1, 60, 1.0f));
        textView3.setTextColor(-59580);
        textView3.setTextSize(15.0f);
        textView3.setText("هل تريد الحفظ ؟");
        textView3.setGravity(17);
        linearLayout2.addView(textView3);
        LinearLayout linearLayout16 = new LinearLayout(getApplicationContext());
        linearLayout16.setOrientation(0);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams8.setMargins(0, 8, 1, 0);
        linearLayout16.setLayoutParams(layoutParams8);
        TextView textView4 = new TextView(getApplicationContext());
        textView4.setLayoutParams(new LinearLayout.LayoutParams(120, 50, 1.0f));
        textView4.setTextColor(-1499549);
        textView4.setTextSize(15.0f);
        textView4.setText("cancel");
        textView4.setGravity(17);
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        linearLayout16.addView(textView4);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams9.setMargins(10, 1, 1, 10);
        textView4.setLayoutParams(layoutParams9);
        textView4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView5 = new TextView(getApplicationContext());
        textView5.setLayoutParams(new LinearLayout.LayoutParams(150, 45, 1.0f));
        textView5.setTextColor(-59580);
        textView5.setTextSize(15.0f);
        textView5.setText("ok");
        textView5.setGravity(17);
        linearLayout16.addView(textView5);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams10.setMargins(10, 1, 1, 10);
        textView5.setLayoutParams(layoutParams10);
        textView5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout2.setBackgroundColor(-1);
        linearLayout2.addView(linearLayout16);
        linearLayout.addView(linearLayout2);
        try {
            textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
        } catch (Exception unused) {
        }
        textView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    create.dismiss();
                } catch (Exception unused) {
                }
            }
        });
        create.setView(linearLayout);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        create.getWindow().setLayout(-1, -2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.LinearLayout E0(android.app.AlertDialog r20, java.lang.String r21, java.lang.String r22, int r23, int r24, int r25) {
        /*
            r19 = this;
            r8 = r19
            r2 = r21
            java.lang.String r0 = "fonts/font.ttf"
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            android.content.Context r1 = r19.getApplicationContext()
            r9.<init>(r1)
            r1 = 1
            r9.setOrientation(r1)
            r9.setPadding(r1, r1, r1, r1)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 150(0x96, float:2.1E-43)
            r5 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4, r5, r6)
            r4 = 2
            r3.setMargins(r4, r4, r4, r4)
            r9.setLayoutParams(r3)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r7 = r19.getApplicationContext()
            r3.<init>(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r11 = 0
            r7.<init>(r5, r10, r11)
            r3.setLayoutParams(r7)
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setTextColor(r7)
            r12 = 1096810496(0x41600000, float:14.0)
            r3.setTextSize(r12)
            r3.setText(r2)
            r12 = 17
            r3.setGravity(r12)
            r9.addView(r3)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r5, r10, r11)
            r10 = 0
            r13.setMargins(r4, r4, r4, r10)
            r3.setLayoutParams(r13)
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            android.content.Context r14 = r19.getApplicationContext()
            r13.<init>(r14)
            r13.setOrientation(r10)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r5, r5, r11)
            r14.setMargins(r1, r1, r1, r1)
            r13.setLayoutParams(r14)
            android.widget.ImageView r14 = new android.widget.ImageView
            android.content.Context r15 = r19.getApplicationContext()
            r14.<init>(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r4 = 50
            r12 = 45
            r15.<init>(r4, r12, r11)
            r15.setMargins(r1, r10, r1, r1)
            r14.setLayoutParams(r15)
            r4 = 2131165414(0x7f0700e6, float:1.7945044E38)
            r14.setImageResource(r4)
            android.content.res.Resources r4 = r19.getResources()
            java.lang.String r11 = r19.getPackageName()
            java.lang.String r12 = "drawable"
            r15 = r22
            int r4 = r4.getIdentifier(r15, r12, r11)
            r14.setImageResource(r4)
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER
            r14.setScaleType(r4)
            r13.addView(r14)
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r11 = r19.getApplicationContext()
            r4.<init>(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r5, r5, r6)
            r4.setLayoutParams(r11)
            r4.setTextColor(r7)
            r11 = 1095761920(0x41500000, float:13.0)
            r4.setTextSize(r11)
            java.lang.String r11 = ""
            r4.setText(r11)
            r12 = 17
            r4.setGravity(r12)
            r13.addView(r4)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r5, r5, r6)
            r12.setMargins(r10, r10, r1, r1)
            r4.setLayoutParams(r12)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$45 r6 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$45     // Catch:{ Exception -> 0x0127 }
            r6.<init>()     // Catch:{ Exception -> 0x0127 }
            r12 = 2
            android.graphics.drawable.GradientDrawable r6 = r6.getIns(r12, r1, r7, r5)     // Catch:{ Exception -> 0x0127 }
            r14.setBackground(r6)     // Catch:{ Exception -> 0x0127 }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$46 r6 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$46     // Catch:{ Exception -> 0x0127 }
            r6.<init>()     // Catch:{ Exception -> 0x0127 }
            r14 = -657931(0xfffffffffff5f5f5, float:NaN)
            android.graphics.drawable.GradientDrawable r6 = r6.getIns(r12, r1, r7, r14)     // Catch:{ Exception -> 0x0127 }
            r3.setBackground(r6)     // Catch:{ Exception -> 0x0127 }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$47 r6 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$47     // Catch:{ Exception -> 0x0127 }
            r6.<init>()     // Catch:{ Exception -> 0x0127 }
            android.graphics.drawable.GradientDrawable r6 = r6.getIns(r12, r1, r7, r5)     // Catch:{ Exception -> 0x0127 }
            r4.setBackground(r6)     // Catch:{ Exception -> 0x0127 }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$48 r6 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$48     // Catch:{ Exception -> 0x0127 }
            r6.<init>()     // Catch:{ Exception -> 0x0127 }
            android.graphics.drawable.GradientDrawable r5 = r6.getIns(r12, r12, r7, r5)     // Catch:{ Exception -> 0x0127 }
            r9.setBackground(r5)     // Catch:{ Exception -> 0x0127 }
            android.content.res.AssetManager r5 = r19.getAssets()     // Catch:{ Exception -> 0x0127 }
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromAsset(r5, r0)     // Catch:{ Exception -> 0x0127 }
            r3.setTypeface(r5, r1)     // Catch:{ Exception -> 0x0127 }
            android.content.res.AssetManager r3 = r19.getAssets()     // Catch:{ Exception -> 0x0127 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r3, r0)     // Catch:{ Exception -> 0x0127 }
            r4.setTypeface(r0, r1)     // Catch:{ Exception -> 0x0127 }
            goto L_0x0128
        L_0x0127:
        L_0x0128:
            r9.addView(r13)
            int r0 = r21.hashCode()
            java.lang.String r3 = "3"
            java.lang.String r5 = "2"
            java.lang.String r6 = "1"
            java.lang.String r7 = "#FF000000"
            r13 = 6
            r14 = 5
            r15 = 3
            r12 = 8
            r16 = 4
            r17 = 0
            switch(r0) {
                case -1469000407: goto L_0x0433;
                case -1383796710: goto L_0x0424;
                case -1106174240: goto L_0x0410;
                case -621347608: goto L_0x0369;
                case -488136378: goto L_0x0353;
                case -213247659: goto L_0x0342;
                case -212326277: goto L_0x0331;
                case -114755271: goto L_0x0289;
                case 744433193: goto L_0x01e1;
                case 967902420: goto L_0x01d0;
                case 1416250421: goto L_0x0183;
                case 1503900265: goto L_0x0172;
                case 1919377488: goto L_0x0154;
                case 2109424355: goto L_0x0145;
                default: goto L_0x0143;
            }
        L_0x0143:
            goto L_0x046a
        L_0x0145:
            java.lang.String r0 = "الشفافية"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x014f
            goto L_0x046a
        L_0x014f:
            r4.setText(r11)
            goto L_0x046d
        L_0x0154:
            java.lang.String r0 = "نوعية الخط"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x015e
            goto L_0x046a
        L_0x015e:
            java.lang.String r0 = r8.Font_path
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r0 = r0.getLastPathSegment()
            r4.setText(r0)
            r0 = 1090519040(0x41000000, float:8.0)
            r4.setTextSize(r0)
            goto L_0x046d
        L_0x0172:
            java.lang.String r0 = "الحجم"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x017c
            goto L_0x046a
        L_0x017c:
            java.lang.String r0 = r8.size
            r4.setText(r0)
            goto L_0x046d
        L_0x0183:
            java.lang.String r0 = "سمك الخط"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x018d
            goto L_0x046a
        L_0x018d:
            java.lang.String r0 = r8.Font_Stayl
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = "عـــــــــادي"
            r4.setText(r0)
            goto L_0x046d
        L_0x019e:
            java.lang.String r0 = r8.Font_Stayl
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x01ad
            java.lang.String r0 = "سميــــــــك"
            r4.setText(r0)
            goto L_0x046d
        L_0x01ad:
            java.lang.String r0 = r8.Font_Stayl
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01bc
            java.lang.String r0 = "مــــــــــــائل"
            r4.setText(r0)
            goto L_0x046d
        L_0x01bc:
            java.lang.String r0 = r8.Font_Stayl
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x01cb
            java.lang.String r0 = "مائل سميك"
            r4.setText(r0)
            goto L_0x046d
        L_0x01cb:
            r4.setText(r11)
            goto L_0x046d
        L_0x01d0:
            java.lang.String r0 = "تقوس الزوياء"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x01da
            goto L_0x046a
        L_0x01da:
            java.lang.String r0 = r8.T_z5
            r4.setText(r0)
            goto L_0x046d
        L_0x01e1:
            java.lang.String r0 = "للون الخلفيه"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x01eb
            goto L_0x046a
        L_0x01eb:
            java.lang.String r0 = r8.beack_color
            r4.setText(r0)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            android.content.Context r3 = r19.getApplicationContext()
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r3 = (int) r3
            java.lang.String r5 = r8.beack_color
            int r5 = android.graphics.Color.parseColor(r5)
            r0.setColor(r5)
            float[] r5 = new float[r12]
            float r6 = (float) r3
            java.lang.String r11 = java.lang.String.valueOf(r17)
            float r11 = java.lang.Float.parseFloat(r11)
            float r11 = r11 * r6
            r5[r10] = r11
            java.lang.String r10 = java.lang.String.valueOf(r17)
            float r10 = java.lang.Float.parseFloat(r10)
            float r10 = r10 * r6
            r5[r1] = r10
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r10 = 2
            r5[r10] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r15] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r16] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r14] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r13] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r6 = r6 * r1
            r1 = 7
            r5[r1] = r6
            r0.setCornerRadii(r5)
            int r1 = r3 * 2
            int r5 = android.graphics.Color.parseColor(r7)
            r0.setStroke(r1, r5)
            int r3 = r3 * 4
            float r1 = (float) r3
            r4.setElevation(r1)
            r4.setBackground(r0)
            goto L_0x046d
        L_0x0289:
            java.lang.String r0 = "للون الاطار"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0293
            goto L_0x046a
        L_0x0293:
            java.lang.String r0 = r8.Etar_color
            r4.setText(r0)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            android.content.Context r3 = r19.getApplicationContext()
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r3 = (int) r3
            java.lang.String r5 = r8.Etar_color
            int r5 = android.graphics.Color.parseColor(r5)
            r0.setColor(r5)
            float[] r5 = new float[r12]
            float r6 = (float) r3
            java.lang.String r11 = java.lang.String.valueOf(r17)
            float r11 = java.lang.Float.parseFloat(r11)
            float r11 = r11 * r6
            r5[r10] = r11
            java.lang.String r10 = java.lang.String.valueOf(r17)
            float r10 = java.lang.Float.parseFloat(r10)
            float r10 = r10 * r6
            r5[r1] = r10
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r10 = 2
            r5[r10] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r15] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r16] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r14] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r13] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r6 = r6 * r1
            r1 = 7
            r5[r1] = r6
            r0.setCornerRadii(r5)
            int r1 = r3 * 2
            int r5 = android.graphics.Color.parseColor(r7)
            r0.setStroke(r1, r5)
            int r3 = r3 * 4
            float r1 = (float) r3
            r4.setElevation(r1)
            r4.setBackground(r0)
            goto L_0x046d
        L_0x0331:
            java.lang.String r0 = "تباعد داخلي"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x033b
            goto L_0x046a
        L_0x033b:
            java.lang.String r0 = r8.T_in
            r4.setText(r0)
            goto L_0x046d
        L_0x0342:
            java.lang.String r0 = "تباعد خارجي"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x034c
            goto L_0x046a
        L_0x034c:
            java.lang.String r0 = r8.T_out
            r4.setText(r0)
            goto L_0x046d
        L_0x0353:
            java.lang.String r0 = "سمك الاطار"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x035d
            goto L_0x046a
        L_0x035d:
            double r0 = r8.Etar
            long r0 = (long) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.setText(r0)
            goto L_0x046d
        L_0x0369:
            java.lang.String r0 = "للون الخط"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0373
            goto L_0x046a
        L_0x0373:
            java.lang.String r0 = r8.Font_colorr
            r4.setText(r0)
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            android.content.Context r3 = r19.getApplicationContext()
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r3 = (int) r3
            java.lang.String r5 = r8.Font_colorr
            int r5 = android.graphics.Color.parseColor(r5)
            r0.setColor(r5)
            float[] r5 = new float[r12]
            float r6 = (float) r3
            java.lang.String r11 = java.lang.String.valueOf(r17)
            float r11 = java.lang.Float.parseFloat(r11)
            float r11 = r11 * r6
            r5[r10] = r11
            java.lang.String r10 = java.lang.String.valueOf(r17)
            float r10 = java.lang.Float.parseFloat(r10)
            float r10 = r10 * r6
            r5[r1] = r10
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r10 = 2
            r5[r10] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r15] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r16] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r14] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r1 = r1 * r6
            r5[r13] = r1
            java.lang.String r1 = java.lang.String.valueOf(r17)
            float r1 = java.lang.Float.parseFloat(r1)
            float r6 = r6 * r1
            r1 = 7
            r5[r1] = r6
            r0.setCornerRadii(r5)
            int r1 = r3 * 2
            int r5 = android.graphics.Color.parseColor(r7)
            r0.setStroke(r1, r5)
            int r3 = r3 * 4
            float r1 = (float) r3
            r4.setElevation(r1)
            r4.setBackground(r0)
            goto L_0x046d
        L_0x0410:
            java.lang.String r0 = "حجم الخط"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0419
            goto L_0x046a
        L_0x0419:
            double r0 = r8.Font_size
            long r0 = (long) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.setText(r0)
            goto L_0x046d
        L_0x0424:
            java.lang.String r0 = "ظل الخط"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x042d
            goto L_0x046a
        L_0x042d:
            java.lang.String r0 = r8.abC
            r4.setText(r0)
            goto L_0x046d
        L_0x0433:
            java.lang.String r0 = "توازن الخط"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x043c
            goto L_0x046a
        L_0x043c:
            java.lang.String r0 = r8.T_W
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x044a
            java.lang.String r0 = "يميــــــن"
            r4.setText(r0)
            goto L_0x046d
        L_0x044a:
            java.lang.String r0 = r8.T_W
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0458
            java.lang.String r0 = "يســـــــــار"
            r4.setText(r0)
            goto L_0x046d
        L_0x0458:
            java.lang.String r0 = r8.T_W
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0466
            java.lang.String r0 = "توســــــط"
            r4.setText(r0)
            goto L_0x046d
        L_0x0466:
            r4.setText(r11)
            goto L_0x046d
        L_0x046a:
            r4.setText(r11)
        L_0x046d:
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$49 r10 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$49
            r0 = r10
            r1 = r19
            r2 = r21
            r3 = r4
            r4 = r20
            r5 = r23
            r6 = r24
            r7 = r25
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r9.setOnClickListener(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterTableActivity.E0(android.app.AlertDialog, java.lang.String, java.lang.String, int, int, int):android.widget.LinearLayout");
    }

    public void op1(TextView textView, AlertDialog alertDialog, int i, int i2, int i3) {
        PopupMenu popupMenu = new PopupMenu(this, textView);
        Menu menu = popupMenu.getMenu();
        menu.add("عـــــــــادي");
        menu.add("سميــــــــك");
        menu.add("مــــــــــــائل");
        menu.add("مائل سميك");
        final TextView textView2 = textView;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final AlertDialog alertDialog2 = alertDialog;
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                String charSequence = menuItem.getTitle().toString();
                switch (charSequence.hashCode()) {
                    case -1597947285:
                        if (!charSequence.equals("مائل سميك")) {
                            return false;
                        }
                        textView2.setText("مائل سميك");
                        EnterTableActivity.this.Font_Stayl = "3";
                        EnterTableActivity enterTableActivity = EnterTableActivity.this;
                        enterTableActivity._Set_Stenge((double) i4, (double) i5, (double) i6, "24", enterTableActivity.Font_Stayl);
                        alertDialog2.dismiss();
                        return true;
                    case 356987691:
                        if (!charSequence.equals("سميــــــــك")) {
                            return false;
                        }
                        textView2.setText("سميــــــــك");
                        EnterTableActivity.this.Font_Stayl = "1";
                        EnterTableActivity enterTableActivity2 = EnterTableActivity.this;
                        enterTableActivity2._Set_Stenge((double) i4, (double) i5, (double) i6, "24", enterTableActivity2.Font_Stayl);
                        alertDialog2.dismiss();
                        return true;
                    case 860473563:
                        if (!charSequence.equals("عـــــــــادي")) {
                            return false;
                        }
                        textView2.setText("عـــــــــادي");
                        EnterTableActivity.this.Font_Stayl = "0";
                        EnterTableActivity enterTableActivity3 = EnterTableActivity.this;
                        enterTableActivity3._Set_Stenge((double) i4, (double) i5, (double) i6, "24", enterTableActivity3.Font_Stayl);
                        alertDialog2.dismiss();
                        return true;
                    case 904344672:
                        if (!charSequence.equals("مــــــــــــائل")) {
                            return false;
                        }
                        textView2.setText("مــــــــــــائل");
                        EnterTableActivity.this.Font_Stayl = "2";
                        EnterTableActivity enterTableActivity4 = EnterTableActivity.this;
                        enterTableActivity4._Set_Stenge((double) i4, (double) i5, (double) i6, "24", enterTableActivity4.Font_Stayl);
                        alertDialog2.dismiss();
                        return true;
                    default:
                        return false;
                }
            }
        });
        popupMenu.show();
    }

    public void op2(TextView textView, AlertDialog alertDialog, int i, int i2, int i3) {
        PopupMenu popupMenu = new PopupMenu(this, textView);
        Menu menu = popupMenu.getMenu();
        menu.add("يميــــــن");
        menu.add("توســــــط");
        menu.add("يســـــــــار");
        final TextView textView2 = textView;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final AlertDialog alertDialog2 = alertDialog;
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                String charSequence = menuItem.getTitle().toString();
                int hashCode = charSequence.hashCode();
                if (hashCode != -1510461855) {
                    if (hashCode != -1212915710) {
                        if (hashCode != -649052425 || !charSequence.equals("يميــــــن")) {
                            return false;
                        }
                        textView2.setText("يميــــــن");
                        EnterTableActivity.this.T_W = "1";
                        EnterTableActivity enterTableActivity = EnterTableActivity.this;
                        enterTableActivity._Set_Stenge((double) i4, (double) i5, (double) i6, "25", enterTableActivity.T_W);
                        alertDialog2.dismiss();
                        return true;
                    } else if (!charSequence.equals("توســــــط")) {
                        return false;
                    } else {
                        textView2.setText("توســــــط");
                        EnterTableActivity.this.T_W = "3";
                        EnterTableActivity enterTableActivity2 = EnterTableActivity.this;
                        enterTableActivity2._Set_Stenge((double) i4, (double) i5, (double) i6, "25", enterTableActivity2.T_W);
                        alertDialog2.dismiss();
                        return true;
                    }
                } else if (!charSequence.equals("يســـــــــار")) {
                    return false;
                } else {
                    textView2.setText("يســـــــــار");
                    EnterTableActivity.this.T_W = "2";
                    EnterTableActivity enterTableActivity3 = EnterTableActivity.this;
                    enterTableActivity3._Set_Stenge((double) i4, (double) i5, (double) i6, "25", enterTableActivity3.T_W);
                    alertDialog2.dismiss();
                    return true;
                }
            }
        });
        popupMenu.show();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x045f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Size_WHW(android.widget.TextView r23, android.app.AlertDialog r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r10 = r22
            java.lang.String r0 = "fonts/font.ttf"
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r10)
            android.app.AlertDialog r11 = r1.create()
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            android.content.Context r1 = r22.getApplicationContext()
            r12.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r12.setLayoutParams(r1)
            r1 = 1
            r12.setOrientation(r1)
            r3 = 17
            r12.setGravity(r3)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r5 = r22.getApplicationContext()
            r4.<init>(r5)
            r4.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r13 = -2
            r6 = 0
            r5.<init>(r2, r13, r6)
            r4.setLayoutParams(r5)
            r5 = 8
            r4.setPadding(r5, r5, r5, r5)
            r4.setBackgroundColor(r2)
            r4.setGravity(r3)
            r12.addView(r4)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            android.content.Context r8 = r22.getApplicationContext()
            r7.<init>(r8)
            r14 = 0
            r7.setOrientation(r14)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = 87
            r8.<init>(r2, r9, r6)
            r7.setLayoutParams(r8)
            r8 = 2
            r7.setPadding(r8, r8, r8, r8)
            r15 = -1118482(0xffffffffffeeeeee, float:NaN)
            r7.setBackgroundColor(r15)
            r7.setGravity(r3)
            r4.addView(r7)
            android.widget.ImageView r15 = new android.widget.ImageView
            android.content.Context r8 = r22.getApplicationContext()
            r15.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r5 = 61
            r8.<init>(r5, r5, r6)
            r15.setLayoutParams(r8)
            r15.setPadding(r1, r1, r1, r1)
            r8 = 2131165310(0x7f07007e, float:1.7944834E38)
            r15.setImageResource(r8)
            r7.addView(r15)
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r15 = r22.getApplicationContext()
            r8.<init>(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r9 = 70
            r2 = 1065353216(0x3f800000, float:1.0)
            r15.<init>(r13, r9, r2)
            r8.setLayoutParams(r15)
            java.lang.String r15 = "☆إعدادات ابعاد الصوره ☆"
            r8.setText(r15)
            r15 = 1099956224(0x41900000, float:18.0)
            r8.setTextSize(r15)
            r15 = -720809(0xfffffffffff50057, float:NaN)
            r8.setTextColor(r15)
            r8.setGravity(r3)
            r7.addView(r8)
            android.widget.ImageView r15 = new android.widget.ImageView
            android.content.Context r9 = r22.getApplicationContext()
            r15.<init>(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r5, r5, r6)
            r15.setLayoutParams(r9)
            r15.setPadding(r1, r1, r1, r1)
            r5 = 2131165342(0x7f07009e, float:1.7944898E38)
            r15.setImageResource(r5)
            r7.addView(r15)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r7 = r22.getApplicationContext()
            r5.<init>(r7)
            r5.setOrientation(r14)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r7.<init>(r9, r13, r6)
            r5.setLayoutParams(r7)
            r4.addView(r5)
            android.widget.TextView r7 = new android.widget.TextView
            android.content.Context r15 = r22.getApplicationContext()
            r7.<init>(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r15.<init>(r9, r13, r6)
            r7.setLayoutParams(r15)
            r7.setBackgroundColor(r9)
            java.lang.String r9 = "تحديد نوع الاضافة.،"
            r7.setText(r9)
            r9 = 1096810496(0x41600000, float:14.0)
            r7.setTextSize(r9)
            r15 = -14983648(0xffffffffff1b5e20, float:-2.0651906E38)
            r7.setTextColor(r15)
            r15 = 21
            r7.setGravity(r15)
            r5.addView(r7)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r15 = r22.getApplicationContext()
            r5.<init>(r15)
            r5.setOrientation(r14)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r1 = 87
            r9 = -1
            r15.<init>(r9, r1, r6)
            r5.setLayoutParams(r15)
            r1 = 4
            r5.setPadding(r1, r1, r1, r1)
            r5.setGravity(r3)
            r4.addView(r5)
            android.widget.EditText r15 = new android.widget.EditText
            android.content.Context r13 = r22.getApplicationContext()
            r15.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r1 = 262(0x106, float:3.67E-43)
            r13.<init>(r1, r9, r2)
            r15.setLayoutParams(r13)
            r9 = 8
            r15.setPadding(r9, r9, r9, r9)
            r9 = 1094713344(0x41400000, float:12.0)
            r15.setTextSize(r9)
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r15.setTextColor(r13)
            r15.setGravity(r3)
            r5.addView(r15)
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r6 = r22.getApplicationContext()
            r1.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r14 = 175(0xaf, float:2.45E-43)
            r3 = -1
            r6.<init>(r14, r3, r2)
            r1.setLayoutParams(r6)
            r3 = 8
            r1.setPadding(r3, r3, r3, r3)
            r3 = -657931(0xfffffffffff5f5f5, float:NaN)
            r1.setBackgroundColor(r3)
            java.lang.String r6 = "الارتفاع"
            r1.setText(r6)
            r1.setTextSize(r9)
            r1.setTextColor(r13)
            r6 = 17
            r1.setGravity(r6)
            r5.addView(r1)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r3 = r22.getApplicationContext()
            r5.<init>(r3)
            r3 = 0
            r5.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r13 = 0
            r14 = 87
            r3.<init>(r9, r14, r13)
            r5.setLayoutParams(r3)
            r3 = 4
            r5.setPadding(r3, r3, r3, r3)
            r5.setGravity(r6)
            r4.addView(r5)
            android.widget.EditText r13 = new android.widget.EditText
            android.content.Context r3 = r22.getApplicationContext()
            r13.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r14 = 262(0x106, float:3.67E-43)
            r3.<init>(r14, r9, r2)
            r13.setLayoutParams(r3)
            r3 = 8
            r13.setPadding(r3, r3, r3, r3)
            r14 = 1094713344(0x41400000, float:12.0)
            r13.setTextSize(r14)
            r14 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r13.setTextColor(r14)
            r13.setGravity(r6)
            r5.addView(r13)
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r14 = r22.getApplicationContext()
            r6.<init>(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r3 = 175(0xaf, float:2.45E-43)
            r14.<init>(r3, r9, r2)
            r6.setLayoutParams(r14)
            r3 = 8
            r6.setPadding(r3, r3, r3, r3)
            r3 = -657931(0xfffffffffff5f5f5, float:NaN)
            r6.setBackgroundColor(r3)
            java.lang.String r3 = "العرض"
            r6.setText(r3)
            r3 = 1094713344(0x41400000, float:12.0)
            r6.setTextSize(r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setTextColor(r3)
            r3 = 17
            r6.setGravity(r3)
            r5.addView(r6)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r9 = r22.getApplicationContext()
            r5.<init>(r9)
            r9 = 0
            r5.setOrientation(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r2 = 0
            r3 = -1
            r14 = 87
            r9.<init>(r3, r14, r2)
            r5.setLayoutParams(r9)
            r2 = 4
            r5.setPadding(r2, r2, r2, r2)
            r2 = 17
            r5.setGravity(r2)
            r4.addView(r5)
            android.widget.EditText r14 = new android.widget.EditText
            android.content.Context r9 = r22.getApplicationContext()
            r14.<init>(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r19 = r12
            r2 = 262(0x106, float:3.67E-43)
            r12 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r2, r3, r12)
            r14.setLayoutParams(r9)
            r2 = 8
            r14.setPadding(r2, r2, r2, r2)
            r9 = 1094713344(0x41400000, float:12.0)
            r14.setTextSize(r9)
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r14.setTextColor(r9)
            r9 = 17
            r14.setGravity(r9)
            r5.addView(r14)
            android.widget.TextView r9 = new android.widget.TextView
            android.content.Context r2 = r22.getApplicationContext()
            r9.<init>(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r20 = r11
            r11 = 175(0xaf, float:2.45E-43)
            r2.<init>(r11, r3, r12)
            r9.setLayoutParams(r2)
            r2 = 8
            r9.setPadding(r2, r2, r2, r2)
            r2 = -657931(0xfffffffffff5f5f5, float:NaN)
            r9.setBackgroundColor(r2)
            java.lang.String r2 = "الوزن"
            r9.setText(r2)
            r2 = 1094713344(0x41400000, float:12.0)
            r9.setTextSize(r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.setTextColor(r2)
            r2 = 17
            r9.setGravity(r2)
            r5.addView(r9)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r3 = r22.getApplicationContext()
            r2.<init>(r3)
            r3 = 0
            r2.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r11 = 0
            r12 = -1
            r3.<init>(r12, r5, r11)
            r2.setLayoutParams(r3)
            r4.addView(r2)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r5 = r22.getApplicationContext()
            r3.<init>(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r21 = r6
            r6 = -2
            r5.<init>(r12, r6, r11)
            r3.setLayoutParams(r5)
            r3.setBackgroundColor(r12)
            java.lang.String r5 = "هل تريد الحفظ!"
            r3.setText(r5)
            r5 = 1096810496(0x41600000, float:14.0)
            r3.setTextSize(r5)
            r5 = -720809(0xfffffffffff50057, float:NaN)
            r3.setTextColor(r5)
            r5 = 17
            r3.setGravity(r5)
            r2.addView(r3)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r6 = r22.getApplicationContext()
            r2.<init>(r6)
            r6 = 0
            r2.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r11 = -2
            r12 = 0
            r6.<init>(r5, r11, r12)
            r2.setLayoutParams(r6)
            r5 = -1118482(0xffffffffffeeeeee, float:NaN)
            r2.setBackgroundColor(r5)
            r5 = 17
            r2.setGravity(r5)
            r4.addView(r2)
            android.widget.TextView r11 = new android.widget.TextView
            android.content.Context r4 = r22.getApplicationContext()
            r11.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 210(0xd2, float:2.94E-43)
            r6 = 70
            r4.<init>(r5, r6, r12)
            r11.setLayoutParams(r4)
            java.lang.String r4 = "إلغاء"
            r11.setText(r4)
            r4 = 1096810496(0x41600000, float:14.0)
            r11.setTextSize(r4)
            r4 = -59580(0xffffffffffff1744, float:NaN)
            r11.setTextColor(r4)
            r4 = 17
            r11.setGravity(r4)
            r2.addView(r11)
            android.widget.TextView r12 = new android.widget.TextView
            android.content.Context r4 = r22.getApplicationContext()
            r12.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r18 = r1
            r1 = 0
            r6 = 70
            r4.<init>(r5, r6, r1)
            r12.setLayoutParams(r4)
            java.lang.String r1 = "موافق"
            r12.setText(r1)
            r1 = 1096810496(0x41600000, float:14.0)
            r12.setTextSize(r1)
            r1 = -59580(0xffffffffffff1744, float:NaN)
            r12.setTextColor(r1)
            r1 = 17
            r12.setGravity(r1)
            r2.addView(r12)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r5 = r22.getApplicationContext()
            r4.<init>(r5)
            r5 = 1
            r4.setOrientation(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r17 = r9
            r1 = -2
            r6 = 1065353216(0x3f800000, float:1.0)
            r9 = -1
            r5.<init>(r1, r9, r6)
            r4.setLayoutParams(r5)
            r1 = 17
            r4.setGravity(r1)
            r2.addView(r4)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$52 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$52     // Catch:{ Exception -> 0x045f }
            r1.<init>()     // Catch:{ Exception -> 0x045f }
            r2 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r4 = 2
            r5 = 8
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r5, r4, r2, r9)     // Catch:{ Exception -> 0x045f }
            r14.setBackground(r1)     // Catch:{ Exception -> 0x045f }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$53 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$53     // Catch:{ Exception -> 0x045f }
            r1.<init>()     // Catch:{ Exception -> 0x045f }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r5, r4, r2, r9)     // Catch:{ Exception -> 0x045f }
            r15.setBackground(r1)     // Catch:{ Exception -> 0x045f }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$54 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$54     // Catch:{ Exception -> 0x045f }
            r1.<init>()     // Catch:{ Exception -> 0x045f }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r5, r4, r2, r9)     // Catch:{ Exception -> 0x045f }
            r13.setBackground(r1)     // Catch:{ Exception -> 0x045f }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$55 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$55     // Catch:{ Exception -> 0x045f }
            r1.<init>()     // Catch:{ Exception -> 0x045f }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r5, r4, r2, r9)     // Catch:{ Exception -> 0x045f }
            r14.setBackground(r1)     // Catch:{ Exception -> 0x045f }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$56 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$56     // Catch:{ Exception -> 0x045f }
            r1.<init>()     // Catch:{ Exception -> 0x045f }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r5, r4, r2, r9)     // Catch:{ Exception -> 0x045f }
            r12.setBackground(r1)     // Catch:{ Exception -> 0x045f }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$57 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$57     // Catch:{ Exception -> 0x045f }
            r1.<init>()     // Catch:{ Exception -> 0x045f }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r5, r4, r2, r9)     // Catch:{ Exception -> 0x045f }
            r11.setBackground(r1)     // Catch:{ Exception -> 0x045f }
            android.content.res.AssetManager r1 = r22.getAssets()     // Catch:{ Exception -> 0x045f }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x045f }
            r2 = 1
            r3.setTypeface(r1, r2)     // Catch:{ Exception -> 0x045f }
            android.content.res.AssetManager r1 = r22.getAssets()     // Catch:{ Exception -> 0x045f }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x045f }
            r8.setTypeface(r1, r2)     // Catch:{ Exception -> 0x045f }
            android.content.res.AssetManager r1 = r22.getAssets()     // Catch:{ Exception -> 0x045f }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x045f }
            r11.setTypeface(r1, r2)     // Catch:{ Exception -> 0x045f }
            android.content.res.AssetManager r1 = r22.getAssets()     // Catch:{ Exception -> 0x045f }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x045f }
            r7.setTypeface(r1, r2)     // Catch:{ Exception -> 0x045f }
            android.content.res.AssetManager r1 = r22.getAssets()     // Catch:{ Exception -> 0x045f }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x045f }
            r12.setTypeface(r1, r2)     // Catch:{ Exception -> 0x045f }
            android.content.res.AssetManager r1 = r22.getAssets()     // Catch:{ Exception -> 0x045f }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x045f }
            r3 = r17
            r3.setTypeface(r1, r2)     // Catch:{ Exception -> 0x045f }
            android.content.res.AssetManager r1 = r22.getAssets()     // Catch:{ Exception -> 0x045f }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x045f }
            r14.setTypeface(r1, r2)     // Catch:{ Exception -> 0x045f }
            android.content.res.AssetManager r1 = r22.getAssets()     // Catch:{ Exception -> 0x045f }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x045f }
            r15.setTypeface(r1, r2)     // Catch:{ Exception -> 0x045f }
            android.content.res.AssetManager r1 = r22.getAssets()     // Catch:{ Exception -> 0x045f }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x045f }
            r3 = r18
            r3.setTypeface(r1, r2)     // Catch:{ Exception -> 0x045f }
            android.content.res.AssetManager r1 = r22.getAssets()     // Catch:{ Exception -> 0x045f }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x045f }
            r13.setTypeface(r1, r2)     // Catch:{ Exception -> 0x045f }
            android.content.res.AssetManager r1 = r22.getAssets()     // Catch:{ Exception -> 0x045f }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x045f }
            r1 = r21
            r1.setTypeface(r0, r2)     // Catch:{ Exception -> 0x045f }
        L_0x045f:
            java.lang.CharSequence r0 = r23.getText()     // Catch:{ Exception -> 0x04a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04a0 }
            r10.size = r0     // Catch:{ Exception -> 0x04a0 }
            r1 = 0
            java.lang.String r0 = r10.Spliter(r0, r1)     // Catch:{ Exception -> 0x04a0 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x04a0 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x04a0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04a0 }
            r13.setText(r0)     // Catch:{ Exception -> 0x04a0 }
            java.lang.String r0 = r10.size     // Catch:{ Exception -> 0x04a0 }
            r1 = 1
            java.lang.String r0 = r10.Spliter(r0, r1)     // Catch:{ Exception -> 0x04a0 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x04a0 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x04a0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04a0 }
            r15.setText(r0)     // Catch:{ Exception -> 0x04a0 }
            java.lang.String r0 = r10.size     // Catch:{ Exception -> 0x04a0 }
            r1 = 2
            java.lang.String r0 = r10.Spliter(r0, r1)     // Catch:{ Exception -> 0x04a0 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x04a0 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x04a0 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x04a0 }
            r14.setText(r0)     // Catch:{ Exception -> 0x04a0 }
        L_0x04a0:
            java.lang.String r0 = "إكتب الوزن"
            r14.setHint(r0)
            java.lang.String r0 = "إكتب الارتفاع"
            r15.setHint(r0)
            java.lang.String r0 = "إكتب العرض"
            r13.setHint(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$58 r9 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$58
            r0 = r9
            r1 = r22
            r2 = r15
            r3 = r14
            r4 = r13
            r5 = r20
            r6 = r25
            r7 = r26
            r8 = r27
            r16 = r13
            r13 = r9
            r9 = r24
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.setOnClickListener(r13)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$59 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$59
            r1 = r20
            r0.<init>(r14, r1)
            r11.setOnClickListener(r0)
            r0 = 12290(0x3002, float:1.7222E-41)
            r14.setInputType(r0)
            r15.setInputType(r0)
            r2 = r16
            r2.setInputType(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$60 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$60
            r0.<init>(r15)
            r10.timer_5 = r0
            java.util.Timer r2 = r10._timer
            r3 = 50
            r2.schedule(r0, r3)
            r0 = r19
            r1.setView(r0)
            r1.show()
            android.view.Window r0 = r1.getWindow()
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = 0
            r2.<init>(r3)
            r0.setBackgroundDrawable(r2)
            android.view.Window r0 = r1.getWindow()
            r1 = -2
            r0.setLayout(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterTableActivity.Size_WHW(android.widget.TextView, android.app.AlertDialog, int, int, int):void");
    }

    public void Size_font(TextView textView, String str, int i, AlertDialog alertDialog, int i2, int i3, int i4) {
        String str2;
        int i5;
        EnterTableActivity enterTableActivity = this;
        final AlertDialog create = new AlertDialog.Builder(enterTableActivity).create();
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        int i6 = -1;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
        linearLayout2.setOrientation(1);
        int i7 = -2;
        float f = 0.0f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        int i8 = 2;
        layoutParams.setMargins(2, 2, 2, 2);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setPadding(12, 12, 12, 12);
        LinearLayout linearLayout3 = new LinearLayout(getApplicationContext());
        int i9 = 0;
        linearLayout3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams2.setMargins(1, 1, 1, 4);
        linearLayout3.setLayoutParams(layoutParams2);
        linearLayout3.setPadding(12, 12, 12, 12);
        linearLayout3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -657931));
        linearLayout2.setGravity(17);
        ImageView imageView = new ImageView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(45, 60, 0.0f);
        layoutParams3.setMargins(1, 1, 1, 1);
        imageView.setLayoutParams(layoutParams3);
        imageView.setImageResource(R.drawable.ulang_19);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        linearLayout3.addView(imageView);
        TextView textView2 = new TextView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 60, 0.0f);
        layoutParams4.setMargins(2, 2, 2, 0);
        textView2.setLayoutParams(layoutParams4);
        textView2.setTextColor(-1499549);
        textView2.setTextSize(14.0f);
        textView2.setGravity(17);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        linearLayout4.setOrientation(0);
        int i10 = 3;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams5.setMargins(0, 2, 2, 0);
        linearLayout4.setLayoutParams(layoutParams5);
        int i11 = -1118482;
        linearLayout4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -1118482));
        linearLayout2.addView(linearLayout4);
        LinearLayout linearLayout5 = new LinearLayout(getApplicationContext());
        linearLayout5.setOrientation(0);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams6.setMargins(2, 3, 3, 2);
        linearLayout5.setLayoutParams(layoutParams6);
        linearLayout5.setGravity(53);
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -720809));
        textView2.setText(str);
        int i12 = 0;
        while (true) {
            str2 = "fonts/font.ttf";
            int i13 = 11;
            if (i12 >= 11) {
                break;
            }
            LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
            linearLayout6.setOrientation(i9);
            int i14 = 0;
            while (i14 < i13) {
                int i15 = (i12 * 11) + i14;
                TextView textView3 = new TextView(getApplicationContext());
                try {
                    i5 = 1;
                    try {
                        textView3.setTypeface(Typeface.createFromAsset(getAssets(), str2), 1);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    i5 = 1;
                }
                LinearLayout linearLayout7 = linearLayout;
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(40, 60, 1.0f);
                layoutParams7.setMargins(i5, i5, i5, i5);
                textView3.setLayoutParams(layoutParams7);
                StringBuilder sb = new StringBuilder();
                sb.append(i15);
                textView3.setText(sb.toString());
                textView3.setTextColor(-1);
                textView3.setGravity(17);
                textView3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                textView3.setTextSize(14.0f);
                String str3 = str2;
                try {
                    if (((double) i15) == Double.parseDouble(textView.getText().toString())) {
                        textView3.setBackgroundColor(-720809);
                    }
                } catch (Exception unused3) {
                }
                AnonymousClass64 r10 = r0;
                int i16 = i14;
                final int i17 = i;
                TextView textView4 = textView2;
                final int i18 = i15;
                final int i19 = i2;
                final int i20 = i3;
                final int i21 = i4;
                final TextView textView5 = textView3;
                final AlertDialog alertDialog2 = create;
                LinearLayout linearLayout8 = linearLayout2;
                final AlertDialog alertDialog3 = alertDialog;
                AnonymousClass64 r0 = new View.OnClickListener() {
                    public void onClick(View view) {
                        int i = i17;
                        if (i == 0) {
                            EnterTableActivity.this.Font_size = (double) i18;
                            EnterTableActivity enterTableActivity = EnterTableActivity.this;
                            enterTableActivity._Set_Stenge((double) i19, (double) i20, (double) i21, "21", String.valueOf((long) enterTableActivity.Font_size));
                        } else if (i == 1) {
                            EnterTableActivity.this.Etar = (double) i18;
                            EnterTableActivity enterTableActivity2 = EnterTableActivity.this;
                            enterTableActivity2._Set_Stenge((double) i19, (double) i20, (double) i21, "6", String.valueOf((long) enterTableActivity2.Etar));
                        }
                        textView5.setBackgroundColor(-720809);
                        alertDialog2.dismiss();
                        alertDialog3.dismiss();
                    }
                };
                textView3.setOnClickListener(r10);
                linearLayout6.setBackgroundColor(-720809);
                linearLayout6.addView(textView3);
                i14 = i16 + 1;
                i13 = 11;
                i10 = 3;
                i9 = 0;
                i8 = 2;
                f = 0.0f;
                i6 = -1;
                enterTableActivity = this;
                str2 = str3;
                linearLayout = linearLayout7;
                textView2 = textView4;
                linearLayout2 = linearLayout8;
            }
            linearLayout2.addView(linearLayout6);
            i12++;
            i11 = -1118482;
            i7 = -2;
        }
        LinearLayout linearLayout9 = new LinearLayout(getApplicationContext());
        linearLayout9.setOrientation(i9);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(i6, i10, f);
        layoutParams8.setMargins(i9, 4, i9, 4);
        linearLayout9.setLayoutParams(layoutParams8);
        linearLayout2.addView(linearLayout9);
        linearLayout9.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(i9, i9, ViewCompat.MEASURED_STATE_MASK, i11));
        LinearLayout linearLayout10 = new LinearLayout(getApplicationContext());
        linearLayout10.setOrientation(i9);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(i6, i7, f);
        layoutParams9.setMargins(i9, 8, 1, i9);
        linearLayout10.setLayoutParams(layoutParams9);
        TextView textView6 = new TextView(getApplicationContext());
        textView6.setLayoutParams(new LinearLayout.LayoutParams(120, 50, 1.0f));
        textView6.setTextColor(-1499549);
        textView6.setTextSize(13.0f);
        textView6.setText("cancel");
        textView6.setGravity(17);
        textView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        linearLayout10.addView(textView6);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(200, 50, 1.0f);
        layoutParams10.setMargins(10, 1, 1, 10);
        textView6.setLayoutParams(layoutParams10);
        textView6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(10, i8, ViewCompat.MEASURED_STATE_MASK, i11));
        linearLayout2.setBackgroundColor(i6);
        linearLayout2.addView(linearLayout10);
        linearLayout.addView(linearLayout2);
        try {
            textView2.setTypeface(Typeface.createFromAsset(getAssets(), str2), 1);
            textView6.setTypeface(Typeface.createFromAsset(getAssets(), str2), 1);
        } catch (Exception unused4) {
        }
        create.setView(linearLayout);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(i9));
        create.getWindow().setLayout(i6, -2);
        textView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
    }

    public void Dialog_color(TextView textView, String str, int i, AlertDialog alertDialog, int i2, int i3, int i4) {
        TextView textView2;
        LinearLayout linearLayout;
        int i5;
        int i6;
        int i7;
        LinearLayout linearLayout2;
        EnterTableActivity enterTableActivity = this;
        final AlertDialog create = new AlertDialog.Builder(enterTableActivity).create();
        LinearLayout linearLayout3 = new LinearLayout(getApplicationContext());
        int i8 = -1;
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(17);
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        linearLayout4.setOrientation(1);
        float f = 0.0f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        int i9 = 2;
        layoutParams.setMargins(2, 2, 2, 2);
        linearLayout4.setLayoutParams(layoutParams);
        linearLayout4.setPadding(12, 12, 12, 12);
        LinearLayout linearLayout5 = new LinearLayout(getApplicationContext());
        int i10 = 0;
        linearLayout5.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams2.setMargins(0, 0, 0, 2);
        linearLayout5.setLayoutParams(layoutParams2);
        linearLayout5.setPadding(12, 12, 12, 12);
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -657931));
        linearLayout4.setGravity(17);
        ImageView imageView = new ImageView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(45, 60, 0.0f);
        layoutParams3.setMargins(1, 1, 1, 1);
        imageView.setLayoutParams(layoutParams3);
        imageView.setImageResource(R.drawable.ulang_19);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        linearLayout5.addView(imageView);
        TextView textView3 = new TextView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 60, 0.0f);
        layoutParams4.setMargins(0, 2, 2, 0);
        textView3.setLayoutParams(layoutParams4);
        textView3.setTextColor(-1499549);
        textView3.setTextSize(14.0f);
        textView3.setGravity(17);
        linearLayout5.addView(textView3);
        linearLayout4.addView(linearLayout5);
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        linearLayout6.setOrientation(0);
        int i11 = 3;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams5.setMargins(0, 2, 2, 0);
        linearLayout6.setLayoutParams(layoutParams5);
        linearLayout6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -1118482));
        linearLayout4.addView(linearLayout6);
        LinearLayout linearLayout7 = new LinearLayout(getApplicationContext());
        linearLayout7.setOrientation(0);
        float f2 = 1.0f;
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams6.setMargins(2, 3, 3, 2);
        linearLayout7.setLayoutParams(layoutParams6);
        linearLayout7.setGravity(53);
        linearLayout7.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -720809));
        textView3.setText(str);
        int i12 = 0;
        int i13 = 0;
        while (i13 < ((int) Math.ceil((double) (enterTableActivity.color_list_0.size() / 12)))) {
            LinearLayout linearLayout8 = new LinearLayout(getApplicationContext());
            linearLayout8.setOrientation(i10);
            int i14 = i12;
            int i15 = 0;
            int i16 = 12;
            while (i15 < i16) {
                if (i14 < enterTableActivity.color_list_0.size()) {
                    final String str2 = enterTableActivity.color_list_0.get(i14);
                    LinearLayout linearLayout9 = new LinearLayout(getApplicationContext());
                    linearLayout9.setOrientation(1);
                    linearLayout = linearLayout4;
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(40, 60, f2);
                    layoutParams7.setMargins(1, 1, 1, 1);
                    linearLayout9.setLayoutParams(layoutParams7);
                    linearLayout9.setBackgroundColor(Color.parseColor(str2));
                    if (textView.getText().toString().equals(str2)) {
                        TextView textView4 = new TextView(getApplicationContext());
                        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1, f2);
                        layoutParams8.setMargins(1, 1, 1, 1);
                        textView4.setLayoutParams(layoutParams8);
                        textView4.setTextColor(-1);
                        textView4.setGravity(81);
                        textView4.setShadowLayer(2.0f, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
                        textView4.setTextSize(7.0f);
                        textView4.setText(str2);
                        linearLayout9.addView(textView4);
                    }
                    i7 = i15;
                    i6 = i14;
                    final int i17 = i;
                    textView2 = textView3;
                    final int i18 = i2;
                    LinearLayout linearLayout10 = linearLayout8;
                    final int i19 = i3;
                    LinearLayout linearLayout11 = linearLayout9;
                    final int i20 = i4;
                    AnonymousClass72 r15 = r0;
                    final TextView textView5 = textView;
                    linearLayout2 = linearLayout10;
                    final AlertDialog alertDialog2 = create;
                    i5 = i13;
                    final AlertDialog alertDialog3 = alertDialog;
                    AnonymousClass72 r0 = new View.OnClickListener() {
                        public void onClick(View view) {
                            int i = i17;
                            if (i == 0) {
                                EnterTableActivity.this.Font_colorr = str2;
                                EnterTableActivity enterTableActivity = EnterTableActivity.this;
                                enterTableActivity._Set_Stenge((double) i18, (double) i19, (double) i20, "22", enterTableActivity.Font_colorr);
                            } else if (i == 1) {
                                EnterTableActivity.this.beack_color = str2;
                                EnterTableActivity enterTableActivity2 = EnterTableActivity.this;
                                enterTableActivity2._Set_Stenge((double) i18, (double) i19, (double) i20, "5", enterTableActivity2.beack_color);
                            } else if (i == 2) {
                                EnterTableActivity.this.Etar_color = str2;
                                EnterTableActivity enterTableActivity3 = EnterTableActivity.this;
                                enterTableActivity3._Set_Stenge((double) i18, (double) i19, (double) i20, "7", enterTableActivity3.Etar_color);
                            } else {
                                EnterTableActivity.this.Colar_bac = str2;
                            }
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            int i2 = (int) EnterTableActivity.this.getApplicationContext().getResources().getDisplayMetrics().density;
                            gradientDrawable.setColor(Color.parseColor(str2));
                            float f = (float) i2;
                            gradientDrawable.setCornerRadii(new float[]{Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, f * Float.parseFloat(String.valueOf(0))});
                            gradientDrawable.setStroke(i2 * 2, Color.parseColor("#FF000000"));
                            textView5.setElevation((float) (i2 * 4));
                            textView5.setBackground(gradientDrawable);
                            alertDialog2.dismiss();
                            alertDialog3.dismiss();
                        }
                    };
                    linearLayout11.setOnClickListener(r15);
                    linearLayout2.addView(linearLayout11);
                } else {
                    i7 = i15;
                    linearLayout2 = linearLayout8;
                    i6 = i14;
                    textView2 = textView3;
                    linearLayout = linearLayout4;
                    i5 = i13;
                }
                i14 = i6 + 1;
                i15 = i7 + 1;
                linearLayout8 = linearLayout2;
                i13 = i5;
                linearLayout4 = linearLayout;
                textView3 = textView2;
                i10 = 0;
                i16 = 12;
                f = 0.0f;
                i11 = 3;
                i8 = -1;
                f2 = 1.0f;
                enterTableActivity = this;
            }
            linearLayout4.addView(linearLayout8);
            i13++;
            i12 = i14;
            i9 = 2;
        }
        LinearLayout linearLayout12 = new LinearLayout(getApplicationContext());
        linearLayout12.setOrientation(i10);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(i8, i11, f);
        layoutParams9.setMargins(i10, 4, i10, 4);
        linearLayout12.setLayoutParams(layoutParams9);
        linearLayout4.addView(linearLayout12);
        linearLayout12.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(i10, i10, ViewCompat.MEASURED_STATE_MASK, -1118482));
        LinearLayout linearLayout13 = new LinearLayout(getApplicationContext());
        linearLayout13.setOrientation(i10);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(i8, -2, f);
        layoutParams10.setMargins(i10, 8, 1, i10);
        linearLayout13.setLayoutParams(layoutParams10);
        TextView textView6 = new TextView(getApplicationContext());
        textView6.setLayoutParams(new LinearLayout.LayoutParams(120, 50, f2));
        textView6.setTextColor(-1499549);
        textView6.setTextSize(13.0f);
        textView6.setText("cancel");
        textView6.setGravity(17);
        textView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        linearLayout13.addView(textView6);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(200, 50, f2);
        layoutParams11.setMargins(10, 1, 1, 10);
        textView6.setLayoutParams(layoutParams11);
        textView6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(10, i9, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout4.addView(linearLayout13);
        linearLayout3.addView(linearLayout4);
        try {
            textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView6.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        } catch (Exception unused) {
        }
        create.setView(linearLayout3);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(i10));
        create.getWindow().setLayout(i8, -2);
        textView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x05db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Dialog_taqwes(java.lang.String r38, android.widget.TextView r39, int r40, android.app.AlertDialog r41, int r42, int r43, int r44) {
        /*
            r37 = this;
            r12 = r37
            java.lang.String r0 = "fonts/font.ttf"
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r12)
            android.app.AlertDialog r13 = r1.create()
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            android.content.Context r1 = r37.getApplicationContext()
            r14.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r15 = -1
            r1.<init>(r15, r15)
            r14.setLayoutParams(r1)
            r8 = 1
            r14.setOrientation(r8)
            r1 = 17
            r14.setGravity(r1)
            java.lang.String r2 = "0,0,0,0"
            r12.dd = r2
            java.lang.CharSequence r2 = r39.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = ","
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0046
            java.lang.CharSequence r2 = r39.getText()
            java.lang.String r2 = r2.toString()
            r12.dd = r2
        L_0x0046:
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            android.content.Context r2 = r37.getApplicationContext()
            r11.<init>(r2)
            r11.setOrientation(r8)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 0
            r2.<init>(r15, r15, r3)
            r11.setLayoutParams(r2)
            r11.setBackgroundColor(r15)
            r11.setGravity(r1)
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r4 = r37.getApplicationContext()
            r2.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 50
            r4.<init>(r15, r5, r3)
            r2.setLayoutParams(r4)
            r4 = -657931(0xfffffffffff5f5f5, float:NaN)
            r2.setBackgroundColor(r4)
            r5 = 1098907648(0x41800000, float:16.0)
            r2.setTextSize(r5)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setTextColor(r6)
            r2.setGravity(r1)
            r11.addView(r2)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            android.content.Context r9 = r37.getApplicationContext()
            r7.<init>(r9)
            r7.setOrientation(r8)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r5 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r15, r10, r5)
            r7.setLayoutParams(r9)
            r9 = 8
            r7.setPadding(r9, r9, r9, r9)
            r7.setGravity(r1)
            r11.addView(r7)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            android.content.Context r6 = r37.getApplicationContext()
            r10.<init>(r6)
            r10.setOrientation(r8)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r15, r15, r5)
            r10.setLayoutParams(r6)
            r10.setPadding(r9, r9, r9, r9)
            r10.setGravity(r1)
            r7.addView(r10)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            android.content.Context r9 = r37.getApplicationContext()
            r6.<init>(r9)
            r9 = 0
            r6.setOrientation(r9)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = 40
            r8.<init>(r15, r9, r3)
            r6.setLayoutParams(r8)
            r6.setBackgroundColor(r15)
            r6.setGravity(r1)
            r11.addView(r6)
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r9 = r37.getApplicationContext()
            r8.<init>(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r5 = 52
            r9.<init>(r5, r15, r3)
            r8.setLayoutParams(r9)
            r8.setBackgroundColor(r4)
            java.lang.String r5 = "0"
            r8.setText(r5)
            r9 = 1094713344(0x41400000, float:12.0)
            r8.setTextSize(r9)
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r8.setTextColor(r9)
            r8.setGravity(r1)
            r6.addView(r8)
            android.widget.SeekBar r9 = new android.widget.SeekBar
            android.content.Context r1 = r37.getApplicationContext()
            r9.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = 175(0xaf, float:2.45E-43)
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r4, r15, r3)
            r9.setLayoutParams(r1)
            r1 = 4
            r9.setPadding(r1, r1, r1, r1)
            r6.addView(r9)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r4 = r37.getApplicationContext()
            r3.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r16 = r14
            r1 = -2
            r14 = 0
            r4.<init>(r1, r15, r14)
            r3.setLayoutParams(r4)
            r4 = 4
            r3.setPadding(r4, r4, r4, r4)
            r4 = -657931(0xfffffffffff5f5f5, float:NaN)
            r3.setBackgroundColor(r4)
            java.lang.String r4 = "ALL"
            r3.setText(r4)
            r4 = 1094713344(0x41400000, float:12.0)
            r3.setTextSize(r4)
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setTextColor(r4)
            r4 = 17
            r3.setGravity(r4)
            r6.addView(r3)
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            android.content.Context r1 = r37.getApplicationContext()
            r14.<init>(r1)
            r1 = 0
            r14.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = 70
            r22 = r13
            r13 = 0
            r1.<init>(r15, r4, r13)
            r14.setLayoutParams(r1)
            r14.setBackgroundColor(r15)
            r1 = 17
            r14.setGravity(r1)
            r11.addView(r14)
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r4 = r37.getApplicationContext()
            r1.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r23 = r10
            r10 = 35
            r4.<init>(r10, r15, r13)
            r1.setLayoutParams(r4)
            r4 = -657931(0xfffffffffff5f5f5, float:NaN)
            r1.setBackgroundColor(r4)
            r1.setText(r5)
            r4 = 1092616192(0x41200000, float:10.0)
            r1.setTextSize(r4)
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setTextColor(r13)
            r13 = 17
            r1.setGravity(r13)
            r14.addView(r1)
            android.widget.SeekBar r13 = new android.widget.SeekBar
            android.content.Context r4 = r37.getApplicationContext()
            r13.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r26 = r9
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 175(0xaf, float:2.45E-43)
            r4.<init>(r10, r15, r9)
            r13.setLayoutParams(r4)
            r4 = 4
            r13.setPadding(r4, r4, r4, r4)
            r14.addView(r13)
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r9 = r37.getApplicationContext()
            r4.<init>(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r27 = r13
            r10 = 70
            r13 = 0
            r9.<init>(r10, r15, r13)
            r4.setLayoutParams(r9)
            r9 = -657931(0xfffffffffff5f5f5, float:NaN)
            r4.setBackgroundColor(r9)
            java.lang.String r9 = "Left"
            r4.setText(r9)
            r9 = 1094713344(0x41400000, float:12.0)
            r4.setTextSize(r9)
            r9 = -13172557(0xffffffffff3700b3, float:-2.4325235E38)
            r4.setTextColor(r9)
            r10 = 17
            r4.setGravity(r10)
            r14.addView(r4)
            android.widget.TextView r10 = new android.widget.TextView
            android.content.Context r13 = r37.getApplicationContext()
            r10.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r28 = r0
            r0 = 0
            r9 = 35
            r13.<init>(r9, r15, r0)
            r10.setLayoutParams(r13)
            r0 = -657931(0xfffffffffff5f5f5, float:NaN)
            r10.setBackgroundColor(r0)
            r10.setText(r5)
            r0 = 1092616192(0x41200000, float:10.0)
            r10.setTextSize(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r10.setTextColor(r0)
            r0 = 17
            r10.setGravity(r0)
            r14.addView(r10)
            android.widget.SeekBar r9 = new android.widget.SeekBar
            android.content.Context r0 = r37.getApplicationContext()
            r9.<init>(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r29 = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r13 = 175(0xaf, float:2.45E-43)
            r0.<init>(r13, r15, r7)
            r9.setLayoutParams(r0)
            r0 = 4
            r9.setPadding(r0, r0, r0, r0)
            r14.addView(r9)
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r7 = r37.getApplicationContext()
            r0.<init>(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r30 = r9
            r9 = 0
            r13 = 70
            r7.<init>(r13, r15, r9)
            r0.setLayoutParams(r7)
            r7 = -657931(0xfffffffffff5f5f5, float:NaN)
            r0.setBackgroundColor(r7)
            java.lang.String r7 = "Up"
            r0.setText(r7)
            r7 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r7)
            r7 = -13172557(0xffffffffff3700b3, float:-2.4325235E38)
            r0.setTextColor(r7)
            r7 = 17
            r0.setGravity(r7)
            r14.addView(r0)
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            android.content.Context r13 = r37.getApplicationContext()
            r9.<init>(r13)
            r13 = 0
            r9.setOrientation(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r7 = 70
            r12 = 0
            r13.<init>(r15, r7, r12)
            r9.setLayoutParams(r13)
            r9.setBackgroundColor(r15)
            r7 = 17
            r9.setGravity(r7)
            r11.addView(r9)
            android.widget.TextView r13 = new android.widget.TextView
            android.content.Context r7 = r37.getApplicationContext()
            r13.<init>(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r31 = r4
            r4 = 35
            r7.<init>(r4, r15, r12)
            r13.setLayoutParams(r7)
            r4 = -657931(0xfffffffffff5f5f5, float:NaN)
            r13.setBackgroundColor(r4)
            r13.setText(r5)
            r4 = 1092616192(0x41200000, float:10.0)
            r13.setTextSize(r4)
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r13.setTextColor(r4)
            r4 = 17
            r13.setGravity(r4)
            r9.addView(r13)
            android.widget.SeekBar r12 = new android.widget.SeekBar
            android.content.Context r4 = r37.getApplicationContext()
            r12.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r32 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r7 = 175(0xaf, float:2.45E-43)
            r4.<init>(r7, r15, r3)
            r12.setLayoutParams(r4)
            r3 = 4
            r12.setPadding(r3, r3, r3, r3)
            r9.addView(r12)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r4 = r37.getApplicationContext()
            r3.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r33 = r12
            r7 = 70
            r12 = 0
            r4.<init>(r7, r15, r12)
            r3.setLayoutParams(r4)
            r4 = -657931(0xfffffffffff5f5f5, float:NaN)
            r3.setBackgroundColor(r4)
            java.lang.String r4 = "Right"
            r3.setText(r4)
            r4 = 1094713344(0x41400000, float:12.0)
            r3.setTextSize(r4)
            r4 = -13172557(0xffffffffff3700b3, float:-2.4325235E38)
            r3.setTextColor(r4)
            r4 = 17
            r3.setGravity(r4)
            r9.addView(r3)
            android.widget.TextView r12 = new android.widget.TextView
            android.content.Context r4 = r37.getApplicationContext()
            r12.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r25 = r3
            r3 = 0
            r7 = 35
            r4.<init>(r7, r15, r3)
            r12.setLayoutParams(r4)
            r3 = -657931(0xfffffffffff5f5f5, float:NaN)
            r12.setBackgroundColor(r3)
            r12.setText(r5)
            r3 = 1092616192(0x41200000, float:10.0)
            r12.setTextSize(r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12.setTextColor(r3)
            r3 = 17
            r12.setGravity(r3)
            r9.addView(r12)
            android.widget.SeekBar r7 = new android.widget.SeekBar
            android.content.Context r3 = r37.getApplicationContext()
            r7.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 175(0xaf, float:2.45E-43)
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4, r15, r5)
            r7.setLayoutParams(r3)
            r3 = 4
            r7.setPadding(r3, r3, r3, r3)
            r9.addView(r7)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r4 = r37.getApplicationContext()
            r3.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r21 = r7
            r5 = 70
            r7 = 0
            r4.<init>(r5, r15, r7)
            r3.setLayoutParams(r4)
            r4 = -657931(0xfffffffffff5f5f5, float:NaN)
            r3.setBackgroundColor(r4)
            java.lang.String r4 = "Down"
            r3.setText(r4)
            r4 = 1094713344(0x41400000, float:12.0)
            r3.setTextSize(r4)
            r4 = -13172557(0xffffffffff3700b3, float:-2.4325235E38)
            r3.setTextColor(r4)
            r4 = 17
            r3.setGravity(r4)
            r9.addView(r3)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r5 = r37.getApplicationContext()
            r4.<init>(r5)
            r5 = 0
            r4.setOrientation(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = 80
            r18 = r3
            r3 = 0
            r5.<init>(r15, r7, r3)
            r4.setLayoutParams(r5)
            r11.addView(r4)
            android.widget.TextView r7 = new android.widget.TextView
            android.content.Context r3 = r37.getApplicationContext()
            r7.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = 210(0xd2, float:2.94E-43)
            r24 = r11
            r11 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r5, r15, r11)
            r7.setLayoutParams(r3)
            r3 = -657931(0xfffffffffff5f5f5, float:NaN)
            r7.setBackgroundColor(r3)
            java.lang.String r3 = "Cancel"
            r7.setText(r3)
            r3 = 1098907648(0x41800000, float:16.0)
            r7.setTextSize(r3)
            r3 = -13172557(0xffffffffff3700b3, float:-2.4325235E38)
            r7.setTextColor(r3)
            r3 = 17
            r7.setGravity(r3)
            r4.addView(r7)
            android.widget.TextView r11 = new android.widget.TextView
            android.content.Context r3 = r37.getApplicationContext()
            r11.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r34 = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r5, r15, r7)
            r11.setLayoutParams(r3)
            r3 = -657931(0xfffffffffff5f5f5, float:NaN)
            r11.setBackgroundColor(r3)
            java.lang.String r3 = "OK"
            r11.setText(r3)
            r3 = 1098907648(0x41800000, float:16.0)
            r11.setTextSize(r3)
            r3 = -13172557(0xffffffffff3700b3, float:-2.4325235E38)
            r11.setTextColor(r3)
            r3 = 17
            r11.setGravity(r3)
            r4.addView(r11)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = 55
            r7 = 0
            r3.<init>(r15, r5, r7)
            r5 = 2
            r7 = 1
            r3.setMargins(r7, r7, r7, r5)
            r4.setLayoutParams(r3)
            r9.setLayoutParams(r3)
            r14.setLayoutParams(r3)
            r6.setLayoutParams(r3)
            r2.setLayoutParams(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 45
            r5 = 0
            r3.<init>(r4, r15, r5)
            r3.setMargins(r7, r7, r7, r7)
            r8.setLayoutParams(r3)
            r13.setLayoutParams(r3)
            r10.setLayoutParams(r3)
            r12.setLayoutParams(r3)
            r1.setLayoutParams(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = 70
            r3.<init>(r4, r15, r5)
            r3.setMargins(r7, r7, r7, r7)
            r0.setLayoutParams(r3)
            r4 = r18
            r4.setLayoutParams(r3)
            r5 = r32
            r5.setLayoutParams(r3)
            r7 = r25
            r7.setLayoutParams(r3)
            r15 = r31
            r15.setLayoutParams(r3)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$77 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$77
            r18 = r9
            r9 = r37
            r3.<init>()
            r17 = r4
            r20 = r12
            r19 = r14
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7 = -1
            r12 = 4
            r14 = 2
            android.graphics.drawable.GradientDrawable r3 = r3.getIns(r12, r14, r4, r7)
            r7 = r29
            r7.setBackground(r3)
            java.lang.String r3 = "إعــــــــداد "
            r7 = r38
            java.lang.String r3 = r3.concat(r7)
            r2.setText(r3)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$78 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$78
            r3.<init>()
            r7 = -1118482(0xffffffffffeeeeee, float:NaN)
            r12 = 360(0x168, float:5.04E-43)
            android.graphics.drawable.GradientDrawable r3 = r3.getIns(r12, r14, r4, r7)
            r7 = r34
            r7.setBackground(r3)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$79 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$79
            r3.<init>()
            r7 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r3 = r3.getIns(r12, r14, r4, r7)
            r11.setBackground(r3)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$80 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$80
            r3.<init>()
            r7 = 4
            r12 = -1
            android.graphics.drawable.GradientDrawable r3 = r3.getIns(r7, r14, r4, r12)
            r2.setBackground(r3)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$81 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$81
            r3.<init>()
            android.graphics.drawable.GradientDrawable r3 = r3.getIns(r7, r14, r4, r12)
            r6.setBackground(r3)
            android.content.res.AssetManager r3 = r37.getAssets()     // Catch:{ Exception -> 0x05b5 }
            r4 = r28
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromAsset(r3, r4)     // Catch:{ Exception -> 0x05b5 }
            r6 = 1
            r2.setTypeface(r3, r6)     // Catch:{ Exception -> 0x05b5 }
            android.content.res.AssetManager r2 = r37.getAssets()     // Catch:{ Exception -> 0x05b5 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r4)     // Catch:{ Exception -> 0x05b5 }
            r8.setTypeface(r2, r6)     // Catch:{ Exception -> 0x05b5 }
            android.content.res.AssetManager r2 = r37.getAssets()     // Catch:{ Exception -> 0x05b5 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r4)     // Catch:{ Exception -> 0x05b5 }
            r5.setTypeface(r2, r6)     // Catch:{ Exception -> 0x05b5 }
            android.content.res.AssetManager r2 = r37.getAssets()     // Catch:{ Exception -> 0x05b5 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r4)     // Catch:{ Exception -> 0x05b5 }
            r1.setTypeface(r2, r6)     // Catch:{ Exception -> 0x05b5 }
            android.content.res.AssetManager r2 = r37.getAssets()     // Catch:{ Exception -> 0x05b5 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r4)     // Catch:{ Exception -> 0x05b5 }
            r15.setTypeface(r2, r6)     // Catch:{ Exception -> 0x05b5 }
            android.content.res.AssetManager r2 = r37.getAssets()     // Catch:{ Exception -> 0x05b5 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r4)     // Catch:{ Exception -> 0x05b5 }
            r10.setTypeface(r2, r6)     // Catch:{ Exception -> 0x05b5 }
            android.content.res.AssetManager r2 = r37.getAssets()     // Catch:{ Exception -> 0x05b5 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r4)     // Catch:{ Exception -> 0x05b5 }
            r0.setTypeface(r2, r6)     // Catch:{ Exception -> 0x05b5 }
            android.content.res.AssetManager r0 = r37.getAssets()     // Catch:{ Exception -> 0x05b5 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r4)     // Catch:{ Exception -> 0x05b5 }
            r13.setTypeface(r0, r6)     // Catch:{ Exception -> 0x05b5 }
            android.content.res.AssetManager r0 = r37.getAssets()     // Catch:{ Exception -> 0x05b5 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r4)     // Catch:{ Exception -> 0x05b5 }
            r2 = r25
            r2.setTypeface(r0, r6)     // Catch:{ Exception -> 0x05b5 }
            android.content.res.AssetManager r0 = r37.getAssets()     // Catch:{ Exception -> 0x05b5 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r4)     // Catch:{ Exception -> 0x05b5 }
            r12 = r20
            r12.setTypeface(r0, r6)     // Catch:{ Exception -> 0x05b7 }
            android.content.res.AssetManager r0 = r37.getAssets()     // Catch:{ Exception -> 0x05b7 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r4)     // Catch:{ Exception -> 0x05b7 }
            r2 = r17
            r2.setTypeface(r0, r6)     // Catch:{ Exception -> 0x05b7 }
            android.content.res.AssetManager r0 = r37.getAssets()     // Catch:{ Exception -> 0x05b7 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r4)     // Catch:{ Exception -> 0x05b7 }
            r11.setTypeface(r0, r6)     // Catch:{ Exception -> 0x05b7 }
            android.content.res.AssetManager r0 = r37.getAssets()     // Catch:{ Exception -> 0x05b7 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r4)     // Catch:{ Exception -> 0x05b7 }
            r7 = r34
            r7.setTypeface(r0, r6)     // Catch:{ Exception -> 0x05b9 }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$82 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$82     // Catch:{ Exception -> 0x05b9 }
            r0.<init>()     // Catch:{ Exception -> 0x05b9 }
            r2 = -6381922(0xffffffffff9e9e9e, float:NaN)
            r3 = 4
            r4 = -1
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r3, r6, r2, r4)     // Catch:{ Exception -> 0x05b9 }
            r2 = r19
            r2.setBackground(r0)     // Catch:{ Exception -> 0x05b9 }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$83 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$83     // Catch:{ Exception -> 0x05b9 }
            r0.<init>()     // Catch:{ Exception -> 0x05b9 }
            r2 = -6381922(0xffffffffff9e9e9e, float:NaN)
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r3, r6, r2, r4)     // Catch:{ Exception -> 0x05b9 }
            r2 = r18
            r2.setBackground(r0)     // Catch:{ Exception -> 0x05b9 }
            goto L_0x05ba
        L_0x05b5:
            r12 = r20
        L_0x05b7:
            r7 = r34
        L_0x05b9:
        L_0x05ba:
            r14 = r40
            r5 = 2
            if (r14 != r5) goto L_0x05db
            r15 = r26
            r0 = 360(0x168, float:5.04E-43)
            r15.setMax(r0)
            r6 = r27
            r6.setMax(r0)
            r4 = r30
            r4.setMax(r0)
            r3 = r33
            r3.setMax(r0)
            r2 = r21
            r2.setMax(r0)
            goto L_0x05e5
        L_0x05db:
            r2 = r21
            r15 = r26
            r6 = r27
            r4 = r30
            r3 = r33
        L_0x05e5:
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$84 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$84
            r38 = r0
            r17 = r1
            r18 = -2
            r1 = r37
            r19 = r2
            r2 = r8
            r8 = r3
            r3 = r4
            r39 = r11
            r11 = r4
            r4 = r8
            r14 = 2
            r5 = r19
            r27 = r6
            r35 = r7
            r14 = r19
            r7 = r23
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r15.setOnSeekBarChangeListener(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$85 r15 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$85
            r0 = r15
            r2 = r17
            r3 = r40
            r4 = r10
            r5 = r13
            r6 = r12
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r7 = r27
            r7.setOnSeekBarChangeListener(r15)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$86 r15 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$86
            r0 = r15
            r2 = r10
            r4 = r17
            r36 = r7
            r7 = r23
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r11.setOnSeekBarChangeListener(r15)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$87 r15 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$87
            r0 = r15
            r2 = r13
            r5 = r10
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r8.setOnSeekBarChangeListener(r15)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$88 r15 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$88
            r0 = r15
            r2 = r12
            r6 = r13
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r14.setOnSeekBarChangeListener(r15)
            java.lang.String r0 = r9.dd     // Catch:{ Exception -> 0x0680 }
            r15 = 0
            java.lang.String r0 = r9.Spliter(r0, r15)     // Catch:{ Exception -> 0x0681 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x0681 }
            int r0 = (int) r0     // Catch:{ Exception -> 0x0681 }
            r1 = r36
            r1.setProgress(r0)     // Catch:{ Exception -> 0x0681 }
            java.lang.String r0 = r9.dd     // Catch:{ Exception -> 0x0681 }
            r1 = 1
            java.lang.String r0 = r9.Spliter(r0, r1)     // Catch:{ Exception -> 0x0681 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x0681 }
            int r0 = (int) r0     // Catch:{ Exception -> 0x0681 }
            r11.setProgress(r0)     // Catch:{ Exception -> 0x0681 }
            java.lang.String r0 = r9.dd     // Catch:{ Exception -> 0x0681 }
            r1 = 2
            java.lang.String r0 = r9.Spliter(r0, r1)     // Catch:{ Exception -> 0x0681 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x0681 }
            int r0 = (int) r0     // Catch:{ Exception -> 0x0681 }
            r8.setProgress(r0)     // Catch:{ Exception -> 0x0681 }
            java.lang.String r0 = r9.dd     // Catch:{ Exception -> 0x0681 }
            r1 = 3
            java.lang.String r0 = r9.Spliter(r0, r1)     // Catch:{ Exception -> 0x0681 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x0681 }
            int r0 = (int) r0     // Catch:{ Exception -> 0x0681 }
            r14.setProgress(r0)     // Catch:{ Exception -> 0x0681 }
            goto L_0x0681
        L_0x0680:
            r15 = 0
        L_0x0681:
            r2 = 0
            r4 = 0
            r0 = r37
            r1 = r23
            r0._set_View(r1, r2, r4)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$89 r14 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$89
            r0 = r14
            r1 = r37
            r2 = r40
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r17
            r7 = r10
            r8 = r13
            r13 = r9
            r11 = 8
            r9 = r12
            r12 = -2
            r10 = r22
            r15 = r39
            r12 = r24
            r11 = r41
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.setOnClickListener(r14)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$90 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$90
            r1 = r22
            r0.<init>(r1)
            r2 = r35
            r2.setOnClickListener(r0)
            r0 = r16
            r0.addView(r12)
            r2 = 8
            r0.setPadding(r2, r2, r2, r2)
            r2 = -1
            r0.setBackgroundColor(r2)
            r1.setView(r0)
            r1.show()
            android.view.Window r0 = r1.getWindow()
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r4 = 0
            r3.<init>(r4)
            r0.setBackgroundDrawable(r3)
            android.view.Window r0 = r1.getWindow()
            r1 = -2
            r0.setLayout(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterTableActivity.Dialog_taqwes(java.lang.String, android.widget.TextView, int, android.app.AlertDialog, int, int, int):void");
    }

    public void Font_1(TextView textView, AlertDialog alertDialog, int i, int i2, int i3) {
        final AlertDialog create = new AlertDialog.Builder(this).create();
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 0.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        ScrollView scrollView = new ScrollView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        layoutParams2.setMargins(0, 0, 0, 0);
        scrollView.setLayoutParams(layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
        linearLayout2.setOrientation(1);
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 0.0f));
        textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView2.setTextSize(18.0f);
        textView2.setText("إعــــــداد  الخــــــط | إختيار الخط المناسب");
        textView2.setGravity(17);
        linearLayout.addView(textView2);
        textView2.setBackgroundColor(-7617718);
        textView2.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -8604862));
        this.z = 0.0d;
        AnonymousClass92 r14 = r0;
        final AlertDialog alertDialog2 = create;
        final TextView textView3 = textView;
        TextView textView4 = textView2;
        final LinearLayout linearLayout3 = linearLayout2;
        LinearLayout linearLayout4 = linearLayout2;
        final AlertDialog alertDialog3 = alertDialog;
        ScrollView scrollView2 = scrollView;
        final int i4 = i;
        final int i5 = i2;
        String str = "fonts/font.ttf";
        final int i6 = i3;
        AnonymousClass92 r0 = new TimerTask() {
            public void run() {
                EnterTableActivity enterTableActivity = EnterTableActivity.this;
                final AlertDialog alertDialog = alertDialog2;
                final TextView textView = textView3;
                final LinearLayout linearLayout = linearLayout3;
                final AlertDialog alertDialog2 = alertDialog3;
                final int i = i4;
                final int i2 = i5;
                final int i3 = i6;
                enterTableActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        EnterTableActivity.this.VV(alertDialog, textView, linearLayout, alertDialog2, i, i2, i3);
                    }
                });
            }
        };
        this.timer_5 = r14;
        this._timer.schedule(r14, 22);
        scrollView2.addView(linearLayout4);
        linearLayout.addView(scrollView2);
        TextView textView5 = new TextView(getApplicationContext());
        textView5.setLayoutParams(new LinearLayout.LayoutParams(-1, 40, 0.0f));
        textView5.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView5.setTextSize(14.0f);
        try {
            textView5.setText("جميع حقوق التصميم محفوظه // ناساسوف للبرمجه والتطوير 772666391");
        } catch (Exception unused) {
            textView5.setText(BuildConfig.FLAVOR);
        }
        textView5.setGravity(17);
        textView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        linearLayout.addView(textView5);
        try {
            String str2 = str;
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), str2), 1);
            textView5.setTypeface(Typeface.createFromAsset(getAssets(), str2), 1);
        } catch (Exception unused2) {
        }
        textView5.setBackgroundColor(-7617718);
        linearLayout.setBackgroundColor(-7617718);
        linearLayout.setPadding(3, 3, 3, 3);
        create.setView(linearLayout);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        create.getWindow().setLayout(-1, -1);
    }

    public void VV(AlertDialog alertDialog, TextView textView, LinearLayout linearLayout, AlertDialog alertDialog2, int i, int i2, int i3) {
        LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams.setMargins(2, 3, 2, 2);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -1));
        String str = this.List_fonts.get((int) this.z);
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        textView2.setTextColor(-720809);
        textView2.setTextSize(10.0f);
        try {
            textView2.setText("     ( " + ((int) this.z) + " )    " + str);
        } catch (Exception unused) {
            textView2.setText(BuildConfig.FLAVOR);
        }
        textView2.setGravity(17);
        textView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        linearLayout2.addView(textView2);
        TextView textView3 = new TextView(getApplicationContext());
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        textView3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView3.setTextSize((float) ((int) this.Font_size));
        textView3.setText(this.Text);
        textView3.setGravity(17);
        linearLayout2.addView(textView3);
        textView3.setLines(3);
        textView3.setHint("ناســــــا سوفت للبرمجة والتطوير\nالمبرمـــج/ نبيل عبدالقادر الصبري\nللتواصل:-00967 772666391");
        textView3.setHintTextColor(ViewCompat.MEASURED_STATE_MASK);
        final TextView textView4 = textView;
        final String str2 = str;
        final int i4 = i;
        final int i5 = i2;
        AnonymousClass96 r11 = r0;
        final int i6 = i3;
        TextView textView5 = textView3;
        final AlertDialog alertDialog3 = alertDialog2;
        final AlertDialog alertDialog4 = alertDialog;
        AnonymousClass96 r0 = new View.OnClickListener() {
            public void onClick(View view) {
                textView4.setText(str2);
                EnterTableActivity.this.Font_path = str2;
                EnterTableActivity enterTableActivity = EnterTableActivity.this;
                enterTableActivity._Set_Stenge((double) i4, (double) i5, (double) i6, "23", enterTableActivity.Font_path);
                alertDialog3.dismiss();
                alertDialog4.dismiss();
            }
        };
        linearLayout2.setOnClickListener(r11);
        linearLayout2.setPadding(4, 0, 4, 0);
        linearLayout2.setGravity(17);
        try {
            AssetManager assets = getAssets();
            textView5.setTypeface(Typeface.createFromAsset(assets, "fonts/" + str), (int) Double.parseDouble(this.Font_Stayl));
        } catch (Exception unused2) {
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        layoutParams2.setMargins(1, 1, 1, 1);
        textView5.setLayoutParams(layoutParams2);
        textView2.setGravity(19);
        final LinearLayout linearLayout3 = linearLayout;
        final LinearLayout linearLayout4 = linearLayout2;
        final AlertDialog alertDialog5 = alertDialog;
        final TextView textView6 = textView;
        final AlertDialog alertDialog6 = alertDialog2;
        final int i7 = i;
        final int i8 = i2;
        final int i9 = i3;
        AnonymousClass97 r02 = new TimerTask() {
            public void run() {
                EnterTableActivity enterTableActivity = EnterTableActivity.this;
                final LinearLayout linearLayout = linearLayout3;
                final LinearLayout linearLayout2 = linearLayout4;
                final AlertDialog alertDialog = alertDialog5;
                final TextView textView = textView6;
                final AlertDialog alertDialog2 = alertDialog6;
                final int i = i7;
                final int i2 = i8;
                final int i3 = i9;
                enterTableActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        linearLayout.addView(linearLayout2);
                        EnterTableActivity access$0 = EnterTableActivity.this;
                        access$0.z = access$0.z + 1.0d;
                        if (EnterTableActivity.this.z < ((double) EnterTableActivity.this.List_fonts.size())) {
                            EnterTableActivity.this.VV(alertDialog, textView, linearLayout, alertDialog2, i, i2, i3);
                        }
                    }
                });
            }
        };
        this.timer_5 = r02;
        this._timer.schedule(r02, 4);
    }

    public void dialog_Th(TextView textView, AlertDialog alertDialog, int i, int i2, int i3) {
        TextView textView2;
        TextView textView3;
        if (textView.getText().toString().equals(BuildConfig.FLAVOR)) {
            this.abC = "0,15,15";
        } else {
            this.abC = textView.getText().toString();
        }
        if (this.abC_color.equals(BuildConfig.FLAVOR)) {
            this.abC_color = "#FF000000";
        }
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
        linearLayout2.setGravity(17);
        linearLayout.addView(linearLayout2);
        TextView textView4 = new TextView(getApplicationContext());
        textView4.setLayoutParams(new LinearLayout.LayoutParams(-1, 70, 0.0f));
        textView4.setBackgroundColor(-657931);
        textView4.setText("إعدادات  للون وزوياء ظل النص 》 ");
        textView4.setTextSize(16.0f);
        textView4.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView4.setGravity(17);
        linearLayout2.addView(textView4);
        LinearLayout linearLayout3 = new LinearLayout(getApplicationContext());
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        linearLayout3.setPadding(8, 8, 8, 8);
        linearLayout3.setGravity(17);
        linearLayout2.addView(linearLayout3);
        TextView textView5 = new TextView(getApplicationContext());
        textView5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        textView5.setPadding(8, 8, 8, 8);
        textView5.setText("TextView");
        textView5.setTextSize(12.0f);
        textView5.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView5.setGravity(17);
        linearLayout3.addView(textView5);
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, 70, 0.0f));
        linearLayout2.addView(linearLayout4);
        TextView textView6 = new TextView(getApplicationContext());
        textView6.setLayoutParams(new LinearLayout.LayoutParams(350, -1, 1.0f));
        textView6.setPadding(4, 4, 4, 4);
        textView6.setBackgroundColor(-657931);
        textView6.setTextSize(12.0f);
        textView6.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView6.setGravity(17);
        linearLayout4.addView(textView6);
        TextView textView7 = new TextView(getApplicationContext());
        textView7.setLayoutParams(new LinearLayout.LayoutParams(105, -1, 1.0f));
        textView7.setBackgroundColor(-657931);
        textView7.setText("اعداد للون الظل 》 ");
        textView7.setTextSize(12.0f);
        textView7.setTextColor(-13172557);
        textView7.setGravity(17);
        linearLayout4.addView(textView7);
        LinearLayout linearLayout5 = new LinearLayout(getApplicationContext());
        linearLayout5.setOrientation(0);
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout5.setBackgroundColor(-1);
        linearLayout5.setGravity(17);
        linearLayout5.setPadding(4, 4, 4, 4);
        linearLayout2.addView(linearLayout5);
        TextView textView8 = new TextView(getApplicationContext());
        textView8.setLayoutParams(new LinearLayout.LayoutParams(52, -1, 0.0f));
        textView8.setBackgroundColor(-657931);
        textView8.setText("0");
        textView8.setTextSize(12.0f);
        textView8.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView8.setGravity(17);
        linearLayout5.addView(textView8);
        SeekBar seekBar = new SeekBar(getApplicationContext());
        TextView textView9 = textView5;
        LinearLayout linearLayout6 = linearLayout4;
        seekBar.setLayoutParams(new LinearLayout.LayoutParams(87, 70, 1.0f));
        linearLayout5.addView(seekBar);
        TextView textView10 = new TextView(getApplicationContext());
        LinearLayout linearLayout7 = linearLayout;
        textView10.setLayoutParams(new LinearLayout.LayoutParams(105, -1, 0.0f));
        textView10.setBackgroundColor(-657931);
        textView10.setText("مستوى الظل》");
        textView10.setTextSize(12.0f);
        textView10.setTextColor(-13172557);
        textView10.setGravity(17);
        linearLayout5.addView(textView10);
        LinearLayout linearLayout8 = new LinearLayout(getApplicationContext());
        linearLayout8.setOrientation(0);
        AlertDialog alertDialog2 = create;
        linearLayout8.setLayoutParams(new LinearLayout.LayoutParams(-1, 70, 0.0f));
        linearLayout8.setPadding(4, 4, 4, 4);
        linearLayout8.setBackgroundColor(-1);
        linearLayout8.setGravity(17);
        linearLayout2.addView(linearLayout8);
        TextView textView11 = new TextView(getApplicationContext());
        TextView textView12 = textView7;
        textView11.setLayoutParams(new LinearLayout.LayoutParams(52, -1, 0.0f));
        textView11.setBackgroundColor(-657931);
        textView11.setText("0");
        textView11.setTextSize(12.0f);
        textView11.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView11.setGravity(17);
        linearLayout8.addView(textView11);
        SeekBar seekBar2 = new SeekBar(getApplicationContext());
        TextView textView13 = textView10;
        seekBar2.setLayoutParams(new LinearLayout.LayoutParams(175, -1, 1.0f));
        linearLayout8.addView(seekBar2);
        TextView textView14 = new TextView(getApplicationContext());
        TextView textView15 = textView11;
        textView14.setLayoutParams(new LinearLayout.LayoutParams(105, -1, 0.0f));
        textView14.setBackgroundColor(-657931);
        textView14.setText("تحريك》 ");
        textView14.setTextSize(12.0f);
        textView14.setTextColor(-13172557);
        textView14.setGravity(17);
        linearLayout8.addView(textView14);
        LinearLayout linearLayout9 = new LinearLayout(getApplicationContext());
        linearLayout9.setOrientation(0);
        LinearLayout linearLayout10 = linearLayout8;
        linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(-1, 70, 0.0f));
        linearLayout9.setPadding(4, 4, 4, 4);
        linearLayout9.setBackgroundColor(-1);
        linearLayout2.addView(linearLayout9);
        TextView textView16 = new TextView(getApplicationContext());
        TextView textView17 = textView14;
        textView16.setLayoutParams(new LinearLayout.LayoutParams(52, -1, 0.0f));
        textView16.setBackgroundColor(-657931);
        textView16.setText("0");
        textView16.setTextSize(12.0f);
        textView16.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView16.setGravity(17);
        linearLayout9.addView(textView16);
        SeekBar seekBar3 = new SeekBar(getApplicationContext());
        seekBar3.setLayoutParams(new LinearLayout.LayoutParams(175, -2, 1.0f));
        linearLayout9.addView(seekBar3);
        TextView textView18 = new TextView(getApplicationContext());
        TextView textView19 = textView16;
        textView18.setLayoutParams(new LinearLayout.LayoutParams(105, -1, 0.0f));
        textView18.setBackgroundColor(-657931);
        textView18.setText("تحريك》 ");
        textView18.setTextSize(12.0f);
        textView18.setTextColor(-13172557);
        textView18.setGravity(17);
        linearLayout9.addView(textView18);
        LinearLayout linearLayout11 = new LinearLayout(getApplicationContext());
        linearLayout11.setOrientation(0);
        LinearLayout linearLayout12 = linearLayout9;
        linearLayout11.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout11.setPadding(8, 8, 8, 8);
        linearLayout2.addView(linearLayout11);
        TextView textView20 = new TextView(getApplicationContext());
        textView20.setLayoutParams(new LinearLayout.LayoutParams(210, 50, 1.0f));
        textView20.setBackgroundColor(-657931);
        textView20.setText("Cancel");
        textView20.setTextSize(16.0f);
        textView20.setTextColor(-13172557);
        textView20.setGravity(17);
        linearLayout11.addView(textView20);
        TextView textView21 = new TextView(getApplicationContext());
        TextView textView22 = textView18;
        textView21.setLayoutParams(new LinearLayout.LayoutParams(210, 50, 1.0f));
        textView21.setBackgroundColor(-657931);
        textView21.setText("OK");
        textView21.setTextSize(16.0f);
        textView21.setTextColor(-13172557);
        textView21.setGravity(17);
        linearLayout11.addView(textView21);
        textView4.setText("إعـــداد ".concat(" (للون +زوياء ) الظــــــل "));
        textView20.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(360, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        textView21.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(360, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        textView4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(4, 2, -6381922, -1));
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(4, 2, -6381922, -1));
        seekBar.setMax(50);
        seekBar2.setMax(30);
        seekBar3.setMax(30);
        try {
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView8.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView6.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView2 = textView15;
            try {
                textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                textView6.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                textView17.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                textView3 = textView19;
            } catch (Exception unused) {
                textView3 = textView19;
                linearLayout12.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, -6381922, -1));
                linearLayout10.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, -6381922, -1));
                final TextView textView23 = textView8;
                AnonymousClass104 r15 = r0;
                final TextView textView24 = textView2;
                final TextView textView25 = textView3;
                TextView textView26 = textView3;
                TextView textView27 = textView9;
                final TextView textView28 = textView27;
                AnonymousClass104 r0 = new SeekBar.OnSeekBarChangeListener() {
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        textView23.setText(String.valueOf((long) i));
                        EnterTableActivity.this.abC = textView23.getText().toString().concat(",".concat(textView24.getText().toString().concat(",".concat(textView25.getText().toString()))));
                        EnterTableActivity.this._set_TextView(textView28);
                    }
                };
                seekBar.setOnSeekBarChangeListener(r15);
                final TextView textView29 = textView2;
                final TextView textView30 = textView8;
                final TextView textView31 = textView26;
                seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        textView29.setText(String.valueOf((long) (i - 15)));
                        EnterTableActivity.this.abC = textView30.getText().toString().concat(",".concat(textView29.getText().toString().concat(",".concat(textView31.getText().toString()))));
                        EnterTableActivity.this._set_TextView(textView28);
                    }
                });
                final TextView textView32 = textView26;
                final TextView textView33 = textView2;
                seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        textView32.setText(String.valueOf((long) (i - 15)));
                        EnterTableActivity.this.abC = textView30.getText().toString().concat(",".concat(textView33.getText().toString().concat(",".concat(textView32.getText().toString()))));
                        EnterTableActivity.this._set_TextView(textView28);
                    }
                });
                try {
                    seekBar.setProgress((int) Double.parseDouble(Spliter(this.abC, 0)));
                    try {
                        seekBar2.setProgress(((int) Double.parseDouble(Spliter(this.abC, 1))) + 15);
                        seekBar3.setProgress(((int) Double.parseDouble(Spliter(this.abC, 2))) + 15);
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                }
                final TextView textView34 = textView8;
                final TextView textView35 = textView2;
                final TextView textView36 = textView26;
                final TextView textView37 = textView6;
                final TextView textView38 = textView;
                TextView textView39 = textView20;
                final int i4 = i;
                TextView textView40 = textView8;
                final int i5 = i2;
                TextView textView41 = textView2;
                final int i6 = i3;
                TextView textView42 = textView6;
                final AlertDialog alertDialog3 = alertDialog;
                final AlertDialog alertDialog4 = alertDialog2;
                textView21.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        EnterTableActivity.this.abC = textView34.getText().toString().concat(",".concat(textView35.getText().toString().concat(",".concat(textView36.getText().toString()))));
                        EnterTableActivity.this.abC_color = textView37.getText().toString();
                        textView38.setText(EnterTableActivity.this.abC);
                        EnterTableActivity enterTableActivity = EnterTableActivity.this;
                        enterTableActivity._Set_Stenge((double) i4, (double) i5, (double) i6, "26", enterTableActivity.abC);
                        alertDialog3.dismiss();
                        alertDialog4.dismiss();
                    }
                });
                textView39.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        alertDialog4.dismiss();
                    }
                });
                final TextView textView43 = textView40;
                final TextView textView44 = textView41;
                final TextView textView45 = textView42;
                final TextView textView46 = textView27;
                final AlertDialog alertDialog5 = alertDialog;
                final int i7 = i;
                final int i8 = i2;
                final int i9 = i3;
                linearLayout6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        EnterTableActivity.this.abC = textView43.getText().toString().concat(",".concat(textView44.getText().toString().concat(",".concat(textView36.getText().toString()))));
                        EnterTableActivity.this.abC_color = textView45.getText().toString();
                        EnterTableActivity.this.Dialog_color_deel(textView46, textView45, alertDialog5, i7, i8, i9);
                    }
                });
                GradientDrawable gradientDrawable = new GradientDrawable();
                int i10 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
                gradientDrawable.setColor(Color.parseColor(this.abC_color));
                float f = (float) i10;
                gradientDrawable.setCornerRadii(new float[]{Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, f * Float.parseFloat(String.valueOf(0))});
                gradientDrawable.setStroke(i10 * 2, Color.parseColor("#FF000000"));
                TextView textView47 = textView42;
                textView47.setElevation((float) (i10 * 4));
                textView47.setBackground(gradientDrawable);
                textView47.setText(this.abC_color);
                alertDialog4.setView(linearLayout7);
                alertDialog4.show();
                alertDialog4.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                alertDialog4.getWindow().setLayout(-1, -2);
            }
            try {
                textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                textView13.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                textView12.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                textView22.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                textView21.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                textView20.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            } catch (Exception unused4) {
                linearLayout12.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, -6381922, -1));
                linearLayout10.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, -6381922, -1));
                final TextView textView232 = textView8;
                AnonymousClass104 r152 = r0;
                final TextView textView242 = textView2;
                final TextView textView252 = textView3;
                TextView textView262 = textView3;
                TextView textView272 = textView9;
                final TextView textView282 = textView272;
                AnonymousClass104 r02 = new SeekBar.OnSeekBarChangeListener() {
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        textView232.setText(String.valueOf((long) i));
                        EnterTableActivity.this.abC = textView232.getText().toString().concat(",".concat(textView242.getText().toString().concat(",".concat(textView252.getText().toString()))));
                        EnterTableActivity.this._set_TextView(textView282);
                    }
                };
                seekBar.setOnSeekBarChangeListener(r152);
                final TextView textView292 = textView2;
                final TextView textView302 = textView8;
                final TextView textView312 = textView262;
                seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        textView292.setText(String.valueOf((long) (i - 15)));
                        EnterTableActivity.this.abC = textView302.getText().toString().concat(",".concat(textView292.getText().toString().concat(",".concat(textView312.getText().toString()))));
                        EnterTableActivity.this._set_TextView(textView282);
                    }
                });
                final TextView textView322 = textView262;
                final TextView textView332 = textView2;
                seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        textView322.setText(String.valueOf((long) (i - 15)));
                        EnterTableActivity.this.abC = textView302.getText().toString().concat(",".concat(textView332.getText().toString().concat(",".concat(textView322.getText().toString()))));
                        EnterTableActivity.this._set_TextView(textView282);
                    }
                });
                seekBar.setProgress((int) Double.parseDouble(Spliter(this.abC, 0)));
                seekBar2.setProgress(((int) Double.parseDouble(Spliter(this.abC, 1))) + 15);
                seekBar3.setProgress(((int) Double.parseDouble(Spliter(this.abC, 2))) + 15);
                final TextView textView342 = textView8;
                final TextView textView352 = textView2;
                final TextView textView362 = textView262;
                final TextView textView372 = textView6;
                final TextView textView382 = textView;
                TextView textView392 = textView20;
                final int i42 = i;
                TextView textView402 = textView8;
                final int i52 = i2;
                TextView textView412 = textView2;
                final int i62 = i3;
                TextView textView422 = textView6;
                final AlertDialog alertDialog32 = alertDialog;
                final AlertDialog alertDialog42 = alertDialog2;
                textView21.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        EnterTableActivity.this.abC = textView342.getText().toString().concat(",".concat(textView352.getText().toString().concat(",".concat(textView362.getText().toString()))));
                        EnterTableActivity.this.abC_color = textView372.getText().toString();
                        textView382.setText(EnterTableActivity.this.abC);
                        EnterTableActivity enterTableActivity = EnterTableActivity.this;
                        enterTableActivity._Set_Stenge((double) i42, (double) i52, (double) i62, "26", enterTableActivity.abC);
                        alertDialog32.dismiss();
                        alertDialog42.dismiss();
                    }
                });
                textView392.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        alertDialog42.dismiss();
                    }
                });
                final TextView textView432 = textView402;
                final TextView textView442 = textView412;
                final TextView textView452 = textView422;
                final TextView textView462 = textView272;
                final AlertDialog alertDialog52 = alertDialog;
                final int i72 = i;
                final int i82 = i2;
                final int i92 = i3;
                linearLayout6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        EnterTableActivity.this.abC = textView432.getText().toString().concat(",".concat(textView442.getText().toString().concat(",".concat(textView362.getText().toString()))));
                        EnterTableActivity.this.abC_color = textView452.getText().toString();
                        EnterTableActivity.this.Dialog_color_deel(textView462, textView452, alertDialog52, i72, i82, i92);
                    }
                });
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                int i102 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
                gradientDrawable2.setColor(Color.parseColor(this.abC_color));
                float f2 = (float) i102;
                gradientDrawable2.setCornerRadii(new float[]{Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, f2 * Float.parseFloat(String.valueOf(0))});
                gradientDrawable2.setStroke(i102 * 2, Color.parseColor("#FF000000"));
                TextView textView472 = textView422;
                textView472.setElevation((float) (i102 * 4));
                textView472.setBackground(gradientDrawable2);
                textView472.setText(this.abC_color);
                alertDialog42.setView(linearLayout7);
                alertDialog42.show();
                alertDialog42.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                alertDialog42.getWindow().setLayout(-1, -2);
            }
        } catch (Exception unused5) {
            textView3 = textView19;
            textView2 = textView15;
            linearLayout12.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(4, 2, -6381922, -1));
            linearLayout10.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(4, 2, -6381922, -1));
            final TextView textView2322 = textView8;
            AnonymousClass104 r1522 = r02;
            final TextView textView2422 = textView2;
            final TextView textView2522 = textView3;
            TextView textView2622 = textView3;
            TextView textView2722 = textView9;
            final TextView textView2822 = textView2722;
            AnonymousClass104 r022 = new SeekBar.OnSeekBarChangeListener() {
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                }

                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    textView2322.setText(String.valueOf((long) i));
                    EnterTableActivity.this.abC = textView2322.getText().toString().concat(",".concat(textView2422.getText().toString().concat(",".concat(textView2522.getText().toString()))));
                    EnterTableActivity.this._set_TextView(textView2822);
                }
            };
            seekBar.setOnSeekBarChangeListener(r1522);
            final TextView textView2922 = textView2;
            final TextView textView3022 = textView8;
            final TextView textView3122 = textView2622;
            seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                }

                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    textView2922.setText(String.valueOf((long) (i - 15)));
                    EnterTableActivity.this.abC = textView3022.getText().toString().concat(",".concat(textView2922.getText().toString().concat(",".concat(textView3122.getText().toString()))));
                    EnterTableActivity.this._set_TextView(textView2822);
                }
            });
            final TextView textView3222 = textView2622;
            final TextView textView3322 = textView2;
            seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                }

                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    textView3222.setText(String.valueOf((long) (i - 15)));
                    EnterTableActivity.this.abC = textView3022.getText().toString().concat(",".concat(textView3322.getText().toString().concat(",".concat(textView3222.getText().toString()))));
                    EnterTableActivity.this._set_TextView(textView2822);
                }
            });
            seekBar.setProgress((int) Double.parseDouble(Spliter(this.abC, 0)));
            seekBar2.setProgress(((int) Double.parseDouble(Spliter(this.abC, 1))) + 15);
            seekBar3.setProgress(((int) Double.parseDouble(Spliter(this.abC, 2))) + 15);
            final TextView textView3422 = textView8;
            final TextView textView3522 = textView2;
            final TextView textView3622 = textView2622;
            final TextView textView3722 = textView6;
            final TextView textView3822 = textView;
            TextView textView3922 = textView20;
            final int i422 = i;
            TextView textView4022 = textView8;
            final int i522 = i2;
            TextView textView4122 = textView2;
            final int i622 = i3;
            TextView textView4222 = textView6;
            final AlertDialog alertDialog322 = alertDialog;
            final AlertDialog alertDialog422 = alertDialog2;
            textView21.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterTableActivity.this.abC = textView3422.getText().toString().concat(",".concat(textView3522.getText().toString().concat(",".concat(textView3622.getText().toString()))));
                    EnterTableActivity.this.abC_color = textView3722.getText().toString();
                    textView3822.setText(EnterTableActivity.this.abC);
                    EnterTableActivity enterTableActivity = EnterTableActivity.this;
                    enterTableActivity._Set_Stenge((double) i422, (double) i522, (double) i622, "26", enterTableActivity.abC);
                    alertDialog322.dismiss();
                    alertDialog422.dismiss();
                }
            });
            textView3922.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    alertDialog422.dismiss();
                }
            });
            final TextView textView4322 = textView4022;
            final TextView textView4422 = textView4122;
            final TextView textView4522 = textView4222;
            final TextView textView4622 = textView2722;
            final AlertDialog alertDialog522 = alertDialog;
            final int i722 = i;
            final int i822 = i2;
            final int i922 = i3;
            linearLayout6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterTableActivity.this.abC = textView4322.getText().toString().concat(",".concat(textView4422.getText().toString().concat(",".concat(textView3622.getText().toString()))));
                    EnterTableActivity.this.abC_color = textView4522.getText().toString();
                    EnterTableActivity.this.Dialog_color_deel(textView4622, textView4522, alertDialog522, i722, i822, i922);
                }
            });
            GradientDrawable gradientDrawable22 = new GradientDrawable();
            int i1022 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
            gradientDrawable22.setColor(Color.parseColor(this.abC_color));
            float f22 = (float) i1022;
            gradientDrawable22.setCornerRadii(new float[]{Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, f22 * Float.parseFloat(String.valueOf(0))});
            gradientDrawable22.setStroke(i1022 * 2, Color.parseColor("#FF000000"));
            TextView textView4722 = textView4222;
            textView4722.setElevation((float) (i1022 * 4));
            textView4722.setBackground(gradientDrawable22);
            textView4722.setText(this.abC_color);
            alertDialog422.setView(linearLayout7);
            alertDialog422.show();
            alertDialog422.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            alertDialog422.getWindow().setLayout(-1, -2);
        }
        final TextView textView23222 = textView8;
        AnonymousClass104 r15222 = r022;
        final TextView textView24222 = textView2;
        final TextView textView25222 = textView3;
        TextView textView26222 = textView3;
        TextView textView27222 = textView9;
        final TextView textView28222 = textView27222;
        AnonymousClass104 r0222 = new SeekBar.OnSeekBarChangeListener() {
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                textView23222.setText(String.valueOf((long) i));
                EnterTableActivity.this.abC = textView23222.getText().toString().concat(",".concat(textView24222.getText().toString().concat(",".concat(textView25222.getText().toString()))));
                EnterTableActivity.this._set_TextView(textView28222);
            }
        };
        seekBar.setOnSeekBarChangeListener(r15222);
        final TextView textView29222 = textView2;
        final TextView textView30222 = textView8;
        final TextView textView31222 = textView26222;
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                textView29222.setText(String.valueOf((long) (i - 15)));
                EnterTableActivity.this.abC = textView30222.getText().toString().concat(",".concat(textView29222.getText().toString().concat(",".concat(textView31222.getText().toString()))));
                EnterTableActivity.this._set_TextView(textView28222);
            }
        });
        final TextView textView32222 = textView26222;
        final TextView textView33222 = textView2;
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                textView32222.setText(String.valueOf((long) (i - 15)));
                EnterTableActivity.this.abC = textView30222.getText().toString().concat(",".concat(textView33222.getText().toString().concat(",".concat(textView32222.getText().toString()))));
                EnterTableActivity.this._set_TextView(textView28222);
            }
        });
        try {
            seekBar.setProgress((int) Double.parseDouble(Spliter(this.abC, 0)));
            seekBar2.setProgress(((int) Double.parseDouble(Spliter(this.abC, 1))) + 15);
            seekBar3.setProgress(((int) Double.parseDouble(Spliter(this.abC, 2))) + 15);
        } catch (Exception unused6) {
        }
        final TextView textView34222 = textView8;
        final TextView textView35222 = textView2;
        final TextView textView36222 = textView26222;
        final TextView textView37222 = textView6;
        final TextView textView38222 = textView;
        TextView textView39222 = textView20;
        final int i4222 = i;
        TextView textView40222 = textView8;
        final int i5222 = i2;
        TextView textView41222 = textView2;
        final int i6222 = i3;
        TextView textView42222 = textView6;
        final AlertDialog alertDialog3222 = alertDialog;
        final AlertDialog alertDialog4222 = alertDialog2;
        textView21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterTableActivity.this.abC = textView34222.getText().toString().concat(",".concat(textView35222.getText().toString().concat(",".concat(textView36222.getText().toString()))));
                EnterTableActivity.this.abC_color = textView37222.getText().toString();
                textView38222.setText(EnterTableActivity.this.abC);
                EnterTableActivity enterTableActivity = EnterTableActivity.this;
                enterTableActivity._Set_Stenge((double) i4222, (double) i5222, (double) i6222, "26", enterTableActivity.abC);
                alertDialog3222.dismiss();
                alertDialog4222.dismiss();
            }
        });
        textView39222.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                alertDialog4222.dismiss();
            }
        });
        final TextView textView43222 = textView40222;
        final TextView textView44222 = textView41222;
        final TextView textView45222 = textView42222;
        final TextView textView46222 = textView27222;
        final AlertDialog alertDialog5222 = alertDialog;
        final int i7222 = i;
        final int i8222 = i2;
        final int i9222 = i3;
        linearLayout6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterTableActivity.this.abC = textView43222.getText().toString().concat(",".concat(textView44222.getText().toString().concat(",".concat(textView36222.getText().toString()))));
                EnterTableActivity.this.abC_color = textView45222.getText().toString();
                EnterTableActivity.this.Dialog_color_deel(textView46222, textView45222, alertDialog5222, i7222, i8222, i9222);
            }
        });
        GradientDrawable gradientDrawable222 = new GradientDrawable();
        int i10222 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
        gradientDrawable222.setColor(Color.parseColor(this.abC_color));
        float f222 = (float) i10222;
        gradientDrawable222.setCornerRadii(new float[]{Float.parseFloat(String.valueOf(0)) * f222, Float.parseFloat(String.valueOf(0)) * f222, Float.parseFloat(String.valueOf(0)) * f222, Float.parseFloat(String.valueOf(0)) * f222, Float.parseFloat(String.valueOf(0)) * f222, Float.parseFloat(String.valueOf(0)) * f222, Float.parseFloat(String.valueOf(0)) * f222, f222 * Float.parseFloat(String.valueOf(0))});
        gradientDrawable222.setStroke(i10222 * 2, Color.parseColor("#FF000000"));
        TextView textView47222 = textView42222;
        textView47222.setElevation((float) (i10222 * 4));
        textView47222.setBackground(gradientDrawable222);
        textView47222.setText(this.abC_color);
        alertDialog4222.setView(linearLayout7);
        alertDialog4222.show();
        alertDialog4222.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        alertDialog4222.getWindow().setLayout(-1, -2);
    }

    public void Dialog_color_deel(TextView textView, TextView textView2, AlertDialog alertDialog, int i, int i2, int i3) {
        LinearLayout linearLayout;
        TextView textView3;
        int i4;
        int i5;
        int i6;
        LinearLayout linearLayout2;
        EnterTableActivity enterTableActivity = this;
        enterTableActivity.abC_color = textView2.getText().toString();
        final AlertDialog create = new AlertDialog.Builder(enterTableActivity).create();
        LinearLayout linearLayout3 = new LinearLayout(getApplicationContext());
        int i7 = -1;
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout3.setOrientation(1);
        linearLayout3.setGravity(17);
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        linearLayout4.setOrientation(1);
        float f = 0.0f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        int i8 = 2;
        layoutParams.setMargins(2, 2, 2, 2);
        linearLayout4.setLayoutParams(layoutParams);
        linearLayout4.setPadding(12, 12, 12, 12);
        LinearLayout linearLayout5 = new LinearLayout(getApplicationContext());
        int i9 = 0;
        linearLayout5.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams2.setMargins(0, 0, 0, 2);
        linearLayout5.setLayoutParams(layoutParams2);
        linearLayout5.setPadding(12, 12, 12, 12);
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -657931));
        linearLayout4.setGravity(17);
        ImageView imageView = new ImageView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(45, 60, 0.0f);
        layoutParams3.setMargins(1, 1, 1, 1);
        imageView.setLayoutParams(layoutParams3);
        imageView.setImageResource(R.drawable.ulang_19);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        linearLayout5.addView(imageView);
        TextView textView4 = new TextView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 60, 0.0f);
        layoutParams4.setMargins(0, 2, 2, 0);
        textView4.setLayoutParams(layoutParams4);
        textView4.setTextColor(-1499549);
        textView4.setTextSize(14.0f);
        textView4.setGravity(17);
        linearLayout5.addView(textView4);
        linearLayout4.addView(linearLayout5);
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        linearLayout6.setOrientation(0);
        int i10 = 3;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams5.setMargins(0, 2, 2, 0);
        linearLayout6.setLayoutParams(layoutParams5);
        linearLayout6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -1118482));
        linearLayout4.addView(linearLayout6);
        LinearLayout linearLayout7 = new LinearLayout(getApplicationContext());
        linearLayout7.setOrientation(0);
        float f2 = 1.0f;
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams6.setMargins(2, 3, 3, 2);
        linearLayout7.setLayoutParams(layoutParams6);
        linearLayout7.setGravity(53);
        linearLayout7.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -720809));
        textView4.setText("اعداد لون الظل ");
        int i11 = 0;
        int i12 = 0;
        while (i12 < ((int) Math.ceil((double) (enterTableActivity.color_list_0.size() / 12)))) {
            LinearLayout linearLayout8 = new LinearLayout(getApplicationContext());
            linearLayout8.setOrientation(i9);
            int i13 = i11;
            int i14 = 0;
            int i15 = 12;
            while (i14 < i15) {
                if (i13 < enterTableActivity.color_list_0.size()) {
                    String str = enterTableActivity.color_list_0.get(i13);
                    LinearLayout linearLayout9 = new LinearLayout(getApplicationContext());
                    linearLayout9.setOrientation(1);
                    linearLayout = linearLayout4;
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(40, 60, f2);
                    layoutParams7.setMargins(1, 1, 1, 1);
                    linearLayout9.setLayoutParams(layoutParams7);
                    linearLayout9.setBackgroundColor(Color.parseColor(str));
                    if (textView2.getText().toString().equals(str)) {
                        TextView textView5 = new TextView(getApplicationContext());
                        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1, f2);
                        layoutParams8.setMargins(1, 1, 1, 1);
                        textView5.setLayoutParams(layoutParams8);
                        textView5.setTextColor(-1);
                        textView5.setGravity(81);
                        textView5.setShadowLayer(2.0f, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
                        textView5.setTextSize(7.0f);
                        textView5.setText(str);
                        linearLayout9.addView(textView5);
                    }
                    i6 = i14;
                    i5 = i13;
                    final String str2 = str;
                    final TextView textView6 = textView2;
                    textView3 = textView4;
                    final TextView textView7 = textView;
                    LinearLayout linearLayout10 = linearLayout8;
                    final int i16 = i;
                    LinearLayout linearLayout11 = linearLayout9;
                    final int i17 = i2;
                    AnonymousClass113 r15 = r0;
                    final int i18 = i3;
                    linearLayout2 = linearLayout10;
                    final AlertDialog alertDialog2 = alertDialog;
                    i4 = i12;
                    final AlertDialog alertDialog3 = create;
                    AnonymousClass113 r0 = new View.OnClickListener() {
                        public void onClick(View view) {
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            int i = (int) EnterTableActivity.this.getApplicationContext().getResources().getDisplayMetrics().density;
                            gradientDrawable.setColor(Color.parseColor(str2));
                            float f = (float) i;
                            gradientDrawable.setCornerRadii(new float[]{Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, f * Float.parseFloat(String.valueOf(0))});
                            gradientDrawable.setStroke(i * 2, Color.parseColor("#FF000000"));
                            textView6.setElevation((float) (i * 4));
                            textView6.setBackground(gradientDrawable);
                            textView6.setText(str2);
                            EnterTableActivity.this.abC_color = str2;
                            try {
                                TextView textView = textView7;
                                EnterTableActivity enterTableActivity = EnterTableActivity.this;
                                EnterTableActivity enterTableActivity2 = EnterTableActivity.this;
                                EnterTableActivity enterTableActivity3 = EnterTableActivity.this;
                                textView.setShadowLayer((float) Integer.parseInt(enterTableActivity.Spliter(enterTableActivity.abC, 0)), (float) Integer.parseInt(enterTableActivity2.Spliter(enterTableActivity2.abC, 1)), Float.parseFloat(enterTableActivity3.Spliter(enterTableActivity3.abC, 2)), Color.parseColor(EnterTableActivity.this.abC_color));
                            } catch (Exception unused) {
                            }
                            EnterTableActivity enterTableActivity4 = EnterTableActivity.this;
                            enterTableActivity4._Set_Stenge((double) i16, (double) i17, (double) i18, "27", enterTableActivity4.abC_color);
                            alertDialog2.dismiss();
                            alertDialog3.dismiss();
                        }
                    };
                    linearLayout11.setOnClickListener(r15);
                    linearLayout2.addView(linearLayout11);
                } else {
                    i6 = i14;
                    linearLayout2 = linearLayout8;
                    i5 = i13;
                    textView3 = textView4;
                    linearLayout = linearLayout4;
                    i4 = i12;
                }
                i13 = i5 + 1;
                i14 = i6 + 1;
                linearLayout8 = linearLayout2;
                i12 = i4;
                textView4 = textView3;
                linearLayout4 = linearLayout;
                i9 = 0;
                i15 = 12;
                f = 0.0f;
                i10 = 3;
                i7 = -1;
                f2 = 1.0f;
                enterTableActivity = this;
            }
            linearLayout4.addView(linearLayout8);
            i12++;
            i11 = i13;
            i8 = 2;
        }
        LinearLayout linearLayout12 = new LinearLayout(getApplicationContext());
        linearLayout12.setOrientation(i9);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(i7, i10, f);
        layoutParams9.setMargins(i9, 4, i9, 4);
        linearLayout12.setLayoutParams(layoutParams9);
        linearLayout4.addView(linearLayout12);
        linearLayout12.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(i9, i9, ViewCompat.MEASURED_STATE_MASK, -1118482));
        LinearLayout linearLayout13 = new LinearLayout(getApplicationContext());
        linearLayout13.setOrientation(i9);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(i7, -2, f);
        layoutParams10.setMargins(i9, 8, 1, i9);
        linearLayout13.setLayoutParams(layoutParams10);
        TextView textView8 = new TextView(getApplicationContext());
        textView8.setLayoutParams(new LinearLayout.LayoutParams(120, 50, f2));
        textView8.setTextColor(-1499549);
        textView8.setTextSize(13.0f);
        textView8.setText("cancel");
        textView8.setGravity(17);
        textView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        linearLayout13.addView(textView8);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(200, 50, f2);
        layoutParams11.setMargins(10, 1, 1, 10);
        textView8.setLayoutParams(layoutParams11);
        textView8.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(10, i8, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout4.addView(linearLayout13);
        linearLayout3.addView(linearLayout4);
        try {
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView8.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        } catch (Exception unused) {
        }
        create.setView(linearLayout3);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(i9));
        create.getWindow().setLayout(i7, -2);
        textView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
    }

    public void _set_View(View view, double d, double d2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i = (int) getApplicationContext().getResources().getDisplayMetrics().density;
        gradientDrawable.setColor(Color.parseColor(this.beack_color));
        float f = (float) i;
        gradientDrawable.setCornerRadii(new float[]{Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 0)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 0)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 1)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 1)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 2)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 2)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 3)))) * f, f * Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 3))))});
        gradientDrawable.setStroke(Integer.parseInt(String.valueOf((long) this.Etar)) * i, Color.parseColor(this.Etar_color));
        view.setElevation((float) (i * 4));
        view.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) Double.parseDouble(Spliter(this.size, 0)), (int) Double.parseDouble(Spliter(this.size, 1)), (float) ((int) Double.parseDouble(Spliter(this.size, 2))));
        layoutParams.setMargins((int) Double.parseDouble(Spliter(this.T_out, 0)), (int) Double.parseDouble(Spliter(this.T_out, 1)), (int) Double.parseDouble(Spliter(this.T_out, 2)), (int) Double.parseDouble(Spliter(this.T_out, 3)));
        view.setLayoutParams(layoutParams);
        view.setPadding((int) Double.parseDouble(Spliter(this.T_in, 0)), (int) Double.parseDouble(Spliter(this.T_in, 1)), (int) Double.parseDouble(Spliter(this.T_in, 2)), (int) Double.parseDouble(Spliter(this.T_in, 3)));
    }

    public void _Set_Stenge(double d, double d2, double d3, String str, String str2) {
        int i = 0;
        if (d3 == 2.0d) {
            try {
                int i2 = (int) d2;
                this.List_startMap = (ArrayList) new Gson().fromJson(this.Data_Map.get(i2).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                }.getType());
                while (i < this.List_startMap.size()) {
                    this.List_startMap.get(i).put(str, str2);
                    i++;
                }
                this.Data_Map.get(i2).put("2", new Gson().toJson((Object) this.List_startMap));
                this.linear_pdf_0.removeAllViews();
                _Creat_chat(0.0d, 0.0d);
            } catch (Exception unused) {
            }
        } else if (d3 == 0.0d) {
            while (i < this.Data_Map.size()) {
                ArrayList<HashMap<String, Object>> arrayList = (ArrayList) new Gson().fromJson(this.Data_Map.get(i).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                }.getType());
                this.List_startMap = arrayList;
                arrayList.get((int) d).put(str, str2);
                this.Data_Map.get(i).put("2", new Gson().toJson((Object) this.List_startMap));
                i++;
            }
            this.linear_pdf_0.removeAllViews();
            _Creat_chat(0.0d, 0.0d);
        } else if (d3 == 1.0d) {
            for (int i3 = 0; i3 < this.Data_Map.size(); i3++) {
                this.List_startMap = (ArrayList) new Gson().fromJson(this.Data_Map.get(i3).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                }.getType());
                for (int i4 = 0; i4 < this.List_startMap.size(); i4++) {
                    this.List_startMap.get(i4).put(str, str2);
                }
                this.Data_Map.get(i3).put("2", new Gson().toJson((Object) this.List_startMap));
            }
            this.linear_pdf_0.removeAllViews();
            _Creat_chat(0.0d, 0.0d);
        } else if (d3 == 3.0d) {
            int i5 = (int) d2;
            ArrayList<HashMap<String, Object>> arrayList2 = (ArrayList) new Gson().fromJson(this.Data_Map.get(i5).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
            }.getType());
            this.List_startMap = arrayList2;
            arrayList2.get((int) d).put(str, str2);
            this.Data_Map.get(i5).put("2", new Gson().toJson((Object) this.List_startMap));
            this.linear_pdf_0.removeAllViews();
            _Creat_chat(0.0d, 0.0d);
        }
    }

    public void _dialog_chater() {
        final AlertDialog create = new AlertDialog.Builder(this).create();
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
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 0.0f));
        linearLayout4.setBackgroundColor(-1118482);
        linearLayout4.setGravity(17);
        linearLayout3.addView(linearLayout4);
        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(50, 50, 0.0f));
        imageView.setPadding(1, 1, 1, 1);
        imageView.setImageResource(R.drawable.ic_brush_black);
        linearLayout4.addView(imageView);
        TextView textView = new TextView(getApplicationContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1, 1.0f));
        textView.setText(" التسجيل");
        textView.setTextSize(18.0f);
        textView.setTextColor(-720809);
        textView.setGravity(17);
        linearLayout4.addView(textView);
        ImageView imageView2 = new ImageView(getApplicationContext());
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(50, 50, 0.0f));
        imageView2.setPadding(1, 1, 1, 1);
        imageView2.setImageResource(R.drawable.ic_tune_black);
        linearLayout4.addView(imageView2);
        LinearLayout linearLayout5 = new LinearLayout(getApplicationContext());
        linearLayout5.setOrientation(1);
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout5.setPadding(2, 2, 2, 2);
        linearLayout3.addView(linearLayout5);
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        linearLayout6.setOrientation(1);
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout6.setPadding(2, 2, 2, 2);
        linearLayout6.setGravity(49);
        linearLayout5.addView(linearLayout6);
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        textView2.setText("يجب ان تكون البيانات صحيحه");
        textView2.setTextSize(14.0f);
        textView2.setTextColor(-14983648);
        textView2.setGravity(21);
        linearLayout6.addView(textView2);
        LinearLayout linearLayout7 = new LinearLayout(getApplicationContext());
        linearLayout7.setOrientation(1);
        linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout7.setPadding(4, 4, 4, 4);
        linearLayout6.addView(linearLayout7);
        final EditText editText = new EditText(getApplicationContext());
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, 100, 1.0f));
        editText.setPadding(8, 8, 8, 8);
        editText.setBackgroundColor(0);
        editText.setTextSize(18.0f);
        editText.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        editText.setGravity(17);
        linearLayout7.addView(editText);
        final EditText editText2 = new EditText(getApplicationContext());
        editText2.setLayoutParams(new LinearLayout.LayoutParams(-1, 100, 1.0f));
        editText2.setPadding(8, 8, 8, 8);
        editText2.setBackgroundColor(0);
        editText2.setTextSize(18.0f);
        editText2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        editText2.setGravity(17);
        linearLayout7.addView(editText2);
        LinearLayout linearLayout8 = new LinearLayout(getApplicationContext());
        linearLayout8.setOrientation(0);
        linearLayout8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout8.setPadding(8, 8, 8, 8);
        linearLayout7.addView(linearLayout8);
        TextView textView3 = new TextView(getApplicationContext());
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        textView3.setText("هل تريد تسجيل");
        textView3.setTextSize(14.0f);
        textView3.setTextColor(-720809);
        textView3.setGravity(17);
        linearLayout6.addView(textView3);
        LinearLayout linearLayout9 = new LinearLayout(getApplicationContext());
        linearLayout9.setOrientation(0);
        linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout9.setGravity(17);
        linearLayout6.addView(linearLayout9);
        TextView textView4 = new TextView(getApplicationContext());
        textView4.setLayoutParams(new LinearLayout.LayoutParams(210, 80, 1.0f));
        textView4.setText("إلغاء");
        textView4.setTextSize(16.0f);
        textView4.setTextColor(-59580);
        textView4.setGravity(17);
        linearLayout9.addView(textView4);
        TextView textView5 = new TextView(getApplicationContext());
        LinearLayout linearLayout10 = linearLayout;
        textView5.setLayoutParams(new LinearLayout.LayoutParams(210, 80, 1.0f));
        textView5.setText("موافق");
        textView5.setTextSize(16.0f);
        textView5.setTextColor(-59580);
        textView5.setGravity(17);
        linearLayout9.addView(textView5);
        LinearLayout linearLayout11 = new LinearLayout(getApplicationContext());
        linearLayout11.setOrientation(1);
        ImageView imageView3 = imageView;
        linearLayout11.setLayoutParams(new LinearLayout.LayoutParams(-2, -1, 1.0f));
        linearLayout11.setPadding(8, 8, 8, 8);
        linearLayout9.addView(linearLayout11);
        try {
            textView4.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(360, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
            textView5.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(360, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
            editText2.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(4, 2, -6381922, -657931));
            editText.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(4, 2, -6381922, -657931));
            textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            editText2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            editText.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        } catch (Exception unused) {
        }
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                editText2.requestFocus();
                editText2.setShowSoftInputOnFocus(false);
                editText2.setEnabled(false);
                create.dismiss();
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (editText.getText().toString().equals(BuildConfig.FLAVOR)) {
                    editText.setError("يجب ادخال عدد ");
                    editText.setEnabled(true);
                    editText.requestFocus();
                    ((InputMethodManager) EnterTableActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                    EditText editText = editText;
                    editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                } else if (editText2.getText().toString().equals(BuildConfig.FLAVOR)) {
                    editText2.setError("يجب ادخال عدد ");
                    editText2.setEnabled(true);
                    editText2.requestFocus();
                    ((InputMethodManager) EnterTableActivity.this.getSystemService("input_method")).showSoftInput(editText2, 1);
                    EditText editText2 = editText2;
                    editText2.setSelection(editText2.getText().toString().length(), editText2.getText().toString().length());
                } else if (Double.parseDouble(editText2.getText().toString()) >= 36.0d) {
                    editText2.setError("الحد الاقصى 35");
                    editText2.setEnabled(true);
                    editText2.requestFocus();
                    ((InputMethodManager) EnterTableActivity.this.getSystemService("input_method")).showSoftInput(editText2, 1);
                    EditText editText3 = editText2;
                    editText3.setSelection(editText3.getText().toString().length(), editText2.getText().toString().length());
                } else if (Double.parseDouble(editText.getText().toString()) < 21.0d) {
                    EnterTableActivity.this._cret_chat(Double.parseDouble(editText2.getText().toString()), Double.parseDouble(editText.getText().toString()));
                    editText2.requestFocus();
                    editText2.setShowSoftInputOnFocus(false);
                    editText2.setEnabled(false);
                    create.dismiss();
                } else {
                    editText.setError("الحد الاقصى20");
                    editText.setEnabled(true);
                    editText.requestFocus();
                    ((InputMethodManager) EnterTableActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                    EditText editText4 = editText;
                    editText4.setSelection(editText4.getText().toString().length(), editText.getText().toString().length());
                }
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        textView.setText("☆ تعديل | ".concat("انشاء جدول".concat("  ★ ")));
        editText.setHint("عدد أعمده");
        editText2.setHint("عدد الصفوف");
        textView2.setText("  - تعديد  في الاسفل !");
        textView3.setText("هل تريد ".concat(" حفظ التعديل".concat(" ؟ \n")));
        AnonymousClass129 r1 = new TimerTask() {
            public void run() {
                EnterTableActivity enterTableActivity = EnterTableActivity.this;
                final EditText editText = editText;
                enterTableActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        editText.setTextIsSelectable(true);
                        editText.setEnabled(true);
                        editText.requestFocus();
                        ((InputMethodManager) EnterTableActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                        EditText editText = editText;
                        editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                    }
                });
            }
        };
        this.timer_5 = r1;
        this._timer.schedule(r1, 50);
        editText2.setText(BuildConfig.FLAVOR);
        editText.setText(BuildConfig.FLAVOR);
        editText2.setInputType(12290);
        editText2.setTextIsSelectable(true);
        editText.setInputType(12290);
        editText.setTextIsSelectable(true);
        create.setView(linearLayout10);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        create.getWindow().setLayout(-1, -2);
    }

    public void _ss() {
        this.color_list_0 = (ArrayList) new Gson().fromJson("[\"#00000000\",\"#FFF44336\",\"#FFFBC02D\",\"#FF18AD79\",\"#FF4CAF50\",\"#FF5CB722\",\"#FF651FFF\",\"#FF6200EA\",\"#FF00CCFF\",\"#FF29B6F6\",\"#FFC62828\",\"#FFD50000\",\"#FFFDD835\",\"#FFFFEB3B\",\"#02B875\",\"#FF00C853\",\"#FF4600F4\",\"#FF6200EE\",\"#FF00B0FF\",\"#FF03A9F4\",\"#2962FF\",\"#FF0276FC\",\"#e92467\",\"#FFD81B60\",\"#FFFF9800\",\"#FFFFAB00\",\"#FF00E676\",\"#FF64DD17\",\"#FF7B1FA2\",\"#FF6A1B9A\",\"#FF2979FF\",\"#FF2962FF\",\"#FFFF1744\",\"#FFF50057\",\"#FFF9A825\",\"#FFFFA00A\",\"#FF66BB6A\",\"#FF7CB342\",\"#FFA81EA9\",\"#FFB72ED4\",\"#FFEC407A\",\"#FFFF4081\",\"#FF1E88E5\",\"#FF0091EA\",\"#FFB71C1C\",\"#9E0000\",\"#FF69F0AE\",\"#FF58F4CD\",\"#FF00BFA5\",\"#FF558B2F\",\"#FFEF5350\",\"#FFFF6D00\",\"#FF039BE5\",\"#2FAFFF\",\"#A20025\",\"#FFAD1457\",\"#FF18FFFF\",\"#FF03DAC5\",\"#FF26A69A\",\"#FF388E3C\",\"#FF2B9FC2\",\"#FF0097A7\",\"#FFC2185B\",\"#850303\",\"#FF0288D1\",\"#FF42A5F5\",\"#FFD32F2F\",\"#FFBF360C\",\"#2196F3\",\"#FF2196F3\",\"#FF00B8D4\",\"#FF2BADCA\",\"#FFD84315\",\"#E74C3C\",\"#FF3F51B5\",\"#FF303F9F\",\"#FFFF5722\",\"#D35400\",\"#FF0D47A1\",\"#FF4527A0\",\"#FF827717\",\"#FF9E9D24\",\"#FF4FC3F7\",\"#FF4DD0E1\",\"#FFF57F17\",\"#FFFF8A80\",\"#FF1976D2\",\"#FF1565C0\",\"#FFC0CA33\",\"#CAC319\",\"#808200\",\"#FF689F38\",\"#5399BB\",\"#FF00BCD4\",\"#FFEF6C00\",\"#FFF57C00\",\"#FF3949AB\",\"#FF0E4BAD\",\"#FF9CCC65\",\"#FF43A047\",\"#FFA336CD\",\"#FF9C27B0\",\"#FF00ACC1\",\"#FF80DEEA\",\"#FFB31C9E\",\"#FF1A237E\",\"#FFE91E63\",\"#FFFF6161\",\"#FFF5F5F5\",\"#FFF08FFF\",\"#FFAB47BC\",\"#FF8E24AA\",\"#FF80CBC4\",\"#4083B5\",\"#FFF48FB1\",\"#FFF06292\",\"#FF283593\",\"#FF3700B3\",\"#FFFFECB3\",\"#FFFDFCC5\",\"#FF2E7D32\",\"#FF00897B\",\"#FFFF80AB\",\"#FFFFA2D5\",\"#583358\",\"#FF5D4037\",\"#FF7E57C2\",\"#6726B2\",\"#FF673AB7\",\"#FFAFB42B\",\"#FF00796B\",\"#FF00695C\",\"#FFCE93D8\",\"#FFEA80FC\",\"#FF212121\",\"#FF000080\",\"#FFBB86FC\",\"#9B59B6\",\"#FF9E9E9E\",\"#FFA1887F\",\"#556B2F\",\"#FF71619A\",\"#FF0277BD\",\"#FF5C6BC0\",\"#FF9575CD\",\"#FF8C9EFF\",\"#FFBBDEFB\",\"#FFBDBDBD\",\"#FF880E4F\",\"#FF616161\",\"#FF1B5E20\",\"#FF33691E\",\"#008A00\",\"#FF512DA8\",\"#FF5E35B1\",\"#FA000440\",\"#7B7B7B\",\"#FF78909C\",\"#FF00838F\",\"#FF424242\",\"#FFFFFFFF\",\"#FFFF00FF\",\"#FF0000FF\",\"#FF00FFFF\",\"#FF00FF00\",\"#FFFFFF00\",\"#FFFF0000\",\"#FF000000\",\"#FF18AD79\"]", new TypeToken<ArrayList<String>>() {
        }.getType());
        this.List_fonts = (ArrayList) new Gson().fromJson("[\"aldewantom.ttf\",\"arial.ttf\",\"exzam_bold.ttf\",\"font.ttf\",\"font700.ttf\",\"nasa53672.ttf\",\"nasa87138631.ttf\",\"nasa_n.ttf\",\"nasa_soft154.ttf\",\"nasa_soft19.ttf\",\"nasa_soft44.ttf\",\"nasa_soft55.ttf\",\"u4_5899792387474983078.ttf\"]", new TypeToken<ArrayList<String>>() {
        }.getType());
        this.Font_size = 20.0d;
        this.Etar = 1.0d;
        this.T_in = "0,0,0,0";
        this.T_out = "0,0,0,0";
        this.T_z5 = "0,0,0,0";
        this.size = "300,300,0";
        this.dd = "0,0,0,0";
        this.T_W = "1";
        this.Font_Stayl = "0";
        this.Font_colorr = "#FF000000";
        this.Etar_color = "#00000000";
        this.beack_color = "#00000000";
        this.abC = "0,0,0";
        this.abC_color = "#FF000000";
        this.Font_path = "nasa_soft44.ttf";
        this.Text = BuildConfig.FLAVOR;
        try {
            this.Type = getIntent().getStringExtra("T");
            this.Enter = getIntent().getStringExtra("E");
            this.ID = getIntent().getStringExtra(DatabaseHelper.COL_0);
            this.PL = Double.parseDouble(getIntent().getStringExtra("PL"));
            this.PD = Double.parseDouble(getIntent().getStringExtra("PD"));
            this.K = Double.parseDouble(getIntent().getStringExtra("K"));
            this.paggg = Double.parseDouble(getIntent().getStringExtra("page"));
        } catch (Exception unused) {
            Intent intent = new Intent();
            intent.setClass(getApplicationContext(), HomeActivity.class);
            startActivity(intent);
            finish();
        }
        AnonymousClass132 r0 = new TimerTask() {
            public void run() {
                EnterTableActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        EnterTableActivity.this._star_A();
                    }
                });
            }
        };
        this.timer_5 = r0;
        this._timer.schedule(r0, 20);
        this.w = 1200.0d;
        this.h = 1500.0d;
        this.linear_pdf_0.setLayoutParams(new LinearLayout.LayoutParams((int) this.w, (int) this.h, 0.0f));
        AnonymousClass133 r02 = new TimerTask() {
            public void run() {
                EnterTableActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        EnterTableActivity.this.starr(EnterTableActivity.this.linear_pdf_0, EnterTableActivity.this.linear3);
                        EnterTableActivity.this.timer_5 = new TimerTask() {
                            public void run() {
                                EnterTableActivity.this.runOnUiThread(new Runnable() {
                                    public void run() {
                                        EnterTableActivity.this.starr(EnterTableActivity.this.linear_pdf_0, EnterTableActivity.this.linear3);
                                    }
                                });
                            }
                        };
                        EnterTableActivity.this._timer.schedule(EnterTableActivity.this.timer_5, 500);
                    }
                });
            }
        };
        this.timer_5 = r02;
        this._timer.schedule(r02, 50);
    }

    public void starr(LinearLayout linearLayout, LinearLayout linearLayout2) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = (float) (displayMetrics.widthPixels - 10);
        try {
            this.linear_pdf_0.setLayoutParams(new LinearLayout.LayoutParams((int) this.w, (int) this.h, 0.0f));
            double d = (double) f;
            double d2 = this.w;
            float f2 = (float) (d / d2);
            this.scol = d / d2;
            if (d2 > 0.0d) {
                linearLayout2.setLayoutParams(new LinearLayout.LayoutParams((int) f, (int) (this.h * this.scol), 0.0f));
                linearLayout.setScaleX(f2);
                linearLayout.setScaleY(f2);
                linearLayout.setTranslationX(0.0f);
                linearLayout.setTranslationY(0.0f);
                linearLayout2.setGravity(17);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(1:2)|3|4|5|6|7|8|10|(1:20)(2:14|(2:16|21)(2:17|18))) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0096 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _star_A() {
        /*
            r7 = this;
            java.lang.String r0 = "2"
            android.content.SharedPreferences r1 = r7.saveX
            java.lang.String r2 = r7.ID
            java.lang.String r3 = "_"
            java.lang.String r4 = "all"
            java.lang.String r5 = r3.concat(r4)
            java.lang.String r2 = r2.concat(r5)
            java.lang.String r5 = ""
            java.lang.String r1 = r1.getString(r2, r5)
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x0044
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            android.content.SharedPreferences r2 = r7.saveX
            java.lang.String r6 = r7.ID
            java.lang.String r3 = r3.concat(r4)
            java.lang.String r3 = r6.concat(r3)
            java.lang.String r2 = r2.getString(r3, r5)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$134 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$134
            r3.<init>()
            java.lang.reflect.Type r3 = r3.getType()
            java.lang.Object r1 = r1.fromJson((java.lang.String) r2, (java.lang.reflect.Type) r3)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r7.List_K = r1
        L_0x0044:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x006d }
            r1.<init>()     // Catch:{ Exception -> 0x006d }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r7.List_K     // Catch:{ Exception -> 0x006d }
            double r3 = r7.K     // Catch:{ Exception -> 0x006d }
            int r3 = (int) r3     // Catch:{ Exception -> 0x006d }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x006d }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x006d }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ Exception -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x006d }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$135 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$135     // Catch:{ Exception -> 0x006d }
            r3.<init>()     // Catch:{ Exception -> 0x006d }
            java.lang.reflect.Type r3 = r3.getType()     // Catch:{ Exception -> 0x006d }
            java.lang.Object r1 = r1.fromJson((java.lang.String) r2, (java.lang.reflect.Type) r3)     // Catch:{ Exception -> 0x006d }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x006d }
            r7.List_PD = r1     // Catch:{ Exception -> 0x006d }
        L_0x006d:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0096 }
            r1.<init>()     // Catch:{ Exception -> 0x0096 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r7.List_PD     // Catch:{ Exception -> 0x0096 }
            double r3 = r7.PD     // Catch:{ Exception -> 0x0096 }
            int r3 = (int) r3     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0096 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0096 }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$136 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$136     // Catch:{ Exception -> 0x0096 }
            r3.<init>()     // Catch:{ Exception -> 0x0096 }
            java.lang.reflect.Type r3 = r3.getType()     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r1 = r1.fromJson((java.lang.String) r2, (java.lang.reflect.Type) r3)     // Catch:{ Exception -> 0x0096 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x0096 }
            r7.List_PL = r1     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00c0 }
            r1.<init>()     // Catch:{ Exception -> 0x00c0 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r7.List_PL     // Catch:{ Exception -> 0x00c0 }
            double r3 = r7.PL     // Catch:{ Exception -> 0x00c0 }
            int r3 = (int) r3     // Catch:{ Exception -> 0x00c0 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00c0 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x00c0 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c0 }
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$137 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$137     // Catch:{ Exception -> 0x00c0 }
            r2.<init>()     // Catch:{ Exception -> 0x00c0 }
            java.lang.reflect.Type r2 = r2.getType()     // Catch:{ Exception -> 0x00c0 }
            java.lang.Object r0 = r1.fromJson((java.lang.String) r0, (java.lang.reflect.Type) r2)     // Catch:{ Exception -> 0x00c0 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x00c0 }
            r7.Data_Map = r0     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00c1
        L_0x00c0:
        L_0x00c1:
            java.lang.String r0 = r7.Enter
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f9
            java.lang.String r0 = r7.Enter
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f9
            java.lang.String r0 = r7.Enter
            java.lang.String r1 = "E"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e5
            r0 = 0
            r7._Creat_chat(r0, r0)
            goto L_0x00f9
        L_0x00e5:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Context r1 = r7.getApplicationContext()
            java.lang.Class<com.Nasa.Soft.Exzam.Editor35.HomeActivity> r2 = com.Nasa.Soft.Exzam.Editor35.HomeActivity.class
            r0.setClass(r1, r2)
            r7.startActivity(r0)
            r7.finish()
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterTableActivity._star_A():void");
    }

    public void _saveFan() {
        this.Enter.equals("A");
        HashMap<String, Object> hashMap = new HashMap<>();
        this.map_A = hashMap;
        hashMap.put("0", "3");
        this.map_A.put("2", new Gson().toJson((Object) this.Data_Map));
        this.map_A.put(DatabaseHelper.COL_0, this.ID);
        if (this.Enter.equals("1")) {
            this.List_PL.clear();
            this.List_PL.add(this.map_A);
            HashMap<String, Object> hashMap2 = new HashMap<>();
            this.maer4 = hashMap2;
            hashMap2.put("2", new Gson().toJson((Object) this.List_PL));
            this.List_PD.add((int) this.PD, this.maer4);
            this.List_K.get((int) this.K).put("2", new Gson().toJson((Object) this.List_PD));
        } else if (this.Enter.equals("0")) {
            try {
                this.List_PL = (ArrayList) new Gson().fromJson(this.List_PD.get((int) this.PD).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                }.getType());
            } catch (Exception unused) {
            }
            if (this.List_PL.size() > 0) {
                this.List_PL.add((int) this.PL, this.map_A);
            } else {
                this.List_PL.add(this.map_A);
            }
            this.List_PD.get((int) this.PD).put("2", new Gson().toJson((Object) this.List_PL));
            this.List_K.get((int) this.K).put("2", new Gson().toJson((Object) this.List_PD));
        } else {
            this.List_PL.get((int) this.PL).put("2", new Gson().toJson((Object) this.Data_Map));
            this.List_PD.get((int) this.PD).put("2", new Gson().toJson((Object) this.List_PL));
            this.List_K.get((int) this.K).put("2", new Gson().toJson((Object) this.List_PD));
        }
        this.saveX.edit().putString(this.ID.concat("_".concat("all")), new Gson().toJson((Object) this.List_K)).commit();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0665 A[Catch:{ Exception -> 0x0680 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x068b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0690  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x069e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x06a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _dialog_set(double r36, double r38, double r40) {
        /*
            r35 = this;
            r9 = r35
            java.lang.String r0 = "fonts/font.ttf"
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r9)
            android.app.AlertDialog r10 = r1.create()
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            android.content.Context r1 = r35.getApplicationContext()
            r11.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r11.setLayoutParams(r1)
            r1 = 1
            r11.setOrientation(r1)
            r3 = 17
            r11.setGravity(r3)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r5 = r35.getApplicationContext()
            r4.<init>(r5)
            r4.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r12 = -2
            r6 = 0
            r5.<init>(r2, r12, r6)
            r4.setLayoutParams(r5)
            r5 = 8
            r4.setPadding(r5, r5, r5, r5)
            r4.setBackgroundColor(r2)
            r4.setGravity(r3)
            r11.addView(r4)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            android.content.Context r8 = r35.getApplicationContext()
            r7.<init>(r8)
            r13 = 0
            r7.setOrientation(r13)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r2, r12, r6)
            r7.setLayoutParams(r8)
            r7.setPadding(r5, r5, r5, r5)
            r8 = -1118482(0xffffffffffeeeeee, float:NaN)
            r7.setBackgroundColor(r8)
            r4.addView(r7)
            android.widget.ImageView r14 = new android.widget.ImageView
            android.content.Context r15 = r35.getApplicationContext()
            r14.<init>(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r1 = 105(0x69, float:1.47E-43)
            r5 = 70
            r15.<init>(r1, r5, r6)
            r14.setLayoutParams(r15)
            r15 = 2131165406(0x7f0700de, float:1.7945028E38)
            r14.setImageResource(r15)
            r7.addView(r14)
            android.widget.TextView r15 = new android.widget.TextView
            android.content.Context r8 = r35.getApplicationContext()
            r15.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r13 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r12, r2, r13)
            r15.setLayoutParams(r8)
            java.lang.String r8 = "TextView"
            r15.setText(r8)
            r8 = 1098907648(0x41800000, float:16.0)
            r15.setTextSize(r8)
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r15.setTextColor(r8)
            r15.setGravity(r3)
            r7.addView(r15)
            android.widget.ImageView r3 = new android.widget.ImageView
            android.content.Context r8 = r35.getApplicationContext()
            r3.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r1, r5, r6)
            r3.setLayoutParams(r8)
            r8 = 2131165402(0x7f0700da, float:1.794502E38)
            r3.setImageResource(r8)
            r7.addView(r3)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            android.content.Context r1 = r35.getApplicationContext()
            r8.<init>(r1)
            r1 = 0
            r8.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r2, r12, r6)
            r8.setLayoutParams(r1)
            r1 = 4
            r8.setPadding(r1, r1, r1, r1)
            r4.addView(r8)
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r5 = r35.getApplicationContext()
            r1.<init>(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r12, r2, r13)
            r1.setLayoutParams(r5)
            java.lang.String r5 = "إدراج "
            r1.setText(r5)
            r5 = 1098907648(0x41800000, float:16.0)
            r1.setTextSize(r5)
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1.setTextColor(r5)
            r5 = 17
            r1.setGravity(r5)
            r8.addView(r1)
            android.widget.ImageView r5 = new android.widget.ImageView
            android.content.Context r13 = r35.getApplicationContext()
            r5.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r2 = 70
            r12 = 105(0x69, float:1.47E-43)
            r13.<init>(r12, r2, r6)
            r5.setLayoutParams(r13)
            r2 = 4
            r5.setPadding(r2, r2, r2, r2)
            r2 = -1118482(0xffffffffffeeeeee, float:NaN)
            r5.setBackgroundColor(r2)
            r2 = 2131165336(0x7f070098, float:1.7944886E38)
            r5.setImageResource(r2)
            r8.addView(r5)
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            android.content.Context r2 = r35.getApplicationContext()
            r12.<init>(r2)
            r2 = 0
            r12.setOrientation(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r13 = -1
            r2.<init>(r13, r5, r6)
            r12.setLayoutParams(r2)
            r2 = 4
            r12.setPadding(r2, r2, r2, r2)
            r4.addView(r12)
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r6 = r35.getApplicationContext()
            r2.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r21 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r5, r13, r3)
            r2.setLayoutParams(r6)
            java.lang.String r3 = "إزالة(حذف)"
            r2.setText(r3)
            r3 = 1098907648(0x41800000, float:16.0)
            r2.setTextSize(r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setTextColor(r3)
            r3 = 17
            r2.setGravity(r3)
            r12.addView(r2)
            android.widget.ImageView r3 = new android.widget.ImageView
            android.content.Context r5 = r35.getApplicationContext()
            r3.<init>(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r22 = r11
            r6 = 70
            r11 = 0
            r13 = 105(0x69, float:1.47E-43)
            r5.<init>(r13, r6, r11)
            r3.setLayoutParams(r5)
            r5 = 4
            r3.setPadding(r5, r5, r5, r5)
            r5 = -657931(0xfffffffffff5f5f5, float:NaN)
            r3.setBackgroundColor(r5)
            r6 = 2131165381(0x7f0700c5, float:1.7944978E38)
            r3.setImageResource(r6)
            r12.addView(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r6 = r35.getApplicationContext()
            r3.<init>(r6)
            r6 = 0
            r3.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = -1
            r13 = 0
            r11.<init>(r6, r5, r13)
            r3.setLayoutParams(r11)
            r4.addView(r3)
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            android.content.Context r6 = r35.getApplicationContext()
            r11.<init>(r6)
            r6 = 0
            r11.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r13 = 350(0x15e, float:4.9E-43)
            r23 = r14
            r14 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r13, r5, r14)
            r11.setLayoutParams(r6)
            r6 = 4
            r11.setPadding(r6, r6, r6, r6)
            r3.addView(r11)
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r13 = r35.getApplicationContext()
            r6.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r25 = r10
            r10 = -1
            r13.<init>(r5, r10, r14)
            r6.setLayoutParams(r13)
            java.lang.String r5 = "نسخه إلى الحافظه"
            r6.setText(r5)
            r5 = 1098907648(0x41800000, float:16.0)
            r6.setTextSize(r5)
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setTextColor(r5)
            r5 = 17
            r6.setGravity(r5)
            r11.addView(r6)
            android.widget.ImageView r5 = new android.widget.ImageView
            android.content.Context r10 = r35.getApplicationContext()
            r5.<init>(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r26 = r6
            r6 = 0
            r13 = 70
            r14 = 105(0x69, float:1.47E-43)
            r10.<init>(r14, r13, r6)
            r5.setLayoutParams(r10)
            r6 = 4
            r5.setPadding(r6, r6, r6, r6)
            r6 = -657931(0xfffffffffff5f5f5, float:NaN)
            r5.setBackgroundColor(r6)
            r6 = 2131165384(0x7f0700c8, float:1.7944984E38)
            r5.setImageResource(r6)
            r11.addView(r5)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            android.content.Context r5 = r35.getApplicationContext()
            r10.<init>(r5)
            r5 = 0
            r10.setOrientation(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = 350(0x15e, float:4.9E-43)
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = -2
            r5.<init>(r6, r14, r13)
            r10.setLayoutParams(r5)
            r5 = 4
            r10.setPadding(r5, r5, r5, r5)
            r3.addView(r10)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r5 = r35.getApplicationContext()
            r3.<init>(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r5.<init>(r14, r6, r13)
            r3.setLayoutParams(r5)
            java.lang.String r5 = "إستبدال من الحافظه"
            r3.setText(r5)
            r5 = 1098907648(0x41800000, float:16.0)
            r3.setTextSize(r5)
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setTextColor(r5)
            r5 = 17
            r3.setGravity(r5)
            r10.addView(r3)
            android.widget.ImageView r5 = new android.widget.ImageView
            android.content.Context r6 = r35.getApplicationContext()
            r5.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r27 = r3
            r3 = 0
            r13 = 70
            r14 = 105(0x69, float:1.47E-43)
            r6.<init>(r14, r13, r3)
            r5.setLayoutParams(r6)
            r3 = 4
            r5.setPadding(r3, r3, r3, r3)
            r3 = -1118482(0xffffffffffeeeeee, float:NaN)
            r5.setBackgroundColor(r3)
            r3 = 2131165290(0x7f07006a, float:1.7944793E38)
            r5.setImageResource(r3)
            r10.addView(r5)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r5 = r35.getApplicationContext()
            r3.<init>(r5)
            r5 = 0
            r3.setOrientation(r5)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r13 = 0
            r14 = -2
            r6.<init>(r5, r14, r13)
            r3.setLayoutParams(r6)
            r4.addView(r3)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r6 = r35.getApplicationContext()
            r5.<init>(r6)
            r6 = 0
            r5.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r28 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r13 = 350(0x15e, float:4.9E-43)
            r6.<init>(r13, r14, r0)
            r5.setLayoutParams(r6)
            r6 = 4
            r5.setPadding(r6, r6, r6, r6)
            r6 = 21
            r5.setGravity(r6)
            r3.addView(r5)
            android.widget.RadioButton r13 = new android.widget.RadioButton
            android.content.Context r6 = r35.getApplicationContext()
            r13.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r6.<init>(r14, r9, r0)
            r13.setLayoutParams(r6)
            java.lang.String r0 = "الإدخال رقم "
            r13.setText(r0)
            r0 = 1098907648(0x41800000, float:16.0)
            r13.setTextSize(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r13.setTextColor(r0)
            r0 = 17
            r13.setGravity(r0)
            r5.addView(r13)
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r6 = r35.getApplicationContext()
            r0.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r29 = r13
            r9 = 70
            r13 = 0
            r14 = 105(0x69, float:1.47E-43)
            r6.<init>(r14, r9, r13)
            r0.setLayoutParams(r6)
            r6 = 4
            r0.setPadding(r6, r6, r6, r6)
            r6 = -1118482(0xffffffffffeeeeee, float:NaN)
            r0.setBackgroundColor(r6)
            r6 = 2131165301(0x7f070075, float:1.7944815E38)
            r0.setImageResource(r6)
            r5.addView(r0)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r6 = r35.getApplicationContext()
            r0.<init>(r6)
            r6 = 0
            r0.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r9 = 350(0x15e, float:4.9E-43)
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = -2
            r6.<init>(r9, r14, r13)
            r0.setLayoutParams(r6)
            r6 = 4
            r0.setPadding(r6, r6, r6, r6)
            r3.addView(r0)
            android.widget.RadioButton r9 = new android.widget.RadioButton
            android.content.Context r3 = r35.getApplicationContext()
            r9.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r3.<init>(r14, r6, r13)
            r9.setLayoutParams(r3)
            java.lang.String r3 = "الإدخال نص"
            r9.setText(r3)
            r3 = 1098907648(0x41800000, float:16.0)
            r9.setTextSize(r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.setTextColor(r3)
            r3 = 17
            r9.setGravity(r3)
            r0.addView(r9)
            android.widget.ImageView r3 = new android.widget.ImageView
            android.content.Context r6 = r35.getApplicationContext()
            r3.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r24 = r9
            r9 = 0
            r13 = 70
            r14 = 105(0x69, float:1.47E-43)
            r6.<init>(r14, r13, r9)
            r3.setLayoutParams(r6)
            r6 = 4
            r3.setPadding(r6, r6, r6, r6)
            r6 = -1118482(0xffffffffffeeeeee, float:NaN)
            r3.setBackgroundColor(r6)
            r6 = 2131165344(0x7f0700a0, float:1.7944902E38)
            r3.setImageResource(r6)
            r0.addView(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r6 = r35.getApplicationContext()
            r3.<init>(r6)
            r6 = 0
            r3.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r9 = 0
            r13 = -2
            r14 = -1
            r6.<init>(r14, r13, r9)
            r3.setLayoutParams(r6)
            r6 = 4
            r3.setPadding(r6, r6, r6, r6)
            r4.addView(r3)
            android.widget.CheckBox r9 = new android.widget.CheckBox
            android.content.Context r6 = r35.getApplicationContext()
            r9.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r30 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r13, r14, r0)
            r9.setLayoutParams(r6)
            java.lang.String r0 = "تجميع القيم العدديه إلى الاخير"
            r9.setText(r0)
            r0 = 1098907648(0x41800000, float:16.0)
            r9.setTextSize(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.setTextColor(r0)
            r0 = 17
            r9.setGravity(r0)
            r3.addView(r9)
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r6 = r35.getApplicationContext()
            r0.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r18 = r9
            r9 = 0
            r13 = 70
            r14 = 105(0x69, float:1.47E-43)
            r6.<init>(r14, r13, r9)
            r0.setLayoutParams(r6)
            r6 = 4
            r0.setPadding(r6, r6, r6, r6)
            r6 = -657931(0xfffffffffff5f5f5, float:NaN)
            r0.setBackgroundColor(r6)
            r6 = 2131165341(0x7f07009d, float:1.7944896E38)
            r0.setImageResource(r6)
            r3.addView(r0)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r6 = r35.getApplicationContext()
            r0.<init>(r6)
            r6 = 0
            r0.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r9 = 0
            r13 = -2
            r14 = -1
            r6.<init>(r14, r13, r9)
            r0.setLayoutParams(r6)
            r6 = 4
            r0.setPadding(r6, r6, r6, r6)
            r6 = -1118482(0xffffffffffeeeeee, float:NaN)
            r0.setBackgroundColor(r6)
            r4.addView(r0)
            android.widget.Button r9 = new android.widget.Button
            android.content.Context r4 = r35.getApplicationContext()
            r9.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r14, r13, r6)
            r9.setLayoutParams(r4)
            r4 = 8
            r9.setPadding(r4, r4, r4, r4)
            java.lang.String r4 = "cancel"
            r9.setText(r4)
            r4 = 1094713344(0x41400000, float:12.0)
            r9.setTextSize(r4)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.setTextColor(r6)
            r0.addView(r9)
            android.widget.Button r13 = new android.widget.Button
            android.content.Context r6 = r35.getApplicationContext()
            r13.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r19 = r9
            r4 = -2
            r9 = -1
            r14 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r9, r4, r14)
            r13.setLayoutParams(r6)
            r4 = 8
            r13.setPadding(r4, r4, r4, r4)
            java.lang.String r4 = "OK"
            r13.setText(r4)
            r4 = 1094713344(0x41400000, float:12.0)
            r13.setTextSize(r4)
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r13.setTextColor(r4)
            r0.addView(r13)
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r4 = ""
            r31 = 0
            int r6 = (r40 > r31 ? 1 : (r40 == r31 ? 0 : -1))
            if (r6 != 0) goto L_0x04e2
            r9 = r13
            double r13 = r36 + r16
            long r13 = (long) r13
            java.lang.String r6 = java.lang.String.valueOf(r13)
            java.lang.String r13 = "عمود "
            java.lang.String r6 = r13.concat(r6)
            r15.setText(r6)
            java.lang.String r6 = "إدراج عمود قبل هذا العمود"
            java.lang.String r6 = r6.concat(r4)
            r1.setText(r6)
            java.lang.String r6 = "مسح هذا العمود نهائيا"
            java.lang.String r6 = r6.concat(r4)
            r2.setText(r6)
            goto L_0x0505
        L_0x04e2:
            r9 = r13
            double r13 = r38 + r16
            long r13 = (long) r13
            java.lang.String r6 = java.lang.String.valueOf(r13)
            java.lang.String r13 = "صف "
            java.lang.String r6 = r13.concat(r6)
            r15.setText(r6)
            java.lang.String r6 = "إدراج صف قبل هذا الصف"
            java.lang.String r6 = r6.concat(r4)
            r1.setText(r6)
            java.lang.String r6 = "مسح هذا الصف نهائيا"
            java.lang.String r6 = r6.concat(r4)
            r2.setText(r6)
        L_0x0505:
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r16 = r9
            r9 = -1
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = -2
            r6.<init>(r9, r14, r13)
            r9 = 2
            r13 = 4
            r6.setMargins(r13, r9, r13, r9)
            r11.setLayoutParams(r6)
            r12.setLayoutParams(r6)
            r10.setLayoutParams(r6)
            r8.setLayoutParams(r6)
            r7.setLayoutParams(r6)
            r0.setLayoutParams(r6)
            r5.setLayoutParams(r6)
            r13 = r30
            r13.setLayoutParams(r6)
            r3.setLayoutParams(r6)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$139 r6 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$139
            r14 = r35
            r6.<init>()
            r17 = r4
            r20 = r15
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r15 = -1
            android.graphics.drawable.GradientDrawable r6 = r6.getIns(r9, r9, r4, r15)
            r11.setBackground(r6)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$140 r6 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$140
            r6.<init>()
            android.graphics.drawable.GradientDrawable r6 = r6.getIns(r9, r9, r4, r15)
            r12.setBackground(r6)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$141 r6 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$141
            r6.<init>()
            android.graphics.drawable.GradientDrawable r6 = r6.getIns(r9, r9, r4, r15)
            r10.setBackground(r6)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$142 r6 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$142
            r6.<init>()
            android.graphics.drawable.GradientDrawable r6 = r6.getIns(r9, r9, r4, r15)
            r8.setBackground(r6)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$143 r6 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$143
            r6.<init>()
            android.graphics.drawable.GradientDrawable r6 = r6.getIns(r9, r9, r4, r15)
            r3.setBackground(r6)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$144 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$144
            r3.<init>()
            android.graphics.drawable.GradientDrawable r3 = r3.getIns(r9, r9, r4, r15)
            r5.setBackground(r3)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$145 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$145
            r3.<init>()
            android.graphics.drawable.GradientDrawable r3 = r3.getIns(r9, r9, r4, r15)
            r13.setBackground(r3)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$146 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$146
            r3.<init>()
            r5 = -2039584(0xffffffffffe0e0e0, float:NaN)
            android.graphics.drawable.GradientDrawable r3 = r3.getIns(r9, r9, r4, r5)
            r7.setBackground(r3)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$147 r3 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$147
            r3.<init>()
            android.graphics.drawable.GradientDrawable r3 = r3.getIns(r9, r9, r4, r5)
            r0.setBackground(r3)
            android.content.res.AssetManager r0 = r35.getAssets()     // Catch:{ Exception -> 0x0641 }
            r3 = r28
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r3)     // Catch:{ Exception -> 0x0641 }
            r4 = r26
            r5 = 1
            r4.setTypeface(r0, r5)     // Catch:{ Exception -> 0x0641 }
            android.content.res.AssetManager r0 = r35.getAssets()     // Catch:{ Exception -> 0x0641 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r3)     // Catch:{ Exception -> 0x0641 }
            r2.setTypeface(r0, r5)     // Catch:{ Exception -> 0x0641 }
            android.content.res.AssetManager r0 = r35.getAssets()     // Catch:{ Exception -> 0x0641 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r3)     // Catch:{ Exception -> 0x0641 }
            r1.setTypeface(r0, r5)     // Catch:{ Exception -> 0x0641 }
            android.content.res.AssetManager r0 = r35.getAssets()     // Catch:{ Exception -> 0x0641 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r3)     // Catch:{ Exception -> 0x0641 }
            r1 = r27
            r1.setTypeface(r0, r5)     // Catch:{ Exception -> 0x0641 }
            android.content.res.AssetManager r0 = r35.getAssets()     // Catch:{ Exception -> 0x0641 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r3)     // Catch:{ Exception -> 0x0641 }
            r1 = r20
            r1.setTypeface(r0, r5)     // Catch:{ Exception -> 0x0641 }
            android.content.res.AssetManager r0 = r35.getAssets()     // Catch:{ Exception -> 0x0641 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r3)     // Catch:{ Exception -> 0x0641 }
            r9 = r29
            r9.setTypeface(r0, r5)     // Catch:{ Exception -> 0x0638 }
            android.content.res.AssetManager r0 = r35.getAssets()     // Catch:{ Exception -> 0x0638 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r3)     // Catch:{ Exception -> 0x0638 }
            r13 = r24
            r13.setTypeface(r0, r5)     // Catch:{ Exception -> 0x0631 }
            android.content.res.AssetManager r0 = r35.getAssets()     // Catch:{ Exception -> 0x0631 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r3)     // Catch:{ Exception -> 0x0631 }
            r15 = r19
            r15.setTypeface(r0, r5)     // Catch:{ Exception -> 0x062c }
            android.content.res.AssetManager r0 = r35.getAssets()     // Catch:{ Exception -> 0x062c }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r3)     // Catch:{ Exception -> 0x062c }
            r6 = r16
            r6.setTypeface(r0, r5)     // Catch:{ Exception -> 0x062e }
            android.content.res.AssetManager r0 = r35.getAssets()     // Catch:{ Exception -> 0x062e }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r3)     // Catch:{ Exception -> 0x062e }
            r7 = r18
            r7.setTypeface(r0, r5)     // Catch:{ Exception -> 0x064b }
            goto L_0x064b
        L_0x062c:
            r6 = r16
        L_0x062e:
            r7 = r18
            goto L_0x064b
        L_0x0631:
            r6 = r16
            r7 = r18
            r15 = r19
            goto L_0x064b
        L_0x0638:
            r6 = r16
            r7 = r18
            r15 = r19
            r13 = r24
            goto L_0x064b
        L_0x0641:
            r6 = r16
            r7 = r18
            r15 = r19
            r13 = r24
            r9 = r29
        L_0x064b:
            r0 = r17
            r14.Ty_num = r0
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r14.List_startMap     // Catch:{ Exception -> 0x0680 }
            int r1 = r0.size()     // Catch:{ Exception -> 0x0680 }
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0680 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0680 }
            java.lang.String r1 = "n"
            boolean r0 = r0.containsKey(r1)     // Catch:{ Exception -> 0x0680 }
            if (r0 == 0) goto L_0x0681
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r14.List_startMap     // Catch:{ Exception -> 0x0680 }
            int r1 = r0.size()     // Catch:{ Exception -> 0x0680 }
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0680 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0680 }
            java.lang.String r1 = "n"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0680 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0680 }
            r14.Ty_num = r0     // Catch:{ Exception -> 0x0680 }
            goto L_0x0681
        L_0x0680:
        L_0x0681:
            java.lang.String r0 = r14.Ty_num
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0690
            r0 = 1
            r9.setChecked(r0)
            goto L_0x0694
        L_0x0690:
            r0 = 1
            r13.setChecked(r0)
        L_0x0694:
            java.lang.String r1 = r14.EE
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x06a2
            r7.setChecked(r0)
            goto L_0x06a6
        L_0x06a2:
            r0 = 0
            r7.setChecked(r0)
        L_0x06a6:
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$148 r4 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$148
            r0 = r4
            r1 = r35
            r5 = r21
            r2 = r36
            r29 = r9
            r19 = r15
            r9 = r4
            r15 = r5
            r4 = r38
            r34 = r6
            r33 = r7
            r6 = r40
            r24 = r13
            r13 = r8
            r8 = r25
            r0.<init>(r2, r4, r6, r8)
            r13.setOnClickListener(r9)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$149 r9 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$149
            r0 = r9
            r0.<init>(r2, r4, r6, r8)
            r12.setOnClickListener(r9)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$150 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$150
            r0.<init>()
            r11.setOnClickListener(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$151 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$151
            r0.<init>()
            r10.setOnClickListener(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$152 r9 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$152
            r0 = r9
            r0.<init>(r2, r4, r6, r8)
            r15.setOnClickListener(r9)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$153 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$153
            r9 = r25
            r0.<init>(r9)
            r1 = r23
            r1.setOnClickListener(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$154 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$154
            r2 = r24
            r1 = r29
            r0.<init>(r2, r1)
            r2.setOnCheckedChangeListener(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$155 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$155
            r0.<init>(r1, r2)
            r1.setOnCheckedChangeListener(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$156 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$156
            r1 = r33
            r0.<init>(r1)
            r1.setOnCheckedChangeListener(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$157 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$157
            r0.<init>(r9)
            r1 = r19
            r1.setOnClickListener(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$158 r10 = new com.Nasa.Soft.Exzam.Editor35.EnterTableActivity$158
            r0 = r10
            r1 = r35
            r2 = r40
            r4 = r36
            r6 = r38
            r8 = r9
            r0.<init>(r2, r4, r6, r8)
            r0 = r34
            r0.setOnClickListener(r10)
            r0 = r22
            r9.setView(r0)
            r9.show()
            android.view.Window r0 = r9.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r1.<init>(r2)
            r0.setBackgroundDrawable(r1)
            android.view.Window r0 = r9.getWindow()
            r1 = -2
            r0.setLayout(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterTableActivity._dialog_set(double, double, double):void");
    }

    public void _add_new_saf_amod(double d, double d2, double d3) {
        int i = 0;
        if (d3 == 0.0d) {
            while (i < this.Data_Map.size()) {
                try {
                    ArrayList<HashMap<String, Object>> arrayList = (ArrayList) new Gson().fromJson(this.Data_Map.get(i).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                    }.getType());
                    this.List_startMap = arrayList;
                    int i2 = (int) d;
                    HashMap<String, Object> hashMap = arrayList.get(i2);
                    this.map_A = hashMap;
                    this.List_startMap.add(i2, hashMap);
                    this.Data_Map.get(i).put("2", new Gson().toJson((Object) this.List_startMap));
                    i++;
                } catch (Exception unused) {
                    return;
                }
            }
            _Creat_chat(0.0d, 0.0d);
            return;
        }
        int i3 = (int) d2;
        this.List_startMap = (ArrayList) new Gson().fromJson(this.Data_Map.get(i3).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
        }.getType());
        while (i < this.List_startMap.size()) {
            this.List_startMap.get(i).put("20", BuildConfig.FLAVOR);
            i++;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("2", new Gson().toJson((Object) this.List_startMap));
        this.Data_Map.add(i3, hashMap2);
        _Creat_chat(0.0d, 0.0d);
    }

    public void _delet_saf_amod(double d, double d2, double d3) {
        if (d3 == 0.0d) {
            int i = 0;
            while (i < this.Data_Map.size()) {
                try {
                    ArrayList<HashMap<String, Object>> arrayList = (ArrayList) new Gson().fromJson(this.Data_Map.get(i).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                    }.getType());
                    this.List_startMap = arrayList;
                    arrayList.remove((int) d);
                    this.Data_Map.get(i).put("2", new Gson().toJson((Object) this.List_startMap));
                    i++;
                } catch (Exception unused) {
                    return;
                }
            }
            _Creat_chat(0.0d, 0.0d);
            return;
        }
        this.Data_Map.remove((int) d2);
        _Creat_chat(0.0d, 0.0d);
    }

    public void _set_n(double d, double d2, double d3) {
        int i = 0;
        if (d3 == 0.0d) {
            while (i < this.Data_Map.size()) {
                try {
                    ArrayList<HashMap<String, Object>> arrayList = (ArrayList) new Gson().fromJson(this.Data_Map.get(i).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                    }.getType());
                    this.List_startMap = arrayList;
                    arrayList.get((int) d).put("n", this.Ty_num);
                    this.Data_Map.get(i).put("2", new Gson().toJson((Object) this.List_startMap));
                    i++;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        int i2 = (int) d2;
        this.List_startMap = (ArrayList) new Gson().fromJson(this.Data_Map.get(i2).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
        }.getType());
        while (i < this.List_startMap.size()) {
            this.List_startMap.get(i).put("n", this.Ty_num);
            i++;
        }
        this.Data_Map.get(i2).put("2", new Gson().toJson((Object) this.List_startMap));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|6|7|18|19|21) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _set_TextView(android.widget.TextView r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.Text
            r5.setText(r0)
            double r0 = r4.Font_size
            int r0 = (int) r0
            float r0 = (float) r0
            r5.setTextSize(r0)
            java.lang.String r0 = r4.Font_colorr     // Catch:{ Exception -> 0x0015 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x0015 }
            r5.setTextColor(r0)     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            java.lang.String r0 = r4.abC     // Catch:{ Exception -> 0x0042 }
            r1 = 0
            java.lang.String r0 = r4.Spliter(r0, r1)     // Catch:{ Exception -> 0x0042 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0042 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0042 }
            java.lang.String r1 = r4.abC     // Catch:{ Exception -> 0x0042 }
            r2 = 1
            java.lang.String r1 = r4.Spliter(r1, r2)     // Catch:{ Exception -> 0x0042 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0042 }
            float r1 = (float) r1     // Catch:{ Exception -> 0x0042 }
            java.lang.String r2 = r4.abC     // Catch:{ Exception -> 0x0042 }
            r3 = 2
            java.lang.String r2 = r4.Spliter(r2, r3)     // Catch:{ Exception -> 0x0042 }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r3 = r4.abC_color     // Catch:{ Exception -> 0x0042 }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x0042 }
            r5.setShadowLayer(r0, r1, r2, r3)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            java.lang.String r0 = r4.T_W
            int r1 = r0.hashCode()
            r2 = 17
            switch(r1) {
                case 49: goto L_0x006b;
                case 50: goto L_0x005c;
                case 51: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x007a
        L_0x004f:
            java.lang.String r1 = "3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0058
            goto L_0x007a
        L_0x0058:
            r5.setGravity(r2)
            goto L_0x007d
        L_0x005c:
            java.lang.String r1 = "2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0065
            goto L_0x007a
        L_0x0065:
            r0 = 19
            r5.setGravity(r0)
            goto L_0x007d
        L_0x006b:
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0074
            goto L_0x007a
        L_0x0074:
            r0 = 21
            r5.setGravity(r0)
            goto L_0x007d
        L_0x007a:
            r5.setGravity(r2)
        L_0x007d:
            android.content.res.AssetManager r0 = r4.getAssets()     // Catch:{ Exception -> 0x009f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f }
            java.lang.String r2 = "fonts/"
            r1.<init>(r2)     // Catch:{ Exception -> 0x009f }
            java.lang.String r2 = r4.Font_path     // Catch:{ Exception -> 0x009f }
            r1.append(r2)     // Catch:{ Exception -> 0x009f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x009f }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x009f }
            java.lang.String r1 = r4.Font_Stayl     // Catch:{ Exception -> 0x009f }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x009f }
            int r1 = (int) r1     // Catch:{ Exception -> 0x009f }
            r5.setTypeface(r0, r1)     // Catch:{ Exception -> 0x009f }
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterTableActivity._set_TextView(android.widget.TextView):void");
    }

    public void _get_back(double d) {
        if (this.Data_Map.size() <= 0) {
            SketchwareUtil.showMessage(getApplicationContext(), "لا يوجد شي للحفظ");
            Intent intent = new Intent();
            intent.setClass(getApplicationContext(), ExzamViewActivity.class);
            intent.putExtra(DatabaseHelper.COL_0, this.ID);
            intent.putExtra("page", String.valueOf((long) this.paggg));
            intent.putExtra("T", "3");
            startActivity(intent);
            finish();
        } else if (d == 1.0d) {
            this.dialog_6.setTitle("☆☆تنبيه هااام☆☆");
            this.dialog_6.setIcon(R.drawable.ulang_19);
            this.dialog_6.setMessage("هل تريد حفظ التغيرات قبل الخروج ؟!!");
            this.dialog_6.setPositiveButton("حفظ", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    EnterTableActivity.this._saveFan();
                    Intent intent = new Intent();
                    intent.setClass(EnterTableActivity.this.getApplicationContext(), ExzamViewActivity.class);
                    intent.putExtra(DatabaseHelper.COL_0, EnterTableActivity.this.ID);
                    intent.putExtra("page", String.valueOf((long) EnterTableActivity.this.paggg));
                    intent.putExtra("T", "3");
                    EnterTableActivity.this.startActivity(intent);
                    EnterTableActivity.this.finish();
                }
            });
            this.dialog_6.setNegativeButton("   عدم حفظ ", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent();
                    intent.setClass(EnterTableActivity.this.getApplicationContext(), ExzamViewActivity.class);
                    intent.putExtra(DatabaseHelper.COL_0, EnterTableActivity.this.ID);
                    intent.putExtra("page", String.valueOf((long) EnterTableActivity.this.paggg));
                    intent.putExtra("T", "3");
                    EnterTableActivity.this.startActivity(intent);
                    EnterTableActivity.this.finish();
                }
            });
            this.dialog_6.setNeutralButton("إلغاء ", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            this.dialog_6.create().show();
        } else {
            _saveFan();
            Intent intent2 = new Intent();
            intent2.setClass(getApplicationContext(), ExzamViewActivity.class);
            intent2.putExtra(DatabaseHelper.COL_0, this.ID);
            intent2.putExtra("page", String.valueOf((long) this.paggg));
            intent2.putExtra("T", "3");
            startActivity(intent2);
            finish();
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
