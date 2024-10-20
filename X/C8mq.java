package X;

import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.8mq, reason: invalid class name */
/* loaded from: 8mq.class */
public final class C8mq extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public 9U2 A03;
    public MigColorScheme A04;
    public Integer A05;
    public Integer A06;
    public List A07;
    public List A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public int[] A0C;
    public static final CallerContext A0F = CallerContext.A06(9rS.class);
    public static final int A0D = 2RH.A06.A00();
    public static final int A0E = 7zL.A02();

    public C8mq() {
        super("LegacyMigSegmentedTabs");
        this.A0B = true;
        this.A02 = A0E;
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, Boolean.valueOf(this.A0A), this.A07, this.A05, this.A08, this.A06, Boolean.valueOf(this.A0B), this.A03, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A0C, Integer.valueOf(this.A02), this.A09};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        List list = this.A09;
        int i = this.A00;
        MigColorScheme migColorScheme = this.A04;
        boolean z = this.A0A;
        List list2 = this.A08;
        List list3 = this.A07;
        Integer num = this.A05;
        Integer num2 = this.A06;
        int i2 = this.A02;
        int[] iArr = this.A0C;
        int i3 = this.A01;
        11T.A0H(r302, list);
        11T.A0F(migColorScheme, 3);
        ImmutableList.Builder A0h = 4YU.A0h();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            A0h.m11011add((Object) 9rS.A00(r302, migColorScheme, (CharSequence) list.get(i4), num, num2, list2, list3, iArr != null ? iArr[i4] : 0, i2, i4, AnonymousClass001.A1Q(i4, i), z));
        }
        C2yw A00 = 2dA.A00(r302);
        A00.A2Y(A0h.build());
        A00.A2W(i3);
        A00.A1C(A0D);
        A00.A0J();
        2dA r0 = A00.A01;
        11T.A0A(r0);
        return r0;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((3xC) obj).A00;
        int A08 = 7zO.A08(r302.A03, 0);
        C8mq c8mq = (C8mq) r0;
        9U2 r02 = c8mq.A03;
        boolean z = c8mq.A0B;
        7zR.A1N(r02, view);
        if (!z) {
            return null;
        }
        9HC r03 = r02.A02;
        boolean z2 = r02.A04;
        int left = view.getLeft();
        int width = view.getWidth();
        int i2 = r02.A00;
        int i3 = 0;
        if (z2) {
            int i4 = left + (width / 2);
            int i5 = i2 / 2;
            if (i4 > i5) {
                i3 = i4 - i5;
            }
        } else if (width + left >= i2) {
            i3 = left - 64;
        }
        DQA dqa = r03.A00;
        if (dqa != null) {
            dqa.smoothScrollTo(i3, 0);
        }
        1Iw r04 = r02.A01;
        if (r04.A02 != null) {
            r04.A0H(7zL.A0f(AnonymousClass001.A1a(A08), 0), "updateState:LegacyMigSegmentedControl.updateSelectedTabState");
        }
        AYQ ayq = r02.A03;
        if (ayq == null) {
            return null;
        }
        ayq.CPj(A08);
        return null;
    }
}
