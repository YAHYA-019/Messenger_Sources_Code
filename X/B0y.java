package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.reactions.model.ReactionsSet;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.emoji.model.EmojiSet;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;

/* loaded from: B0y.class */
public final class B0y extends C1rj {
    public static final ReactionsSet A0E = new ReactionsSet();
    public int A00;
    public FbUserSession A01;
    public DF1 A02;
    public DGr A03;
    public EeF A04;
    public ReactionsSet A05;
    public 4LT A06;
    public MigColorScheme A07;
    public ThreadThemeInfo A08;
    public HashSet A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;

    public B0y() {
        super("EmojiPickerComponent");
        this.A05 = A0E;
        this.A00 = 0;
    }

    public static AwW A00(1Iw r301) {
        return new AwW(r301, new B0y());
    }

    public final Object[] A0k() {
        return new Object[]{this.A09, this.A07, this.A04, this.A0A, this.A01, Boolean.valueOf(this.A0B), Boolean.valueOf(this.A0C), this.A02, this.A06, this.A05, Boolean.valueOf(this.A0D), Integer.valueOf(this.A00), this.A03, this.A08};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        1LI A2W;
        B1v b1v = (B1v) 4YU.A0P(r302);
        FbUserSession fbUserSession = this.A01;
        DF1 df1 = this.A02;
        MigColorScheme migColorScheme = this.A07;
        List<EmojiSet> list = this.A0A;
        DGr dGr = this.A03;
        ReactionsSet reactionsSet = this.A05;
        EeF eeF = this.A04;
        boolean z = this.A0B;
        boolean z2 = this.A0C;
        int i3 = this.A00;
        ThreadThemeInfo threadThemeInfo = this.A08;
        4LT r0 = this.A06;
        boolean z3 = this.A0D;
        HashSet hashSet = this.A09;
        int[] iArr = b1v.A03;
        C2iw c2iw = b1v.A00;
        C2kx c2kx = b1v.A01;
        C1372Afe c1372Afe = b1v.A02;
        df1.getClass();
        int size = View.MeasureSpec.getSize(i);
        Context context = r302.A0D;
        int A00 = size - (C0A8.A00(context, 10.0f) * 2);
        int A002 = A00 / C0A8.A00(context, 60.0f);
        int i4 = A00 / A002;
        C1qb c1qb = new C1qb(r302);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        C1833Au6 c1833Au6 = new C1833Au6(r302, new B0S());
        B0S b0s = c1833Au6.A01;
        b0s.A04 = fbUserSession;
        BitSet bitSet = c1833Au6.A02;
        bitSet.set(2);
        b0s.A0E = z;
        b0s.A0F = z2;
        b0s.A0B = r0;
        3wU r02 = new 3wU();
        r02.A01 = A002;
        r02.A02 = 1;
        b0s.A07 = r02.A00();
        bitSet.set(5);
        B1z b1z = new B1z();
        b1z.A07 = list;
        b1z.A00 = i4;
        b1z.A03 = eeF;
        b1z.A01 = df1;
        b1z.A05 = migColorScheme;
        b1z.A04 = reactionsSet;
        b1z.A06 = threadThemeInfo;
        b1z.A08 = z2;
        b1z.A02 = dGr;
        b0s.A05 = b1z;
        bitSet.set(1);
        b0s.A02 = i3;
        b0s.A08 = df1;
        bitSet.set(4);
        b0s.A01 = i4;
        bitSet.set(3);
        c1833Au6.A0m(100.0f);
        c1833Au6.A10(100.0f);
        b0s.A00 = ((C1rs) c1833Au6).A02.A02(10.0f);
        b0s.A0C = migColorScheme;
        bitSet.set(0);
        b0s.A0A = reactionsSet;
        b0s.A09 = dGr;
        b0s.A06 = c2kx;
        b0s.A03 = c1372Afe;
        b0s.A0D = hashSet;
        A01.A2d(c1833Au6);
        if (z3) {
            C9ak c9ak = new C9ak();
            for (EmojiSet emojiSet : list) {
                Resources A0E2 = 4YU.A0E(c1qb);
                Drawable drawable = A0E2.getDrawable(emojiSet.A01);
                drawable.getClass();
                c9ak.A01(A0E2.getString(emojiSet.A00), drawable);
            }
            8TK A003 = 3wK.A00(c1qb);
            A003.A2Z(1Fj.A01(c9ak.A01));
            A003.A2X(migColorScheme);
            A003.A2Y(new C9zf(iArr, c2kx, 1));
            A003.A1w(c2iw);
            A2W = A003.A2W();
        } else {
            A2W = null;
        }
        2cL A0V = 7zL.A0V(A01, A2W);
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int i5 = 1;
        while (true) {
            int i6 = i5;
            if (i6 >= size2) {
                break;
            }
            int i7 = i6 - 1;
            iArr2[i6] = iArr2[i7] + ((EmojiSet) list.get(i7)).A03.A01.size() + 1;
            i5 = i6 + 1;
        }
        if (!Arrays.equals(iArr, iArr2)) {
            c1372Afe.A00 = iArr2;
            if (r302.A02 != null) {
                r302.A0G(7zQ.A0V(iArr2, 0), "updateState:EmojiPickerComponent.onUpdateSectionOffsets");
            }
        }
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        A012.A2e(A0V);
        A012.A10(100.0f);
        return A012.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.2iw, java.lang.Object] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1v b1v = (B1v) r303;
        List list = this.A0A;
        int size = list.size();
        int[] iArr = new int[size];
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                ?? obj = new Object();
                C2kx c2kx = new C2kx();
                C1372Afe c1372Afe = new C1372Afe(r302, obj, iArr);
                b1v.A03 = iArr;
                b1v.A00 = obj;
                b1v.A01 = c2kx;
                b1v.A02 = c1372Afe;
                return;
            }
            int i3 = i2 - 1;
            iArr[i2] = iArr[i3] + ((EmojiSet) list.get(i3)).A03.A01.size() + 1;
            i = i2 + 1;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
