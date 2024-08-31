package com.Nasa.Soft.Exzam.Editor35;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import uk.co.senab.photoview.BuildConfig;
import uk.co.senab.photoview.PhotoViewAttacher;

public class ExzamViewActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    public double Cf = 0.0d;
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> Data_Map = new ArrayList<>();
    private double Etar = 0.0d;
    private String Etar_color = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String ID = BuildConfig.FLAVOR;
    private String Kay_ss = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> List_PL = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> List_all = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> List_ch_PD = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> List_ch_PL = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> List_map = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<HashMap<String, Object>> List_startMap = new ArrayList<>();
    private ArrayList<HashMap<String, Object>> List_ttttex = new ArrayList<>();
    /* access modifiers changed from: private */
    public HashMap<String, Object> Map_A = new HashMap<>();
    private String Name = BuildConfig.FLAVOR;
    private String Path = BuildConfig.FLAVOR;
    public final int REQ_CD_CAMIRA = 101;
    public final int REQ_CD_IMAGE_TSF = 102;
    private String T_in = BuildConfig.FLAVOR;
    private String T_out = BuildConfig.FLAVOR;
    private String T_z5 = BuildConfig.FLAVOR;
    private String Type = BuildConfig.FLAVOR;
    private File _file_camira;
    /* access modifiers changed from: private */
    public Timer _timer = new Timer();
    private String abC = BuildConfig.FLAVOR;
    private LinearLayout base;
    private String beack_color = BuildConfig.FLAVOR;
    private Intent camira = new Intent("android.media.action.IMAGE_CAPTURE");
    private SharedPreferences codee;
    private double color = 0.0d;
    private AlertDialog.Builder dialog;
    /* access modifiers changed from: private */
    public AlertDialog.Builder dialog_p;
    private Calendar djcg5 = Calendar.getInstance();
    private String file_name = BuildConfig.FLAVOR;
    private double fort = 0.0d;
    private double h = 0.0d;
    /* access modifiers changed from: private */
    public Intent i = new Intent();
    private ImageView imag_shear_1;
    private ImageView image_delet_1;
    /* access modifiers changed from: private */
    public ImageView image_shear;
    private ImageView image_tipi;
    /* access modifiers changed from: private */
    public Intent image_tsf = new Intent("android.intent.action.GET_CONTENT");
    private ImageView imageview3;
    private ImageView imageview39;
    private ImageView imageview4;
    private ImageView imageview40;
    private ImageView imageview6;
    /* access modifiers changed from: private */
    public ImageView imageview7;
    private ImageView imageview8;
    /* access modifiers changed from: private */
    public LinearLayout layout1;
    /* access modifiers changed from: private */
    public LinearLayout layout2;
    private LinearLayout layout3;
    private LinearLayout layout4;
    private LinearLayout layouts;
    private LinearLayout liar320;
    private LinearLayout lin73yeg;
    private LinearLayout lin7tfq_5;
    private LinearLayout line728;
    private LinearLayout line_ar313;
    private LinearLayout linea_Exzam1;
    private LinearLayout linea_Exzam2;
    private LinearLayout linea_view;
    private LinearLayout linear01;
    /* access modifiers changed from: private */
    public LinearLayout linear1;
    private LinearLayout linear11_all;
    private LinearLayout linear16;
    private LinearLayout linear17;
    private LinearLayout linear18;
    /* access modifiers changed from: private */
    public LinearLayout linear19;
    private LinearLayout linear2;
    private LinearLayout linear20;
    private LinearLayout linear21;
    private LinearLayout linear22;
    private LinearLayout linear23;
    private LinearLayout linear29;
    private LinearLayout linear30;
    /* access modifiers changed from: private */
    public LinearLayout linear300;
    /* access modifiers changed from: private */
    public LinearLayout linear301;
    private LinearLayout linear305;
    private LinearLayout linear306;
    private LinearLayout linear307;
    private LinearLayout linear308;
    private LinearLayout linear309;
    private LinearLayout linear31;
    private LinearLayout linear312;
    private LinearLayout linear313;
    private LinearLayout linear317;
    private LinearLayout linear318;
    private LinearLayout linear319;
    private LinearLayout linear32;
    private LinearLayout linear323;
    private LinearLayout linear324;
    private LinearLayout linear325;
    private LinearLayout linear327;
    private LinearLayout linear328;
    private LinearLayout linear329;
    private LinearLayout linear33;
    private LinearLayout linear34;
    private LinearLayout linear35;
    private LinearLayout linear36;
    private LinearLayout linear37;
    private LinearLayout linear38;
    private LinearLayout linear39;
    private LinearLayout linear40;
    private LinearLayout linear7;
    private LinearLayout linear8;
    private LinearLayout linear9;
    private LinearLayout linear_312;
    private LinearLayout linear_320;
    private LinearLayout linear_all;
    private LinearLayout linear_answer_5;
    private LinearLayout linear_crea5;
    private LinearLayout linear_pdf;
    private LinearLayout linear_pdf1;
    private LinearLayout linear_pdf1_55;
    /* access modifiers changed from: private */
    public LinearLayout linear_pdf_0;
    /* access modifiers changed from: private */
    public LinearLayout linear_pdf_0_5;
    private LinearLayout linear_pdf_55;
    private LinearLayout linear_top;
    private LinearLayout linear_under;
    private LinearLayout linear_view30;
    private LinearLayout linear_viewA;
    private LinearLayout linear_view_1;
    private LinearLayout linear_vio;
    private LinearLayout linearuu326;
    private LinearLayout linew9woke;
    private ListView listview2;
    /* access modifiers changed from: private */
    public HashMap<String, Object> m_Hidar = new HashMap<>();
    private String madah = BuildConfig.FLAVOR;
    private HashMap<String, Object> maer4 = new HashMap<>();
    private HashMap<String, Object> map_A = new HashMap<>();
    /* access modifiers changed from: private */
    public double n = 0.0d;
    private String name = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public String path_image = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public double position_number = 0.0d;
    /* access modifiers changed from: private */
    public SharedPreferences save;
    /* access modifiers changed from: private */
    public SharedPreferences save5;
    /* access modifiers changed from: private */
    public SharedPreferences saveX;
    private String savefff = BuildConfig.FLAVOR;
    private double scol = 0.0d;
    private String size = BuildConfig.FLAVOR;
    private double size_page = 0.0d;
    private Switch switch1;
    private Switch switch2;
    TabLayout tabLayout;
    private LinearLayout tablayout;
    private TextView text_1;
    private TextView text_2;
    private TextView text_3;
    private TextView text_4;
    private TextView text_55;
    private TextView text_5_1;
    private TextView text_5_2;
    private TextView text_6;
    private TextView text_6_5;
    private TextView text_7;
    private TextView text_7_5;
    /* access modifiers changed from: private */
    public TextView text_madah;
    private TextView text_nasa;
    private TextView text_nasa_5;
    private TextView text_new_enter;
    /* access modifiers changed from: private */
    public TextView text_save;
    private TextView text_tarwesah;
    private TextView text_titel;
    private TextView textview1;
    private TextView textview10;
    private TextView textview11;
    private TextView textview12;
    private TextView textview13;
    private TextView textview14;
    private TextView textview15;
    private TextView textview16;
    private TextView textview2;
    private TextView textview3;
    private TextView textview4;
    private TextView textview5;
    private TextView textview6;
    private TextView textview7;
    private TextView textview8;
    private TextView textview9;
    /* access modifiers changed from: private */
    public TimerTask timer_5;
    /* access modifiers changed from: private */
    public LinearLayout trash;
    ViewPager viewPager;
    private ScrollView vscroll1;
    private ScrollView vscroll2;
    private ScrollView vscroll3;
    private ScrollView vscroll4;
    private double w = 0.0d;

    private void foo() {
    }

    public void _Creat_chat(double d, String str, ArrayList<HashMap<String, Object>> arrayList) {
    }

    public void _Start_B() {
    }

    public void _dialog_art() {
    }

    public void _dialog_nmthag() {
    }

    public void _dialog_zooom() {
    }

    public void _on_long_clic() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.exzam_view);
        initialize(bundle);
        if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") == -1 || ContextCompat.checkSelfPermission(this, "android.permission.READ_EXTERNAL_STORAGE") == -1 || ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1000);
        } else {
            initializeLogic();
        }
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 1000) {
            initializeLogic();
        }
    }

    private void initialize(Bundle bundle) {
        Uri uri;
        this.linear_all = (LinearLayout) findViewById(R.id.linear_all);
        this.linear_viewA = (LinearLayout) findViewById(R.id.linear_viewA);
        this.linea_view = (LinearLayout) findViewById(R.id.linea_view);
        this.linear29 = (LinearLayout) findViewById(R.id.linear29);
        this.linear30 = (LinearLayout) findViewById(R.id.linear30);
        this.linear37 = (LinearLayout) findViewById(R.id.linear37);
        this.linear32 = (LinearLayout) findViewById(R.id.linear32);
        this.linear33 = (LinearLayout) findViewById(R.id.linear33);
        this.linear34 = (LinearLayout) findViewById(R.id.linear34);
        this.imageview3 = (ImageView) findViewById(R.id.imageview3);
        this.imageview4 = (ImageView) findViewById(R.id.imageview4);
        this.imageview8 = (ImageView) findViewById(R.id.imageview8);
        this.imageview39 = (ImageView) findViewById(R.id.imageview39);
        this.text_titel = (TextView) findViewById(R.id.text_titel);
        this.switch2 = (Switch) findViewById(R.id.switch2);
        this.imageview7 = (ImageView) findViewById(R.id.imageview7);
        this.imageview6 = (ImageView) findViewById(R.id.imageview6);
        this.linear_view30 = (LinearLayout) findViewById(R.id.linear_view30);
        this.linear11_all = (LinearLayout) findViewById(R.id.linear11_all);
        this.linear_crea5 = (LinearLayout) findViewById(R.id.linear_crea5);
        this.linear35 = (LinearLayout) findViewById(R.id.linear35);
        this.linear_view_1 = (LinearLayout) findViewById(R.id.linear_view_1);
        this.imageview40 = (ImageView) findViewById(R.id.imageview40);
        this.image_tipi = (ImageView) findViewById(R.id.image_tipi);
        this.switch1 = (Switch) findViewById(R.id.switch1);
        this.imag_shear_1 = (ImageView) findViewById(R.id.imag_shear_1);
        this.image_delet_1 = (ImageView) findViewById(R.id.image_delet_1);
        this.linear36 = (LinearLayout) findViewById(R.id.linear36);
        this.linear38 = (LinearLayout) findViewById(R.id.linear38);
        this.layouts = (LinearLayout) findViewById(R.id.layouts);
        this.tablayout = (LinearLayout) findViewById(R.id.tablayout);
        this.base = (LinearLayout) findViewById(R.id.base);
        this.trash = (LinearLayout) findViewById(R.id.trash);
        this.layout1 = (LinearLayout) findViewById(R.id.layout1);
        this.layout2 = (LinearLayout) findViewById(R.id.layout2);
        this.layout3 = (LinearLayout) findViewById(R.id.layout3);
        this.layout4 = (LinearLayout) findViewById(R.id.layout4);
        this.vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
        this.linear327 = (LinearLayout) findViewById(R.id.linear327);
        this.linear300 = (LinearLayout) findViewById(R.id.linear300);
        this.linear_pdf_0_5 = (LinearLayout) findViewById(R.id.linear_pdf_0_5);
        this.linear_pdf_55 = (LinearLayout) findViewById(R.id.linear_pdf_55);
        this.text_nasa_5 = (TextView) findViewById(R.id.text_nasa_5);
        this.linear_pdf1_55 = (LinearLayout) findViewById(R.id.linear_pdf1_55);
        this.linear_vio = (LinearLayout) findViewById(R.id.linear_vio);
        this.linear_under = (LinearLayout) findViewById(R.id.linear_under);
        this.linear_answer_5 = (LinearLayout) findViewById(R.id.linear_answer_5);
        this.linear16 = (LinearLayout) findViewById(R.id.linear16);
        this.vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        this.text_save = (TextView) findViewById(R.id.text_save);
        this.text_madah = (TextView) findViewById(R.id.text_madah);
        this.text_55 = (TextView) findViewById(R.id.text_55);
        this.linear_312 = (LinearLayout) findViewById(R.id.linear_312);
        this.line_ar313 = (LinearLayout) findViewById(R.id.line_ar313);
        this.linearuu326 = (LinearLayout) findViewById(R.id.linearuu326);
        this.linea_Exzam2 = (LinearLayout) findViewById(R.id.linea_Exzam2);
        this.liar320 = (LinearLayout) findViewById(R.id.liar320);
        this.lin7tfq_5 = (LinearLayout) findViewById(R.id.lin7tfq_5);
        this.linew9woke = (LinearLayout) findViewById(R.id.linew9woke);
        this.line728 = (LinearLayout) findViewById(R.id.line728);
        this.text_7_5 = (TextView) findViewById(R.id.text_7_5);
        this.text_6_5 = (TextView) findViewById(R.id.text_6_5);
        this.linear01 = (LinearLayout) findViewById(R.id.linear01);
        this.vscroll4 = (ScrollView) findViewById(R.id.vscroll4);
        this.linear329 = (LinearLayout) findViewById(R.id.linear329);
        this.linear301 = (LinearLayout) findViewById(R.id.linear301);
        this.linear_pdf_0 = (LinearLayout) findViewById(R.id.linear_pdf_0);
        this.linear_pdf = (LinearLayout) findViewById(R.id.linear_pdf);
        this.text_nasa = (TextView) findViewById(R.id.text_nasa);
        this.linear_pdf1 = (LinearLayout) findViewById(R.id.linear_pdf1);
        this.linear_320 = (LinearLayout) findViewById(R.id.linear_320);
        this.linear17 = (LinearLayout) findViewById(R.id.linear17);
        this.linear18 = (LinearLayout) findViewById(R.id.linear18);
        this.linear_top = (LinearLayout) findViewById(R.id.linear_top);
        this.linear323 = (LinearLayout) findViewById(R.id.linear323);
        this.text_3 = (TextView) findViewById(R.id.text_3);
        this.linear317 = (LinearLayout) findViewById(R.id.linear317);
        this.text_2 = (TextView) findViewById(R.id.text_2);
        this.image_shear = (ImageView) findViewById(R.id.image_shear);
        this.text_1 = (TextView) findViewById(R.id.text_1);
        this.linear324 = (LinearLayout) findViewById(R.id.linear324);
        this.linear325 = (LinearLayout) findViewById(R.id.linear325);
        this.linear318 = (LinearLayout) findViewById(R.id.linear318);
        this.linear319 = (LinearLayout) findViewById(R.id.linear319);
        this.linear309 = (LinearLayout) findViewById(R.id.linear309);
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.linear19 = (LinearLayout) findViewById(R.id.linear19);
        this.linear20 = (LinearLayout) findViewById(R.id.linear20);
        this.vscroll3 = (ScrollView) findViewById(R.id.vscroll3);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.linear305 = (LinearLayout) findViewById(R.id.linear305);
        this.linear306 = (LinearLayout) findViewById(R.id.linear306);
        this.linear307 = (LinearLayout) findViewById(R.id.linear307);
        this.linear308 = (LinearLayout) findViewById(R.id.linear308);
        this.linear7 = (LinearLayout) findViewById(R.id.linear7);
        this.linear9 = (LinearLayout) findViewById(R.id.linear9);
        this.linear8 = (LinearLayout) findViewById(R.id.linear8);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.textview3 = (TextView) findViewById(R.id.textview3);
        this.textview4 = (TextView) findViewById(R.id.textview4);
        this.textview5 = (TextView) findViewById(R.id.textview5);
        this.textview6 = (TextView) findViewById(R.id.textview6);
        this.textview7 = (TextView) findViewById(R.id.textview7);
        this.textview8 = (TextView) findViewById(R.id.textview8);
        this.textview9 = (TextView) findViewById(R.id.textview9);
        this.textview10 = (TextView) findViewById(R.id.textview10);
        this.textview11 = (TextView) findViewById(R.id.textview11);
        this.textview12 = (TextView) findViewById(R.id.textview12);
        this.textview15 = (TextView) findViewById(R.id.textview15);
        this.textview16 = (TextView) findViewById(R.id.textview16);
        this.textview13 = (TextView) findViewById(R.id.textview13);
        this.textview14 = (TextView) findViewById(R.id.textview14);
        this.linear312 = (LinearLayout) findViewById(R.id.linear312);
        this.linear313 = (LinearLayout) findViewById(R.id.linear313);
        this.text_5_2 = (TextView) findViewById(R.id.text_5_2);
        this.text_4 = (TextView) findViewById(R.id.text_4);
        this.text_5_1 = (TextView) findViewById(R.id.text_5_1);
        this.linear328 = (LinearLayout) findViewById(R.id.linear328);
        this.linea_Exzam1 = (LinearLayout) findViewById(R.id.linea_Exzam1);
        this.linear21 = (LinearLayout) findViewById(R.id.linear21);
        this.lin73yeg = (LinearLayout) findViewById(R.id.lin73yeg);
        this.linear22 = (LinearLayout) findViewById(R.id.linear22);
        this.linear23 = (LinearLayout) findViewById(R.id.linear23);
        this.text_7 = (TextView) findViewById(R.id.text_7);
        this.text_6 = (TextView) findViewById(R.id.text_6);
        this.linear39 = (LinearLayout) findViewById(R.id.linear39);
        this.linear31 = (LinearLayout) findViewById(R.id.linear31);
        this.linear40 = (LinearLayout) findViewById(R.id.linear40);
        this.listview2 = (ListView) findViewById(R.id.listview2);
        this.text_tarwesah = (TextView) findViewById(R.id.text_tarwesah);
        this.text_new_enter = (TextView) findViewById(R.id.text_new_enter);
        this.save = getSharedPreferences("save", 0);
        this.saveX = getSharedPreferences("saveX", 0);
        this.dialog = new AlertDialog.Builder(this);
        this.save5 = getSharedPreferences("save5", 0);
        this.dialog_p = new AlertDialog.Builder(this);
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
        this.image_tsf.setType("image/*");
        this.image_tsf.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        this.imageview4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._go_beak();
            }
        });
        this.imageview8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._dialog_size_page();
            }
        });
        this.imageview39.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.dialog_nmothag("0", "0", 0, 0, 0);
            }
        });
        this.switch2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.timer_5 = new TimerTask() {
                    public void run() {
                        ExzamViewActivity.this.runOnUiThread(new Runnable() {
                            public void run() {
                                if (ExzamViewActivity.this.position_number == 0.0d) {
                                    Intent intent = new Intent();
                                    intent.setClass(ExzamViewActivity.this.getApplicationContext(), ExzamViewActivity.class);
                                    intent.putExtra(DatabaseHelper.COL_0, ExzamViewActivity.this.ID);
                                    intent.putExtra("page", "1");
                                    ExzamViewActivity.this.startActivity(intent);
                                    ExzamViewActivity.this.finish();
                                }
                            }
                        });
                    }
                };
                ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 502);
            }
        });
        this.switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    ExzamViewActivity.this.save.edit().putString("mria".concat(ExzamViewActivity.this.ID), "on").commit();
                    ExzamViewActivity.this.linear1.setVisibility(0);
                    ExzamViewActivity.this.linear19.setVisibility(0);
                    return;
                }
                ExzamViewActivity.this.save.edit().putString("mria".concat(ExzamViewActivity.this.ID), "off").commit();
                ExzamViewActivity.this.linear1.setVisibility(8);
                ExzamViewActivity.this.linear19.setVisibility(8);
            }
        });
        this.imageview7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._Tiping(0.0d);
            }
        });
        this.imageview6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._Tiping(0.0d);
            }
        });
        this.imageview40.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.i.setAction("android.intent.action.VIEW");
                ExzamViewActivity.this.i.setData(Uri.parse("https://chat.whatsapp.com/ILuuglhrYPkJ1zn6687dja"));
                ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                exzamViewActivity.startActivity(exzamViewActivity.i);
            }
        });
        this.image_tipi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._dialog_size_page();
            }
        });
        this.switch1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.timer_5 = new TimerTask() {
                    public void run() {
                        ExzamViewActivity.this.runOnUiThread(new Runnable() {
                            public void run() {
                                if (ExzamViewActivity.this.position_number == 0.0d) {
                                    Intent intent = new Intent();
                                    intent.setClass(ExzamViewActivity.this.getApplicationContext(), ExzamViewActivity.class);
                                    intent.putExtra(DatabaseHelper.COL_0, ExzamViewActivity.this.ID);
                                    intent.putExtra("page", "1");
                                    ExzamViewActivity.this.startActivity(intent);
                                    ExzamViewActivity.this.finish();
                                }
                            }
                        });
                    }
                };
                ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 502);
            }
        });
        this.switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    ExzamViewActivity.this.save.edit().putString("mria".concat(ExzamViewActivity.this.ID), "on").commit();
                    ExzamViewActivity.this.linear1.setVisibility(0);
                    ExzamViewActivity.this.linear19.setVisibility(0);
                    return;
                }
                ExzamViewActivity.this.save.edit().putString("mria".concat(ExzamViewActivity.this.ID), "off").commit();
                ExzamViewActivity.this.linear1.setVisibility(8);
                ExzamViewActivity.this.linear19.setVisibility(8);
            }
        });
        this.imag_shear_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._Tiping(0.0d);
            }
        });
        this.image_delet_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.dialog_nmothag("0", "0", 0, 0, 0);
            }
        });
        this.image_shear.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                ExzamViewActivity.this.save5.edit().putString("T".concat("_".concat("P")), BuildConfig.FLAVOR).commit();
                ExzamViewActivity.this.path_image = BuildConfig.FLAVOR;
                ExzamViewActivity.this.image_shear.setImageResource(R.drawable.nasa_0_3);
                SketchwareUtil.showMessage(ExzamViewActivity.this.getApplicationContext(), "الشعار الافتراضي");
                return true;
            }
        });
        this.image_shear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                exzamViewActivity.startActivityForResult(exzamViewActivity.image_tsf, 102);
            }
        });
        this.text_tarwesah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.dioalog_zoom();
            }
        });
        this.text_new_enter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ExzamViewActivity.this.getApplicationContext(), EnterExzamActivity.class);
                intent.putExtra("T", "1");
                intent.putExtra("E", "A");
                intent.putExtra("PL", String.valueOf(0));
                intent.putExtra("PD", String.valueOf(0));
                intent.putExtra("K", String.valueOf(0));
                intent.putExtra(DatabaseHelper.COL_0, ExzamViewActivity.this.ID);
                intent.putExtra("page", String.valueOf((long) ExzamViewActivity.this.position_number));
                ExzamViewActivity.this.startActivity(intent);
                ExzamViewActivity.this.finish();
            }
        });
    }

    private void initializeLogic() {
        this.position_number = 1.0d;
        try {
            this.ID = getIntent().getStringExtra(DatabaseHelper.COL_0);
            this.position_number = Double.parseDouble(getIntent().getStringExtra("page"));
            _start_A();
            if (this.save.getString("mria".concat(this.ID), BuildConfig.FLAVOR).equals("on")) {
                this.switch1.setChecked(true);
                this.switch2.setChecked(true);
            } else {
                this.linear1.setVisibility(8);
                this.linear19.setVisibility(8);
            }
            AnonymousClass18 r1 = new TimerTask() {
                public void run() {
                    ExzamViewActivity.this.runOnUiThread(new Runnable() {
                        public void run() {
                        }
                    });
                }
            };
            this.timer_5 = r1;
            this._timer.schedule(r1, 50);
        } catch (Exception unused) {
            finish();
        }
        _ss();
        _start_size();
        _shaql90();
        if (!this.saveX.getString(this.ID.concat("_".concat("all")), BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.List_map = (ArrayList) new Gson().fromJson(this.saveX.getString(this.ID.concat("_".concat("all")), BuildConfig.FLAVOR), new TypeToken<ArrayList<HashMap<String, Object>>>() {
            }.getType());
        }
        AnonymousClass20 r0 = new TimerTask() {
            public void run() {
                ExzamViewActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        ExzamViewActivity.this._Start_A();
                        ExzamViewActivity.this.imageview7.setVisibility(0);
                    }
                });
            }
        };
        this.timer_5 = r0;
        this._timer.schedule(r0, 150);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 102 && i3 == -1) {
            ArrayList arrayList = new ArrayList();
            if (intent != null) {
                if (intent.getClipData() != null) {
                    for (int i4 = 0; i4 < intent.getClipData().getItemCount(); i4++) {
                        arrayList.add(FileUtil.convertUriToFilePath(getApplicationContext(), intent.getClipData().getItemAt(i4).getUri()));
                    }
                } else {
                    arrayList.add(FileUtil.convertUriToFilePath(getApplicationContext(), intent.getData()));
                }
            }
            this.path_image = (String) arrayList.get(0);
            this.save5.edit().putString("T".concat("_".concat("P")), this.path_image).commit();
            try {
                this.image_shear.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(this.path_image, 1024, 1024));
                this.imageview7.setVisibility(0);
            } catch (Exception unused) {
            }
        }
    }

    public void onBackPressed() {
        _go_beak();
    }

    public void _ss() {
        try {
            ViewPager viewPager2 = new ViewPager(this);
            this.viewPager = viewPager2;
            viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.viewPager.setAdapter(new MyPagerAdapter(this, (MyPagerAdapter) null));
            this.viewPager.setCurrentItem((int) this.position_number);
            this.base.addView(this.viewPager);
        } catch (Exception unused) {
        }
        this.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                ExzamViewActivity.this.position_number = (double) i;
                double unused = ExzamViewActivity.this.position_number;
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
            return 2;
        }

        public Parcelable saveState() {
            return null;
        }

        private MyPagerAdapter() {
        }

        /* synthetic */ MyPagerAdapter(ExzamViewActivity exzamViewActivity, MyPagerAdapter myPagerAdapter) {
            this();
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View inflate = ((LayoutInflater) ExzamViewActivity.this.getBaseContext().getSystemService("layout_inflater")).inflate(R.layout.empty, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.linear1);
            if (i == 0) {
                ViewGroup viewGroup2 = (ViewGroup) ExzamViewActivity.this.layout1.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(ExzamViewActivity.this.layout1);
                }
                linearLayout.addView(ExzamViewActivity.this.layout1);
            } else if (i == 1) {
                ViewGroup viewGroup3 = (ViewGroup) ExzamViewActivity.this.layout2.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(ExzamViewActivity.this.layout2);
                }
                linearLayout.addView(ExzamViewActivity.this.layout2);
            }
            viewGroup.addView(inflate, 0);
            return inflate;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            View view = (View) obj;
            viewGroup.removeView(view);
            ExzamViewActivity.this.trash.addView(view);
        }

        public CharSequence getPageTitle(int i) {
            if (i == 0) {
                return "عرض الورقة الثانيه ";
            }
            if (i == 1) {
                return "عرض الورقة الاولى";
            }
            return "page " + i;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == ((View) obj);
        }
    }

    public void _start_size() {
        try {
            this.w = Double.parseDouble(this.save.getString("Size_page", BuildConfig.FLAVOR));
        } catch (Exception unused) {
            this.w = 1400.0d;
        }
        this.h = this.w / 0.707d;
        this.linear_pdf_0.setLayoutParams(new LinearLayout.LayoutParams((int) this.w, (int) this.h, 0.0f));
        this.linear_pdf_0_5.setLayoutParams(new LinearLayout.LayoutParams((int) this.w, (int) this.h, 0.0f));
        AnonymousClass22 r0 = new TimerTask() {
            public void run() {
                ExzamViewActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        ExzamViewActivity.this.starr(ExzamViewActivity.this.linear_pdf_0, ExzamViewActivity.this.linear301);
                        ExzamViewActivity.this.timer_5 = new TimerTask() {
                            public void run() {
                                ExzamViewActivity.this.runOnUiThread(new Runnable() {
                                    public void run() {
                                        ExzamViewActivity.this.starr(ExzamViewActivity.this.linear_pdf_0_5, ExzamViewActivity.this.linear300);
                                    }
                                });
                            }
                        };
                        ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 25);
                        ExzamViewActivity.this.timer_5 = new TimerTask() {
                            public void run() {
                                ExzamViewActivity.this.runOnUiThread(new Runnable() {
                                    public void run() {
                                        ExzamViewActivity.this.starr(ExzamViewActivity.this.linear_pdf_0, ExzamViewActivity.this.linear301);
                                        ExzamViewActivity.this.timer_5 = new TimerTask() {
                                            public void run() {
                                                ExzamViewActivity.this.runOnUiThread(new Runnable() {
                                                    public void run() {
                                                        ExzamViewActivity.this.starr(ExzamViewActivity.this.linear_pdf_0_5, ExzamViewActivity.this.linear300);
                                                    }
                                                });
                                            }
                                        };
                                        ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 50);
                                    }
                                });
                            }
                        };
                        ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 500);
                    }
                });
            }
        };
        this.timer_5 = r0;
        this._timer.schedule(r0, 25);
        this.imag_shear_1.setVisibility(8);
        this.imageview6.setVisibility(8);
    }

    public void starr(LinearLayout linearLayout, LinearLayout linearLayout2) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = (float) displayMetrics.widthPixels;
        if (f == 1200.0f) {
            f = (float) (((double) f) * 0.97d);
            this.linear35.setVisibility(8);
            this.imageview7.setVisibility(0);
            this.imageview7.setVisibility(0);
            this.switch2.setVisibility(0);
        } else {
            this.imageview8.setVisibility(8);
            this.linear35.setVisibility(0);
            this.switch2.setVisibility(8);
            this.imageview39.setVisibility(8);
        }
        this.imag_shear_1.setVisibility(8);
        this.imageview6.setVisibility(8);
        this.imageview7.setVisibility(0);
        try {
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams((int) this.w, (int) this.h, 0.0f));
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
            this.linear_pdf_0.setLayoutParams(new LinearLayout.LayoutParams((int) this.w, (int) this.h, 0.0f));
        } catch (Exception unused) {
        }
    }

    public void _shaql90() {
        this.lin7tfq_5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(8, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        this.text_nasa_5.setTextSize(6.0f);
        try {
            this.text_save.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_madah.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_55.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_6_5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_7_5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_nasa_5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft154.ttf"), 1);
        } catch (Exception unused) {
        }
        this.text_55.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(14, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        this.text_save.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(14, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        this.text_madah.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(14, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        this.lin73yeg.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(8, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        try {
            this.text_1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft55.ttf"), 1);
            this.text_5_2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_5_1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_6.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_7.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/exzam_bold.ttf"), 1);
            this.text_nasa.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft154.ttf"), 1);
        } catch (Exception unused2) {
        }
        this.image_shear.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(14, 2, ViewCompat.MEASURED_STATE_MASK, 0));
        this.text_2.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(14, 2, ViewCompat.MEASURED_STATE_MASK, 0));
        this.text_1.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(14, 2, ViewCompat.MEASURED_STATE_MASK, 0));
        this.text_5_2.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(8, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        this.text_4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(8, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        this.text_5_1.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(8, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        this.text_3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(14, 2, -6381922, 0));
        _texter(this.textview1, BuildConfig.FLAVOR, "١", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview2, BuildConfig.FLAVOR, "٢", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview3, BuildConfig.FLAVOR, "٣", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview4, BuildConfig.FLAVOR, "٤", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview5, BuildConfig.FLAVOR, "٥", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview6, BuildConfig.FLAVOR, "٦", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview7, BuildConfig.FLAVOR, "٧", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview8, BuildConfig.FLAVOR, "٨", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview9, BuildConfig.FLAVOR, "٩", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview10, BuildConfig.FLAVOR, "١٠", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview11, BuildConfig.FLAVOR, "١١", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview12, BuildConfig.FLAVOR, "١٢", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview13, BuildConfig.FLAVOR, "١٣", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview14, BuildConfig.FLAVOR, "١٤", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview15, BuildConfig.FLAVOR, "١٥", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        _texter(this.textview16, BuildConfig.FLAVOR, "١٦", BuildConfig.FLAVOR, ViewCompat.MEASURED_STATE_MASK, -1);
        this.text_nasa.setTextSize(6.0f);
        try {
            this.color = Double.parseDouble(this.save.getString("B500", BuildConfig.FLAVOR));
            TextView textView = this.text_new_enter;
            AnonymousClass35 r1 = new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            };
            double d = this.color;
            textView.setBackground(r1.getIns(13, 1, (int) d, (int) d));
            TextView textView2 = this.text_tarwesah;
            AnonymousClass36 r12 = new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            };
            double d2 = this.color;
            textView2.setBackground(r12.getIns(13, 1, (int) d2, (int) d2));
            LinearLayout linearLayout = this.tablayout;
            AnonymousClass37 r13 = new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            };
            double d3 = this.color;
            linearLayout.setBackground(r13.getIns(0, 0, (int) d3, (int) d3));
        } catch (Exception unused3) {
            this.text_tarwesah.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(20, 2, 0, SupportMenu.CATEGORY_MASK));
            this.text_new_enter.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(20, 2, 0, SupportMenu.CATEGORY_MASK));
        }
    }

    public void _Start_A() {
        this.linea_Exzam2.removeAllViews();
        this.linea_Exzam1.removeAllViews();
        for (final int i2 = 0; i2 < this.List_map.size(); i2++) {
            LinearLayout linearLayout = new LinearLayout(getApplicationContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 0.0f);
            layoutParams.setMargins(0, 0, 0, 0);
            linearLayout.setLayoutParams(layoutParams);
            final TextView textView = new TextView(getApplicationContext());
            textView.setLayoutParams(new LinearLayout.LayoutParams(55, -1, 0.0f));
            textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            textView.setTextSize(14.0f);
            try {
                textView.setText(this.List_map.get(i2).get("1").toString());
            } catch (Exception unused) {
                textView.setText(BuildConfig.FLAVOR);
            }
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                    exzamViewActivity._dialog_mark(textView, (double) i2, "1", exzamViewActivity.List_map);
                }
            });
            linearLayout.addView(textView);
            textView.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(5, 2, ViewCompat.MEASURED_STATE_MASK, -117901064));
            textView.setGravity(49);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(50, -1, 0.0f);
            layoutParams2.setMargins(1, 0, 1, 1);
            textView.setLayoutParams(layoutParams2);
            LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
            linearLayout2.setOrientation(1);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(500, -1, 1.0f);
            layoutParams3.setMargins(0, 0, 0, 1);
            linearLayout2.setLayoutParams(layoutParams3);
            linearLayout2.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(5, 2, ViewCompat.MEASURED_STATE_MASK, -1));
            linearLayout2.addView(start_View50(i2));
            linearLayout.addView(linearLayout2);
            final TextView textView2 = new TextView(getApplicationContext());
            textView2.setLayoutParams(new LinearLayout.LayoutParams(55, -1, 0.0f));
            textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            textView2.setTextSize(14.0f);
            try {
                textView2.setText(this.List_map.get(i2).get("3").toString());
            } catch (Exception unused2) {
                textView2.setText(BuildConfig.FLAVOR);
            }
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                    exzamViewActivity._dialog_mark(textView2, (double) i2, "3", exzamViewActivity.List_map);
                }
            });
            linearLayout.addView(textView2);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(50, -1, 0.0f);
            layoutParams4.setMargins(1, 0, 1, 1);
            textView2.setLayoutParams(layoutParams4);
            textView2.setGravity(49);
            textView2.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(5, 2, ViewCompat.MEASURED_STATE_MASK, -117901064));
            if (!this.List_map.get(i2).containsKey("Nnn")) {
                this.linea_Exzam1.addView(linearLayout);
            } else if (this.List_map.get(i2).get("Nnn").toString().equals("1")) {
                this.linea_Exzam1.addView(linearLayout);
            } else {
                this.linea_Exzam2.addView(linearLayout);
            }
        }
        if (this.List_map.size() > 2 && this.codee.getString("Cod", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            Intent intent = new Intent();
            intent.setClass(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:55|56|57|58|59|60|61|62|63|64|65|66|67|77|70) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:48|49|50|51|52|53|54|(15:55|56|57|58|59|60|61|62|63|64|65|66|67|77|70)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x02be */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x02f8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.LinearLayout start_View50(int r23) {
        /*
            r22 = this;
            r7 = r22
            r8 = r23
            java.lang.String r9 = ""
            java.lang.String r10 = "2"
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch:{ Exception -> 0x002e }
            r0.<init>()     // Catch:{ Exception -> 0x002e }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r7.List_map     // Catch:{ Exception -> 0x002e }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ Exception -> 0x002e }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x002e }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ Exception -> 0x002e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x002e }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$45 r2 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$45     // Catch:{ Exception -> 0x002e }
            r2.<init>()     // Catch:{ Exception -> 0x002e }
            java.lang.reflect.Type r2 = r2.getType()     // Catch:{ Exception -> 0x002e }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r1, (java.lang.reflect.Type) r2)     // Catch:{ Exception -> 0x002e }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x002e }
            r7.Data_Map = r0     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            android.content.Context r0 = r22.getApplicationContext()
            r11.<init>(r0)
            r12 = 1
            r11.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r13 = -1
            r14 = -2
            r15 = 0
            r0.<init>(r13, r14, r15)
            r6 = 0
            r0.setMargins(r6, r6, r6, r6)
            r11.setLayoutParams(r0)
            r5 = 0
        L_0x004b:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r7.Data_Map
            int r0 = r0.size()
            if (r5 < r0) goto L_0x0054
            return r11
        L_0x0054:
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r0 = r22.getApplicationContext()
            r4.<init>(r0)
            r4.setOrientation(r6)
            r0 = 49
            r4.setGravity(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r13, r14, r15)
            r0.setMargins(r6, r6, r6, r6)
            r4.setLayoutParams(r0)
            r3 = 4
            r2 = 2
            r4.setPadding(r3, r2, r3, r2)
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00a4 }
            r0.<init>()     // Catch:{ Exception -> 0x00a4 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r7.Data_Map     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ Exception -> 0x00a4 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00a4 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$46 r2 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$46     // Catch:{ Exception -> 0x00a4 }
            r2.<init>()     // Catch:{ Exception -> 0x00a4 }
            java.lang.reflect.Type r2 = r2.getType()     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r1, (java.lang.reflect.Type) r2)     // Catch:{ Exception -> 0x00a4 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x00a4 }
            r7.List_startMap = r0     // Catch:{ Exception -> 0x00a4 }
            r2 = 0
        L_0x009c:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r7.List_startMap     // Catch:{ Exception -> 0x00a4 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x00a4 }
            if (r2 < r0) goto L_0x00b0
        L_0x00a4:
            r13 = r4
            r14 = r5
        L_0x00a6:
            r21 = r10
        L_0x00a8:
            r10 = 1
            r12 = 0
        L_0x00aa:
            r19 = -1
            r20 = 0
            goto L_0x038b
        L_0x00b0:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r7.List_startMap     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x00a4 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r1 = "0"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a4 }
            r7.Type = r0     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r1 = "1"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x00a4 }
            if (r0 == 0) goto L_0x011b
            android.widget.TextView r1 = new android.widget.TextView     // Catch:{ Exception -> 0x00a4 }
            android.content.Context r0 = r22.getApplicationContext()     // Catch:{ Exception -> 0x00a4 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00a4 }
            r17 = r4
            double r3 = (double) r2
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r7.List_startMap     // Catch:{ Exception -> 0x0117 }
            r7._Creat_text(r1, r3, r0)     // Catch:{ Exception -> 0x0117 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r7.List_startMap     // Catch:{ Exception -> 0x0117 }
            r7._Creat_backgrund(r1, r3, r0)     // Catch:{ Exception -> 0x0117 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$47 r0 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$47     // Catch:{ Exception -> 0x0117 }
            r0.<init>(r2, r5, r8)     // Catch:{ Exception -> 0x0117 }
            r1.setOnClickListener(r0)     // Catch:{ Exception -> 0x0117 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$48 r4 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$48     // Catch:{ Exception -> 0x0117 }
            r0 = r4
            r3 = r1
            r1 = r22
            r19 = r2
            r15 = 2
            r2 = r3
            r6 = r3
            r3 = r19
            r15 = r4
            r13 = r17
            r4 = r5
            r14 = r5
            r5 = r23
            r0.<init>(r2, r3, r4, r5)     // Catch:{ Exception -> 0x00a6 }
            r6.setOnLongClickListener(r15)     // Catch:{ Exception -> 0x00a6 }
            r13.addView(r6)     // Catch:{ Exception -> 0x00a6 }
            r21 = r10
            r15 = r19
        L_0x010b:
            r10 = 1
            r12 = 0
            r17 = 4
            r18 = 2
            r19 = -1
            r20 = 0
            goto L_0x037b
        L_0x0117:
            r14 = r5
            r13 = r17
            goto L_0x00a6
        L_0x011b:
            r19 = r2
            r13 = r4
            r14 = r5
            java.lang.String r0 = r7.Type     // Catch:{ Exception -> 0x00a6 }
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x00a6 }
            if (r0 == 0) goto L_0x015c
            android.widget.ImageView r6 = new android.widget.ImageView     // Catch:{ Exception -> 0x00a6 }
            android.content.Context r0 = r22.getApplicationContext()     // Catch:{ Exception -> 0x00a6 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x00a6 }
            r15 = r19
            double r0 = (double) r15     // Catch:{ Exception -> 0x00a6 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r7.List_startMap     // Catch:{ Exception -> 0x00a6 }
            r7._Creat_image(r6, r0, r2)     // Catch:{ Exception -> 0x00a6 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r7.List_startMap     // Catch:{ Exception -> 0x00a6 }
            r7._Creat_backgrund(r6, r0, r2)     // Catch:{ Exception -> 0x00a6 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$49 r0 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$49     // Catch:{ Exception -> 0x00a6 }
            r0.<init>(r15, r14, r8)     // Catch:{ Exception -> 0x00a6 }
            r6.setOnClickListener(r0)     // Catch:{ Exception -> 0x00a6 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$50 r5 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$50     // Catch:{ Exception -> 0x00a6 }
            r0 = r5
            r1 = r22
            r2 = r6
            r3 = r15
            r4 = r14
            r12 = r5
            r5 = r23
            r0.<init>(r2, r3, r4, r5)     // Catch:{ Exception -> 0x00a6 }
            r6.setOnLongClickListener(r12)     // Catch:{ Exception -> 0x00a6 }
            r13.addView(r6)     // Catch:{ Exception -> 0x00a6 }
        L_0x0159:
            r21 = r10
            goto L_0x010b
        L_0x015c:
            r15 = r19
            java.lang.String r0 = r7.Type     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r1 = "3"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x00a6 }
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L_0x01b9
            android.widget.LinearLayout r12 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x00a6 }
            android.content.Context r0 = r22.getApplicationContext()     // Catch:{ Exception -> 0x00a6 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x00a6 }
            r0 = 1
            r12.setOrientation(r0)     // Catch:{ Exception -> 0x00a6 }
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x00a6 }
            r1 = 400(0x190, float:5.6E-43)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -2
            r0.<init>(r1, r3, r2)     // Catch:{ Exception -> 0x00a6 }
            r1 = 2
            r0.setMargins(r1, r1, r1, r1)     // Catch:{ Exception -> 0x00a6 }
            r12.setLayoutParams(r0)     // Catch:{ Exception -> 0x00a6 }
            android.widget.LinearLayout r0 = r7.chart(r15, r14, r8)     // Catch:{ Exception -> 0x00a6 }
            r12.addView(r0)     // Catch:{ Exception -> 0x00a6 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$51 r0 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$51     // Catch:{ Exception -> 0x00a6 }
            r0.<init>()     // Catch:{ Exception -> 0x00a6 }
            r1 = 2
            r2 = -1
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r1, r1, r6, r2)     // Catch:{ Exception -> 0x00a6 }
            r12.setBackground(r0)     // Catch:{ Exception -> 0x00a6 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$52 r0 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$52     // Catch:{ Exception -> 0x00a6 }
            r0.<init>(r15, r14, r8)     // Catch:{ Exception -> 0x00a6 }
            r12.setOnClickListener(r0)     // Catch:{ Exception -> 0x00a6 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$53 r6 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$53     // Catch:{ Exception -> 0x00a6 }
            r0 = r6
            r1 = r22
            r2 = r12
            r3 = r15
            r4 = r14
            r5 = r23
            r0.<init>(r2, r3, r4, r5)     // Catch:{ Exception -> 0x00a6 }
            r12.setOnLongClickListener(r6)     // Catch:{ Exception -> 0x00a6 }
            r13.addView(r12)     // Catch:{ Exception -> 0x00a6 }
            goto L_0x0159
        L_0x01b9:
            java.lang.String r0 = r7.Type     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r1 = "4"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x00a6 }
            if (r0 == 0) goto L_0x0244
            android.widget.LinearLayout r5 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x00a6 }
            android.content.Context r0 = r22.getApplicationContext()     // Catch:{ Exception -> 0x00a6 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00a6 }
            r0 = 1
            r5.setOrientation(r0)     // Catch:{ Exception -> 0x00a6 }
            android.widget.LinearLayout r4 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x00a6 }
            android.content.Context r0 = r22.getApplicationContext()     // Catch:{ Exception -> 0x00a6 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00a6 }
            r0 = 0
            r4.setOrientation(r0)     // Catch:{ Exception -> 0x00a6 }
            android.widget.LinearLayout r3 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x00a6 }
            android.content.Context r1 = r22.getApplicationContext()     // Catch:{ Exception -> 0x00a6 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x00a6 }
            r3.setOrientation(r0)     // Catch:{ Exception -> 0x00a6 }
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x00a6 }
            r1 = 12
            r2 = 0
            r12 = -1
            r0.<init>(r12, r1, r2)     // Catch:{ Exception -> 0x00a6 }
            r1 = 1
            r0.setMargins(r1, r1, r1, r1)     // Catch:{ Exception -> 0x00a6 }
            r5.setLayoutParams(r0)     // Catch:{ Exception -> 0x00a6 }
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x00a6 }
            r6 = 4
            r0.<init>(r12, r6, r2)     // Catch:{ Exception -> 0x00a6 }
            r6 = 0
            r0.setMargins(r6, r1, r6, r6)     // Catch:{ Exception -> 0x00a6 }
            r4.setLayoutParams(r0)     // Catch:{ Exception -> 0x00a6 }
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x00a6 }
            r1 = 2
            r0.<init>(r12, r1, r2)     // Catch:{ Exception -> 0x00a6 }
            r1 = 1
            r0.setMargins(r6, r1, r6, r1)     // Catch:{ Exception -> 0x00a6 }
            r3.setLayoutParams(r0)     // Catch:{ Exception -> 0x00a6 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$54 r6 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$54     // Catch:{ Exception -> 0x00a6 }
            r0 = r6
            r1 = r22
            r2 = r5
            r12 = r3
            r3 = r15
            r8 = r4
            r4 = r14
            r21 = r10
            r10 = r5
            r5 = r23
            r0.<init>(r2, r3, r4, r5)     // Catch:{ Exception -> 0x00a8 }
            r10.setOnClickListener(r6)     // Catch:{ Exception -> 0x00a8 }
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r8.setBackgroundColor(r0)     // Catch:{ Exception -> 0x00a8 }
            r12.setBackgroundColor(r0)     // Catch:{ Exception -> 0x00a8 }
            r0 = 0
            r10.setBackgroundColor(r0)     // Catch:{ Exception -> 0x00a8 }
            r0 = 17
            r10.setGravity(r0)     // Catch:{ Exception -> 0x00a8 }
            r10.addView(r8)     // Catch:{ Exception -> 0x00a8 }
            r10.addView(r12)     // Catch:{ Exception -> 0x00a8 }
            r13.addView(r10)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x010b
        L_0x0244:
            r21 = r10
            java.lang.String r0 = r7.Type     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = "6"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x00a8 }
            if (r0 == 0) goto L_0x010b
            android.widget.LinearLayout r8 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x00a8 }
            android.content.Context r0 = r22.getApplicationContext()     // Catch:{ Exception -> 0x00a8 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x00a8 }
            r0 = 1
            r8.setOrientation(r0)     // Catch:{ Exception -> 0x00a8 }
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x00a8 }
            r1 = -2
            r2 = 0
            r0.<init>(r1, r1, r2)     // Catch:{ Exception -> 0x00a8 }
            r1 = 0
            r0.setMargins(r1, r1, r1, r1)     // Catch:{ Exception -> 0x00a8 }
            r8.setLayoutParams(r0)     // Catch:{ Exception -> 0x00a8 }
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x00a8 }
            android.content.Context r2 = r22.getApplicationContext()     // Catch:{ Exception -> 0x00a8 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00a8 }
            r0.setOrientation(r1)     // Catch:{ Exception -> 0x00a8 }
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x00a8 }
            r3 = 4
            r4 = 0
            r5 = -1
            r2.<init>(r5, r3, r4)     // Catch:{ Exception -> 0x00a8 }
            r2.setMargins(r1, r1, r1, r1)     // Catch:{ Exception -> 0x00a8 }
            r0.setLayoutParams(r2)     // Catch:{ Exception -> 0x00a8 }
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setBackgroundColor(r1)     // Catch:{ Exception -> 0x00a8 }
            android.widget.TextView r2 = new android.widget.TextView     // Catch:{ Exception -> 0x00a8 }
            android.content.Context r1 = r22.getApplicationContext()     // Catch:{ Exception -> 0x00a8 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00a8 }
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x00a8 }
            r3 = -2
            r4 = 0
            r5 = -1
            r1.<init>(r5, r3, r4)     // Catch:{ Exception -> 0x00a8 }
            r2.setLayoutParams(r1)     // Catch:{ Exception -> 0x00a8 }
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setTextColor(r1)     // Catch:{ Exception -> 0x00a8 }
            r1 = 1096810496(0x41600000, float:14.0)
            r2.setTextSize(r1)     // Catch:{ Exception -> 0x00a8 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r3 = r7.List_startMap     // Catch:{ Exception -> 0x02be }
            java.lang.Object r3 = r3.get(r15)     // Catch:{ Exception -> 0x02be }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x02be }
            java.lang.String r4 = "50"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x02be }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02be }
            r2.setText(r3)     // Catch:{ Exception -> 0x02be }
            goto L_0x02c1
        L_0x02be:
            r2.setText(r9)     // Catch:{ Exception -> 0x00a8 }
        L_0x02c1:
            r3 = 17
            r2.setGravity(r3)     // Catch:{ Exception -> 0x00a8 }
            android.widget.TextView r3 = new android.widget.TextView     // Catch:{ Exception -> 0x00a8 }
            android.content.Context r4 = r22.getApplicationContext()     // Catch:{ Exception -> 0x00a8 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00a8 }
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x00a8 }
            r5 = -1
            r10 = -2
            r12 = 0
            r4.<init>(r5, r10, r12)     // Catch:{ Exception -> 0x0378 }
            r3.setLayoutParams(r4)     // Catch:{ Exception -> 0x0378 }
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setTextColor(r4)     // Catch:{ Exception -> 0x0378 }
            r3.setTextSize(r1)     // Catch:{ Exception -> 0x0378 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r7.List_startMap     // Catch:{ Exception -> 0x02f8 }
            java.lang.Object r1 = r1.get(r15)     // Catch:{ Exception -> 0x02f8 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x02f8 }
            java.lang.String r4 = "51"
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x02f8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02f8 }
            r3.setText(r1)     // Catch:{ Exception -> 0x02f8 }
            goto L_0x02fb
        L_0x02f8:
            r3.setText(r9)     // Catch:{ Exception -> 0x0378 }
        L_0x02fb:
            r1 = 17
            r3.setGravity(r1)     // Catch:{ Exception -> 0x0378 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$55 r1 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$55     // Catch:{ Exception -> 0x0378 }
            r1.<init>()     // Catch:{ Exception -> 0x0378 }
            r4 = -657931(0xfffffffffff5f5f5, float:NaN)
            r5 = -1
            r6 = 2
            r10 = 1
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r6, r10, r4, r5)     // Catch:{ Exception -> 0x00aa }
            r2.setBackground(r1)     // Catch:{ Exception -> 0x00aa }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$56 r1 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$56     // Catch:{ Exception -> 0x00aa }
            r1.<init>()     // Catch:{ Exception -> 0x00aa }
            android.graphics.drawable.GradientDrawable r1 = r1.getIns(r6, r10, r4, r5)     // Catch:{ Exception -> 0x00aa }
            r3.setBackground(r1)     // Catch:{ Exception -> 0x00aa }
            r1 = 17
            r8.setGravity(r1)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r1 = "البسط ....."
            r2.setHint(r1)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r1 = "المقام ....."
            r3.setHint(r1)     // Catch:{ Exception -> 0x00aa }
            r8.addView(r2)     // Catch:{ Exception -> 0x00aa }
            r8.addView(r0)     // Catch:{ Exception -> 0x00aa }
            r8.addView(r3)     // Catch:{ Exception -> 0x00aa }
            r0 = 8
            r4 = 0
            r2.setPadding(r0, r4, r0, r4)     // Catch:{ Exception -> 0x00aa }
            r3.setPadding(r0, r4, r0, r4)     // Catch:{ Exception -> 0x00aa }
            r1 = 4
            r8.setPadding(r4, r1, r0, r4)     // Catch:{ Exception -> 0x00aa }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$57 r0 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$57     // Catch:{ Exception -> 0x00aa }
            r16 = r0
            r0 = r16
            r17 = 4
            r1 = r22
            r18 = 0
            r4 = r15
            r19 = -1
            r5 = r14
            r18 = 2
            r20 = 0
            r6 = r23
            r0.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x038b }
            r8.setOnClickListener(r0)     // Catch:{ Exception -> 0x038b }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$58 r6 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$58     // Catch:{ Exception -> 0x038b }
            r0 = r6
            r1 = r22
            r2 = r8
            r3 = r15
            r4 = r14
            r5 = r23
            r0.<init>(r2, r3, r4, r5)     // Catch:{ Exception -> 0x038b }
            r8.setOnLongClickListener(r6)     // Catch:{ Exception -> 0x038b }
            r0 = 53
            r13.setGravity(r0)     // Catch:{ Exception -> 0x038b }
            r13.addView(r8)     // Catch:{ Exception -> 0x038b }
            goto L_0x037b
        L_0x0378:
            r10 = 1
            goto L_0x00aa
        L_0x037b:
            int r2 = r15 + 1
            r8 = r23
            r4 = r13
            r5 = r14
            r10 = r21
            r3 = 4
            r6 = 0
            r12 = 1
            r13 = -1
            r14 = -2
            r15 = 0
            goto L_0x009c
        L_0x038b:
            r11.addView(r13)
            int r5 = r14 + 1
            r8 = r23
            r10 = r21
            r6 = 0
            r12 = 1
            r13 = -1
            r14 = -2
            r15 = 0
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.start_View50(int):android.widget.LinearLayout");
    }

    public void _Creat_backgrund(View view, double d, ArrayList<HashMap<String, Object>> arrayList) {
        int i2 = (int) d;
        try {
            this.size = arrayList.get(i2).get("1").toString();
        } catch (Exception unused) {
            this.size = "-1,-2,1";
        }
        try {
            this.T_in = arrayList.get(i2).get("2").toString();
        } catch (Exception unused2) {
            this.T_in = "0,0,0,0";
        }
        try {
            this.T_out = arrayList.get(i2).get("3").toString();
        } catch (Exception unused3) {
            this.T_out = "0,0,0,0";
        }
        try {
            this.T_z5 = arrayList.get(i2).get("4").toString();
        } catch (Exception unused4) {
            this.T_z5 = "0,0,0,0";
        }
        try {
            this.beack_color = arrayList.get(i2).get("5").toString();
        } catch (Exception unused5) {
            this.beack_color = "#00000000";
        }
        try {
            this.Etar = Double.parseDouble(arrayList.get(i2).get("6").toString());
        } catch (Exception unused6) {
            this.Etar = 1.0d;
        }
        try {
            this.Etar_color = arrayList.get(i2).get("7").toString();
        } catch (Exception unused7) {
            this.Etar_color = "#00000000";
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) Double.parseDouble(Spliter(this.size, 0)), (int) Double.parseDouble(Spliter(this.size, 1)), (float) ((int) Double.parseDouble(Spliter(this.size, 2))));
        layoutParams.setMargins((int) Double.parseDouble(Spliter(this.T_out, 0)), (int) Double.parseDouble(Spliter(this.T_out, 1)), (int) Double.parseDouble(Spliter(this.T_out, 2)), (int) Double.parseDouble(Spliter(this.T_out, 3)));
        view.setLayoutParams(layoutParams);
        view.setPadding((int) Double.parseDouble(Spliter(this.T_in, 0)), (int) Double.parseDouble(Spliter(this.T_in, 1)), (int) Double.parseDouble(Spliter(this.T_in, 2)), (int) Double.parseDouble(Spliter(this.T_in, 3)));
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i3 = (int) getApplicationContext().getResources().getDisplayMetrics().density;
            gradientDrawable.setColor(Color.parseColor(this.beack_color));
            float f = (float) i3;
            gradientDrawable.setCornerRadii(new float[]{Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 0)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 0)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 1)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 1)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 2)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 2)))) * f, Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 3)))) * f, f * Float.parseFloat(String.valueOf((long) Double.parseDouble(Spliter(this.T_z5, 3))))});
            gradientDrawable.setStroke(Integer.parseInt(String.valueOf((long) this.Etar)) * i3, Color.parseColor(this.Etar_color));
            view.setElevation((float) (i3 * 4));
            view.setBackground(gradientDrawable);
        } catch (Exception unused8) {
        }
    }

    public String Spliter(String str, int i2) {
        return str.split(",")[i2];
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|7|8|10|11|21|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0044 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _Creat_text(android.widget.TextView r5, double r6, java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r8) {
        /*
            r4 = this;
            int r6 = (int) r6
            java.lang.Object r7 = r8.get(r6)
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.String r0 = "20"
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = r7.toString()
            r5.setText(r7)
            java.lang.Object r7 = r8.get(r6)
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.String r0 = "21"
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = r7.toString()
            double r0 = java.lang.Double.parseDouble(r7)
            int r7 = (int) r0
            float r7 = (float) r7
            r5.setTextSize(r7)
            java.lang.Object r7 = r8.get(r6)     // Catch:{ Exception -> 0x0044 }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = "22"
            java.lang.Object r7 = r7.get(r0)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0044 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ Exception -> 0x0044 }
            r5.setTextColor(r7)     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            android.content.res.AssetManager r7 = r4.getAssets()     // Catch:{ Exception -> 0x0082 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            java.lang.String r1 = "fonts/"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r1 = r8.get(r6)     // Catch:{ Exception -> 0x0082 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x0082 }
            java.lang.String r2 = "23"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0082 }
            r0.append(r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0082 }
            android.graphics.Typeface r7 = android.graphics.Typeface.createFromAsset(r7, r0)     // Catch:{ Exception -> 0x0082 }
            java.lang.Object r0 = r8.get(r6)     // Catch:{ Exception -> 0x0082 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0082 }
            java.lang.String r1 = "24"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0082 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x0082 }
            int r0 = (int) r0     // Catch:{ Exception -> 0x0082 }
            r5.setTypeface(r7, r0)     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            java.lang.Object r7 = r8.get(r6)
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.String r0 = "26"
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = r7.toString()
            r4.abC = r7
            r0 = 0
            java.lang.String r7 = r4.Spliter(r7, r0)     // Catch:{ Exception -> 0x00cd }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x00cd }
            float r7 = (float) r7     // Catch:{ Exception -> 0x00cd }
            java.lang.String r0 = r4.abC     // Catch:{ Exception -> 0x00cd }
            r1 = 1
            java.lang.String r0 = r4.Spliter(r0, r1)     // Catch:{ Exception -> 0x00cd }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00cd }
            float r0 = (float) r0     // Catch:{ Exception -> 0x00cd }
            java.lang.String r1 = r4.abC     // Catch:{ Exception -> 0x00cd }
            r2 = 2
            java.lang.String r1 = r4.Spliter(r1, r2)     // Catch:{ Exception -> 0x00cd }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ Exception -> 0x00cd }
            java.lang.Object r2 = r8.get(r6)     // Catch:{ Exception -> 0x00cd }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x00cd }
            java.lang.String r3 = "27"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00cd }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ Exception -> 0x00cd }
            r5.setShadowLayer(r7, r0, r1, r2)     // Catch:{ Exception -> 0x00cd }
            goto L_0x00ce
        L_0x00cd:
        L_0x00ce:
            java.lang.Object r6 = r8.get(r6)
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.String r7 = "25"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = r6.toString()
            int r7 = r6.hashCode()
            switch(r7) {
                case 49: goto L_0x0104;
                case 50: goto L_0x00f5;
                case 51: goto L_0x00e6;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            goto L_0x0113
        L_0x00e6:
            java.lang.String r7 = "3"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00ef
            goto L_0x0113
        L_0x00ef:
            r6 = 17
            r5.setGravity(r6)
            goto L_0x0118
        L_0x00f5:
            java.lang.String r7 = "2"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00fe
            goto L_0x0113
        L_0x00fe:
            r6 = 51
            r5.setGravity(r6)
            goto L_0x0118
        L_0x0104:
            java.lang.String r7 = "1"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x010d
            goto L_0x0113
        L_0x010d:
            r6 = 53
            r5.setGravity(r6)
            goto L_0x0118
        L_0x0113:
            r6 = 49
            r5.setGravity(r6)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity._Creat_text(android.widget.TextView, double, java.util.ArrayList):void");
    }

    public void _Creat_image(ImageView imageView, double d, ArrayList<HashMap<String, Object>> arrayList) {
        int i2 = (int) d;
        if (arrayList.get(i2).get("40").toString().equals(BuildConfig.FLAVOR)) {
            imageView.setImageResource(R.drawable.o91_3_28);
        } else {
            imageView.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(arrayList.get(i2).get("40").toString(), 1024, 1024));
        }
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public void art(int i2, int i3, int i4, Bitmap bitmap, int i5) {
        String str;
        TextView textView;
        final int i6 = i3;
        final int i7 = i4;
        this.List_all.clear();
        if (!this.save.getString("n750", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.List_all = (ArrayList) new Gson().fromJson(this.save.getString("n750", BuildConfig.FLAVOR), new TypeToken<ArrayList<HashMap<String, Object>>>() {
            }.getType());
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(80, 70, 0.0f);
        layoutParams.setMargins(2, 2, 2, 2);
        final AlertDialog create = new AlertDialog.Builder(this).create();
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams2.setMargins(2, 2, 2, 2);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setPadding(12, 12, 12, 12);
        LinearLayout linearLayout3 = new LinearLayout(getApplicationContext());
        linearLayout3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 80, 0.0f);
        layoutParams3.setMargins(1, 1, 1, 4);
        linearLayout3.setLayoutParams(layoutParams3);
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
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        linearLayout4.setOrientation(0);
        LinearLayout linearLayout5 = linearLayout;
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
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        linearLayout6.setOrientation(1);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams7.setMargins(2, 3, 3, 2);
        linearLayout6.setLayoutParams(layoutParams7);
        linearLayout6.setGravity(53);
        linearLayout6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -657931));
        textView2.setText("ادوات");
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        layoutParams8.setMargins(2, 2, 2, 2);
        textView2.setLayoutParams(layoutParams8);
        LinearLayout linearLayout7 = new LinearLayout(getApplicationContext());
        ImageView imageView2 = imageView;
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams9.setMargins(2, 2, 2, 2);
        linearLayout7.setLayoutParams(layoutParams9);
        linearLayout7.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        LinearLayout linearLayout8 = new LinearLayout(getApplicationContext());
        linearLayout8.setOrientation(1);
        linearLayout8.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 0.0f));
        linearLayout8.setPadding(8, 8, 8, 8);
        linearLayout8.setBackgroundColor(-1);
        linearLayout8.setGravity(17);
        linearLayout7.addView(linearLayout8);
        LinearLayout linearLayout9 = new LinearLayout(getApplicationContext());
        linearLayout9.setOrientation(1);
        LinearLayout linearLayout10 = linearLayout3;
        linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout9.setPadding(8, 8, 8, 8);
        linearLayout9.setBackgroundColor(-1);
        linearLayout8.addView(linearLayout9);
        TextView textView3 = new TextView(getApplicationContext());
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-1, 78, 0.0f));
        textView3.setPadding(8, 8, 8, 8);
        textView3.setText("إضافة كائن في الاعلى");
        textView3.setTextSize(16.0f);
        textView3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView3.setGravity(17);
        linearLayout9.addView(textView3);
        LinearLayout linearLayout11 = new LinearLayout(getApplicationContext());
        linearLayout11.setOrientation(0);
        LinearLayout linearLayout12 = linearLayout2;
        linearLayout11.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout11.setGravity(17);
        linearLayout9.addView(linearLayout11);
        TextView textView4 = new TextView(getApplicationContext());
        LinearLayout linearLayout13 = linearLayout7;
        textView4.setLayoutParams(new LinearLayout.LayoutParams(175, -1, 0.0f));
        textView4.setPadding(8, 8, 8, 8);
        textView4.setText("إضافة الى اليسار");
        textView4.setTextSize(16.0f);
        textView4.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView4.setGravity(17);
        linearLayout11.addView(textView4);
        final ImageView imageView3 = new ImageView(getApplicationContext());
        TextView textView5 = textView2;
        imageView3.setLayoutParams(new LinearLayout.LayoutParams(262, 297, 1.0f));
        imageView3.setImageResource(R.drawable.ic_games_black);
        linearLayout11.addView(imageView3);
        TextView textView6 = new TextView(getApplicationContext());
        String str2 = "fonts/nasa_soft44.ttf";
        textView6.setLayoutParams(new LinearLayout.LayoutParams(175, -1, 0.0f));
        textView6.setPadding(8, 8, 8, 8);
        textView6.setText("إضافة الى اليمين");
        textView6.setTextSize(16.0f);
        textView6.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView6.setGravity(17);
        linearLayout11.addView(textView6);
        TextView textView7 = new TextView(getApplicationContext());
        textView7.setLayoutParams(new LinearLayout.LayoutParams(-1, 78, 0.0f));
        textView7.setPadding(8, 8, 8, 8);
        textView7.setText("إضافة كائن تحت");
        textView7.setTextSize(16.0f);
        textView7.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView7.setGravity(17);
        linearLayout9.addView(textView7);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams10.setMargins(0, 8, 0, 8);
        linearLayout9.setLayoutParams(layoutParams10);
        textView3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(5, 1, -2039584, -657931));
        textView4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(5, 1, -2039584, -657931));
        textView6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(5, 1, -2039584, -657931));
        textView7.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(5, 1, -2039584, -657931));
        final Bitmap bitmap2 = bitmap;
        AnonymousClass67 r1 = new TimerTask() {
            public void run() {
                ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                final ImageView imageView = imageView3;
                final Bitmap bitmap = bitmap2;
                exzamViewActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
        };
        this.timer_5 = r1;
        TextView textView8 = textView3;
        this._timer.schedule(r1, 50);
        if (i5 == 4) {
            textView6.setVisibility(8);
            textView4.setVisibility(8);
        }
        ImageView imageView4 = imageView2;
        LinearLayout linearLayout14 = linearLayout12;
        final int i8 = i2;
        TextView textView9 = textView6;
        final int i9 = i3;
        final int i10 = i4;
        LinearLayout.LayoutParams layoutParams11 = layoutParams;
        LinearLayout linearLayout15 = linearLayout6;
        TextView textView10 = textView4;
        final AlertDialog alertDialog = create;
        textView9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.AddNew(i8 + 1, i9, "0", i10);
                alertDialog.dismiss();
            }
        });
        TextView textView11 = textView8;
        textView11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.AddNew(0, i6, "1", i7);
                create.dismiss();
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.AddNew(0, i6 + 1, "1", i7);
                create.dismiss();
            }
        });
        AnonymousClass71 r10 = r0;
        final AlertDialog alertDialog2 = create;
        AnonymousClass71 r0 = new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.AddNew(i8, i9, "0", i10);
                alertDialog2.dismiss();
            }
        };
        textView10.setOnClickListener(r10);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams12.setMargins(2, 2, 2, 2);
        LinearLayout linearLayout16 = linearLayout15;
        linearLayout16.setLayoutParams(layoutParams12);
        LinearLayout linearLayout17 = linearLayout13;
        linearLayout16.addView(linearLayout17);
        LinearLayout linearLayout18 = new LinearLayout(getApplicationContext());
        ImageView imageView5 = new ImageView(getApplicationContext());
        LinearLayout.LayoutParams layoutParams13 = layoutParams11;
        imageView5.setLayoutParams(layoutParams13);
        imageView5.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView5.setImageResource(R.drawable.ic_exposure_plus_2_black);
        imageView5.setOnClickListener(new View.OnClickListener() {
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0031 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r5) {
                /*
                    r4 = this;
                    java.lang.String r5 = "2"
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r0 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x0031 }
                    com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0031 }
                    r1.<init>()     // Catch:{ Exception -> 0x0031 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r2 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x0031 }
                    java.util.ArrayList r2 = r2.List_map     // Catch:{ Exception -> 0x0031 }
                    int r3 = r8     // Catch:{ Exception -> 0x0031 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0031 }
                    java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x0031 }
                    java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0031 }
                    java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0031 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$72$1 r3 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$72$1     // Catch:{ Exception -> 0x0031 }
                    r3.<init>()     // Catch:{ Exception -> 0x0031 }
                    java.lang.reflect.Type r3 = r3.getType()     // Catch:{ Exception -> 0x0031 }
                    java.lang.Object r1 = r1.fromJson((java.lang.String) r2, (java.lang.reflect.Type) r3)     // Catch:{ Exception -> 0x0031 }
                    java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x0031 }
                    r0.Data_Map = r1     // Catch:{ Exception -> 0x0031 }
                L_0x0031:
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r0 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00aa }
                    java.util.ArrayList r1 = r0.Data_Map     // Catch:{ Exception -> 0x00aa }
                    int r2 = r7     // Catch:{ Exception -> 0x00aa }
                    java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x00aa }
                    java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x00aa }
                    r0.Map_A = r1     // Catch:{ Exception -> 0x00aa }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r0 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00aa }
                    java.util.ArrayList r0 = r0.Data_Map     // Catch:{ Exception -> 0x00aa }
                    int r1 = r7     // Catch:{ Exception -> 0x00aa }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r2 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00aa }
                    java.util.HashMap r2 = r2.Map_A     // Catch:{ Exception -> 0x00aa }
                    r0.add(r1, r2)     // Catch:{ Exception -> 0x00aa }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r0 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00aa }
                    java.util.ArrayList r0 = r0.List_map     // Catch:{ Exception -> 0x00aa }
                    int r1 = r8     // Catch:{ Exception -> 0x00aa }
                    java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x00aa }
                    java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x00aa }
                    com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00aa }
                    r1.<init>()     // Catch:{ Exception -> 0x00aa }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r2 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00aa }
                    java.util.ArrayList r2 = r2.Data_Map     // Catch:{ Exception -> 0x00aa }
                    java.lang.String r1 = r1.toJson((java.lang.Object) r2)     // Catch:{ Exception -> 0x00aa }
                    r0.put(r5, r1)     // Catch:{ Exception -> 0x00aa }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r5 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00aa }
                    android.content.SharedPreferences r5 = r5.saveX     // Catch:{ Exception -> 0x00aa }
                    android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ Exception -> 0x00aa }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r0 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00aa }
                    java.lang.String r0 = r0.ID     // Catch:{ Exception -> 0x00aa }
                    java.lang.String r1 = "_"
                    java.lang.String r2 = "all"
                    java.lang.String r1 = r1.concat(r2)     // Catch:{ Exception -> 0x00aa }
                    java.lang.String r0 = r0.concat(r1)     // Catch:{ Exception -> 0x00aa }
                    com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00aa }
                    r1.<init>()     // Catch:{ Exception -> 0x00aa }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r2 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00aa }
                    java.util.ArrayList r2 = r2.List_map     // Catch:{ Exception -> 0x00aa }
                    java.lang.String r1 = r1.toJson((java.lang.Object) r2)     // Catch:{ Exception -> 0x00aa }
                    android.content.SharedPreferences$Editor r5 = r5.putString(r0, r1)     // Catch:{ Exception -> 0x00aa }
                    r5.commit()     // Catch:{ Exception -> 0x00aa }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r5 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00aa }
                    r5._Start_A()     // Catch:{ Exception -> 0x00aa }
                L_0x00aa:
                    android.app.AlertDialog r5 = r14
                    r5.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.AnonymousClass72.onClick(android.view.View):void");
            }
        });
        LinearLayout linearLayout19 = linearLayout10;
        linearLayout19.addView(imageView5);
        ImageView imageView6 = imageView2;
        imageView6.setImageResource(R.drawable.nasa_6);
        ImageView imageView7 = new ImageView(getApplicationContext());
        imageView7.setLayoutParams(layoutParams13);
        imageView7.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView7.setImageResource(R.drawable.nasa_79);
        ImageView imageView8 = imageView7;
        LinearLayout linearLayout20 = linearLayout19;
        AnonymousClass73 r102 = r0;
        LinearLayout.LayoutParams layoutParams14 = layoutParams13;
        final int i11 = i4;
        ImageView imageView9 = imageView5;
        final int i12 = i3;
        LinearLayout.LayoutParams layoutParams15 = layoutParams14;
        LinearLayout linearLayout21 = linearLayout18;
        final int i13 = i2;
        LinearLayout linearLayout22 = linearLayout17;
        final AlertDialog alertDialog3 = create;
        AnonymousClass73 r02 = new View.OnClickListener() {
            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0031 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x003a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r5) {
                /*
                    r4 = this;
                    java.lang.String r5 = "2"
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r0 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x0031 }
                    com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0031 }
                    r1.<init>()     // Catch:{ Exception -> 0x0031 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r2 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x0031 }
                    java.util.ArrayList r2 = r2.List_map     // Catch:{ Exception -> 0x0031 }
                    int r3 = r2     // Catch:{ Exception -> 0x0031 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0031 }
                    java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x0031 }
                    java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x0031 }
                    java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0031 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$73$1 r3 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$73$1     // Catch:{ Exception -> 0x0031 }
                    r3.<init>()     // Catch:{ Exception -> 0x0031 }
                    java.lang.reflect.Type r3 = r3.getType()     // Catch:{ Exception -> 0x0031 }
                    java.lang.Object r1 = r1.fromJson((java.lang.String) r2, (java.lang.reflect.Type) r3)     // Catch:{ Exception -> 0x0031 }
                    java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x0031 }
                    r0.Data_Map = r1     // Catch:{ Exception -> 0x0031 }
                L_0x0031:
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r0 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x003a }
                    java.util.HashMap r0 = r0.m_Hidar     // Catch:{ Exception -> 0x003a }
                    r0.clear()     // Catch:{ Exception -> 0x003a }
                L_0x003a:
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r0 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00b6 }
                    com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00b6 }
                    r1.<init>()     // Catch:{ Exception -> 0x00b6 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r2 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00b6 }
                    java.util.ArrayList r2 = r2.Data_Map     // Catch:{ Exception -> 0x00b6 }
                    int r3 = r3     // Catch:{ Exception -> 0x00b6 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00b6 }
                    java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x00b6 }
                    java.lang.Object r5 = r2.get(r5)     // Catch:{ Exception -> 0x00b6 }
                    java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00b6 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$73$2 r2 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$73$2     // Catch:{ Exception -> 0x00b6 }
                    r2.<init>()     // Catch:{ Exception -> 0x00b6 }
                    java.lang.reflect.Type r2 = r2.getType()     // Catch:{ Exception -> 0x00b6 }
                    java.lang.Object r5 = r1.fromJson((java.lang.String) r5, (java.lang.reflect.Type) r2)     // Catch:{ Exception -> 0x00b6 }
                    java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ Exception -> 0x00b6 }
                    r0.List_PL = r5     // Catch:{ Exception -> 0x00b6 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r5 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00b6 }
                    java.util.ArrayList r0 = r5.List_PL     // Catch:{ Exception -> 0x00b6 }
                    int r1 = r4     // Catch:{ Exception -> 0x00b6 }
                    java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x00b6 }
                    java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x00b6 }
                    r5.m_Hidar = r0     // Catch:{ Exception -> 0x00b6 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r5 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00b6 }
                    java.util.ArrayList r5 = r5.List_all     // Catch:{ Exception -> 0x00b6 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r0 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00b6 }
                    java.util.HashMap r0 = r0.m_Hidar     // Catch:{ Exception -> 0x00b6 }
                    r5.add(r0)     // Catch:{ Exception -> 0x00b6 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r5 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00b6 }
                    android.content.SharedPreferences r5 = r5.save     // Catch:{ Exception -> 0x00b6 }
                    android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ Exception -> 0x00b6 }
                    java.lang.String r0 = "n750"
                    com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00b6 }
                    r1.<init>()     // Catch:{ Exception -> 0x00b6 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r2 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00b6 }
                    java.util.ArrayList r2 = r2.List_all     // Catch:{ Exception -> 0x00b6 }
                    java.lang.String r1 = r1.toJson((java.lang.Object) r2)     // Catch:{ Exception -> 0x00b6 }
                    android.content.SharedPreferences$Editor r5 = r5.putString(r0, r1)     // Catch:{ Exception -> 0x00b6 }
                    r5.commit()     // Catch:{ Exception -> 0x00b6 }
                    com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity r5 = com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.this     // Catch:{ Exception -> 0x00b6 }
                    android.content.Context r5 = r5.getApplicationContext()     // Catch:{ Exception -> 0x00b6 }
                    java.lang.String r0 = "تم الاضافه الى النموذجات"
                    com.Nasa.Soft.Exzam.Editor35.SketchwareUtil.showMessage(r5, r0)     // Catch:{ Exception -> 0x00b6 }
                L_0x00b6:
                    android.app.AlertDialog r5 = r5
                    r5.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.AnonymousClass73.onClick(android.view.View):void");
            }
        };
        imageView8.setOnClickListener(r102);
        linearLayout20.addView(imageView8);
        try {
            str = str2;
            try {
                try {
                    textView11.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
                    textView7.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
                    textView10.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
                    textView9.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
                    textView = textView5;
                    try {
                        textView.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    textView = textView5;
                }
            } catch (Exception unused3) {
                textView = textView5;
                linearLayout21.setBackgroundColor(-1);
                final int i14 = i4;
                final int i15 = i3;
                final int i16 = i2;
                final AlertDialog alertDialog4 = create;
                imageView6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ExzamViewActivity.this._delete_D((double) i14, (double) i15, (double) i16);
                        alertDialog4.dismiss();
                    }
                });
                imageView6.setLayoutParams(layoutParams15);
                linearLayout22.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(5, 1, ViewCompat.MEASURED_STATE_MASK, -1));
                imageView9.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(5, 1, -657931, 0));
                imageView8.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(5, 1, -657931, 0));
                imageView6.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(5, 1, -657931, 0));
                LinearLayout linearLayout23 = linearLayout14;
                linearLayout23.addView(linearLayout15);
                LinearLayout linearLayout24 = new LinearLayout(getApplicationContext());
                linearLayout24.setOrientation(0);
                LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
                layoutParams16.setMargins(0, 4, 0, 4);
                linearLayout24.setLayoutParams(layoutParams16);
                linearLayout23.addView(linearLayout24);
                linearLayout24.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(0, 0, ViewCompat.MEASURED_STATE_MASK, -1118482));
                TextView textView12 = new TextView(getApplicationContext());
                textView12.setLayoutParams(new LinearLayout.LayoutParams(-1, 60, 1.0f));
                textView12.setTextColor(-59580);
                textView12.setTextSize(15.0f);
                textView12.setText("هل تريد الحفظ ؟");
                textView12.setGravity(17);
                linearLayout23.addView(textView12);
                LinearLayout linearLayout25 = new LinearLayout(getApplicationContext());
                linearLayout25.setOrientation(0);
                LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
                layoutParams17.setMargins(0, 8, 1, 0);
                linearLayout25.setLayoutParams(layoutParams17);
                TextView textView13 = new TextView(getApplicationContext());
                textView13.setLayoutParams(new LinearLayout.LayoutParams(120, 50, 1.0f));
                textView13.setTextColor(-1499549);
                textView13.setTextSize(15.0f);
                textView13.setText("cancel");
                textView13.setGravity(17);
                textView13.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        create.dismiss();
                    }
                });
                linearLayout25.addView(textView13);
                LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(200, 60, 0.0f);
                layoutParams18.setMargins(10, 1, 1, 10);
                textView13.setLayoutParams(layoutParams18);
                textView13.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
                TextView textView14 = new TextView(getApplicationContext());
                textView14.setLayoutParams(new LinearLayout.LayoutParams(150, 45, 1.0f));
                textView14.setTextColor(-59580);
                textView14.setTextSize(15.0f);
                textView14.setText("ok");
                textView14.setGravity(17);
                linearLayout25.addView(textView14);
                LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(200, 60, 0.0f);
                layoutParams19.setMargins(10, 1, 1, 10);
                textView14.setLayoutParams(layoutParams19);
                textView14.setBackground(new GradientDrawable() {
                    public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                        setCornerRadius((float) i);
                        setStroke(i2, i3);
                        setColor(i4);
                        return this;
                    }
                }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
                linearLayout23.setBackgroundColor(-1);
                linearLayout23.addView(linearLayout25);
                LinearLayout linearLayout26 = linearLayout5;
                linearLayout26.addView(linearLayout23);
                textView12.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
                textView.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
                textView14.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
                textView13.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
                textView14.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        try {
                            create.dismiss();
                        } catch (Exception unused) {
                        }
                    }
                });
                create.setView(linearLayout26);
                create.show();
                create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                create.getWindow().setLayout(-1, -2);
                textView12.setText("ملاحظه : يجب الحذر عند استخدام هذا الإجراء");
                textView12.setTextSize(10.0f);
                textView12.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
                LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
                layoutParams20.setMargins(2, 2, 2, 2);
                textView12.setLayoutParams(layoutParams20);
                LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
                layoutParams21.setMargins(2, 2, 2, 2);
                textView14.setLayoutParams(layoutParams21);
                textView14.setVisibility(8);
                LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
                layoutParams22.setMargins(1, 1, 1, 1);
                linearLayout20.setLayoutParams(layoutParams22);
                LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
                layoutParams23.setMargins(2, 2, 2, 2);
                textView13.setLayoutParams(layoutParams23);
                textView14.setVisibility(8);
            }
        } catch (Exception unused4) {
            textView = textView5;
            str = str2;
            linearLayout21.setBackgroundColor(-1);
            final int i142 = i4;
            final int i152 = i3;
            final int i162 = i2;
            final AlertDialog alertDialog42 = create;
            imageView6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ExzamViewActivity.this._delete_D((double) i142, (double) i152, (double) i162);
                    alertDialog42.dismiss();
                }
            });
            imageView6.setLayoutParams(layoutParams15);
            linearLayout22.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(5, 1, ViewCompat.MEASURED_STATE_MASK, -1));
            imageView9.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(5, 1, -657931, 0));
            imageView8.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(5, 1, -657931, 0));
            imageView6.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(5, 1, -657931, 0));
            LinearLayout linearLayout232 = linearLayout14;
            linearLayout232.addView(linearLayout15);
            LinearLayout linearLayout242 = new LinearLayout(getApplicationContext());
            linearLayout242.setOrientation(0);
            LinearLayout.LayoutParams layoutParams162 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
            layoutParams162.setMargins(0, 4, 0, 4);
            linearLayout242.setLayoutParams(layoutParams162);
            linearLayout232.addView(linearLayout242);
            linearLayout242.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(0, 0, ViewCompat.MEASURED_STATE_MASK, -1118482));
            TextView textView122 = new TextView(getApplicationContext());
            textView122.setLayoutParams(new LinearLayout.LayoutParams(-1, 60, 1.0f));
            textView122.setTextColor(-59580);
            textView122.setTextSize(15.0f);
            textView122.setText("هل تريد الحفظ ؟");
            textView122.setGravity(17);
            linearLayout232.addView(textView122);
            LinearLayout linearLayout252 = new LinearLayout(getApplicationContext());
            linearLayout252.setOrientation(0);
            LinearLayout.LayoutParams layoutParams172 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
            layoutParams172.setMargins(0, 8, 1, 0);
            linearLayout252.setLayoutParams(layoutParams172);
            TextView textView132 = new TextView(getApplicationContext());
            textView132.setLayoutParams(new LinearLayout.LayoutParams(120, 50, 1.0f));
            textView132.setTextColor(-1499549);
            textView132.setTextSize(15.0f);
            textView132.setText("cancel");
            textView132.setGravity(17);
            textView132.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    create.dismiss();
                }
            });
            linearLayout252.addView(textView132);
            LinearLayout.LayoutParams layoutParams182 = new LinearLayout.LayoutParams(200, 60, 0.0f);
            layoutParams182.setMargins(10, 1, 1, 10);
            textView132.setLayoutParams(layoutParams182);
            textView132.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
            TextView textView142 = new TextView(getApplicationContext());
            textView142.setLayoutParams(new LinearLayout.LayoutParams(150, 45, 1.0f));
            textView142.setTextColor(-59580);
            textView142.setTextSize(15.0f);
            textView142.setText("ok");
            textView142.setGravity(17);
            linearLayout252.addView(textView142);
            LinearLayout.LayoutParams layoutParams192 = new LinearLayout.LayoutParams(200, 60, 0.0f);
            layoutParams192.setMargins(10, 1, 1, 10);
            textView142.setLayoutParams(layoutParams192);
            textView142.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
            linearLayout232.setBackgroundColor(-1);
            linearLayout232.addView(linearLayout252);
            LinearLayout linearLayout262 = linearLayout5;
            linearLayout262.addView(linearLayout232);
            textView122.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
            textView.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
            textView142.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
            textView132.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
            textView142.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    try {
                        create.dismiss();
                    } catch (Exception unused) {
                    }
                }
            });
            create.setView(linearLayout262);
            create.show();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            create.getWindow().setLayout(-1, -2);
            textView122.setText("ملاحظه : يجب الحذر عند استخدام هذا الإجراء");
            textView122.setTextSize(10.0f);
            textView122.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            LinearLayout.LayoutParams layoutParams202 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
            layoutParams202.setMargins(2, 2, 2, 2);
            textView122.setLayoutParams(layoutParams202);
            LinearLayout.LayoutParams layoutParams212 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
            layoutParams212.setMargins(2, 2, 2, 2);
            textView142.setLayoutParams(layoutParams212);
            textView142.setVisibility(8);
            LinearLayout.LayoutParams layoutParams222 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
            layoutParams222.setMargins(1, 1, 1, 1);
            linearLayout20.setLayoutParams(layoutParams222);
            LinearLayout.LayoutParams layoutParams232 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
            layoutParams232.setMargins(2, 2, 2, 2);
            textView132.setLayoutParams(layoutParams232);
            textView142.setVisibility(8);
        }
        linearLayout21.setBackgroundColor(-1);
        final int i1422 = i4;
        final int i1522 = i3;
        final int i1622 = i2;
        final AlertDialog alertDialog422 = create;
        imageView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._delete_D((double) i1422, (double) i1522, (double) i1622);
                alertDialog422.dismiss();
            }
        });
        imageView6.setLayoutParams(layoutParams15);
        linearLayout22.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(5, 1, ViewCompat.MEASURED_STATE_MASK, -1));
        imageView9.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(5, 1, -657931, 0));
        imageView8.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(5, 1, -657931, 0));
        imageView6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(5, 1, -657931, 0));
        LinearLayout linearLayout2322 = linearLayout14;
        linearLayout2322.addView(linearLayout15);
        LinearLayout linearLayout2422 = new LinearLayout(getApplicationContext());
        linearLayout2422.setOrientation(0);
        LinearLayout.LayoutParams layoutParams1622 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams1622.setMargins(0, 4, 0, 4);
        linearLayout2422.setLayoutParams(layoutParams1622);
        linearLayout2322.addView(linearLayout2422);
        linearLayout2422.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 0, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView1222 = new TextView(getApplicationContext());
        textView1222.setLayoutParams(new LinearLayout.LayoutParams(-1, 60, 1.0f));
        textView1222.setTextColor(-59580);
        textView1222.setTextSize(15.0f);
        textView1222.setText("هل تريد الحفظ ؟");
        textView1222.setGravity(17);
        linearLayout2322.addView(textView1222);
        LinearLayout linearLayout2522 = new LinearLayout(getApplicationContext());
        linearLayout2522.setOrientation(0);
        LinearLayout.LayoutParams layoutParams1722 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams1722.setMargins(0, 8, 1, 0);
        linearLayout2522.setLayoutParams(layoutParams1722);
        TextView textView1322 = new TextView(getApplicationContext());
        textView1322.setLayoutParams(new LinearLayout.LayoutParams(120, 50, 1.0f));
        textView1322.setTextColor(-1499549);
        textView1322.setTextSize(15.0f);
        textView1322.setText("cancel");
        textView1322.setGravity(17);
        textView1322.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        linearLayout2522.addView(textView1322);
        LinearLayout.LayoutParams layoutParams1822 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams1822.setMargins(10, 1, 1, 10);
        textView1322.setLayoutParams(layoutParams1822);
        textView1322.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView1422 = new TextView(getApplicationContext());
        textView1422.setLayoutParams(new LinearLayout.LayoutParams(150, 45, 1.0f));
        textView1422.setTextColor(-59580);
        textView1422.setTextSize(15.0f);
        textView1422.setText("ok");
        textView1422.setGravity(17);
        linearLayout2522.addView(textView1422);
        LinearLayout.LayoutParams layoutParams1922 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams1922.setMargins(10, 1, 1, 10);
        textView1422.setLayoutParams(layoutParams1922);
        textView1422.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout2322.setBackgroundColor(-1);
        linearLayout2322.addView(linearLayout2522);
        LinearLayout linearLayout2622 = linearLayout5;
        linearLayout2622.addView(linearLayout2322);
        try {
            textView1222.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
            textView.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
            textView1422.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
            textView1322.setTypeface(Typeface.createFromAsset(getAssets(), str), 1);
        } catch (Exception unused5) {
        }
        textView1422.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    create.dismiss();
                } catch (Exception unused) {
                }
            }
        });
        create.setView(linearLayout2622);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        create.getWindow().setLayout(-1, -2);
        textView1222.setText("ملاحظه : يجب الحذر عند استخدام هذا الإجراء");
        textView1222.setTextSize(10.0f);
        textView1222.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        LinearLayout.LayoutParams layoutParams2022 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams2022.setMargins(2, 2, 2, 2);
        textView1222.setLayoutParams(layoutParams2022);
        LinearLayout.LayoutParams layoutParams2122 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams2122.setMargins(2, 2, 2, 2);
        textView1422.setLayoutParams(layoutParams2122);
        textView1422.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2222 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams2222.setMargins(1, 1, 1, 1);
        linearLayout20.setLayoutParams(layoutParams2222);
        LinearLayout.LayoutParams layoutParams2322 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams2322.setMargins(2, 2, 2, 2);
        textView1322.setLayoutParams(layoutParams2322);
        textView1422.setVisibility(8);
    }

    public void AddNew(int i2, int i3, String str, int i4) {
        int i5;
        int i6;
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
        textView.setText("☆ أختار نوع الإضافة ☆");
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        layoutParams7.setMargins(2, 2, 2, 2);
        textView.setLayoutParams(layoutParams7);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams8.setMargins(2, 2, 2, 2);
        linearLayout5.setLayoutParams(layoutParams8);
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
        textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView2.setTextSize(16.0f);
        try {
            textView2.setText("إضــــــافة نــــــــــــــــــص");
        } catch (Exception unused) {
            textView2.setText(BuildConfig.FLAVOR);
        }
        textView2.setGravity(17);
        TextView textView3 = textView2;
        AnonymousClass87 r14 = r0;
        LinearLayout linearLayout6 = linearLayout5;
        String str2 = "fonts/nasa_soft44.ttf";
        final String str3 = str;
        LinearLayout linearLayout7 = linearLayout;
        final int i7 = i4;
        final int i8 = i3;
        final int i9 = i2;
        TextView textView4 = textView;
        final AlertDialog alertDialog = create;
        AnonymousClass87 r0 = new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._save_insert_A8("1", str3, (double) i7, (double) i8, (double) i9);
                alertDialog.dismiss();
            }
        };
        textView3.setOnClickListener(r14);
        linearLayout6.addView(textView3);
        TextView textView5 = new TextView(getApplicationContext());
        textView5.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
        textView5.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView5.setTextSize(16.0f);
        try {
            textView5.setText("إضــــــافة صــــــــــــــــــوره");
        } catch (Exception unused2) {
            textView5.setText(BuildConfig.FLAVOR);
        }
        textView5.setGravity(17);
        final String str4 = str;
        final int i10 = i4;
        final int i11 = i3;
        final int i12 = i2;
        AnonymousClass88 r8 = r0;
        final AlertDialog alertDialog2 = create;
        AnonymousClass88 r02 = new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._save_insert_A8("2", str4, (double) i10, (double) i11, (double) i12);
                alertDialog2.dismiss();
            }
        };
        textView5.setOnClickListener(r8);
        linearLayout6.addView(textView5);
        TextView textView6 = new TextView(getApplicationContext());
        textView6.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
        textView6.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView6.setTextSize(16.0f);
        try {
            textView6.setText("إضــــافة جــــــدول");
        } catch (Exception unused3) {
            textView6.setText(BuildConfig.FLAVOR);
        }
        textView6.setGravity(17);
        final String str5 = str;
        final int i13 = i2;
        final int i14 = i3;
        final int i15 = i4;
        AnonymousClass89 r11 = r0;
        final AlertDialog alertDialog3 = create;
        AnonymousClass89 r03 = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(ExzamViewActivity.this.getApplicationContext(), EnterTableActivity.class);
                intent.putExtra("T", "3");
                intent.putExtra("E", str5);
                intent.putExtra("PL", String.valueOf((long) i13));
                intent.putExtra("PD", String.valueOf((long) i14));
                intent.putExtra("K", String.valueOf((long) i15));
                intent.putExtra(DatabaseHelper.COL_0, ExzamViewActivity.this.ID);
                intent.putExtra("page", String.valueOf((long) ExzamViewActivity.this.position_number));
                ExzamViewActivity.this.startActivity(intent);
                ExzamViewActivity.this.finish();
                alertDialog3.dismiss();
            }
        };
        textView6.setOnClickListener(r11);
        linearLayout6.addView(textView6);
        TextView textView7 = new TextView(getApplicationContext());
        textView7.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
        textView7.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView7.setTextSize(16.0f);
        try {
            textView7.setText("إضــــافة سطــــر (فقرات)");
        } catch (Exception unused4) {
            textView7.setText(BuildConfig.FLAVOR);
        }
        textView7.setGravity(17);
        final String str6 = str;
        final int i16 = i4;
        final int i17 = i3;
        final int i18 = i2;
        LinearLayout linearLayout8 = linearLayout2;
        AnonymousClass90 r15 = r0;
        final AlertDialog alertDialog4 = create;
        AnonymousClass90 r04 = new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._save_insert_A8("4", str6, (double) i16, (double) i17, (double) i18);
                alertDialog4.dismiss();
            }
        };
        textView7.setOnClickListener(r15);
        linearLayout6.addView(textView7);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams9.setMargins(8, 8, 8, 8);
        textView5.setLayoutParams(layoutParams9);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams10.setMargins(8, 16, 8, 8);
        textView3.setLayoutParams(layoutParams10);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams11.setMargins(8, 8, 8, 16);
        textView7.setLayoutParams(layoutParams11);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams12.setMargins(8, 8, 8, 16);
        textView6.setLayoutParams(layoutParams12);
        TextView textView8 = new TextView(getApplicationContext());
        textView8.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
        textView8.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView8.setTextSize(16.0f);
        try {
            textView8.setText("إسم القسم\"مثلا\" (اولا الحفظ) ");
        } catch (Exception unused5) {
            textView8.setText(BuildConfig.FLAVOR);
        }
        textView8.setGravity(17);
        textView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        linearLayout6.addView(textView8);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams13.setMargins(8, 8, 8, 8);
        textView8.setLayoutParams(layoutParams13);
        textView8.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        textView8.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -1, -1118482));
        if (str.equals("0")) {
            textView7.setVisibility(8);
        }
        TextView textView9 = new TextView(getApplicationContext());
        textView9.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
        textView9.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView9.setTextSize(16.0f);
        try {
            textView9.setText("نموذج - معادلات رياضيه (كسور)");
        } catch (Exception unused6) {
            textView9.setText(BuildConfig.FLAVOR);
        }
        textView9.setGravity(17);
        final String str7 = str;
        TextView textView10 = textView9;
        TextView textView11 = textView6;
        final int i19 = i4;
        final int i20 = i3;
        AnonymousClass93 r82 = r0;
        TextView textView12 = textView7;
        final int i21 = i2;
        String str8 = "fonts/font.ttf";
        final AlertDialog alertDialog5 = create;
        AnonymousClass93 r05 = new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._save_insert_A8("6", str7, (double) i19, (double) i20, (double) i21);
                alertDialog5.dismiss();
            }
        };
        textView10.setOnClickListener(r82);
        linearLayout6.addView(textView10);
        int i22 = -1;
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams14.setMargins(8, 8, 8, 8);
        textView10.setLayoutParams(layoutParams14);
        textView10.setTypeface(Typeface.createFromAsset(getAssets(), str8), 1);
        textView10.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -1, -1118482));
        if (!this.save.getString("n750", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            TextView textView13 = new TextView(getApplicationContext());
            textView13.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
            textView13.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            textView13.setTextSize(16.0f);
            try {
                textView13.setText("لصق من النموذجات ");
            } catch (Exception unused7) {
                textView13.setText(BuildConfig.FLAVOR);
            }
            textView13.setGravity(17);
            final String str9 = str;
            final int i23 = i2;
            final int i24 = i3;
            final int i25 = i4;
            final AlertDialog alertDialog6 = create;
            textView13.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ExzamViewActivity.this.dialog_nmothag("50", str9, i23, i24, i25);
                    alertDialog6.dismiss();
                }
            });
            linearLayout6.addView(textView13);
            i22 = -1;
            LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
            layoutParams15.setMargins(8, 8, 8, 8);
            textView13.setLayoutParams(layoutParams15);
            textView13.setTypeface(Typeface.createFromAsset(getAssets(), str8), 1);
            i6 = 20;
            i5 = -1118482;
            textView13.setBackground(new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            }.getIns(20, 2, -1, -1118482));
        } else {
            i6 = 20;
            i5 = -1118482;
        }
        linearLayout6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, i22, i22));
        textView3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(i6, 2, i22, i5));
        textView5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(i6, 2, i22, i5));
        TextView textView14 = textView12;
        textView14.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(i6, 2, i22, i5));
        GradientDrawable ins = new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(i6, 2, i22, i5);
        TextView textView15 = textView11;
        textView15.setBackground(ins);
        try {
            textView5.setTypeface(Typeface.createFromAsset(getAssets(), str8), 1);
            textView3.setTypeface(Typeface.createFromAsset(getAssets(), str8), 1);
            textView14.setTypeface(Typeface.createFromAsset(getAssets(), str8), 1);
            textView15.setTypeface(Typeface.createFromAsset(getAssets(), str8), 1);
        } catch (Exception unused8) {
        }
        LinearLayout linearLayout9 = linearLayout8;
        linearLayout9.addView(linearLayout6);
        LinearLayout linearLayout10 = new LinearLayout(getApplicationContext());
        linearLayout10.setOrientation(0);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, 3, 0.0f);
        layoutParams16.setMargins(0, 4, 0, 4);
        linearLayout10.setLayoutParams(layoutParams16);
        linearLayout9.addView(linearLayout10);
        linearLayout10.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 0, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView16 = new TextView(getApplicationContext());
        textView16.setLayoutParams(new LinearLayout.LayoutParams(-1, 60, 1.0f));
        textView16.setTextColor(-59580);
        textView16.setTextSize(15.0f);
        textView16.setText("هل تريد الحفظ ؟");
        textView16.setGravity(17);
        linearLayout9.addView(textView16);
        LinearLayout linearLayout11 = new LinearLayout(getApplicationContext());
        linearLayout11.setOrientation(0);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams17.setMargins(0, 8, 1, 0);
        linearLayout11.setLayoutParams(layoutParams17);
        TextView textView17 = new TextView(getApplicationContext());
        textView17.setLayoutParams(new LinearLayout.LayoutParams(120, 50, 1.0f));
        textView17.setTextColor(-1499549);
        textView17.setTextSize(15.0f);
        textView17.setText("cancel");
        textView17.setGravity(17);
        textView17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        linearLayout11.addView(textView17);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams18.setMargins(10, 1, 1, 10);
        textView17.setLayoutParams(layoutParams18);
        textView17.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView18 = new TextView(getApplicationContext());
        textView18.setLayoutParams(new LinearLayout.LayoutParams(150, 45, 1.0f));
        textView18.setTextColor(-59580);
        textView18.setTextSize(15.0f);
        textView18.setText("ok");
        textView18.setGravity(17);
        linearLayout11.addView(textView18);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams19.setMargins(10, 1, 1, 10);
        textView18.setLayoutParams(layoutParams19);
        textView18.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout9.setBackgroundColor(-1);
        linearLayout9.addView(linearLayout11);
        LinearLayout linearLayout12 = linearLayout7;
        linearLayout12.addView(linearLayout9);
        try {
            String str10 = str2;
            textView16.setTypeface(Typeface.createFromAsset(getAssets(), str10), 1);
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), str10), 1);
            textView18.setTypeface(Typeface.createFromAsset(getAssets(), str10), 1);
            textView17.setTypeface(Typeface.createFromAsset(getAssets(), str10), 1);
        } catch (Exception unused9) {
        }
        textView18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    create.dismiss();
                } catch (Exception unused) {
                }
            }
        });
        create.setView(linearLayout12);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        create.getWindow().setLayout(-1, -2);
        textView16.setText("ملاحظه : ");
        textView16.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams20.setMargins(2, 2, 2, 2);
        textView16.setLayoutParams(layoutParams20);
        LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams21.setMargins(2, 2, 2, 2);
        textView18.setLayoutParams(layoutParams21);
        LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams22.setMargins(2, 2, 2, 2);
        textView17.setLayoutParams(layoutParams22);
        textView18.setVisibility(8);
    }

    public void _delete_D(double d, double d2, double d3) {
        this.dialog.setTitle("تحذير يابو الشباب !!!! ");
        this.dialog.setMessage("سوف يتم حذف \" ".concat("هذه الفقره ".concat("  نهائياً !! ")));
        this.dialog.setIcon(R.drawable.o91_3_6);
        try {
            try {
                this.Data_Map = (ArrayList) new Gson().fromJson(this.List_map.get((int) d).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                }.getType());
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            double d4 = d;
            SketchwareUtil.showMessage(getApplicationContext(), "51");
            final double d5 = d2;
            final double d6 = d3;
            final double d7 = d;
            this.dialog.setPositiveButton("تاكيد الحذف", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    try {
                        ExzamViewActivity.this.List_startMap = (ArrayList) new Gson().fromJson(((HashMap) ExzamViewActivity.this.Data_Map.get((int) d5)).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                        }.getType());
                        ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                        final double d = d6;
                        final double d2 = d5;
                        final double d3 = d7;
                        exzamViewActivity.timer_5 = new TimerTask() {
                            public void run() {
                                ExzamViewActivity access$0 = ExzamViewActivity.this;
                                final double d = d;
                                final double d2 = d2;
                                final double d3 = d3;
                                access$0.runOnUiThread(new Runnable() {
                                    public void run() {
                                        ExzamViewActivity.this.List_startMap.remove((int) d);
                                        if (ExzamViewActivity.this.List_startMap.size() == 0) {
                                            try {
                                                ExzamViewActivity.this.Data_Map.remove((int) d2);
                                            } catch (Exception unused) {
                                                SketchwareUtil.showMessage(ExzamViewActivity.this.getApplicationContext(), "52");
                                            }
                                        } else {
                                            ((HashMap) ExzamViewActivity.this.Data_Map.get((int) d2)).put("2", new Gson().toJson((Object) ExzamViewActivity.this.List_startMap));
                                        }
                                        if (ExzamViewActivity.this.Data_Map.size() == 0) {
                                            try {
                                                ExzamViewActivity.this.List_map.remove((int) d3);
                                            } catch (Exception unused2) {
                                                SketchwareUtil.showMessage(ExzamViewActivity.this.getApplicationContext(), "53");
                                            }
                                        } else {
                                            ((HashMap) ExzamViewActivity.this.List_map.get((int) d3)).put("2", new Gson().toJson((Object) ExzamViewActivity.this.Data_Map));
                                        }
                                        ExzamViewActivity.this.timer_5 = new TimerTask() {
                                            public void run() {
                                                ExzamViewActivity.this.runOnUiThread(new Runnable() {
                                                    public void run() {
                                                        ExzamViewActivity.this.saveX.edit().putString(ExzamViewActivity.this.ID.concat("_".concat("all")), new Gson().toJson((Object) ExzamViewActivity.this.List_map)).commit();
                                                        ExzamViewActivity.this.timer_5 = new TimerTask() {
                                                            public void run() {
                                                                ExzamViewActivity.this.runOnUiThread(new Runnable() {
                                                                    public void run() {
                                                                        ExzamViewActivity.this._Start_A();
                                                                        SketchwareUtil.showMessage(ExzamViewActivity.this.getApplicationContext(), "تم الحذف بنجاح ✓".concat(BuildConfig.FLAVOR));
                                                                    }
                                                                });
                                                            }
                                                        };
                                                        ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 50);
                                                    }
                                                });
                                            }
                                        };
                                        ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 150);
                                    }
                                });
                            }
                        };
                        ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 50);
                    } catch (Exception unused) {
                    }
                }
            });
            this.dialog.setNegativeButton("إلغاء", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            this.dialog.create().show();
        }
        final double d52 = d2;
        final double d62 = d3;
        final double d72 = d;
        this.dialog.setPositiveButton("تاكيد الحذف", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    ExzamViewActivity.this.List_startMap = (ArrayList) new Gson().fromJson(((HashMap) ExzamViewActivity.this.Data_Map.get((int) d52)).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                    }.getType());
                    ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                    final double d = d62;
                    final double d2 = d52;
                    final double d3 = d72;
                    exzamViewActivity.timer_5 = new TimerTask() {
                        public void run() {
                            ExzamViewActivity access$0 = ExzamViewActivity.this;
                            final double d = d;
                            final double d2 = d2;
                            final double d3 = d3;
                            access$0.runOnUiThread(new Runnable() {
                                public void run() {
                                    ExzamViewActivity.this.List_startMap.remove((int) d);
                                    if (ExzamViewActivity.this.List_startMap.size() == 0) {
                                        try {
                                            ExzamViewActivity.this.Data_Map.remove((int) d2);
                                        } catch (Exception unused) {
                                            SketchwareUtil.showMessage(ExzamViewActivity.this.getApplicationContext(), "52");
                                        }
                                    } else {
                                        ((HashMap) ExzamViewActivity.this.Data_Map.get((int) d2)).put("2", new Gson().toJson((Object) ExzamViewActivity.this.List_startMap));
                                    }
                                    if (ExzamViewActivity.this.Data_Map.size() == 0) {
                                        try {
                                            ExzamViewActivity.this.List_map.remove((int) d3);
                                        } catch (Exception unused2) {
                                            SketchwareUtil.showMessage(ExzamViewActivity.this.getApplicationContext(), "53");
                                        }
                                    } else {
                                        ((HashMap) ExzamViewActivity.this.List_map.get((int) d3)).put("2", new Gson().toJson((Object) ExzamViewActivity.this.Data_Map));
                                    }
                                    ExzamViewActivity.this.timer_5 = new TimerTask() {
                                        public void run() {
                                            ExzamViewActivity.this.runOnUiThread(new Runnable() {
                                                public void run() {
                                                    ExzamViewActivity.this.saveX.edit().putString(ExzamViewActivity.this.ID.concat("_".concat("all")), new Gson().toJson((Object) ExzamViewActivity.this.List_map)).commit();
                                                    ExzamViewActivity.this.timer_5 = new TimerTask() {
                                                        public void run() {
                                                            ExzamViewActivity.this.runOnUiThread(new Runnable() {
                                                                public void run() {
                                                                    ExzamViewActivity.this._Start_A();
                                                                    SketchwareUtil.showMessage(ExzamViewActivity.this.getApplicationContext(), "تم الحذف بنجاح ✓".concat(BuildConfig.FLAVOR));
                                                                }
                                                            });
                                                        }
                                                    };
                                                    ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 50);
                                                }
                                            });
                                        }
                                    };
                                    ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 150);
                                }
                            });
                        }
                    };
                    ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 50);
                } catch (Exception unused) {
                }
            }
        });
        this.dialog.setNegativeButton("إلغاء", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        this.dialog.create().show();
    }

    public void _save_insert_A8(String str, String str2, double d, double d2, double d3) {
        String str3 = str;
        double d4 = d;
        double d5 = d2;
        this.Type = str3;
        try {
            this.Data_Map = (ArrayList) new Gson().fromJson(this.List_map.get((int) d4).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
            }.getType());
        } catch (Exception unused) {
        }
        if (!str3.equals("50")) {
            this.map_A = new HashMap<>();
            if (str3.equals("2")) {
                this.map_A.put("1", "400,400,0");
            } else {
                this.map_A.put("1", "400,-2,1");
            }
            this.map_A.put("0", str3);
            this.map_A.put("2", "2,2,2,2");
            this.map_A.put("3", "5,5,5,5");
            this.map_A.put("4", "5,5,5,5");
            this.map_A.put("5", "#00000000");
            this.map_A.put("6", "0");
            this.map_A.put("7", "#FF000000");
            if (str3.equals("1")) {
                this.map_A.put("20", "نص فارغ..... ");
                this.map_A.put("21", "16");
                this.map_A.put("22", "#FF000000");
                this.map_A.put("23", "font.ttf");
                this.map_A.put("24", "1");
                this.map_A.put("25", "1");
                this.map_A.put("26", "0,0,0");
                this.map_A.put("27", "#00000000");
            }
            if (str3.equals("2")) {
                this.map_A.put("40", BuildConfig.FLAVOR);
                this.map_A.put("41", "0");
                this.map_A.put("42", BuildConfig.FLAVOR);
            }
            if (str3.equals("6")) {
                this.map_A.put("50", BuildConfig.FLAVOR);
                this.map_A.put("51", BuildConfig.FLAVOR);
            }
        } else {
            try {
                this.map_A = (HashMap) new Gson().fromJson(this.save.getString("n70", BuildConfig.FLAVOR), new TypeToken<HashMap<String, Object>>() {
                }.getType());
            } catch (Exception unused2) {
            }
        }
        if (str2.equals("1")) {
            this.List_startMap.clear();
            this.List_startMap.add(this.map_A);
            HashMap<String, Object> hashMap = new HashMap<>();
            this.maer4 = hashMap;
            hashMap.put("2", new Gson().toJson((Object) this.List_startMap));
            this.Data_Map.add((int) d5, this.maer4);
        } else {
            try {
                this.List_startMap = (ArrayList) new Gson().fromJson(this.Data_Map.get((int) d5).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                }.getType());
            } catch (Exception unused3) {
            }
            if (this.List_startMap.size() > 0) {
                this.List_startMap.add((int) d3, this.map_A);
            } else {
                this.List_startMap.add(this.map_A);
            }
            this.Data_Map.get((int) d5).put("2", new Gson().toJson((Object) this.List_startMap));
        }
        this.List_map.get((int) d).put("2", new Gson().toJson((Object) this.Data_Map));
        this.saveX.edit().putString(this.ID.concat("_".concat("all")), new Gson().toJson((Object) this.List_map)).commit();
        SketchwareUtil.showMessage(getApplicationContext(), " تم بنجاح");
        _Start_A();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x008e */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x00d3 A[SYNTHETIC, Splitter:B:8:0x00d3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _start_A() {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "56754334t55"
            java.lang.String r2 = "23567788765"
            java.lang.String r3 = "2023"
            java.lang.String r4 = "الصف : 23567788765\nالماده  : 56754334t55\nالتاريخ:     /       /      2023  م\nالزمن:- ساعتان       الفتره  (الاولى)"
            java.lang.String r5 = "#FF000000"
            android.content.SharedPreferences r6 = r0.save
            java.lang.String r7 = r0.ID
            java.lang.String r8 = "_"
            java.lang.String r9 = "madah"
            java.lang.String r9 = r8.concat(r9)
            java.lang.String r7 = r7.concat(r9)
            java.lang.String r9 = ""
            java.lang.String r6 = r6.getString(r7, r9)
            r0.madah = r6
            android.content.SharedPreferences r6 = r0.save
            java.lang.String r7 = r0.ID
            java.lang.String r10 = "save"
            java.lang.String r10 = r8.concat(r10)
            java.lang.String r7 = r7.concat(r10)
            java.lang.String r6 = r6.getString(r7, r9)
            r0.savefff = r6
            android.content.SharedPreferences r6 = r0.save
            java.lang.String r7 = r0.ID
            java.lang.String r10 = "name"
            java.lang.String r10 = r8.concat(r10)
            java.lang.String r7 = r7.concat(r10)
            java.lang.String r6 = r6.getString(r7, r9)
            r0.Name = r6
            android.widget.TextView r7 = r0.text_titel
            r7.setText(r6)
            android.widget.TextView r6 = r0.text_titel
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$113 r7 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$113
            r7.<init>()
            r10 = 20
            r11 = 2
            r12 = -2236963(0xffffffffffdddddd, float:NaN)
            r13 = -117901064(0xfffffffff8f8f8f8, float:-4.0398103E34)
            android.graphics.drawable.GradientDrawable r7 = r7.getIns(r10, r11, r12, r13)
            r6.setBackground(r7)
            android.widget.TextView r6 = r0.text_madah
            java.lang.String r7 = r0.madah
            java.lang.String r10 = "الماده : "
            java.lang.String r7 = r10.concat(r7)
            r6.setText(r7)
            android.widget.TextView r6 = r0.text_save
            java.lang.String r7 = r0.savefff
            java.lang.String r10 = "الصف : "
            java.lang.String r7 = r10.concat(r7)
            r6.setText(r7)
            r6 = 1082130432(0x40800000, float:4.0)
            r7 = 0
            android.widget.TextView r10 = r0.text_new_enter     // Catch:{ Exception -> 0x008e }
            int r11 = android.graphics.Color.parseColor(r5)     // Catch:{ Exception -> 0x008e }
            r10.setShadowLayer(r6, r7, r7, r11)     // Catch:{ Exception -> 0x008e }
        L_0x008e:
            android.widget.TextView r10 = r0.text_tarwesah     // Catch:{ Exception -> 0x0098 }
            int r5 = android.graphics.Color.parseColor(r5)     // Catch:{ Exception -> 0x0098 }
            r10.setShadowLayer(r6, r7, r7, r5)     // Catch:{ Exception -> 0x0098 }
            goto L_0x0099
        L_0x0098:
        L_0x0099:
            android.widget.TextView r5 = r0.text_save
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$114 r6 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$114
            r6.<init>()
            r5.setOnClickListener(r6)
            android.widget.TextView r5 = r0.text_madah
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$115 r6 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$115
            r6.<init>()
            r5.setOnClickListener(r6)
            android.content.SharedPreferences r5 = r0.save5
            java.lang.String r6 = r0.ID
            java.lang.String r7 = "2"
            java.lang.String r10 = r8.concat(r7)
            java.lang.String r6 = r6.concat(r10)
            java.lang.String r5 = r5.getString(r6, r9)
            boolean r5 = r5.equals(r9)
            java.lang.String r6 = "9"
            java.lang.String r10 = "8"
            java.lang.String r11 = "7"
            java.lang.String r12 = "6"
            java.lang.String r13 = "4"
            java.lang.String r14 = "3"
            java.lang.String r15 = "1"
            if (r5 == 0) goto L_0x0192
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0153 }
            r0.djcg5 = r5     // Catch:{ Exception -> 0x0153 }
            android.widget.TextView r5 = r0.text_2     // Catch:{ Exception -> 0x0153 }
            r16 = r9
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0150 }
            r17 = r8
            java.lang.String r8 = "YYYY"
            r9.<init>(r8)     // Catch:{ Exception -> 0x0157 }
            java.util.Calendar r8 = r0.djcg5     // Catch:{ Exception -> 0x0157 }
            java.util.Date r8 = r8.getTime()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = r9.format(r8)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r9 = "٠"
            r18 = r5
            java.lang.String r5 = "0"
            java.lang.String r5 = r8.replace(r9, r5)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = "١"
            java.lang.String r5 = r5.replace(r8, r15)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = "٢"
            java.lang.String r5 = r5.replace(r8, r7)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = "٣"
            java.lang.String r5 = r5.replace(r8, r14)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = "٤"
            java.lang.String r5 = r5.replace(r8, r13)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = "٥"
            java.lang.String r9 = "5"
            java.lang.String r5 = r5.replace(r8, r9)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = "٦"
            java.lang.String r5 = r5.replace(r8, r12)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = "٧"
            java.lang.String r5 = r5.replace(r8, r11)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = "٨"
            java.lang.String r5 = r5.replace(r8, r10)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = "٩"
            java.lang.String r5 = r5.replace(r8, r6)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = "/"
            java.lang.String r9 = "-"
            java.lang.String r5 = r5.replace(r8, r9)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r5 = r4.replace(r3, r5)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = r0.savefff     // Catch:{ Exception -> 0x0157 }
            java.lang.String r5 = r5.replace(r2, r8)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r8 = r0.madah     // Catch:{ Exception -> 0x0157 }
            java.lang.String r5 = r5.replace(r1, r8)     // Catch:{ Exception -> 0x0157 }
            r8 = r18
            r8.setText(r5)     // Catch:{ Exception -> 0x0157 }
            goto L_0x016e
        L_0x0150:
            r17 = r8
            goto L_0x0157
        L_0x0153:
            r17 = r8
            r16 = r9
        L_0x0157:
            android.widget.TextView r5 = r0.text_2
            java.lang.String r8 = "2024"
            java.lang.String r3 = r4.replace(r3, r8)
            java.lang.String r4 = r0.savefff
            java.lang.String r2 = r3.replace(r2, r4)
            java.lang.String r3 = r0.madah
            java.lang.String r1 = r2.replace(r1, r3)
            r5.setText(r1)
        L_0x016e:
            android.content.SharedPreferences r1 = r0.save5
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = r0.ID
            r3 = r17
            java.lang.String r4 = r3.concat(r7)
            java.lang.String r2 = r2.concat(r4)
            android.widget.TextView r4 = r0.text_2
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r4)
            r1.commit()
            goto L_0x0195
        L_0x0192:
            r3 = r8
            r16 = r9
        L_0x0195:
            android.widget.TextView r1 = r0.text_1
            r0._set_edat_text(r1, r15)
            android.widget.TextView r1 = r0.text_2
            r0._set_edat_text(r1, r7)
            android.widget.TextView r1 = r0.text_3
            r0._set_edat_text(r1, r14)
            android.widget.TextView r1 = r0.text_4
            r0._set_edat_text(r1, r13)
            android.widget.TextView r1 = r0.text_5_1
            java.lang.String r2 = "5_1"
            r0._set_edat_text(r1, r2)
            android.widget.TextView r1 = r0.text_5_2
            java.lang.String r2 = "5_2"
            r0._set_edat_text(r1, r2)
            android.widget.TextView r1 = r0.text_6
            r0._set_edat_text(r1, r12)
            android.widget.TextView r1 = r0.text_7
            r0._set_edat_text(r1, r11)
            android.widget.TextView r1 = r0.text_7_5
            r0._set_edat_text(r1, r10)
            android.widget.TextView r1 = r0.text_6_5
            r0._set_edat_text(r1, r6)
            android.widget.TextView r1 = r0.text_55
            java.lang.String r2 = "10"
            r0._set_edat_text(r1, r2)
            android.content.SharedPreferences r1 = r0.saveX
            java.lang.String r2 = r0.ID
            java.lang.String r4 = "all"
            java.lang.String r5 = r3.concat(r4)
            java.lang.String r2 = r2.concat(r5)
            r5 = r16
            java.lang.String r1 = r1.getString(r2, r5)
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0205
            android.content.SharedPreferences r1 = r0.saveX
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = r0.ID
            java.lang.String r4 = r3.concat(r4)
            java.lang.String r2 = r2.concat(r4)
            java.lang.String r4 = "[]"
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r4)
            r1.commit()
        L_0x0205:
            android.content.SharedPreferences r1 = r0.save5
            java.lang.String r2 = r0.ID
            java.lang.String r4 = "P"
            java.lang.String r6 = r3.concat(r4)
            java.lang.String r2 = r2.concat(r6)
            java.lang.String r1 = r1.getString(r2, r5)
            r0.path_image = r1
            int r1 = r1.length()
            r2 = 3
            r6 = 1024(0x400, float:1.435E-42)
            if (r1 <= r2) goto L_0x022e
            android.widget.ImageView r1 = r0.image_shear
            java.lang.String r2 = r0.path_image
            android.graphics.Bitmap r2 = com.Nasa.Soft.Exzam.Editor35.FileUtil.decodeSampleBitmapFromPath(r2, r6, r6)
            r1.setImageBitmap(r2)
            goto L_0x0266
        L_0x022e:
            android.content.SharedPreferences r1 = r0.save5
            java.lang.String r2 = r3.concat(r4)
            java.lang.String r7 = "T"
            java.lang.String r2 = r7.concat(r2)
            java.lang.String r1 = r1.getString(r2, r5)
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x024d
            android.widget.ImageView r1 = r0.image_shear
            r2 = 2131165374(0x7f0700be, float:1.7944963E38)
            r1.setImageResource(r2)
            goto L_0x0266
        L_0x024d:
            android.content.SharedPreferences r1 = r0.save5
            java.lang.String r2 = r3.concat(r4)
            java.lang.String r2 = r7.concat(r2)
            java.lang.String r1 = r1.getString(r2, r5)
            r0.path_image = r1
            android.widget.ImageView r2 = r0.image_shear
            android.graphics.Bitmap r1 = com.Nasa.Soft.Exzam.Editor35.FileUtil.decodeSampleBitmapFromPath(r1, r6, r6)
            r2.setImageBitmap(r1)
        L_0x0266:
            android.widget.ImageView r1 = r0.imageview7
            r2 = 0
            r1.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity._start_A():void");
    }

    public void _set_edat_text(final TextView textView, final String str) {
        this.Kay_ss = BuildConfig.FLAVOR;
        if (!this.save5.getString(this.ID.concat("_".concat(str)), BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            textView.setText(this.save5.getString(this.ID.concat("_".concat(str)), BuildConfig.FLAVOR));
        } else if (this.save5.getString("T".concat("_".concat(str)), BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
            this.save5.edit().putString("T".concat("_".concat(str)), textView.getText().toString()).commit();
        } else {
            textView.setText(this.save5.getString("T".concat("_".concat(str)), BuildConfig.FLAVOR));
        }
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this._dialog_tarwsah(textView, str, "w", BuildConfig.FLAVOR);
            }
        });
    }

    public void _texter(TextView textView, String str, String str2, String str3, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 44, 1.0f);
        layoutParams.setMargins(0, 0, 1, 1);
        textView.setLayoutParams(layoutParams);
        textView.setPadding(2, 2, 2, 2);
        textView.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(5, 2, i2, 0));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setTextSize(10.0f);
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
    }

    public void dioalog_zoom() {
        Bitmap createBitmap = Bitmap.createBitmap(this.linear_pdf_0.getWidth(), this.linear_pdf_0.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (this.position_number == 0.0d) {
            this.linear_pdf_0_5.draw(canvas);
        } else {
            this.linear_pdf_0.draw(canvas);
        }
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
        textView.setText("عرض قابل للتكبير");
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
        imageView4.setImageResource(R.drawable.nasa_56);
        imageView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
    }

    public void _dialog_size_page() {
        final AlertDialog create = new AlertDialog.Builder(this).create();
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        int i2 = -1;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        int i3 = 17;
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout2.setPadding(8, 8, 8, 8);
        linearLayout2.setBackgroundColor(-1);
        linearLayout.addView(linearLayout2);
        TextView textView = new TextView(getApplicationContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        textView.setPadding(8, 8, 8, 8);
        textView.setBackgroundColor(-460552);
        textView.setText("تغير حجم الورقه بما يناسب جوالك");
        textView.setTextSize(16.0f);
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        linearLayout2.addView(textView);
        try {
            this.size_page = Double.parseDouble(this.save.getString("Size_page", BuildConfig.FLAVOR));
        } catch (Exception unused) {
            this.size_page = 1400.0d;
        }
        this.fort = 800.0d;
        int i4 = 0;
        while (i4 < 20) {
            RadioButton radioButton = new RadioButton(getApplicationContext());
            radioButton.setLayoutParams(new LinearLayout.LayoutParams(i2, 60, 0.0f));
            radioButton.setPadding(0, 0, 0, 0);
            radioButton.setText(" Size = ( " + ((int) this.fort) + " × " + ((int) (this.fort / 0.707d)) + " ) ");
            radioButton.setTextSize(13.0f);
            radioButton.setTextColor(ViewCompat.MEASURED_STATE_MASK);
            radioButton.setGravity(i3);
            linearLayout2.addView(radioButton);
            final double d = this.fort;
            if (d == this.size_page) {
                radioButton.setChecked(true);
            } else {
                radioButton.setChecked(false);
            }
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ExzamViewActivity.this.save.edit().putString("Size_page", String.valueOf((long) d)).commit();
                    create.dismiss();
                    Intent intent = new Intent();
                    intent.setClass(ExzamViewActivity.this.getApplicationContext(), ExzamViewActivity.class);
                    intent.putExtra(DatabaseHelper.COL_0, ExzamViewActivity.this.ID);
                    intent.putExtra("page", String.valueOf((long) ExzamViewActivity.this.position_number));
                    intent.setFlags(67108864);
                    ExzamViewActivity.this.startActivity(intent);
                    ExzamViewActivity.this.finish();
                }
            });
            this.fort += 100.0d;
            i4++;
            i2 = -1;
            i3 = 17;
        }
        create.setView(linearLayout);
        create.show();
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        create.getWindow().setLayout(380, -2);
    }

    public void _dialog_tarwsah(TextView textView, String str, String str2, String str3) {
        final AlertDialog alertDialog;
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
        editText.setGravity(7);
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
        AlertDialog alertDialog2 = create;
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
        ImageView imageView3 = imageView2;
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
            textView3.setText("هل تريد حفظ التعديلات ؟");
            textView2.setText("تعديل //");
            editText.setText(textView.getText().toString());
            imageView.setImageResource(R.drawable.ic_select_all_black);
            imageView.setColorFilter(SupportMenu.CATEGORY_MASK, PorterDuff.Mode.MULTIPLY);
            try {
                editText.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            } catch (Exception unused2) {
            }
            editText.setHint("إكتب");
            imageView3.setVisibility(8);
            AnonymousClass138 r0 = new TimerTask() {
                public void run() {
                    ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                    final EditText editText = editText;
                    exzamViewActivity.runOnUiThread(new Runnable() {
                        public void run() {
                            editText.setEnabled(true);
                            editText.requestFocus();
                            ((InputMethodManager) ExzamViewActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                            EditText editText = editText;
                            editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                            ExzamViewActivity access$0 = ExzamViewActivity.this;
                            final EditText editText2 = editText;
                            access$0.timer_5 = new TimerTask() {
                                public void run() {
                                    ExzamViewActivity access$0 = ExzamViewActivity.this;
                                    final EditText editText = editText2;
                                    access$0.runOnUiThread(new Runnable() {
                                        public void run() {
                                            editText.setEnabled(true);
                                            editText.requestFocus();
                                            ((InputMethodManager) ExzamViewActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                                            EditText editText = editText;
                                            editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                                        }
                                    });
                                }
                            };
                            ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 100);
                        }
                    });
                }
            };
            this.timer_5 = r0;
            this._timer.schedule(r0, 54);
            alertDialog = alertDialog2;
            try {
                imageView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        editText.requestFocus();
                        editText.setShowSoftInputOnFocus(false);
                        editText.setEnabled(false);
                        alertDialog.dismiss();
                    }
                });
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
            alertDialog = alertDialog2;
        }
        final TextView textView6 = textView;
        final EditText editText2 = editText;
        EditText editText3 = editText;
        final String str4 = str2;
        final String str5 = str;
        final AlertDialog alertDialog3 = alertDialog;
        textView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    textView6.setText(editText2.getText().toString());
                    if (str4.equals("1")) {
                        ExzamViewActivity.this.save.edit().putString(str5, editText2.getText().toString()).commit();
                    } else {
                        ExzamViewActivity.this.save5.edit().putString(ExzamViewActivity.this.ID.concat("_".concat(str5)), editText2.getText().toString()).commit();
                        ExzamViewActivity.this.save5.edit().putString("T".concat("_".concat(str5)), editText2.getText().toString()).commit();
                        ExzamViewActivity.this.save5.edit().putString("T".concat("_".concat("2")), BuildConfig.FLAVOR).commit();
                    }
                    editText2.requestFocus();
                    editText2.setShowSoftInputOnFocus(false);
                    editText2.setEnabled(false);
                    alertDialog3.dismiss();
                } catch (Exception unused) {
                }
            }
        });
        try {
            editText3.setEnabled(true);
            editText3.requestFocus();
            ((InputMethodManager) getSystemService("input_method")).showSoftInput(editText3, 1);
            editText3.setSelection(editText3.getText().toString().length(), editText3.getText().toString().length());
        } catch (Exception unused5) {
        }
        alertDialog.setView(linearLayout);
        alertDialog.show();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        alertDialog.getWindow().setLayout(-2, -2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(25:72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|106) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0486 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x04e2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dialog_nmothag(java.lang.String r37, java.lang.String r38, int r39, int r40, int r41) {
        /*
            r36 = this;
            r9 = r36
            java.lang.String r10 = "2"
            java.lang.String r11 = "0"
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r9.List_all
            r0.clear()
            android.content.SharedPreferences r0 = r9.save
            java.lang.String r1 = "n750"
            java.lang.String r12 = ""
            java.lang.String r0 = r0.getString(r1, r12)
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L_0x0037
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            android.content.SharedPreferences r2 = r9.save
            java.lang.String r1 = r2.getString(r1, r12)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$141 r2 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$141
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            java.lang.Object r0 = r0.fromJson((java.lang.String) r1, (java.lang.reflect.Type) r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r9.List_all = r0
        L_0x0037:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r9)
            android.app.AlertDialog r13 = r0.create()
            android.widget.LinearLayout r14 = new android.widget.LinearLayout
            android.content.Context r0 = r36.getApplicationContext()
            r14.<init>(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r15 = -1
            r0.<init>(r15, r15)
            r14.setLayoutParams(r0)
            r8 = 1
            r14.setOrientation(r8)
            r7 = 17
            r14.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r6, r6, r5)
            r0.setMargins(r8, r8, r8, r8)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r0 = r36.getApplicationContext()
            r4.<init>(r0)
            r4.setOrientation(r8)
            android.widget.ScrollView r0 = new android.widget.ScrollView
            android.content.Context r1 = r36.getApplicationContext()
            r0.<init>(r1)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r1 = r36.getApplicationContext()
            r3.<init>(r1)
            r3.setOrientation(r8)
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r1 = r36.getApplicationContext()
            r2.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r6 = 80
            r8 = 0
            r1.<init>(r15, r6, r8)
            r2.setLayoutParams(r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setTextColor(r1)
            r8 = 1097859072(0x41700000, float:15.0)
            r2.setTextSize(r8)
            java.lang.String r8 = "نموذجات محفوظه سابقا"
            r2.setText(r8)
            r2.setGravity(r7)
            r3.addView(r2)
            r0.addView(r4)
            r3.addView(r0)
            r8 = 0
            r3.setBackgroundColor(r8)
            r0 = 21
            r3.setGravity(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r6, r6, r5)
            r6 = 2
            r0.setMargins(r6, r6, r6, r6)
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r5 = r9.List_all
            int r5 = r5.size()
            r17 = 1
            int r5 = r5 + -1
        L_0x00d2:
            r7 = -657931(0xfffffffffff5f5f5, float:NaN)
            if (r5 > r15) goto L_0x0103
            r14.addView(r3)
            r13.setView(r14)
            r13.show()
            android.view.Window r0 = r13.getWindow()
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r3.<init>(r8)
            r0.setBackgroundDrawable(r3)
            android.view.Window r0 = r13.getWindow()
            r3 = -2
            r0.setLayout(r3, r3)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$155 r0 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$155
            r0.<init>()
            r3 = 20
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r3, r6, r1, r7)
            r2.setBackground(r0)
            return
        L_0x0103:
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            android.content.Context r1 = r36.getApplicationContext()
            r7.<init>(r1)
            r7.setOrientation(r8)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r8 = r36.getApplicationContext()
            r1.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r25 = r2
            r2 = -2
            r6 = 0
            r8.<init>(r2, r15, r6)
            r6 = 8
            r2 = 2
            r8.setMargins(r6, r6, r2, r6)
            r1.setLayoutParams(r8)
            r2 = 1
            r1.setOrientation(r2)
            r1.setBackgroundColor(r15)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            android.content.Context r6 = r36.getApplicationContext()
            r8.<init>(r6)
            r8.setOrientation(r2)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            android.content.Context r15 = r36.getApplicationContext()
            r6.<init>(r15)
            r6.setOrientation(r2)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r27 = r3
            double r2 = r9.w
            int r2 = (int) r2
            r28 = r4
            double r3 = r9.h
            int r3 = (int) r3
            r4 = 0
            r15.<init>(r2, r3, r4)
            r2 = 1
            r15.setMargins(r2, r2, r2, r2)
            r8.setLayoutParams(r15)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r4 = r36.getApplicationContext()
            r3.<init>(r4)
            r3.setOrientation(r2)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r15 = r36.getApplicationContext()
            r4.<init>(r15)
            r4.setOrientation(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r29 = r1
            r1 = -1
            r15 = 0
            r2.<init>(r1, r1, r15)
            r3.setLayoutParams(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r1, r1, r15)
            r4.setLayoutParams(r2)
            r2 = 18
            r8.setPadding(r2, r2, r2, r2)
            r2 = 6
            r3.setPadding(r2, r2, r2, r2)
            r15 = 8
            r4.setPadding(r15, r15, r15, r15)
            r6.setBackgroundColor(r1)
            r9.starr50(r8, r6)
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9._taster(r3, r4, r1)     // Catch:{ Exception -> 0x01a5 }
        L_0x01a5:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r2 = r36.getApplicationContext()
            r1.<init>(r2)
            r2 = 0
            r1.setOrientation(r2)
            r15 = 17
            r1.setGravity(r15)
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r30 = r6
            r31 = r7
            r6 = 0
            r7 = -1
            r15.<init>(r7, r7, r6)
            r15.setMargins(r2, r2, r2, r2)
            r1.setLayoutParams(r15)
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r9.List_all     // Catch:{ Exception -> 0x020c }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x020c }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x020c }
            java.lang.Object r2 = r2.get(r11)     // Catch:{ Exception -> 0x020c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x020c }
            java.lang.String r6 = "1"
            boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x020c }
            if (r2 == 0) goto L_0x0219
            android.widget.TextView r2 = new android.widget.TextView     // Catch:{ Exception -> 0x020c }
            android.content.Context r6 = r36.getApplicationContext()     // Catch:{ Exception -> 0x020c }
            r2.<init>(r6)     // Catch:{ Exception -> 0x020c }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r6 = r9.List_all     // Catch:{ Exception -> 0x020c }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x020c }
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch:{ Exception -> 0x020c }
            java.lang.String r7 = "20"
            java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x020c }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x020c }
            r2.setText(r6)     // Catch:{ Exception -> 0x020c }
            double r6 = (double) r5     // Catch:{ Exception -> 0x020c }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r15 = r9.List_all     // Catch:{ Exception -> 0x020c }
            r9._Creat_text(r2, r6, r15)     // Catch:{ Exception -> 0x020c }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r15 = r9.List_all     // Catch:{ Exception -> 0x020c }
            r9._Creat_backgrund(r2, r6, r15)     // Catch:{ Exception -> 0x020c }
            r1.addView(r2)     // Catch:{ Exception -> 0x020c }
        L_0x020c:
            r34 = r0
            r33 = r13
            r32 = r14
        L_0x0212:
            r7 = 17
        L_0x0214:
            r13 = -1
        L_0x0215:
            r14 = 1
        L_0x0216:
            r15 = 2
            goto L_0x0521
        L_0x0219:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r9.List_all     // Catch:{ Exception -> 0x020c }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x020c }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x020c }
            java.lang.Object r2 = r2.get(r11)     // Catch:{ Exception -> 0x020c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x020c }
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x020c }
            if (r2 == 0) goto L_0x0247
            android.widget.ImageView r2 = new android.widget.ImageView     // Catch:{ Exception -> 0x020c }
            android.content.Context r6 = r36.getApplicationContext()     // Catch:{ Exception -> 0x020c }
            r2.<init>(r6)     // Catch:{ Exception -> 0x020c }
            double r6 = (double) r5     // Catch:{ Exception -> 0x020c }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r15 = r9.List_all     // Catch:{ Exception -> 0x020c }
            r9._Creat_backgrund(r2, r6, r15)     // Catch:{ Exception -> 0x020c }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r15 = r9.List_all     // Catch:{ Exception -> 0x020c }
            r9._Creat_image(r2, r6, r15)     // Catch:{ Exception -> 0x020c }
            r1.addView(r2)     // Catch:{ Exception -> 0x020c }
            goto L_0x020c
        L_0x0247:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r9.List_all     // Catch:{ Exception -> 0x020c }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x020c }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x020c }
            java.lang.Object r2 = r2.get(r11)     // Catch:{ Exception -> 0x020c }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x020c }
            java.lang.String r6 = "3"
            boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x020c }
            if (r2 == 0) goto L_0x036f
            android.widget.LinearLayout r2 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x020c }
            android.content.Context r6 = r36.getApplicationContext()     // Catch:{ Exception -> 0x020c }
            r2.<init>(r6)     // Catch:{ Exception -> 0x020c }
            r6 = 1
            r2.setOrientation(r6)     // Catch:{ Exception -> 0x020c }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$142 r6 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$142     // Catch:{ Exception -> 0x020c }
            r6.<init>()     // Catch:{ Exception -> 0x020c }
            r32 = r14
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r14 = -1
            r15 = 2
            android.graphics.drawable.GradientDrawable r6 = r6.getIns(r15, r15, r7, r14)     // Catch:{ Exception -> 0x0365 }
            r2.setBackground(r6)     // Catch:{ Exception -> 0x0365 }
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x0365 }
            r7 = 400(0x190, float:5.6E-43)
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = -2
            r6.<init>(r7, r15, r14)     // Catch:{ Exception -> 0x02e0 }
            r7 = 2
            r6.setMargins(r7, r7, r7, r7)     // Catch:{ Exception -> 0x02e0 }
            r2.setLayoutParams(r6)     // Catch:{ Exception -> 0x02e0 }
            android.widget.LinearLayout r6 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x02e0 }
            android.content.Context r7 = r36.getApplicationContext()     // Catch:{ Exception -> 0x02e0 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x02e0 }
            r7 = 1
            r6.setOrientation(r7)     // Catch:{ Exception -> 0x02e0 }
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x02e0 }
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = -2
            r7.<init>(r15, r15, r14)     // Catch:{ Exception -> 0x02e0 }
            r14 = 2
            r7.setMargins(r14, r14, r14, r14)     // Catch:{ Exception -> 0x02e0 }
            r6.setLayoutParams(r7)     // Catch:{ Exception -> 0x02e0 }
            com.google.gson.Gson r7 = new com.google.gson.Gson     // Catch:{ Exception -> 0x02e0 }
            r7.<init>()     // Catch:{ Exception -> 0x02e0 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r14 = r9.List_all     // Catch:{ Exception -> 0x02e0 }
            java.lang.Object r14 = r14.get(r5)     // Catch:{ Exception -> 0x02e0 }
            java.util.HashMap r14 = (java.util.HashMap) r14     // Catch:{ Exception -> 0x02e0 }
            java.lang.Object r14 = r14.get(r10)     // Catch:{ Exception -> 0x02e0 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x02e0 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$143 r15 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$143     // Catch:{ Exception -> 0x02e0 }
            r15.<init>()     // Catch:{ Exception -> 0x02e0 }
            java.lang.reflect.Type r15 = r15.getType()     // Catch:{ Exception -> 0x02e0 }
            java.lang.Object r7 = r7.fromJson((java.lang.String) r14, (java.lang.reflect.Type) r15)     // Catch:{ Exception -> 0x02e0 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ Exception -> 0x02e0 }
            r9.List_ch_PD = r7     // Catch:{ Exception -> 0x02e0 }
            r7 = 0
        L_0x02d2:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r14 = r9.List_ch_PD     // Catch:{ Exception -> 0x02e0 }
            int r14 = r14.size()     // Catch:{ Exception -> 0x02e0 }
            if (r7 < r14) goto L_0x02e6
            r2.addView(r6)     // Catch:{ Exception -> 0x02e0 }
            r1.addView(r2)     // Catch:{ Exception -> 0x02e0 }
        L_0x02e0:
            r34 = r0
            r33 = r13
            goto L_0x0212
        L_0x02e6:
            android.widget.LinearLayout r14 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x02e0 }
            android.content.Context r15 = r36.getApplicationContext()     // Catch:{ Exception -> 0x02e0 }
            r14.<init>(r15)     // Catch:{ Exception -> 0x02e0 }
            r15 = 0
            r14.setOrientation(r15)     // Catch:{ Exception -> 0x02e0 }
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x02e0 }
            r34 = r0
            r19 = r2
            r33 = r13
            r0 = -1
            r2 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r15.<init>(r0, r2, r13)     // Catch:{ Exception -> 0x0212 }
            r0 = 0
            r15.setMargins(r0, r0, r0, r0)     // Catch:{ Exception -> 0x0212 }
            r6.setLayoutParams(r15)     // Catch:{ Exception -> 0x0212 }
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0212 }
            r0.<init>()     // Catch:{ Exception -> 0x0212 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r9.List_ch_PD     // Catch:{ Exception -> 0x0212 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ Exception -> 0x0212 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x0212 }
            java.lang.Object r2 = r2.get(r10)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0212 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$144 r15 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$144     // Catch:{ Exception -> 0x0212 }
            r15.<init>()     // Catch:{ Exception -> 0x0212 }
            java.lang.reflect.Type r15 = r15.getType()     // Catch:{ Exception -> 0x0212 }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r2, (java.lang.reflect.Type) r15)     // Catch:{ Exception -> 0x0212 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0212 }
            r9.List_ch_PL = r0     // Catch:{ Exception -> 0x0212 }
            r0 = 0
        L_0x0330:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r9.List_ch_PL     // Catch:{ Exception -> 0x0212 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x0212 }
            if (r0 < r2) goto L_0x0344
            r6.addView(r14)     // Catch:{ Exception -> 0x0212 }
            int r7 = r7 + 1
            r2 = r19
            r13 = r33
            r0 = r34
            goto L_0x02d2
        L_0x0344:
            android.widget.TextView r2 = new android.widget.TextView     // Catch:{ Exception -> 0x0212 }
            android.content.Context r15 = r36.getApplicationContext()     // Catch:{ Exception -> 0x0212 }
            r2.<init>(r15)     // Catch:{ Exception -> 0x0212 }
            r21 = r14
            double r13 = (double) r0     // Catch:{ Exception -> 0x0212 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r15 = r9.List_ch_PL     // Catch:{ Exception -> 0x0212 }
            r9._Creat_text(r2, r13, r15)     // Catch:{ Exception -> 0x0212 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r15 = r9.List_ch_PL     // Catch:{ Exception -> 0x0212 }
            r9._Creat_backgrund(r2, r13, r15)     // Catch:{ Exception -> 0x0212 }
            r13 = r21
            r13.addView(r2)     // Catch:{ Exception -> 0x0212 }
            int r0 = r0 + 1
            r14 = r13
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0330
        L_0x0365:
            r34 = r0
            r33 = r13
            r7 = 17
            r13 = -1
            r14 = 1
            goto L_0x0521
        L_0x036f:
            r34 = r0
            r33 = r13
            r32 = r14
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r9.List_all     // Catch:{ Exception -> 0x0212 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x0212 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0212 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0212 }
            java.lang.String r2 = "4"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0212 }
            if (r0 == 0) goto L_0x0400
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x0212 }
            android.content.Context r6 = r36.getApplicationContext()     // Catch:{ Exception -> 0x0212 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0212 }
            r6 = 1
            r0.setOrientation(r6)     // Catch:{ Exception -> 0x0212 }
            android.widget.LinearLayout r6 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x0212 }
            android.content.Context r7 = r36.getApplicationContext()     // Catch:{ Exception -> 0x0212 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0212 }
            r7 = 0
            r6.setOrientation(r7)     // Catch:{ Exception -> 0x0212 }
            android.widget.LinearLayout r13 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x0212 }
            android.content.Context r14 = r36.getApplicationContext()     // Catch:{ Exception -> 0x0212 }
            r13.<init>(r14)     // Catch:{ Exception -> 0x0212 }
            r13.setOrientation(r7)     // Catch:{ Exception -> 0x0212 }
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x0212 }
            r14 = 12
            r2 = -1
            r15 = 0
            r7.<init>(r2, r14, r15)     // Catch:{ Exception -> 0x0212 }
            r14 = 1
            r7.setMargins(r14, r14, r14, r14)     // Catch:{ Exception -> 0x03fb }
            r0.setLayoutParams(r7)     // Catch:{ Exception -> 0x03fb }
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x03fb }
            r14 = 4
            r7.<init>(r2, r14, r15)     // Catch:{ Exception -> 0x0212 }
            r2 = 1
            r14 = 0
            r7.setMargins(r14, r2, r14, r14)     // Catch:{ Exception -> 0x0212 }
            r6.setLayoutParams(r7)     // Catch:{ Exception -> 0x0212 }
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x0212 }
            r2 = 2
            r14 = -1
            r7.<init>(r14, r2, r15)     // Catch:{ Exception -> 0x0212 }
            r2 = 0
            r14 = 1
            r7.setMargins(r2, r14, r2, r14)     // Catch:{ Exception -> 0x03fb }
            r13.setLayoutParams(r7)     // Catch:{ Exception -> 0x0212 }
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setBackgroundColor(r7)     // Catch:{ Exception -> 0x0212 }
            r13.setBackgroundColor(r7)     // Catch:{ Exception -> 0x0212 }
            r0.setBackgroundColor(r2)     // Catch:{ Exception -> 0x0212 }
            r2 = 17
            r0.setGravity(r2)     // Catch:{ Exception -> 0x0212 }
            r0.addView(r6)     // Catch:{ Exception -> 0x0212 }
            r0.addView(r13)     // Catch:{ Exception -> 0x0212 }
            r1.addView(r0)     // Catch:{ Exception -> 0x0212 }
            goto L_0x0212
        L_0x03fb:
            r7 = 17
            r13 = -1
            goto L_0x0216
        L_0x0400:
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r9.List_all     // Catch:{ Exception -> 0x0212 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x0212 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0212 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0212 }
            java.lang.String r2 = "6"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0212 }
            if (r0 == 0) goto L_0x0212
            android.widget.LinearLayout r0 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x0212 }
            android.content.Context r2 = r36.getApplicationContext()     // Catch:{ Exception -> 0x0212 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0212 }
            r2 = 1
            r0.setOrientation(r2)     // Catch:{ Exception -> 0x0212 }
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x0212 }
            r6 = 0
            r7 = -2
            r2.<init>(r7, r7, r6)     // Catch:{ Exception -> 0x0212 }
            r13 = 0
            r2.setMargins(r13, r13, r13, r13)     // Catch:{ Exception -> 0x0212 }
            r0.setLayoutParams(r2)     // Catch:{ Exception -> 0x0212 }
            android.widget.LinearLayout r2 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x0212 }
            android.content.Context r6 = r36.getApplicationContext()     // Catch:{ Exception -> 0x0212 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0212 }
            r2.setOrientation(r13)     // Catch:{ Exception -> 0x0212 }
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x0212 }
            r7 = 4
            r14 = 0
            r15 = -1
            r6.<init>(r15, r7, r14)     // Catch:{ Exception -> 0x0212 }
            r6.setMargins(r13, r13, r13, r13)     // Catch:{ Exception -> 0x0212 }
            r2.setLayoutParams(r6)     // Catch:{ Exception -> 0x0212 }
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setBackgroundColor(r6)     // Catch:{ Exception -> 0x0212 }
            android.widget.TextView r6 = new android.widget.TextView     // Catch:{ Exception -> 0x0212 }
            android.content.Context r7 = r36.getApplicationContext()     // Catch:{ Exception -> 0x0212 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0212 }
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x0212 }
            r13 = -1
            r14 = 0
            r15 = -2
            r7.<init>(r13, r15, r14)     // Catch:{ Exception -> 0x051d }
            r6.setLayoutParams(r7)     // Catch:{ Exception -> 0x0212 }
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setTextColor(r7)     // Catch:{ Exception -> 0x0212 }
            r7 = 1096810496(0x41600000, float:14.0)
            r6.setTextSize(r7)     // Catch:{ Exception -> 0x0212 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r13 = r9.List_all     // Catch:{ Exception -> 0x0486 }
            java.lang.Object r13 = r13.get(r5)     // Catch:{ Exception -> 0x0486 }
            java.util.HashMap r13 = (java.util.HashMap) r13     // Catch:{ Exception -> 0x0486 }
            java.lang.String r14 = "50"
            java.lang.Object r13 = r13.get(r14)     // Catch:{ Exception -> 0x0486 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0486 }
            r6.setText(r13)     // Catch:{ Exception -> 0x0486 }
            goto L_0x0489
        L_0x0486:
            r6.setText(r12)     // Catch:{ Exception -> 0x0212 }
        L_0x0489:
            r13 = 17
            r6.setGravity(r13)     // Catch:{ Exception -> 0x0212 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$145 r13 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$145     // Catch:{ Exception -> 0x0212 }
            r13.<init>()     // Catch:{ Exception -> 0x0212 }
            r6.setOnClickListener(r13)     // Catch:{ Exception -> 0x0212 }
            r0.addView(r6)     // Catch:{ Exception -> 0x0212 }
            r0.addView(r2)     // Catch:{ Exception -> 0x0212 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$146 r2 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$146     // Catch:{ Exception -> 0x0212 }
            r2.<init>()     // Catch:{ Exception -> 0x0212 }
            r7 = 1
            r13 = -657931(0xfffffffffff5f5f5, float:NaN)
            r14 = 2
            r15 = -1
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r14, r7, r13, r15)     // Catch:{ Exception -> 0x0212 }
            r6.setBackground(r2)     // Catch:{ Exception -> 0x0212 }
            android.widget.TextView r2 = new android.widget.TextView     // Catch:{ Exception -> 0x0212 }
            android.content.Context r7 = r36.getApplicationContext()     // Catch:{ Exception -> 0x0212 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x0212 }
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x0212 }
            r13 = 0
            r14 = -2
            r15 = -1
            r7.<init>(r15, r14, r13)     // Catch:{ Exception -> 0x0212 }
            r2.setLayoutParams(r7)     // Catch:{ Exception -> 0x0212 }
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setTextColor(r7)     // Catch:{ Exception -> 0x0212 }
            r15 = 1096810496(0x41600000, float:14.0)
            r2.setTextSize(r15)     // Catch:{ Exception -> 0x0212 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r15 = r9.List_all     // Catch:{ Exception -> 0x04e2 }
            java.lang.Object r15 = r15.get(r5)     // Catch:{ Exception -> 0x04e2 }
            java.util.HashMap r15 = (java.util.HashMap) r15     // Catch:{ Exception -> 0x04e2 }
            java.lang.String r7 = "51"
            java.lang.Object r7 = r15.get(r7)     // Catch:{ Exception -> 0x04e2 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x04e2 }
            r2.setText(r7)     // Catch:{ Exception -> 0x04e2 }
            goto L_0x04e5
        L_0x04e2:
            r2.setText(r12)     // Catch:{ Exception -> 0x0212 }
        L_0x04e5:
            r7 = 17
            r2.setGravity(r7)     // Catch:{ Exception -> 0x0214 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$147 r7 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$147     // Catch:{ Exception -> 0x0212 }
            r7.<init>()     // Catch:{ Exception -> 0x0212 }
            r2.setOnClickListener(r7)     // Catch:{ Exception -> 0x0212 }
            r0.addView(r2)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r7 = "البسط ....."
            r6.setHint(r7)     // Catch:{ Exception -> 0x0212 }
            java.lang.String r6 = "المقام ....."
            r2.setHint(r6)     // Catch:{ Exception -> 0x0212 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$148 r6 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$148     // Catch:{ Exception -> 0x0212 }
            r6.<init>()     // Catch:{ Exception -> 0x0212 }
            r7 = -657931(0xfffffffffff5f5f5, float:NaN)
            r13 = -1
            r14 = 1
            r15 = 2
            android.graphics.drawable.GradientDrawable r6 = r6.getIns(r15, r14, r7, r13)     // Catch:{ Exception -> 0x051a }
            r2.setBackground(r6)     // Catch:{ Exception -> 0x051a }
            r7 = 17
            r0.setGravity(r7)     // Catch:{ Exception -> 0x0521 }
            r1.addView(r0)     // Catch:{ Exception -> 0x0521 }
            goto L_0x0521
        L_0x051a:
            r7 = 17
            goto L_0x0521
        L_0x051d:
            r7 = 17
            goto L_0x0215
        L_0x0521:
            r4.addView(r1)
            r3.addView(r4)
            r8.addView(r3)
            android.widget.ImageView r6 = new android.widget.ImageView
            android.content.Context r0 = r36.getApplicationContext()
            r6.<init>(r0)
            r0 = r34
            r6.setLayoutParams(r0)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r6.setScaleType(r1)
            r1 = 2131165407(0x7f0700df, float:1.794503E38)
            r6.setImageResource(r1)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$149 r4 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$149
            r3 = r0
            r0 = r4
            r2 = r29
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r36
            r13 = r2
            r19 = r25
            r2 = r5
            r15 = r3
            r14 = r27
            r3 = r37
            r21 = r10
            r22 = r11
            r10 = r28
            r11 = r4
            r4 = r38
            r25 = r12
            r27 = 1065353216(0x3f800000, float:1.0)
            r12 = r5
            r5 = r41
            r16 = r10
            r28 = r14
            r14 = 8
            r24 = -2
            r26 = 2
            r10 = r6
            r6 = r40
            r14 = r31
            r7 = r39
            r35 = r8
            r18 = 0
            r20 = 0
            r23 = 1
            r8 = r33
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10.setOnClickListener(r11)
            r13.addView(r10)
            android.widget.ImageView r0 = new android.widget.ImageView
            android.content.Context r1 = r36.getApplicationContext()
            r0.<init>(r1)
            r0.setLayoutParams(r15)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r0.setScaleType(r1)
            r1 = 2131165414(0x7f0700e6, float:1.7945044E38)
            r0.setImageResource(r1)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$150 r1 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$150
            r2 = r33
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            r13.addView(r0)
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r3 = r36.getApplicationContext()
            r1.<init>(r3)
            r1.setLayoutParams(r15)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r3)
            r3 = 2131165378(0x7f0700c2, float:1.7944971E38)
            r1.setImageResource(r3)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$151 r3 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$151
            r3.<init>(r2)
            r1.setOnClickListener(r3)
            r13.addView(r1)
            android.widget.ImageView r3 = new android.widget.ImageView
            android.content.Context r4 = r36.getApplicationContext()
            r3.<init>(r4)
            r3.setLayoutParams(r15)
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER
            r3.setScaleType(r4)
            r4 = 2131165381(0x7f0700c5, float:1.7944978E38)
            r3.setImageResource(r4)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$152 r4 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$152
            r4.<init>(r12, r2, r14)
            r3.setOnClickListener(r4)
            r13.addView(r3)
            r3 = 8
            r1.setVisibility(r3)
            r0.setVisibility(r3)
            r1 = r30
            r0 = r35
            r1.addView(r0)
            r14.addView(r1)
            r14.addView(r13)
            r1 = r16
            r1.addView(r14)
            r13.setPadding(r3, r3, r3, r3)
            r3 = 17
            r14.setGravity(r3)
            r1.setGravity(r3)
            r4 = r28
            r4.setGravity(r3)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$153 r5 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$153
            r5.<init>()
            r0.setOnClickListener(r5)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$154 r0 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$154
            r0.<init>(r2)
            r14.setOnClickListener(r0)
            int r5 = r12 + -1
            r13 = r2
            r3 = r4
            r0 = r15
            r2 = r19
            r10 = r21
            r11 = r22
            r12 = r25
            r14 = r32
            r6 = 2
            r8 = 0
            r15 = -1
            r4 = r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x00d2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.dialog_nmothag(java.lang.String, java.lang.String, int, int, int):void");
    }

    public void starr50(LinearLayout linearLayout, LinearLayout linearLayout2) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = (float) (((double) ((float) displayMetrics.widthPixels)) * 0.8d);
        this.w = 1200.0d;
        this.h = 500.0d;
        double d = (double) f;
        try {
            this.scol = d / 1200.0d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.w, (int) this.h, 0.0f);
            layoutParams.setMargins(1, 1, 1, 1);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setScaleX((float) (d / this.w));
            linearLayout.setScaleY((float) (d / this.w));
            linearLayout.setTranslationX(0.0f);
            linearLayout.setTranslationY(0.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) f, (int) (this.h * this.scol), 0.0f);
            layoutParams2.setMargins(1, 8, 1, 8);
            linearLayout2.setLayoutParams(layoutParams2);
            linearLayout2.setGravity(17);
        } catch (Exception unused) {
        }
    }

    public void _taster(View view, View view2, double d) {
        String valueOf = String.valueOf((long) d);
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

    public LinearLayout chart(int i2, int i3, int i4) {
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        layoutParams.setMargins(2, 2, 2, 2);
        linearLayout.setLayoutParams(layoutParams);
        try {
            this.List_ch_PD = (ArrayList) new Gson().fromJson(this.List_startMap.get(i2).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
            }.getType());
        } catch (Exception unused) {
            this.List_ch_PD.clear();
        }
        for (int i5 = 0; i5 < this.List_ch_PD.size(); i5++) {
            LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
            linearLayout2.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
            layoutParams2.setMargins(0, 0, 0, 0);
            linearLayout.setLayoutParams(layoutParams2);
            try {
                this.List_ch_PL = (ArrayList) new Gson().fromJson(this.List_ch_PD.get(i5).get("2").toString(), new TypeToken<ArrayList<HashMap<String, Object>>>() {
                }.getType());
                for (int i6 = 0; i6 < this.List_ch_PL.size(); i6++) {
                    TextView textView = new TextView(getApplicationContext());
                    double d = (double) i6;
                    _Creat_text(textView, d, this.List_ch_PL);
                    _Creat_backgrund(textView, d, this.List_ch_PL);
                    linearLayout2.addView(textView);
                }
            } catch (Exception unused2) {
                this.List_PL.clear();
            }
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    public void _go_beak() {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), HomeActivity.class);
        startActivity(intent);
        finish();
    }

    public void _dialog_mark(TextView textView, double d, String str, ArrayList<HashMap<String, Object>> arrayList) {
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
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        linearLayout3.addView(imageView);
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 0.0f));
        textView2.setTextColor(-1499549);
        textView2.setTextSize(14.0f);
        textView2.setText(" ");
        textView2.setGravity(17);
        linearLayout3.addView(textView2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        layoutParams5.setMargins(2, 2, 2, 2);
        textView2.setLayoutParams(layoutParams5);
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
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, 400, 1.0f);
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
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams9.setMargins(0, 8, 8, 0);
        linearLayout7.setLayoutParams(layoutParams9);
        TextView textView4 = new TextView(getApplicationContext());
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
        textView4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView5 = new TextView(getApplicationContext());
        textView5.setTextColor(-59580);
        textView5.setTextSize(15.0f);
        textView5.setText("ok");
        textView5.setGravity(17);
        linearLayout7.addView(textView5);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(200, 75, 1.0f);
        layoutParams10.setMargins(10, 1, 1, 10);
        textView5.setLayoutParams(layoutParams10);
        textView4.setLayoutParams(layoutParams10);
        AlertDialog alertDialog = create;
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
        editText.setPadding(8, 8, 8, 8);
        editText.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -6381922, -1));
        editText.setText(textView.getText().toString());
        textView2.setText("☆السؤال&& الدرجه☆");
        editText.setHint("إكتب .......");
        imageView.setImageResource(R.drawable.o91_3_7);
        editText.setGravity(49);
        editText.setTextSize(14.0f);
        final TextView textView6 = textView;
        final EditText editText2 = editText;
        final EditText editText3 = editText;
        final double d2 = d;
        final String str2 = str;
        final AlertDialog alertDialog2 = alertDialog;
        textView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                textView6.setText(editText2.getText().toString());
                ((HashMap) ExzamViewActivity.this.List_map.get((int) d2)).put(str2, editText2.getText().toString());
                ExzamViewActivity.this.saveX.edit().putString(ExzamViewActivity.this.ID.concat("_".concat("all")), new Gson().toJson((Object) ExzamViewActivity.this.List_map)).commit();
                SketchwareUtil.showMessage(ExzamViewActivity.this.getApplicationContext(), " تم بنجاح");
                editText2.requestFocus();
                editText2.setShowSoftInputOnFocus(false);
                editText2.setEnabled(false);
                alertDialog2.dismiss();
            }
        });
        final AlertDialog alertDialog3 = alertDialog;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                editText3.requestFocus();
                editText3.setShowSoftInputOnFocus(false);
                editText3.setEnabled(false);
                alertDialog3.dismiss();
            }
        });
        AnonymousClass175 r0 = new TimerTask() {
            public void run() {
                ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                final EditText editText = editText3;
                exzamViewActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        editText.setEnabled(true);
                        editText.requestFocus();
                        ((InputMethodManager) ExzamViewActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                        EditText editText = editText;
                        editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                        ExzamViewActivity access$0 = ExzamViewActivity.this;
                        final EditText editText2 = editText;
                        access$0.timer_5 = new TimerTask() {
                            public void run() {
                                ExzamViewActivity access$0 = ExzamViewActivity.this;
                                final EditText editText = editText2;
                                access$0.runOnUiThread(new Runnable() {
                                    public void run() {
                                        editText.setEnabled(true);
                                        editText.requestFocus();
                                        ((InputMethodManager) ExzamViewActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                                        EditText editText = editText;
                                        editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                                    }
                                });
                            }
                        };
                        ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 70);
                    }
                });
            }
        };
        this.timer_5 = r0;
        this._timer.schedule(r0, 50);
        try {
            editText3.setEnabled(true);
            editText3.requestFocus();
            ((InputMethodManager) getSystemService("input_method")).showSoftInput(editText3, 1);
            editText3.setSelection(editText3.getText().toString().length(), editText3.getText().toString().length());
        } catch (Exception unused2) {
        }
        alertDialog3.setView(linearLayout);
        alertDialog3.show();
        alertDialog3.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        alertDialog3.getWindow().setLayout(450, -2);
    }

    public void _Tiping(double d) {
        TextView textView;
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
        TextView textView2 = new TextView(getApplicationContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 0.0f));
        textView2.setTextColor(-1499549);
        textView2.setTextSize(14.0f);
        textView2.setGravity(17);
        linearLayout3.addView(textView2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams4.setMargins(2, 2, 2, 0);
        textView2.setLayoutParams(layoutParams4);
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
        textView2.setText("☆ تحديد الطباعه&&مشاركه ☆");
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        layoutParams7.setMargins(2, 2, 2, 2);
        textView2.setLayoutParams(layoutParams7);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams8.setMargins(2, 2, 2, 2);
        linearLayout5.setLayoutParams(layoutParams8);
        this.Cf = 0.0d;
        TextView textView3 = new TextView(getApplicationContext());
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
        textView3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView3.setTextSize(16.0f);
        try {
            textView3.setText("طباعة الصفحة ( pdf ) ");
        } catch (Exception unused) {
            textView3.setText(BuildConfig.FLAVOR);
        }
        textView3.setGravity(17);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ExzamViewActivity.this.position_number == 0.0d) {
                    ExzamViewActivity.this.Cf = 1.0d;
                } else {
                    ExzamViewActivity.this.Cf = 2.0d;
                }
                ExzamViewActivity.this.n = 0.0d;
                ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                exzamViewActivity._creat_pdf(exzamViewActivity.linear_pdf_0_5);
                create.dismiss();
            }
        });
        linearLayout5.addView(textView3);
        TextView textView4 = new TextView(getApplicationContext());
        textView4.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
        textView4.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView4.setTextSize(16.0f);
        try {
            textView4.setText("مشاركه الصفحة ( Pdf )");
        } catch (Exception unused2) {
            textView4.setText(BuildConfig.FLAVOR);
        }
        textView4.setGravity(17);
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ExzamViewActivity.this.position_number == 0.0d) {
                    ExzamViewActivity.this.Cf = 1.0d;
                } else {
                    ExzamViewActivity.this.Cf = 2.0d;
                }
                ExzamViewActivity.this.n = 1.0d;
                ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                exzamViewActivity._creat_pdf(exzamViewActivity.linear_pdf_0_5);
                create.dismiss();
            }
        });
        linearLayout5.addView(textView4);
        TextView textView5 = new TextView(getApplicationContext());
        textView5.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
        textView5.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView5.setTextSize(16.0f);
        try {
            textView5.setText("مشاركه الصفحة ( صوره )");
        } catch (Exception unused3) {
            textView5.setText(BuildConfig.FLAVOR);
        }
        textView5.setGravity(17);
        textView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (ExzamViewActivity.this.position_number == 0.0d) {
                    ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                    exzamViewActivity._Share_images(exzamViewActivity.linear_pdf_0_5);
                } else {
                    ExzamViewActivity exzamViewActivity2 = ExzamViewActivity.this;
                    exzamViewActivity2._Share_images(exzamViewActivity2.linear_pdf_0);
                }
                create.dismiss();
            }
        });
        linearLayout5.addView(textView5);
        TextView textView6 = new TextView(getApplicationContext());
        ImageView imageView2 = imageView;
        textView6.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
        textView6.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView6.setTextSize(16.0f);
        try {
            textView6.setText("طباعة الاختبار \"صفحتين\" ( Pdf )");
        } catch (Exception unused4) {
            textView6.setText(BuildConfig.FLAVOR);
        }
        textView6.setGravity(17);
        textView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.n = 0.0d;
                ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                exzamViewActivity._creat_pdf(exzamViewActivity.linear_pdf_0_5);
                create.dismiss();
            }
        });
        linearLayout5.addView(textView6);
        TextView textView7 = new TextView(getApplicationContext());
        TextView textView8 = textView2;
        textView7.setLayoutParams(new LinearLayout.LayoutParams(-1, 80, 1.0f));
        textView7.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView7.setTextSize(16.0f);
        try {
            textView7.setText("مشاركة الاختبار \"صفحتين\" ( Pdf )");
        } catch (Exception unused5) {
            textView7.setText(BuildConfig.FLAVOR);
        }
        textView7.setGravity(17);
        textView7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExzamViewActivity.this.n = 1.0d;
                ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                exzamViewActivity._creat_pdf(exzamViewActivity.linear_pdf_0_5);
                create.dismiss();
            }
        });
        linearLayout5.addView(textView7);
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(2, 2, -1, -1));
        textView6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -1, -657931));
        textView7.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -1, -657931));
        textView4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -1, -657931));
        textView3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -1, -657931));
        textView5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 2, -1, -657931));
        try {
            textView7.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView6.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
        } catch (Exception unused6) {
        }
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
        TextView textView9 = new TextView(getApplicationContext());
        textView9.setLayoutParams(new LinearLayout.LayoutParams(-1, 60, 1.0f));
        textView9.setTextColor(-59580);
        textView9.setTextSize(15.0f);
        textView9.setText("هل تريد الحفظ ؟");
        textView9.setGravity(17);
        linearLayout2.addView(textView9);
        LinearLayout linearLayout7 = new LinearLayout(getApplicationContext());
        linearLayout7.setOrientation(0);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams10.setMargins(0, 8, 1, 0);
        linearLayout7.setLayoutParams(layoutParams10);
        TextView textView10 = new TextView(getApplicationContext());
        TextView textView11 = textView4;
        textView10.setLayoutParams(new LinearLayout.LayoutParams(120, 50, 1.0f));
        textView10.setTextColor(-1499549);
        textView10.setTextSize(15.0f);
        textView10.setText("cancel");
        textView10.setGravity(17);
        textView10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
        linearLayout7.addView(textView10);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams11.setMargins(10, 1, 1, 10);
        textView10.setLayoutParams(layoutParams11);
        TextView textView12 = textView3;
        textView10.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        TextView textView13 = new TextView(getApplicationContext());
        textView13.setLayoutParams(new LinearLayout.LayoutParams(150, 45, 1.0f));
        textView13.setTextColor(-59580);
        textView13.setTextSize(15.0f);
        textView13.setText("ok");
        textView13.setGravity(17);
        linearLayout7.addView(textView13);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(200, 60, 0.0f);
        layoutParams12.setMargins(10, 1, 1, 10);
        textView13.setLayoutParams(layoutParams12);
        TextView textView14 = textView6;
        textView13.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 3, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout2.setBackgroundColor(-1);
        linearLayout2.addView(linearLayout7);
        linearLayout.addView(linearLayout2);
        try {
            textView9.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            textView = textView8;
            try {
                textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
                textView13.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
                textView10.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
            } catch (Exception unused7) {
            }
        } catch (Exception unused8) {
            textView = textView8;
        }
        textView13.setOnClickListener(new View.OnClickListener() {
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
        textView9.setText("ملاحظه : ");
        textView9.setTextSize(12.0f);
        textView13.setVisibility(8);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams13.setMargins(8, 8, 8, 16);
        textView5.setLayoutParams(layoutParams13);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams14.setMargins(8, 8, 8, 16);
        textView7.setLayoutParams(layoutParams14);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams15.setMargins(8, 16, 8, 16);
        textView14.setLayoutParams(layoutParams15);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams16.setMargins(8, 8, 8, 16);
        textView12.setLayoutParams(layoutParams16);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams17.setMargins(8, 8, 8, 16);
        textView11.setLayoutParams(layoutParams17);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, -2, 0.0f);
        layoutParams18.setMargins(2, 2, 2, 2);
        textView9.setLayoutParams(layoutParams18);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams19.setMargins(2, 2, 2, 2);
        textView13.setLayoutParams(layoutParams19);
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-1, 80, 1.0f);
        layoutParams20.setMargins(2, 2, 2, 2);
        textView10.setLayoutParams(layoutParams20);
        textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
        textView9.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nasa_soft44.ttf"), 1);
        ImageView imageView3 = imageView2;
        imageView3.setImageResource(R.drawable.ic_select_all_black);
        imageView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                create.dismiss();
            }
        });
    }

    public void _creat_pdf(View view) {
        try {
            this.w = Double.parseDouble(this.save.getString("Size_page", BuildConfig.FLAVOR));
        } catch (Exception unused) {
            this.w = 1400.0d;
        }
        this.h = this.w / 0.707d;
        this.Path = "/sdcard/دفتر الامتحانات/";
        this.file_name = this.Name.concat(".pdf");
        if (!FileUtil.isDirectory(this.Path)) {
            FileUtil.makeDir(this.Path);
        }
        PD(new PdfDocument());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:2|3|4|5) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void PD(android.graphics.pdf.PdfDocument r7) {
        /*
            r6 = this;
            android.graphics.pdf.PdfDocument$PageInfo$Builder r0 = new android.graphics.pdf.PdfDocument$PageInfo$Builder
            double r1 = r6.w
            int r1 = (int) r1
            double r2 = r6.h
            int r2 = (int) r2
            r3 = 2
            r0.<init>(r1, r2, r3)
            android.graphics.pdf.PdfDocument$PageInfo r0 = r0.create()
            double r1 = r6.Cf
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0039
            android.graphics.pdf.PdfDocument$Page r1 = r7.startPage(r0)     // Catch:{ Exception -> 0x0028 }
            android.widget.LinearLayout r2 = r6.linear_pdf_0     // Catch:{ Exception -> 0x0028 }
            android.graphics.Canvas r3 = r1.getCanvas()     // Catch:{ Exception -> 0x0028 }
            r2.draw(r3)     // Catch:{ Exception -> 0x0028 }
            r7.finishPage(r1)     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            android.graphics.pdf.PdfDocument$Page r0 = r7.startPage(r0)     // Catch:{ Exception -> 0x0060 }
            android.widget.LinearLayout r1 = r6.linear_pdf_0_5     // Catch:{ Exception -> 0x0060 }
            android.graphics.Canvas r2 = r0.getCanvas()     // Catch:{ Exception -> 0x0060 }
            r1.draw(r2)     // Catch:{ Exception -> 0x0060 }
            r7.finishPage(r0)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0060
        L_0x0039:
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0050
            android.graphics.pdf.PdfDocument$Page r0 = r7.startPage(r0)     // Catch:{ Exception -> 0x0060 }
            android.widget.LinearLayout r1 = r6.linear_pdf_0_5     // Catch:{ Exception -> 0x0060 }
            android.graphics.Canvas r2 = r0.getCanvas()     // Catch:{ Exception -> 0x0060 }
            r1.draw(r2)     // Catch:{ Exception -> 0x0060 }
            r7.finishPage(r0)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0060
        L_0x0050:
            android.graphics.pdf.PdfDocument$Page r0 = r7.startPage(r0)     // Catch:{ Exception -> 0x0060 }
            android.widget.LinearLayout r1 = r6.linear_pdf_0     // Catch:{ Exception -> 0x0060 }
            android.graphics.Canvas r2 = r0.getCanvas()     // Catch:{ Exception -> 0x0060 }
            r1.draw(r2)     // Catch:{ Exception -> 0x0060 }
            r7.finishPage(r0)     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            java.lang.String r0 = r6.Path
            java.lang.String r1 = r6.file_name
            double r2 = r6.n
            int r2 = (int) r2
            r6.saveD(r0, r1, r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity.PD(android.graphics.pdf.PdfDocument):void");
    }

    public void saveD(final String str, final String str2, PdfDocument pdfDocument, final int i2) {
        FileOutputStream fileOutputStream;
        Throwable th = null;
        try {
            fileOutputStream = new FileOutputStream(String.valueOf(str) + str2);
            pdfDocument.writeTo(fileOutputStream);
            fileOutputStream.close();
            pdfDocument.close();
            fileOutputStream.close();
            AnonymousClass196 r7 = new TimerTask() {
                public void run() {
                    ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                    final String str = str;
                    final String str2 = str2;
                    final int i = i2;
                    exzamViewActivity.runOnUiThread(new Runnable() {
                        public void run() {
                            ExzamViewActivity access$0 = ExzamViewActivity.this;
                            final String str = str;
                            final String str2 = str2;
                            final int i = i;
                            access$0.timer_5 = new TimerTask() {
                                public void run() {
                                    ExzamViewActivity access$0 = ExzamViewActivity.this;
                                    final String str = str;
                                    final String str2 = str2;
                                    final int i = i;
                                    access$0.runOnUiThread(new Runnable() {
                                        public void run() {
                                            Context applicationContext = ExzamViewActivity.this.getApplicationContext();
                                            SketchwareUtil.showMessage(applicationContext, "تم تصدير pdf الى المسار \n".concat(String.valueOf(str) + str2));
                                            if (i == 0) {
                                                ExzamViewActivity access$0 = ExzamViewActivity.this;
                                                access$0.Tipping(String.valueOf(str) + str2);
                                                return;
                                            }
                                            try {
                                                Uri parse = Uri.parse(String.valueOf(str) + str2);
                                                Intent intent = new Intent("android.intent.action.SEND");
                                                intent.addFlags(524288);
                                                intent.setType("application/pdf");
                                                intent.putExtra("android.intent.extra.STREAM", parse);
                                                ExzamViewActivity.this.startActivity(Intent.createChooser(intent, "مشاركه السند عبر"));
                                            } catch (Exception unused) {
                                            }
                                        }
                                    });
                                }
                            };
                            ExzamViewActivity.this._timer.schedule(ExzamViewActivity.this.timer_5, 150);
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

    public void _Share_images(View view) {
        this.Path = "/sdcard/دفتر الامتحانات/";
        this.file_name = this.Name.concat(String.valueOf((long) this.position_number).concat(".jpg"));
        if (!FileUtil.isDirectory(this.Path)) {
            FileUtil.makeDir(this.Path);
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        saveG(this.Path, this.file_name, createBitmap);
    }

    public void saveG(final String str, final String str2, Bitmap bitmap) {
        FileOutputStream fileOutputStream;
        Throwable th = null;
        try {
            fileOutputStream = new FileOutputStream(String.valueOf(str) + str2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            AnonymousClass197 r7 = new TimerTask() {
                public void run() {
                    ExzamViewActivity exzamViewActivity = ExzamViewActivity.this;
                    final String str = str;
                    final String str2 = str2;
                    exzamViewActivity.runOnUiThread(new Runnable() {
                        public void run() {
                            try {
                                Uri parse = Uri.parse(String.valueOf(str) + str2);
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.addFlags(524288);
                                intent.setType("application/pdf");
                                intent.putExtra("android.intent.extra.STREAM", parse);
                                ExzamViewActivity.this.startActivity(Intent.createChooser(intent, "مشاركه السند عبر"));
                            } catch (Exception unused) {
                            }
                            Context applicationContext = ExzamViewActivity.this.getApplicationContext();
                            SketchwareUtil.showMessage(applicationContext, "تم تصدير  الى المسار تجهيزا للمشاركه".concat(String.valueOf(str) + str2));
                        }
                    });
                }
            };
            this.timer_5 = r7;
            this._timer.schedule(r7, 100);
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

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0379 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _Qousor(android.widget.TextView r22, android.widget.TextView r23, double r24, double r26, double r28) {
        /*
            r21 = this;
            r13 = r21
            java.lang.String r0 = "fonts/nasa_soft44.ttf"
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r13)
            android.app.AlertDialog r14 = r1.create()
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            android.content.Context r1 = r21.getApplicationContext()
            r15.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r15.setLayoutParams(r1)
            r12 = 1
            r15.setOrientation(r12)
            r1 = 17
            r15.setGravity(r1)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r4 = r21.getApplicationContext()
            r3.<init>(r4)
            r3.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r5 = 0
            r4.<init>(r2, r10, r5)
            r6 = 2
            r4.setMargins(r6, r6, r6, r6)
            r3.setLayoutParams(r4)
            r4 = 12
            r3.setPadding(r4, r4, r4, r4)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            android.content.Context r8 = r21.getApplicationContext()
            r7.<init>(r8)
            r11 = 0
            r7.setOrientation(r11)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = 80
            r8.<init>(r2, r9, r5)
            r10 = 4
            r8.setMargins(r12, r12, r12, r10)
            r7.setLayoutParams(r8)
            r7.setPadding(r4, r4, r4, r4)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$198 r4 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$198
            r4.<init>()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r10 = -657931(0xfffffffffff5f5f5, float:NaN)
            android.graphics.drawable.GradientDrawable r4 = r4.getIns(r6, r12, r8, r10)
            r7.setBackground(r4)
            r3.setGravity(r1)
            android.widget.EditText r4 = new android.widget.EditText
            android.content.Context r8 = r21.getApplicationContext()
            r4.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r10 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r2, r2, r10)
            r8.setMargins(r6, r6, r6, r6)
            r4.setLayoutParams(r8)
            r8 = 53
            r4.setGravity(r8)
            android.widget.EditText r11 = new android.widget.EditText
            android.content.Context r1 = r21.getApplicationContext()
            r11.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r2, r2, r10)
            r1.setMargins(r6, r6, r6, r6)
            r11.setLayoutParams(r1)
            r11.setGravity(r8)
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r8 = r21.getApplicationContext()
            r1.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r6 = 45
            r8.<init>(r6, r2, r5)
            r8.setMargins(r12, r12, r12, r12)
            r1.setLayoutParams(r8)
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r6)
            r7.addView(r1)
            android.widget.TextView r6 = new android.widget.TextView
            android.content.Context r8 = r21.getApplicationContext()
            r6.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r2, r9, r5)
            r6.setLayoutParams(r8)
            r8 = -1499549(0xffffffffffe91e63, float:NaN)
            r6.setTextColor(r8)
            r9 = 1096810496(0x41600000, float:14.0)
            r6.setTextSize(r9)
            java.lang.String r9 = " "
            r6.setText(r9)
            r9 = 17
            r6.setGravity(r9)
            r7.addView(r6)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r9.<init>(r2, r2, r10)
            r8 = 2
            r9.setMargins(r8, r8, r8, r8)
            r6.setLayoutParams(r9)
            r3.addView(r7)
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            android.content.Context r9 = r21.getApplicationContext()
            r7.<init>(r9)
            r9 = 0
            r7.setOrientation(r9)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r12 = 3
            r10.<init>(r2, r12, r5)
            r10.setMargins(r9, r8, r8, r9)
            r7.setLayoutParams(r10)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$199 r9 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$199
            r9.<init>()
            r10 = -6381922(0xffffffffff9e9e9e, float:NaN)
            r5 = -1118482(0xffffffffffeeeeee, float:NaN)
            android.graphics.drawable.GradientDrawable r9 = r9.getIns(r8, r8, r10, r5)
            r7.setBackground(r9)
            r3.addView(r7)
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            android.content.Context r7 = r21.getApplicationContext()
            r9.<init>(r7)
            r7 = 1
            r9.setOrientation(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r10 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r2, r5, r10)
            r7.setMargins(r8, r12, r12, r8)
            r9.setLayoutParams(r7)
            r5 = 53
            r9.setGravity(r5)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$200 r5 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$200
            r5.<init>()
            r7 = -657931(0xfffffffffff5f5f5, float:NaN)
            r10 = -6381922(0xffffffffff9e9e9e, float:NaN)
            android.graphics.drawable.GradientDrawable r5 = r5.getIns(r8, r8, r10, r7)
            r9.setBackground(r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r7 = r21.getApplicationContext()
            r5.<init>(r7)
            r7 = 0
            r5.setOrientation(r7)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r10 = 4
            r12 = 0
            r8.<init>(r2, r10, r12)
            r8.setMargins(r7, r7, r7, r7)
            r5.setLayoutParams(r8)
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setBackgroundColor(r8)
            r9.addView(r4)
            r9.addView(r5)
            r9.addView(r11)
            r3.addView(r9)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r8 = r21.getApplicationContext()
            r5.<init>(r8)
            r5.setOrientation(r7)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r10 = 3
            r12 = 0
            r8.<init>(r2, r10, r12)
            r10 = 4
            r8.setMargins(r7, r10, r7, r10)
            r5.setLayoutParams(r8)
            r3.addView(r5)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$201 r8 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$201
            r8.<init>()
            r10 = -1118482(0xffffffffffeeeeee, float:NaN)
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.GradientDrawable r8 = r8.getIns(r7, r7, r12, r10)
            r5.setBackground(r8)
            android.widget.TextView r5 = new android.widget.TextView
            android.content.Context r7 = r21.getApplicationContext()
            r5.<init>(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = 60
            r10 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r2, r8, r10)
            r5.setLayoutParams(r7)
            r7 = -59580(0xffffffffffff1744, float:NaN)
            r5.setTextColor(r7)
            r8 = 1097859072(0x41700000, float:15.0)
            r5.setTextSize(r8)
            java.lang.String r10 = "هل تريد الحفظ ؟"
            r5.setText(r10)
            r10 = 17
            r5.setGravity(r10)
            r3.addView(r5)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            android.content.Context r12 = r21.getApplicationContext()
            r10.<init>(r12)
            r12 = 0
            r10.setOrientation(r12)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r12 = 0
            r7.<init>(r2, r8, r12)
            r12 = 8
            r2 = 0
            r7.setMargins(r2, r12, r12, r2)
            r10.setLayoutParams(r7)
            android.widget.TextView r7 = new android.widget.TextView
            android.content.Context r2 = r21.getApplicationContext()
            r7.<init>(r2)
            r2 = -1499549(0xffffffffffe91e63, float:NaN)
            r7.setTextColor(r2)
            r2 = 1097859072(0x41700000, float:15.0)
            r7.setTextSize(r2)
            java.lang.String r2 = "cancel"
            r7.setText(r2)
            r2 = 17
            r7.setGravity(r2)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$202 r2 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$202
            r2.<init>(r4, r14)
            r7.setOnClickListener(r2)
            r10.addView(r7)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$203 r2 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$203
            r2.<init>()
            r8 = 20
            r19 = r9
            r20 = r14
            r9 = 3
            r12 = -1118482(0xffffffffffeeeeee, float:NaN)
            r14 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r8, r9, r14, r12)
            r7.setBackground(r2)
            android.widget.TextView r14 = new android.widget.TextView
            android.content.Context r2 = r21.getApplicationContext()
            r14.<init>(r2)
            r2 = -59580(0xffffffffffff1744, float:NaN)
            r14.setTextColor(r2)
            r2 = 1097859072(0x41700000, float:15.0)
            r14.setTextSize(r2)
            java.lang.String r2 = "ok"
            r14.setText(r2)
            r2 = 17
            r14.setGravity(r2)
            r10.addView(r14)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r8 = 200(0xc8, float:2.8E-43)
            r9 = 75
            r12 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r8, r9, r12)
            r8 = 10
            r9 = 10
            r12 = 1
            r2.setMargins(r8, r12, r12, r9)
            r14.setLayoutParams(r2)
            r7.setLayoutParams(r2)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$204 r2 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$204
            r2.<init>()
            r8 = 20
            r17 = r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9 = -1118482(0xffffffffffeeeeee, float:NaN)
            r12 = 3
            android.graphics.drawable.GradientDrawable r2 = r2.getIns(r8, r12, r1, r9)
            r14.setBackground(r2)
            r2 = -1
            r3.setBackgroundColor(r2)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$205 r8 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$205
            r8.<init>()
            r9 = 2
            r12 = 1
            android.graphics.drawable.GradientDrawable r8 = r8.getIns(r9, r12, r1, r2)
            r4.setBackground(r8)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$206 r8 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$206
            r8.<init>()
            android.graphics.drawable.GradientDrawable r1 = r8.getIns(r9, r12, r1, r2)
            r11.setBackground(r1)
            r3.addView(r10)
            r15.addView(r3)
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x02e5 }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x02e5 }
            r5.setTypeface(r1, r12)     // Catch:{ Exception -> 0x02e5 }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x02e5 }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x02e5 }
            r6.setTypeface(r1, r12)     // Catch:{ Exception -> 0x02e5 }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x02e5 }
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x02e5 }
            r14.setTypeface(r1, r12)     // Catch:{ Exception -> 0x02e5 }
            android.content.res.AssetManager r1 = r21.getAssets()     // Catch:{ Exception -> 0x02e5 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r1, r0)     // Catch:{ Exception -> 0x02e5 }
            r7.setTypeface(r0, r12)     // Catch:{ Exception -> 0x02e5 }
        L_0x02e5:
            r0 = 8
            r4.setPadding(r0, r0, r0, r0)
            r11.setPadding(r0, r0, r0, r0)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$207 r0 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$207
            r0.<init>()
            r1 = -6381922(0xffffffffff9e9e9e, float:NaN)
            r2 = -1
            r3 = 2
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r3, r3, r1, r2)
            r4.setBackground(r0)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$208 r0 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$208
            r0.<init>()
            android.graphics.drawable.GradientDrawable r0 = r0.getIns(r3, r3, r1, r2)
            r11.setBackground(r0)
            java.lang.CharSequence r0 = r22.getText()
            java.lang.String r0 = r0.toString()
            r4.setText(r0)
            java.lang.CharSequence r0 = r23.getText()
            java.lang.String r0 = r0.toString()
            r11.setText(r0)
            java.lang.String r0 = "البسط ....."
            r4.setHint(r0)
            java.lang.String r0 = "المقام ....."
            r11.setHint(r0)
            java.lang.String r0 = "☆ البسط && المقام ☆"
            r6.setText(r0)
            r0 = 2131165377(0x7f0700c1, float:1.794497E38)
            r1 = r17
            r1.setImageResource(r0)
            r0 = 49
            r4.setGravity(r0)
            r0 = 1098907648(0x41800000, float:16.0)
            r4.setTextSize(r0)
            r0 = 49
            r11.setGravity(r0)
            r0 = 1098907648(0x41800000, float:16.0)
            r11.setTextSize(r0)
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0377 }
            r0.<init>()     // Catch:{ Exception -> 0x0377 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r13.List_map     // Catch:{ Exception -> 0x0377 }
            r8 = r28
            int r3 = (int) r8
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0379 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x0379 }
            java.lang.String r3 = "2"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0379 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$209 r3 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$209     // Catch:{ Exception -> 0x0379 }
            r3.<init>()     // Catch:{ Exception -> 0x0379 }
            java.lang.reflect.Type r3 = r3.getType()     // Catch:{ Exception -> 0x0379 }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r2, (java.lang.reflect.Type) r3)     // Catch:{ Exception -> 0x0379 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0379 }
            r13.List_ch_PD = r0     // Catch:{ Exception -> 0x0379 }
            goto L_0x0379
        L_0x0377:
            r8 = r28
        L_0x0379:
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch:{ Exception -> 0x03a5 }
            r0.<init>()     // Catch:{ Exception -> 0x03a5 }
            java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r13.List_ch_PD     // Catch:{ Exception -> 0x03a5 }
            r6 = r26
            int r3 = (int) r6
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x03a7 }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ Exception -> 0x03a7 }
            java.lang.String r3 = "2"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x03a7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03a7 }
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$210 r3 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$210     // Catch:{ Exception -> 0x03a7 }
            r3.<init>()     // Catch:{ Exception -> 0x03a7 }
            java.lang.reflect.Type r3 = r3.getType()     // Catch:{ Exception -> 0x03a7 }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r2, (java.lang.reflect.Type) r3)     // Catch:{ Exception -> 0x03a7 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x03a7 }
            r13.List_ch_PL = r0     // Catch:{ Exception -> 0x03a7 }
            goto L_0x03a7
        L_0x03a5:
            r6 = r26
        L_0x03a7:
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$211 r10 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$211
            r0 = r10
            r5 = r1
            r1 = r21
            r16 = 0
            r2 = r22
            r3 = r4
            r22 = r4
            r4 = r23
            r17 = r15
            r15 = r5
            r5 = r11
            r6 = r24
            r18 = r19
            r11 = -2
            r8 = r26
            r13 = r10
            r10 = r28
            r12 = r20
            r0.<init>(r2, r3, r4, r5, r6, r8, r10, r12)
            r14.setOnClickListener(r13)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$212 r11 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$212
            r0 = r11
            r2 = r22
            r3 = r18
            r4 = r24
            r6 = r26
            r8 = r28
            r10 = r20
            r0.<init>(r2, r3, r4, r6, r8, r10)
            r15.setOnClickListener(r11)
            com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$213 r0 = new com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity$213
            r0.<init>(r2)
            r1.timer_5 = r0
            java.util.Timer r3 = r1._timer
            r4 = 50
            r3.schedule(r0, r4)
            r0 = 1
            r2.setEnabled(r0)     // Catch:{ Exception -> 0x041c }
            r2.requestFocus()     // Catch:{ Exception -> 0x041c }
            java.lang.String r3 = "input_method"
            java.lang.Object r3 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x041c }
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3     // Catch:{ Exception -> 0x041c }
            r3.showSoftInput(r2, r0)     // Catch:{ Exception -> 0x041c }
            android.text.Editable r0 = r2.getText()     // Catch:{ Exception -> 0x041c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x041c }
            int r0 = r0.length()     // Catch:{ Exception -> 0x041c }
            android.text.Editable r3 = r2.getText()     // Catch:{ Exception -> 0x041c }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x041c }
            int r3 = r3.length()     // Catch:{ Exception -> 0x041c }
            r2.setSelection(r0, r3)     // Catch:{ Exception -> 0x041c }
        L_0x041c:
            r2 = r17
            r0 = r20
            r0.setView(r2)
            r0.show()
            android.view.Window r2 = r0.getWindow()
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r4 = 0
            r3.<init>(r4)
            r2.setBackgroundDrawable(r3)
            android.view.Window r0 = r0.getWindow()
            r2 = -2
            r0.setLayout(r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.Nasa.Soft.Exzam.Editor35.ExzamViewActivity._Qousor(android.widget.TextView, android.widget.TextView, double, double, double):void");
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
