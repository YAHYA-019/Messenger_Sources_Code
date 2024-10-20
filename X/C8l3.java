package X;

import android.graphics.drawable.Drawable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.emoji.model.Emoji;

/* renamed from: X.8l3, reason: invalid class name */
/* loaded from: 8l3.class */
public final class C8l3 extends C1rj {
    public Drawable A00;
    public Drawable A01;
    public ThreadKey A02;
    public 9OP A03;
    public Emoji A04;
    public AYj A05;
    public AZl A06;
    public boolean A07;

    public C8l3() {
        super("EmojiCustomizationPickerIconComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A06, this.A00, this.A05, this.A04, Boolean.valueOf(this.A07), this.A03, this.A01, this.A02};
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00c7, code lost:
    
        if (r308 == null) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Throwable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable, com.facebook.ui.emoji.model.Emoji] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8l3.A0y(X.1Iw):X.1LI");
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
        if (i != -230625247) {
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        C8l3 c8l3 = (C8l3) r02;
        AZl aZl = c8l3.A06;
        AYj aYj = c8l3.A05;
        ThreadKey threadKey = c8l3.A02;
        Emoji emoji = c8l3.A04;
        11T.A0F(r03, 0);
        1BL.A1H(aZl, aYj, threadKey);
        aZl.Cnk(7zL.A0A(r03), threadKey, emoji);
        aYj.BuH();
        return null;
    }
}
