package X;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.6b5, reason: invalid class name */
/* loaded from: 6b5.class */
public abstract class C6b5 {
    public final int A00;
    public final int A01;
    public final 6Yl A02;
    public final 6YP A03;

    public C6b5(6YP r302, int i, int i2) {
        this.A00 = i;
        this.A03 = r302;
        this.A01 = i2;
        this.A02 = r302.A04[i2];
    }

    public int A01() {
        return this instanceof C6b6 ? ((C6b6) this).A07 : ((C6b4) this).A00;
    }

    public boolean A02(C6b5 c6b5) {
        boolean z;
        boolean z2;
        int i;
        String str;
        int i2;
        if (this instanceof C6b6) {
            C6b6 c6b6 = (C6b6) this;
            C6b6 c6b62 = (C6b6) c6b5;
            if (!c6b6.A09 && !Util.A0P(((C6b5) c6b6).A02.A0W, ((C6b5) c6b62).A02.A0W)) {
                return false;
            }
            if (c6b6.A08.A07) {
                return true;
            }
            if (c6b6.A0F != c6b62.A0F) {
                return false;
            }
            z = c6b6.A0E;
            z2 = c6b62.A0E;
        } else {
            C6b4 c6b4 = (C6b4) this;
            C6b4 c6b42 = (C6b4) c6b5;
            6XI r0 = c6b4.A01;
            if (!r0.A02 && ((i2 = ((C6b5) c6b4).A02.A06) == -1 || i2 != ((C6b5) c6b42).A02.A06)) {
                return false;
            }
            if (!r0.A04 && ((str = ((C6b5) c6b4).A02.A0W) == null || !TextUtils.equals(str, ((C6b5) c6b42).A02.A0W))) {
                return false;
            }
            if (!r0.A05 && ((i = ((C6b5) c6b4).A02.A0G) == -1 || i != ((C6b5) c6b42).A02.A0G)) {
                return false;
            }
            if (r0.A03) {
                return true;
            }
            if (c6b4.A04 != c6b42.A04) {
                return false;
            }
            z = c6b4.A03;
            z2 = c6b42.A03;
        }
        return z == z2;
    }
}
