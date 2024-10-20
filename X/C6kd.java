package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;

/* renamed from: X.6kd, reason: invalid class name */
/* loaded from: 6kd.class */
public final class C6kd {
    public final C5ye A00;
    public final ThreadKey A01;
    public final C5rp A02;
    public final ThreadViewColorScheme A03;
    public final ThreadThemeInfo A04;

    public C6kd(C5ye c5ye, ThreadKey threadKey, C5rp c5rp, ThreadViewColorScheme threadViewColorScheme, ThreadThemeInfo threadThemeInfo) {
        11T.A0F(c5ye, 4);
        11T.A0F(c5rp, 5);
        this.A04 = threadThemeInfo;
        this.A01 = threadKey;
        this.A03 = threadViewColorScheme;
        this.A00 = c5ye;
        this.A02 = c5rp;
    }
}
