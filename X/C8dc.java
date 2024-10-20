package X;

import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8dc, reason: invalid class name */
/* loaded from: 8dc.class */
public final class C8dc extends 1LH {
    public final long A00;
    public final 71U A01;
    public final 7HQ A02;
    public final 6yN A03;
    public final 6qZ A04;
    public final ImmutableList A05;
    public final String A06;
    public final boolean A07;

    public C8dc(71U r302, 7HQ r303, 6yN r304, 6qZ r305, ImmutableList immutableList, String str, long j, boolean z) {
        7zT.A11(3, str, r303, r304, r305);
        7zR.A1P(r302, immutableList);
        this.A07 = z;
        this.A06 = str;
        this.A02 = r303;
        this.A03 = r304;
        this.A04 = r305;
        this.A01 = r302;
        this.A05 = immutableList;
        this.A00 = j;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        ImmutableList immutableList = this.A05;
        if (immutableList.isEmpty()) {
            return null;
        }
        6yN r0 = this.A03;
        boolean z = this.A07;
        Drawable drawable = (Drawable) AQs.A01(c2k5, this, new Object[]{r0, Boolean.valueOf(z)}, 0);
        Object A00 = AQY.A00(c2k5, this, new Object[]{immutableList}, 19);
        Long valueOf = Long.valueOf(this.A00);
        String str = (String) AQf.A00(c2k5, this, new Object[]{valueOf}, 49);
        String str2 = (String) AQf.A00(c2k5, this, new Object[]{immutableList, valueOf}, 48);
        int B69 = r0.B69(7zL.A0A(c2k5.A05), 0S2.A00, z);
        2lQ r02 = 2lO.A02;
        return new 6nY(drawable, 7zR.A0R((2lO) null, AV0.A00(this, 37), 1).A00((2lO) null), (2lO) null, str, str2, AQu.A00(c2k5, this, A00, 44), B69);
    }
}
