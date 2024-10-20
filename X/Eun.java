package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.HashMap;

/* loaded from: Eun.class */
public final class Eun {
    public F63 A00;
    public F63 A01;
    public final Eum A02;
    public final RHp A03;
    public final FyG A04;

    public Eun(Eum eum, FyG fyG) {
        this.A04 = fyG;
        this.A02 = eum;
        this.A03 = new RHp(fyG);
    }

    public final 2AS A00(View view, DLQ dlq) {
        int i;
        int i2;
        F63 A03;
        DLQ A06 = dlq.A06(43);
        if (A06 == null) {
            throw AnonymousClass001.A0L("Server should have ensured that the Tooltip Container always has a Tooltip.");
        }
        float A00 = F2W.A00(A06, 49);
        float A002 = F2W.A00(A06, 43);
        Resources resources = view.getResources();
        float f = resources.getDisplayMetrics().widthPixels * 0.8f;
        FyG fyG = this.A04;
        Context A01 = FyG.A01(fyG);
        float min = Math.min(f, R4G.A00(A01, 300.0f));
        if (A00 == 0.0f) {
            i = (int) min;
            int i3 = C1tN.A00;
            i2 = (-1) << (-1);
            float f2 = -0.0f;
        } else {
            i = (int) A00;
            int i4 = C1tN.A00;
            i2 = 1073741824;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, i2);
        int A003 = A002 == 0.0f ? C1tN.A00 : DKD.A00((int) A002);
        Eum eum = this.A02;
        eum.A00 = null;
        F9S f9s = F63.A04;
        F63 A032 = f9s.A03(f9s.A01(A01, this.A01, fyG, (C23e[]) null, -1), A06, (Object) null, 23U.A00(makeMeasureSpec, A003));
        this.A01 = A032;
        2AS r0 = A032.A01;
        int A012 = r0.A01();
        int A004 = r0.A00();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        EzP ezP = new EzP(displayMetrics.widthPixels, displayMetrics.heightPixels, iArr[0], iArr[1], view.getWidth(), view.getHeight(), A012, A004, R4F.A00(4YU.A08(view)));
        RHp rHp = this.A03;
        HashMap hashMap = rHp.A01;
        Ez1 ez1 = (Ez1) hashMap.get(ezP);
        if (ez1 == null) {
            GJj AlB = dlq.AlB(40);
            if (AlB == null) {
                throw AnonymousClass001.A0L("Server should have ensured that the Tooltip Container always has on-compute-position.");
            }
            FyG fyG2 = rHp.A00;
            Context context = fyG2.A00;
            11T.A0A(context);
            DKM A005 = DKM.A00();
            float f3 = ezP.A05;
            DisplayMetrics A0I = 7zO.A0I(context);
            11T.A0A(A0I);
            A005.A0J(Float.valueOf(f3 / A0I.density), 0);
            float f4 = ezP.A04;
            DisplayMetrics A0I2 = 7zO.A0I(context);
            11T.A0A(A0I2);
            A005.A0J(Float.valueOf(f4 / A0I2.density), 1);
            float f5 = ezP.A02;
            DisplayMetrics A0I3 = 7zO.A0I(context);
            11T.A0A(A0I3);
            A005.A0J(Float.valueOf(f5 / A0I3.density), 2);
            float f6 = ezP.A03;
            DisplayMetrics A0I4 = 7zO.A0I(context);
            11T.A0A(A0I4);
            A005.A0J(Float.valueOf(f6 / A0I4.density), 3);
            float f7 = ezP.A01;
            DisplayMetrics A0I5 = 7zO.A0I(context);
            11T.A0A(A0I5);
            A005.A0J(Float.valueOf(f7 / A0I5.density), 4);
            float f8 = ezP.A00;
            DisplayMetrics A0I6 = 7zO.A0I(context);
            11T.A0A(A0I6);
            A005.A0J(Float.valueOf(f8 / A0I6.density), 5);
            float f9 = ezP.A07;
            DisplayMetrics A0I7 = 7zO.A0I(context);
            11T.A0A(A0I7);
            A005.A0J(Float.valueOf(f9 / A0I7.density), 6);
            float f10 = ezP.A06;
            DisplayMetrics A0I8 = 7zO.A0I(context);
            11T.A0A(A0I8);
            A005.A0J(Float.valueOf(f10 / A0I8.density), 7);
            Object A013 = FAv.A01(dlq, fyG2, DKM.A07(A005, Boolean.valueOf(ezP.A08), 8), AlB);
            11T.A0A(A013);
            DLQ dlq2 = (DLQ) A013;
            11T.A0F(dlq2, 0);
            float Amm = dlq2.Amm(43, 0.0f);
            float Amm2 = dlq2.Amm(44, 0.0f);
            float Amm3 = dlq2.Amm(42, 0.0f);
            float Amm4 = dlq2.Amm(41, 0.0f);
            float Amm5 = dlq2.Amm(38, 0.0f);
            float Amm6 = dlq2.Amm(40, 0.0f);
            float Amm7 = dlq2.Amm(48, 0.0f);
            float Amm8 = dlq2.Amm(46, 0.0f);
            float Amm9 = dlq2.Amm(55, 0.0f);
            float Amm10 = dlq2.Amm(56, 0.0f);
            float Amm11 = dlq2.Amm(54, 0.0f);
            float Amm12 = dlq2.Amm(53, 0.0f);
            String string = dlq2.getString(45);
            for (EMt eMt : EMt.values()) {
                if (11T.A0O(eMt.value, string)) {
                    String A0C = dlq2.A0C();
                    for (EN3 en3 : EN3.values()) {
                        if (11T.A0O(en3.value, A0C)) {
                            ez1 = new Ez1(new RectF(R4G.A00(context, Amm), R4G.A00(context, Amm2), R4G.A00(context, Amm + Amm3), R4G.A00(context, Amm2 + Amm4)), new RectF(R4G.A00(context, Amm9), R4G.A00(context, Amm10), R4G.A00(context, Amm9 + Amm11), R4G.A00(context, Amm10 + Amm12)), new RectF(R4G.A00(context, Amm5), R4G.A00(context, Amm6), R4G.A00(context, Amm5 + Amm7), R4G.A00(context, Amm6 + Amm8)), en3, eMt);
                            hashMap.put(ezP, ez1);
                        }
                    }
                    throw 1BK.A0e();
                }
            }
            throw 1BK.A0e();
        }
        if (11T.A0O(eum.A00, ez1)) {
            A03 = this.A00;
            if (A03 == null) {
                return null;
            }
        } else {
            eum.A00 = ez1;
            F63 f63 = this.A00;
            11T.A0A(A01);
            C23d A014 = f9s.A01(A01, f63, fyG, (C23e[]) null, -1);
            RectF rectF = ez1.A02;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            A03 = f9s.A03(A014, A06, (Object) null, C23X.A00.A00(width, width, height, height));
            this.A00 = A03;
        }
        return A03.A01;
    }
}
