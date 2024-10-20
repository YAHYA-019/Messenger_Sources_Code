package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;

/* renamed from: X.8qm, reason: invalid class name */
/* loaded from: 8qm.class */
public final class C8qm extends 2Yf {
    public static final C2q1 A0B = new C2q1(3.0f, 3.0f, 0.0f, 40.5f, 2.5f, 11, 50, 17, 23, 35);
    public int A00;
    public FbUserSession A01;
    public 9Z6 A02;
    public MigColorScheme A03;
    public ThreadThemeInfo A04;
    public ImmutableList A05;
    public ImmutableMap A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public C8qm() {
        super("ThreadCustomizationPickerThemeSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        ImmutableList immutableList = this.A05;
        MigColorScheme migColorScheme = this.A03;
        int i = this.A00;
        boolean z = this.A0A;
        boolean z2 = this.A09;
        boolean z3 = this.A08;
        ArrayList A0s = AnonymousClass001.A0s();
        2hO r310 = null;
        if (z2 && z3) {
            A0s.add(new 9Nf((ThreadThemeInfo) null, 0S2.A01));
        }
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            A0s.add(new 9Nf((ThreadThemeInfo) it.next(), 0S2.A00));
        }
        2Yr A0l = 7zL.A0l();
        if (z) {
            2hP A0I = 2hO.A0I(c1qb);
            int i2 = 9GJ.A00;
            2KD A0Y = 7zN.A0Y(c1qb, false);
            7zN.A1F(c1qb, A0Y, 2131955417);
            A0Y.A2j();
            A0Y.A2d();
            A0Y.A2x(migColorScheme);
            A0Y.A1B(9GJ.A02);
            A0Y.A1C(9GJ.A01);
            A0I.A05(A0Y.A2W());
            A0I.A01.A04 = Integer.valueOf(i);
            r310 = A0I.A02();
        }
        A0l.A01(r310);
        7zQ.A1J(2Yg.A03(c1qb, C8qm.class, "ThreadCustomizationPickerThemeSection"), A0l, 7zM.A0s(c1qb, A0s));
        return A0l.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d4, code lost:
    
        if (r319 != r0.A0S) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fd, code lost:
    
        if ("INTERACTIVE".equals(r0.A02()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0100, code lost:
    
        r324 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0267, code lost:
    
        if (r311.isEmpty() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0332, code lost:
    
        if (r310.isEmpty() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e3, code lost:
    
        if (r0 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0e(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8qm.A0e(X.1Im, java.lang.Object):java.lang.Object");
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qm c8qm = (C8qm) r302;
            MigColorScheme migColorScheme = this.A03;
            MigColorScheme migColorScheme2 = c8qm.A03;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            FbUserSession fbUserSession = this.A01;
            FbUserSession fbUserSession2 = c8qm.A01;
            if (fbUserSession != null) {
                if (!fbUserSession.equals(fbUserSession2)) {
                    return false;
                }
            } else if (fbUserSession2 != null) {
                return false;
            }
            if (this.A07 != c8qm.A07 || this.A08 != c8qm.A08 || this.A09 != c8qm.A09) {
                return false;
            }
            9Z6 r0 = this.A02;
            9Z6 r02 = c8qm.A02;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            if (this.A00 != c8qm.A00 || this.A0A != c8qm.A0A) {
                return false;
            }
            ImmutableList immutableList = this.A05;
            ImmutableList immutableList2 = c8qm.A05;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
            ImmutableMap immutableMap = this.A06;
            ImmutableMap immutableMap2 = c8qm.A06;
            if (immutableMap != null) {
                if (!immutableMap.equals(immutableMap2)) {
                    return false;
                }
            } else if (immutableMap2 != null) {
                return false;
            }
            ThreadThemeInfo threadThemeInfo = this.A04;
            ThreadThemeInfo threadThemeInfo2 = c8qm.A04;
            if (threadThemeInfo != null) {
                if (!threadThemeInfo.equals(threadThemeInfo2)) {
                    return false;
                }
            } else if (threadThemeInfo2 != null) {
                return false;
            }
        }
        return true;
    }
}
