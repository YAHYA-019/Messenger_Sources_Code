package X;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.video.engine.api.VideoDataSource;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.Gld, reason: case insensitive filesystem */
/* loaded from: Gld.class */
public final class C2691Gld extends C1rj {
    public static final CallerContext A0F = CallerContext.A0B("BKBloksVideoLithoComponent");
    public float A00;
    public int A01;
    public Uri A02;
    public Uri A03;
    public Uri A04;
    public 6TJ A05;
    public C03353xs A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public C2691Gld() {
        super("BKBloksVideoLithoComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A07, Boolean.valueOf(this.A0B), this.A02, Integer.valueOf(this.A01), Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0D), this.A08, this.A05, Boolean.valueOf(this.A0E), this.A09, this.A06, Float.valueOf(this.A00), this.A03, this.A0A, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A0A;
        float f = this.A00;
        int i = this.A01;
        Uri uri = this.A04;
        Uri uri2 = this.A03;
        Uri uri3 = this.A02;
        boolean z = this.A0B;
        boolean z2 = this.A0C;
        boolean z3 = this.A0D;
        String str2 = this.A07;
        String str3 = this.A08;
        String str4 = this.A09;
        6TJ r0 = this.A05;
        boolean z4 = this.A0E;
        C03353xs c03353xs = this.A06;
        6TN r02 = 6TN.A0F;
        Context context = r302.A0D;
        FbUserSession A0C = 4YV.A0C(context);
        Parcelable.Creator creator = VideoDataSource.CREATOR;
        6A9 r03 = new 6A9();
        r03.A03 = uri;
        r03.A02 = uri2;
        r03.A01 = uri3;
        r03.A07 = str2;
        r03.A04 = 6AB.A05;
        VideoDataSource videoDataSource = new VideoDataSource(r03);
        6TA r04 = new 6TA();
        r04.A1g = true;
        r04.A0U = videoDataSource;
        r04.A1B = true;
        r04.A0k = z;
        r04.A1h = z2;
        r04.A0L = i;
        r04.A03(str);
        if (c03353xs != null) {
            r04.A0X = c03353xs;
        }
        6TF A0L = AbstractC2327GOs.A0L(A0C, r04);
        A0L.A00 = f;
        CallerContext callerContext = A0F;
        A0L.A02 = callerContext;
        6TI A01 = A0L.A01();
        GR2 gr2 = new GR2();
        C52j c52j = C52j.A09;
        gr2.A04(c52j, z);
        gr2.A03(c52j, z3);
        ArrayList A17 = 1BK.A17(Collections.singletonList(((C9Mg) 1Bn.A0E(context, (1BY) null, 67991)).A01.get()));
        if (z4) {
            A17.add(1Bn.A0E(context, (1BY) null, 67957));
        }
        GR6 A00 = GR5.A00(r302);
        A00.A2a(gr2);
        A00.A2Z(RV2.A00(str3, str4));
        A00.A2Y(r02);
        A00.A2b(A01);
        A00.A2X(f);
        GR5 gr5 = A00.A01;
        gr5.A0J = A17;
        gr5.A04 = callerContext;
        A00.A1u(z ? 1LI.A09(r302, C2691Gld.class, "BKBloksVideoLithoComponent", 474447108) : null);
        if (r0 != null) {
            gr5.A0H = ImmutableList.of((Object) r0);
        }
        return A00.A2W();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0093, code lost:
    
        if (r0.A06().A00() == false) goto L10;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2691Gld.A15(X.1Im, java.lang.Object):java.lang.Object");
    }
}
