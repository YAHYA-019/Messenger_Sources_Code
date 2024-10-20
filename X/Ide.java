package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.cameracore.camerasdk.common.CameraStateException;
import java.util.HashMap;
import java.util.List;

/* loaded from: Ide.class */
public final class Ide implements JG9 {
    public int A00;
    public JOi A01;
    public JJc A02;
    public Hqd A03;
    public JE3 A04;
    public H9F A05;
    public Hd8 A06;
    public I7e A07;
    public HlU A08;
    public JLI A09;
    public boolean A0A;
    public final IAe A0B;
    public final RQo A0C;
    public final Rls A0D;
    public final RtO A0E;
    public final I3k A0F;
    public final HoE A0G;
    public final I95 A0H;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.RQo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, X.Rls] */
    public Ide(Context context, Handler handler, H9F h9f, HoE hoE, I95 i95, JNZ jnz, boolean z) {
        ?? obj = new Object();
        JQ9 jq9 = i95.A01;
        String B51 = jq9.B51();
        JQ8 jq8 = hoE.A01;
        boolean z2 = !z ? !jq8.BSa(99) : !jq8.BSa(95);
        IeP A00 = HJZ.A00(context, handler, z ? H9N.A02 : H9N.A01, false);
        I3k i3k = new I3k(new Idf(A00), i95, A00, jnz, B51, z2);
        RtO rtO = new RtO();
        IAe iAe = new IAe(jq9);
        ?? obj2 = new Object();
        this.A0H = i95;
        this.A0G = hoE;
        this.A05 = h9f;
        this.A0F = i3k;
        this.A0E = rtO;
        this.A0B = iAe;
        this.A0D = obj2;
        this.A0C = obj;
        rtO.A00 = i3k;
        ((Rls) obj2).A00 = this;
        ((Rls) obj2).A01 = i3k;
        if (i3k.A05) {
            JNk jNk = i3k.A02;
            jNk.Cmc(-4);
            jNk.CpL(-1);
        }
        this.A0A = z;
    }

    public static void A00(Hqd hqd, JOg jOg, Ide ide) {
        I3k i3k = ide.A0F;
        JLJ ieH = new IeH(jOg, ide, 0);
        boolean z = !hqd.A0E;
        if (!I3k.A00(i3k)) {
            ieH.BwP(AbstractC2326GOr.A0m());
            return;
        }
        try {
            JNk jNk = i3k.A02;
            I3b i3b = new I3b();
            i3b.A01(I3b.A04, AnonymousClass001.A0K());
            i3b.A01(I3b.A07, Boolean.valueOf(z));
            jNk.D44(ieH, i3b);
        } catch (J77 unused) {
            ieH.BwP(AbstractC2326GOr.A0m());
        }
    }

    public static void A01(Ide ide, IBB ibb, IBB ibb2, IBB ibb3, int i) {
        ide.A05 = i == 1 ? H9F.FRONT : H9F.BACK;
        HlU hlU = ide.A08;
        if (hlU != null) {
            hlU.A00(ibb == null ? null : I5B.A00(ibb.A02, ibb.A01), ibb2 == null ? null : I5B.A00(ibb2.A02, ibb2.A01), ibb3 == null ? null : I5B.A00(ibb3.A02, ibb3.A01));
        }
    }

    public void A02() {
        I3k i3k = this.A0F;
        GuV guV = new GuV(this, 0);
        if (!I3k.A00(i3k)) {
            Ht4.A02(guV);
            return;
        }
        try {
            i3k.A02.D30(new C2411GcY(guV, i3k, 4), true);
        } catch (J77 unused) {
            Ht4.A02(guV);
        }
    }

    public void A03(Hqd hqd, Ht4 ht4) {
        boolean z;
        Number A0o;
        Number A0o2;
        I1R A01;
        I1R A012;
        I1R A013;
        I1R A014;
        I1R A015;
        Number A0o3;
        Number A0o4;
        I4E i4e = new I4E();
        HAQ haq = hqd.A04;
        if (haq == null || (A0o4 = 1BK.A0o(haq, RDY.A04)) == null || A0o4.intValue() == -1) {
            z = false;
        } else {
            i4e.A02(I82.A0D, A0o4);
            z = true;
        }
        HAP hap = hqd.A03;
        if (hap != null && (A0o3 = 1BK.A0o(hap, RDY.A02)) != null && A0o3.intValue() != -1) {
            i4e.A02(I82.A0B, A0o3);
            z = true;
        }
        Integer num = hqd.A0A;
        if (num != null && (A015 = this.A0F.A01()) != null) {
            int intValue = num.intValue() * 1000;
            List A1H = GOn.A1H(I1R.A11, A015);
            if (A1H != null && !A1H.isEmpty()) {
                int[] iArr = (int[]) A1H.get(0);
                int i = iArr[0];
                int i2 = iArr[1];
                for (int i3 = 1; i3 < A1H.size(); i3++) {
                    int[] iArr2 = (int[]) A1H.get(i3);
                    int i4 = iArr2[0];
                    int i5 = iArr2[1];
                    if (i2 > intValue ? i5 <= intValue || i5 < i2 || (i5 == i2 && i4 < i) : i5 <= intValue && (i5 > i2 || (i5 == i2 && i4 < i))) {
                        iArr = iArr2;
                        i = i4;
                        i2 = i5;
                    }
                }
                i4e.A02(I82.A0n, iArr);
                z = true;
            }
        }
        Float f = hqd.A08;
        if (f != null && (A014 = this.A0F.A01()) != null && GOp.A1Y(I1R.A0J, A014)) {
            float floatValue = f.floatValue();
            float A00 = 7zM.A00(A014.A02(I1R.A03));
            float A0C = GOq.A0C(I1R.A0n, A014) * A00;
            float A0C2 = GOq.A0C(I1R.A0j, A014) * A00;
            if (floatValue < A0C) {
                floatValue = A0C;
            } else if (floatValue > A0C2) {
                floatValue = A0C2;
            }
            I4E.A00(I82.A09, i4e, GOn.A04(floatValue, A00));
            z = true;
        }
        Boolean bool = hqd.A07;
        if (bool != null && (A013 = this.A0F.A01()) != null && GOp.A1Y(I1R.A0M, A013)) {
            i4e.A02(I82.A0U, bool);
            z = true;
        }
        Boolean bool2 = hqd.A06;
        if (bool2 != null && (A012 = this.A0F.A01()) != null && GOp.A1Y(I1R.A05, A012)) {
            i4e.A02(I82.A0M, bool2);
            z = true;
        }
        HashMap hashMap = hqd.A0B;
        if (hashMap != null && (A01 = this.A0F.A01()) != null && GOp.A1Y(I1R.A00, A01)) {
            i4e.A02(I82.A02, hashMap);
            z = true;
        }
        HAg hAg = hqd.A05;
        if (hAg != null && (A0o2 = 1BK.A0o(hAg, RDY.A05)) != null && A0o2.intValue() != -1) {
            i4e.A02(I82.A0z, A0o2);
            z = true;
        }
        H9q h9q = hqd.A02;
        if (h9q != null && (A0o = 1BK.A0o(h9q, RDY.A00)) != null && A0o.intValue() != -1) {
            i4e.A02(I82.A00, A0o);
        } else if (!z) {
            ht4.A04(null);
            return;
        }
        this.A0F.A02(new C2411GcY(ht4, this, 0), i4e.A01());
    }

    public void A04(RQo rQo, Ht4 ht4) {
        int i;
        if (rQo == null || (i = rQo.A00) <= 0) {
            return;
        }
        I4E i4e = new I4E();
        I4E.A00(I82.A0L, i4e, i);
        this.A0F.A02(ht4, i4e.A01());
    }

    @Override // X.JG9
    public void BwL(J7E j7e) {
        int i;
        int i2 = j7e.mCameraError;
        String message = j7e.getMessage();
        if (i2 == 2 || i2 == 100) {
            this.A01 = null;
            this.A08 = null;
            this.A06 = null;
            this.A09 = null;
            JJc jJc = this.A02;
            if (jJc != null) {
                jJc.BnH(Gtz.A00(0Pz.A0E(i2, "Video recording failed - Code:", " - ", message)));
                this.A02 = null;
            }
        }
        JE3 je3 = this.A04;
        if (je3 != null) {
            boolean z = true;
            if (i2 == 2) {
                i = 10007;
            } else {
                i = 10008;
                if (i2 != 100) {
                    i = 10009;
                    z = false;
                }
            }
            je3.BmR(new CameraStateException(message, null, i, z));
            this.A04 = null;
        }
    }
}
