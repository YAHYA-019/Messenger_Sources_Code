package X;

import com.facebook.ui.emoji.model.Emoji;
import java.lang.ref.WeakReference;

/* loaded from: Iln.class */
public final class Iln implements AZh {
    public final AnonymousClass749 A00;
    public final Emoji A01;
    public final WeakReference A02;

    public Iln(AnonymousClass749 anonymousClass749, Emoji emoji, 6RU r304) {
        this.A01 = emoji;
        this.A00 = anonymousClass749;
        this.A02 = 7zL.A14(r304);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.6Sh, java.lang.Object] */
    @Override // X.AZh
    public void CNK(String str) {
        6RU r0 = (6RU) this.A02.get();
        if (r0 != null) {
            7FI.A02(r0, (6Sh) new Object());
        }
    }

    @Override // X.AZh
    public void CNL(6fM r302, String str, String str2) {
        11T.A0F(str2, 2);
        6RU r0 = (6RU) this.A02.get();
        if (r0 != null) {
            HfL hfL = new HfL(this.A01, r0, str2);
            AnonymousClass749 anonymousClass749 = this.A00;
            C00i c00i = anonymousClass749.A05.A00;
            ((5Ye) c00i.get()).A00 = new IQP(hfL, 0);
            5Ye r02 = (5Ye) c00i.get();
            8O0 A01 = anonymousClass749.A01(str);
            r02.A00(new HXv(11T.A03(A01 != null ? A01.id : null)));
        }
    }
}
