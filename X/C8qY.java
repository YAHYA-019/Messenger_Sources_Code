package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* renamed from: X.8qY, reason: invalid class name */
/* loaded from: 8qY.class */
public final class C8qY extends 2Yf {
    public int A00;
    public 9Z6 A01;
    public ThreadCustomization A02;
    public MigColorScheme A03;
    public ThreadThemeInfo A04;
    public ImmutableList A05;

    public C8qY() {
        super("ThreadCustomizationPickerEmojiSection");
    }

    public void A0T(C1qb c1qb) {
        ImmutableList immutableList = this.A05;
        ThreadCustomization threadCustomization = this.A02;
        String str = threadCustomization == null ? null : threadCustomization.A02;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= immutableList.size()) {
                break;
            }
            if (((Emoji) immutableList.get(i3)).A07().equals(str)) {
                i = i3;
                break;
            }
            i2 = i3 + 1;
        }
        2Yg.A0E(c1qb, i);
    }

    public 2Ys A0d(C1qb c1qb) {
        int i = this.A00;
        ThreadCustomization threadCustomization = this.A02;
        ThreadThemeInfo threadThemeInfo = this.A04;
        MigColorScheme migColorScheme = this.A03;
        ImmutableList immutableList = this.A05;
        Context context = ((1Iw) c1qb).A0D;
        1Bn.A0E(context, (1BY) null, 68249);
        String str = threadCustomization == null ? null : threadCustomization.A02;
        int A00 = C5rp.A00(context, threadThemeInfo);
        2Yr A0l = 7zL.A0l();
        2hP A0I = 2hO.A0I(c1qb);
        QC9 qc9 = new QC9(c1qb, new QIh());
        boolean isEmpty = TextUtils.isEmpty(str);
        QIh qIh = qc9.A01;
        qIh.A02 = isEmpty;
        BitSet bitSet = qc9.A02;
        bitSet.set(1);
        qIh.A00 = A00;
        bitSet.set(2);
        qIh.A01 = migColorScheme;
        bitSet.set(0);
        qc9.A2T(2Yg.A0B(c1qb, C8qY.class, "ThreadCustomizationPickerEmojiSection", new Object[]{null}, -230625247));
        C1rs.A03(bitSet, qc9.A03);
        qc9.A0J();
        C1rq A01 = C1rg.A01(c1qb, null, 0);
        A01.A0C(i);
        A01.A2c();
        A0I.A05(7zL.A0d(qIh, A01));
        A0l.A00(A0I);
        7zQ.A1J(2Yg.A03(c1qb, C8qY.class, "ThreadCustomizationPickerEmojiSection"), A0l, 7zM.A0s(c1qb, immutableList));
        return A0l.A00;
    }

    public Object A0e(1Im r302, Object obj) {
        int i = r302.A01;
        C2hl c2hl = null;
        if (i == -230625247) {
            C8qY c8qY = r302.A00.A01;
            Emoji emoji = (Emoji) 7zN.A0o(r302);
            9Z6 r0 = c8qY.A01;
            r0.getClass();
            C9bf c9bf = r0.A00.A09;
            if (c9bf != null) {
                c9bf.A00(emoji, null);
                return null;
            }
        } else if (i == 1463818325) {
            1Iv r02 = r302.A00;
            C8qY c8qY2 = r02.A01;
            C1qb c1qb = (C1qb) r02.A00;
            Emoji emoji2 = (Emoji) ((C2i6) obj).A01;
            C8qY c8qY3 = c8qY2;
            int i2 = c8qY3.A00;
            ThreadCustomization threadCustomization = c8qY3.A02;
            MigColorScheme migColorScheme = c8qY3.A03;
            String str = threadCustomization == null ? null : threadCustomization.A02;
            C2hj A0m = 7zL.A0m();
            QC8 qc8 = new QC8(c1qb, new QIg());
            QIg qIg = qc8.A01;
            qIg.A01 = emoji2;
            BitSet bitSet = qc8.A02;
            bitSet.set(1);
            qIg.A02 = emoji2.A07().equals(str);
            bitSet.set(2);
            qc8.A2T(2Yg.A0B(c1qb, C8qY.class, "ThreadCustomizationPickerEmojiSection", new Object[]{emoji2}, -230625247));
            qIg.A00 = migColorScheme;
            bitSet.set(0);
            C1rs.A03(bitSet, qc8.A03);
            qc8.A0J();
            C1rq A01 = C1rg.A01(c1qb, null, 0);
            A01.A0C(i2);
            A01.A2c();
            c2hl = 7zM.A0t(7zL.A0d(qIg, A01), A0m);
        }
        return c2hl;
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qY c8qY = (C8qY) r302;
            MigColorScheme migColorScheme = this.A03;
            MigColorScheme migColorScheme2 = c8qY.A03;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            ImmutableList immutableList = this.A05;
            ImmutableList immutableList2 = c8qY.A05;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
            if (this.A00 != c8qY.A00) {
                return false;
            }
            9Z6 r0 = this.A01;
            9Z6 r02 = c8qY.A01;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            ThreadCustomization threadCustomization = this.A02;
            ThreadCustomization threadCustomization2 = c8qY.A02;
            if (threadCustomization != null) {
                if (!threadCustomization.equals(threadCustomization2)) {
                    return false;
                }
            } else if (threadCustomization2 != null) {
                return false;
            }
            ThreadThemeInfo threadThemeInfo = this.A04;
            ThreadThemeInfo threadThemeInfo2 = c8qY.A04;
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
