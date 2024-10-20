package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8W5, reason: invalid class name */
/* loaded from: 8W5.class */
public final class C8W5 extends 1LH {
    public final 8K5 A00;
    public final MigColorScheme A01;

    public C8W5(8K5 r302, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        Uri uri;
        11T.A0F(c2k5, 0);
        FbUserSession A01 = 1Fw.A01(c2k5.A05.A0D);
        1Br A0M = 7zM.A0M();
        1Br A00 = 1Bu.A00(68497);
        1Br A002 = 1Bq.A00(68500);
        1Iw AeS = c2k5.AeS();
        Context A0A = 7zL.A0A(AeS);
        2fZ r0 = (2fZ) 1Lm.A05(A0A, A01, 17067);
        8K5 r02 = this.A00;
        ImmutableList immutableList = r02.A04;
        ArrayList A0z = 1BL.A0z(immutableList);
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            A0z.add(UserKey.A00((Long) it.next()));
        }
        55N A003 = 55M.A00(AeS);
        AnonymousClass557 A0p = 7zL.A0p();
        MigColorScheme migColorScheme = this.A01;
        A0p.A05(migColorScheme);
        String str = r02.A05;
        if (str != null) {
            uri = null;
            try {
                uri = C0A2.A03(str);
            } catch (SecurityException unused) {
            }
        } else {
            uri = null;
        }
        A0p.A08 = r0.A0D(uri, ImmutableList.copyOf((Collection) A0z));
        A0p.A08(r02.A07);
        int i = r02.A02;
        int i2 = r02.A01;
        String A0o = 4YV.A0o(A0A.getResources(), i2, 2131820813);
        11T.A0A(A0o);
        String A0o2 = 4YV.A0o(A0A.getResources(), i, 2131820814);
        11T.A0A(A0o2);
        if (i > 0) {
            if (i2 <= 0) {
                A0o = A0o2;
            } else {
                A0o = A0A.getResources().getString(2131967003, A0o2, A0o);
                11T.A0A(A0o);
            }
        }
        A0p.A07(A0o);
        7zN.A1W(A0p, new 5Ad(migColorScheme, r02.A06));
        A0p.A01 = new Cvd(2, c2k5, A002, A00, this, A0M);
        return 7zU.A0U(A003, A0p);
    }
}
