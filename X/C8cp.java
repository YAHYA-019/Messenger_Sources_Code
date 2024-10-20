package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8cp, reason: invalid class name */
/* loaded from: 8cp.class */
public final class C8cp extends 1LH {
    public final int A00;
    public final CharSequence A01;
    public final C00m A02;
    public final int A03;
    public final MigColorScheme A04;
    public final CharSequence A05;
    public final List A06;

    public C8cp(MigColorScheme migColorScheme, CharSequence charSequence, CharSequence charSequence2, List list, C00m c00m, int i, int i2) {
        11T.A0F(migColorScheme, 1);
        this.A04 = migColorScheme;
        this.A05 = charSequence;
        this.A06 = list;
        this.A00 = i;
        this.A01 = charSequence2;
        this.A03 = i2;
        this.A02 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C8xd c8xd = new C8xd(this.A03, "disappearing_message_nux", "DisappearingMessageNuxComponent error");
        CharSequence charSequence = this.A05;
        List<0Oa> list = this.A06;
        ArrayList A0z = 1BL.A0z(list);
        for (0Oa r0 : list) {
            A0z.add(8Ll.A01((C1u3) r0.third, (CharSequence) r0.first, (CharSequence) r0.second, (String) null, 8));
        }
        String A09 = 3yH.A09(c2k5, this.A00);
        8NK r02 = new 8NK(new 8Lf(C9py.A03(this, ActionId.END_START_ACTIVITY), C9py.A03(c2k5, ActionId.FILE_SYSTEM_FAIL), A09, this.A01), (1LI) null, c8xd, charSequence, (CharSequence) null, (CharSequence) null, (Integer) null, (Integer) null, A0z, true, true);
        8Tn A00 = C8nn.A00(c2k5.A05);
        A00.A2a(this.A04);
        A00.A2Z(r02);
        return A00.A2W();
    }
}
