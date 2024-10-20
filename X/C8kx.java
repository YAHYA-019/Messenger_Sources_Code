package X;

import android.graphics.drawable.Drawable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.composer.theme.model.ThreadThemeInfo;
import java.util.BitSet;

/* renamed from: X.8kx, reason: invalid class name */
/* loaded from: 8kx.class */
public final class C8kx extends C1rj {
    public Drawable A00;
    public Drawable A01;
    public ThreadKey A02;
    public C9a1 A03;
    public ThreadThemeInfo A04;
    public boolean A05;

    public C8kx() {
        super("ThemeCustomizationPickerColorIconComponent");
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A05), this.A00, this.A01, this.A03, this.A02, this.A04};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        boolean z = this.A05;
        Drawable drawable = this.A00;
        Drawable drawable2 = this.A01;
        ThreadThemeInfo threadThemeInfo = this.A04;
        11T.A0G(r302, 0, drawable);
        11T.A0F(drawable2, 3);
        11T.A0F(threadThemeInfo, 4);
        8RS r0 = new 8RS(r302, new 8kY());
        7zL.A1J(r0);
        r0.A2T(!z ? 1LI.A09(r302, C8kx.class, "ThemeCustomizationPickerColorIconComponent", -235350043) : null);
        Drawable A00 = C9gu.A01.A00(9EJ.A00(threadThemeInfo), 4YU.A0E(r302).getDimensionPixelSize(2132279437));
        8kY r02 = r0.A01;
        r02.A01 = A00;
        BitSet bitSet = r0.A02;
        bitSet.set(0);
        r02.A00 = 7zL.A05(r0, 2132279437);
        bitSet.set(1);
        r02.A04 = z;
        bitSet.set(2);
        r02.A02 = drawable;
        bitSet.set(3);
        r02.A03 = drawable2;
        bitSet.set(4);
        int i = 2131966818;
        if (z) {
            i = 2131966820;
        }
        r0.A2S(7zN.A0u(r302, threadThemeInfo.A0E, i));
        C1rs.A04(bitSet, r0.A03);
        r0.A0J();
        return r02;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -235350043) {
            return null;
        }
        C8kx c8kx = (C8kx) r302.A00.A01;
        ThreadThemeInfo threadThemeInfo = c8kx.A04;
        C9a1 c9a1 = c8kx.A03;
        ThreadKey threadKey = c8kx.A02;
        1BL.A1F(threadThemeInfo, c9a1);
        c9a1.A00(threadKey, threadThemeInfo);
        return null;
    }
}
