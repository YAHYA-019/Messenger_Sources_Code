package com.facebook.messaging.photos.editing;

import X.09K;
import X.0S2;
import X.7zN;
import X.AnonymousClass001;
import X.C09s;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GOq;
import X.HAc;
import X.HRX;
import X.HUZ;
import X.Hiq;
import X.Hus;
import X.Hyw;
import X.IFl;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import com.facebook.messaging.font.FontAsset;
import com.facebook.messaging.montage.composer.doodle.TextColorLayout;
import com.facebook.messaging.photos.editing.layer.TextLayer;
import com.facebook.widget.CustomLinearLayout;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: TextStylesLayout.class */
public class TextStylesLayout extends CustomLinearLayout {
    public static final List A07;
    public static final List A08;
    public static final List A09;
    public HRX A00;
    public Hyw A01;
    public TextColorLayout A02;
    public Integer A03;
    public int A04;
    public int A05;
    public FontAsset A06;

    static {
        Integer A0h = 7zN.A0h();
        A09 = ImmutableList.of(GOn.A0G(A0h, -16777216), GOn.A0G(-16777216, A0h), GOn.A0G(-16743169, A0h), GOn.A0G(-15076914, A0h), GOn.A0G(-256, -12105984), GOn.A0G(-969435, A0h), GOn.A0G(-37802, A0h), GOn.A0G(-48762, A0h), GOn.A0G(-8963329, A0h), GOn.A0G(-15590232, A0h), GOn.A0G(-12856833, -16763321), GOn.A0G(-4456704, -16777216), GOn.A0G(-10824391, -16759225), GOn.A0G(-25823, A0h), GOn.A0G(-26990, -11010025), GOn.A0G(-5108150, A0h), GOn.A0G(-9395969, -16771001), GOn.A0G(-4143, -12112640), GOn.A0G(-15719, A0h), GOn.A0G(-7394296, A0h), GOn.A0G(-12247552, A0h), GOn.A0G(-1644826, A0h), GOn.A0G(-3355444, A0h), GOn.A0G(-5000269, A0h), GOn.A0G(-6710887, A0h), GOn.A0G(-10066330, A0h), GOn.A0G(-13421773, A0h), GOn.A0G(-15132391, -11776948));
        A08 = ImmutableList.of(GOn.A0G(A0h, -16777216), GOn.A0G(-16777216, A0h), GOn.A0G(-16743169, A0h), GOn.A0G(-15076914, A0h), GOn.A0G(-256, -12105984), GOn.A0G(-969435, A0h), GOn.A0G(-37802, A0h), GOn.A0G(-48762, A0h), GOn.A0G(-8963329, A0h), GOn.A0G(-15590232, A0h), GOn.A0G(-12856833, -16763321), GOn.A0G(-4456704, -16777216), GOn.A0G(-10824391, -16759225), GOn.A0G(-25823, A0h), GOn.A0G(-26990, -11010025), GOn.A0G(-5108150, A0h), GOn.A0G(-9395969, -16771001), GOn.A0G(-4143, -12112640), GOn.A0G(-15719, A0h), GOn.A0G(-7394296, A0h), GOn.A0G(-12247552, A0h), GOn.A0G(-1644826, A0h), GOn.A0G(-3355444, A0h), GOn.A0G(-5000269, A0h), GOn.A0G(-6710887, A0h), GOn.A0G(-10066330, A0h), GOn.A0G(-13421773, A0h), GOn.A0G(-15132391, -16777216));
        A07 = ImmutableList.of(GOn.A0G(-16743169, A0h), GOn.A0G(A0h, -16777216), GOp.A0B(-16743169, -16767673), GOn.A0G(-15076914, A0h), GOn.A0G(-256, -12105984), GOn.A0G(-969435, A0h), GOn.A0G(-37802, A0h), GOn.A0G(-48762, A0h), GOn.A0G(-8963329, A0h), GOn.A0G(-15590232, A0h), GOn.A0G(-12856833, -16763321), GOn.A0G(-4456704, -16777216), GOn.A0G(-10824391, -16759225), GOn.A0G(-25823, A0h), GOn.A0G(-26990, -11010025), GOn.A0G(-5108150, A0h), GOn.A0G(-9395969, -16771001), GOn.A0G(-4143, -12112640), GOn.A0G(-15719, A0h), GOn.A0G(-7394296, A0h), GOn.A0G(-12247552, A0h), GOn.A0G(-1644826, A0h), GOn.A0G(-3355444, A0h), GOn.A0G(-5000269, A0h), GOn.A0G(-6710887, A0h), GOn.A0G(-10066330, A0h), GOn.A0G(-13421773, A0h), GOn.A0G(-15132391, -11776948));
    }

    public TextStylesLayout(Context context) {
        super(context);
        A00();
    }

    public TextStylesLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public TextStylesLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        A0D(2132542453);
        this.A04 = 0;
        this.A03 = 0S2.A00;
        TextColorLayout textColorLayout = (TextColorLayout) C09s.A01(this, 2131367942);
        this.A02 = textColorLayout;
        textColorLayout.A06 = new HUZ(this);
    }

    private void A01() {
        HRX hrx = this.A00;
        if (hrx != null) {
            int i = this.A05;
            int i2 = this.A04;
            Integer num = this.A03;
            FontAsset fontAsset = this.A06;
            IFl iFl = hrx.A00;
            if (09K.A01(iFl.A0I.A01)) {
                return;
            }
            Hus hus = iFl.A0I;
            if (hus.A00() instanceof TextLayer) {
                TextLayer textLayer = (TextLayer) hus.A00();
                if (textLayer.A09 != num) {
                    textLayer.A09 = num;
                    if (num != null) {
                        textLayer.A0I.A02(HAc.A04);
                    }
                }
                if (textLayer.A04 != i) {
                    textLayer.A04 = i;
                    textLayer.A0I.A02(HAc.A06);
                }
                if (textLayer.A03 != i2) {
                    textLayer.A03 = i2;
                    textLayer.A0I.A02(HAc.A03);
                }
                if (textLayer.A07 != fontAsset) {
                    textLayer.A07 = fontAsset;
                    textLayer.A0I.A02(HAc.A07);
                }
            }
        }
    }

    public static void A02(TextStylesLayout textStylesLayout) {
        List list;
        int i;
        Hyw hyw = textStylesLayout.A01;
        boolean A1T = AnonymousClass001.A1T(hyw);
        int intValue = textStylesLayout.A03.intValue();
        if (intValue == 0) {
            textStylesLayout.A05 = A1T ? hyw.A01 : GOq.A06((Pair) TextColorLayout.A09.get(textStylesLayout.A02.A01));
            textStylesLayout.A04 = 0;
        } else if (intValue == 1) {
            textStylesLayout.A05 = A1T ? hyw.A02 : GOo.A02((Pair) A09.get(textStylesLayout.A02.A01));
            if (A1T) {
                i = textStylesLayout.A01.A00;
                textStylesLayout.A04 = i;
            } else {
                list = A09;
                i = GOo.A03((Pair) list.get(textStylesLayout.A02.A01));
                textStylesLayout.A04 = i;
            }
        } else if (intValue == 2) {
            List list2 = A08;
            textStylesLayout.A05 = GOo.A02((Pair) list2.get(textStylesLayout.A02.A01));
            i = (GOo.A03((Pair) list2.get(textStylesLayout.A02.A01)) & 16777215) | (-1526726656);
            textStylesLayout.A04 = i;
        } else if (intValue == 3) {
            list = A07;
            textStylesLayout.A05 = GOo.A02((Pair) list.get(textStylesLayout.A02.A01));
            i = GOo.A03((Pair) list.get(textStylesLayout.A02.A01));
            textStylesLayout.A04 = i;
        }
        textStylesLayout.A01();
    }

    public void A0E(Hiq hiq) {
        this.A06 = hiq.A04;
        A01();
        HRX hrx = this.A00;
        if (hrx != null) {
            float f = hiq.A00;
            float f2 = hiq.A02;
            float f3 = hiq.A01;
            IFl iFl = hrx.A00;
            if (!09K.A01(iFl.A0I.A01)) {
                Hus hus = iFl.A0I;
                if (hus.A00() instanceof TextLayer) {
                    ((TextLayer) hus.A00()).A0A(f, f2, f3);
                }
            }
        }
        int i = hiq.A03;
        HRX hrx2 = this.A00;
        if (hrx2 != null) {
            hrx2.A00.A0S(i);
        }
    }
}
