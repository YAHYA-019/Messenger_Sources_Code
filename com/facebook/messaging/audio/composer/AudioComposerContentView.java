package com.facebook.messaging.audio.composer;

import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1Bn;
import X.2OB;
import X.4YT;
import X.5II;
import X.7zL;
import X.7zR;
import X.AbG;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C09s;
import X.C0dp;
import X.C1pl;
import X.C2cd;
import X.C62j;
import X.C62l;
import X.C66h;
import X.C66i;
import X.DP1;
import X.GOo;
import X.GOq;
import X.H0T;
import X.HH1;
import X.HMI;
import X.Hlp;
import X.IKm;
import X.QTd;
import X.QTe;
import X.QTf;
import X.QTg;
import X.QTh;
import X.QTr;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomRelativeLayout;
import com.facebook.widget.text.SimpleVariableTextLayoutView;
import java.util.Random;

/* loaded from: AudioComposerContentView.class */
public final class AudioComposerContentView extends CustomRelativeLayout {
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public Animation A0D;
    public HH1 A0E;
    public C0dp A0F;
    public Hlp A0G;
    public 5II A0H;
    public FbSharedPreferences A0I;
    public FbTextView A0J;
    public FbTextView A0K;
    public C66i A0L;
    public C66i A0M;
    public C66i A0N;
    public C66i A0O;
    public C66i A0P;
    public C66i A0Q;
    public C62l A0R;
    public C1pl A0S;
    public SimpleVariableTextLayoutView A0T;
    public Integer A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public C62j A0d;
    public String A0e;
    public String A0f;
    public static final C66h A0h = C66h.A03(100.0d, 7.0d);
    public static final Random A0g = new Random(1408665074);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioComposerContentView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A0U = 0S2.A00;
        A02();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioComposerContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A0U = 0S2.A00;
        A02();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioComposerContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0U = 0S2.A00;
        A02();
    }

    private final float A00() {
        DP1 dp1 = this.A0T;
        String str = "redRecordButton";
        if (dp1 != null) {
            float top = dp1.getTop();
            DP1 dp12 = this.A0T;
            if (dp12 != null) {
                int height = dp12.getHeight();
                View view = this.A0B;
                if (view != null) {
                    return top + AbstractC2327GOs.A03(view, height);
                }
                str = "timerViewContainer";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    private final C66i A01() {
        C62j c62j = this.A0d;
        if (c62j == null) {
            11T.A0L("springSystem");
            throw 0Q8.createAndThrow();
        }
        C66i c66i = new C66i(c62j);
        c66i.A09(A0h);
        return c66i;
    }

    private final void A02() {
        String str;
        String str2;
        Resources resources = getResources();
        this.A02 = 7zL.A01(resources, 2131165270);
        this.A01 = 7zL.A01(resources, 2131165269);
        A0C(2132542855);
        this.A0F = 7zR.A0G();
        this.A0R = (C62l) 1Bi.A03(131273);
        this.A0d = (C62j) 1Bn.A0A(49939);
        this.A0I = 1BL.A0W();
        this.A0H = (5II) 1Bi.A03(68025);
        this.A0E = (HH1) 1Bi.A03(116216);
        this.A0J = GOo.A0X(this, 2131362138);
        this.A0K = GOo.A0X(this, 2131362157);
        this.A0B = C09s.A01(this, 2131362156);
        this.A0T = (SimpleVariableTextLayoutView) C09s.A01(this, 2131362135);
        this.A0C = C09s.A01(this, 2131362154);
        this.A0A = C09s.A01(this, 2131366874);
        this.A09 = C09s.A01(this, 2131362159);
        DP1 dp1 = this.A0T;
        if (dp1 != null) {
            IKm.A00(dp1, this, 2);
            this.A0S = new H0T(this, 0);
            Context context = getContext();
            this.A0X = 1BK.A0u(context, 2131952951);
            this.A0V = 1BK.A0u(context, 2131952952);
            this.A0f = 1BK.A0u(context, 2131952935);
            this.A0W = 1BK.A0u(context, 2131952956);
            this.A0e = 1BK.A0u(context, 2131952955);
            this.A05 = context.getColor(2132213811);
            this.A06 = context.getColor(2132213791);
            this.A04 = context.getColor(2132213810);
            this.A0M = A01();
            this.A0Q = A01();
            this.A0L = A01();
            this.A0P = A01();
            this.A0O = A01();
            this.A0N = A01();
            if (this.A0E == null) {
                str2 = "correctnessTestConfig";
            } else {
                str = "recordButtonSpring";
                str2 = "timerSizeSpring";
                if (!HMI.A00) {
                    C66i c66i = this.A0M;
                    if (c66i == null) {
                        str2 = "redSpring";
                    } else {
                        c66i.A0A(new QTe(this));
                        C66i c66i2 = this.A0Q;
                        if (c66i2 == null) {
                            str2 = "whiteSpring";
                        } else {
                            c66i2.A0A(new QTh(this));
                            C66i c66i3 = this.A0L;
                            if (c66i3 != null) {
                                c66i3.A0A(new QTd(this));
                                C66i c66i4 = this.A0P;
                                if (c66i4 == null) {
                                    str2 = "volumeIndicatorSpring";
                                } else {
                                    c66i4.A0A(new QTg(this));
                                    C66i c66i5 = this.A0O;
                                    if (c66i5 == null) {
                                        str2 = "timerSpring";
                                    } else {
                                        c66i5.A0A(new QTr(this));
                                        C66i c66i6 = this.A0N;
                                        if (c66i6 != null) {
                                            c66i6.A0A(new QTf(this));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C66i c66i7 = this.A0N;
                if (c66i7 != null) {
                    GOq.A1I(c66i7);
                    C66i c66i8 = this.A0L;
                    if (c66i8 != null) {
                        c66i8.A03();
                        c66i8.A02();
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_in);
                        11T.A0A(loadAnimation);
                        this.A0D = loadAnimation;
                        2OB r0 = this.A0K;
                        if (r0 == null) {
                            str = "timerView";
                        } else {
                            A03(r0, this, 0);
                            2OB r02 = this.A0J;
                            if (r02 != null) {
                                A03(r02, this, 0);
                                return;
                            }
                            str = "hintView";
                        }
                    }
                }
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
        str = "redRecordButton";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A03(TextView textView, AudioComposerContentView audioComposerContentView, int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i3);
        textView.setText(StringFormatUtil.formatStrLocaleSafe("%d:%02d", valueOf, valueOf2));
        StringBuilder A0k = AnonymousClass001.A0k();
        if (i2 > 0) {
            AbG.A1F(audioComposerContentView.getResources(), A0k, 2131952948);
            A0k.append(" ");
        }
        textView.setContentDescription(AnonymousClass001.A0d(audioComposerContentView.getResources().getQuantityString(2131820563, i3, valueOf2), A0k));
    }

    public static final void A04(AudioComposerContentView audioComposerContentView) {
        if (audioComposerContentView.A00 == 0.0d) {
            int width = audioComposerContentView.getWidth();
            int height = audioComposerContentView.getHeight();
            double sqrt = Math.sqrt((width * width) + (height * height));
            if (audioComposerContentView.A0T == null) {
                11T.A0L("redRecordButton");
                throw 0Q8.createAndThrow();
            }
            audioComposerContentView.A00 = (sqrt / r0.getWidth()) + 1.0d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (((int) (r0.now() - r301.A08)) > 2000) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A05(com.facebook.messaging.audio.composer.AudioComposerContentView r301) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.audio.composer.AudioComposerContentView.A05(com.facebook.messaging.audio.composer.AudioComposerContentView):void");
    }

    public static final void A06(AudioComposerContentView audioComposerContentView) {
        audioComposerContentView.A0U = 0S2.A00;
        Hlp hlp = audioComposerContentView.A0G;
        if (hlp == null) {
            throw 1BK.A0h();
        }
        hlp.A00();
        C66i c66i = audioComposerContentView.A0L;
        if (c66i == null) {
            11T.A0L("recordButtonSpring");
            throw 0Q8.createAndThrow();
        }
        c66i.A03();
        c66i.A02();
    }

    public static final void A07(AudioComposerContentView audioComposerContentView) {
        String str;
        A09(audioComposerContentView);
        A0A(audioComposerContentView);
        View view = audioComposerContentView.A0B;
        if (view != null) {
            view.setVisibility(0);
            2OB r0 = audioComposerContentView.A0J;
            String str2 = "hintView";
            if (r0 != null) {
                r0.setTextColor(audioComposerContentView.A06);
                2OB r02 = audioComposerContentView.A0J;
                if (r02 != null) {
                    CharSequence charSequence = audioComposerContentView.A0f;
                    if (charSequence == null) {
                        str2 = "releaseHintString";
                    } else {
                        r02.setText(charSequence);
                        2OB r03 = audioComposerContentView.A0K;
                        if (r03 != null) {
                            r03.setTextColor(audioComposerContentView.A05);
                            return;
                        }
                        str = "timerView";
                    }
                }
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
        str = "timerViewContainer";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A08(AudioComposerContentView audioComposerContentView) {
        String str;
        A09(audioComposerContentView);
        A0B(audioComposerContentView);
        C66i c66i = audioComposerContentView.A0O;
        if (c66i == null) {
            str = "timerSpring";
        } else {
            c66i.A07(audioComposerContentView.A00());
            C66i c66i2 = audioComposerContentView.A0N;
            if (c66i2 != null) {
                c66i2.A04();
                2OB r0 = audioComposerContentView.A0J;
                String str2 = "hintView";
                if (r0 != null) {
                    r0.setVisibility(0);
                    2OB r02 = audioComposerContentView.A0J;
                    if (r02 != null) {
                        r02.setTextColor(audioComposerContentView.A05);
                        2OB r03 = audioComposerContentView.A0J;
                        if (r03 != null) {
                            CharSequence charSequence = audioComposerContentView.A0V;
                            if (charSequence == null) {
                                str2 = "maxLengthString";
                            } else {
                                r03.setText(charSequence);
                                2OB r04 = audioComposerContentView.A0K;
                                if (r04 == null) {
                                    str = "timerView";
                                } else {
                                    r04.setTextColor(audioComposerContentView.A06);
                                    5II r05 = audioComposerContentView.A0H;
                                    if (r05 == null) {
                                        str = "messengerSoundUtil";
                                    } else {
                                        r05.A0A(4YT.A00(197));
                                        SimpleVariableTextLayoutView simpleVariableTextLayoutView = audioComposerContentView.A0T;
                                        if (simpleVariableTextLayoutView != null) {
                                            simpleVariableTextLayoutView.A07("");
                                            return;
                                        }
                                        str = "redRecordButton";
                                    }
                                }
                            }
                        }
                    }
                }
                11T.A0L(str2);
                throw 0Q8.createAndThrow();
            }
            str = "timerSizeSpring";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A09(AudioComposerContentView audioComposerContentView) {
        String str;
        C62l c62l = audioComposerContentView.A0R;
        if (c62l == null) {
            str = "choreographer";
        } else {
            C1pl c1pl = audioComposerContentView.A0S;
            if (c1pl != null) {
                c62l.CeK(c1pl);
                return;
            }
            str = "frameCallback";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A0A(AudioComposerContentView audioComposerContentView) {
        String str;
        if (audioComposerContentView.A0E == null) {
            str = "correctnessTestConfig";
        } else {
            if (HMI.A00) {
                return;
            }
            A04(audioComposerContentView);
            View view = audioComposerContentView.A0B;
            if (view == null) {
                str = "timerViewContainer";
            } else {
                view.setVisibility(0);
                C66i c66i = audioComposerContentView.A0O;
                if (c66i == null) {
                    str = "timerSpring";
                } else {
                    c66i.A07(audioComposerContentView.A00());
                    C66i c66i2 = audioComposerContentView.A0N;
                    if (c66i2 == null) {
                        str = "timerSizeSpring";
                    } else {
                        c66i2.A04();
                        DP1 dp1 = audioComposerContentView.A0T;
                        if (dp1 == null) {
                            str = "redRecordButton";
                        } else {
                            dp1.setVisibility(4);
                            View view2 = audioComposerContentView.A0A;
                            if (view2 != null) {
                                view2.setVisibility(0);
                                C66i c66i3 = audioComposerContentView.A0M;
                                String str2 = "redSpring";
                                if (c66i3 != null) {
                                    c66i3.A06 = false;
                                    c66i3.A07(audioComposerContentView.A00);
                                    View view3 = audioComposerContentView.A0C;
                                    if (view3 == null) {
                                        str = "whiteRecordButton";
                                    } else {
                                        view3.setVisibility(0);
                                        C66i c66i4 = audioComposerContentView.A0Q;
                                        if (c66i4 == null) {
                                            str = "whiteSpring";
                                        } else {
                                            c66i4.A04();
                                            2OB r0 = audioComposerContentView.A0J;
                                            str = "hintView";
                                            if (r0 != null) {
                                                r0.setTextColor(audioComposerContentView.A06);
                                                2OB r02 = audioComposerContentView.A0J;
                                                if (r02 != null) {
                                                    CharSequence charSequence = audioComposerContentView.A0f;
                                                    str2 = "releaseHintString";
                                                    if (charSequence != null) {
                                                        r02.setText(charSequence);
                                                        2OB r03 = audioComposerContentView.A0J;
                                                        if (r03 != null) {
                                                            r03.setVisibility(0);
                                                            String str3 = audioComposerContentView.A0f;
                                                            if (str3 != null) {
                                                                C2cd.A05(audioComposerContentView, str3);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                11T.A0L(str2);
                                throw 0Q8.createAndThrow();
                            }
                            str = "redBackgroundAnimation";
                        }
                    }
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public static final void A0B(AudioComposerContentView audioComposerContentView) {
        String str;
        if (audioComposerContentView.A0E != null) {
            if (HMI.A00) {
                return;
            }
            DP1 dp1 = audioComposerContentView.A0T;
            String str2 = "redRecordButton";
            if (dp1 != null) {
                dp1.setVisibility(0);
                SimpleVariableTextLayoutView simpleVariableTextLayoutView = audioComposerContentView.A0T;
                if (simpleVariableTextLayoutView != null) {
                    String str3 = audioComposerContentView.A0X;
                    if (str3 == null) {
                        str2 = "recordButtonString";
                    } else {
                        simpleVariableTextLayoutView.A07(str3);
                        C66i c66i = audioComposerContentView.A0M;
                        str2 = "redSpring";
                        if (c66i != null) {
                            c66i.A06 = true;
                            c66i.A07(0.0d);
                            C66i c66i2 = audioComposerContentView.A0Q;
                            if (c66i2 == null) {
                                str = "whiteSpring";
                            } else {
                                c66i2.A07(0.0d);
                                C66i c66i3 = audioComposerContentView.A0O;
                                if (c66i3 == null) {
                                    str = "timerSpring";
                                } else {
                                    DP1 dp12 = audioComposerContentView.A0T;
                                    if (dp12 == null) {
                                        str2 = str2;
                                    } else {
                                        int top = dp12.getTop();
                                        if (audioComposerContentView.A0B == null) {
                                            str2 = "timerViewContainer";
                                        } else {
                                            c66i3.A07(AbstractC2327GOs.A03(r0, top));
                                            C66i c66i4 = audioComposerContentView.A0N;
                                            if (c66i4 != null) {
                                                c66i4.A07(0.0d);
                                                A05(audioComposerContentView);
                                                return;
                                            }
                                            str = "timerSizeSpring";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            11T.A0L(str2);
            throw 0Q8.createAndThrow();
        }
        str = "correctnessTestConfig";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public final void A0D(double d) {
        C66i c66i = this.A0P;
        if (c66i == null) {
            11T.A0L("volumeIndicatorSpring");
            throw 0Q8.createAndThrow();
        }
        double nextDouble = d >= 250.0d ? 0.25d * (0.10000000149011612d + ((0.5d - A0g.nextDouble()) * 0.05000000074505806d)) : 0.0d;
        c66i.A07(Math.min(Math.max(nextDouble, 1.0d), Math.max(Math.min(nextDouble, 1.0d), d / 12000.0d)));
    }
}
