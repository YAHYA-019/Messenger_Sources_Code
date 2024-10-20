package X;

import android.net.Uri;

/* loaded from: AQt.class */
public final class AQt extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQt(Object obj, Object obj2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static Uri.Builder A00(String str, String str2) {
        return new Uri.Builder().scheme("fb-messenger").authority("community").appendQueryParameter("community_id", str).appendQueryParameter("threadkey", 0Pz.A0W("GROUP:", str2));
    }

    public static AQt A01(Object obj, Object obj2, int i) {
        return new AQt(obj, obj2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x1020, code lost:
    
        if (r0.Cj2(new X.N6u(3, r0, r0, r337)) == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00f6, code lost:
    
        if (r305 == null) goto L8;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C00m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 5360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AQt.invoke():java.lang.Object");
    }
}
