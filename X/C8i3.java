package X;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.note.music.musicpicker.model.MusicData;
import java.util.List;

/* renamed from: X.8i3, reason: invalid class name */
/* loaded from: 8i3.class */
public final class C8i3 extends 1LH {
    public static final C1rn A0E = new C1rn(7zN.A0g());
    public final int A00;
    public final int A01;
    public final MigColorScheme A02;
    public final C03513yC A03;
    public final 8LZ A04;
    public final MusicData A05;
    public final 9PP A06;
    public final String A07;
    public final List A08;
    public final float A09;
    public final InputFilter A0A;
    public final TextWatcher A0B;
    public final C2iw A0C;
    public final boolean A0D;

    public C8i3(InputFilter inputFilter, TextWatcher textWatcher, C2iw c2iw, MigColorScheme migColorScheme, C03513yC c03513yC, 8LZ r307, MusicData musicData, 9PP r309, String str, List list, float f, int i, boolean z) {
        11T.A0F(migColorScheme, 1);
        7zR.A1Q(c2iw, inputFilter);
        11T.A0F(c03513yC, 13);
        this.A02 = migColorScheme;
        this.A06 = r309;
        this.A04 = r307;
        this.A05 = musicData;
        this.A08 = list;
        this.A01 = i;
        this.A00 = 60;
        this.A07 = str;
        this.A0C = c2iw;
        this.A0A = inputFilter;
        this.A0B = textWatcher;
        this.A0D = z;
        this.A03 = c03513yC;
        this.A09 = f;
    }

    private final SpannableString A01(C2k6 c2k6) {
        SpannableString spannableString = new SpannableString(3yH.A09(c2k6, 2131962177));
        spannableString.setSpan(new 8Br(this, 11), 0, spannableString.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(this.A02.Atv()), 0, spannableString.length(), 33);
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0509, code lost:
    
        if (r0.isEmpty() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x07b3, code lost:
    
        if (new X.C4s1(X.7zL.A0A(r0.AeS())).A05() <= 160) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00d5, code lost:
    
        if (r301.A01 == 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0912  */
    /* JADX WARN: Type inference failed for: r0v387, types: [java.lang.Object, X.0PI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0s(X.C2k5 r302) {
        /*
            Method dump skipped, instructions count: 2986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8i3.A0s(X.2k5):X.1LI");
    }
}
