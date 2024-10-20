package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.GoU, reason: case insensitive filesystem */
/* loaded from: GoU.class */
public final class C2794GoU extends H6A {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final 7Mg A03;
    public final ICk A04;
    public final Context A05;
    public final 1CO A06;
    public final 1Rv A07;

    public C2794GoU(Context context, 06Z r303, 7Mg r304, ICk iCk, 1Rv r306, int i, int i2) {
        super(r303);
        1CO A0e = AbJ.A0e();
        this.A05 = context;
        iCk.getClass();
        this.A04 = iCk;
        this.A06 = A0e;
        this.A07 = r306;
        this.A02 = i;
        this.A03 = r304;
        this.A01 = i2;
    }

    @Override // X.GY8
    public Parcelable A07() {
        Bundle bundle = (Bundle) super.A07();
        if (bundle != null) {
            bundle.putParcelableArray("states", null);
        }
        return bundle;
    }

    public int A0C() {
        return this.A04.A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (r309 == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A0D(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A00
            r303 = r0
            r0 = -2
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L73
            r0 = r302
            boolean r0 = r0 instanceof X.C2397Gbz
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L73
            r0 = r301
            X.ICk r0 = r0.A04
            r305 = r0
            r0 = r302
            X.Gbz r0 = (X.C2397Gbz) r0
            r302 = r0
            r0 = r302
            com.facebook.messaging.montage.model.MontageBucket r0 = r0.A0N
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 != 0) goto L58
            r0 = 0
            r309 = r0
        L31:
            r0 = r302
            com.facebook.messaging.montage.model.MontageBucket r0 = r0.A0O
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L4a
            r0 = r306
            com.facebook.messaging.montage.model.MontageBucketKey r0 = r0.A01
            r306 = r0
            r0 = r306
            long r0 = r0.A00
            r309 = r0
        L4a:
            r0 = r305
            r1 = r309
            int r0 = r0.A04(r1)
            r303 = r0
            r0 = r303
            if (r0 < 0) goto L73
            r0 = r303
            return r0
        L58:
            r0 = r306
            com.facebook.messaging.montage.model.MontageBucketKey r0 = r0.A01
            r306 = r0
            r0 = r306
            long r0 = r0.A00
            r309 = r0
            r0 = r309
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L4a
            goto L31
        L73:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2794GoU.A0D(java.lang.Object):int");
    }

    @Override // X.GY8
    public Object A0E(ViewGroup viewGroup, int i) {
        Object obj = (Fragment) super.A0E(viewGroup, i);
        ICk iCk = this.A04;
        if (iCk != null && (obj instanceof C2397Gbz)) {
            ((C2397Gbz) obj).A0b = iCk.A08;
        }
        return obj;
    }

    @Override // X.GY8
    public void A0F(ViewGroup viewGroup, Object obj, int i) {
        C2397Gbz c2397Gbz;
        super.A0F(viewGroup, obj, i);
        ICk iCk = this.A04;
        IAR A06 = iCk.A06(i);
        if (A06 != null && A06.A00 == 1 && (c2397Gbz = (C2397Gbz) GY8.A00(this, i)) != null) {
            c2397Gbz.A1j(true);
        }
        int i2 = i;
        while (true) {
            int i3 = i2 - 1;
            if (i3 < 0) {
                break;
            }
            IAR A062 = iCk.A06(i3);
            if (A062 != null && A062.A00 == 1) {
                C2397Gbz c2397Gbz2 = (C2397Gbz) GY8.A00(this, i3);
                if (c2397Gbz2 == null) {
                    break;
                } else {
                    c2397Gbz2.A1j(false);
                }
            }
            i2 = i3;
        }
        while (true) {
            i++;
            if (i >= iCk.A03()) {
                return;
            }
            IAR A063 = iCk.A06(i);
            if (A063 != null && A063.A00 == 1) {
                C2397Gbz c2397Gbz3 = (C2397Gbz) GY8.A00(this, i);
                if (c2397Gbz3 == null) {
                    return;
                } else {
                    c2397Gbz3.A1j(false);
                }
            }
        }
    }

    @Override // X.GY8
    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        try {
            super.A0G(viewGroup, obj, i);
        } catch (IllegalStateException e) {
            0fH.A0w("MontageViewerThreadPagerAdapter", "Failed to destroy fragment", e);
        }
    }
}
