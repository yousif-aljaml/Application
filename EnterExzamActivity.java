package com.Nasa.Soft.Exzam.Editor35;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
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
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import uk.co.senab.photoview.BuildConfig;
import uk.co.senab.photoview.PhotoViewAttacher;

public class EnterExzamActivity extends AppCompatActivity {
    private static final int DRAG = 1;
    private static final int NONE = 0;
    private static final int ZOOM = 2;
    private String Book = BuildConfig.FLAVOR;
    private ArrayList<String> Color_list = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> Colour2 = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> Data_Map = new ArrayList<>();
    private String Enter = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public double Etar = 0.0d;
    private String Etar_color = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public double F_bold = 0.0d;
    /* access modifiers changed from: private */
    public double F_itlic = 0.0d;
    /* access modifiers changed from: private */
    public double F_stay = 0.0d;
    /* access modifiers changed from: private */
    public double F_und = 0.0d;
    /* access modifiers changed from: private */
    public String Font_Stayl = BuildConfig.FLAVOR;
    private String Font_colorr = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Font_path = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public double Font_size = 0.0d;
    /* access modifiers changed from: private */
    public double H = 0.0d;
    /* access modifiers changed from: private */
    public String ID = BuildConfig.FLAVOR;
    private String ID_one = BuildConfig.FLAVOR;
    private double K = 0.0d;
    private LinearLayout L6;
    /* access modifiers changed from: private */
    public LinearLayout L900;
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> List_all = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> List_font_somq = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<String> List_fonts = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> List_map = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> List_size = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> List_startMap = new ArrayList<>();
    private HashMap<String, Object> Map_A = new HashMap<>();
    /* access modifiers changed from: private */
    public double PD = 0.0d;
    /* access modifiers changed from: private */
    public double PL = 0.0d;
    private String Page = BuildConfig.FLAVOR;
    public final int REQ_CD_CAMIRA = 102;
    public final int REQ_CD_IMAGE_A = 101;
    /* access modifiers changed from: private */
    public String T_W = BuildConfig.FLAVOR;
    private String T_in = BuildConfig.FLAVOR;
    private String T_out = BuildConfig.FLAVOR;
    private String T_z5 = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Tex_im = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Text = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String Type = BuildConfig.FLAVOR;
    private String Urel = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public double W = 0.0d;
    /* access modifiers changed from: private */
    public double Wi = 0.0d;
    private File _file_camira;
    /* access modifiers changed from: private */
    public Timer _timer = new Timer();
    /* access modifiers changed from: private */
    public String abC = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String abC_color = BuildConfig.FLAVOR;
    private String beack_color = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public Intent camira = new Intent("android.media.action.IMAGE_CAPTURE");
    private SharedPreferences codee;
    private double color = 0.0d;
    private float d = 0.0f;
    private String dd = BuildConfig.FLAVOR;
    private AlertDialog.Builder dialog_6;
    /* access modifiers changed from: private */
    public AlertDialog.Builder dialog_p;
    private double edat_num = 0.0d;
    /* access modifiers changed from: private */
    public EditText edittext1;
    private double h = 0.0d;
    /* access modifiers changed from: private */
    public ImageView imag_bold;
    /* access modifiers changed from: private */
    public Intent image_A = new Intent("android.intent.action.GET_CONTENT");
    /* access modifiers changed from: private */
    public ImageView image_Center;
    /* access modifiers changed from: private */
    public ImageView image_Lift;
    /* access modifiers changed from: private */
    public ImageView image_Right;
    private ImageView image_enter_2;
    /* access modifiers changed from: private */
    public ImageView image_itlic;
    /* access modifiers changed from: private */
    public ImageView image_und;
    private ImageView imageview16;
    private ImageView imageview17;
    private ImageView imageview2;
    private ImageView imageview22;
    private ImageView imageview23;
    private ImageView imageview24;
    private ImageView imageview30;
    private ImageView imageview31;
    private ImageView imageview32;
    private ImageView imageview33;
    private ImageView imageview35;
    private ImageView imageview36;
    private ImageView imageview39;
    private ImageView imageview41;
    private ImageView imageview43;
    private ImageView imageview44;
    private ImageView imageview45;
    private ImageView imageview48;
    private ImageView imageview49;
    private ImageView imageview50;
    private boolean isOutSide;
    private boolean isZoomAndRotate;
    private float[] lastEvent = null;
    private LinearLayout line_dddds;
    private LinearLayout linear00;
    private LinearLayout linear1;
    private LinearLayout linear10;
    private LinearLayout linear12;
    private LinearLayout linear13;
    private LinearLayout linear14;
    private LinearLayout linear19;
    private LinearLayout linear21;
    private LinearLayout linear22;
    private LinearLayout linear23;
    private LinearLayout linear24;
    private LinearLayout linear25;
    private LinearLayout linear26;
    private LinearLayout linear27;
    private LinearLayout linear28;
    private LinearLayout linear29;
    /* access modifiers changed from: private */
    public LinearLayout linear3;
    private LinearLayout linear30;
    private LinearLayout linear33;
    private LinearLayout linear35;
    private LinearLayout linear36;
    private LinearLayout linear_1200;
    private LinearLayout linear_Tabaod;
    private LinearLayout linear_Taqwess;
    private LinearLayout linear_Top_one;
    private LinearLayout linear_Top_tow;
    private LinearLayout linear_beack_color;
    private LinearLayout linear_font;
    private LinearLayout linear_g5;
    private LinearLayout linear_image;
    private LinearLayout linear_jgxhfhkxhhxhk;
    /* access modifiers changed from: private */
    public LinearLayout linear_pdf_0;
    private LinearLayout linear_somk;
    private LinearLayout linear_somk_color;
    private LinearLayout linear_tahgem;
    private LinearLayout linear_thell;
    private HashMap<String, Object> map = new HashMap<>();
    private HashMap<String, Object> map_A = new HashMap<>();
    private PointF mid = new PointF();
    private int mode = 0;
    private String name = BuildConfig.FLAVOR;
    private float newRot = 0.0f;
    private float oldDist = 1.0f;
    /* access modifiers changed from: private */
    public double paggg = 0.0d;
    private String path = BuildConfig.FLAVOR;
    private double position_number = 0.0d;
    private String s1000 = BuildConfig.FLAVOR;
    private String s4 = BuildConfig.FLAVOR;
    private SharedPreferences saf_d;
    /* access modifiers changed from: private */
    public SharedPreferences save;
    private SharedPreferences saveX;
    private float scale = 1.0f;
    private double scol = 0.0d;
    /* access modifiers changed from: private */
    public String size = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public Spinner spinner_back_color;
    /* access modifiers changed from: private */
    public Spinner spinner_font_color;
    private Spinner spinner_font_size;
    /* access modifiers changed from: private */
    public Spinner spinner_somk_color;
    private Spinner spinner_somk_size;
    private PointF start = new PointF();
    /* access modifiers changed from: private */
    public TextView text_Dell;
    /* access modifiers changed from: private */
    public TextView text_back_color;
    /* access modifiers changed from: private */
    public TextView text_font;
    /* access modifiers changed from: private */
    public TextView text_font_color;
    /* access modifiers changed from: private */
    public TextView text_in;
    /* access modifiers changed from: private */
    public TextView text_out;
    /* access modifiers changed from: private */
    public double text_photo_var = 0.0d;
    /* access modifiers changed from: private */
    public TextView text_shaql;
    /* access modifiers changed from: private */
    public TextView text_size;
    /* access modifiers changed from: private */
    public TextView text_somk_color;
    /* access modifiers changed from: private */
    public TextView text_zawaia;
    private TextView textview1;
    private TextView textview2;
    private TextView textview21;
    private TextView textview22;
    private TextView textview23;
    private TextView textview3;
    private TextView textview6;
    private TextView textview7;
    private TextView textview8;
    /* access modifiers changed from: private */
    public TimerTask timer_5;
    private double v = 0.0d;
    private double w = 0.0d;
    private float xCoOrdinate;
    private float yCoOrdinate;
    /* access modifiers changed from: private */
    public double z = 0.0d;

    public void _dialog_A1() {
    }

    public void _dialog_color_daeel() {
    }

    public void _dialog_daeel() {
    }

    public void _dialog_font() {
    }

    public void _dialog_size() {
    }

    public void _dialog_zooom() {
    }

    public void _zoom_libalry() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.enter_exzam);
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
        this.line_dddds = (LinearLayout) findViewById(R.id.line_dddds);
        this.linear_jgxhfhkxhhxhk = (LinearLayout) findViewById(R.id.linear_jgxhfhkxhhxhk);
        this.linear25 = (LinearLayout) findViewById(R.id.linear25);
        this.linear00 = (LinearLayout) findViewById(R.id.linear00);
        this.imageview16 = (ImageView) findViewById(R.id.imageview16);
        this.textview23 = (TextView) findViewById(R.id.textview23);
        this.textview21 = (TextView) findViewById(R.id.textview21);
        this.textview22 = (TextView) findViewById(R.id.textview22);
        this.imageview17 = (ImageView) findViewById(R.id.imageview17);
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.linear_pdf_0 = (LinearLayout) findViewById(R.id.linear_pdf_0);
        this.L6 = (LinearLayout) findViewById(R.id.L6);
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.linear_Top_one = (LinearLayout) findViewById(R.id.linear_Top_one);
        this.linear_Top_tow = (LinearLayout) findViewById(R.id.linear_Top_tow);
        this.linear_1200 = (LinearLayout) findViewById(R.id.linear_1200);
        this.linear_beack_color = (LinearLayout) findViewById(R.id.linear_beack_color);
        this.linear_somk = (LinearLayout) findViewById(R.id.linear_somk);
        this.linear_somk_color = (LinearLayout) findViewById(R.id.linear_somk_color);
        this.linear_Taqwess = (LinearLayout) findViewById(R.id.linear_Taqwess);
        this.linear_Tabaod = (LinearLayout) findViewById(R.id.linear_Tabaod);
        this.linear_g5 = (LinearLayout) findViewById(R.id.linear_g5);
        this.linear22 = (LinearLayout) findViewById(R.id.linear22);
        this.spinner_back_color = (Spinner) findViewById(R.id.spinner_back_color);
        this.imageview35 = (ImageView) findViewById(R.id.imageview35);
        this.text_back_color = (TextView) findViewById(R.id.text_back_color);
        this.spinner_somk_size = (Spinner) findViewById(R.id.spinner_somk_size);
        this.linear23 = (LinearLayout) findViewById(R.id.linear23);
        this.spinner_somk_color = (Spinner) findViewById(R.id.spinner_somk_color);
        this.imageview36 = (ImageView) findViewById(R.id.imageview36);
        this.text_somk_color = (TextView) findViewById(R.id.text_somk_color);
        this.imageview22 = (ImageView) findViewById(R.id.imageview22);
        this.text_zawaia = (TextView) findViewById(R.id.text_zawaia);
        this.imageview23 = (ImageView) findViewById(R.id.imageview23);
        this.text_out = (TextView) findViewById(R.id.text_out);
        this.imageview24 = (ImageView) findViewById(R.id.imageview24);
        this.text_in = (TextView) findViewById(R.id.text_in);
        this.linear12 = (LinearLayout) findViewById(R.id.linear12);
        this.linear13 = (LinearLayout) findViewById(R.id.linear13);
        this.linear_thell = (LinearLayout) findViewById(R.id.linear_thell);
        this.linear19 = (LinearLayout) findViewById(R.id.linear19);
        this.linear_font = (LinearLayout) findViewById(R.id.linear_font);
        this.linear21 = (LinearLayout) findViewById(R.id.linear21);
        this.spinner_font_color = (Spinner) findViewById(R.id.spinner_font_color);
        this.imageview33 = (ImageView) findViewById(R.id.imageview33);
        this.text_font_color = (TextView) findViewById(R.id.text_font_color);
        this.spinner_font_size = (Spinner) findViewById(R.id.spinner_font_size);
        this.imageview32 = (ImageView) findViewById(R.id.imageview32);
        this.text_Dell = (TextView) findViewById(R.id.text_Dell);
        this.imag_bold = (ImageView) findViewById(R.id.imag_bold);
        this.image_itlic = (ImageView) findViewById(R.id.image_itlic);
        this.image_und = (ImageView) findViewById(R.id.image_und);
        this.imageview30 = (ImageView) findViewById(R.id.imageview30);
        this.text_font = (TextView) findViewById(R.id.text_font);
        this.imageview2 = (ImageView) findViewById(R.id.imageview2);
        this.imageview39 = (ImageView) findViewById(R.id.imageview39);
        this.linear_tahgem = (LinearLayout) findViewById(R.id.linear_tahgem);
        this.linear14 = (LinearLayout) findViewById(R.id.linear14);
        this.image_enter_2 = (ImageView) findViewById(R.id.image_enter_2);
        this.imageview31 = (ImageView) findViewById(R.id.imageview31);
        this.text_size = (TextView) findViewById(R.id.text_size);
        this.image_Lift = (ImageView) findViewById(R.id.image_Lift);
        this.image_Center = (ImageView) findViewById(R.id.image_Center);
        this.image_Right = (ImageView) findViewById(R.id.image_Right);
        this.linear10 = (LinearLayout) findViewById(R.id.linear10);
        this.linear24 = (LinearLayout) findViewById(R.id.linear24);
        this.linear_image = (LinearLayout) findViewById(R.id.linear_image);
        this.linear27 = (LinearLayout) findViewById(R.id.linear27);
        this.edittext1 = (EditText) findViewById(R.id.edittext1);
        this.linear26 = (LinearLayout) findViewById(R.id.linear26);
        this.L900 = (LinearLayout) findViewById(R.id.L900);
        this.imageview41 = (ImageView) findViewById(R.id.imageview41);
        this.text_shaql = (TextView) findViewById(R.id.text_shaql);
        this.linear28 = (LinearLayout) findViewById(R.id.linear28);
        this.linear29 = (LinearLayout) findViewById(R.id.linear29);
        this.linear30 = (LinearLayout) findViewById(R.id.linear30);
        this.linear33 = (LinearLayout) findViewById(R.id.linear33);
        this.linear35 = (LinearLayout) findViewById(R.id.linear35);
        this.linear36 = (LinearLayout) findViewById(R.id.linear36);
        this.imageview43 = (ImageView) findViewById(R.id.imageview43);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.imageview44 = (ImageView) findViewById(R.id.imageview44);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.imageview45 = (ImageView) findViewById(R.id.imageview45);
        this.textview3 = (TextView) findViewById(R.id.textview3);
        this.imageview48 = (ImageView) findViewById(R.id.imageview48);
        this.textview6 = (TextView) findViewById(R.id.textview6);
        this.imageview49 = (ImageView) findViewById(R.id.imageview49);
        this.textview7 = (TextView) findViewById(R.id.textview7);
        this.imageview50 = (ImageView) findViewById(R.id.imageview50);
        this.textview8 = (TextView) findViewById(R.id.textview8);
        this.save = getSharedPreferences("save", 0);
        this.saf_d = getSharedPreferences("saf_d", 0);
        this.dialog_p = new AlertDialog.Builder(this);
        this.saveX = getSharedPreferences("saveX", 0);
        this.image_A.setType("image/*");
        this.image_A.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        this.dialog_6 = new AlertDialog.Builder(this);
        this._file_camira = FileUtil.createNewPictureFile(getApplicationContext());
        if (Build.VERSION.SDK_INT >= 24) {
            Context applicationContext = getApplicationContext();
            uri = FileProvider.getUriForFile(applicationContext, String.valueOf(getApplicationContext().getPackageName()) + ".provider", this._file_camira);
        } else {
            uri = Uri.fromFile(this._file_camira);
        }
        this.camira.putExtra("output", uri);
        this.camira.addFlags(1);
        this.codee = getSharedPreferences("codee", 0);
        this.imageview16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._go_beeak();
            }
        });
        this.textview23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._dialog_tols1();
            }
        });
        this.textview21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._dialog_tols2();
            }
        });
        this.textview22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._dialog_size_swmk();
            }
        });
        this.imageview17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._save_function();
                Intent intent = new Intent();
                intent.setClass(EnterExzamActivity.this.getApplicationContext(), ExzamViewActivity.class);
                intent.putExtra(DatabaseHelper.COL_0, EnterExzamActivity.this.ID);
                intent.putExtra("page", String.valueOf((long) EnterExzamActivity.this.paggg));
                intent.putExtra("T", "1");
                EnterExzamActivity.this.startActivity(intent);
                EnterExzamActivity.this.finish();
                SketchwareUtil.showMessage(EnterExzamActivity.this.getApplicationContext(), "تم الحفظ");
            }
        });
        this.imageview2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._save_function();
                Intent intent = new Intent();
                intent.setClass(EnterExzamActivity.this.getApplicationContext(), ExzamViewActivity.class);
                intent.putExtra(DatabaseHelper.COL_0, EnterExzamActivity.this.ID);
                intent.putExtra("page", String.valueOf((long) EnterExzamActivity.this.paggg));
                intent.putExtra("T", "1");
                EnterExzamActivity.this.startActivity(intent);
                EnterExzamActivity.this.finish();
            }
        });
        this.imageview39.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._dialog_nomatheg();
            }
        });
        this.image_enter_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (EnterExzamActivity.this.Type.equals("1")) {
                    EnterExzamActivity.this.dioalog_zoom();
                }
            }
        });
        this.linear24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this.edittext1.setEnabled(true);
                EnterExzamActivity.this.edittext1.requestFocus();
                ((InputMethodManager) EnterExzamActivity.this.getSystemService("input_method")).showSoftInput(EnterExzamActivity.this.edittext1, 1);
                EnterExzamActivity.this.edittext1.setSelection(EnterExzamActivity.this.edittext1.getText().toString().length(), EnterExzamActivity.this.edittext1.getText().toString().length());
            }
        });
        this.edittext1.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                EnterExzamActivity.this.Text = charSequence.toString();
            }
        });
        this.linear28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity.startActivityForResult(enterExzamActivity.camira, 102);
            }
        });
        this.linear29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity.startActivityForResult(enterExzamActivity.image_A, 101);
            }
        });
        this.linear30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._dialog_nomatheg();
            }
        });
        this.linear33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._dialog_almarageA();
            }
        });
        this.linear35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._go_beeak();
            }
        });
        this.linear36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._save_function();
                Intent intent = new Intent();
                intent.setClass(EnterExzamActivity.this.getApplicationContext(), ExzamViewActivity.class);
                intent.putExtra(DatabaseHelper.COL_0, EnterExzamActivity.this.ID);
                intent.putExtra("page", String.valueOf((long) EnterExzamActivity.this.paggg));
                intent.putExtra("T", "1");
                EnterExzamActivity.this.startActivity(intent);
                EnterExzamActivity.this.finish();
            }
        });
    }

    private void initializeLogic() {
        this.linear24.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 0, -1118482, -1));
        this.linear27.setBackgroundColor(-1);
        this.linear28.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(4, 2, -6381922, -1));
        this.linear29.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(4, 2, -6381922, -1));
        this.linear30.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(4, 2, -6381922, -1));
        this.linear33.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(4, 2, -6381922, -1));
        this.linear35.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(4, 2, -6381922, -1));
        this.linear36.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(4, 2, -6381922, -1));
        try {
            if (this.codee.getString("Cod", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
            this.textview1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview6.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview7.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.textview8.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        } catch (Exception unused) {
        }
        this.H = 500.0d;
        this.W = 500.0d;
        this.L900.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                LinearLayout access$10 = EnterExzamActivity.this.L900;
                access$10.bringToFront();
                EnterExzamActivity.this.viewTransformation(access$10, motionEvent, 0, 0, 0);
                return true;
            }
        });
        _ss();
        this.textview22.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -2236963, -117901064));
        this.textview23.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -2236963, -117901064));
        this.textview21.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -2236963, -117901064));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 101) {
            if (i == 102 && i2 == -1) {
                String absolutePath = this._file_camira.getAbsolutePath();
                this.path = absolutePath;
                try {
                    SketchwareUtil.CropImage(this, absolutePath, 150);
                } catch (Exception unused) {
                }
                this.imageview41.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(this.path, 1024, 1024));
            }
        } else if (i2 == -1) {
            ArrayList arrayList = new ArrayList();
            if (intent != null) {
                if (intent.getClipData() != null) {
                    for (int i3 = 0; i3 < intent.getClipData().getItemCount(); i3++) {
                        arrayList.add(FileUtil.convertUriToFilePath(getApplicationContext(), intent.getClipData().getItemAt(i3).getUri()));
                    }
                } else {
                    arrayList.add(FileUtil.convertUriToFilePath(getApplicationContext(), intent.getData()));
                }
            }
            String str = (String) arrayList.get(0);
            this.path = str;
            try {
                SketchwareUtil.CropImage(this, str, 150);
            } catch (Exception unused2) {
            }
            this.imageview41.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(this.path, 1024, 1024));
        }
    }

    public void onBackPressed() {
        _save_function();
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), ExzamViewActivity.class);
        intent.putExtra(DatabaseHelper.COL_0, this.ID);
        intent.putExtra("page", String.valueOf((long) this.paggg));
        intent.putExtra("T", "1");
        startActivity(intent);
        finish();
    }

    public void _caing_image() {
        this.image_Lift.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this.image_Lift.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, -1118482, -6982195));
                EnterExzamActivity.this.image_Center.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, 0, 0));
                EnterExzamActivity.this.image_Right.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, 0, 0));
                EnterExzamActivity.this.edittext1.setGravity(19);
                EnterExzamActivity.this.T_W = "2";
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity._set_TextView(enterExzamActivity.edittext1);
            }
        });
        this.image_Center.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this.image_Center.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, -1118482, -6982195));
                EnterExzamActivity.this.image_Lift.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, 0, 0));
                EnterExzamActivity.this.image_Right.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, 0, 0));
                EnterExzamActivity.this.edittext1.setGravity(17);
                EnterExzamActivity.this.T_W = "3";
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity._set_TextView(enterExzamActivity.edittext1);
            }
        });
        this.image_Right.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this.image_Right.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, -1118482, -6982195));
                EnterExzamActivity.this.image_Center.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, 0, 0));
                EnterExzamActivity.this.image_Lift.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(4, 2, 0, 0));
                EnterExzamActivity.this.edittext1.setGravity(21);
                EnterExzamActivity.this.T_W = "1";
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity._set_TextView(enterExzamActivity.edittext1);
            }
        });
        this.imag_bold.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (EnterExzamActivity.this.F_bold == 0.0d) {
                    EnterExzamActivity.this.F_bold = 1.0d;
                    EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                    enterExzamActivity.F_stay = enterExzamActivity.F_stay + 1.0d;
                    EnterExzamActivity.this.imag_bold.setBackground(new GradientDrawable() {
                        public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                            setCornerRadius((float) i);
                            setStroke(i2, i3);
                            setColor(i4);
                            return this;
                        }
                    }.getIns(4, 2, -2039584, -6982195));
                } else {
                    EnterExzamActivity.this.F_bold = 0.0d;
                    EnterExzamActivity enterExzamActivity2 = EnterExzamActivity.this;
                    enterExzamActivity2.F_stay = enterExzamActivity2.F_stay - 1.0d;
                    EnterExzamActivity.this.imag_bold.setBackground(new GradientDrawable() {
                        public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                            setCornerRadius((float) i);
                            setStroke(i2, i3);
                            setColor(i4);
                            return this;
                        }
                    }.getIns(4, 2, 0, 0));
                }
                EnterExzamActivity enterExzamActivity3 = EnterExzamActivity.this;
                enterExzamActivity3.Font_Stayl = String.valueOf((long) enterExzamActivity3.F_stay);
                EnterExzamActivity enterExzamActivity4 = EnterExzamActivity.this;
                enterExzamActivity4._set_TextView(enterExzamActivity4.edittext1);
            }
        });
        this.image_itlic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (EnterExzamActivity.this.F_itlic == 0.0d) {
                    EnterExzamActivity.this.F_itlic = 2.0d;
                    EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                    enterExzamActivity.F_stay = enterExzamActivity.F_stay + 2.0d;
                    EnterExzamActivity.this.image_itlic.setBackground(new GradientDrawable() {
                        public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                            setCornerRadius((float) i);
                            setStroke(i2, i3);
                            setColor(i4);
                            return this;
                        }
                    }.getIns(4, 2, -1118482, -6982195));
                } else {
                    EnterExzamActivity.this.F_itlic = 0.0d;
                    EnterExzamActivity enterExzamActivity2 = EnterExzamActivity.this;
                    enterExzamActivity2.F_stay = enterExzamActivity2.F_stay - 2.0d;
                    EnterExzamActivity.this.image_itlic.setBackground(new GradientDrawable() {
                        public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                            setCornerRadius((float) i);
                            setStroke(i2, i3);
                            setColor(i4);
                            return this;
                        }
                    }.getIns(4, 2, 0, 0));
                }
                EnterExzamActivity enterExzamActivity3 = EnterExzamActivity.this;
                enterExzamActivity3.Font_Stayl = String.valueOf((long) enterExzamActivity3.F_stay);
                EnterExzamActivity enterExzamActivity4 = EnterExzamActivity.this;
                enterExzamActivity4._set_TextView(enterExzamActivity4.edittext1);
            }
        });
        this.image_und.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (EnterExzamActivity.this.F_und == 0.0d) {
                    EnterExzamActivity.this.F_und = 1.0d;
                    EnterExzamActivity.this.image_und.setBackground(new GradientDrawable() {
                        public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                            setCornerRadius((float) i);
                            setStroke(i2, i3);
                            setColor(i4);
                            return this;
                        }
                    }.getIns(4, 2, -1118482, -6982195));
                } else {
                    EnterExzamActivity.this.F_und = 0.0d;
                    EnterExzamActivity.this.image_und.setBackground(new GradientDrawable() {
                        public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                            setCornerRadius((float) i);
                            setStroke(i2, i3);
                            setColor(i4);
                            return this;
                        }
                    }.getIns(4, 2, 0, 0));
                }
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity._set_TextView(enterExzamActivity.edittext1);
            }
        });
    }

    public void _saql_90() {
        this.linear_beack_color.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear_somk.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear_somk_color.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear_Taqwess.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear_Tabaod.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear_g5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear12.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear13.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear14.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear_thell.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear_font.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear_tahgem.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
        this.linear19.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, -10395295, -1));
    }

    public void _start_0() {
        this.Color_list = (ArrayList) new Gson().fromJson("[\"#00000000\",\"#FFFFFFFF\",\"#FFFF00FF\",\"#FF0000FF\",\"#FF00FFFF\",\"#FF00FF00\",\"#FFFFFF00\",\"#FFFF0000\",\"#FF000000\",\"#FF18AD79\",\"#FFF44336\",\"#FFFBC02D\",\"#FF4CAF50\",\"#FF5CB722\",\"#FF651FFF\",\"#FF6200EA\",\"#FF00CCFF\",\"#FF29B6F6\",\"#FFC62828\",\"#FFD50000\",\"#FFFDD835\",\"#FFFFEB3B\",\"#02B875\",\"#FF00C853\",\"#FF4600F4\",\"#FF6200EE\",\"#FF00B0FF\",\"#FF03A9F4\",\"#2962FF\",\"#FF0276FC\",\"#e92467\",\"#FFD81B60\",\"#FFFF9800\",\"#FFFFAB00\",\"#FF00E676\",\"#FF64DD17\",\"#FF7B1FA2\",\"#FF6A1B9A\",\"#FF2979FF\",\"#FF2962FF\",\"#FFFF1744\",\"#FFF50057\",\"#FFF9A825\",\"#FFFFA00A\",\"#FF66BB6A\",\"#FF7CB342\",\"#FFA81EA9\",\"#FFB72ED4\",\"#FFEC407A\",\"#FFFF4081\",\"#FF1E88E5\",\"#FF0091EA\",\"#FFB71C1C\",\"#9E0000\",\"#FF69F0AE\",\"#FF58F4CD\",\"#FF00BFA5\",\"#FF558B2F\",\"#FFEF5350\",\"#FFFF6D00\",\"#FF039BE5\",\"#2FAFFF\",\"#A20025\",\"#FFAD1457\",\"#FF18FFFF\",\"#FF03DAC5\",\"#FF26A69A\",\"#FF388E3C\",\"#FF2B9FC2\",\"#FF0097A7\",\"#FFC2185B\",\"#850303\",\"#FF0288D1\",\"#FF42A5F5\",\"#FFD32F2F\",\"#FFBF360C\",\"#2196F3\",\"#FF2196F3\",\"#FF00B8D4\",\"#FF2BADCA\",\"#FFD84315\",\"#E74C3C\",\"#FF3F51B5\",\"#FF303F9F\",\"#FFFF5722\",\"#D35400\",\"#FF0D47A1\",\"#FF4527A0\",\"#FF827717\",\"#FF9E9D24\",\"#FF4FC3F7\",\"#FF4DD0E1\",\"#FFF57F17\",\"#FFFF8A80\",\"#FF1976D2\",\"#FF1565C0\",\"#FFC0CA33\",\"#CAC319\",\"#808200\",\"#FF689F38\",\"#5399BB\",\"#FF00BCD4\",\"#FFEF6C00\",\"#FFF57C00\",\"#FF3949AB\",\"#FF0E4BAD\",\"#FF9CCC65\",\"#FF43A047\",\"#FFA336CD\",\"#FF9C27B0\",\"#FF00ACC1\",\"#FF80DEEA\",\"#FFB31C9E\",\"#FF1A237E\",\"#FFE91E63\",\"#FFFF6161\",\"#FFF5F5F5\",\"#FFF08FFF\",\"#FFAB47BC\",\"#FF8E24AA\",\"#FF80CBC4\",\"#4083B5\",\"#FFF48FB1\",\"#FFF06292\",\"#FF283593\",\"#FF3700B3\",\"#FFFFECB3\",\"#FFFDFCC5\",\"#FF2E7D32\",\"#FF00897B\",\"#FFFF80AB\",\"#FFFFA2D5\",\"#583358\",\"#FF5D4037\",\"#FF7E57C2\",\"#6726B2\",\"#FF673AB7\",\"#FFAFB42B\",\"#FF00796B\",\"#FF00695C\",\"#FFCE93D8\",\"#FFEA80FC\",\"#FF212121\",\"#FF000080\",\"#FFBB86FC\",\"#9B59B6\",\"#FF9E9E9E\",\"#FFA1887F\",\"#556B2F\",\"#FF71619A\",\"#FF0277BD\",\"#FF5C6BC0\",\"#FF9575CD\",\"#FF8C9EFF\",\"#FFBBDEFB\",\"#FFBDBDBD\",\"#FF880E4F\",\"#FF616161\",\"#FF1B5E20\",\"#FF33691E\",\"#008A00\",\"#FF512DA8\",\"#FF5E35B1\",\"#FA000440\",\"#7B7B7B\",\"#FF78909C\",\"#FF00838F\",\"#FF424242\"]", new TypeToken<ArrayList<String>>() {
        }.getType());
        this.Colour2.clear();
        this.List_size.clear();
        this.List_font_somq.clear();
        for (int i = 0; i < 121; i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("na", BuildConfig.FLAVOR);
            this.List_size.add(hashMap);
        }
        for (int i2 = 0; i2 < 20; i2++) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("na", BuildConfig.FLAVOR);
            this.List_font_somq.add(hashMap2);
        }
        for (int i3 = 0; i3 < this.Color_list.size(); i3++) {
            try {
                HashMap<String, Object> hashMap3 = new HashMap<>();
                this.map = hashMap3;
                hashMap3.put("1", this.Color_list.get((int) this.v));
                double d2 = this.v + 1.0d;
                this.v = d2;
                this.map.put("2", this.Color_list.get((int) d2));
                double d3 = this.v + 1.0d;
                this.v = d3;
                this.map.put("3", this.Color_list.get((int) d3));
                double d4 = this.v + 1.0d;
                this.v = d4;
                this.map.put("4", this.Color_list.get((int) d4));
                double d5 = this.v + 1.0d;
                this.v = d5;
                this.map.put("5", this.Color_list.get((int) d5));
                double d6 = this.v + 1.0d;
                this.v = d6;
                this.map.put("6", this.Color_list.get((int) d6));
                double d7 = this.v + 1.0d;
                this.v = d7;
                this.map.put("7", this.Color_list.get((int) d7));
                this.v += 1.0d;
                this.Colour2.add(this.map);
            } catch (Exception unused) {
            }
        }
        this.spinner_font_size.setAdapter(new Spinner_font_sizeAdapter(this.List_size));
        this.spinner_somk_size.setAdapter(new Spinner_somk_sizeAdapter(this.List_font_somq));
        this.spinner_font_color.setAdapter(new Spinner_font_colorAdapter(this.Colour2));
        this.spinner_back_color.setAdapter(new Spinner_back_colorAdapter(this.Colour2));
        this.spinner_somk_color.setAdapter(new Spinner_somk_colorAdapter(this.Colour2));
    }

    public void _On_CLiCK() {
        _caing_image();
        this.linear_Taqwess.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity.Dialog_taqwes("تقوس ", enterExzamActivity.text_zawaia, 2);
            }
        });
        this.linear_Tabaod.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity.Dialog_taqwes("التباعد الخارجي ", enterExzamActivity.text_out, 1);
            }
        });
        this.linear_g5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity.Dialog_taqwes("التباعد الداخلي ", enterExzamActivity.text_in, 0);
            }
        });
        this.linear23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    EnterExzamActivity.this.spinner_somk_color.performClick();
                } catch (Exception unused) {
                }
            }
        });
        this.linear22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    EnterExzamActivity.this.spinner_back_color.performClick();
                } catch (Exception unused) {
                }
            }
        });
        this.linear12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    EnterExzamActivity.this.spinner_font_color.performClick();
                } catch (Exception unused) {
                }
            }
        });
        this.linear_font.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity.Font_1(enterExzamActivity.text_font);
            }
        });
        this.linear_thell.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity.dialog_Th(enterExzamActivity.text_Dell);
            }
        });
        this.linear_tahgem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity.Size_WHW(enterExzamActivity.text_size);
            }
        });
        this.spinner_somk_size.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                EnterExzamActivity.this.Etar = (double) i;
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity._set_TextView(enterExzamActivity.edittext1);
            }
        });
        this.spinner_font_size.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                EnterExzamActivity.this.Font_size = (double) i;
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity._set_TextView(enterExzamActivity.edittext1);
            }
        });
    }

    public String Spliter(String str, int i) {
        return str.split(",")[i];
    }

    public void _set_TextView(final TextView textView) {
        AnonymousClass59 r0 = new TimerTask() {
            public void run() {
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                final TextView textView = textView;
                enterExzamActivity.runOnUiThread(new Runnable() {
                    /* JADX WARNING: Can't fix incorrect switch cases order */
                    /* JADX WARNING: Can't wrap try/catch for region: R(11:2|3|4|5|6|7|8|10|11|22|25) */
                    /* JADX WARNING: Failed to process nested try/catch */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x003e */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x00ba */
                    /* JADX WARNING: Removed duplicated region for block: B:12:0x010e  */
                    /* JADX WARNING: Removed duplicated region for block: B:15:0x011d  */
                    /* JADX WARNING: Removed duplicated region for block: B:18:0x012e  */
                    /* JADX WARNING: Removed duplicated region for block: B:21:0x013d A[FALL_THROUGH] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                            r7 = this;
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r0 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r0 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this
                            java.lang.String r0 = r0.Type
                            java.lang.String r1 = "1"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L_0x0152
                            android.widget.TextView r0 = r2
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r2 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r2 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this
                            double r2 = r2.Font_size
                            int r2 = (int) r2
                            float r2 = (float) r2
                            r0.setTextSize(r2)
                            android.widget.TextView r0 = r2     // Catch:{ Exception -> 0x003e }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r2 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this     // Catch:{ Exception -> 0x003e }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r2 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this     // Catch:{ Exception -> 0x003e }
                            android.widget.TextView r2 = r2.text_font_color     // Catch:{ Exception -> 0x003e }
                            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x003e }
                            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x003e }
                            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ Exception -> 0x003e }
                            r0.setTextColor(r2)     // Catch:{ Exception -> 0x003e }
                        L_0x003e:
                            android.widget.TextView r0 = r2     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r2 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r2 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r3 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r3 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this     // Catch:{ Exception -> 0x00ba }
                            android.widget.TextView r3 = r3.text_Dell     // Catch:{ Exception -> 0x00ba }
                            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x00ba }
                            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00ba }
                            r4 = 0
                            java.lang.String r2 = r2.Spliter(r3, r4)     // Catch:{ Exception -> 0x00ba }
                            double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x00ba }
                            int r2 = (int) r2     // Catch:{ Exception -> 0x00ba }
                            float r2 = (float) r2     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r3 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r3 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r4 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r4 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this     // Catch:{ Exception -> 0x00ba }
                            android.widget.TextView r4 = r4.text_Dell     // Catch:{ Exception -> 0x00ba }
                            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x00ba }
                            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00ba }
                            r5 = 1
                            java.lang.String r3 = r3.Spliter(r4, r5)     // Catch:{ Exception -> 0x00ba }
                            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x00ba }
                            int r3 = (int) r3     // Catch:{ Exception -> 0x00ba }
                            float r3 = (float) r3     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r4 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r4 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r5 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r5 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this     // Catch:{ Exception -> 0x00ba }
                            android.widget.TextView r5 = r5.text_Dell     // Catch:{ Exception -> 0x00ba }
                            java.lang.CharSequence r5 = r5.getText()     // Catch:{ Exception -> 0x00ba }
                            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00ba }
                            r6 = 2
                            java.lang.String r4 = r4.Spliter(r5, r6)     // Catch:{ Exception -> 0x00ba }
                            double r4 = java.lang.Double.parseDouble(r4)     // Catch:{ Exception -> 0x00ba }
                            int r4 = (int) r4     // Catch:{ Exception -> 0x00ba }
                            float r4 = (float) r4     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r5 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this     // Catch:{ Exception -> 0x00ba }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r5 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this     // Catch:{ Exception -> 0x00ba }
                            java.lang.String r5 = r5.abC_color     // Catch:{ Exception -> 0x00ba }
                            int r5 = android.graphics.Color.parseColor(r5)     // Catch:{ Exception -> 0x00ba }
                            r0.setShadowLayer(r2, r3, r4, r5)     // Catch:{ Exception -> 0x00ba }
                        L_0x00ba:
                            android.widget.TextView r0 = r2     // Catch:{ Exception -> 0x00f9 }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r2 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this     // Catch:{ Exception -> 0x00f9 }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r2 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this     // Catch:{ Exception -> 0x00f9 }
                            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ Exception -> 0x00f9 }
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f9 }
                            java.lang.String r4 = "fonts/"
                            r3.<init>(r4)     // Catch:{ Exception -> 0x00f9 }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r4 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this     // Catch:{ Exception -> 0x00f9 }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r4 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this     // Catch:{ Exception -> 0x00f9 }
                            android.widget.TextView r4 = r4.text_font     // Catch:{ Exception -> 0x00f9 }
                            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x00f9 }
                            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00f9 }
                            r3.append(r4)     // Catch:{ Exception -> 0x00f9 }
                            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00f9 }
                            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r3)     // Catch:{ Exception -> 0x00f9 }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r3 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this     // Catch:{ Exception -> 0x00f9 }
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r3 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this     // Catch:{ Exception -> 0x00f9 }
                            double r3 = r3.F_stay     // Catch:{ Exception -> 0x00f9 }
                            int r3 = (int) r3     // Catch:{ Exception -> 0x00f9 }
                            r0.setTypeface(r2, r3)     // Catch:{ Exception -> 0x00f9 }
                            goto L_0x00fa
                        L_0x00f9:
                        L_0x00fa:
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r0 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r0 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this
                            java.lang.String r0 = r0.T_W
                            int r2 = r0.hashCode()
                            r3 = 49
                            switch(r2) {
                                case 49: goto L_0x012e;
                                case 50: goto L_0x011d;
                                case 51: goto L_0x010e;
                                default: goto L_0x010d;
                            }
                        L_0x010d:
                            goto L_0x013d
                        L_0x010e:
                            java.lang.String r1 = "3"
                            boolean r0 = r0.equals(r1)
                            if (r0 != 0) goto L_0x0117
                            goto L_0x013d
                        L_0x0117:
                            android.widget.TextView r0 = r2
                            r0.setGravity(r3)
                            goto L_0x0142
                        L_0x011d:
                            java.lang.String r1 = "2"
                            boolean r0 = r0.equals(r1)
                            if (r0 != 0) goto L_0x0126
                            goto L_0x013d
                        L_0x0126:
                            android.widget.TextView r0 = r2
                            r1 = 51
                            r0.setGravity(r1)
                            goto L_0x0142
                        L_0x012e:
                            boolean r0 = r0.equals(r1)
                            if (r0 != 0) goto L_0x0135
                            goto L_0x013d
                        L_0x0135:
                            android.widget.TextView r0 = r2
                            r1 = 53
                            r0.setGravity(r1)
                            goto L_0x0142
                        L_0x013d:
                            android.widget.TextView r0 = r2
                            r0.setGravity(r3)
                        L_0x0142:
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r0 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r1 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this
                            android.widget.TextView r2 = r2
                            r3 = 0
                            r5 = 0
                            r1._set_View(r2, r3, r5)
                            goto L_0x0169
                        L_0x0152:
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r0 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r1 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$59 r0 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.this
                            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity r0 = com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.this
                            android.widget.LinearLayout r2 = r0.L900
                            r3 = 0
                            r5 = 0
                            r1._set_View(r2, r3, r5)
                        L_0x0169:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.AnonymousClass59.AnonymousClass1.run():void");
                    }
                });
            }
        };
        this.timer_5 = r0;
        this._timer.schedule(r0, 20);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x05cc  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x05e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Dialog_taqwes(java.lang.String r39, android.widget.TextView r40, int r41) {
        /*
            r38 = this;
            r8 = r38
            java.lang.String r0 = "fonts/font.ttf"
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r8)
            android.app.AlertDialog r9 = r1.create()
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            android.content.Context r1 = r38.getApplicationContext()
            r10.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r11 = -1
            r1.<init>(r11, r11)
            r10.setLayoutParams(r1)
            r12 = 1
            r10.setOrientation(r12)
            r1 = 17
            r10.setGravity(r1)
            java.lang.String r2 = "0,0,0,0"
            r8.dd = r2
            java.lang.CharSequence r2 = r40.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = ","
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0046
            java.lang.CharSequence r2 = r40.getText()
            java.lang.String r2 = r2.toString()
            r8.dd = r2
        L_0x0046:
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            android.content.Context r2 = r38.getApplicationContext()
            r13.<init>(r2)
            r13.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 0
            r2.<init>(r11, r11, r3)
            r13.setLayoutParams(r2)
            r13.setBackgroundColor(r11)
            r13.setGravity(r1)
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r4 = r38.getApplicationContext()
            r2.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 50
            r4.<init>(r11, r5, r3)
            r2.setLayoutParams(r4)
            r4 = -657931(0xfffffffffff5f5f5, float:NaN)
            r2.setBackgroundColor(r4)
            r5 = 1098907648(0x41800000, float:16.0)
            r2.setTextSize(r5)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setTextColor(r6)
            r2.setGravity(r1)
            r13.addView(r2)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            android.content.Context r14 = r38.getApplicationContext()
            r7.<init>(r14)
            r7.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r15 = 500(0x1f4, float:7.0E-43)
            r14.<init>(r11, r15, r3)
            r7.setLayoutParams(r14)
            r14 = 8
            r7.setPadding(r14, r14, r14, r14)
            r7.setGravity(r1)
            r13.addView(r7)
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            android.content.Context r5 = r38.getApplicationContext()
            r15.<init>(r5)
            r15.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r12 = -2
            r5.<init>(r12, r12, r3)
            r15.setLayoutParams(r5)
            r15.setPadding(r14, r14, r14, r14)
            r15.setGravity(r1)
            r7.addView(r15)
            java.lang.String r5 = r8.Type
            java.lang.String r14 = "2"
            boolean r5 = r5.equals(r14)
            if (r5 != 0) goto L_0x00da
            java.lang.String r5 = r8.Type
            java.lang.String r14 = "1"
            r5.equals(r14)
        L_0x00da:
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r14 = r38.getApplicationContext()
            r5.<init>(r14)
            r14 = 0
            r5.setOrientation(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r12 = 65
            r14.<init>(r11, r12, r3)
            r5.setLayoutParams(r14)
            r5.setBackgroundColor(r11)
            r5.setGravity(r1)
            r13.addView(r5)
            android.widget.TextView r12 = new android.widget.TextView
            android.content.Context r14 = r38.getApplicationContext()
            r12.<init>(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r1 = 52
            r14.<init>(r1, r11, r3)
            r12.setLayoutParams(r14)
            r12.setBackgroundColor(r4)
            java.lang.String r1 = "0"
            r12.setText(r1)
            r14 = 1094713344(0x41400000, float:12.0)
            r12.setTextSize(r14)
            r12.setTextColor(r6)
            r6 = 17
            r12.setGravity(r6)
            r5.addView(r12)
            android.widget.SeekBar r6 = new android.widget.SeekBar
            android.content.Context r14 = r38.getApplicationContext()
            r6.<init>(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r4 = 175(0xaf, float:2.45E-43)
            r3 = 1065353216(0x3f800000, float:1.0)
            r14.<init>(r4, r11, r3)
            r6.setLayoutParams(r14)
            r14 = 4
            r6.setPadding(r14, r14, r14, r14)
            r5.addView(r6)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r4 = r38.getApplicationContext()
            r3.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r23 = r10
            r10 = 0
            r14 = -2
            r4.<init>(r14, r11, r10)
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
            r5.addView(r3)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            android.content.Context r14 = r38.getApplicationContext()
            r10.<init>(r14)
            r14 = 0
            r10.setOrientation(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r4 = 70
            r24 = r9
            r9 = 0
            r14.<init>(r11, r4, r9)
            r10.setLayoutParams(r14)
            r10.setBackgroundColor(r11)
            r14 = 17
            r10.setGravity(r14)
            r13.addView(r10)
            android.widget.TextView r14 = new android.widget.TextView
            android.content.Context r4 = r38.getApplicationContext()
            r14.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r25 = r15
            r15 = 35
            r4.<init>(r15, r11, r9)
            r14.setLayoutParams(r4)
            r4 = -657931(0xfffffffffff5f5f5, float:NaN)
            r14.setBackgroundColor(r4)
            r14.setText(r1)
            r4 = 1092616192(0x41200000, float:10.0)
            r14.setTextSize(r4)
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r14.setTextColor(r9)
            r9 = 17
            r14.setGravity(r9)
            r10.addView(r14)
            android.widget.SeekBar r9 = new android.widget.SeekBar
            android.content.Context r4 = r38.getApplicationContext()
            r9.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r27 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r15 = 175(0xaf, float:2.45E-43)
            r4.<init>(r15, r11, r6)
            r9.setLayoutParams(r4)
            r4 = 4
            r9.setPadding(r4, r4, r4, r4)
            r10.addView(r9)
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r6 = r38.getApplicationContext()
            r4.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r28 = r9
            r9 = 0
            r15 = 70
            r6.<init>(r15, r11, r9)
            r4.setLayoutParams(r6)
            r6 = -657931(0xfffffffffff5f5f5, float:NaN)
            r4.setBackgroundColor(r6)
            java.lang.String r6 = "Left"
            r4.setText(r6)
            r6 = 1094713344(0x41400000, float:12.0)
            r4.setTextSize(r6)
            r6 = -13172557(0xffffffffff3700b3, float:-2.4325235E38)
            r4.setTextColor(r6)
            r9 = 17
            r4.setGravity(r9)
            r10.addView(r4)
            android.widget.TextView r9 = new android.widget.TextView
            android.content.Context r15 = r38.getApplicationContext()
            r9.<init>(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r29 = r0
            r0 = 0
            r6 = 35
            r15.<init>(r6, r11, r0)
            r9.setLayoutParams(r15)
            r0 = -657931(0xfffffffffff5f5f5, float:NaN)
            r9.setBackgroundColor(r0)
            r9.setText(r1)
            r0 = 1092616192(0x41200000, float:10.0)
            r9.setTextSize(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.setTextColor(r0)
            r0 = 17
            r9.setGravity(r0)
            r10.addView(r9)
            android.widget.SeekBar r15 = new android.widget.SeekBar
            android.content.Context r0 = r38.getApplicationContext()
            r15.<init>(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r30 = r7
            r6 = 175(0xaf, float:2.45E-43)
            r7 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r6, r11, r7)
            r15.setLayoutParams(r0)
            r0 = 4
            r15.setPadding(r0, r0, r0, r0)
            r10.addView(r15)
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r6 = r38.getApplicationContext()
            r0.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r31 = r15
            r7 = 70
            r15 = 0
            r6.<init>(r7, r11, r15)
            r0.setLayoutParams(r6)
            r6 = -657931(0xfffffffffff5f5f5, float:NaN)
            r0.setBackgroundColor(r6)
            java.lang.String r6 = "Up"
            r0.setText(r6)
            r6 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r6)
            r6 = -13172557(0xffffffffff3700b3, float:-2.4325235E38)
            r0.setTextColor(r6)
            r6 = 17
            r0.setGravity(r6)
            r10.addView(r0)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            android.content.Context r15 = r38.getApplicationContext()
            r7.<init>(r15)
            r15 = 0
            r7.setOrientation(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r6 = 70
            r8 = 0
            r15.<init>(r11, r6, r8)
            r7.setLayoutParams(r15)
            r7.setBackgroundColor(r11)
            r6 = 17
            r7.setGravity(r6)
            r13.addView(r7)
            android.widget.TextView r15 = new android.widget.TextView
            android.content.Context r6 = r38.getApplicationContext()
            r15.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r32 = r4
            r4 = 35
            r6.<init>(r4, r11, r8)
            r15.setLayoutParams(r6)
            r4 = -657931(0xfffffffffff5f5f5, float:NaN)
            r15.setBackgroundColor(r4)
            r15.setText(r1)
            r4 = 1092616192(0x41200000, float:10.0)
            r15.setTextSize(r4)
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r15.setTextColor(r4)
            r4 = 17
            r15.setGravity(r4)
            r7.addView(r15)
            android.widget.SeekBar r8 = new android.widget.SeekBar
            android.content.Context r4 = r38.getApplicationContext()
            r8.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r33 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 175(0xaf, float:2.45E-43)
            r4.<init>(r6, r11, r3)
            r8.setLayoutParams(r4)
            r3 = 4
            r8.setPadding(r3, r3, r3, r3)
            r7.addView(r8)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r4 = r38.getApplicationContext()
            r3.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r34 = r8
            r6 = 70
            r8 = 0
            r4.<init>(r6, r11, r8)
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
            r7.addView(r3)
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r4 = r38.getApplicationContext()
            r8.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r26 = r3
            r3 = 0
            r6 = 35
            r4.<init>(r6, r11, r3)
            r8.setLayoutParams(r4)
            r3 = -657931(0xfffffffffff5f5f5, float:NaN)
            r8.setBackgroundColor(r3)
            r8.setText(r1)
            r1 = 1092616192(0x41200000, float:10.0)
            r8.setTextSize(r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r8.setTextColor(r1)
            r1 = 17
            r8.setGravity(r1)
            r7.addView(r8)
            android.widget.SeekBar r6 = new android.widget.SeekBar
            android.content.Context r1 = r38.getApplicationContext()
            r6.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = 175(0xaf, float:2.45E-43)
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r3, r11, r4)
            r6.setLayoutParams(r1)
            r1 = 4
            r6.setPadding(r1, r1, r1, r1)
            r7.addView(r6)
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r3 = r38.getApplicationContext()
            r1.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r22 = r6
            r4 = 70
            r6 = 0
            r3.<init>(r4, r11, r6)
            r1.setLayoutParams(r3)
            r3 = -657931(0xfffffffffff5f5f5, float:NaN)
            r1.setBackgroundColor(r3)
            java.lang.String r3 = "Down"
            r1.setText(r3)
            r3 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r3)
            r3 = -13172557(0xffffffffff3700b3, float:-2.4325235E38)
            r1.setTextColor(r3)
            r3 = 17
            r1.setGravity(r3)
            r7.addView(r1)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r4 = r38.getApplicationContext()
            r3.<init>(r4)
            r4 = 0
            r3.setOrientation(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r18 = r1
            r1 = 0
            r6 = -2
            r4.<init>(r11, r6, r1)
            r3.setLayoutParams(r4)
            r13.addView(r3)
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r1 = r38.getApplicationContext()
            r6.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = 100
            r35 = r13
            r11 = 1065353216(0x3f800000, float:1.0)
            r13 = 70
            r1.<init>(r4, r13, r11)
            r6.setLayoutParams(r1)
            r1 = -657931(0xfffffffffff5f5f5, float:NaN)
            r6.setBackgroundColor(r1)
            java.lang.String r1 = "Cancel"
            r6.setText(r1)
            r1 = 1098907648(0x41800000, float:16.0)
            r6.setTextSize(r1)
            r1 = -13172557(0xffffffffff3700b3, float:-2.4325235E38)
            r6.setTextColor(r1)
            r1 = 17
            r6.setGravity(r1)
            r3.addView(r6)
            android.widget.TextView r11 = new android.widget.TextView
            android.content.Context r1 = r38.getApplicationContext()
            r11.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r21 = r6
            r6 = 70
            r13 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r4, r6, r13)
            r11.setLayoutParams(r1)
            r1 = -657931(0xfffffffffff5f5f5, float:NaN)
            r11.setBackgroundColor(r1)
            java.lang.String r1 = "OK"
            r11.setText(r1)
            r1 = 1098907648(0x41800000, float:16.0)
            r11.setTextSize(r1)
            r1 = -13172557(0xffffffffff3700b3, float:-2.4325235E38)
            r11.setTextColor(r1)
            r1 = 17
            r11.setGravity(r1)
            r3.addView(r11)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = 0
            r13 = -1
            r1.<init>(r13, r6, r4)
            r13 = 2
            r4 = 1
            r1.setMargins(r4, r4, r4, r13)
            r3.setLayoutParams(r1)
            r7.setLayoutParams(r1)
            r10.setLayoutParams(r1)
            r5.setLayoutParams(r1)
            r2.setLayoutParams(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = 45
            r13 = 0
            r1.<init>(r3, r6, r13)
            r1.setMargins(r4, r4, r4, r4)
            r12.setLayoutParams(r1)
            r15.setLayoutParams(r1)
            r9.setLayoutParams(r1)
            r8.setLayoutParams(r1)
            r14.setLayoutParams(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r6, r6, r13)
            r1.setMargins(r4, r4, r4, r4)
            r0.setLayoutParams(r1)
            r0 = r18
            r0.setLayoutParams(r1)
            r3 = r33
            r3.setLayoutParams(r1)
            r4 = r26
            r4.setLayoutParams(r1)
            r6 = r32
            r6.setLayoutParams(r1)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$60 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$60
            r13 = r38
            r1.<init>()
            r19 = r0
            r16 = r7
            r20 = r8
            r18 = r10
            r0 = 4
            r7 = 2
            r8 = -1
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r0, r7, r10, r8)
            r0 = r30
            r0.setBackground(r1)
            java.lang.String r0 = "إعــــــــداد "
            r1 = r39
            java.lang.String r0 = r0.concat(r1)
            r2.setText(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$61 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$61
            r0.<init>()
            r1 = 20
            r8 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r7, r10, r8)
            r8 = r21
            r8.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$62 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$62
            r0.<init>()
            r8 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r7, r10, r8)
            r11.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$63 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$63
            r0.<init>()
            r1 = 4
            r8 = -1
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r7, r10, r8)
            r2.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$64 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$64
            r0.<init>()
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r7, r10, r8)
            r5.setBackground(r0)
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c2 }
            r1 = r29
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c2 }
            r5 = 1
            r2.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c2 }
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c2 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c2 }
            r12.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c2 }
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c2 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c2 }
            r3.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c2 }
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c2 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c2 }
            r14.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c2 }
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c2 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c2 }
            r6.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c2 }
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c2 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c2 }
            r9.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c2 }
            android.widget.TextView r0 = r13.text_back_color     // Catch:{ Exception -> 0x05c2 }
            android.content.res.AssetManager r2 = r38.getAssets()     // Catch:{ Exception -> 0x05c2 }
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromAsset(r2, r1)     // Catch:{ Exception -> 0x05c2 }
            r0.setTypeface(r2, r5)     // Catch:{ Exception -> 0x05c2 }
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c2 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c2 }
            r15.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c2 }
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c2 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c2 }
            r4.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c2 }
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c2 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c2 }
            r8 = r20
            r8.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c4 }
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c4 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c4 }
            r2 = r19
            r2.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c4 }
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c4 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c4 }
            r11.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c4 }
            android.content.res.AssetManager r0 = r38.getAssets()     // Catch:{ Exception -> 0x05c4 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)     // Catch:{ Exception -> 0x05c4 }
            r6 = r21
            r6.setTypeface(r0, r5)     // Catch:{ Exception -> 0x05c6 }
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$65 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$65     // Catch:{ Exception -> 0x05c6 }
            r0.<init>()     // Catch:{ Exception -> 0x05c6 }
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = 4
            r3 = -1
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r2, r5, r1, r3)     // Catch:{ Exception -> 0x05c6 }
            r4 = r18
            r4.setBackground(r0)     // Catch:{ Exception -> 0x05c6 }
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$66 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$66     // Catch:{ Exception -> 0x05c6 }
            r0.<init>()     // Catch:{ Exception -> 0x05c6 }
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r2, r5, r1, r3)     // Catch:{ Exception -> 0x05c6 }
            r1 = r16
            r1.setBackground(r0)     // Catch:{ Exception -> 0x05c6 }
            goto L_0x05c7
        L_0x05c2:
            r8 = r20
        L_0x05c4:
            r6 = r21
        L_0x05c6:
        L_0x05c7:
            r10 = r41
            r0 = 2
            if (r10 != r0) goto L_0x05e8
            r0 = 360(0x168, float:5.04E-43)
            r7 = r27
            r7.setMax(r0)
            r5 = r28
            r5.setMax(r0)
            r4 = r31
            r4.setMax(r0)
            r3 = r34
            r3.setMax(r0)
            r2 = r22
            r2.setMax(r0)
            goto L_0x05f2
        L_0x05e8:
            r2 = r22
            r7 = r27
            r5 = r28
            r4 = r31
            r3 = r34
        L_0x05f2:
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$67 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$67
            r0 = r1
            r27 = r7
            r7 = r1
            r1 = r38
            r16 = r2
            r2 = r12
            r12 = r3
            r3 = r4
            r10 = r4
            r4 = r12
            r28 = r5
            r5 = r16
            r36 = r6
            r17 = r11
            r13 = r16
            r11 = r27
            r6 = r28
            r0.<init>(r2, r3, r4, r5, r6)
            r11.setOnSeekBarChangeListener(r7)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$68 r11 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$68
            r0 = r11
            r2 = r14
            r3 = r41
            r4 = r25
            r5 = r9
            r6 = r15
            r7 = r8
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r7 = r28
            r7.setOnSeekBarChangeListener(r11)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$69 r11 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$69
            r0 = r11
            r2 = r9
            r5 = r14
            r37 = r7
            r7 = r8
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r10.setOnSeekBarChangeListener(r11)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$70 r11 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$70
            r0 = r11
            r2 = r15
            r6 = r9
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r12.setOnSeekBarChangeListener(r11)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$71 r11 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$71
            r0 = r11
            r2 = r8
            r7 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r13.setOnSeekBarChangeListener(r11)
            r11 = r38
            r0 = r13
            java.lang.String r1 = r11.dd     // Catch:{ Exception -> 0x068d }
            r2 = 0
            java.lang.String r1 = r11.Spliter(r1, r2)     // Catch:{ Exception -> 0x068d }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x068d }
            int r1 = (int) r1     // Catch:{ Exception -> 0x068d }
            r2 = r37
            r2.setProgress(r1)     // Catch:{ Exception -> 0x068d }
            java.lang.String r1 = r11.dd     // Catch:{ Exception -> 0x068d }
            r2 = 1
            java.lang.String r1 = r11.Spliter(r1, r2)     // Catch:{ Exception -> 0x068d }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x068d }
            int r1 = (int) r1     // Catch:{ Exception -> 0x068d }
            r10.setProgress(r1)     // Catch:{ Exception -> 0x068d }
            java.lang.String r1 = r11.dd     // Catch:{ Exception -> 0x068d }
            r2 = 2
            java.lang.String r1 = r11.Spliter(r1, r2)     // Catch:{ Exception -> 0x068d }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x068d }
            int r1 = (int) r1     // Catch:{ Exception -> 0x068d }
            r12.setProgress(r1)     // Catch:{ Exception -> 0x068d }
            java.lang.String r1 = r11.dd     // Catch:{ Exception -> 0x068d }
            r2 = 3
            java.lang.String r1 = r11.Spliter(r1, r2)     // Catch:{ Exception -> 0x068d }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x068d }
            int r1 = (int) r1     // Catch:{ Exception -> 0x068d }
            r0.setProgress(r1)     // Catch:{ Exception -> 0x068d }
        L_0x068d:
            r2 = 0
            r4 = 0
            r0 = r38
            r1 = r25
            r0._set_View(r1, r2, r4)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$72 r10 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$72
            r0 = r10
            r1 = r38
            r2 = r40
            r3 = r14
            r4 = r9
            r5 = r15
            r6 = r8
            r7 = r24
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r0 = r17
            r0.setOnClickListener(r10)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$73 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$73
            r1 = r24
            r0.<init>(r1)
            r2 = r36
            r2.setOnClickListener(r0)
            r0 = r23
            r2 = r35
            r0.addView(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.Dialog_taqwes(java.lang.String, android.widget.TextView, int):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x00e4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _set_View(android.view.View r7, double r8, double r10) {
        /*
            r6 = this;
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x00e4 }
            android.widget.TextView r1 = r6.text_size     // Catch:{ Exception -> 0x00e4 }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r1 = r6.Spliter(r1, r11)     // Catch:{ Exception -> 0x00e4 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x00e4 }
            int r1 = (int) r1     // Catch:{ Exception -> 0x00e4 }
            android.widget.TextView r2 = r6.text_size     // Catch:{ Exception -> 0x00e4 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r2 = r6.Spliter(r2, r10)     // Catch:{ Exception -> 0x00e4 }
            double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x00e4 }
            int r2 = (int) r2     // Catch:{ Exception -> 0x00e4 }
            android.widget.TextView r3 = r6.text_size     // Catch:{ Exception -> 0x00e4 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r3 = r6.Spliter(r3, r9)     // Catch:{ Exception -> 0x00e4 }
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x00e4 }
            int r3 = (int) r3     // Catch:{ Exception -> 0x00e4 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x00e4 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x00e4 }
            android.widget.TextView r1 = r6.text_out     // Catch:{ Exception -> 0x00e4 }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r1 = r6.Spliter(r1, r11)     // Catch:{ Exception -> 0x00e4 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x00e4 }
            int r1 = (int) r1     // Catch:{ Exception -> 0x00e4 }
            android.widget.TextView r2 = r6.text_out     // Catch:{ Exception -> 0x00e4 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r2 = r6.Spliter(r2, r10)     // Catch:{ Exception -> 0x00e4 }
            double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x00e4 }
            int r2 = (int) r2     // Catch:{ Exception -> 0x00e4 }
            android.widget.TextView r3 = r6.text_out     // Catch:{ Exception -> 0x00e4 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r3 = r6.Spliter(r3, r9)     // Catch:{ Exception -> 0x00e4 }
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x00e4 }
            int r3 = (int) r3     // Catch:{ Exception -> 0x00e4 }
            android.widget.TextView r4 = r6.text_out     // Catch:{ Exception -> 0x00e4 }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r4 = r6.Spliter(r4, r8)     // Catch:{ Exception -> 0x00e4 }
            double r4 = java.lang.Double.parseDouble(r4)     // Catch:{ Exception -> 0x00e4 }
            int r4 = (int) r4     // Catch:{ Exception -> 0x00e4 }
            r0.setMargins(r1, r2, r3, r4)     // Catch:{ Exception -> 0x00e4 }
            r7.setLayoutParams(r0)     // Catch:{ Exception -> 0x00e4 }
            android.widget.TextView r0 = r6.text_in     // Catch:{ Exception -> 0x00e4 }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r0 = r6.Spliter(r0, r11)     // Catch:{ Exception -> 0x00e4 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x00e4 }
            int r0 = (int) r0     // Catch:{ Exception -> 0x00e4 }
            android.widget.TextView r1 = r6.text_in     // Catch:{ Exception -> 0x00e4 }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r1 = r6.Spliter(r1, r10)     // Catch:{ Exception -> 0x00e4 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x00e4 }
            int r1 = (int) r1     // Catch:{ Exception -> 0x00e4 }
            android.widget.TextView r2 = r6.text_in     // Catch:{ Exception -> 0x00e4 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r2 = r6.Spliter(r2, r9)     // Catch:{ Exception -> 0x00e4 }
            double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x00e4 }
            int r2 = (int) r2     // Catch:{ Exception -> 0x00e4 }
            android.widget.TextView r3 = r6.text_in     // Catch:{ Exception -> 0x00e4 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r3 = r6.Spliter(r3, r8)     // Catch:{ Exception -> 0x00e4 }
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x00e4 }
            int r3 = (int) r3     // Catch:{ Exception -> 0x00e4 }
            r7.setPadding(r0, r1, r2, r3)     // Catch:{ Exception -> 0x00e4 }
        L_0x00e4:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable     // Catch:{ Exception -> 0x023c }
            r0.<init>()     // Catch:{ Exception -> 0x023c }
            android.content.Context r1 = r6.getApplicationContext()     // Catch:{ Exception -> 0x023c }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x023c }
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch:{ Exception -> 0x023c }
            float r1 = r1.density     // Catch:{ Exception -> 0x023c }
            int r1 = (int) r1     // Catch:{ Exception -> 0x023c }
            android.widget.TextView r2 = r6.text_back_color     // Catch:{ Exception -> 0x023c }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x023c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x023c }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ Exception -> 0x023c }
            r0.setColor(r2)     // Catch:{ Exception -> 0x023c }
            r2 = 8
            float[] r2 = new float[r2]     // Catch:{ Exception -> 0x023c }
            float r3 = (float) r1     // Catch:{ Exception -> 0x023c }
            android.widget.TextView r4 = r6.text_zawaia     // Catch:{ Exception -> 0x023c }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x023c }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x023c }
            java.lang.String r4 = r6.Spliter(r4, r11)     // Catch:{ Exception -> 0x023c }
            double r4 = java.lang.Double.parseDouble(r4)     // Catch:{ Exception -> 0x023c }
            int r4 = (int) r4     // Catch:{ Exception -> 0x023c }
            long r4 = (long) r4     // Catch:{ Exception -> 0x023c }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x023c }
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ Exception -> 0x023c }
            float r4 = r4 * r3
            r2[r11] = r4     // Catch:{ Exception -> 0x023c }
            android.widget.TextView r4 = r6.text_zawaia     // Catch:{ Exception -> 0x023c }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x023c }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x023c }
            java.lang.String r11 = r6.Spliter(r4, r11)     // Catch:{ Exception -> 0x023c }
            double r4 = java.lang.Double.parseDouble(r11)     // Catch:{ Exception -> 0x023c }
            int r11 = (int) r4     // Catch:{ Exception -> 0x023c }
            long r4 = (long) r11     // Catch:{ Exception -> 0x023c }
            java.lang.String r11 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x023c }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ Exception -> 0x023c }
            float r11 = r11 * r3
            r2[r10] = r11     // Catch:{ Exception -> 0x023c }
            android.widget.TextView r11 = r6.text_zawaia     // Catch:{ Exception -> 0x023c }
            java.lang.CharSequence r11 = r11.getText()     // Catch:{ Exception -> 0x023c }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x023c }
            java.lang.String r11 = r6.Spliter(r11, r10)     // Catch:{ Exception -> 0x023c }
            double r4 = java.lang.Double.parseDouble(r11)     // Catch:{ Exception -> 0x023c }
            int r11 = (int) r4     // Catch:{ Exception -> 0x023c }
            long r4 = (long) r11     // Catch:{ Exception -> 0x023c }
            java.lang.String r11 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x023c }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ Exception -> 0x023c }
            float r11 = r11 * r3
            r2[r9] = r11     // Catch:{ Exception -> 0x023c }
            android.widget.TextView r11 = r6.text_zawaia     // Catch:{ Exception -> 0x023c }
            java.lang.CharSequence r11 = r11.getText()     // Catch:{ Exception -> 0x023c }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x023c }
            java.lang.String r10 = r6.Spliter(r11, r10)     // Catch:{ Exception -> 0x023c }
            double r10 = java.lang.Double.parseDouble(r10)     // Catch:{ Exception -> 0x023c }
            int r10 = (int) r10     // Catch:{ Exception -> 0x023c }
            long r10 = (long) r10     // Catch:{ Exception -> 0x023c }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x023c }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ Exception -> 0x023c }
            float r10 = r10 * r3
            r2[r8] = r10     // Catch:{ Exception -> 0x023c }
            android.widget.TextView r10 = r6.text_zawaia     // Catch:{ Exception -> 0x023c }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x023c }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x023c }
            java.lang.String r10 = r6.Spliter(r10, r9)     // Catch:{ Exception -> 0x023c }
            double r10 = java.lang.Double.parseDouble(r10)     // Catch:{ Exception -> 0x023c }
            int r10 = (int) r10     // Catch:{ Exception -> 0x023c }
            long r10 = (long) r10     // Catch:{ Exception -> 0x023c }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x023c }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ Exception -> 0x023c }
            float r10 = r10 * r3
            r11 = 4
            r2[r11] = r10     // Catch:{ Exception -> 0x023c }
            r10 = 5
            android.widget.TextView r4 = r6.text_zawaia     // Catch:{ Exception -> 0x023c }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x023c }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x023c }
            java.lang.String r9 = r6.Spliter(r4, r9)     // Catch:{ Exception -> 0x023c }
            double r4 = java.lang.Double.parseDouble(r9)     // Catch:{ Exception -> 0x023c }
            int r9 = (int) r4     // Catch:{ Exception -> 0x023c }
            long r4 = (long) r9     // Catch:{ Exception -> 0x023c }
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x023c }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ Exception -> 0x023c }
            float r9 = r9 * r3
            r2[r10] = r9     // Catch:{ Exception -> 0x023c }
            r9 = 6
            android.widget.TextView r10 = r6.text_zawaia     // Catch:{ Exception -> 0x023c }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x023c }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x023c }
            java.lang.String r10 = r6.Spliter(r10, r8)     // Catch:{ Exception -> 0x023c }
            double r4 = java.lang.Double.parseDouble(r10)     // Catch:{ Exception -> 0x023c }
            int r10 = (int) r4     // Catch:{ Exception -> 0x023c }
            long r4 = (long) r10     // Catch:{ Exception -> 0x023c }
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x023c }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ Exception -> 0x023c }
            float r10 = r10 * r3
            r2[r9] = r10     // Catch:{ Exception -> 0x023c }
            r9 = 7
            android.widget.TextView r10 = r6.text_zawaia     // Catch:{ Exception -> 0x023c }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x023c }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x023c }
            java.lang.String r8 = r6.Spliter(r10, r8)     // Catch:{ Exception -> 0x023c }
            double r4 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x023c }
            int r8 = (int) r4     // Catch:{ Exception -> 0x023c }
            long r4 = (long) r8     // Catch:{ Exception -> 0x023c }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x023c }
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ Exception -> 0x023c }
            float r3 = r3 * r8
            r2[r9] = r3     // Catch:{ Exception -> 0x023c }
            r0.setCornerRadii(r2)     // Catch:{ Exception -> 0x023c }
            double r8 = r6.Etar     // Catch:{ Exception -> 0x023c }
            long r8 = (long) r8     // Catch:{ Exception -> 0x023c }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x023c }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x023c }
            int r8 = r8 * r1
            android.widget.TextView r9 = r6.text_somk_color     // Catch:{ Exception -> 0x023c }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x023c }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x023c }
            int r9 = android.graphics.Color.parseColor(r9)     // Catch:{ Exception -> 0x023c }
            r0.setStroke(r8, r9)     // Catch:{ Exception -> 0x023c }
            int r1 = r1 * 4
            float r8 = (float) r1     // Catch:{ Exception -> 0x023c }
            r7.setElevation(r8)     // Catch:{ Exception -> 0x023c }
            r7.setBackground(r0)     // Catch:{ Exception -> 0x023c }
        L_0x023c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity._set_View(android.view.View, double, double):void");
    }

    public void _star_A() {
        this.List_startMap.clear();
        if (!this.saveX.getString(this.ID.concat("_".concat("all")), BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.List_map = (ArrayList) new Gson().fromJson(this.saveX.getString(this.ID.concat("_".concat("all")), BuildConfig.FLAVOR), new TypeToken<ArrayList<HashMap<String, Object>>>() {
            }.getType());
        }
        try {
            this.Data_Map = (ArrayList) new Gson().fromJson(this.List_map.get((int) this.K).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
            }.getType());
        } catch (Exception unused) {
        }
        if (this.Enter.equals("A")) {
            return;
        }
        if (this.Enter.equals("E")) {
            AnonymousClass76 r0 = new TimerTask() {
                public void run() {
                    EnterExzamActivity.this.runOnUiThread(new Runnable() {
                        public void run() {
                            EnterExzamActivity.this.List_startMap = (ArrayList) new Gson().fromJson(((HashMap) EnterExzamActivity.this.Data_Map.get((int) EnterExzamActivity.this.PD)).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                            }.getType());
                            if (EnterExzamActivity.this.Type.equals("1")) {
                                EnterExzamActivity.this._set_Backgrund_form(EnterExzamActivity.this.edittext1, EnterExzamActivity.this.PL, BuildConfig.FLAVOR, EnterExzamActivity.this.List_startMap);
                                EnterExzamActivity.this._set_TextView_from(EnterExzamActivity.this.edittext1, EnterExzamActivity.this.PL, BuildConfig.FLAVOR, EnterExzamActivity.this.List_startMap);
                                EnterExzamActivity.this._set_startA(EnterExzamActivity.this.PL, BuildConfig.FLAVOR, EnterExzamActivity.this.List_startMap);
                            } else {
                                EnterExzamActivity.this._set_Backgrund_form(EnterExzamActivity.this.L900, EnterExzamActivity.this.PL, BuildConfig.FLAVOR, EnterExzamActivity.this.List_startMap);
                                EnterExzamActivity.this._set_startA(EnterExzamActivity.this.PL, BuildConfig.FLAVOR, EnterExzamActivity.this.List_startMap);
                            }
                            EnterExzamActivity.this._start_on();
                        }
                    });
                }
            };
            this.timer_5 = r0;
            this._timer.schedule(r0, 8);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void _ss() {
        this.List_fonts = (ArrayList) new Gson().fromJson("[\"aldewantom.ttf\",\"arial.ttf\",\"exzam_bold.ttf\",\"font.ttf\",\"font700.ttf\",\"nasa53672.ttf\",\"nasa87138631.ttf\",\"nasa_n.ttf\",\"nasa_soft154.ttf\",\"nasa_soft19.ttf\",\"nasa_soft44.ttf\",\"nasa_soft55.ttf\",\"u4_5899792387474983078.ttf\"]", new TypeToken<ArrayList<String>>() {
        }.getType());
        try {
            this.Enter = getIntent().getStringExtra("E");
            this.Type = getIntent().getStringExtra("T");
            this.PL = Double.parseDouble(getIntent().getStringExtra("PL"));
            this.PD = Double.parseDouble(getIntent().getStringExtra("PD"));
            this.K = Double.parseDouble(getIntent().getStringExtra("K"));
            this.paggg = Double.parseDouble(getIntent().getStringExtra("page"));
            this.ID = getIntent().getStringExtra(DatabaseHelper.COL_0);
        } catch (Exception unused) {
            this.Book = "0";
            this.Page = "0";
            this.name = "تجريبي";
        }
        this.linear_image.setVisibility(8);
        this.linear27.setVisibility(8);
        if (this.Type.equals("2")) {
            this.linear_Top_tow.setVisibility(8);
            this.linear24.setVisibility(8);
            this.linear00.setVisibility(8);
            this.linear_image.setVisibility(0);
            this.linear27.setVisibility(0);
        }
        _saql_90();
        _start_0();
        _start_set();
        _On_CLiCK();
        AnonymousClass78 r0 = new TimerTask() {
            public void run() {
                EnterExzamActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        EnterExzamActivity.this._star_A();
                    }
                });
            }
        };
        this.timer_5 = r0;
        this._timer.schedule(r0, 20);
        try {
            this.w = Double.parseDouble(this.save.getString("Size_page", BuildConfig.FLAVOR));
        } catch (Exception unused2) {
            this.w = 1400.0d;
        }
        double d2 = this.w - 192.0d;
        this.w = d2;
        this.h = d2 / 0.707d;
        this.linear_pdf_0.setLayoutParams(new LinearLayout.LayoutParams((int) this.w, (int) this.h, 0.0f));
        AnonymousClass79 r02 = new TimerTask() {
            public void run() {
                EnterExzamActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        EnterExzamActivity.this.starr(EnterExzamActivity.this.linear_pdf_0, EnterExzamActivity.this.linear3);
                        EnterExzamActivity.this.timer_5 = new TimerTask() {
                            public void run() {
                                EnterExzamActivity.this.runOnUiThread(new Runnable() {
                                    public void run() {
                                        EnterExzamActivity.this.starr(EnterExzamActivity.this.linear_pdf_0, EnterExzamActivity.this.linear3);
                                    }
                                });
                            }
                        };
                        EnterExzamActivity.this._timer.schedule(EnterExzamActivity.this.timer_5, 500);
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
        float f = (float) displayMetrics.widthPixels;
        try {
            this.linear_pdf_0.setLayoutParams(new LinearLayout.LayoutParams((int) this.w, (int) this.h, 0.0f));
            double d2 = (double) f;
            double d3 = this.w;
            float f2 = (float) (d2 / d3);
            this.scol = d2 / d3;
            if (d3 > 0.0d) {
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

    public void _start_set() {
        Object obj;
        this.Font_size = 20.0d;
        this.Etar = 1.0d;
        this.T_in = "0,5,5,5";
        this.T_out = "0,0,0,0";
        this.T_z5 = "0,0,0,0";
        this.dd = "0,0,0,0";
        this.T_W = "1";
        this.Font_Stayl = "0";
        this.Font_colorr = "#FF000000";
        this.Etar_color = "#00000000";
        this.beack_color = "#00000000";
        this.abC = "0,0,0";
        this.abC_color = "#FF000000";
        this.Font_path = "font.ttf";
        this.Text = BuildConfig.FLAVOR;
        this.path = BuildConfig.FLAVOR;
        this.Tex_im = "شكل ( )";
        this.text_photo_var = 0.0d;
        if (this.Type.equals("2")) {
            this.size = "400,400,1";
        } else {
            this.size = "400,-2,1";
        }
        Object obj2 = "2";
        String str = "_D_15";
        String str2 = "_D_13";
        if (!this.saf_d.getString(this.Type.concat("_D_15"), BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            try {
                this.Font_size = Double.parseDouble(this.saf_d.getString(this.Type.concat("_D_0"), BuildConfig.FLAVOR));
                this.Etar = Double.parseDouble(this.saf_d.getString(this.Type.concat("_D_1"), BuildConfig.FLAVOR));
                this.T_in = this.saf_d.getString(this.Type.concat("_D_2"), BuildConfig.FLAVOR);
                this.T_out = this.saf_d.getString(this.Type.concat("_D_3"), BuildConfig.FLAVOR);
                this.T_z5 = this.saf_d.getString(this.Type.concat("_D_4"), BuildConfig.FLAVOR);
                this.T_W = this.saf_d.getString(this.Type.concat("_D_5"), BuildConfig.FLAVOR);
                this.Font_Stayl = this.saf_d.getString(this.Type.concat("_D_6"), BuildConfig.FLAVOR);
                this.Font_colorr = this.saf_d.getString(this.Type.concat("_D_7"), BuildConfig.FLAVOR);
                this.Etar_color = this.saf_d.getString(this.Type.concat("_D_8"), BuildConfig.FLAVOR);
                this.beack_color = this.saf_d.getString(this.Type.concat("_D_9"), BuildConfig.FLAVOR);
                this.abC = this.saf_d.getString(this.Type.concat("_D_10"), BuildConfig.FLAVOR);
                this.abC_color = this.saf_d.getString(this.Type.concat("_D_11"), BuildConfig.FLAVOR);
                this.Font_path = this.saf_d.getString(this.Type.concat("_D_12"), BuildConfig.FLAVOR);
                this.size = this.saf_d.getString(this.Type.concat(str2), BuildConfig.FLAVOR);
                this.Tex_im = this.saf_d.getString(this.Type.concat("_D_14"), BuildConfig.FLAVOR);
                this.text_photo_var = Double.parseDouble(this.saf_d.getString(this.Type.concat(str), BuildConfig.FLAVOR));
            } catch (Exception unused) {
            }
            obj = BuildConfig.FLAVOR;
        } else {
            String str3 = str2;
            String str4 = str;
            obj = BuildConfig.FLAVOR;
            this.saf_d.edit().putString(this.Type.concat("_D_0"), String.valueOf((long) this.Font_size)).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_1"), String.valueOf((long) this.Etar)).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_2"), this.T_in).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_3"), this.T_out).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_4"), this.T_z5).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_5"), this.T_W).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_6"), this.Font_Stayl).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_7"), this.Font_colorr).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_8"), this.Etar_color).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_9"), this.beack_color).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_10"), this.abC).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_11"), this.abC_color).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_12"), this.Font_path).commit();
            this.saf_d.edit().putString(this.Type.concat(str3), this.size).commit();
            this.saf_d.edit().putString(this.Type.concat("_D_14"), this.Tex_im).commit();
            this.saf_d.edit().putString(this.Type.concat(str4), String.valueOf((long) this.text_photo_var)).commit();
        }
        try {
            this.text_size.setText(this.size);
            this.text_in.setText(this.T_in);
            this.text_out.setText(this.T_out);
            this.text_zawaia.setText(this.T_z5);
            this.text_back_color.setText(this.beack_color);
            this.text_somk_color.setText(this.Etar_color);
            this.text_font_color.setText(this.Font_colorr);
            this.text_font.setText(this.Font_path);
            this.text_Dell.setText(this.abC);
        } catch (Exception unused2) {
        }
        if (this.Type.equals(obj2)) {
            this.W = (double) ((int) Double.parseDouble(Spliter(this.text_size.getText().toString(), 0)));
            this.H = (double) ((int) Double.parseDouble(Spliter(this.text_size.getText().toString(), 1)));
            this.Wi = (double) ((int) Double.parseDouble(Spliter(this.text_size.getText().toString(), 2)));
            this.L900.setLayoutParams(new LinearLayout.LayoutParams((int) this.W, (int) this.H, (float) ((int) this.Wi)));
            this.linear_image.setVisibility(0);
            this.edittext1.setVisibility(8);
            if (!this.path.equals(obj)) {
                this.imageview41.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(this.path, 1024, 1024));
            }
            if (this.text_photo_var == 0.0d) {
                this.text_shaql.setVisibility(8);
            } else {
                this.text_shaql.setVisibility(0);
            }
            this.text_shaql.setText(this.Tex_im);
        }
        _start_on();
    }

    public void _save_function() {
        Object obj = "Nnn";
        Object obj2 = "43";
        Object obj3 = "42";
        Object obj4 = "41";
        Object obj5 = "40";
        Object obj6 = "27";
        if (this.Enter.equals("A")) {
            this.List_startMap.clear();
            this.Data_Map.clear();
            HashMap<String, Object> hashMap = new HashMap<>();
            this.map_A = hashMap;
            Object obj7 = "26";
            Object obj8 = "25";
            hashMap.put("0", this.Type);
            this.map_A.put("1", this.text_size.getText().toString());
            this.map_A.put("2", this.text_in.getText().toString());
            this.map_A.put("3", this.text_out.getText().toString());
            this.map_A.put("4", this.text_zawaia.getText().toString());
            this.map_A.put("5", this.text_back_color.getText().toString());
            this.map_A.put("6", String.valueOf((long) this.Etar));
            this.map_A.put("7", this.text_somk_color.getText().toString());
            if (this.Type.equals("1")) {
                this.map_A.put("20", this.edittext1.getText().toString());
                this.map_A.put("21", String.valueOf((long) this.Font_size));
                this.map_A.put("22", this.text_font_color.getText().toString());
                this.map_A.put("23", this.text_font.getText().toString());
                this.map_A.put("24", this.Font_Stayl);
                this.map_A.put(obj8, this.T_W);
                this.map_A.put(obj7, this.text_Dell.getText().toString());
                this.map_A.put(obj6, this.abC_color);
            }
            if (this.Type.equals("2")) {
                this.map_A.put(obj5, this.path);
                this.map_A.put(obj4, String.valueOf((long) this.text_photo_var));
                this.map_A.put(obj3, this.Tex_im);
                this.map_A.put(obj2, this.Urel);
            }
            this.map_A.put("60", this.ID_one);
            this.List_startMap.add(this.map_A);
            HashMap<String, Object> hashMap2 = new HashMap<>();
            this.Map_A = hashMap2;
            hashMap2.put("2", new Gson().toJson((Object) this.List_startMap));
            this.Data_Map.add(this.Map_A);
            HashMap<String, Object> hashMap3 = new HashMap<>();
            this.Map_A = hashMap3;
            hashMap3.put("1", BuildConfig.FLAVOR);
            this.Map_A.put("2", new Gson().toJson((Object) this.Data_Map));
            this.Map_A.put("3", BuildConfig.FLAVOR);
            this.Map_A.put(obj, String.valueOf((long) this.paggg));
            this.List_map.add(this.Map_A);
        } else {
            Object obj9 = obj;
            Object obj10 = "25";
            Object obj11 = "26";
            this.List_startMap.get((int) this.PL).put("1", this.text_size.getText().toString());
            this.List_startMap.get((int) this.PL).put("2", this.text_in.getText().toString());
            this.List_startMap.get((int) this.PL).put("3", this.text_out.getText().toString());
            this.List_startMap.get((int) this.PL).put("4", this.text_zawaia.getText().toString());
            this.List_startMap.get((int) this.PL).put("5", this.text_back_color.getText().toString());
            this.List_startMap.get((int) this.PL).put("6", String.valueOf((long) this.Etar));
            this.List_startMap.get((int) this.PL).put("7", this.text_somk_color.getText().toString());
            if (this.Type.equals("1")) {
                this.List_startMap.get((int) this.PL).put("20", this.edittext1.getText().toString());
                this.List_startMap.get((int) this.PL).put("21", String.valueOf((long) this.Font_size));
                this.List_startMap.get((int) this.PL).put("22", this.text_font_color.getText().toString());
                this.List_startMap.get((int) this.PL).put("23", this.text_font.getText().toString());
                this.List_startMap.get((int) this.PL).put("24", this.Font_Stayl);
                this.List_startMap.get((int) this.PL).put(obj10, this.T_W);
                this.List_startMap.get((int) this.PL).put(obj11, this.text_Dell.getText().toString());
                this.List_startMap.get((int) this.PL).put(obj6, this.abC_color);
            }
            if (this.Type.equals("2")) {
                this.List_startMap.get((int) this.PL).put(obj5, this.path);
                this.List_startMap.get((int) this.PL).put(obj4, String.valueOf((long) this.text_photo_var));
                this.List_startMap.get((int) this.PL).put(obj3, this.Tex_im);
                this.List_startMap.get((int) this.PL).put(obj2, this.Urel);
            }
            this.Data_Map.get((int) this.PD).put("2", new Gson().toJson((Object) this.List_startMap));
            this.List_map.get((int) this.K).put("2", new Gson().toJson((Object) this.Data_Map));
            this.List_map.get((int) this.K).put(obj9, String.valueOf((long) this.paggg));
        }
        this.saveX.edit().putString(this.ID.concat("_".concat("all")), new Gson().toJson((Object) this.List_map)).commit();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35) */
    /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(2:15|16)|18|(16:20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35)|37|(6:39|40|41|42|43|44)|45|46|47|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18|(16:20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35)|37|(6:39|40|41|42|43|44)|45|46|47|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:39|40|41|42|43|44) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x009f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x00b4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0101 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x011a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x012f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0144 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0159 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x016e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0183 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x01b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x01d0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x01e5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0062 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0075 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x008a */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ec A[SYNTHETIC, Splitter:B:20:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01a2 A[SYNTHETIC, Splitter:B:39:0x01a2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _set_start_from_map(double r6) {
        /*
            r5 = this;
            java.lang.String r0 = "2"
            r1 = 4626322717216342016(0x4034000000000000, double:20.0)
            r5.Font_size = r1
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5.Etar = r1
            java.lang.String r1 = "0,0,0,0"
            r5.T_in = r1
            r5.T_out = r1
            r5.T_z5 = r1
            java.lang.String r2 = "300,300,0"
            r5.size = r2
            r5.dd = r1
            java.lang.String r1 = "1"
            r5.T_W = r1
            java.lang.String r2 = "0"
            r5.Font_Stayl = r2
            java.lang.String r3 = "#FF000000"
            r5.Font_colorr = r3
            java.lang.String r4 = "#00000000"
            r5.Etar_color = r4
            r5.beack_color = r4
            java.lang.String r4 = "0,0,0"
            r5.abC = r4
            r5.abC_color = r3
            java.lang.String r3 = ""
            r5.Font_path = r3
            r5.Text = r3
            r5.path = r3
            java.lang.String r3 = "شكل ()"
            r5.Tex_im = r3
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r3 = r5.List_startMap     // Catch:{ Exception -> 0x004f }
            int r4 = (int) r6     // Catch:{ Exception -> 0x004f }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x004f }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x004f }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ Exception -> 0x004f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x004f }
            r5.Type = r2     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r5.List_startMap     // Catch:{ Exception -> 0x0062 }
            int r3 = (int) r6     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0062 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0062 }
            r5.size = r2     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r5.List_startMap     // Catch:{ Exception -> 0x0075 }
            int r3 = (int) r6     // Catch:{ Exception -> 0x0075 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0075 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x0075 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0075 }
            r5.T_in = r2     // Catch:{ Exception -> 0x0075 }
        L_0x0075:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r5.List_startMap     // Catch:{ Exception -> 0x008a }
            int r3 = (int) r6     // Catch:{ Exception -> 0x008a }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x008a }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x008a }
            java.lang.String r3 = "3"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x008a }
            r5.T_out = r2     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r5.List_startMap     // Catch:{ Exception -> 0x009f }
            int r3 = (int) r6     // Catch:{ Exception -> 0x009f }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x009f }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x009f }
            java.lang.String r3 = "4"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x009f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x009f }
            r5.T_z5 = r2     // Catch:{ Exception -> 0x009f }
        L_0x009f:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r5.List_startMap     // Catch:{ Exception -> 0x00b4 }
            int r3 = (int) r6     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00b4 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r3 = "5"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b4 }
            r5.beack_color = r2     // Catch:{ Exception -> 0x00b4 }
        L_0x00b4:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r5.List_startMap     // Catch:{ Exception -> 0x00cd }
            int r3 = (int) r6     // Catch:{ Exception -> 0x00cd }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00cd }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x00cd }
            java.lang.String r3 = "6"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00cd }
            double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x00cd }
            r5.Etar = r2     // Catch:{ Exception -> 0x00cd }
        L_0x00cd:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r5.List_startMap     // Catch:{ Exception -> 0x00e3 }
            int r3 = (int) r6     // Catch:{ Exception -> 0x00e3 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00e3 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r3 = "7"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00e3 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00e3 }
            r5.Etar_color = r2     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00e4
        L_0x00e3:
        L_0x00e4:
            java.lang.String r2 = r5.Type
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x019a
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r5.List_startMap     // Catch:{ Exception -> 0x0101 }
            int r2 = (int) r6     // Catch:{ Exception -> 0x0101 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0101 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x0101 }
            java.lang.String r2 = "20"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0101 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0101 }
            r5.Text = r1     // Catch:{ Exception -> 0x0101 }
        L_0x0101:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r5.List_startMap     // Catch:{ Exception -> 0x011a }
            int r2 = (int) r6     // Catch:{ Exception -> 0x011a }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x011a }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x011a }
            java.lang.String r2 = "21"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x011a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x011a }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x011a }
            r5.Font_size = r1     // Catch:{ Exception -> 0x011a }
        L_0x011a:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r5.List_startMap     // Catch:{ Exception -> 0x012f }
            int r2 = (int) r6     // Catch:{ Exception -> 0x012f }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x012f }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x012f }
            java.lang.String r2 = "22"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x012f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x012f }
            r5.Font_colorr = r1     // Catch:{ Exception -> 0x012f }
        L_0x012f:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r5.List_startMap     // Catch:{ Exception -> 0x0144 }
            int r2 = (int) r6     // Catch:{ Exception -> 0x0144 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0144 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x0144 }
            java.lang.String r2 = "23"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0144 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0144 }
            r5.Font_path = r1     // Catch:{ Exception -> 0x0144 }
        L_0x0144:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r5.List_startMap     // Catch:{ Exception -> 0x0159 }
            int r2 = (int) r6     // Catch:{ Exception -> 0x0159 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0159 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x0159 }
            java.lang.String r2 = "24"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0159 }
            r5.Font_Stayl = r1     // Catch:{ Exception -> 0x0159 }
        L_0x0159:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r5.List_startMap     // Catch:{ Exception -> 0x016e }
            int r2 = (int) r6     // Catch:{ Exception -> 0x016e }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x016e }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x016e }
            java.lang.String r2 = "25"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x016e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x016e }
            r5.T_W = r1     // Catch:{ Exception -> 0x016e }
        L_0x016e:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r5.List_startMap     // Catch:{ Exception -> 0x0183 }
            int r2 = (int) r6     // Catch:{ Exception -> 0x0183 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0183 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x0183 }
            java.lang.String r2 = "26"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0183 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0183 }
            r5.abC = r1     // Catch:{ Exception -> 0x0183 }
        L_0x0183:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r5.List_startMap     // Catch:{ Exception -> 0x0199 }
            int r2 = (int) r6     // Catch:{ Exception -> 0x0199 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0199 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x0199 }
            java.lang.String r2 = "27"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0199 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0199 }
            r5.abC_color = r1     // Catch:{ Exception -> 0x0199 }
            goto L_0x019a
        L_0x0199:
        L_0x019a:
            java.lang.String r1 = r5.Type
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01e5
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r5.List_startMap     // Catch:{ Exception -> 0x01b7 }
            int r1 = (int) r6     // Catch:{ Exception -> 0x01b7 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x01b7 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r1 = "40"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x01b7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01b7 }
            r5.path = r0     // Catch:{ Exception -> 0x01b7 }
        L_0x01b7:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r5.List_startMap     // Catch:{ Exception -> 0x01d0 }
            int r1 = (int) r6     // Catch:{ Exception -> 0x01d0 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x01d0 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r1 = "41"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01d0 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x01d0 }
            r5.text_photo_var = r0     // Catch:{ Exception -> 0x01d0 }
        L_0x01d0:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r5.List_startMap     // Catch:{ Exception -> 0x01e5 }
            int r1 = (int) r6     // Catch:{ Exception -> 0x01e5 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x01e5 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r1 = "42"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x01e5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01e5 }
            r5.Tex_im = r0     // Catch:{ Exception -> 0x01e5 }
        L_0x01e5:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r5.List_startMap     // Catch:{ Exception -> 0x01fa }
            int r6 = (int) r6     // Catch:{ Exception -> 0x01fa }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ Exception -> 0x01fa }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ Exception -> 0x01fa }
            java.lang.String r7 = "60"
            java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01fa }
            r5.ID_one = r6     // Catch:{ Exception -> 0x01fa }
        L_0x01fa:
            r5._start_on()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity._set_start_from_map(double):void");
    }

    public void dialog_Text(TextView textView) {
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
        final EditText editText = new EditText(getApplicationContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams3.setMargins(2, 2, 2, 2);
        editText.setLayoutParams(layoutParams3);
        editText.setGravity(53);
        ImageView imageView = new ImageView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(45, -1, 0.0f);
        layoutParams4.setMargins(1, 1, 1, 1);
        imageView.setLayoutParams(layoutParams4);
        imageView.setImageResource(R.drawable.ulang_19);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        linearLayout3.addView(imageView);
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 0.0f));
        textView2.setTextColor(-1499549);
        textView2.setTextSize(14.0f);
        textView2.setGravity(17);
        linearLayout3.addView(textView2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams5.setMargins(2, 2, 2, 0);
        textView2.setLayoutParams(layoutParams5);
        linearLayout2.addView(linearLayout3);
        editText.setGravity(17);
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams6.setMargins(0, 2, 2, 0);
        linearLayout4.setLayoutParams(layoutParams6);
        linearLayout4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -1118482));
        linearLayout2.addView(linearLayout4);
        ImageView imageView2 = new ImageView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, 350, 0.0f);
        layoutParams7.setMargins(2, 2, 2, 2);
        imageView2.setLayoutParams(layoutParams7);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        linearLayout2.addView(imageView2);
        imageView2.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, ViewCompat.MEASURED_STATE_MASK, -1));
        LinearLayout linearLayout5 = new LinearLayout(getApplicationContext());
        linearLayout5.setOrientation(0);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams8.setMargins(2, 3, 3, 2);
        linearLayout5.setLayoutParams(layoutParams8);
        linearLayout5.setGravity(53);
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -657931));
        linearLayout5.addView(editText);
        linearLayout2.addView(linearLayout5);
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        linearLayout6.setOrientation(0);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams9.setMargins(0, 4, 0, 4);
        linearLayout6.setLayoutParams(layoutParams9);
        linearLayout2.addView(linearLayout6);
        linearLayout6.setBackground(new GradientDrawable() {
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
        LinearLayout linearLayout7 = new LinearLayout(getApplicationContext());
        linearLayout7.setOrientation(0);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams10.setMargins(0, 8, 1, 0);
        linearLayout7.setLayoutParams(layoutParams10);
        TextView textView4 = new TextView(getApplicationContext());
        textView4.setLayoutParams(new LinearLayout.LayoutParams(120, 50, 1.0f));
        textView4.setTextColor(-1499549);
        textView4.setTextSize(15.0f);
        textView4.setText("cancel");
        textView4.setGravity(17);
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                editText.requestFocus();
                editText.setShowSoftInputOnFocus(false);
                editText.setEnabled(false);
                create.dismiss();
            }
        });
        linearLayout7.addView(textView4);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams11.setMargins(10, 1, 1, 10);
        textView4.setLayoutParams(layoutParams11);
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
        linearLayout7.addView(textView5);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams12.setMargins(10, 1, 1, 10);
        textView5.setLayoutParams(layoutParams12);
        textView5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout2.setBackgroundColor(-1);
        editText.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -1));
        linearLayout2.addView(linearLayout7);
        linearLayout.addView(linearLayout2);
        try {
            textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
        } catch (Exception unused) {
        }
        editText.setText(BuildConfig.FLAVOR);
        try {
            textView2.setText("تعديل النص");
            editText.setText(textView.getText().toString());
            AnonymousClass89 r4 = new TimerTask() {
                public void run() {
                    EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                    final EditText editText = editText;
                    enterExzamActivity.runOnUiThread(new Runnable() {
                        public void run() {
                            editText.setEnabled(true);
                            editText.requestFocus();
                            ((InputMethodManager) EnterExzamActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                            EditText editText = editText;
                            editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                        }
                    });
                }
            };
            this.timer_5 = r4;
            this._timer.schedule(r4, 50);
            textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
        } catch (Exception unused2) {
        }
        textView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    EnterExzamActivity.this.Tex_im = editText.getText().toString();
                    editText.requestFocus();
                    editText.setShowSoftInputOnFocus(false);
                    editText.setEnabled(false);
                    create.dismiss();
                } catch (Exception unused) {
                }
            }
        });
        try {
            editText.setEnabled(true);
            editText.requestFocus();
            ((InputMethodManager) getSystemService("input_method")).showSoftInput(editText, 1);
            editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
        } catch (Exception unused3) {
        }
        create.setView(linearLayout);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        create.getWindow().setLayout(-1, -2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x041b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Size_WHW(android.widget.TextView r22) {
        /*
            r21 = this;
            r7 = r21
            java.lang.String r0 = "fonts/nasa_soft44.ttf"
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r7)
            android.app.AlertDialog r8 = r1.create()
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            android.content.Context r1 = r21.getApplicationContext()
            r9.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r9.setLayoutParams(r1)
            r1 = 1
            r9.setOrientation(r1)
            r3 = 17
            r9.setGravity(r3)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r5 = r21.getApplicationContext()
            r4.<init>(r5)
            r4.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r6 = 0
            r5.<init>(r2, r10, r6)
            r4.setLayoutParams(r5)
            r5 = 8
            r4.setPadding(r5, r5, r5, r5)
            r4.setBackgroundColor(r2)
            r4.setGravity(r3)
            r9.addView(r4)
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            android.content.Context r12 = r21.getApplicationContext()
            r11.<init>(r12)
            r12 = 0
            r11.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r14 = 87
            r13.<init>(r2, r14, r6)
            r11.setLayoutParams(r13)
            r13 = 2
            r11.setPadding(r13, r13, r13, r13)
            r15 = -1118482(0xffffffffffeeeeee, float:NaN)
            r11.setBackgroundColor(r15)
            r11.setGravity(r3)
            r4.addView(r11)
            android.widget.TextView r15 = new android.widget.TextView
            android.content.Context r13 = r21.getApplicationContext()
            r15.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r1 = 70
            r5 = 1065353216(0x3f800000, float:1.0)
            r13.<init>(r10, r1, r5)
            r15.setLayoutParams(r13)
            java.lang.String r13 = "☆إعدادات الحجم ☆"
            r15.setText(r13)
            r13 = 1099956224(0x41900000, float:18.0)
            r15.setTextSize(r13)
            r1 = -720809(0xfffffffffff50057, float:NaN)
            r15.setTextColor(r1)
            r15.setGravity(r3)
            r11.addView(r15)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r11 = r21.getApplicationContext()
            r1.<init>(r11)
            r1.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r2, r10, r6)
            r1.setLayoutParams(r11)
            r4.addView(r1)
            android.widget.TextView r11 = new android.widget.TextView
            android.content.Context r13 = r21.getApplicationContext()
            r11.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r2, r10, r6)
            r11.setLayoutParams(r13)
            r11.setBackgroundColor(r2)
            java.lang.String r13 = " تستطيع تغير الطول والعرض"
            r11.setText(r13)
            r13 = 1096810496(0x41600000, float:14.0)
            r11.setTextSize(r13)
            r13 = -14983648(0xffffffffff1b5e20, float:-2.0651906E38)
            r11.setTextColor(r13)
            r13 = 21
            r11.setGravity(r13)
            r1.addView(r11)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r13 = r21.getApplicationContext()
            r1.<init>(r13)
            r1.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r2, r14, r6)
            r1.setLayoutParams(r13)
            r13 = 4
            r1.setPadding(r13, r13, r13, r13)
            r1.setGravity(r3)
            r4.addView(r1)
            android.widget.EditText r10 = new android.widget.EditText
            android.content.Context r13 = r21.getApplicationContext()
            r10.<init>(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r6 = 300(0x12c, float:4.2E-43)
            r13.<init>(r6, r2, r5)
            r10.setLayoutParams(r13)
            r13 = 8
            r10.setPadding(r13, r13, r13, r13)
            r13 = 1097859072(0x41700000, float:15.0)
            r10.setTextSize(r13)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r10.setTextColor(r6)
            r10.setGravity(r3)
            r1.addView(r10)
            android.widget.TextView r14 = new android.widget.TextView
            android.content.Context r12 = r21.getApplicationContext()
            r14.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r3 = 200(0xc8, float:2.8E-43)
            r12.<init>(r3, r2, r5)
            r14.setLayoutParams(r12)
            r12 = 8
            r14.setPadding(r12, r12, r12, r12)
            r12 = -657931(0xfffffffffff5f5f5, float:NaN)
            r14.setBackgroundColor(r12)
            java.lang.String r12 = "الارتفاع"
            r14.setText(r12)
            r14.setTextSize(r13)
            r14.setTextColor(r6)
            r12 = 17
            r14.setGravity(r12)
            r1.addView(r14)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r13 = r21.getApplicationContext()
            r1.<init>(r13)
            r13 = 0
            r1.setOrientation(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r3 = 87
            r6 = 0
            r13.<init>(r2, r3, r6)
            r1.setLayoutParams(r13)
            r3 = 4
            r1.setPadding(r3, r3, r3, r3)
            r1.setGravity(r12)
            r4.addView(r1)
            android.widget.EditText r13 = new android.widget.EditText
            android.content.Context r3 = r21.getApplicationContext()
            r13.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r6 = 300(0x12c, float:4.2E-43)
            r3.<init>(r6, r2, r5)
            r13.setLayoutParams(r3)
            r3 = 8
            r13.setPadding(r3, r3, r3, r3)
            r6 = 1099956224(0x41900000, float:18.0)
            r13.setTextSize(r6)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r13.setTextColor(r6)
            r13.setGravity(r12)
            r1.addView(r13)
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r12 = r21.getApplicationContext()
            r6.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r3 = 200(0xc8, float:2.8E-43)
            r12.<init>(r3, r2, r5)
            r6.setLayoutParams(r12)
            r3 = 8
            r6.setPadding(r3, r3, r3, r3)
            r3 = -657931(0xfffffffffff5f5f5, float:NaN)
            r6.setBackgroundColor(r3)
            java.lang.String r3 = "العرض"
            r6.setText(r3)
            r3 = 1099956224(0x41900000, float:18.0)
            r6.setTextSize(r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setTextColor(r3)
            r3 = 17
            r6.setGravity(r3)
            r1.addView(r6)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r12 = r21.getApplicationContext()
            r1.<init>(r12)
            r12 = 0
            r1.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r3 = 0
            r5 = 87
            r12.<init>(r2, r5, r3)
            r1.setLayoutParams(r12)
            r3 = 4
            r1.setPadding(r3, r3, r3, r3)
            r3 = 17
            r1.setGravity(r3)
            r4.addView(r1)
            android.widget.EditText r12 = new android.widget.EditText
            android.content.Context r5 = r21.getApplicationContext()
            r12.<init>(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r19 = r9
            r3 = 300(0x12c, float:4.2E-43)
            r9 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r3, r2, r9)
            r12.setLayoutParams(r5)
            r3 = 8
            r12.setPadding(r3, r3, r3, r3)
            r5 = 1099956224(0x41900000, float:18.0)
            r12.setTextSize(r5)
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r12.setTextColor(r5)
            r5 = 17
            r12.setGravity(r5)
            r1.addView(r12)
            android.widget.TextView r5 = new android.widget.TextView
            android.content.Context r3 = r21.getApplicationContext()
            r5.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r17 = r8
            r8 = 200(0xc8, float:2.8E-43)
            r3.<init>(r8, r2, r9)
            r5.setLayoutParams(r3)
            r3 = 8
            r5.setPadding(r3, r3, r3, r3)
            r3 = -657931(0xfffffffffff5f5f5, float:NaN)
            r5.setBackgroundColor(r3)
            java.lang.String r3 = "الوزن"
            r5.setText(r3)
            r3 = 1097859072(0x41700000, float:15.0)
            r5.setTextSize(r3)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setTextColor(r3)
            r3 = 17
            r5.setGravity(r3)
            r1.addView(r5)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r3 = r21.getApplicationContext()
            r1.<init>(r3)
            r3 = 0
            r1.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r9 = 0
            r3.<init>(r2, r8, r9)
            r1.setLayoutParams(r3)
            r4.addView(r1)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r2 = r21.getApplicationContext()
            r3.<init>(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r20 = r6
            r6 = -1
            r2.<init>(r6, r8, r9)
            r3.setLayoutParams(r2)
            r3.setBackgroundColor(r6)
            java.lang.String r2 = "هل تريد الحفظ!"
            r3.setText(r2)
            r2 = 1096810496(0x41600000, float:14.0)
            r3.setTextSize(r2)
            r2 = -720809(0xfffffffffff50057, float:NaN)
            r3.setTextColor(r2)
            r2 = 17
            r3.setGravity(r2)
            r1.addView(r3)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r6 = r21.getApplicationContext()
            r1.<init>(r6)
            r6 = 0
            r1.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r8 = -2
            r9 = 0
            r6.<init>(r2, r8, r9)
            r1.setLayoutParams(r6)
            r2 = -1118482(0xffffffffffeeeeee, float:NaN)
            r1.setBackgroundColor(r2)
            r2 = 17
            r1.setGravity(r2)
            r4.addView(r1)
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r2 = r21.getApplicationContext()
            r8.<init>(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = 210(0xd2, float:2.94E-43)
            r6 = 70
            r2.<init>(r4, r6, r9)
            r8.setLayoutParams(r2)
            java.lang.String r2 = "إلغاء"
            r8.setText(r2)
            r2 = 1096810496(0x41600000, float:14.0)
            r8.setTextSize(r2)
            r2 = -59580(0xffffffffffff1744, float:NaN)
            r8.setTextColor(r2)
            r2 = 17
            r8.setGravity(r2)
            r1.addView(r8)
            android.widget.TextView r9 = new android.widget.TextView
            android.content.Context r2 = r21.getApplicationContext()
            r9.<init>(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r16 = r14
            r6 = 70
            r14 = 0
            r2.<init>(r4, r6, r14)
            r9.setLayoutParams(r2)
            java.lang.String r2 = "موافق"
            r9.setText(r2)
            r2 = 1096810496(0x41600000, float:14.0)
            r9.setTextSize(r2)
            r2 = -59580(0xffffffffffff1744, float:NaN)
            r9.setTextColor(r2)
            r2 = 17
            r9.setGravity(r2)
            r1.addView(r9)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r6 = r21.getApplicationContext()
            r4.<init>(r6)
            r6 = 1
            r4.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r18 = r5
            r2 = -2
            r5 = -1
            r14 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r2, r5, r14)
            r4.setLayoutParams(r6)
            r2 = 17
            r4.setGravity(r2)
            r1.addView(r4)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$91 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$91     // Catch:{ Exception -> 0x041b }
            r1.<init>()     // Catch:{ Exception -> 0x041b }
            r2 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r4 = 2
            r6 = 8
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r6, r4, r2, r5)     // Catch:{ Exception -> 0x041b }
            r12.setBackground(r1)     // Catch:{ Exception -> 0x041b }
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$92 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$92     // Catch:{ Exception -> 0x041b }
            r1.<init>()     // Catch:{ Exception -> 0x041b }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r6, r4, r2, r5)     // Catch:{ Exception -> 0x041b }
            r10.setBackground(r1)     // Catch:{ Exception -> 0x041b }
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$93 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$93     // Catch:{ Exception -> 0x041b }
            r1.<init>()     // Catch:{ Exception -> 0x041b }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r6, r4, r2, r5)     // Catch:{ Exception -> 0x041b }
            r13.setBackground(r1)     // Catch:{ Exception -> 0x041b }
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$94 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$94     // Catch:{ Exception -> 0x041b }
            r1.<init>()     // Catch:{ Exception -> 0x041b }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r6, r4, r2, r5)     // Catch:{ Exception -> 0x041b }
            r12.setBackground(r1)     // Catch:{ Exception -> 0x041b }
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$95 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$95     // Catch:{ Exception -> 0x041b }
            r1.<init>()     // Catch:{ Exception -> 0x041b }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r6, r4, r2, r5)     // Catch:{ Exception -> 0x041b }
            r9.setBackground(r1)     // Catch:{ Exception -> 0x041b }
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$96 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$96     // Catch:{ Exception -> 0x041b }
            r1.<init>()     // Catch:{ Exception -> 0x041b }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r6, r4, r2, r5)     // Catch:{ Exception -> 0x041b }
            r8.setBackground(r1)     // Catch:{ Exception -> 0x041b }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x041b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x041b }
            r2 = 1
            r3.setTypeface(r1, r2)     // Catch:{ Exception -> 0x041b }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x041b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x041b }
            r15.setTypeface(r1, r2)     // Catch:{ Exception -> 0x041b }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x041b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x041b }
            r8.setTypeface(r1, r2)     // Catch:{ Exception -> 0x041b }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x041b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x041b }
            r11.setTypeface(r1, r2)     // Catch:{ Exception -> 0x041b }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x041b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x041b }
            r9.setTypeface(r1, r2)     // Catch:{ Exception -> 0x041b }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x041b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x041b }
            r3 = r18
            r3.setTypeface(r1, r2)     // Catch:{ Exception -> 0x041b }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x041b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x041b }
            r12.setTypeface(r1, r2)     // Catch:{ Exception -> 0x041b }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x041b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x041b }
            r10.setTypeface(r1, r2)     // Catch:{ Exception -> 0x041b }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x041b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x041b }
            r3 = r16
            r3.setTypeface(r1, r2)     // Catch:{ Exception -> 0x041b }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x041b }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x041b }
            r13.setTypeface(r1, r2)     // Catch:{ Exception -> 0x041b }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x041b }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x041b }
            r1 = r20
            r1.setTypeface(r0, r2)     // Catch:{ Exception -> 0x041b }
        L_0x041b:
            java.lang.CharSequence r0 = r22.getText()     // Catch:{ Exception -> 0x045c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x045c }
            r7.size = r0     // Catch:{ Exception -> 0x045c }
            r1 = 0
            java.lang.String r0 = r7.Spliter(r0, r1)     // Catch:{ Exception -> 0x045c }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x045c }
            long r0 = (long) r0     // Catch:{ Exception -> 0x045c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x045c }
            r13.setText(r0)     // Catch:{ Exception -> 0x045c }
            java.lang.String r0 = r7.size     // Catch:{ Exception -> 0x045c }
            r1 = 1
            java.lang.String r0 = r7.Spliter(r0, r1)     // Catch:{ Exception -> 0x045c }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x045c }
            long r0 = (long) r0     // Catch:{ Exception -> 0x045c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x045c }
            r10.setText(r0)     // Catch:{ Exception -> 0x045c }
            java.lang.String r0 = r7.size     // Catch:{ Exception -> 0x045c }
            r1 = 2
            java.lang.String r0 = r7.Spliter(r0, r1)     // Catch:{ Exception -> 0x045c }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x045c }
            long r0 = (long) r0     // Catch:{ Exception -> 0x045c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x045c }
            r12.setText(r0)     // Catch:{ Exception -> 0x045c }
        L_0x045c:
            java.lang.String r0 = "إكتب التمدد"
            r12.setHint(r0)
            java.lang.String r0 = "إكتب الارتفاع"
            r10.setHint(r0)
            java.lang.String r0 = "إكتب العرض"
            r13.setHint(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$97 r11 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$97
            r0 = r11
            r1 = r21
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r22
            r6 = r17
            r0.<init>(r2, r3, r4, r5, r6)
            r9.setOnClickListener(r11)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$98 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$98
            r1 = r17
            r0.<init>(r12, r1)
            r8.setOnClickListener(r0)
            r0 = 12290(0x3002, float:1.7222E-41)
            r12.setInputType(r0)
            r10.setInputType(r0)
            r13.setInputType(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$99 r0 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$99
            r0.<init>(r10)
            r7.timer_5 = r0
            java.util.Timer r2 = r7._timer
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
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.Size_WHW(android.widget.TextView):void");
    }

    public void Font_1(TextView textView) {
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
        final LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
        linearLayout2.setOrientation(1);
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 70, 0.0f));
        textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView2.setTextSize(18.0f);
        textView2.setText("☆ إختيار الخط المناسب ☆");
        textView2.setGravity(17);
        linearLayout.addView(textView2);
        textView2.setBackgroundColor(-657931);
        textView2.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -657931));
        this.z = 0.0d;
        final TextView textView3 = textView;
        AnonymousClass101 r14 = new TimerTask() {
            public void run() {
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                final AlertDialog alertDialog = create;
                final TextView textView = textView3;
                final LinearLayout linearLayout = linearLayout2;
                enterExzamActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        EnterExzamActivity.this.VV(alertDialog, textView, linearLayout);
                    }
                });
            }
        };
        this.timer_5 = r14;
        this._timer.schedule(r14, 22);
        scrollView.addView(linearLayout2);
        linearLayout.addView(scrollView);
        TextView textView4 = new TextView(getApplicationContext());
        textView4.setLayoutParams(new LinearLayout.LayoutParams(-1, 70, 0.0f));
        textView4.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView4.setTextSize(14.0f);
        try {
            textView4.setText("إلغاء");
        } catch (Exception unused) {
            textView4.setText(BuildConfig.FLAVOR);
        }
        textView4.setGravity(17);
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        linearLayout.addView(textView4);
        try {
            textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        } catch (Exception unused2) {
        }
        textView4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -657931));
        linearLayout.setBackgroundColor(-657931);
        linearLayout.setPadding(3, 3, 3, 3);
        create.setView(linearLayout);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        create.getWindow().setLayout(-2, -1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|5|6|7|8|9|11|12|23|(2:24|25)|26|28) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x00db */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0157 A[FALL_THROUGH] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void VV(android.app.AlertDialog r17, android.widget.TextView r18, android.widget.LinearLayout r19) {
        /*
            r16 = this;
            r6 = r16
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r0 = r16.getApplicationContext()
            r3.<init>(r0)
            r0 = 1
            r3.setOrientation(r0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r4 = -2
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r4, r5)
            r7 = 2
            r8 = 3
            r1.setMargins(r7, r8, r7, r7)
            r3.setLayoutParams(r1)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$104 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$104
            r1.<init>()
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r7, r0, r9, r2)
            r3.setBackground(r1)
            java.util.ArrayList<java.lang.String> r1 = r6.List_fonts
            double r10 = r6.z
            int r10 = (int) r10
            java.lang.Object r1 = r1.get(r10)
            java.lang.String r1 = (java.lang.String) r1
            android.widget.TextView r10 = new android.widget.TextView
            android.content.Context r11 = r16.getApplicationContext()
            r10.<init>(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r12 = 0
            r11.<init>(r2, r4, r12)
            r10.setLayoutParams(r11)
            r11 = -720809(0xfffffffffff50057, float:NaN)
            r10.setTextColor(r11)
            r11 = 1092616192(0x41200000, float:10.0)
            r10.setTextSize(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0073 }
            java.lang.String r13 = "     ( "
            r11.<init>(r13)     // Catch:{ Exception -> 0x0073 }
            double r13 = r6.z     // Catch:{ Exception -> 0x0073 }
            int r13 = (int) r13     // Catch:{ Exception -> 0x0073 }
            r11.append(r13)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r13 = " )    "
            r11.append(r13)     // Catch:{ Exception -> 0x0073 }
            r11.append(r1)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0073 }
            r10.setText(r11)     // Catch:{ Exception -> 0x0073 }
            goto L_0x0078
        L_0x0073:
            java.lang.String r11 = ""
            r10.setText(r11)
        L_0x0078:
            r11 = 17
            r10.setGravity(r11)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$105 r13 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$105
            r13.<init>()
            r10.setOnClickListener(r13)
            r3.addView(r10)
            android.widget.TextView r13 = new android.widget.TextView
            android.content.Context r14 = r16.getApplicationContext()
            r13.<init>(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r2, r4, r12)
            r13.setLayoutParams(r14)
            r13.setTextColor(r9)
            double r14 = r6.Font_size
            int r4 = (int) r14
            float r4 = (float) r4
            r13.setTextSize(r4)
            java.lang.String r4 = r6.Text
            r13.setText(r4)
            r13.setGravity(r11)
            r3.addView(r13)
            r13.setLines(r8)
            java.lang.String r4 = "ناســــــا سوفت للبرمجة والتطوير\nالمبرمـــج/ نبيل عبدالقادر الصبري\nللتواصل:-00967 772666391"
            r13.setHint(r4)
            r13.setHintTextColor(r9)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$106 r4 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$106
            r8 = r17
            r9 = r18
            r4.<init>(r9, r1, r8)
            r3.setOnClickListener(r4)
            r4 = 4
            r12 = 0
            r3.setPadding(r4, r12, r4, r12)
            android.widget.TextView r4 = r6.text_font_color     // Catch:{ Exception -> 0x00db }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x00db }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00db }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x00db }
            r13.setTextColor(r4)     // Catch:{ Exception -> 0x00db }
        L_0x00db:
            android.widget.TextView r4 = r6.text_Dell     // Catch:{ Exception -> 0x0121 }
            java.lang.CharSequence r4 = r4.getText()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r4 = r6.Spliter(r4, r12)     // Catch:{ Exception -> 0x0121 }
            double r14 = java.lang.Double.parseDouble(r4)     // Catch:{ Exception -> 0x0121 }
            int r4 = (int) r14     // Catch:{ Exception -> 0x0121 }
            float r4 = (float) r4     // Catch:{ Exception -> 0x0121 }
            android.widget.TextView r12 = r6.text_Dell     // Catch:{ Exception -> 0x0121 }
            java.lang.CharSequence r12 = r12.getText()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r12 = r6.Spliter(r12, r0)     // Catch:{ Exception -> 0x0121 }
            double r14 = java.lang.Double.parseDouble(r12)     // Catch:{ Exception -> 0x0121 }
            int r12 = (int) r14     // Catch:{ Exception -> 0x0121 }
            float r12 = (float) r12     // Catch:{ Exception -> 0x0121 }
            android.widget.TextView r14 = r6.text_Dell     // Catch:{ Exception -> 0x0121 }
            java.lang.CharSequence r14 = r14.getText()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r7 = r6.Spliter(r14, r7)     // Catch:{ Exception -> 0x0121 }
            double r14 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x0121 }
            int r7 = (int) r14     // Catch:{ Exception -> 0x0121 }
            float r7 = (float) r7     // Catch:{ Exception -> 0x0121 }
            java.lang.String r14 = r6.abC_color     // Catch:{ Exception -> 0x0121 }
            int r14 = android.graphics.Color.parseColor(r14)     // Catch:{ Exception -> 0x0121 }
            r13.setShadowLayer(r4, r12, r7, r14)     // Catch:{ Exception -> 0x0121 }
            goto L_0x0122
        L_0x0121:
        L_0x0122:
            java.lang.String r4 = r6.T_W
            int r7 = r4.hashCode()
            r12 = 19
            switch(r7) {
                case 49: goto L_0x0148;
                case 50: goto L_0x013b;
                case 51: goto L_0x012e;
                default: goto L_0x012d;
            }
        L_0x012d:
            goto L_0x0157
        L_0x012e:
            java.lang.String r7 = "3"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0137
            goto L_0x0157
        L_0x0137:
            r13.setGravity(r11)
            goto L_0x015a
        L_0x013b:
            java.lang.String r7 = "2"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0144
            goto L_0x0157
        L_0x0144:
            r13.setGravity(r12)
            goto L_0x015a
        L_0x0148:
            java.lang.String r7 = "1"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0151
            goto L_0x0157
        L_0x0151:
            r4 = 21
            r13.setGravity(r4)
            goto L_0x015a
        L_0x0157:
            r13.setGravity(r11)
        L_0x015a:
            r3.setGravity(r11)
            android.content.res.AssetManager r4 = r16.getAssets()     // Catch:{ Exception -> 0x0179 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            java.lang.String r11 = "fonts/"
            r7.<init>(r11)     // Catch:{ Exception -> 0x0179 }
            r7.append(r1)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x0179 }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r4, r1)     // Catch:{ Exception -> 0x0179 }
            double r14 = r6.F_stay     // Catch:{ Exception -> 0x0179 }
            int r4 = (int) r14     // Catch:{ Exception -> 0x0179 }
            r13.setTypeface(r1, r4)     // Catch:{ Exception -> 0x0179 }
        L_0x0179:
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r2, r2, r5)
            r1.setMargins(r0, r0, r0, r0)
            r13.setLayoutParams(r1)
            r10.setGravity(r12)
            r0 = 1098907648(0x41800000, float:16.0)
            r13.setTextSize(r0)
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$107 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$107
            r0 = r7
            r1 = r16
            r2 = r19
            r4 = r17
            r5 = r18
            r0.<init>(r2, r3, r4, r5)
            r6.timer_5 = r7
            java.util.Timer r0 = r6._timer
            r1 = 4
            r0.schedule(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity.VV(android.app.AlertDialog, android.widget.TextView, android.widget.LinearLayout):void");
    }

    public void dialog_Th(TextView textView) {
        TextView textView2;
        final TextView textView3;
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
        textView5.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 0.0f));
        textView5.setPadding(8, 8, 8, 8);
        textView5.setText("ناسا سوفت للبرمجه والتطوير");
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
        LinearLayout linearLayout6 = linearLayout;
        LinearLayout linearLayout7 = linearLayout4;
        seekBar.setLayoutParams(new LinearLayout.LayoutParams(87, 70, 1.0f));
        linearLayout5.addView(seekBar);
        TextView textView9 = new TextView(getApplicationContext());
        AlertDialog alertDialog = create;
        textView9.setLayoutParams(new LinearLayout.LayoutParams(105, -1, 0.0f));
        textView9.setBackgroundColor(-657931);
        textView9.setText("مستوى الظل》");
        textView9.setTextSize(12.0f);
        textView9.setTextColor(-13172557);
        textView9.setGravity(17);
        linearLayout5.addView(textView9);
        LinearLayout linearLayout8 = new LinearLayout(getApplicationContext());
        linearLayout8.setOrientation(0);
        TextView textView10 = textView5;
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
        TextView textView13 = textView9;
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
        linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(-1, 70, 0.0f));
        linearLayout9.setPadding(4, 4, 4, 4);
        linearLayout9.setBackgroundColor(-1);
        linearLayout2.addView(linearLayout9);
        TextView textView16 = new TextView(getApplicationContext());
        LinearLayout linearLayout10 = linearLayout8;
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
        TextView textView17 = new TextView(getApplicationContext());
        TextView textView18 = textView16;
        textView17.setLayoutParams(new LinearLayout.LayoutParams(105, -1, 0.0f));
        textView17.setBackgroundColor(-657931);
        textView17.setText("تحريك》 ");
        textView17.setTextSize(12.0f);
        textView17.setTextColor(-13172557);
        textView17.setGravity(17);
        linearLayout9.addView(textView17);
        LinearLayout linearLayout11 = new LinearLayout(getApplicationContext());
        linearLayout11.setOrientation(0);
        LinearLayout linearLayout12 = linearLayout9;
        linearLayout11.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout11.setPadding(8, 8, 8, 8);
        linearLayout2.addView(linearLayout11);
        TextView textView19 = new TextView(getApplicationContext());
        textView19.setLayoutParams(new LinearLayout.LayoutParams(210, 80, 1.0f));
        textView19.setBackgroundColor(-657931);
        textView19.setText("Cancel");
        textView19.setTextSize(16.0f);
        textView19.setTextColor(-13172557);
        textView19.setGravity(17);
        linearLayout11.addView(textView19);
        TextView textView20 = new TextView(getApplicationContext());
        TextView textView21 = textView17;
        textView20.setLayoutParams(new LinearLayout.LayoutParams(210, 80, 1.0f));
        textView20.setBackgroundColor(-657931);
        textView20.setText("OK");
        textView20.setTextSize(16.0f);
        textView20.setTextColor(-13172557);
        textView20.setGravity(17);
        linearLayout11.addView(textView20);
        textView4.setText("إعـــداد ".concat(" (للون +زوياء ) الظــــــل "));
        textView19.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(360, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        textView20.setBackground(new GradientDrawable() {
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
                this.text_back_color.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                textView3 = textView18;
                try {
                    textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                    textView13.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                    textView12.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                    textView21.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                    textView20.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                    textView19.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                textView3 = textView18;
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
                TextView textView22 = textView10;
                _set_TextView(textView22);
                final TextView textView23 = textView8;
                AnonymousClass114 r14 = r0;
                final TextView textView24 = textView22;
                TextView textView25 = textView22;
                final TextView textView26 = textView2;
                TextView textView27 = textView3;
                AnonymousClass114 r0 = new SeekBar.OnSeekBarChangeListener() {
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        textView23.setText(String.valueOf((long) i));
                        try {
                            textView24.setShadowLayer((float) Integer.parseInt(textView23.getText().toString()), (float) Integer.parseInt(textView26.getText().toString()), (float) Integer.parseInt(textView3.getText().toString()), Color.parseColor(EnterExzamActivity.this.abC_color));
                        } catch (Exception unused) {
                        }
                    }
                };
                seekBar.setOnSeekBarChangeListener(r14);
                final TextView textView28 = textView2;
                final TextView textView29 = textView25;
                final TextView textView30 = textView8;
                seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        textView28.setText(String.valueOf((long) (i - 15)));
                        try {
                            textView29.setShadowLayer((float) Integer.parseInt(textView30.getText().toString()), (float) Integer.parseInt(textView28.getText().toString()), (float) Integer.parseInt(textView3.getText().toString()), Color.parseColor(EnterExzamActivity.this.abC_color));
                        } catch (Exception unused) {
                        }
                    }
                });
                final TextView textView31 = textView27;
                final TextView textView32 = textView2;
                seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }

                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }

                    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                        textView31.setText(String.valueOf((long) (i - 15)));
                        try {
                            textView29.setShadowLayer((float) Integer.parseInt(textView30.getText().toString()), (float) Integer.parseInt(textView32.getText().toString()), (float) Integer.parseInt(textView31.getText().toString()), Color.parseColor(EnterExzamActivity.this.abC_color));
                        } catch (Exception unused) {
                        }
                    }
                });
                seekBar.setProgress((int) Double.parseDouble(Spliter(this.abC, 0)));
                seekBar2.setProgress(((int) Double.parseDouble(Spliter(this.abC, 1))) + 15);
                seekBar3.setProgress(((int) Double.parseDouble(Spliter(this.abC, 2))) + 15);
                final TextView textView33 = textView6;
                final TextView textView34 = textView;
                final TextView textView35 = textView8;
                final TextView textView36 = textView2;
                TextView textView37 = textView25;
                final TextView textView38 = textView27;
                final AlertDialog alertDialog2 = alertDialog;
                textView20.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        EnterExzamActivity.this.abC_color = textView33.getText().toString();
                        textView34.setText(textView35.getText().toString().concat(",".concat(textView36.getText().toString().concat(",".concat(textView38.getText().toString())))));
                        EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                        enterExzamActivity._set_TextView(enterExzamActivity.edittext1);
                        alertDialog2.dismiss();
                    }
                });
                textView19.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        alertDialog2.dismiss();
                    }
                });
                final TextView textView39 = textView8;
                final TextView textView40 = textView2;
                final TextView textView41 = textView27;
                final TextView textView42 = textView6;
                final TextView textView43 = textView37;
                linearLayout7.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        EnterExzamActivity.this.abC = textView39.getText().toString().concat(",".concat(textView40.getText().toString().concat(",".concat(textView41.getText().toString()))));
                        EnterExzamActivity.this.abC_color = textView42.getText().toString();
                        EnterExzamActivity.this.Dialog_color_deel(textView43, textView42);
                    }
                });
                GradientDrawable gradientDrawable = new GradientDrawable();
                int i = (int) getApplicationContext().getResources().getDisplayMetrics().density;
                gradientDrawable.setColor(Color.parseColor(this.abC_color));
                float f = (float) i;
                gradientDrawable.setCornerRadii(new float[]{Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, f * Float.parseFloat(String.valueOf(0))});
                gradientDrawable.setStroke(i * 2, Color.parseColor("#FF000000"));
                textView6.setElevation((float) (i * 4));
                textView6.setBackground(gradientDrawable);
                textView6.setText(this.abC_color);
                _set_TextView(textView37);
                alertDialog2.setView(linearLayout6);
                alertDialog2.show();
                alertDialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                alertDialog2.getWindow().setLayout(-2, -2);
            }
        } catch (Exception unused3) {
            textView3 = textView18;
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
            TextView textView222 = textView10;
            _set_TextView(textView222);
            final TextView textView232 = textView8;
            AnonymousClass114 r142 = r0;
            final TextView textView242 = textView222;
            TextView textView252 = textView222;
            final TextView textView262 = textView2;
            TextView textView272 = textView3;
            AnonymousClass114 r02 = new SeekBar.OnSeekBarChangeListener() {
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                }

                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    textView232.setText(String.valueOf((long) i));
                    try {
                        textView242.setShadowLayer((float) Integer.parseInt(textView232.getText().toString()), (float) Integer.parseInt(textView262.getText().toString()), (float) Integer.parseInt(textView3.getText().toString()), Color.parseColor(EnterExzamActivity.this.abC_color));
                    } catch (Exception unused) {
                    }
                }
            };
            seekBar.setOnSeekBarChangeListener(r142);
            final TextView textView282 = textView2;
            final TextView textView292 = textView252;
            final TextView textView302 = textView8;
            seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                }

                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    textView282.setText(String.valueOf((long) (i - 15)));
                    try {
                        textView292.setShadowLayer((float) Integer.parseInt(textView302.getText().toString()), (float) Integer.parseInt(textView282.getText().toString()), (float) Integer.parseInt(textView3.getText().toString()), Color.parseColor(EnterExzamActivity.this.abC_color));
                    } catch (Exception unused) {
                    }
                }
            });
            final TextView textView312 = textView272;
            final TextView textView322 = textView2;
            seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                public void onStopTrackingTouch(SeekBar seekBar) {
                }

                public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    textView312.setText(String.valueOf((long) (i - 15)));
                    try {
                        textView292.setShadowLayer((float) Integer.parseInt(textView302.getText().toString()), (float) Integer.parseInt(textView322.getText().toString()), (float) Integer.parseInt(textView312.getText().toString()), Color.parseColor(EnterExzamActivity.this.abC_color));
                    } catch (Exception unused) {
                    }
                }
            });
            seekBar.setProgress((int) Double.parseDouble(Spliter(this.abC, 0)));
            seekBar2.setProgress(((int) Double.parseDouble(Spliter(this.abC, 1))) + 15);
            seekBar3.setProgress(((int) Double.parseDouble(Spliter(this.abC, 2))) + 15);
            final TextView textView332 = textView6;
            final TextView textView342 = textView;
            final TextView textView352 = textView8;
            final TextView textView362 = textView2;
            TextView textView372 = textView252;
            final TextView textView382 = textView272;
            final AlertDialog alertDialog22 = alertDialog;
            textView20.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this.abC_color = textView332.getText().toString();
                    textView342.setText(textView352.getText().toString().concat(",".concat(textView362.getText().toString().concat(",".concat(textView382.getText().toString())))));
                    EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                    enterExzamActivity._set_TextView(enterExzamActivity.edittext1);
                    alertDialog22.dismiss();
                }
            });
            textView19.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    alertDialog22.dismiss();
                }
            });
            final TextView textView392 = textView8;
            final TextView textView402 = textView2;
            final TextView textView412 = textView272;
            final TextView textView422 = textView6;
            final TextView textView432 = textView372;
            linearLayout7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this.abC = textView392.getText().toString().concat(",".concat(textView402.getText().toString().concat(",".concat(textView412.getText().toString()))));
                    EnterExzamActivity.this.abC_color = textView422.getText().toString();
                    EnterExzamActivity.this.Dialog_color_deel(textView432, textView422);
                }
            });
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            int i2 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
            gradientDrawable2.setColor(Color.parseColor(this.abC_color));
            float f2 = (float) i2;
            gradientDrawable2.setCornerRadii(new float[]{Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, Float.parseFloat(String.valueOf(0)) * f2, f2 * Float.parseFloat(String.valueOf(0))});
            gradientDrawable2.setStroke(i2 * 2, Color.parseColor("#FF000000"));
            textView6.setElevation((float) (i2 * 4));
            textView6.setBackground(gradientDrawable2);
            textView6.setText(this.abC_color);
            _set_TextView(textView372);
            alertDialog22.setView(linearLayout6);
            alertDialog22.show();
            alertDialog22.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            alertDialog22.getWindow().setLayout(-2, -2);
        }
        TextView textView2222 = textView10;
        _set_TextView(textView2222);
        final TextView textView2322 = textView8;
        AnonymousClass114 r1422 = r02;
        final TextView textView2422 = textView2222;
        TextView textView2522 = textView2222;
        final TextView textView2622 = textView2;
        TextView textView2722 = textView3;
        AnonymousClass114 r022 = new SeekBar.OnSeekBarChangeListener() {
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                textView2322.setText(String.valueOf((long) i));
                try {
                    textView2422.setShadowLayer((float) Integer.parseInt(textView2322.getText().toString()), (float) Integer.parseInt(textView2622.getText().toString()), (float) Integer.parseInt(textView3.getText().toString()), Color.parseColor(EnterExzamActivity.this.abC_color));
                } catch (Exception unused) {
                }
            }
        };
        seekBar.setOnSeekBarChangeListener(r1422);
        final TextView textView2822 = textView2;
        final TextView textView2922 = textView2522;
        final TextView textView3022 = textView8;
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                textView2822.setText(String.valueOf((long) (i - 15)));
                try {
                    textView2922.setShadowLayer((float) Integer.parseInt(textView3022.getText().toString()), (float) Integer.parseInt(textView2822.getText().toString()), (float) Integer.parseInt(textView3.getText().toString()), Color.parseColor(EnterExzamActivity.this.abC_color));
                } catch (Exception unused) {
                }
            }
        });
        final TextView textView3122 = textView2722;
        final TextView textView3222 = textView2;
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                textView3122.setText(String.valueOf((long) (i - 15)));
                try {
                    textView2922.setShadowLayer((float) Integer.parseInt(textView3022.getText().toString()), (float) Integer.parseInt(textView3222.getText().toString()), (float) Integer.parseInt(textView3122.getText().toString()), Color.parseColor(EnterExzamActivity.this.abC_color));
                } catch (Exception unused) {
                }
            }
        });
        try {
            seekBar.setProgress((int) Double.parseDouble(Spliter(this.abC, 0)));
            seekBar2.setProgress(((int) Double.parseDouble(Spliter(this.abC, 1))) + 15);
            seekBar3.setProgress(((int) Double.parseDouble(Spliter(this.abC, 2))) + 15);
        } catch (Exception unused4) {
        }
        final TextView textView3322 = textView6;
        final TextView textView3422 = textView;
        final TextView textView3522 = textView8;
        final TextView textView3622 = textView2;
        TextView textView3722 = textView2522;
        final TextView textView3822 = textView2722;
        final AlertDialog alertDialog222 = alertDialog;
        textView20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this.abC_color = textView3322.getText().toString();
                textView3422.setText(textView3522.getText().toString().concat(",".concat(textView3622.getText().toString().concat(",".concat(textView3822.getText().toString())))));
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                enterExzamActivity._set_TextView(enterExzamActivity.edittext1);
                alertDialog222.dismiss();
            }
        });
        textView19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                alertDialog222.dismiss();
            }
        });
        final TextView textView3922 = textView8;
        final TextView textView4022 = textView2;
        final TextView textView4122 = textView2722;
        final TextView textView4222 = textView6;
        final TextView textView4322 = textView3722;
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this.abC = textView3922.getText().toString().concat(",".concat(textView4022.getText().toString().concat(",".concat(textView4122.getText().toString()))));
                EnterExzamActivity.this.abC_color = textView4222.getText().toString();
                EnterExzamActivity.this.Dialog_color_deel(textView4322, textView4222);
            }
        });
        GradientDrawable gradientDrawable22 = new GradientDrawable();
        int i22 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
        gradientDrawable22.setColor(Color.parseColor(this.abC_color));
        float f22 = (float) i22;
        gradientDrawable22.setCornerRadii(new float[]{Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, Float.parseFloat(String.valueOf(0)) * f22, f22 * Float.parseFloat(String.valueOf(0))});
        gradientDrawable22.setStroke(i22 * 2, Color.parseColor("#FF000000"));
        textView6.setElevation((float) (i22 * 4));
        textView6.setBackground(gradientDrawable22);
        textView6.setText(this.abC_color);
        try {
            _set_TextView(textView3722);
        } catch (Exception unused5) {
        }
        alertDialog222.setView(linearLayout6);
        alertDialog222.show();
        alertDialog222.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        alertDialog222.getWindow().setLayout(-2, -2);
    }

    public void Dialog_color_deel(TextView textView, TextView textView2) {
        int i;
        TextView textView3;
        LinearLayout linearLayout;
        int i2;
        EnterExzamActivity enterExzamActivity = this;
        enterExzamActivity.abC_color = textView2.getText().toString();
        final AlertDialog create = new AlertDialog.Builder(enterExzamActivity).create();
        LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
        int i3 = -1;
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        LinearLayout linearLayout3 = new LinearLayout(getApplicationContext());
        linearLayout3.setOrientation(1);
        float f = 0.0f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        int i4 = 2;
        layoutParams.setMargins(2, 2, 2, 2);
        linearLayout3.setLayoutParams(layoutParams);
        linearLayout3.setPadding(12, 12, 12, 12);
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        int i5 = 0;
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams2.setMargins(0, 0, 0, 2);
        linearLayout4.setLayoutParams(layoutParams2);
        linearLayout4.setPadding(12, 12, 12, 12);
        linearLayout4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -657931));
        linearLayout3.setGravity(17);
        ImageView imageView = new ImageView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(45, 60, 0.0f);
        layoutParams3.setMargins(1, 1, 1, 1);
        imageView.setLayoutParams(layoutParams3);
        imageView.setImageResource(R.drawable.ulang_19);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        linearLayout4.addView(imageView);
        TextView textView4 = new TextView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 60, 0.0f);
        layoutParams4.setMargins(0, 2, 2, 0);
        textView4.setLayoutParams(layoutParams4);
        textView4.setTextColor(-1499549);
        textView4.setTextSize(14.0f);
        textView4.setGravity(17);
        linearLayout4.addView(textView4);
        linearLayout3.addView(linearLayout4);
        LinearLayout linearLayout5 = new LinearLayout(getApplicationContext());
        linearLayout5.setOrientation(0);
        int i6 = 3;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams5.setMargins(0, 2, 2, 0);
        linearLayout5.setLayoutParams(layoutParams5);
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -1118482));
        linearLayout3.addView(linearLayout5);
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        linearLayout6.setOrientation(0);
        float f2 = 1.0f;
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams6.setMargins(2, 3, 3, 2);
        linearLayout6.setLayoutParams(layoutParams6);
        linearLayout6.setGravity(53);
        linearLayout6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -720809));
        textView4.setText("اعداد لون الظل ");
        int i7 = 0;
        int i8 = 0;
        while (i8 < ((int) Math.ceil((double) (enterExzamActivity.Color_list.size() / 12)))) {
            LinearLayout linearLayout7 = new LinearLayout(getApplicationContext());
            linearLayout7.setOrientation(i5);
            int i9 = i7;
            int i10 = 0;
            int i11 = 12;
            while (i10 < i11) {
                if (i9 < enterExzamActivity.Color_list.size()) {
                    String str = enterExzamActivity.Color_list.get(i9);
                    LinearLayout linearLayout8 = new LinearLayout(getApplicationContext());
                    linearLayout8.setOrientation(1);
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(40, 60, f2);
                    layoutParams7.setMargins(1, 1, 1, 1);
                    linearLayout8.setLayoutParams(layoutParams7);
                    linearLayout8.setBackgroundColor(Color.parseColor(str));
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
                        linearLayout8.addView(textView5);
                    }
                    i = i10;
                    i2 = i9;
                    final String str2 = str;
                    final TextView textView6 = textView2;
                    textView3 = textView4;
                    final TextView textView7 = textView;
                    linearLayout = linearLayout7;
                    final AlertDialog alertDialog = create;
                    linearLayout8.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            int i = (int) EnterExzamActivity.this.getApplicationContext().getResources().getDisplayMetrics().density;
                            gradientDrawable.setColor(Color.parseColor(str2));
                            float f = (float) i;
                            gradientDrawable.setCornerRadii(new float[]{Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, Float.parseFloat(String.valueOf(0)) * f, f * Float.parseFloat(String.valueOf(0))});
                            gradientDrawable.setStroke(i * 2, Color.parseColor("#FF000000"));
                            textView6.setElevation((float) (i * 4));
                            textView6.setBackground(gradientDrawable);
                            textView6.setText(str2);
                            EnterExzamActivity.this.abC_color = str2;
                            try {
                                TextView textView = textView7;
                                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                                EnterExzamActivity enterExzamActivity2 = EnterExzamActivity.this;
                                EnterExzamActivity enterExzamActivity3 = EnterExzamActivity.this;
                                textView.setShadowLayer((float) Integer.parseInt(enterExzamActivity.Spliter(enterExzamActivity.abC, 0)), (float) Integer.parseInt(enterExzamActivity2.Spliter(enterExzamActivity2.abC, 1)), Float.parseFloat(enterExzamActivity3.Spliter(enterExzamActivity3.abC, 2)), Color.parseColor(EnterExzamActivity.this.abC_color));
                            } catch (Exception unused) {
                            }
                            alertDialog.dismiss();
                        }
                    });
                    linearLayout.addView(linearLayout8);
                } else {
                    i = i10;
                    linearLayout = linearLayout7;
                    i2 = i9;
                    textView3 = textView4;
                }
                i9 = i2 + 1;
                i10 = i + 1;
                enterExzamActivity = this;
                linearLayout7 = linearLayout;
                textView4 = textView3;
                i5 = 0;
                i11 = 12;
                i3 = -1;
                f2 = 1.0f;
                i6 = 3;
                f = 0.0f;
            }
            linearLayout3.addView(linearLayout7);
            i8++;
            i7 = i9;
            i4 = 2;
        }
        LinearLayout linearLayout9 = new LinearLayout(getApplicationContext());
        linearLayout9.setOrientation(i5);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(i3, i6, f);
        layoutParams9.setMargins(i5, 4, i5, 4);
        linearLayout9.setLayoutParams(layoutParams9);
        linearLayout3.addView(linearLayout9);
        linearLayout9.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(i5, i5, ViewCompat.MEASURED_STATE_MASK, -1118482));
        LinearLayout linearLayout10 = new LinearLayout(getApplicationContext());
        linearLayout10.setOrientation(i5);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(i3, -2, f);
        layoutParams10.setMargins(i5, 8, 1, i5);
        linearLayout10.setLayoutParams(layoutParams10);
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
        linearLayout10.addView(textView8);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(200, 80, f2);
        layoutParams11.setMargins(10, 1, 1, 10);
        textView8.setLayoutParams(layoutParams11);
        textView8.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(10, i4, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout3.addView(linearLayout10);
        linearLayout2.addView(linearLayout3);
        try {
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView8.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        } catch (Exception unused) {
        }
        create.setView(linearLayout2);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(i5));
        create.getWindow().setLayout(i3, -2);
        textView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x037e */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0390 A[SYNTHETIC, Splitter:B:23:0x0390] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _start_on() {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = "#FF000000"
            r2 = 3
            r3 = 1
            r4 = 4
            r5 = 0
            r6 = 2
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable     // Catch:{ Exception -> 0x01f9 }
            r7.<init>()     // Catch:{ Exception -> 0x01f9 }
            android.content.Context r8 = r20.getApplicationContext()     // Catch:{ Exception -> 0x01f9 }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ Exception -> 0x01f9 }
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()     // Catch:{ Exception -> 0x01f9 }
            float r8 = r8.density     // Catch:{ Exception -> 0x01f9 }
            int r8 = (int) r8     // Catch:{ Exception -> 0x01f9 }
            android.widget.TextView r9 = r0.text_font_color     // Catch:{ Exception -> 0x01f9 }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x01f9 }
            int r9 = android.graphics.Color.parseColor(r9)     // Catch:{ Exception -> 0x01f9 }
            r7.setColor(r9)     // Catch:{ Exception -> 0x01f9 }
            r9 = 8
            float[] r10 = new float[r9]     // Catch:{ Exception -> 0x01f9 }
            float r11 = (float) r8     // Catch:{ Exception -> 0x01f9 }
            r12 = 2
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r14 = java.lang.Float.parseFloat(r14)     // Catch:{ Exception -> 0x01f9 }
            float r14 = r14 * r11
            r10[r5] = r14     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r14 = java.lang.Float.parseFloat(r14)     // Catch:{ Exception -> 0x01f9 }
            float r14 = r14 * r11
            r10[r3] = r14     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r14 = java.lang.Float.parseFloat(r14)     // Catch:{ Exception -> 0x01f9 }
            float r14 = r14 * r11
            r10[r6] = r14     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r14 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r14 = java.lang.Float.parseFloat(r14)     // Catch:{ Exception -> 0x01f9 }
            float r14 = r14 * r11
            r10[r2] = r14     // Catch:{ Exception -> 0x01f9 }
            r14 = 0
            java.lang.String r16 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x01f9 }
            float r16 = java.lang.Float.parseFloat(r16)     // Catch:{ Exception -> 0x01f9 }
            float r16 = r16 * r11
            r10[r4] = r16     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r16 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x01f9 }
            float r16 = java.lang.Float.parseFloat(r16)     // Catch:{ Exception -> 0x01f9 }
            float r16 = r16 * r11
            r17 = 5
            r10[r17] = r16     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r16 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r16 = java.lang.Float.parseFloat(r16)     // Catch:{ Exception -> 0x01f9 }
            float r16 = r16 * r11
            r18 = 6
            r10[r18] = r16     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r16 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r16 = java.lang.Float.parseFloat(r16)     // Catch:{ Exception -> 0x01f9 }
            float r11 = r11 * r16
            r16 = 7
            r10[r16] = r11     // Catch:{ Exception -> 0x01f9 }
            r7.setCornerRadii(r10)     // Catch:{ Exception -> 0x01f9 }
            int r10 = r8 * 1
            int r11 = android.graphics.Color.parseColor(r1)     // Catch:{ Exception -> 0x01f9 }
            r7.setStroke(r10, r11)     // Catch:{ Exception -> 0x01f9 }
            android.widget.TextView r10 = r0.text_font_color     // Catch:{ Exception -> 0x01f9 }
            int r8 = r8 * 4
            float r8 = (float) r8     // Catch:{ Exception -> 0x01f9 }
            r10.setElevation(r8)     // Catch:{ Exception -> 0x01f9 }
            android.widget.TextView r8 = r0.text_font_color     // Catch:{ Exception -> 0x01f9 }
            r8.setBackground(r7)     // Catch:{ Exception -> 0x01f9 }
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable     // Catch:{ Exception -> 0x01f9 }
            r7.<init>()     // Catch:{ Exception -> 0x01f9 }
            android.content.Context r8 = r20.getApplicationContext()     // Catch:{ Exception -> 0x01f9 }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ Exception -> 0x01f9 }
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()     // Catch:{ Exception -> 0x01f9 }
            float r8 = r8.density     // Catch:{ Exception -> 0x01f9 }
            int r8 = (int) r8     // Catch:{ Exception -> 0x01f9 }
            android.widget.TextView r10 = r0.text_back_color     // Catch:{ Exception -> 0x01f9 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01f9 }
            int r10 = android.graphics.Color.parseColor(r10)     // Catch:{ Exception -> 0x01f9 }
            r7.setColor(r10)     // Catch:{ Exception -> 0x01f9 }
            float[] r10 = new float[r9]     // Catch:{ Exception -> 0x01f9 }
            float r11 = (float) r8     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r19 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r19 = java.lang.Float.parseFloat(r19)     // Catch:{ Exception -> 0x01f9 }
            float r19 = r19 * r11
            r10[r5] = r19     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r19 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r19 = java.lang.Float.parseFloat(r19)     // Catch:{ Exception -> 0x01f9 }
            float r19 = r19 * r11
            r10[r3] = r19     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r19 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r19 = java.lang.Float.parseFloat(r19)     // Catch:{ Exception -> 0x01f9 }
            float r19 = r19 * r11
            r10[r6] = r19     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r19 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r19 = java.lang.Float.parseFloat(r19)     // Catch:{ Exception -> 0x01f9 }
            float r19 = r19 * r11
            r10[r2] = r19     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r19 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x01f9 }
            float r19 = java.lang.Float.parseFloat(r19)     // Catch:{ Exception -> 0x01f9 }
            float r19 = r19 * r11
            r10[r4] = r19     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r19 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x01f9 }
            float r19 = java.lang.Float.parseFloat(r19)     // Catch:{ Exception -> 0x01f9 }
            float r19 = r19 * r11
            r10[r17] = r19     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r19 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r19 = java.lang.Float.parseFloat(r19)     // Catch:{ Exception -> 0x01f9 }
            float r19 = r19 * r11
            r10[r18] = r19     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r19 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r19 = java.lang.Float.parseFloat(r19)     // Catch:{ Exception -> 0x01f9 }
            float r11 = r11 * r19
            r10[r16] = r11     // Catch:{ Exception -> 0x01f9 }
            r7.setCornerRadii(r10)     // Catch:{ Exception -> 0x01f9 }
            int r10 = r8 * 1
            int r11 = android.graphics.Color.parseColor(r1)     // Catch:{ Exception -> 0x01f9 }
            r7.setStroke(r10, r11)     // Catch:{ Exception -> 0x01f9 }
            android.widget.TextView r10 = r0.text_back_color     // Catch:{ Exception -> 0x01f9 }
            int r8 = r8 * 4
            float r8 = (float) r8     // Catch:{ Exception -> 0x01f9 }
            r10.setElevation(r8)     // Catch:{ Exception -> 0x01f9 }
            android.widget.TextView r8 = r0.text_back_color     // Catch:{ Exception -> 0x01f9 }
            r8.setBackground(r7)     // Catch:{ Exception -> 0x01f9 }
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable     // Catch:{ Exception -> 0x01f9 }
            r7.<init>()     // Catch:{ Exception -> 0x01f9 }
            android.content.Context r8 = r20.getApplicationContext()     // Catch:{ Exception -> 0x01f9 }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ Exception -> 0x01f9 }
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()     // Catch:{ Exception -> 0x01f9 }
            float r8 = r8.density     // Catch:{ Exception -> 0x01f9 }
            int r8 = (int) r8     // Catch:{ Exception -> 0x01f9 }
            android.widget.TextView r10 = r0.text_somk_color     // Catch:{ Exception -> 0x01f9 }
            java.lang.CharSequence r10 = r10.getText()     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01f9 }
            int r10 = android.graphics.Color.parseColor(r10)     // Catch:{ Exception -> 0x01f9 }
            r7.setColor(r10)     // Catch:{ Exception -> 0x01f9 }
            float[] r9 = new float[r9]     // Catch:{ Exception -> 0x01f9 }
            float r10 = (float) r8     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r11 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ Exception -> 0x01f9 }
            float r11 = r11 * r10
            r9[r5] = r11     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r11 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ Exception -> 0x01f9 }
            float r11 = r11 * r10
            r9[r3] = r11     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r11 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ Exception -> 0x01f9 }
            float r11 = r11 * r10
            r9[r6] = r11     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r11 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ Exception -> 0x01f9 }
            float r11 = r11 * r10
            r9[r2] = r11     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x01f9 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ Exception -> 0x01f9 }
            float r11 = r11 * r10
            r9[r4] = r11     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x01f9 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ Exception -> 0x01f9 }
            float r11 = r11 * r10
            r9[r17] = r11     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r11 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ Exception -> 0x01f9 }
            float r11 = r11 * r10
            r9[r18] = r11     // Catch:{ Exception -> 0x01f9 }
            java.lang.String r11 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01f9 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ Exception -> 0x01f9 }
            float r10 = r10 * r11
            r9[r16] = r10     // Catch:{ Exception -> 0x01f9 }
            r7.setCornerRadii(r9)     // Catch:{ Exception -> 0x01f9 }
            int r9 = r8 * 1
            int r1 = android.graphics.Color.parseColor(r1)     // Catch:{ Exception -> 0x01f9 }
            r7.setStroke(r9, r1)     // Catch:{ Exception -> 0x01f9 }
            android.widget.TextView r1 = r0.text_somk_color     // Catch:{ Exception -> 0x01f9 }
            int r8 = r8 * 4
            float r8 = (float) r8     // Catch:{ Exception -> 0x01f9 }
            r1.setElevation(r8)     // Catch:{ Exception -> 0x01f9 }
            android.widget.TextView r1 = r0.text_somk_color     // Catch:{ Exception -> 0x01f9 }
            r1.setBackground(r7)     // Catch:{ Exception -> 0x01f9 }
            goto L_0x01fa
        L_0x01f9:
        L_0x01fa:
            android.widget.TextView r1 = r0.text_zawaia
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$128 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$128
            r7.<init>()
            r8 = -1118482(0xffffffffffeeeeee, float:NaN)
            r9 = -1
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r6, r3, r8, r9)
            r1.setBackground(r7)
            android.widget.TextView r1 = r0.text_out
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$129 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$129
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r6, r3, r8, r9)
            r1.setBackground(r7)
            android.widget.TextView r1 = r0.text_in
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$130 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$130
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r6, r3, r8, r9)
            r1.setBackground(r7)
            android.widget.TextView r1 = r0.text_Dell
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$131 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$131
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r6, r3, r8, r9)
            r1.setBackground(r7)
            android.widget.TextView r1 = r0.text_font
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$132 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$132
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r6, r3, r8, r9)
            r1.setBackground(r7)
            android.widget.TextView r1 = r0.text_size
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$133 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$133
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r6, r3, r8, r9)
            r1.setBackground(r7)
            java.lang.String r1 = r0.T_W
            int r7 = r1.hashCode()
            java.lang.String r9 = "1"
            r10 = -6982195(0xffffffffff9575cd, float:NaN)
            switch(r7) {
                case 49: goto L_0x02cc;
                case 50: goto L_0x0298;
                case 51: goto L_0x0262;
                default: goto L_0x0260;
            }
        L_0x0260:
            goto L_0x02fe
        L_0x0262:
            java.lang.String r7 = "3"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x026c
            goto L_0x02fe
        L_0x026c:
            android.widget.ImageView r1 = r0.image_Center
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$137 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$137
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r8, r10)
            r1.setBackground(r7)
            android.widget.ImageView r1 = r0.image_Lift
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$138 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$138
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r5, r5)
            r1.setBackground(r7)
            android.widget.ImageView r1 = r0.image_Right
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$139 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$139
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r5, r5)
            r1.setBackground(r7)
            goto L_0x0328
        L_0x0298:
            java.lang.String r7 = "2"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x02a1
            goto L_0x02fe
        L_0x02a1:
            android.widget.ImageView r1 = r0.image_Lift
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$140 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$140
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r8, r10)
            r1.setBackground(r7)
            android.widget.ImageView r1 = r0.image_Center
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$141 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$141
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r5, r5)
            r1.setBackground(r7)
            android.widget.ImageView r1 = r0.image_Right
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$142 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$142
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r5, r5)
            r1.setBackground(r7)
            goto L_0x0328
        L_0x02cc:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x02d3
            goto L_0x02fe
        L_0x02d3:
            android.widget.ImageView r1 = r0.image_Right
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$134 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$134
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r8, r10)
            r1.setBackground(r7)
            android.widget.ImageView r1 = r0.image_Center
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$135 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$135
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r5, r5)
            r1.setBackground(r7)
            android.widget.ImageView r1 = r0.image_Lift
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$136 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$136
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r5, r5)
            r1.setBackground(r7)
            goto L_0x0328
        L_0x02fe:
            android.widget.ImageView r1 = r0.image_Right
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$143 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$143
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r8, r10)
            r1.setBackground(r7)
            android.widget.ImageView r1 = r0.image_Center
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$144 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$144
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r5, r5)
            r1.setBackground(r7)
            android.widget.ImageView r1 = r0.image_Lift
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$145 r7 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$145
            r7.<init>()
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r4, r6, r5, r5)
            r1.setBackground(r7)
        L_0x0328:
            android.widget.TextView r1 = r0.text_size     // Catch:{ Exception -> 0x037e }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x037e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x037e }
            java.lang.String r1 = r0.Spliter(r1, r5)     // Catch:{ Exception -> 0x037e }
            double r11 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x037e }
            int r1 = (int) r11     // Catch:{ Exception -> 0x037e }
            double r11 = (double) r1     // Catch:{ Exception -> 0x037e }
            r0.W = r11     // Catch:{ Exception -> 0x037e }
            android.widget.TextView r1 = r0.text_size     // Catch:{ Exception -> 0x037e }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x037e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x037e }
            java.lang.String r1 = r0.Spliter(r1, r3)     // Catch:{ Exception -> 0x037e }
            double r11 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x037e }
            int r1 = (int) r11     // Catch:{ Exception -> 0x037e }
            double r11 = (double) r1     // Catch:{ Exception -> 0x037e }
            r0.H = r11     // Catch:{ Exception -> 0x037e }
            android.widget.TextView r1 = r0.text_size     // Catch:{ Exception -> 0x037e }
            java.lang.CharSequence r1 = r1.getText()     // Catch:{ Exception -> 0x037e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x037e }
            java.lang.String r1 = r0.Spliter(r1, r6)     // Catch:{ Exception -> 0x037e }
            double r11 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x037e }
            int r1 = (int) r11     // Catch:{ Exception -> 0x037e }
            double r11 = (double) r1     // Catch:{ Exception -> 0x037e }
            r0.Wi = r11     // Catch:{ Exception -> 0x037e }
            android.widget.LinearLayout r1 = r0.L900     // Catch:{ Exception -> 0x037e }
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x037e }
            double r11 = r0.W     // Catch:{ Exception -> 0x037e }
            int r11 = (int) r11     // Catch:{ Exception -> 0x037e }
            double r12 = r0.H     // Catch:{ Exception -> 0x037e }
            int r12 = (int) r12     // Catch:{ Exception -> 0x037e }
            double r13 = r0.Wi     // Catch:{ Exception -> 0x037e }
            int r13 = (int) r13     // Catch:{ Exception -> 0x037e }
            float r13 = (float) r13     // Catch:{ Exception -> 0x037e }
            r7.<init>(r11, r12, r13)     // Catch:{ Exception -> 0x037e }
            r1.setLayoutParams(r7)     // Catch:{ Exception -> 0x037e }
        L_0x037e:
            android.widget.Spinner r1 = r0.spinner_somk_size     // Catch:{ Exception -> 0x0387 }
            double r11 = r0.Etar     // Catch:{ Exception -> 0x0387 }
            int r7 = (int) r11     // Catch:{ Exception -> 0x0387 }
            r1.setSelection(r7)     // Catch:{ Exception -> 0x0387 }
            goto L_0x0388
        L_0x0387:
        L_0x0388:
            java.lang.String r1 = r0.Type
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0480
            android.widget.Spinner r1 = r0.spinner_font_size     // Catch:{ Exception -> 0x0398 }
            double r11 = r0.Font_size     // Catch:{ Exception -> 0x0398 }
            int r7 = (int) r11     // Catch:{ Exception -> 0x0398 }
            r1.setSelection(r7)     // Catch:{ Exception -> 0x0398 }
        L_0x0398:
            double r11 = r0.F_stay
            int r1 = (int) r11
            r11 = 0
            if (r1 == 0) goto L_0x042f
            r7 = -2039584(0xffffffffffe0e0e0, float:NaN)
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 == r3) goto L_0x040e
            if (r1 == r6) goto L_0x03ed
            if (r1 == r2) goto L_0x03cc
            android.widget.ImageView r1 = r0.imag_bold
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$154 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$154
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r5, r5)
            r1.setBackground(r2)
            android.widget.ImageView r1 = r0.image_itlic
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$155 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$155
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r5, r5)
            r1.setBackground(r2)
            r0.F_bold = r11
            r0.F_itlic = r11
            goto L_0x044f
        L_0x03cc:
            android.widget.ImageView r1 = r0.imag_bold
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$152 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$152
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r7, r10)
            r1.setBackground(r2)
            android.widget.ImageView r1 = r0.image_itlic
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$153 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$153
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r8, r10)
            r1.setBackground(r2)
            r0.F_bold = r13
            r0.F_itlic = r13
            goto L_0x044f
        L_0x03ed:
            android.widget.ImageView r1 = r0.image_itlic
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$150 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$150
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r8, r10)
            r1.setBackground(r2)
            android.widget.ImageView r1 = r0.imag_bold
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$151 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$151
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r5, r5)
            r1.setBackground(r2)
            r0.F_bold = r11
            r0.F_itlic = r13
            goto L_0x044f
        L_0x040e:
            android.widget.ImageView r1 = r0.imag_bold
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$148 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$148
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r7, r10)
            r1.setBackground(r2)
            android.widget.ImageView r1 = r0.image_itlic
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$149 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$149
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r5, r5)
            r1.setBackground(r2)
            r0.F_bold = r13
            r0.F_itlic = r11
            goto L_0x044f
        L_0x042f:
            android.widget.ImageView r1 = r0.imag_bold
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$146 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$146
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r5, r5)
            r1.setBackground(r2)
            android.widget.ImageView r1 = r0.image_itlic
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$147 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$147
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r5, r5)
            r1.setBackground(r2)
            r0.F_bold = r11
            r0.F_itlic = r11
        L_0x044f:
            double r1 = r0.F_und
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0464
            android.widget.ImageView r1 = r0.image_und
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$156 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$156
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r5, r5)
            r1.setBackground(r2)
            goto L_0x0472
        L_0x0464:
            android.widget.ImageView r1 = r0.image_und
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$157 r2 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$157
            r2.<init>()
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r4, r6, r8, r10)
            r1.setBackground(r2)
        L_0x0472:
            com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$158 r1 = new com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity$158
            r1.<init>()
            r0.timer_5 = r1
            java.util.Timer r2 = r0._timer
            r3 = 80
            r2.schedule(r1, r3)
        L_0x0480:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity._start_on():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|3|4|5|6|7|8|9|10|11|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x02d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x01bb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x021e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _set_Backgrund_form(android.view.View r18, double r19, java.lang.String r21, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r22
            java.lang.String r3 = "1"
            java.lang.String r4 = "3"
            java.lang.String r5 = "2"
            java.lang.String r6 = "4"
            r7 = r19
            int r7 = (int) r7
            java.lang.Object r8 = r2.get(r7)     // Catch:{ Exception -> 0x02e4 }
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ Exception -> 0x02e4 }
            java.lang.String r9 = "0"
            java.lang.Object r8 = r8.get(r9)     // Catch:{ Exception -> 0x02e4 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x02e4 }
            r0.Type = r8     // Catch:{ Exception -> 0x02e4 }
            r11 = 0
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable     // Catch:{ Exception -> 0x01bb }
            r12.<init>()     // Catch:{ Exception -> 0x01bb }
            android.content.Context r13 = r17.getApplicationContext()     // Catch:{ Exception -> 0x01bb }
            android.content.res.Resources r13 = r13.getResources()     // Catch:{ Exception -> 0x01bb }
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()     // Catch:{ Exception -> 0x01bb }
            float r13 = r13.density     // Catch:{ Exception -> 0x01bb }
            int r13 = (int) r13     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r14 = r2.get(r7)     // Catch:{ Exception -> 0x01bb }
            java.util.HashMap r14 = (java.util.HashMap) r14     // Catch:{ Exception -> 0x01bb }
            java.lang.String r15 = "5"
            java.lang.Object r14 = r14.get(r15)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x01bb }
            int r14 = android.graphics.Color.parseColor(r14)     // Catch:{ Exception -> 0x01bb }
            r12.setColor(r14)     // Catch:{ Exception -> 0x01bb }
            r14 = 8
            float[] r14 = new float[r14]     // Catch:{ Exception -> 0x01bb }
            float r15 = (float) r13     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r16 = r2.get(r7)     // Catch:{ Exception -> 0x01bb }
            r8 = r16
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = r0.Spliter(r8, r11)     // Catch:{ Exception -> 0x01bb }
            double r9 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x01bb }
            int r8 = (int) r9     // Catch:{ Exception -> 0x01bb }
            long r8 = (long) r8     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x01bb }
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ Exception -> 0x01bb }
            float r8 = r8 * r15
            r14[r11] = r8     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r8 = r2.get(r7)     // Catch:{ Exception -> 0x01bb }
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = r0.Spliter(r8, r11)     // Catch:{ Exception -> 0x01bb }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x01bb }
            int r8 = (int) r8     // Catch:{ Exception -> 0x01bb }
            long r8 = (long) r8     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x01bb }
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ Exception -> 0x01bb }
            float r8 = r8 * r15
            r9 = 1
            r14[r9] = r8     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r8 = r2.get(r7)     // Catch:{ Exception -> 0x01bb }
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = r0.Spliter(r8, r9)     // Catch:{ Exception -> 0x01bb }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x01bb }
            int r8 = (int) r8     // Catch:{ Exception -> 0x01bb }
            long r8 = (long) r8     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x01bb }
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ Exception -> 0x01bb }
            float r8 = r8 * r15
            r9 = 2
            r14[r9] = r8     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r8 = r2.get(r7)     // Catch:{ Exception -> 0x01bb }
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01bb }
            r9 = 1
            java.lang.String r8 = r0.Spliter(r8, r9)     // Catch:{ Exception -> 0x01bb }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x01bb }
            int r8 = (int) r8     // Catch:{ Exception -> 0x01bb }
            long r8 = (long) r8     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x01bb }
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ Exception -> 0x01bb }
            float r8 = r8 * r15
            r9 = 3
            r14[r9] = r8     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r8 = r2.get(r7)     // Catch:{ Exception -> 0x01bb }
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01bb }
            r9 = 2
            java.lang.String r8 = r0.Spliter(r8, r9)     // Catch:{ Exception -> 0x01bb }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x01bb }
            int r8 = (int) r8     // Catch:{ Exception -> 0x01bb }
            long r8 = (long) r8     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x01bb }
            float r8 = java.lang.Float.parseFloat(r8)     // Catch:{ Exception -> 0x01bb }
            float r8 = r8 * r15
            r9 = 4
            r14[r9] = r8     // Catch:{ Exception -> 0x01bb }
            r8 = 5
            java.lang.Object r10 = r2.get(r7)     // Catch:{ Exception -> 0x01bb }
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r10 = r10.get(r6)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01bb }
            r11 = 2
            java.lang.String r10 = r0.Spliter(r10, r11)     // Catch:{ Exception -> 0x01bb }
            double r10 = java.lang.Double.parseDouble(r10)     // Catch:{ Exception -> 0x01bb }
            int r10 = (int) r10     // Catch:{ Exception -> 0x01bb }
            long r10 = (long) r10     // Catch:{ Exception -> 0x01bb }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x01bb }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ Exception -> 0x01bb }
            float r10 = r10 * r15
            r14[r8] = r10     // Catch:{ Exception -> 0x01bb }
            r8 = 6
            java.lang.Object r10 = r2.get(r7)     // Catch:{ Exception -> 0x01bb }
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r10 = r10.get(r6)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01bb }
            r11 = 3
            java.lang.String r10 = r0.Spliter(r10, r11)     // Catch:{ Exception -> 0x01bb }
            double r10 = java.lang.Double.parseDouble(r10)     // Catch:{ Exception -> 0x01bb }
            int r10 = (int) r10     // Catch:{ Exception -> 0x01bb }
            long r10 = (long) r10     // Catch:{ Exception -> 0x01bb }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x01bb }
            float r10 = java.lang.Float.parseFloat(r10)     // Catch:{ Exception -> 0x01bb }
            float r10 = r10 * r15
            r14[r8] = r10     // Catch:{ Exception -> 0x01bb }
            r8 = 7
            java.lang.Object r10 = r2.get(r7)     // Catch:{ Exception -> 0x01bb }
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r6 = r10.get(r6)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01bb }
            r10 = 3
            java.lang.String r6 = r0.Spliter(r6, r10)     // Catch:{ Exception -> 0x01bb }
            double r10 = java.lang.Double.parseDouble(r6)     // Catch:{ Exception -> 0x01bb }
            int r6 = (int) r10     // Catch:{ Exception -> 0x01bb }
            long r10 = (long) r6     // Catch:{ Exception -> 0x01bb }
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x01bb }
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ Exception -> 0x01bb }
            float r15 = r15 * r6
            r14[r8] = r15     // Catch:{ Exception -> 0x01bb }
            r12.setCornerRadii(r14)     // Catch:{ Exception -> 0x01bb }
            java.lang.Object r6 = r2.get(r7)     // Catch:{ Exception -> 0x01bb }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = "6"
            java.lang.Object r6 = r6.get(r8)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01bb }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x01bb }
            int r6 = r6 * r13
            java.lang.Object r8 = r2.get(r7)     // Catch:{ Exception -> 0x01bb }
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ Exception -> 0x01bb }
            java.lang.String r10 = "7"
            java.lang.Object r8 = r8.get(r10)     // Catch:{ Exception -> 0x01bb }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x01bb }
            int r8 = android.graphics.Color.parseColor(r8)     // Catch:{ Exception -> 0x01bb }
            r12.setStroke(r6, r8)     // Catch:{ Exception -> 0x01bb }
            int r13 = r13 * 4
            float r6 = (float) r13     // Catch:{ Exception -> 0x01bb }
            r1.setElevation(r6)     // Catch:{ Exception -> 0x01bb }
            r1.setBackground(r12)     // Catch:{ Exception -> 0x01bb }
        L_0x01bb:
            java.lang.Object r6 = r2.get(r7)     // Catch:{ Exception -> 0x021e }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ Exception -> 0x021e }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x021e }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x021e }
            r8 = 0
            java.lang.String r6 = r0.Spliter(r6, r8)     // Catch:{ Exception -> 0x021e }
            double r8 = java.lang.Double.parseDouble(r6)     // Catch:{ Exception -> 0x021e }
            int r6 = (int) r8     // Catch:{ Exception -> 0x021e }
            java.lang.Object r8 = r2.get(r7)     // Catch:{ Exception -> 0x021e }
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ Exception -> 0x021e }
            java.lang.Object r8 = r8.get(r5)     // Catch:{ Exception -> 0x021e }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x021e }
            r9 = 1
            java.lang.String r8 = r0.Spliter(r8, r9)     // Catch:{ Exception -> 0x021e }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x021e }
            int r8 = (int) r8     // Catch:{ Exception -> 0x021e }
            java.lang.Object r9 = r2.get(r7)     // Catch:{ Exception -> 0x021e }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ Exception -> 0x021e }
            java.lang.Object r9 = r9.get(r5)     // Catch:{ Exception -> 0x021e }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x021e }
            r10 = 2
            java.lang.String r9 = r0.Spliter(r9, r10)     // Catch:{ Exception -> 0x021e }
            double r9 = java.lang.Double.parseDouble(r9)     // Catch:{ Exception -> 0x021e }
            int r9 = (int) r9     // Catch:{ Exception -> 0x021e }
            java.lang.Object r10 = r2.get(r7)     // Catch:{ Exception -> 0x021e }
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch:{ Exception -> 0x021e }
            java.lang.Object r5 = r10.get(r5)     // Catch:{ Exception -> 0x021e }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x021e }
            r10 = 3
            java.lang.String r5 = r0.Spliter(r5, r10)     // Catch:{ Exception -> 0x021e }
            double r10 = java.lang.Double.parseDouble(r5)     // Catch:{ Exception -> 0x021e }
            int r5 = (int) r10     // Catch:{ Exception -> 0x021e }
            r1.setPadding(r6, r8, r9, r5)     // Catch:{ Exception -> 0x021e }
        L_0x021e:
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r6 = r2.get(r7)     // Catch:{ Exception -> 0x02d2 }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r6 = r6.get(r3)     // Catch:{ Exception -> 0x02d2 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x02d2 }
            r8 = 0
            java.lang.String r6 = r0.Spliter(r6, r8)     // Catch:{ Exception -> 0x02d2 }
            double r8 = java.lang.Double.parseDouble(r6)     // Catch:{ Exception -> 0x02d2 }
            int r6 = (int) r8     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r8 = r2.get(r7)     // Catch:{ Exception -> 0x02d2 }
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r8 = r8.get(r3)     // Catch:{ Exception -> 0x02d2 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x02d2 }
            r9 = 1
            java.lang.String r8 = r0.Spliter(r8, r9)     // Catch:{ Exception -> 0x02d2 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x02d2 }
            int r8 = (int) r8     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r9 = r2.get(r7)     // Catch:{ Exception -> 0x02d2 }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r3 = r9.get(r3)     // Catch:{ Exception -> 0x02d2 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02d2 }
            r9 = 2
            java.lang.String r3 = r0.Spliter(r3, r9)     // Catch:{ Exception -> 0x02d2 }
            double r9 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x02d2 }
            int r3 = (int) r9     // Catch:{ Exception -> 0x02d2 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x02d2 }
            r5.<init>(r6, r8, r3)     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r3 = r2.get(r7)     // Catch:{ Exception -> 0x02d2 }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x02d2 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02d2 }
            r6 = 0
            java.lang.String r3 = r0.Spliter(r3, r6)     // Catch:{ Exception -> 0x02d2 }
            double r8 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x02d2 }
            int r3 = (int) r8     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r6 = r2.get(r7)     // Catch:{ Exception -> 0x02d2 }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ Exception -> 0x02d2 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x02d2 }
            r8 = 1
            java.lang.String r6 = r0.Spliter(r6, r8)     // Catch:{ Exception -> 0x02d2 }
            double r8 = java.lang.Double.parseDouble(r6)     // Catch:{ Exception -> 0x02d2 }
            int r6 = (int) r8     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r8 = r2.get(r7)     // Catch:{ Exception -> 0x02d2 }
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r8 = r8.get(r4)     // Catch:{ Exception -> 0x02d2 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x02d2 }
            r9 = 2
            java.lang.String r8 = r0.Spliter(r8, r9)     // Catch:{ Exception -> 0x02d2 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ Exception -> 0x02d2 }
            int r8 = (int) r8     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r9 = r2.get(r7)     // Catch:{ Exception -> 0x02d2 }
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ Exception -> 0x02d2 }
            java.lang.Object r4 = r9.get(r4)     // Catch:{ Exception -> 0x02d2 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x02d2 }
            r9 = 3
            java.lang.String r4 = r0.Spliter(r4, r9)     // Catch:{ Exception -> 0x02d2 }
            double r9 = java.lang.Double.parseDouble(r4)     // Catch:{ Exception -> 0x02d2 }
            int r4 = (int) r9     // Catch:{ Exception -> 0x02d2 }
            r5.setMargins(r3, r6, r8, r4)     // Catch:{ Exception -> 0x02d2 }
            r1.setLayoutParams(r5)     // Catch:{ Exception -> 0x02d2 }
        L_0x02d2:
            java.lang.Object r1 = r2.get(r7)     // Catch:{ Exception -> 0x02e4 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x02e4 }
            java.lang.String r2 = "60"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x02e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02e4 }
            r0.ID_one = r1     // Catch:{ Exception -> 0x02e4 }
        L_0x02e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity._set_Backgrund_form(android.view.View, double, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:8|9|10|11|12|13|14|15|16|17|18|32|33|35) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(14:8|9|10|11|12|13|14|15|16|17|18|32|33|35)(1:37)) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x005d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0074 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x00d6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0029 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ef A[Catch:{ Exception -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f0 A[Catch:{ Exception -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00fd A[Catch:{ Exception -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010c A[Catch:{ Exception -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031 A[SYNTHETIC, Splitter:B:8:0x0031] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _set_TextView_from(android.widget.TextView r5, double r6, java.lang.String r8, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r9) {
        /*
            r4 = this;
            java.lang.String r8 = "1"
            java.lang.String r0 = "26"
            int r6 = (int) r6
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x015a }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x015a }
            java.lang.String r1 = "0"
            java.lang.Object r7 = r7.get(r1)     // Catch:{ Exception -> 0x015a }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x015a }
            r4.Type = r7     // Catch:{ Exception -> 0x015a }
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x0029 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x0029 }
            java.lang.String r1 = "60"
            java.lang.Object r7 = r7.get(r1)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0029 }
            r4.ID_one = r7     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            java.lang.String r7 = r4.Type     // Catch:{ Exception -> 0x015a }
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x015a }
            if (r7 == 0) goto L_0x015a
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x0044 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = "20"
            java.lang.Object r7 = r7.get(r1)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0044 }
            r5.setText(r7)     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x005d }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x005d }
            java.lang.String r1 = "21"
            java.lang.Object r7 = r7.get(r1)     // Catch:{ Exception -> 0x005d }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x005d }
            double r1 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x005d }
            int r7 = (int) r1     // Catch:{ Exception -> 0x005d }
            float r7 = (float) r7     // Catch:{ Exception -> 0x005d }
            r5.setTextSize(r7)     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x0074 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x0074 }
            java.lang.String r1 = "22"
            java.lang.Object r7 = r7.get(r1)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0074 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ Exception -> 0x0074 }
            r5.setTextColor(r7)     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x00d6 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00d6 }
            r1 = 0
            java.lang.String r7 = r4.Spliter(r7, r1)     // Catch:{ Exception -> 0x00d6 }
            double r1 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x00d6 }
            int r7 = (int) r1     // Catch:{ Exception -> 0x00d6 }
            float r7 = (float) r7     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r1 = r9.get(r6)     // Catch:{ Exception -> 0x00d6 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00d6 }
            r2 = 1
            java.lang.String r1 = r4.Spliter(r1, r2)     // Catch:{ Exception -> 0x00d6 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x00d6 }
            int r1 = (int) r1     // Catch:{ Exception -> 0x00d6 }
            float r1 = (float) r1     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r2 = r9.get(r6)     // Catch:{ Exception -> 0x00d6 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00d6 }
            r2 = 2
            java.lang.String r0 = r4.Spliter(r0, r2)     // Catch:{ Exception -> 0x00d6 }
            double r2 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x00d6 }
            int r0 = (int) r2     // Catch:{ Exception -> 0x00d6 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r2 = r9.get(r6)     // Catch:{ Exception -> 0x00d6 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r3 = "27"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00d6 }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ Exception -> 0x00d6 }
            r5.setShadowLayer(r7, r1, r0, r2)     // Catch:{ Exception -> 0x00d6 }
        L_0x00d6:
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x015a }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x015a }
            java.lang.String r0 = "25"
            java.lang.Object r7 = r7.get(r0)     // Catch:{ Exception -> 0x015a }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x015a }
            int r0 = r7.hashCode()     // Catch:{ Exception -> 0x015a }
            r1 = 49
            switch(r0) {
                case 49: goto L_0x010c;
                case 50: goto L_0x00fd;
                case 51: goto L_0x00f0;
                default: goto L_0x00ef;
            }     // Catch:{ Exception -> 0x015a }
        L_0x00ef:
            goto L_0x0119
        L_0x00f0:
            java.lang.String r8 = "3"
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x015a }
            if (r7 != 0) goto L_0x00f9
            goto L_0x0119
        L_0x00f9:
            r5.setGravity(r1)     // Catch:{ Exception -> 0x015a }
            goto L_0x011c
        L_0x00fd:
            java.lang.String r8 = "2"
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x015a }
            if (r7 != 0) goto L_0x0106
            goto L_0x0119
        L_0x0106:
            r7 = 51
            r5.setGravity(r7)     // Catch:{ Exception -> 0x015a }
            goto L_0x011c
        L_0x010c:
            boolean r7 = r7.equals(r8)     // Catch:{ Exception -> 0x015a }
            if (r7 != 0) goto L_0x0113
            goto L_0x0119
        L_0x0113:
            r7 = 53
            r5.setGravity(r7)     // Catch:{ Exception -> 0x015a }
            goto L_0x011c
        L_0x0119:
            r5.setGravity(r1)     // Catch:{ Exception -> 0x015a }
        L_0x011c:
            android.content.res.AssetManager r7 = r4.getAssets()     // Catch:{ Exception -> 0x015a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015a }
            java.lang.String r0 = "fonts/"
            r8.<init>(r0)     // Catch:{ Exception -> 0x015a }
            java.lang.Object r0 = r9.get(r6)     // Catch:{ Exception -> 0x015a }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x015a }
            java.lang.String r1 = "23"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x015a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x015a }
            r8.append(r0)     // Catch:{ Exception -> 0x015a }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x015a }
            android.graphics.Typeface r7 = android.graphics.Typeface.createFromAsset(r7, r8)     // Catch:{ Exception -> 0x015a }
            java.lang.Object r6 = r9.get(r6)     // Catch:{ Exception -> 0x015a }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ Exception -> 0x015a }
            java.lang.String r8 = "24"
            java.lang.Object r6 = r6.get(r8)     // Catch:{ Exception -> 0x015a }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x015a }
            double r8 = java.lang.Double.parseDouble(r6)     // Catch:{ Exception -> 0x015a }
            int r6 = (int) r8     // Catch:{ Exception -> 0x015a }
            r5.setTypeface(r7, r6)     // Catch:{ Exception -> 0x015a }
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity._set_TextView_from(android.widget.TextView, double, java.lang.String, java.util.ArrayList):void");
    }

    public void _taster(View view, View view2, double d2) {
        String valueOf = String.valueOf((long) d2);
        int hashCode = valueOf.hashCode();
        if (hashCode != 49) {
            if (hashCode == 50 && valueOf.equals("2")) {
                view.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(0, 4, -2039584, 0));
                view2.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(0, 2, ViewCompat.MEASURED_STATE_MASK, 0));
                return;
            }
        } else if (valueOf.equals("1")) {
            view.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(0, 4, ViewCompat.MEASURED_STATE_MASK, 0));
            view2.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(0, 2, ViewCompat.MEASURED_STATE_MASK, 0));
            return;
        }
        view.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 4, 0, 0));
        view2.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 2, 0, 0));
    }

    public void _spener_costam(TextView textView, String str, String str2) {
        textView.setTextSize(8.0f);
        try {
            textView.setTextColor(-2039584);
            textView.setText(str);
            textView.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 2, 0, Color.parseColor(str)));
        } catch (Exception unused) {
        }
        _set_TextView(this.edittext1);
        if (this.Type.equals("1")) {
            try {
                this.edittext1.setEnabled(true);
                this.edittext1.requestFocus();
                ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.edittext1, 1);
                EditText editText = this.edittext1;
                editText.setSelection(editText.getText().toString().length(), this.edittext1.getText().toString().length());
            } catch (Exception unused2) {
            }
        } else {
            this.W = (double) ((int) Double.parseDouble(Spliter(this.text_size.getText().toString(), 0)));
            this.H = (double) ((int) Double.parseDouble(Spliter(this.text_size.getText().toString(), 1)));
            this.Wi = (double) ((int) Double.parseDouble(Spliter(this.text_size.getText().toString(), 2)));
            this.L900.setLayoutParams(new LinearLayout.LayoutParams((int) this.W, (int) this.H, (float) ((int) this.Wi)));
            this.L900.requestFocus();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:11|12|13|14|15|16|18|(1:20)|21|(1:23)(1:24)|25) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0171 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0187 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _set_startA(double r6, java.lang.String r8, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r9) {
        /*
            r5 = this;
            java.lang.String r8 = "2"
            java.lang.String r0 = "1"
            int r6 = (int) r6
            java.lang.Object r7 = r9.get(r6)
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.String r1 = "0"
            java.lang.Object r7 = r7.get(r1)
            java.lang.String r7 = r7.toString()
            r5.Type = r7
            android.widget.TextView r7 = r5.text_size     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r1 = r9.get(r6)     // Catch:{ Exception -> 0x00a8 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00a8 }
            r7.setText(r1)     // Catch:{ Exception -> 0x00a8 }
            android.widget.TextView r7 = r5.text_in     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r1 = r9.get(r6)     // Catch:{ Exception -> 0x00a8 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00a8 }
            r7.setText(r1)     // Catch:{ Exception -> 0x00a8 }
            android.widget.TextView r7 = r5.text_out     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r1 = r9.get(r6)     // Catch:{ Exception -> 0x00a8 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r2 = "3"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00a8 }
            r7.setText(r1)     // Catch:{ Exception -> 0x00a8 }
            android.widget.TextView r7 = r5.text_zawaia     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r1 = r9.get(r6)     // Catch:{ Exception -> 0x00a8 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r2 = "4"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00a8 }
            r7.setText(r1)     // Catch:{ Exception -> 0x00a8 }
            android.widget.TextView r7 = r5.text_back_color     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r1 = r9.get(r6)     // Catch:{ Exception -> 0x00a8 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r2 = "5"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00a8 }
            r7.setText(r1)     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x00a8 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = "6"
            java.lang.Object r7 = r7.get(r1)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00a8 }
            double r1 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x00a8 }
            r5.Etar = r1     // Catch:{ Exception -> 0x00a8 }
            android.widget.TextView r7 = r5.text_somk_color     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r1 = r9.get(r6)     // Catch:{ Exception -> 0x00a8 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r2 = "7"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00a8 }
            r7.setText(r1)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00a9
        L_0x00a8:
        L_0x00a9:
            java.lang.String r7 = r5.Type
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0157
            android.widget.EditText r7 = r5.edittext1     // Catch:{ Exception -> 0x0156 }
            java.lang.Object r0 = r9.get(r6)     // Catch:{ Exception -> 0x0156 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = "20"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0156 }
            r7.setText(r0)     // Catch:{ Exception -> 0x0156 }
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x0156 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = "21"
            java.lang.Object r7 = r7.get(r0)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0156 }
            double r0 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x0156 }
            r5.Font_size = r0     // Catch:{ Exception -> 0x0156 }
            android.widget.TextView r7 = r5.text_font_color     // Catch:{ Exception -> 0x0156 }
            java.lang.Object r0 = r9.get(r6)     // Catch:{ Exception -> 0x0156 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = "22"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0156 }
            r7.setText(r0)     // Catch:{ Exception -> 0x0156 }
            android.widget.TextView r7 = r5.text_font     // Catch:{ Exception -> 0x0156 }
            java.lang.Object r0 = r9.get(r6)     // Catch:{ Exception -> 0x0156 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = "23"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0156 }
            r7.setText(r0)     // Catch:{ Exception -> 0x0156 }
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x0156 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = "24"
            java.lang.Object r7 = r7.get(r0)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0156 }
            double r0 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x0156 }
            r5.F_stay = r0     // Catch:{ Exception -> 0x0156 }
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x0156 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = "25"
            java.lang.Object r7 = r7.get(r0)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0156 }
            r5.T_W = r7     // Catch:{ Exception -> 0x0156 }
            android.widget.TextView r7 = r5.text_Dell     // Catch:{ Exception -> 0x0156 }
            java.lang.Object r0 = r9.get(r6)     // Catch:{ Exception -> 0x0156 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = "26"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0156 }
            r7.setText(r0)     // Catch:{ Exception -> 0x0156 }
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x0156 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = "27"
            java.lang.Object r7 = r7.get(r0)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0156 }
            r5.abC_color = r7     // Catch:{ Exception -> 0x0156 }
            goto L_0x0157
        L_0x0156:
        L_0x0157:
            java.lang.String r7 = r5.Type
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x01de
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x0171 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x0171 }
            java.lang.String r8 = "40"
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x0171 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0171 }
            r5.path = r7     // Catch:{ Exception -> 0x0171 }
        L_0x0171:
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x0187 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x0187 }
            java.lang.String r8 = "41"
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0187 }
            double r7 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x0187 }
            r5.text_photo_var = r7     // Catch:{ Exception -> 0x0187 }
        L_0x0187:
            java.lang.Object r7 = r9.get(r6)     // Catch:{ Exception -> 0x019a }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x019a }
            java.lang.String r8 = "42"
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Exception -> 0x019a }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x019a }
            r5.Tex_im = r7     // Catch:{ Exception -> 0x019a }
            goto L_0x019b
        L_0x019a:
        L_0x019b:
            android.widget.LinearLayout r7 = r5.linear_image
            r8 = 0
            r7.setVisibility(r8)
            android.widget.LinearLayout r7 = r5.linear27
            r7.setVisibility(r8)
            android.widget.LinearLayout r7 = r5.linear24
            r0 = 8
            r7.setVisibility(r0)
            java.lang.String r7 = r5.path
            java.lang.String r1 = ""
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x01c4
            android.widget.ImageView r7 = r5.imageview41
            java.lang.String r1 = r5.path
            r2 = 1024(0x400, float:1.435E-42)
            android.graphics.Bitmap r1 = com.Nasa.Soft.Exzam.Editor35.FileUtil.decodeSampleBitmapFromPath(r1, r2, r2)
            r7.setImageBitmap(r1)
        L_0x01c4:
            double r1 = r5.text_photo_var
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x01d2
            android.widget.TextView r7 = r5.text_shaql
            r7.setVisibility(r0)
            goto L_0x01d7
        L_0x01d2:
            android.widget.TextView r7 = r5.text_shaql
            r7.setVisibility(r8)
        L_0x01d7:
            android.widget.TextView r7 = r5.text_shaql
            java.lang.String r8 = r5.Tex_im
            r7.setText(r8)
        L_0x01de:
            java.lang.Object r6 = r9.get(r6)     // Catch:{ Exception -> 0x01f0 }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r7 = "60"
            java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01f0 }
            r5.ID_one = r6     // Catch:{ Exception -> 0x01f0 }
        L_0x01f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.EnterExzamActivity._set_startA(double, java.lang.String, java.util.ArrayList):void");
    }

    public void _dialog_nomatheg() {
        LinearLayout linearLayout;
        String str;
        TextView textView;
        LinearLayout linearLayout2;
        final AlertDialog alertDialog;
        LinearLayout.LayoutParams layoutParams;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout linearLayout6;
        LinearLayout linearLayout7;
        LinearLayout linearLayout8;
        AlertDialog alertDialog2;
        LinearLayout linearLayout9;
        LinearLayout linearLayout10;
        LinearLayout linearLayout11;
        String str2 = "1";
        this.List_all.clear();
        if (!this.save.getString("n750", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.List_all = (ArrayList) new Gson().fromJson(this.save.getString("n750", BuildConfig.FLAVOR), new TypeToken<ArrayList<HashMap<String, Object>>>() {
            }.getType());
        }
        AlertDialog create = new AlertDialog.Builder(this).create();
        LinearLayout linearLayout12 = new LinearLayout(getApplicationContext());
        int i = -1;
        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout12.setOrientation(1);
        linearLayout12.setGravity(17);
        new LinearLayout.LayoutParams(-2, -2, 1.0f).setMargins(1, 1, 1, 1);
        LinearLayout linearLayout13 = new LinearLayout(getApplicationContext());
        linearLayout13.setOrientation(1);
        ScrollView scrollView = new ScrollView(getApplicationContext());
        LinearLayout linearLayout14 = new LinearLayout(getApplicationContext());
        linearLayout14.setOrientation(1);
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 0.0f));
        int i2 = ViewCompat.MEASURED_STATE_MASK;
        textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView2.setTextSize(15.0f);
        textView2.setText("نموذجات محفوظه سابقا");
        textView2.setGravity(17);
        linearLayout14.addView(textView2);
        scrollView.addView(linearLayout13);
        linearLayout14.addView(scrollView);
        int i3 = 0;
        linearLayout14.setBackgroundColor(0);
        linearLayout14.setGravity(21);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(80, 80, 1.0f);
        int i4 = 2;
        layoutParams3.setMargins(2, 2, 2, 2);
        final int size2 = this.List_all.size() - 1;
        while (size2 > i) {
            if (this.List_all.get(size2).get("0").toString().equals(this.Type)) {
                LinearLayout linearLayout15 = new LinearLayout(getApplicationContext());
                linearLayout15.setOrientation(i3);
                LinearLayout linearLayout16 = new LinearLayout(getApplicationContext());
                LinearLayout.LayoutParams layoutParams4 = layoutParams3;
                LinearLayout linearLayout17 = linearLayout14;
                TextView textView3 = textView2;
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -1, 0.0f);
                layoutParams5.setMargins(8, 8, 2, 8);
                linearLayout16.setLayoutParams(layoutParams5);
                linearLayout16.setOrientation(1);
                linearLayout16.setBackgroundColor(-1);
                LinearLayout linearLayout18 = new LinearLayout(getApplicationContext());
                linearLayout18.setOrientation(1);
                LinearLayout linearLayout19 = new LinearLayout(getApplicationContext());
                linearLayout19.setOrientation(1);
                LinearLayout linearLayout20 = linearLayout13;
                LinearLayout linearLayout21 = linearLayout16;
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams((int) this.w, (int) this.h, 0.0f);
                layoutParams6.setMargins(1, 1, 1, 1);
                linearLayout18.setLayoutParams(layoutParams6);
                LinearLayout linearLayout22 = new LinearLayout(getApplicationContext());
                linearLayout22.setOrientation(1);
                LinearLayout linearLayout23 = new LinearLayout(getApplicationContext());
                linearLayout23.setOrientation(1);
                linearLayout = linearLayout12;
                linearLayout22.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 0.0f));
                linearLayout23.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 0.0f));
                linearLayout18.setPadding(18, 18, 18, 18);
                linearLayout22.setPadding(6, 6, 6, 6);
                linearLayout23.setPadding(8, 8, 8, 8);
                linearLayout19.setBackgroundColor(-1);
                starr50(linearLayout18, linearLayout19);
                LinearLayout linearLayout24 = linearLayout18;
                try {
                    _taster(linearLayout22, linearLayout23, 1.0d);
                } catch (Exception unused) {
                }
                LinearLayout linearLayout25 = new LinearLayout(getApplicationContext());
                linearLayout25.setOrientation(0);
                linearLayout25.setGravity(49);
                LinearLayout linearLayout26 = linearLayout23;
                LinearLayout linearLayout27 = linearLayout22;
                LinearLayout linearLayout28 = linearLayout24;
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
                layoutParams7.setMargins(0, 0, 0, 0);
                linearLayout25.setLayoutParams(layoutParams7);
                try {
                    if (!this.List_all.get(size2).get("0").toString().equals(str2)) {
                        str = str2;
                        linearLayout8 = linearLayout15;
                        linearLayout4 = linearLayout27;
                        linearLayout11 = linearLayout26;
                        layoutParams2 = layoutParams4;
                        linearLayout7 = linearLayout17;
                        textView = textView3;
                        linearLayout6 = linearLayout20;
                        linearLayout5 = linearLayout21;
                        alertDialog2 = create;
                        linearLayout9 = linearLayout28;
                        linearLayout10 = linearLayout19;
                        LinearLayout linearLayout29 = linearLayout25;
                        if (this.List_all.get(size2).get("0").toString().equals("2") && this.Type.equals("2")) {
                            ImageView imageView = new ImageView(getApplicationContext());
                            _set_Backgrund_form(imageView, (double) size2, BuildConfig.FLAVOR, this.List_all);
                            if (this.List_all.get(size2).get("40").toString().equals(BuildConfig.FLAVOR)) {
                                imageView.setImageResource(R.drawable.ic_assessment_black);
                            } else {
                                imageView.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(this.List_all.get(size2).get("40").toString(), 1024, 1024));
                            }
                            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            linearLayout29.addView(imageView);
                            linearLayout11.addView(linearLayout29);
                        }
                    } else if (this.Type.equals(str2)) {
                        TextView textView4 = new TextView(getApplicationContext());
                        textView4.setText(this.List_all.get(size2).get("20").toString());
                        linearLayout8 = linearLayout15;
                        double d2 = (double) size2;
                        try {
                            str = str2;
                            linearLayout7 = linearLayout17;
                            textView = textView3;
                            alertDialog2 = create;
                            LinearLayout linearLayout30 = linearLayout25;
                            LinearLayout linearLayout31 = linearLayout28;
                            linearLayout10 = linearLayout19;
                            LinearLayout linearLayout32 = linearLayout31;
                            layoutParams2 = layoutParams4;
                            linearLayout6 = linearLayout20;
                            LinearLayout linearLayout33 = linearLayout26;
                            linearLayout9 = linearLayout32;
                            linearLayout11 = linearLayout33;
                            linearLayout4 = linearLayout27;
                            linearLayout5 = linearLayout21;
                            try {
                                _set_TextView_from(textView4, d2, BuildConfig.FLAVOR, this.List_all);
                                _set_Backgrund_form(textView4, d2, BuildConfig.FLAVOR, this.List_all);
                                linearLayout30.addView(textView4);
                                linearLayout11.addView(linearLayout30);
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                            str = str2;
                        }
                    } else {
                        str = str2;
                        linearLayout8 = linearLayout15;
                        linearLayout4 = linearLayout27;
                        linearLayout11 = linearLayout26;
                        layoutParams2 = layoutParams4;
                        linearLayout7 = linearLayout17;
                        textView = textView3;
                        linearLayout6 = linearLayout20;
                        linearLayout5 = linearLayout21;
                        alertDialog2 = create;
                        linearLayout9 = linearLayout28;
                        linearLayout10 = linearLayout19;
                    }
                } catch (Exception unused4) {
                    str = str2;
                    linearLayout8 = linearLayout15;
                }
                LinearLayout linearLayout34 = linearLayout4;
                linearLayout34.addView(linearLayout11);
                LinearLayout linearLayout35 = linearLayout9;
                linearLayout35.addView(linearLayout34);
                ImageView imageView2 = new ImageView(getApplicationContext());
                layoutParams = layoutParams2;
                imageView2.setLayoutParams(layoutParams);
                imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView2.setImageResource(R.drawable.poto_nasa_nok);
                alertDialog = alertDialog2;
                imageView2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        EnterExzamActivity.this.dialog_p.setTitle("إستبدال //من النموذج");
                        EnterExzamActivity.this.dialog_p.setMessage("ملاحظه : سوف يتم الإستبدال بالنموذج الحالي؟");
                        AlertDialog.Builder access$66 = EnterExzamActivity.this.dialog_p;
                        final int i = size2;
                        final AlertDialog alertDialog = alertDialog;
                        access$66.setPositiveButton("تاكيد الاستبدال", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                if (!EnterExzamActivity.this.save.getString("n750", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                                    try {
                                        EnterExzamActivity.this._set_Backgrund_form(EnterExzamActivity.this.edittext1, (double) i, BuildConfig.FLAVOR, EnterExzamActivity.this.List_all);
                                        EnterExzamActivity.this._set_TextView_from(EnterExzamActivity.this.edittext1, (double) i, BuildConfig.FLAVOR, EnterExzamActivity.this.List_all);
                                        EnterExzamActivity.this._set_startA((double) i, BuildConfig.FLAVOR, EnterExzamActivity.this.List_all);
                                        EnterExzamActivity.this._start_on();
                                    } catch (Exception unused) {
                                    }
                                }
                                alertDialog.dismiss();
                            }
                        });
                        EnterExzamActivity.this.dialog_p.setNeutralButton("تراجع", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        });
                        EnterExzamActivity.this.dialog_p.create().show();
                    }
                });
                LinearLayout linearLayout36 = linearLayout5;
                linearLayout36.addView(imageView2);
                ImageView imageView3 = new ImageView(getApplicationContext());
                imageView3.setLayoutParams(layoutParams);
                imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView3.setImageResource(R.drawable.ulang_19);
                imageView3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        alertDialog.dismiss();
                    }
                });
                linearLayout36.addView(imageView3);
                ImageView imageView4 = new ImageView(getApplicationContext());
                imageView4.setLayoutParams(layoutParams);
                imageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView4.setImageResource(R.drawable.nasa_39);
                imageView4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        alertDialog.dismiss();
                    }
                });
                linearLayout36.addView(imageView4);
                imageView4.setVisibility(8);
                imageView3.setVisibility(8);
                ImageView imageView5 = new ImageView(getApplicationContext());
                imageView5.setLayoutParams(layoutParams);
                imageView5.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView5.setImageResource(R.drawable.nasa_6);
                final LinearLayout linearLayout37 = linearLayout8;
                imageView5.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        EnterExzamActivity.this.dialog_p.setTitle("# تنبيه حذف النموذج #");
                        EnterExzamActivity.this.dialog_p.setMessage("ملاحظه : سوف يتم حدف النموذج الحالي نهائيا؟");
                        AlertDialog.Builder access$66 = EnterExzamActivity.this.dialog_p;
                        final int i = size2;
                        final AlertDialog alertDialog = alertDialog;
                        final LinearLayout linearLayout = linearLayout37;
                        access$66.setPositiveButton("تاكيد الحذف", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                try {
                                    EnterExzamActivity.this.List_all.remove(i);
                                    EnterExzamActivity.this.save.edit().putString("n750", new Gson().toJson((Object) EnterExzamActivity.this.List_all)).commit();
                                } catch (Exception unused) {
                                    alertDialog.dismiss();
                                }
                                linearLayout.setVisibility(8);
                            }
                        });
                        EnterExzamActivity.this.dialog_p.setNeutralButton("تراجع", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        });
                        EnterExzamActivity.this.dialog_p.create().show();
                    }
                });
                linearLayout36.addView(imageView5);
                LinearLayout linearLayout38 = linearLayout10;
                linearLayout38.addView(linearLayout35);
                linearLayout37.addView(linearLayout38);
                linearLayout37.addView(linearLayout36);
                linearLayout3 = linearLayout6;
                linearLayout3.addView(linearLayout37);
                linearLayout36.setPadding(8, 8, 8, 8);
                linearLayout37.setGravity(17);
                linearLayout3.setGravity(17);
                linearLayout2 = linearLayout7;
                linearLayout2.setGravity(17);
                linearLayout35.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                    }
                });
                linearLayout37.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        alertDialog.dismiss();
                    }
                });
            } else {
                linearLayout2 = linearLayout14;
                textView = textView2;
                str = str2;
                linearLayout = linearLayout12;
                layoutParams = layoutParams3;
                linearLayout3 = linearLayout13;
                alertDialog = create;
            }
            size2--;
            create = alertDialog;
            textView2 = textView;
            str2 = str;
            linearLayout12 = linearLayout;
            i3 = 0;
            i = -1;
            i4 = 2;
            linearLayout13 = linearLayout3;
            layoutParams3 = layoutParams;
            linearLayout14 = linearLayout2;
            i2 = ViewCompat.MEASURED_STATE_MASK;
        }
        linearLayout12.addView(linearLayout14);
        create.setView(linearLayout12);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(i3));
        create.getWindow().setLayout(-2, -2);
        textView2.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, i4, i2, -657931));
    }

    public void starr50(LinearLayout linearLayout, LinearLayout linearLayout2) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = (float) (((double) ((float) displayMetrics.widthPixels)) * 0.8d);
        this.w = 1200.0d;
        this.h = 500.0d;
        double d2 = (double) f;
        try {
            this.scol = d2 / 1200.0d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.w, (int) this.h, 0.0f);
            layoutParams.setMargins(1, 1, 1, 1);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setScaleX((float) (d2 / this.w));
            linearLayout.setScaleY((float) (d2 / this.w));
            linearLayout.setTranslationX(0.0f);
            linearLayout.setTranslationY(0.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) f, (int) (this.h * this.scol), 0.0f);
            layoutParams2.setMargins(1, 8, 1, 8);
            linearLayout2.setLayoutParams(layoutParams2);
            linearLayout2.setGravity(17);
        } catch (Exception unused) {
        }
    }

    public void _dialog_almarageA() {
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
        final EditText editText = new EditText(getApplicationContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        layoutParams3.setMargins(2, 2, 2, 2);
        editText.setLayoutParams(layoutParams3);
        editText.setGravity(53);
        ImageView imageView = new ImageView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(45, -1, 0.0f);
        layoutParams4.setMargins(1, 1, 1, 1);
        imageView.setLayoutParams(layoutParams4);
        imageView.setImageResource(R.drawable.ulang_19);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        linearLayout3.addView(imageView);
        TextView textView = new TextView(getApplicationContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 0.0f));
        textView.setTextColor(-1499549);
        textView.setTextSize(14.0f);
        textView.setText("كتابة نص توضيحي تحت الصوره");
        textView.setGravity(17);
        linearLayout3.addView(textView);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        layoutParams5.setMargins(2, 2, 2, 0);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams6.setMargins(0, 2, 2, 0);
        linearLayout4.setLayoutParams(layoutParams6);
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
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 1.0f);
        layoutParams7.setMargins(2, 3, 3, 2);
        linearLayout5.setLayoutParams(layoutParams7);
        linearLayout5.setGravity(53);
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -657931));
        linearLayout5.addView(editText);
        linearLayout2.addView(linearLayout5);
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        linearLayout6.setOrientation(0);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams8.setMargins(0, 4, 0, 4);
        linearLayout6.setLayoutParams(layoutParams8);
        linearLayout2.addView(linearLayout6);
        LinearLayout linearLayout7 = new LinearLayout(getApplicationContext());
        linearLayout7.setOrientation(0);
        linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(-1, 70, 0.0f));
        linearLayout7.setGravity(17);
        linearLayout2.addView(linearLayout7);
        final RadioButton radioButton = new RadioButton(getApplicationContext());
        radioButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        radioButton.setBackgroundColor(-1118482);
        radioButton.setText("إخفاء النص التوضيحي");
        radioButton.setTextSize(12.0f);
        radioButton.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        radioButton.setGravity(17);
        linearLayout7.addView(radioButton);
        final RadioButton radioButton2 = new RadioButton(getApplicationContext());
        radioButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
        radioButton2.setBackgroundColor(-657931);
        radioButton2.setText("إظهار  النص التوضيحي ");
        radioButton2.setTextSize(12.0f);
        radioButton2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        radioButton2.setGravity(17);
        linearLayout7.addView(radioButton2);
        editText.setText(this.text_shaql.getText().toString());
        editText.setHint("إكتب نص توضيحي مثلا: شكل رقم ( )");
        editText.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -1));
        if (this.text_photo_var == 0.0d) {
            radioButton.setChecked(true);
        } else {
            radioButton2.setChecked(true);
        }
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    EnterExzamActivity.this.text_photo_var = 1.0d;
                    radioButton.setChecked(false);
                }
            }
        });
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    EnterExzamActivity.this.text_photo_var = 0.0d;
                    radioButton2.setChecked(false);
                }
            }
        });
        linearLayout6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 0, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 60, 1.0f));
        textView2.setTextColor(-59580);
        textView2.setTextSize(15.0f);
        textView2.setText("هل تريد الحفظ ؟");
        textView2.setGravity(17);
        linearLayout2.addView(textView2);
        LinearLayout linearLayout8 = new LinearLayout(getApplicationContext());
        linearLayout8.setOrientation(0);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams9.setMargins(0, 8, 8, 0);
        linearLayout8.setLayoutParams(layoutParams9);
        TextView textView3 = new TextView(getApplicationContext());
        textView3.setTextColor(-1499549);
        textView3.setTextSize(15.0f);
        textView3.setText("cancel");
        textView3.setGravity(17);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                editText.requestFocus();
                editText.setShowSoftInputOnFocus(false);
                editText.setEnabled(false);
                create.dismiss();
            }
        });
        linearLayout8.addView(textView3);
        RadioButton radioButton3 = radioButton2;
        ImageView imageView2 = imageView;
        textView3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView4 = new TextView(getApplicationContext());
        textView4.setTextColor(-59580);
        textView4.setTextSize(15.0f);
        textView4.setText("ok");
        textView4.setGravity(17);
        linearLayout8.addView(textView4);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(200, 75, 1.0f);
        layoutParams10.setMargins(10, 1, 1, 10);
        textView4.setLayoutParams(layoutParams10);
        textView3.setLayoutParams(layoutParams10);
        RadioButton radioButton4 = radioButton;
        textView4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout2.setBackgroundColor(-1);
        editText.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -1));
        linearLayout2.addView(linearLayout8);
        linearLayout.addView(linearLayout2);
        try {
            textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
        } catch (Exception unused) {
        }
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (EnterExzamActivity.this.text_photo_var == 0.0d) {
                    EnterExzamActivity.this.text_shaql.setVisibility(8);
                } else {
                    EnterExzamActivity.this.text_shaql.setVisibility(0);
                }
                create.dismiss();
                EnterExzamActivity.this.text_shaql.setText(editText.getText().toString());
                EnterExzamActivity.this.Tex_im = editText.getText().toString();
            }
        });
        try {
            editText.setEnabled(true);
            editText.requestFocus();
            ((InputMethodManager) getSystemService("input_method")).showSoftInput(editText, 1);
            editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
        } catch (Exception unused2) {
        }
        create.setView(linearLayout);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        create.getWindow().setLayout(-2, -2);
        AnonymousClass186 r3 = new TimerTask() {
            public void run() {
                EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                final EditText editText = editText;
                enterExzamActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        editText.setEnabled(true);
                        editText.requestFocus();
                        ((InputMethodManager) EnterExzamActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                        EditText editText = editText;
                        editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                    }
                });
            }
        };
        this.timer_5 = r3;
        this._timer.schedule(r3, 70);
        editText.setPadding(0, 0, 0, 0);
        try {
            radioButton4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            editText.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            radioButton3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
        } catch (Exception unused3) {
        }
        ImageView imageView3 = imageView2;
        imageView3.setImageResource(R.drawable.nasa_98);
        imageView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
    }

    /* access modifiers changed from: private */
    public void viewTransformation(View view, MotionEvent motionEvent, int i, int i2, int i3) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.xCoOrdinate = view.getX() - motionEvent.getRawX();
            this.yCoOrdinate = view.getY() - motionEvent.getRawY();
            this.start.set(motionEvent.getX(), motionEvent.getY());
            this.isOutSide = false;
            this.mode = 1;
            this.lastEvent = null;
        } else if (action == 1) {
            this.isZoomAndRotate = false;
            if (this.mode == 1) {
                motionEvent.getX();
                motionEvent.getY();
            }
        } else if (action != 2) {
            if (action == 4) {
                this.isOutSide = true;
                this.mode = 0;
                this.lastEvent = null;
            } else if (action == 5) {
                float spacing = spacing(motionEvent);
                this.oldDist = spacing;
                if (spacing > 10.0f) {
                    midPoint(this.mid, motionEvent);
                    this.mode = 2;
                }
            } else if (action == 6) {
                this.mode = 0;
                this.lastEvent = null;
                double d2 = this.H;
                float f = this.scale;
                this.H = d2 * ((double) f);
                this.W *= (double) f;
                this.scale = 1.0f;
            }
        } else if (!this.isOutSide && this.mode == 2 && motionEvent.getPointerCount() == 2) {
            float spacing2 = spacing(motionEvent);
            if (spacing2 > 10.0f) {
                float scaleX = (spacing2 / this.oldDist) * view.getScaleX();
                this.scale = scaleX;
                Vzoom(view, scaleX);
            }
        }
    }

    public void Vzoom(View view, float f) {
        double d2 = (double) f;
        this.L900.setLayoutParams(new LinearLayout.LayoutParams((int) (this.W * d2), (int) (this.H * d2), 0.0f));
        String concat = String.valueOf((long) (this.W * d2)).concat(",".concat(String.valueOf((long) (this.H * d2)).concat(",".concat(String.valueOf((long) this.Wi)))));
        this.size = concat;
        this.text_size.setText(concat);
    }

    private float rotation(MotionEvent motionEvent) {
        return (float) Math.toDegrees(Math.atan2((double) (motionEvent.getY(0) - motionEvent.getY(1)), (double) (motionEvent.getX(0) - motionEvent.getX(1))));
    }

    private float spacing(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) ((int) Math.sqrt((double) ((x * x) + (y * y))));
    }

    private void midPoint(PointF pointF, MotionEvent motionEvent) {
        pointF.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
    }

    public void _dialog_size_swmk() {
        String str;
        LinearLayout linearLayout;
        final AlertDialog create = new AlertDialog.Builder(this).create();
        LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
        int i = -1;
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        LinearLayout linearLayout3 = new LinearLayout(getApplicationContext());
        linearLayout3.setOrientation(1);
        int i2 = -2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams.setMargins(2, 2, 2, 2);
        linearLayout3.setLayoutParams(layoutParams);
        linearLayout3.setPadding(12, 12, 12, 12);
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        int i3 = 0;
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams2.setMargins(1, 1, 1, 4);
        linearLayout4.setLayoutParams(layoutParams2);
        linearLayout4.setPadding(12, 12, 12, 12);
        linearLayout4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 1, ViewCompat.MEASURED_STATE_MASK, -657931));
        linearLayout3.setGravity(17);
        ImageView imageView = new ImageView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(45, 60, 0.0f);
        layoutParams3.setMargins(1, 1, 1, 1);
        imageView.setLayoutParams(layoutParams3);
        imageView.setImageResource(R.drawable.ulang_19);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        linearLayout4.addView(imageView);
        TextView textView = new TextView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 60, 0.0f);
        layoutParams4.setMargins(2, 2, 2, 0);
        textView.setLayoutParams(layoutParams4);
        textView.setTextColor(-1499549);
        textView.setTextSize(14.0f);
        textView.setGravity(17);
        linearLayout4.addView(textView);
        linearLayout3.addView(linearLayout4);
        LinearLayout linearLayout5 = new LinearLayout(getApplicationContext());
        linearLayout5.setOrientation(0);
        int i4 = 3;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams5.setMargins(0, 2, 2, 0);
        linearLayout5.setLayoutParams(layoutParams5);
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -1118482));
        linearLayout3.addView(linearLayout5);
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        linearLayout6.setOrientation(0);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams6.setMargins(2, 3, 3, 2);
        linearLayout6.setLayoutParams(layoutParams6);
        linearLayout6.setGravity(53);
        linearLayout6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -720809));
        textView.setText("رموز رياضيات");
        this.s1000 = ">≥≤<π=/*-+()%√≺⊂∪∩∈ℕ⨯∆∅CBA𝔓∫∑limₓ→ₐ-'xⁿº+-*/=)(π∞xⁿº+-*/=∇)(⊂+-/∩∪∈ℕ≺∪⨯∆∅∇xⁿº+-*/=π()||\n✐✎☏✃✄☾☽☉℃°ϟ☇➟➢➣➤➥➦➧➨➚➘➙➛➜➝➞⏎←↑→↓↚↛↜↝↞↟↠↡↢↣↤↥↦↧↨➫➬➩➪➭➮➯➱↫↬↭↮↯↰↱↲↳↴↵↶↷↸↹↺↻↼↽↾↿⇀⇁⇂⇃⇄⇅⇆⇇⇈⇉⇊⇋⇌⇍⇎⇏⇐⇑⇒⇓⇔⇕⇖⇗⇘⇙⇚⇛⇜⇝⇞⇟⇠⇡⇢⇣⇤⇥⇦⇧⇨⇩⇪☜☞☚☛✽✾✿❁❃❋❀⚘✓√☐☒✗✘✕☓℠℗▲▼◄►◣◢◥◤◥▸◂▴▾△▽▷◁⊿▻◅▵▿▹◃≂≃≄≅≆≇≈≉ⒶⒷⒸⒹⒺⒻⒼⒽⒾⒿⓀⓁⓃⓄⓅⓆⓇⓈⓉⓊⓋⓌⓍⓎⓏⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩا❶❷❸❹❺❻❼❽❾❿⁰²ⁱ⁴⁵⁶⁷⁸⁹⁺⁻⁼⁽⁾ⁿ₀₁₂₃₄₅₆₇₈₉H¹²³⁴⁵⁶⁷⁸⁹⁻⁼⁽⁾ⁿ∓±___H₂₀₁₂₃₄₅₆₇₈₉";
        ScrollView scrollView = new ScrollView(getApplicationContext());
        LinearLayout linearLayout7 = new LinearLayout(getApplicationContext());
        linearLayout7.setOrientation(1);
        LinearLayout linearLayout8 = new LinearLayout(getApplicationContext());
        linearLayout8.setOrientation(1);
        int i5 = 0;
        while (true) {
            str = "fonts/font.ttf";
            if (i5 >= this.s1000.length() / 10) {
                break;
            }
            LinearLayout linearLayout9 = new LinearLayout(getApplicationContext());
            linearLayout9.setOrientation(i3);
            int i6 = 0;
            int i7 = 10;
            while (i6 < i7) {
                int i8 = (i5 * 11) + i6;
                final TextView textView2 = new TextView(getApplicationContext());
                try {
                    linearLayout = linearLayout2;
                    try {
                        textView2.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    linearLayout = linearLayout2;
                }
                String str2 = str;
                LinearLayout linearLayout10 = linearLayout3;
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(40, 70, 1.0f);
                layoutParams7.setMargins(1, 1, 1, 1);
                textView2.setLayoutParams(layoutParams7);
                final String str3 = this.s4;
                try {
                    this.s4 = this.s1000.substring(i8, i8 + 1);
                    textView2.setText(str3);
                } catch (Exception unused3) {
                    textView2.setText(BuildConfig.FLAVOR);
                }
                textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                textView2.setGravity(17);
                textView2.setBackgroundColor(-1);
                textView2.setTextSize(16.0f);
                textView2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        try {
                            String obj = EnterExzamActivity.this.edittext1.getText().toString();
                            String str = str3;
                            int selectionEnd = EnterExzamActivity.this.edittext1.getSelectionEnd() + str.length();
                            EnterExzamActivity.this.edittext1.setText(obj.substring(0, EnterExzamActivity.this.edittext1.getSelectionEnd()).concat(str.concat(obj.substring(EnterExzamActivity.this.edittext1.getSelectionEnd(), EnterExzamActivity.this.edittext1.getText().toString().length()))));
                            EnterExzamActivity.this.edittext1.requestFocus();
                            EnterExzamActivity.this.edittext1.setSelection(selectionEnd, selectionEnd);
                        } catch (Exception unused) {
                        }
                        EnterExzamActivity enterExzamActivity = EnterExzamActivity.this;
                        enterExzamActivity._set_TextView(enterExzamActivity.edittext1);
                        textView2.setBackgroundColor(-720809);
                        create.dismiss();
                    }
                });
                linearLayout9.setBackgroundColor(-6381922);
                linearLayout9.addView(textView2);
                i6++;
                linearLayout2 = linearLayout;
                str = str2;
                linearLayout3 = linearLayout10;
                i = -1;
                i7 = 10;
                i3 = 0;
            }
            linearLayout8.addView(linearLayout9);
            i5++;
            i4 = 3;
            i2 = -2;
        }
        linearLayout7.addView(linearLayout8);
        scrollView.addView(linearLayout7);
        linearLayout3.addView(scrollView);
        LinearLayout linearLayout11 = new LinearLayout(getApplicationContext());
        linearLayout11.setOrientation(i3);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(i, i4, 0.0f);
        layoutParams8.setMargins(i3, 4, i3, 4);
        linearLayout11.setLayoutParams(layoutParams8);
        linearLayout3.addView(linearLayout11);
        linearLayout11.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(i3, i3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        LinearLayout linearLayout12 = new LinearLayout(getApplicationContext());
        linearLayout12.setOrientation(i3);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(i, i2, 0.0f);
        layoutParams9.setMargins(i3, 8, 1, i3);
        linearLayout12.setLayoutParams(layoutParams9);
        TextView textView3 = new TextView(getApplicationContext());
        textView3.setLayoutParams(new LinearLayout.LayoutParams(120, 50, 1.0f));
        textView3.setTextColor(-1499549);
        textView3.setTextSize(13.0f);
        textView3.setText("cancel");
        textView3.setGravity(17);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        linearLayout12.addView(textView3);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(200, 80, 1.0f);
        layoutParams10.setMargins(10, 1, 1, 10);
        textView3.setLayoutParams(layoutParams10);
        textView3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(10, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout3.setBackgroundColor(i);
        linearLayout3.addView(linearLayout12);
        linearLayout2.addView(linearLayout3);
        try {
            textView.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
            textView3.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
        } catch (Exception unused4) {
        }
        create.setView(linearLayout2);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(i3));
        create.getWindow().setLayout(i, -2);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
    }

    public void dioalog_zoom() {
        Bitmap createBitmap = Bitmap.createBitmap(this.linear_pdf_0.getWidth(), this.linear_pdf_0.getHeight(), Bitmap.Config.ARGB_8888);
        this.linear24.draw(new Canvas(createBitmap));
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
        textView.setText("عرض قابل للتكبير// للقراه فقط");
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        ImageView imageView2 = new ImageView(getApplicationContext());
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageBitmap(createBitmap);
        try {
            new PhotoViewAttacher(imageView2).update();
        } catch (Exception unused) {
        }
        linearLayout6.addView(imageView2);
        try {
            linearLayout6.setBackgroundColor((int) this.color);
        } catch (Exception unused2) {
        }
        linearLayout6.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        imageView2.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 1, -1118482, -1));
        linearLayout5.addView(linearLayout6);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams7.setMargins(2, 2, 2, 2);
        linearLayout5.setLayoutParams(layoutParams7);
        try {
            linearLayout5.setBackgroundColor((int) this.color);
        } catch (Exception unused3) {
        }
        linearLayout2.addView(linearLayout5);
        LinearLayout linearLayout7 = new LinearLayout(getApplicationContext());
        linearLayout7.setOrientation(0);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams8.setMargins(0, 4, 0, 4);
        linearLayout7.setLayoutParams(layoutParams8);
        linearLayout2.addView(linearLayout7);
        linearLayout7.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 0, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 60, 1.0f));
        textView2.setTextColor(-59580);
        textView2.setTextSize(15.0f);
        textView2.setText("هل تريد الحفظ ؟");
        textView2.setGravity(17);
        linearLayout2.addView(textView2);
        LinearLayout linearLayout8 = new LinearLayout(getApplicationContext());
        linearLayout8.setOrientation(0);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams9.setMargins(0, 8, 1, 0);
        linearLayout8.setLayoutParams(layoutParams9);
        TextView textView3 = new TextView(getApplicationContext());
        textView3.setLayoutParams(new LinearLayout.LayoutParams(120, 50, 1.0f));
        textView3.setTextColor(-1499549);
        textView3.setTextSize(15.0f);
        textView3.setText("cancel");
        textView3.setGravity(17);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        linearLayout8.addView(textView3);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams10.setMargins(10, 1, 1, 10);
        textView3.setLayoutParams(layoutParams10);
        ImageView imageView3 = imageView;
        textView3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView4 = new TextView(getApplicationContext());
        textView4.setLayoutParams(new LinearLayout.LayoutParams(150, 45, 1.0f));
        textView4.setTextColor(-59580);
        textView4.setTextSize(15.0f);
        textView4.setText("ok");
        textView4.setGravity(17);
        linearLayout8.addView(textView4);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams11.setMargins(10, 1, 1, 10);
        textView4.setLayoutParams(layoutParams11);
        LinearLayout linearLayout9 = linearLayout6;
        textView4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout2.setBackgroundColor(-1);
        linearLayout2.addView(linearLayout8);
        linearLayout.addView(linearLayout2);
        try {
            textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
        } catch (Exception unused4) {
        }
        textView4.setOnClickListener(new View.OnClickListener() {
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
        textView2.setText("ملاحظه : يمكنك التكبير بإستخدام اللمس .");
        textView2.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams12.setMargins(2, 2, 2, 2);
        textView2.setLayoutParams(layoutParams12);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, 80, 0.0f);
        layoutParams13.setMargins(2, 2, 2, 2);
        textView4.setLayoutParams(layoutParams13);
        textView3.setVisibility(8);
        linearLayout5.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        linearLayout9.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView2.setTextColor(-15064194);
        ImageView imageView4 = imageView3;
        imageView4.setImageResource(R.drawable.o91_3_7);
        imageView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
    }

    public void _go_beeak() {
        this.dialog_6.setTitle("☆☆تنبيه هااام☆☆");
        this.dialog_6.setIcon(R.drawable.ulang_19);
        this.dialog_6.setMessage("هل تريد حفظ التغيرات قبل الخروج ؟!!");
        this.dialog_6.setPositiveButton("حفظ", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                EnterExzamActivity.this._save_function();
                Intent intent = new Intent();
                intent.setClass(EnterExzamActivity.this.getApplicationContext(), ExzamViewActivity.class);
                intent.putExtra(DatabaseHelper.COL_0, EnterExzamActivity.this.ID);
                intent.putExtra("page", String.valueOf((long) EnterExzamActivity.this.paggg));
                intent.putExtra("T", "1");
                EnterExzamActivity.this.startActivity(intent);
                EnterExzamActivity.this.finish();
            }
        });
        this.dialog_6.setNegativeButton("   عدم حفظ ", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                intent.setClass(EnterExzamActivity.this.getApplicationContext(), ExzamViewActivity.class);
                intent.putExtra(DatabaseHelper.COL_0, EnterExzamActivity.this.ID);
                intent.putExtra("page", String.valueOf((long) EnterExzamActivity.this.paggg));
                intent.putExtra("T", "1");
                EnterExzamActivity.this.startActivity(intent);
                EnterExzamActivity.this.finish();
            }
        });
        this.dialog_6.setNeutralButton("إلغاء ", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        this.dialog_6.create().show();
    }

    public void _dialog_tols1() {
        final AlertDialog create = new AlertDialog.Builder(this).create();
        View inflate = getLayoutInflater().inflate(R.layout.dd1, (ViewGroup) null);
        create.setView(inflate);
        create.requestWindowFeature(1);
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.linear1);
        Button button = (Button) inflate.findViewById(R.id.button2);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.linear40);
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R.id.linear43);
        LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(R.id.linear45);
        LinearLayout linearLayout5 = (LinearLayout) inflate.findViewById(R.id.linear46);
        LinearLayout linearLayout6 = (LinearLayout) inflate.findViewById(R.id.linear47);
        final TextView textView = (TextView) inflate.findViewById(R.id.text_4);
        final TextView textView2 = (TextView) inflate.findViewById(R.id.text_3);
        final TextView textView3 = (TextView) inflate.findViewById(R.id.text_2);
        final TextView textView4 = (TextView) inflate.findViewById(R.id.text_1);
        final TextView textView5 = (TextView) inflate.findViewById(R.id.text_8);
        final TextView textView6 = (TextView) inflate.findViewById(R.id.text_7);
        final TextView textView7 = (TextView) inflate.findViewById(R.id.text_6);
        final TextView textView8 = (TextView) inflate.findViewById(R.id.text_5);
        final TextView textView9 = (TextView) inflate.findViewById(R.id.text_12);
        final TextView textView10 = (TextView) inflate.findViewById(R.id.text_11);
        final TextView textView11 = (TextView) inflate.findViewById(R.id.text_10);
        final TextView textView12 = (TextView) inflate.findViewById(R.id.text_9);
        Button button2 = (Button) inflate.findViewById(R.id.button_het);
        TextView textView13 = (TextView) inflate.findViewById(R.id.text_15);
        TextView textView14 = (TextView) inflate.findViewById(R.id.text_14);
        TextView textView15 = (TextView) inflate.findViewById(R.id.text_13);
        TextView textView16 = (TextView) inflate.findViewById(R.id.text_18);
        TextView textView17 = (TextView) inflate.findViewById(R.id.text_17);
        final TextView textView18 = (TextView) inflate.findViewById(R.id.text_16);
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_("\n".concat(textView.getText().toString().concat(" ")));
                create.dismiss();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_("\n".concat(textView2.getText().toString().concat(" ")));
                create.dismiss();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_("\n".concat(textView3.getText().toString().concat(" ")));
                create.dismiss();
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_("\n".concat(textView4.getText().toString().concat(" ")));
                create.dismiss();
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_("\n".concat(textView5.getText().toString().concat(" ")));
                create.dismiss();
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_("\n".concat(textView6.getText().toString().concat(" ")));
                create.dismiss();
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_("\n".concat(textView7.getText().toString().concat(" ")));
                create.dismiss();
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_("\n".concat(textView8.getText().toString().concat(" ")));
                create.dismiss();
            }
        });
        textView12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView12.getText().toString().concat(" "));
                create.dismiss();
            }
        });
        textView11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView11.getText().toString().concat(" "));
                create.dismiss();
            }
        });
        textView10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView10.getText().toString().concat(" "));
                create.dismiss();
            }
        });
        textView9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView9.getText().toString().concat(" "));
                create.dismiss();
            }
        });
        textView15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_("\n".concat("ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ".concat("\n")));
                create.dismiss();
            }
        });
        textView14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
                EnterExzamActivity.this._tollls_("          ");
            }
        });
        textView13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_("ـــ");
                create.dismiss();
            }
        });
        textView18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView18.getText().toString());
                create.dismiss();
            }
        });
        final TextView textView19 = textView17;
        textView19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView19.getText().toString());
                create.dismiss();
            }
        });
        final TextView textView20 = textView16;
        textView20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView20.getText().toString());
                create.dismiss();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        create.show();
    }

    public void _dialog_tols2() {
        final AlertDialog create = new AlertDialog.Builder(this).create();
        View inflate = getLayoutInflater().inflate(R.layout.dd2, (ViewGroup) null);
        create.setView(inflate);
        create.requestWindowFeature(1);
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.linear1);
        Button button = (Button) inflate.findViewById(R.id.button2);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.linear40);
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R.id.linear43);
        LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(R.id.linear45);
        LinearLayout linearLayout5 = (LinearLayout) inflate.findViewById(R.id.linear49);
        LinearLayout linearLayout6 = (LinearLayout) inflate.findViewById(R.id.linear51);
        LinearLayout linearLayout7 = (LinearLayout) inflate.findViewById(R.id.linear48);
        LinearLayout linearLayout8 = (LinearLayout) inflate.findViewById(R.id.linear50);
        LinearLayout linearLayout9 = (LinearLayout) inflate.findViewById(R.id.linear46);
        LinearLayout linearLayout10 = (LinearLayout) inflate.findViewById(R.id.linear47);
        LinearLayout linearLayout11 = (LinearLayout) inflate.findViewById(R.id.linear53);
        final TextView textView = (TextView) inflate.findViewById(R.id.text_9);
        final TextView textView2 = (TextView) inflate.findViewById(R.id.text_10);
        final TextView textView3 = (TextView) inflate.findViewById(R.id.text_5);
        final TextView textView4 = (TextView) inflate.findViewById(R.id.text_2);
        final TextView textView5 = (TextView) inflate.findViewById(R.id.text_6);
        final TextView textView6 = (TextView) inflate.findViewById(R.id.text_16);
        final TextView textView7 = (TextView) inflate.findViewById(R.id.text_1);
        final TextView textView8 = (TextView) inflate.findViewById(R.id.text_15);
        final TextView textView9 = (TextView) inflate.findViewById(R.id.text_14);
        final TextView textView10 = (TextView) inflate.findViewById(R.id.text_13);
        final TextView textView11 = (TextView) inflate.findViewById(R.id.textview2);
        final TextView textView12 = (TextView) inflate.findViewById(R.id.textview3);
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView4.getText().toString().concat(" "));
                create.dismiss();
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView7.getText().toString().concat(" "));
                create.dismiss();
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView5.getText().toString().concat(" "));
                create.dismiss();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView3.getText().toString().concat(" "));
                create.dismiss();
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView.getText().toString());
                create.dismiss();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView2.getText().toString());
                create.dismiss();
            }
        });
        textView10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView10.getText().toString());
                create.dismiss();
            }
        });
        textView9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView9.getText().toString());
                create.dismiss();
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView8.getText().toString());
                create.dismiss();
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(" ".concat(textView6.getText().toString().concat(" ")));
                create.dismiss();
            }
        });
        ((Button) inflate.findViewById(R.id.button_het)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        textView11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView11.getText().toString().concat("\n\n\n"));
                create.dismiss();
            }
        });
        textView12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EnterExzamActivity.this._tollls_(textView12.getText().toString().concat("\n\n\n"));
                create.dismiss();
            }
        });
        create.show();
    }

    public void _tollls_(String str) {
        try {
            String obj = this.edittext1.getText().toString();
            int selectionEnd = this.edittext1.getSelectionEnd() + str.length();
            EditText editText = this.edittext1;
            editText.setText(obj.substring(0, editText.getSelectionEnd()).concat(str.concat(obj.substring(this.edittext1.getSelectionEnd(), this.edittext1.getText().toString().length()))));
            this.edittext1.requestFocus();
            this.edittext1.setSelection(selectionEnd, selectionEnd);
        } catch (Exception unused) {
        }
        _set_TextView(this.edittext1);
    }

    public class Spinner_back_colorAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public long getItemId(int i) {
            return (long) i;
        }

        public Spinner_back_colorAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        public int getCount() {
            return this._data.size();
        }

        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        public View getView(final int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = EnterExzamActivity.this.getLayoutInflater();
            if (view == null) {
                view = layoutInflater.inflate(R.layout.custam_c, (ViewGroup) null);
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linear13);
            TextView textView = (TextView) view.findViewById(R.id.text_1);
            TextView textView2 = (TextView) view.findViewById(R.id.textview1);
            TextView textView3 = (TextView) view.findViewById(R.id.textview2);
            TextView textView4 = (TextView) view.findViewById(R.id.textview4);
            TextView textView5 = (TextView) view.findViewById(R.id.textview5);
            TextView textView6 = (TextView) view.findViewById(R.id.textview6);
            TextView textView7 = (TextView) view.findViewById(R.id.textview7);
            textView.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("1").toString())));
            textView2.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("2").toString())));
            textView3.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("3").toString())));
            textView4.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("4").toString())));
            textView5.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("5").toString())));
            textView6.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("6").toString())));
            textView7.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("7").toString())));
            textView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_back_color, Spinner_back_colorAdapter.this._data.get(i).get("2").toString(), BuildConfig.FLAVOR);
                }
            });
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_back_color, Spinner_back_colorAdapter.this._data.get(i).get("1").toString(), BuildConfig.FLAVOR);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_back_color, Spinner_back_colorAdapter.this._data.get(i).get("3").toString(), BuildConfig.FLAVOR);
                }
            });
            textView4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_back_color, Spinner_back_colorAdapter.this._data.get(i).get("4").toString(), BuildConfig.FLAVOR);
                }
            });
            textView5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_back_color, Spinner_back_colorAdapter.this._data.get(i).get("5").toString(), BuildConfig.FLAVOR);
                }
            });
            textView6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_back_color, Spinner_back_colorAdapter.this._data.get(i).get("6").toString(), BuildConfig.FLAVOR);
                }
            });
            textView7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_back_color, Spinner_back_colorAdapter.this._data.get(i).get("7").toString(), BuildConfig.FLAVOR);
                }
            });
            return view;
        }
    }

    public class Spinner_somk_sizeAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public long getItemId(int i) {
            return (long) i;
        }

        public Spinner_somk_sizeAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        public int getCount() {
            return this._data.size();
        }

        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = EnterExzamActivity.this.getLayoutInflater();
            if (view == null) {
                view = layoutInflater.inflate(R.layout.custam, (ViewGroup) null);
            }
            ((TextView) view.findViewById(R.id.text_1)).setText(String.valueOf((long) i));
            ((LinearLayout) view.findViewById(R.id.linear13)).setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 1, -1118482, -1));
            ((ImageView) view.findViewById(R.id.imageview27)).setImageResource(R.drawable.ic_crop_free_black);
            return view;
        }
    }

    public class Spinner_somk_colorAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public long getItemId(int i) {
            return (long) i;
        }

        public Spinner_somk_colorAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        public int getCount() {
            return this._data.size();
        }

        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        public View getView(final int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = EnterExzamActivity.this.getLayoutInflater();
            if (view == null) {
                view = layoutInflater.inflate(R.layout.custam_c, (ViewGroup) null);
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linear13);
            TextView textView = (TextView) view.findViewById(R.id.text_1);
            TextView textView2 = (TextView) view.findViewById(R.id.textview1);
            TextView textView3 = (TextView) view.findViewById(R.id.textview2);
            TextView textView4 = (TextView) view.findViewById(R.id.textview4);
            TextView textView5 = (TextView) view.findViewById(R.id.textview5);
            TextView textView6 = (TextView) view.findViewById(R.id.textview6);
            TextView textView7 = (TextView) view.findViewById(R.id.textview7);
            textView.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("1").toString())));
            textView2.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("2").toString())));
            textView3.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("3").toString())));
            textView4.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("4").toString())));
            textView5.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("5").toString())));
            textView6.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("6").toString())));
            textView7.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("7").toString())));
            textView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_somk_color, Spinner_somk_colorAdapter.this._data.get(i).get("2").toString(), BuildConfig.FLAVOR);
                }
            });
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_somk_color, Spinner_somk_colorAdapter.this._data.get(i).get("1").toString(), BuildConfig.FLAVOR);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_somk_color, Spinner_somk_colorAdapter.this._data.get(i).get("3").toString(), BuildConfig.FLAVOR);
                }
            });
            textView4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_somk_color, Spinner_somk_colorAdapter.this._data.get(i).get("4").toString(), BuildConfig.FLAVOR);
                }
            });
            textView5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_somk_color, Spinner_somk_colorAdapter.this._data.get(i).get("5").toString(), BuildConfig.FLAVOR);
                }
            });
            textView6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_somk_color, Spinner_somk_colorAdapter.this._data.get(i).get("6").toString(), BuildConfig.FLAVOR);
                }
            });
            textView7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_somk_color, Spinner_somk_colorAdapter.this._data.get(i).get("7").toString(), BuildConfig.FLAVOR);
                }
            });
            return view;
        }
    }

    public class Spinner_font_colorAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public long getItemId(int i) {
            return (long) i;
        }

        public Spinner_font_colorAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        public int getCount() {
            return this._data.size();
        }

        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        public View getView(final int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = EnterExzamActivity.this.getLayoutInflater();
            if (view == null) {
                view = layoutInflater.inflate(R.layout.custam_c, (ViewGroup) null);
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linear13);
            TextView textView = (TextView) view.findViewById(R.id.text_1);
            TextView textView2 = (TextView) view.findViewById(R.id.textview1);
            TextView textView3 = (TextView) view.findViewById(R.id.textview2);
            TextView textView4 = (TextView) view.findViewById(R.id.textview4);
            TextView textView5 = (TextView) view.findViewById(R.id.textview5);
            TextView textView6 = (TextView) view.findViewById(R.id.textview6);
            TextView textView7 = (TextView) view.findViewById(R.id.textview7);
            textView.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("1").toString())));
            textView2.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("2").toString())));
            textView3.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("3").toString())));
            textView4.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("4").toString())));
            textView5.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("5").toString())));
            textView6.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("6").toString())));
            textView7.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 0, 0, Color.parseColor(this._data.get(i).get("7").toString())));
            textView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_font_color, Spinner_font_colorAdapter.this._data.get(i).get("2").toString(), BuildConfig.FLAVOR);
                }
            });
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_font_color, Spinner_font_colorAdapter.this._data.get(i).get("1").toString(), BuildConfig.FLAVOR);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_font_color, Spinner_font_colorAdapter.this._data.get(i).get("3").toString(), BuildConfig.FLAVOR);
                }
            });
            textView4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_font_color, Spinner_font_colorAdapter.this._data.get(i).get("4").toString(), BuildConfig.FLAVOR);
                }
            });
            textView5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_font_color, Spinner_font_colorAdapter.this._data.get(i).get("5").toString(), BuildConfig.FLAVOR);
                }
            });
            textView6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_font_color, Spinner_font_colorAdapter.this._data.get(i).get("6").toString(), BuildConfig.FLAVOR);
                }
            });
            textView7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    EnterExzamActivity.this._spener_costam(EnterExzamActivity.this.text_font_color, Spinner_font_colorAdapter.this._data.get(i).get("7").toString(), BuildConfig.FLAVOR);
                }
            });
            return view;
        }
    }

    public class Spinner_font_sizeAdapter extends BaseAdapter {
        ArrayList<HashMap<String, Object>> _data;

        public long getItemId(int i) {
            return (long) i;
        }

        public Spinner_font_sizeAdapter(ArrayList<HashMap<String, Object>> arrayList) {
            this._data = arrayList;
        }

        public int getCount() {
            return this._data.size();
        }

        public HashMap<String, Object> getItem(int i) {
            return this._data.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater = EnterExzamActivity.this.getLayoutInflater();
            if (view == null) {
                view = layoutInflater.inflate(R.layout.custam, (ViewGroup) null);
            }
            ((TextView) view.findViewById(R.id.text_1)).setText(String.valueOf((long) i));
            ((ImageView) view.findViewById(R.id.imageview27)).setImageResource(R.drawable.ic_format_size_black);
            ((LinearLayout) view.findViewById(R.id.linear13)).setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(2, 1, -1118482, -1));
            return view;
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
