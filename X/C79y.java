package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.79y, reason: invalid class name */
/* loaded from: 79y.class */
public final class C79y extends C1rj {
    public static final CallerContext A0h = CallerContext.A0B("ThreadViewComponentSpec");
    public static final C5j5 A0i = C5j5.A01;
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public Uri A04;
    public 2N3 A05;
    public 2NI A06;
    public 1LI A07;
    public 1LI A08;
    public 1LI A09;
    public 1Im A0A;
    public 1Im A0B;
    public 1Im A0C;
    public 1Im A0D;
    public 1Im A0E;
    public 1Im A0F;
    public 1Im A0G;
    public 1Im A0H;
    public C2kx A0I;
    public 3xS A0J;
    public C5j5 A0K;
    public 6MB A0L;
    public C6v7 A0M;
    public 6sG A0N;
    public 5oH A0O;
    public C79j A0P;
    public 6vP A0Q;
    public String A0R;
    public List A0S;
    public List A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;

    public C79y() {
        super("ThreadViewComponent");
        this.A0V = true;
        this.A0Y = false;
        this.A00 = -1;
        this.A01 = 0;
        this.A0S = Collections.emptyList();
        this.A0d = false;
        this.A0K = A0i;
    }

    public final Object[] A0k() {
        Object[] objArr = new Object[52];
        Boolean valueOf = Boolean.valueOf(this.A0U);
        Boolean A0K = AnonymousClass001.A0K();
        System.arraycopy(new Object[]{this.A05, this.A0I, this.A0T, this.A0C, this.A0D, this.A0P, Boolean.valueOf(this.A0a), 1, Boolean.valueOf(this.A0b), Boolean.valueOf(this.A0c), Boolean.valueOf(this.A0d), Boolean.valueOf(this.A0e), A0K, Boolean.valueOf(this.A0f), Boolean.valueOf(this.A0g), null, this.A0L, null, null, this.A0E, this.A0F, this.A0G, this.A0J, this.A0H, this.A0K}, 1BK.A1W(new Object[]{valueOf, A0K, this.A03, this.A04, this.A0N, Boolean.valueOf(this.A0V), this.A06, Boolean.valueOf(this.A0W), Boolean.valueOf(this.A0X), Boolean.valueOf(this.A0Y), 4YU.A0k(), this.A07, this.A0R, Boolean.valueOf(this.A0Z), this.A0Q, this.A08, Integer.valueOf(this.A00), this.A0A, null, this.A09, Integer.valueOf(this.A01), this.A0B, this.A0M, this.A0O, Integer.valueOf(this.A02), this.A0S, null}, objArr) ? 1 : 0, objArr, 27, 25);
        return objArr;
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C79y c79y = (C79y) super.A0l();
        1LI r0 = c79y.A07;
        1LI r304 = null;
        c79y.A07 = r0 != null ? r0.A0l() : null;
        1LI r02 = c79y.A08;
        c79y.A08 = r02 != null ? r02.A0l() : null;
        1LI r03 = c79y.A09;
        if (r03 != null) {
            r304 = r03.A0l();
        }
        c79y.A09 = r304;
        return c79y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x033f, code lost:
    
        if (r331 == null) goto L36;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79y.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        A00.A03(1iF.class, new 1iF(195771409088126L));
        return A00;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        6MC r0;
        7AF r02 = (7AF) r303;
        List list = this.A0T;
        6MB r03 = this.A0L;
        int i = this.A00;
        11T.A0F(r302, 0);
        Resources resources = r302.A0D.getResources();
        11T.A0A(resources);
        if (i == -1) {
            i = resources.getDimensionPixelSize(2132279309);
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11011add((Object) new 2kF(i, 0, 1, true));
        if (r03 != null && (r0 = r03.A0A) != null) {
            builder.add(r0);
        }
        if (list == null) {
            list = C0ty.A00;
        }
        builder.addAll(list);
        r02.A00 = builder.build();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
