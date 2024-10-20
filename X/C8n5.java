package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;
import com.mapbox.mapboxsdk.R;
import java.util.BitSet;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8n5, reason: invalid class name */
/* loaded from: 8n5.class */
public final class C8n5 extends C1rj {
    public static final C6wj A0K = C6wj.A02;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public Fragment A05;
    public 2O4 A06;
    public 1Im A07;
    public 1Im A08;
    public C6wd A09;
    public 6tM A0A;
    public AnonymousClass784 A0B;
    public C6wj A0C;
    public C6qq A0D;
    public Integer A0E;
    public Function1 A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    public C8n5() {
        super("StickersViewPagerComponent");
        this.A01 = -1;
        this.A02 = 2132345419;
        this.A03 = 2132345316;
        this.A0C = A0K;
    }

    public final Object[] A0k() {
        return new Object[]{this.A0A, Boolean.valueOf(this.A0G), this.A05, this.A0E, Boolean.valueOf(this.A0H), this.A0F, -9473418, this.A06, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Boolean.valueOf(this.A0I), this.A0B, this.A09, this.A0D, Float.valueOf(100.0f), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A0C, Boolean.valueOf(this.A0J), this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        AnonymousClass784 anonymousClass784 = this.A0B;
        Integer num = this.A0E;
        int i = this.A02;
        int i2 = this.A03;
        int i3 = this.A00;
        int i4 = this.A01;
        boolean z = this.A0G;
        final String A0C = r302.A0C();
        final C6wj c6wj = this.A0C;
        Object obj = new Object(c6wj, A0C) { // from class: X.9ay
            public final C6wj A00;
            public final String A01;

            {
                this.A01 = A0C;
                this.A00 = c6wj;
            }

            public boolean equals(Object obj2) {
                if (this != obj2) {
                    if (obj2 == null || !(obj2 instanceof C9ay)) {
                        return false;
                    }
                    C9ay c9ay = (C9ay) obj2;
                    if (!11T.A0O(this.A01, c9ay.A01)) {
                        return false;
                    }
                    C6wj c6wj2 = this.A00;
                    C6wj c6wj3 = c9ay.A00;
                    if (c6wj2 != null) {
                        if (!c6wj2.equals(c6wj3)) {
                            return false;
                        }
                    } else if (c6wj3 != null) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return 7zS.A04(this, this.A01, this.A00);
            }
        };
        C2kf c2kf = (C2kf) r302.A0B(obj, A0C, 0);
        if (c2kf == null) {
            C6wj c6wj2 = this.A0C;
            C6wj c6wj3 = C6wj.A03;
            2kW r0 = new 2kW();
            if (c6wj2 == c6wj3) {
                r0.A01 = 1;
            } else {
                r0.A01 = 0;
                r0.A02 = (-1) >>> 1;
            }
            c2kf = r0.A00();
            11T.A0D(c2kf);
            r302.A0I(obj, c2kf, A0C, 0);
        }
        11T.A0F(anonymousClass784, 1);
        if (anonymousClass784.A08) {
            2cM A00 = 2cK.A00(r302);
            A00.A10(100.0f);
            A00.A0R();
            A00.A2b();
            A00.A2c();
            C53p A01 = C53o.A01(r302, 0);
            A01.A2W();
            A01.A1W(R.dimen.mapbox_locationComponentTrackingInitialMoveThreshold);
            A01.A1M(R.dimen.mapbox_locationComponentTrackingInitialMoveThreshold);
            A01.A01.A00 = -7829368;
            return 7zL.A0U(A00, A01);
        }
        ImmutableList immutableList = anonymousClass784.A02;
        if (immutableList == null) {
            throw 1BK.A0h();
        }
        int i5 = anonymousClass784.A00;
        int i6 = anonymousClass784.A01;
        8Sj r02 = new 8Sj(r302, new C8nd());
        r02.A10(100.0f);
        r02.A0R();
        r02.A2J("view_pager_key");
        C8nd c8nd = r02.A01;
        c8nd.A00 = i5;
        c8nd.A08 = immutableList;
        r02.A02.set(0);
        8Rl r03 = new 8Rl(r302, new 8oQ());
        8oQ r04 = r03.A01;
        r04.A0B = num;
        r03.A2J("view_pager_key");
        r04.A02 = i5;
        BitSet bitSet = r03.A02;
        bitSet.set(0);
        r04.A01 = i3;
        if (i4 == -1) {
            i4 = 7zM.A02(r302.A0D, 2MR.A0U);
        }
        r04.A03 = i4;
        bitSet.set(1);
        r04.A0A = immutableList;
        bitSet.set(5);
        r04.A05 = i2;
        bitSet.set(4);
        r04.A00 = 100.0f;
        bitSet.set(2);
        r04.A04 = i;
        bitSet.set(3);
        r04.A06 = i6;
        r04.A08 = 1LI.A09(r302, C8n5.class, "StickersViewPagerComponent", 93413553);
        1LI r05 = r302.A02;
        r04.A07 = r05 == null ? null : ((C8n5) r05).A07;
        r04.A0C = z;
        C1rs.A05(bitSet, r03.A03, 6);
        C2ko c2ko = r04.A09;
        if (c2ko == null) {
            c2ko = 1LI.A0D(r04, r03.A00, 73593826);
        }
        r04.A09 = c2ko;
        r03.A0J();
        c8nd.A01 = r04.A0l();
        c8nd.A04 = 1LI.A0A(r302, C8n5.class, "StickersViewPagerComponent", 239582340);
        c8nd.A03 = 1LI.A0A(r302, C8n5.class, "StickersViewPagerComponent", 947264300);
        c8nd.A05 = 1LI.A09(r302, C8n5.class, "StickersViewPagerComponent", 212701001);
        c8nd.A09 = true;
        c8nd.A07 = c2kf;
        return r02.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x02c0, code lost:
    
        if (r309 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0379, code lost:
    
        if ((r0 instanceof X.93S) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x03df, code lost:
    
        if ((r0 instanceof X.C6yr) != false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v184, types: [X.9MU, java.lang.Object] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8n5.A15(X.1Im, java.lang.Object):java.lang.Object");
    }
}
