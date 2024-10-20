package X;

import com.facebook.messaging.reactions.model.ReactionsSet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.emoji.model.EmojiSet;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import java.util.Iterator;
import java.util.List;

/* loaded from: B1z.class */
public final class B1z extends 2Yf {
    public int A00;
    public DF1 A01;
    public DGr A02;
    public EeF A03;
    public ReactionsSet A04;
    public MigColorScheme A05;
    public ThreadThemeInfo A06;
    public List A07;
    public boolean A08;

    public B1z() {
        super("EmojiPickerGroupSection");
    }

    public 2Ys A0d(C1qb c1qb) {
        boolean z;
        List list = this.A07;
        int i = this.A00;
        DF1 df1 = this.A01;
        MigColorScheme migColorScheme = this.A05;
        boolean z2 = this.A08;
        DGr dGr = this.A02;
        ReactionsSet reactionsSet = this.A04;
        EeF eeF = this.A03;
        ThreadThemeInfo threadThemeInfo = this.A06;
        2Ys r0 = new 2Ys();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                return r0;
            }
            EmojiSet emojiSet = (EmojiSet) it.next();
            ReactionsSet reactionsSet2 = emojiSet.A00() ? new ReactionsSet() : reactionsSet;
            EmojiSet.Metadata metadata = emojiSet.A03;
            3E2 r02 = metadata.A00;
            int ordinal = r02.ordinal();
            EMe eMe = ordinal != 10 ? ordinal != 0 ? EMe.A02 : EMe.A01 : EMe.A03;
            B2N b2n = new B2N();
            C1qo c1qo = ((1Iw) c1qb).A0E;
            b2n.A09 = CDJ.A00(eMe, reactionsSet2, metadata.A01);
            b2n.A04 = reactionsSet;
            int i4 = emojiSet.A02;
            b2n.A07 = c1qo.A0D(i4);
            b2n.A08 = c1qo.A0D(emojiSet.A00);
            b2n.A03 = eeF;
            if (r02 == 3E2.A06) {
                z = true;
                if (i4 == 2131960001) {
                    b2n.A0C = z;
                    b2n.A00 = i;
                    b2n.A01 = df1;
                    ((2Yf) b2n).A07 = 0Pz.A0T("category", i3);
                    b2n.A05 = migColorScheme;
                    b2n.A06 = threadThemeInfo;
                    b2n.A0B = z2;
                    b2n.A02 = dGr;
                    r0.A00.add(b2n);
                    i2 = i3 + 1;
                }
            }
            z = false;
            b2n.A0C = z;
            b2n.A00 = i;
            b2n.A01 = df1;
            ((2Yf) b2n).A07 = 0Pz.A0T("category", i3);
            b2n.A05 = migColorScheme;
            b2n.A06 = threadThemeInfo;
            b2n.A0B = z2;
            b2n.A02 = dGr;
            r0.A00.add(b2n);
            i2 = i3 + 1;
        }
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            B1z b1z = (B1z) r302;
            MigColorScheme migColorScheme = this.A05;
            MigColorScheme migColorScheme2 = b1z.A05;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            EeF eeF = this.A03;
            EeF eeF2 = b1z.A03;
            if (eeF != null) {
                if (!eeF.equals(eeF2)) {
                    return false;
                }
            } else if (eeF2 != null) {
                return false;
            }
            List list = this.A07;
            List list2 = b1z.A07;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
            if (this.A08 != b1z.A08 || this.A00 != b1z.A00) {
                return false;
            }
            DF1 df1 = this.A01;
            DF1 df12 = b1z.A01;
            if (df1 != null) {
                if (!df1.equals(df12)) {
                    return false;
                }
            } else if (df12 != null) {
                return false;
            }
            ReactionsSet reactionsSet = this.A04;
            ReactionsSet reactionsSet2 = b1z.A04;
            if (reactionsSet != null) {
                if (!reactionsSet.equals(reactionsSet2)) {
                    return false;
                }
            } else if (reactionsSet2 != null) {
                return false;
            }
            DGr dGr = this.A02;
            DGr dGr2 = b1z.A02;
            if (dGr != null) {
                if (!dGr.equals(dGr2)) {
                    return false;
                }
            } else if (dGr2 != null) {
                return false;
            }
            ThreadThemeInfo threadThemeInfo = this.A06;
            ThreadThemeInfo threadThemeInfo2 = b1z.A06;
            if (threadThemeInfo != null) {
                if (!threadThemeInfo.equals(threadThemeInfo2)) {
                    return false;
                }
            } else if (threadThemeInfo2 != null) {
                return false;
            }
        }
        return true;
    }
}
