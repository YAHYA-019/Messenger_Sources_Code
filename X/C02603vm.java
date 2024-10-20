package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.3vm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3vm.class */
public final class C02603vm extends C1rj {
    public Uri A00;
    public 2O4 A01;
    public FbUserSession A02;
    public 1LI A03;
    public 1LI A04;
    public 1LI A05;
    public 3xS A06;
    public 2YH A07;
    public 2YW A08;
    public 2Vk A09;
    public C9br A0A;
    public 3JT A0B;
    public 3Kg A0C;
    public 3JV A0D;
    public MigColorScheme A0E;
    public C5xv A0F;
    public C5xv A0G;
    public 1Va A0H;
    public ImmutableList A0I;
    public ImmutableList A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public C02603vm() {
        super("FoldersLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A0I, Boolean.valueOf(this.A0L), this.A0E, this.A0C, this.A02, this.A0A, this.A0B, Boolean.valueOf(this.A0M), this.A07, this.A08, this.A0J, Boolean.valueOf(this.A0N), this.A09, this.A0F, this.A01, this.A00, this.A03, this.A0H, this.A04, this.A05, this.A0K, 0, this.A06, this.A0G, this.A0D};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C02603vm c02603vm = (C02603vm) super.A0l();
        1LI r0 = c02603vm.A03;
        1LI r304 = null;
        c02603vm.A03 = r0 != null ? r0.A0l() : null;
        1LI r02 = c02603vm.A04;
        c02603vm.A04 = r02 != null ? r02.A0l() : null;
        1LI r03 = c02603vm.A05;
        if (r03 != null) {
            r304 = r03.A0l();
        }
        c02603vm.A05 = r304;
        return c02603vm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x013e, code lost:
    
        if (r0 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00f0, code lost:
    
        if (r0.A01() != false) goto L6;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02603vm.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        C2l4 c2l4;
        String str;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -974099156) {
            return null;
        }
        1Iw r0 = r302.A00.A00;
        boolean z = ((BeR) obj).A00;
        1LI r02 = r0.A02;
        if (z) {
            if (r02 == null) {
                return null;
            }
            c2l4 = new C2l4(new Object[0], 0);
            str = "updateState:FoldersLayout.setHeaderTitleVisible";
        } else {
            if (r02 == null) {
                return null;
            }
            c2l4 = new C2l4(new Object[0], 1);
            str = "updateState:FoldersLayout.setHeaderTitleInvisible";
        }
        r0.A0G(c2l4, str);
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2iw, java.lang.Object] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C4Q5 c4q5 = (C4Q5) r303;
        ?? obj = new Object();
        C1373Aff c1373Aff = new C1373Aff(r302, obj);
        c4q5.A00 = obj;
        c4q5.A01 = c1373Aff;
        c4q5.A02 = false;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
