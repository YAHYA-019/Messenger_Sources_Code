package X;

import android.content.res.Resources;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8ke, reason: invalid class name */
/* loaded from: 8ke.class */
public final class C8ke extends C1rj {
    public int A00;
    public AY6 A01;
    public MigColorScheme A02;
    public ImmutableList A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    public C8ke() {
        super("RoomParticipants");
        this.A06 = true;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), this.A03, this.A02, this.A04, Boolean.valueOf(this.A05), this.A01, Boolean.valueOf(this.A06), 1BK.A0d()};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String A0o;
        Resources resources;
        int i;
        Object[] A1b;
        ImmutableList immutableList = this.A03;
        int i2 = this.A00;
        MigColorScheme migColorScheme = this.A02;
        boolean z = this.A06;
        boolean A1X = 1BL.A1X(r302, immutableList);
        11T.A0F(migColorScheme, 3);
        1BV A00 = 1BV.A00(67642);
        2rR r311 = null;
        if (i2 > 0) {
            2cM A0j = 7zM.A0j(r302, 0);
            if (z) {
                ArrayList A0z = 1BL.A0z(immutableList);
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    A0z.add(((User) it.next()).A0k);
                }
                2rR r315 = null;
                if (!A0z.isEmpty()) {
                    2rS A002 = 2rR.A00(r302);
                    7zO.A1S(A002, (List) null, A0z);
                    int size = immutableList.size();
                    if (size < i2) {
                        size = i2;
                    }
                    A002.A01.A00 = size;
                    A002.A2a(3);
                    A002.A2Z(40.0f);
                    A002.A2d(A1X);
                    A002.A2b(migColorScheme);
                    A002.A1N(4);
                    r315 = A002.A2W();
                }
                r311 = r315;
            }
            A0j.A2e(r311);
            9So r0 = (9So) A00.get();
            2KD A0Y = 7zN.A0Y(r302, false);
            List A0Y2 = 0QD.A0Y(immutableList, 3);
            ArrayList A0z2 = 1BL.A0z(A0Y2);
            Iterator it2 = A0Y2.iterator();
            while (it2.hasNext()) {
                A0z2.add(r0.A03.A03((User) it2.next()));
            }
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object obj : A0z2) {
                String str = (String) obj;
                if (str != null && !0CU.A0O(str)) {
                    A0s.add(obj);
                }
            }
            int i3 = 3;
            if (A0s.size() != 3 || i2 != 3) {
                i3 = A0s.size();
                if (i3 > 2) {
                    i3 = 2;
                }
            }
            int i4 = i2 >= A0s.size() ? i2 - i3 : 0;
            if (i3 == 0) {
                A0o = 4YV.A0o(r0.A02, i4, 2131820551);
            } else if (i3 != A1X) {
                if (i3 != 3) {
                    resources = r0.A02;
                    if (i4 == 0) {
                        A0o = resources.getString(2131952287, A0s.get(0), A0s.get(A1X ? 1 : 0));
                        11T.A0D(A0o);
                        A0Y.A2z(A0o);
                        A0Y.A2x(migColorScheme);
                        A0Y.A2X();
                        A0Y.A2n();
                        A0Y.A2b();
                        4YU.A1K(A0j, A0Y);
                        r311 = A0j.A00;
                    } else {
                        i = 2131820553;
                        A1b = 1BK.A1a(A0s.get(0), A0s.get(A1X ? 1 : 0), i4);
                        A0o = resources.getQuantityString(i, i4, A1b);
                        11T.A0D(A0o);
                        A0Y.A2z(A0o);
                        A0Y.A2x(migColorScheme);
                        A0Y.A2X();
                        A0Y.A2n();
                        A0Y.A2b();
                        4YU.A1K(A0j, A0Y);
                        r311 = A0j.A00;
                    }
                } else {
                    A0o = r0.A02.getString(2131952286, A0s.get(0), A0s.get(A1X ? 1 : 0), A0s.get(2));
                }
            } else if (i4 == 0) {
                A0o = 4YU.A0u(r0.A02, A0s.get(0), 2131952285);
                11T.A0D(A0o);
                A0Y.A2z(A0o);
                A0Y.A2x(migColorScheme);
                A0Y.A2X();
                A0Y.A2n();
                A0Y.A2b();
                4YU.A1K(A0j, A0Y);
                r311 = A0j.A00;
            } else {
                resources = r0.A02;
                i = 2131820552;
                A1b = AnonymousClass001.A1b(A0s.get(0), i4);
                A0o = resources.getQuantityString(i, i4, A1b);
                11T.A0D(A0o);
                A0Y.A2z(A0o);
                A0Y.A2x(migColorScheme);
                A0Y.A2X();
                A0Y.A2n();
                A0Y.A2b();
                4YU.A1K(A0j, A0Y);
                r311 = A0j.A00;
            }
            11T.A0A(A0o);
            A0Y.A2z(A0o);
            A0Y.A2x(migColorScheme);
            A0Y.A2X();
            A0Y.A2n();
            A0Y.A2b();
            4YU.A1K(A0j, A0Y);
            r311 = A0j.A00;
        }
        return r311;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -518674771) {
            return null;
        }
        AY6 ay6 = ((C8ke) r302.A00.A01).A01;
        11T.A0F(ay6, 2);
        ay6.CIJ();
        return null;
    }
}
