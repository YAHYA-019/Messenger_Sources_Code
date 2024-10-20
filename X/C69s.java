package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.69s, reason: invalid class name */
/* loaded from: 69s.class */
public final class C69s extends C69o {
    public 0CS A00;
    public 66O A01;
    public final 5CK A02;
    public final 2DJ A03;
    public final C00i A04;
    public final FbSharedPreferences A05;
    public final C15h A06;
    public final C15h A07;
    public final C15h A08;
    public final C01s A09;
    public final 82O A0A;

    public C69s(Context context, C01s c01s, 5CK r304, 2DJ r305, 82O r306, C00i c00i, FbSharedPreferences fbSharedPreferences, C15h c15h, C15h c15h2, C15h c15h3) {
        super(context, 1Bi.A06(ActionId.CARD_DATA_LOADED), 1Kr.A00(new Set[]{1Bi.A06(ActionId.VIEW_WILL_APPEAR_BEGIN), 1Bn.A0I(290)}));
        this.A04 = c00i;
        this.A06 = c15h3;
        this.A05 = fbSharedPreferences;
        this.A08 = c15h2;
        this.A07 = c15h;
        this.A0A = r306;
        this.A03 = r305;
        this.A09 = c01s;
        this.A02 = r304;
        this.A01 = new 66O();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r307 != null) goto L12;
     */
    @Override // X.C69o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1iL A01(X.C69w r302, java.lang.String r303) {
        /*
            r301 = this;
            r0 = r301
            X.66O r0 = r0.A01
            r304 = r0
            r0 = r304
            boolean r0 = r0.A04
            r305 = r0
            r0 = r302
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L91
            r0 = r301
            java.lang.Object r0 = r0.A03
            X.2Dp r0 = (X.2Dp) r0
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L4a
            r0 = r301
            java.lang.Object[] r0 = r0.A09
            X.2Dp[] r0 = (X.2Dp[]) r0
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L91
            r0 = r308
            int r0 = r0.length
            r305 = r0
            r0 = r305
            if (r0 <= 0) goto L91
            r0 = 0
            r305 = r0
            r0 = 0
            r309 = r0
            r0 = r308
            r1 = 0
            r0 = r0[r1]
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L91
        L4a:
            r0 = r301
            X.82O r0 = r0.A0A
            r309 = r0
            r0 = r301
            java.lang.Object r0 = r0.A04
            X.2Dp r0 = (X.2Dp) r0
            r310 = r0
            r0 = r301
            java.lang.Object r0 = r0.A02
            r311 = r0
            r0 = r309
            android.content.Context r0 = X.1Bf.A00(r0)
            r308 = r0
            X.6A3 r0 = new X.6A3     // Catch: java.lang.Throwable -> L84
            r312 = r0
            r0 = r312
            r1 = r304
            r2 = r306
            r3 = r307
            r4 = r310
            r5 = r311
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L84
            X.1Bn.A0K()     // Catch: java.lang.Throwable -> L84
            r0 = r308
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r312
            return r0
        L84:
            r309 = move-exception
            X.1Bn.A0K()
            r0 = r308
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r309
            throw r0
        L91:
            r0 = r301
            r1 = r302
            r2 = r303
            X.1iL r0 = super.A01(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69s.A01(X.69w, java.lang.String):X.1iL");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00db  */
    @Override // X.C69o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C69v A03() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69s.A03():X.69v");
    }

    @Override // X.C69o
    public void A05() {
        if (super.A02 == null) {
            this.A09.D11("FbDraweeControllerBuilder", "Controller built without a caller context");
        }
        super.A05();
    }

    public C69t A08() {
        Object obj;
        A05();
        if (super.A03 == null && super.A09 == null && (obj = super.A04) != null) {
            super.A03 = obj;
            super.A04 = null;
        }
        return (C69t) A03();
    }

    public void A09() {
        this.A01 = new 66O();
        super.A02 = null;
        super.A03 = null;
        super.A04 = null;
        super.A09 = null;
        super.A08 = true;
        super.A00 = null;
        super.A05 = false;
        super.A06 = false;
        super.A01 = null;
    }

    public void A0A(Uri uri) {
        2Dp A04;
        if (uri == null) {
            A04 = null;
        } else {
            2IA A01 = 2IA.A01(uri);
            A01.A07 = C2rD.A04;
            A04 = A01.A04();
        }
        super.A03 = A04;
    }

    public void A0B(InterfaceC06384gn interfaceC06384gn) {
        ArrayList arrayList;
        if (interfaceC06384gn == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(1);
            Collections.addAll(arrayList, interfaceC06384gn);
        }
        this.A00 = arrayList;
    }

    public void A0C(String str) {
        if (str == null || str.isEmpty()) {
            super.A03 = 2Dp.A01(str);
        } else {
            A0A(Uri.parse(str));
        }
    }
}
