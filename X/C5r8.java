package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.rti.orca.FbnsLiteInitializer;

/* renamed from: X.5r8, reason: invalid class name */
/* loaded from: 5r8.class */
public final class C5r8 {
    public final Context A00;
    public final C01443r5 A01;
    public final C00i A02;
    public final C00i A03;
    public final 4AW A04;
    public final C3r6 A05;
    public final 4AX A06;
    public final 1OX A07;
    public final 05S A08;
    public final C09D A09;
    public final FbnsLiteInitializer A0A;

    public C5r8() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A01 = (C01443r5) 1Bi.A03(32798);
        this.A07 = (1OX) 1Bi.A03(16614);
        this.A06 = (4AX) 1Bi.A03(32933);
        this.A04 = (4AW) 1Bi.A03(32932);
        this.A0A = (FbnsLiteInitializer) 1Bi.A03(38);
        this.A05 = (C3r6) 1Bi.A03(65904);
        this.A03 = new 1BQ(83846);
        this.A02 = new 1BQ(16385);
        C01s c01s = (C01s) 1Bi.A03(16511);
        A00.getClass();
        this.A08 = new 05S(A00, c01s, (05L) null, (Boolean) null);
        AnonymousClass096 anonymousClass096 = (AnonymousClass096) C08r.A00;
        A00.getApplicationContext();
        this.A09 = anonymousClass096.A02().A00(A00.getApplicationContext(), 0Pz.A0W("rti.mqtt.", "token_store"));
    }
}
