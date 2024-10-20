package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Azs, reason: case insensitive filesystem */
/* loaded from: Azs.class */
public final class C2031Azs extends C1rj {
    public static final CallerContext A03 = CallerContext.A0B("ProfileCardUnitListItemsComponentSpec");
    public 1Im A00;
    public MigColorScheme A01;
    public ImmutableList A02;

    public C2031Azs() {
        super("ProfileCardUnitListItemsComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r304;
        ImmutableList immutableList = this.A02;
        MigColorScheme migColorScheme = this.A01;
        1Im r0 = this.A00;
        2cM A0i = 7zM.A0i(r302);
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            Buf buf = (Buf) it.next();
            C1rq A01 = C1rg.A01(r302, null, 0);
            A01.A1C(20.0f);
            A01.A1B(12.0f);
            A01.A0P();
            A01.A2b();
            A01.A2T(r0);
            String str = buf.A01;
            2K3 r315 = null;
            if (str == null && buf.A00 == 0) {
                r304 = null;
            } else if (str != null) {
                C07004ik A00 = 5BI.A00(C06974ih.A0Q);
                A00.A03(2132213982);
                if (buf.A02) {
                    ((C07014il) A00).A04 = 5BK.A05;
                }
                5BH A012 = 5BG.A01(r302);
                C06984ii.A01(A012, A00);
                A012.A2b(A03);
                Uri uri = null;
                try {
                    uri = C0A2.A03(str);
                } catch (SecurityException unused) {
                }
                A012.A2X(uri);
                A012.A0z(32.0f);
                A012.A0l(32.0f);
                A012.A24(C26z.RIGHT, 16.0f);
                A012.A0J();
                r304 = A012.A00;
            } else {
                int i = buf.A00;
                if (i != 0) {
                    C2cm A002 = C2cl.A00(r302);
                    A002.A2a(i);
                    A002.A2X(migColorScheme.B9O());
                    A002.A0z(32.0f);
                    A002.A0l(32.0f);
                    A002.A24(C26z.RIGHT, 16.0f);
                    r304 = 7zL.A0J(A002);
                } else {
                    r304 = null;
                }
            }
            A01.A2f(r304);
            2cM A013 = 2cK.A01(r302, (String) null, 0);
            2KD A0Y = 7zN.A0Y(r302, false);
            A0Y.A2q(2);
            7zQ.A1W(A0Y, buf.A04);
            A0Y.A2Z();
            A0Y.A2x(migColorScheme);
            4YU.A1K(A013, A0Y);
            CharSequence charSequence = buf.A03;
            if (charSequence != null) {
                2KD A014 = 2K3.A01(r302, 0);
                A014.A2q(2);
                7zQ.A1T(A014, charSequence);
                A014.A2Z();
                r315 = 7zN.A0Z(migColorScheme, A014);
            }
            A013.A2e(r315);
            A01.A2e(A013);
            7zL.A1I(A0i, A01);
        }
        return A0i.A00;
    }
}
