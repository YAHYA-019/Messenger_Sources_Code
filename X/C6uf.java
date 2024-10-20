package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.model.MontageBucketInfo;
import com.facebook.messaging.threadview.surfaceoptions.model.UpButtonConfig;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6uf, reason: invalid class name */
/* loaded from: 6uf.class */
public final class C6uf extends C1rj {
    public int A00;
    public int A01;
    public View.OnClickListener A02;
    public 06Z A03;
    public FbUserSession A04;
    public C1u3 A05;
    public 7QI A06;
    public ThreadKey A07;
    public MontageBucketInfo A08;
    public UpButtonConfig A09;
    public 6OB A0A;
    public MigColorScheme A0B;
    public C5xv A0C;
    public C2fr A0D;
    public Capabilities A0E;
    public HeterogeneousMap A0F;
    public 6O9 A0G;
    public ImmutableList A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;

    public C6uf() {
        super("TitleBarComponent");
        this.A0N = true;
        this.A0P = true;
        this.A0R = true;
        this.A0S = true;
        this.A0T = false;
    }

    public final Object[] A0k() {
        Object[] objArr = new Object[33];
        System.arraycopy(new Object[]{this.A0M, Integer.valueOf(this.A01), this.A0G, null, this.A09, this.A0C}, 1BK.A1W(new Object[]{this.A0E, this.A0B, Integer.valueOf(this.A00), this.A06, Boolean.valueOf(this.A0N), this.A04, this.A03, this.A0F, this.A08, this.A0A, this.A0H, this.A0K, this.A0L, Boolean.valueOf(this.A0O), Boolean.valueOf(this.A0P), Boolean.valueOf(this.A0Q), Boolean.valueOf(this.A0R), Boolean.valueOf(this.A0S), Boolean.valueOf(this.A0T), Boolean.valueOf(this.A0U), this.A0I, this.A05, this.A07, this.A02, null, this.A0J, this.A0D}, objArr) ? 1 : 0, objArr, 27, 6);
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0bdd, code lost:
    
        if (r0.A01() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0d30, code lost:
    
        if (r355 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0444, code lost:
    
        if (r340 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0820, code lost:
    
        if (r0.AZk(72340430519996108L) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x087c, code lost:
    
        if (r0.AZk(72340430519930571L) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0aef, code lost:
    
        if (X.1BK.A0M(r0).AZk(36322796130813874L) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0b83, code lost:
    
        if (X.11T.A0O(java.lang.String.valueOf(r0.A0r()), ((X.2hT) r0.A05.A00.get()).A00()) != false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0b52  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 3391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6uf.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        5X3 A00 = C3s9.A00(5Rn.A02, "transition_title_bar");
        A00.A03(C2jm.A00);
        A00.A01(0.0f);
        A00.A02(0.0f);
        return A00;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        6vW r0 = (6vW) r303;
        11T.A0F(r302, 0);
        Context context = r302.A0D;
        11T.A0A(context);
        Object A0E = 1Bn.A0E(context, (1BY) null, 66019);
        if (A0E != null) {
            r0.A00 = (C6vX) A0E;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
