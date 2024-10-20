package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ayh, reason: case insensitive filesystem */
/* loaded from: Ayh.class */
public final class C1988Ayh extends C1rj {
    public DqL A00;
    public Bcx A01;
    public C1758Ars A02;
    public MigColorScheme A03;
    public C5xv A04;
    public boolean A05;

    public C1988Ayh() {
        super("CommunityNotificationSettingsLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A00, Boolean.valueOf(this.A05), this.A01, this.A04, this.A02};
    }

    /* JADX WARN: Type inference failed for: r0v152, types: [X.BRP, java.lang.Object] */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i;
        String str;
        StringBuilder A0k;
        int i2;
        MigColorScheme migColorScheme = this.A03;
        C5xv c5xv = this.A04;
        Bcx bcx = this.A01;
        boolean z = this.A05;
        C1758Ars c1758Ars = this.A02;
        DqL dqL = this.A00;
        11T.A0F(r302, 0);
        1BL.A1H(migColorScheme, c5xv, bcx);
        1BL.A1G(c1758Ars, dqL);
        C1i A0T = 7zU.A0T();
        Context context = r302.A0D;
        2Ph r0 = (2Ph) 7zN.A0k(context, 17010);
        CQY cqy = new CQY(r302, A0T, migColorScheme);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        7zM.A1O(A01, migColorScheme);
        C5yw A0b = 7zN.A0b(r302, false);
        A0b.A1w(null);
        A0b.A2i(false);
        A0b.A2d(c5xv);
        A0b.A2f(context.getResources().getString(2131954595));
        A0b.A2b(migColorScheme);
        AbH.A1Q(A01, A0b);
        boolean z2 = c1758Ars.A01;
        if (z2) {
            i = 2131954582;
            Date date = c1758Ars.A00;
            if (date == null) {
                str = context.getResources().getString(2131954581);
            } else {
                String A03 = r0.A03(4YU.A06(date.getTime()));
                11T.A0A(A03);
                str = 4YU.A0u(context.getResources(), A03, 2131954580);
            }
            11T.A0A(str);
        } else {
            i = 2131954583;
            str = "";
        }
        CQY.A03(cqy, Cvn.A00(bcx, 30), str, context.getResources().getString(i), !z2);
        cqy.A0A();
        if (!z2) {
            cqy.A0L(new C55c(null, null, 2K5.A04, migColorScheme, null, 4YU.A0t(context.getResources(), 2131954590), null, null, null, 1, r0.hashCode(), true));
            ArrayList A0s = AnonymousClass001.A0s();
            RrY rrY = new RrY(dqL, bcx);
            int i3 = dqL.A00;
            Integer valueOf = Integer.valueOf(i3);
            for (C2630Gjf c2630Gjf : (List) dqL.A01) {
                String A0D = r302.A0D(c2630Gjf.A01);
                Integer valueOf2 = Integer.valueOf(c2630Gjf.A00);
                ?? obj = new Object();
                ((BRP) obj).A04 = true;
                ((BRP) obj).A01 = A0D;
                ((BRP) obj).A00 = "";
                ((BRP) obj).A03 = false;
                ((BRP) obj).A02 = valueOf2;
                Preconditions.checkNotNull(valueOf2, "Tag for radio button group option cannot be null");
                A0s.add(obj);
            }
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                BRP brp = (BRP) it.next();
                brp.A03 = Objects.equal(valueOf, brp.A02);
            }
            CQY.A01(rrY, cqy, ImmutableList.copyOf((Collection) A0s));
            Resources resources = context.getResources();
            String A0t = 4YU.A0t(resources, 2131954589);
            if (z) {
                if (i3 == 0) {
                    A0k = AnonymousClass001.A0k();
                    i2 = 2131954584;
                } else if (i3 != 1) {
                    if (i3 == 2) {
                        A0t = 0Pz.A0Y(resources.getString(2131954588), A0t, ' ');
                    } else if (i3 == 3) {
                        A0k = AnonymousClass001.A0k();
                        i2 = 2131954586;
                    }
                    cqy.A0N(A0t);
                } else {
                    A0k = AnonymousClass001.A0k();
                    i2 = 2131954587;
                }
                AbG.A1F(resources, A0k, i2);
                A0k.append(' ');
                A0t = AnonymousClass001.A0d(A0t, A0k);
                cqy.A0N(A0t);
            } else {
                if (i3 == 0) {
                    A0k = AnonymousClass001.A0k();
                    i2 = 2131954585;
                    AbG.A1F(resources, A0k, i2);
                    A0k.append(' ');
                    A0t = AnonymousClass001.A0d(A0t, A0k);
                }
                cqy.A0N(A0t);
            }
        }
        return 7zL.A0V(A01, CQY.A00(cqy));
    }
}
