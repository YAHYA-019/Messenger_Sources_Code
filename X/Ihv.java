package X;

import com.bloks.components.bkcomponentsvideo.subtitle.BKBloksSubtitlePlugin;

/* loaded from: Ihv.class */
public final class Ihv implements C6dj {
    public final /* synthetic */ BKBloksSubtitlePlugin A00;

    public Ihv(BKBloksSubtitlePlugin bKBloksSubtitlePlugin) {
        this.A00 = bKBloksSubtitlePlugin;
    }

    @Override // X.C6dj
    public float Afl() {
        BKBloksSubtitlePlugin bKBloksSubtitlePlugin = this.A00;
        if (bKBloksSubtitlePlugin.A00 == null) {
            return 1.0f;
        }
        C00i c00i = bKBloksSubtitlePlugin.A0B;
        if (c00i.get() == null) {
            return 1.0f;
        }
        String str = bKBloksSubtitlePlugin.A00.A0k;
        HYE hye = (HYE) c00i.get();
        11T.A0F(str, 0);
        Number number = (Number) hye.A00.A02(str);
        if (number != null) {
            return number.floatValue();
        }
        return 1.0f;
    }
}
