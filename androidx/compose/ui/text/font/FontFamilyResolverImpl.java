package androidx.compose.ui.text.font;

import X.0DL;
import X.Aan;
import X.KV3;
import X.Kbk;
import X.KgX;
import X.KtY;
import X.L4i;
import X.L7Y;
import X.M6m;
import X.M6y;
import X.MBi;
import X.MBj;
import X.MN2;
import kotlin.jvm.functions.Function1;

/* loaded from: FontFamilyResolverImpl.class */
public final class FontFamilyResolverImpl implements MBi {
    public final L7Y A00;
    public final MBj A01;
    public final Aan A02;
    public final KgX A03;
    public final Function1 A04;

    public /* synthetic */ FontFamilyResolverImpl(MBj mBj, Aan aan) {
        KgX kgX = Kbk.A01;
        L7Y l7y = new L7Y(Kbk.A00, 0DL.A00);
        this.A01 = mBj;
        this.A02 = aan;
        this.A03 = kgX;
        this.A00 = l7y;
        this.A04 = M6m.A00(this, 37);
    }

    public static final MN2 A00(FontFamilyResolverImpl fontFamilyResolverImpl, KtY ktY) {
        L4i l4i;
        MN2 mn2;
        KgX kgX = fontFamilyResolverImpl.A03;
        M6y m6y = new M6y(fontFamilyResolverImpl, ktY, 29);
        KV3 kv3 = kgX.A01;
        synchronized (kv3) {
            l4i = kgX.A00;
            mn2 = (MN2) l4i.A01(ktY);
        }
        if (mn2 == null) {
            try {
                mn2 = (MN2) m6y.invoke(new M6y(kgX, ktY, 30));
                synchronized (kv3) {
                    if (l4i.A01(ktY) == null) {
                        l4i.A02(ktY, mn2);
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
        return mn2;
    }
}
