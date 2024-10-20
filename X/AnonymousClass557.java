package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.LinkedList;

/* renamed from: X.557, reason: invalid class name */
/* loaded from: 557.class */
public final class AnonymousClass557 {
    public long A00;
    public C5ww A01;
    public C5wx A02;
    public 55H A03;
    public 55B A04;
    public 55E A05;
    public C2fr A08;
    public CharSequence A0A;
    public 55A A0D;
    public ImmutableList A09 = ImmutableList.of();
    public final LinkedList A0E = new LinkedList();
    public AnonymousClass558 A06 = AnonymousClass558.MEDIUM;
    public MigColorScheme A07 = LightColorScheme.A00();
    public boolean A0C = true;
    public Integer A0B = null;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r301.A05 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.AnonymousClass544 A00() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass557.A00():X.544");
    }

    public final void A01() {
        A04(AnonymousClass558.REGULAR);
    }

    public void A02(55H r302) {
        if (r302 instanceof 55J) {
            this.A03 = r302;
        } else if (r302 != null) {
            this.A0E.add(r302);
        }
    }

    public void A03(55A r302) {
        r302.getClass();
        this.A0D = r302;
    }

    public void A04(AnonymousClass558 anonymousClass558) {
        anonymousClass558.getClass();
        this.A06 = anonymousClass558;
    }

    public void A05(MigColorScheme migColorScheme) {
        migColorScheme.getClass();
        this.A07 = migColorScheme;
    }

    public void A06(ImmutableList immutableList) {
        immutableList.getClass();
        this.A09 = immutableList;
    }

    public void A07(CharSequence charSequence) {
        this.A04 = 1JF.A0B(charSequence) ? null : 5OM.A00(charSequence);
    }

    public void A08(CharSequence charSequence) {
        this.A0D = 5OL.A00(charSequence);
    }
}
