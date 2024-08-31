package com.Nasa.Soft.Exzam.Editor35;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import uk.co.senab.photoview.BuildConfig;

public class MainActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    public double Passer = 0.0d;
    /* access modifiers changed from: private */
    public Timer _timer = new Timer();
    private Button button1;
    private Button button2;
    /* access modifiers changed from: private */
    public Calendar ca = Calendar.getInstance();
    /* access modifiers changed from: private */
    public SharedPreferences codee;
    private double color = 0.0d;
    private ImageView imageview2;
    private LinearLayout linear1;
    private LinearLayout linear9;
    /* access modifiers changed from: private */
    public SharedPreferences pass_word;
    private SharedPreferences save;
    /* access modifiers changed from: private */
    public TimerTask timer_5;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.main);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.button2 = (Button) findViewById(R.id.button2);
        this.imageview2 = (ImageView) findViewById(R.id.imageview2);
        this.button1 = (Button) findViewById(R.id.button1);
        this.linear9 = (LinearLayout) findViewById(R.id.linear9);
        this.pass_word = getSharedPreferences("pass_word", 0);
        this.save = getSharedPreferences("save", 0);
        this.codee = getSharedPreferences("codee", 0);
        this.imageview2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
    }

    private void initializeLogic() {
        try {
            this.button2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            this.button1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/aldewantom.ttf"), 1);
        } catch (Exception unused) {
        }
        _shaql_90();
        AnonymousClass2 r0 = new TimerTask() {
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable() {
                    public void run() {
                        if (MainActivity.this.codee.getString("A", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                            MainActivity.this.ca = Calendar.getInstance();
                            MainActivity.this.codee.edit().putString("A", String.valueOf(MainActivity.this.ca.getTimeInMillis())).commit();
                            MainActivity.this.codee.edit().putString("B", String.valueOf((long) SketchwareUtil.getRandom(11000, 100000))).commit();
                        }
                        if (MainActivity.this.codee.getString("Cod", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                            try {
                                MainActivity.this._dialog_enter(MainActivity.this.codee.getString("B", BuildConfig.FLAVOR), String.valueOf((long) ((Double.parseDouble(MainActivity.this.codee.getString("B", BuildConfig.FLAVOR)) * 84301.0d) - 50904.0d)));
                            } catch (Exception unused) {
                            }
                        } else if (MainActivity.this.pass_word.getString("pass_word", BuildConfig.FLAVOR).equals(BuildConfig.FLAVOR)) {
                            Intent intent = new Intent();
                            intent.setClass(MainActivity.this.getApplicationContext(), HomeActivity.class);
                            MainActivity.this.startActivity(intent);
                            MainActivity.this.finish();
                        } else {
                            MainActivity.this.Passer = Double.parseDouble(String.valueOf((long) ((Double.parseDouble(MainActivity.this.pass_word.getString("pass_word", BuildConfig.FLAVOR)) * 666.0d) - 391.0d)));
                            MainActivity.this.timer_5 = new TimerTask() {
                                public void run() {
                                    MainActivity.this.runOnUiThread(new Runnable() {
                                        public void run() {
                                            MainActivity.this._enter_pasword();
                                        }
                                    });
                                }
                            };
                            MainActivity.this._timer.schedule(MainActivity.this.timer_5, 500);
                        }
                    }
                });
            }
        };
        this.timer_5 = r0;
        this._timer.schedule(r0, 1700);
    }

    public void _shaql_90() {
        try {
            this.color = Double.parseDouble(this.save.getString("B500", BuildConfig.FLAVOR));
            Button button = this.button2;
            AnonymousClass3 r1 = new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            };
            double d = this.color;
            button.setBackground(r1.getIns(0, 0, (int) d, (int) d));
            Button button3 = this.button1;
            AnonymousClass4 r12 = new GradientDrawable() {
                public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                    setCornerRadius((float) i);
                    setStroke(i2, i3);
                    setColor(i4);
                    return this;
                }
            };
            double d2 = this.color;
            button3.setBackground(r12.getIns(0, 0, (int) d2, (int) d2));
        } catch (Exception unused) {
        }
    }

    public void _enter_pasword() {
        AlertDialog create = new AlertDialog.Builder(this).create();
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        LinearLayout linearLayout2 = new LinearLayout(getApplicationContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout2.setPadding(16, 16, 16, 16);
        linearLayout2.setBackgroundColor(-1);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(getApplicationContext());
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout3.setPadding(2, 2, 2, 2);
        linearLayout3.setBackgroundColor(-657931);
        linearLayout3.setGravity(17);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(getApplicationContext());
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, 100, 0.0f));
        linearLayout4.setPadding(4, 4, 4, 4);
        linearLayout4.setBackgroundColor(-6381922);
        linearLayout4.setGravity(17);
        linearLayout3.addView(linearLayout4);
        TextView textView = new TextView(getApplicationContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0f));
        textView.setText(" محمي بكلمة مرور");
        textView.setTextSize(18.0f);
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        linearLayout4.addView(textView);
        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(150, -1, 0.0f));
        imageView.setImageResource(R.drawable.ic_apps_black);
        linearLayout4.addView(imageView);
        LinearLayout linearLayout5 = new LinearLayout(getApplicationContext());
        linearLayout5.setOrientation(0);
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-1, 150, 0.0f));
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
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, 100, 0.0f));
        textView2.setPadding(2, 2, 2, 2);
        textView2.setBackgroundColor(-657931);
        textView2.setText("كلمة المرور ");
        textView2.setTextSize(14.0f);
        textView2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView2.setGravity(17);
        linearLayout5.addView(textView2);
        final TextView textView3 = new TextView(getApplicationContext());
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 0.0f));
        textView3.setPadding(8, 8, 8, 8);
        textView3.setText("هل نسيت كلمة السر..... ");
        textView3.setTextSize(12.0f);
        textView3.setTextColor(-14983648);
        textView3.setGravity(17);
        linearLayout3.addView(textView3);
        LinearLayout linearLayout6 = new LinearLayout(getApplicationContext());
        linearLayout6.setOrientation(0);
        LinearLayout linearLayout7 = linearLayout;
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 0.0f));
        linearLayout6.setPadding(8, 8, 8, 8);
        linearLayout6.setBackgroundColor(-6381922);
        linearLayout6.setGravity(17);
        linearLayout3.addView(linearLayout6);
        TextView textView4 = new TextView(getApplicationContext());
        AlertDialog alertDialog = create;
        textView4.setLayoutParams(new LinearLayout.LayoutParams(210, -2, 1.0f));
        textView4.setPadding(4, 4, 4, 4);
        textView4.setBackgroundColor(-1118482);
        textView4.setText("دخول");
        textView4.setTextSize(18.0f);
        textView4.setTextColor(-14983648);
        textView4.setGravity(17);
        linearLayout6.addView(textView4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 100, 0.0f);
        layoutParams.setMargins(2, 20, 4, 2);
        linearLayout5.setLayoutParams(layoutParams);
        textView.setText("محمي بكلمه مرور");
        TextView textView5 = textView2;
        linearLayout5.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(8, 1, -6381922, -1));
        linearLayout4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        linearLayout3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 2, ViewCompat.MEASURED_STATE_MASK, -1));
        textView4.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(88, 1, ViewCompat.MEASURED_STATE_MASK, -1));
        linearLayout6.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(0, 2, ViewCompat.MEASURED_STATE_MASK, -1118482));
        try {
            textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            editText.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/aldewantom.ttf"), 1);
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/aldewantom.ttf"), 1);
        } catch (Exception unused) {
        }
        editText.setTextIsSelectable(true);
        editText.setHint("Enter Password");
        final AlertDialog alertDialog2 = alertDialog;
        textView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (editText.getText().toString().equals(MainActivity.this.pass_word.getString("pass_word", BuildConfig.FLAVOR))) {
                    SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "كلمه مرور صحيحه مرحبا بك ... ");
                    alertDialog2.setCancelable(true);
                    alertDialog2.dismiss();
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this.getApplicationContext(), HomeActivity.class);
                    MainActivity.this.startActivity(intent);
                    MainActivity.this.finish();
                    return;
                }
                editText.setText(BuildConfig.FLAVOR);
                editText.setError("Error !!!!\nit's wrong ...\nyou can tell me 772666391");
                textView3.setText("هل  نسيت كلمة السر : \nرمز الاستعاده : ".concat(String.valueOf((long) MainActivity.this.Passer)));
                editText.selectAll();
                editText.requestFocus();
                editText.setEnabled(true);
                editText.requestFocus();
                ((InputMethodManager) MainActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                EditText editText = editText;
                editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                try {
                    EditText editText2 = editText;
                    editText2.setSelection(editText2.getText().toString().length(), editText.getText().toString().length());
                } catch (Exception unused) {
                }
                SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "كلمه المرو خطا");
            }
        });
        AnonymousClass11 r1 = new TimerTask() {
            public void run() {
                MainActivity mainActivity = MainActivity.this;
                final EditText editText = editText;
                mainActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        editText.setEnabled(true);
                        editText.requestFocus();
                        ((InputMethodManager) MainActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                        EditText editText = editText;
                        editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                        try {
                            EditText editText2 = editText;
                            editText2.setSelection(editText2.getText().toString().length(), editText.getText().toString().length());
                        } catch (Exception unused) {
                        }
                        MainActivity access$0 = MainActivity.this;
                        final EditText editText3 = editText;
                        access$0.timer_5 = new TimerTask() {
                            public void run() {
                                MainActivity access$0 = MainActivity.this;
                                final EditText editText = editText3;
                                access$0.runOnUiThread(new Runnable() {
                                    public void run() {
                                        editText.setEnabled(true);
                                        editText.requestFocus();
                                        ((InputMethodManager) MainActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                                        EditText editText = editText;
                                        editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                                        try {
                                            EditText editText2 = editText;
                                            editText2.setSelection(editText2.getText().toString().length(), editText.getText().toString().length());
                                        } catch (Exception unused) {
                                        }
                                    }
                                });
                            }
                        };
                        MainActivity.this._timer.schedule(MainActivity.this.timer_5, 50);
                    }
                });
            }
        };
        this.timer_5 = r1;
        this._timer.schedule(r1, 50);
        textView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "تم النسخ");
                MainActivity mainActivity = MainActivity.this;
                mainActivity.getApplicationContext();
                ((ClipboardManager) mainActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("clipboard", String.valueOf((long) MainActivity.this.Passer)));
            }
        });
        editText.setInputType(12290);
        alertDialog2.setCancelable(false);
        alertDialog2.setView(linearLayout7);
        alertDialog2.show();
        alertDialog2.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        alertDialog2.getWindow().setLayout(-1, -2);
    }

    public void _dialog_enter(String str, String str2) {
        AlertDialog create = new AlertDialog.Builder(this).create();
        View inflate = getLayoutInflater().inflate(R.layout.costam_cokk, (ViewGroup) null);
        create.setView(inflate);
        create.requestWindowFeature(1);
        create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        TextView textView = (TextView) inflate.findViewById(R.id.textview34);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.linear1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.textview2);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.linear2);
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R.id.linear9_pon);
        Button button = (Button) inflate.findViewById(R.id.send);
        Button button3 = (Button) inflate.findViewById(R.id.but_cancel);
        TextView textView3 = (TextView) inflate.findViewById(R.id.text_frend_id);
        TextView textView4 = (TextView) inflate.findViewById(R.id.textview3);
        TextView textView5 = (TextView) inflate.findViewById(R.id.kodenegara);
        final EditText editText = (EditText) inflate.findViewById(R.id.phone);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.omab);
        AlertDialog alertDialog = create;
        TextView textView6 = (TextView) inflate.findViewById(R.id.text_divaice);
        ((LinearLayout) inflate.findViewById(R.id.linearphone)).setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(8, 2, ViewCompat.MEASURED_STATE_MASK, -1));
        button.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 1, ViewCompat.MEASURED_STATE_MASK, -14575885));
        button3.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2, int i3, int i4) {
                setCornerRadius((float) i);
                setStroke(i2, i3);
                setColor(i4);
                return this;
            }
        }.getIns(20, 1, ViewCompat.MEASURED_STATE_MASK, -720809));
        try {
            textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            button.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            button3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            editText.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView5.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView4.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
            textView.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/font.ttf"), 1);
        } catch (Exception unused) {
        }
        editText.setText(BuildConfig.FLAVOR);
        editText.setTextIsSelectable(true);
        textView2.setText("رقم الجهاز >>");
        final TextView textView7 = textView6;
        textView7.setText("N35A".concat(str));
        try {
            textView.setTextSize(8.0f);
        } catch (Exception unused2) {
        }
        final EditText editText2 = editText;
        final String str3 = str2;
        final String str4 = str;
        final AlertDialog alertDialog2 = alertDialog;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!editText2.getText().toString().equals(str3)) {
                    MainActivity.this.codee.edit().putString("Cod", str4).commit();
                    SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "تم التفعيل بنجاح ✓".concat(BuildConfig.FLAVOR));
                    MainActivity mainActivity = MainActivity.this;
                    final AlertDialog alertDialog = alertDialog2;
                    final EditText editText = editText2;
                    mainActivity.timer_5 = new TimerTask() {
                        public void run() {
                            MainActivity access$0 = MainActivity.this;
                            final AlertDialog alertDialog = alertDialog;
                            final EditText editText = editText;
                            access$0.runOnUiThread(new Runnable() {
                                public void run() {
                                    alertDialog.setCancelable(true);
                                    alertDialog.dismiss();
                                    editText.requestFocus();
                                    editText.setShowSoftInputOnFocus(false);
                                    editText.setEnabled(false);
                                    Intent intent = new Intent();
                                    intent.setClass(MainActivity.this.getApplicationContext(), HomeActivity.class);
                                    MainActivity.this.startActivity(intent);
                                    MainActivity.this.finish();
                                }
                            });
                        }
                    };
                    MainActivity.this._timer.schedule(MainActivity.this.timer_5, 1500);
                    return;
                }
                editText2.setText(BuildConfig.FLAVOR);
                editText2.setError("كود التفعيل ليس صحيحا يجب شراء كود التفعيل : للمزيد تواصل مع المبرمج +96777266391");
                editText2.setEnabled(true);
                editText2.requestFocus();
                ((InputMethodManager) MainActivity.this.getSystemService("input_method")).showSoftInput(editText2, 1);
                EditText editText2 = editText2;
                editText2.setSelection(editText2.getText().toString().length(), editText2.getText().toString().length());
                try {
                    EditText editText3 = editText2;
                    editText3.setSelection(editText3.getText().toString().length(), editText2.getText().toString().length());
                } catch (Exception unused) {
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.finishAffinity();
            }
        });
        alertDialog.show();
        AnonymousClass18 r0 = new TimerTask() {
            public void run() {
                MainActivity mainActivity = MainActivity.this;
                final EditText editText = editText;
                mainActivity.runOnUiThread(new Runnable() {
                    public void run() {
                        editText.setEnabled(true);
                        editText.requestFocus();
                        ((InputMethodManager) MainActivity.this.getSystemService("input_method")).showSoftInput(editText, 1);
                        EditText editText = editText;
                        editText.setSelection(editText.getText().toString().length(), editText.getText().toString().length());
                        try {
                            EditText editText2 = editText;
                            editText2.setSelection(editText2.getText().toString().length(), editText.getText().toString().length());
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };
        this.timer_5 = r0;
        this._timer.schedule(r0, 50);
        alertDialog.setCancelable(false);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.getApplicationContext();
                ((ClipboardManager) mainActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("clipboard", textView7.getText().toString()));
                SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "تم نسخ رقم الجهاز  :- ".concat(textView7.getText().toString()));
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.getApplicationContext();
                ((ClipboardManager) mainActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("clipboard", textView7.getText().toString()));
                SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "تم نسخ رقم الجهاز  :- ".concat(textView7.getText().toString()));
            }
        });
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
