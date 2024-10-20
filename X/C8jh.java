package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.8jh, reason: invalid class name */
/* loaded from: 8jh.class */
public final class C8jh extends C1rj {
    public int A00;
    public FbUserSession A01;
    public 9KF A02;
    public MigColorScheme A03;
    public String[] A04;

    public C8jh() {
        super("ReactionsEditorComponent");
    }

    public final Object[] A0k() {
        return 7zU.A1b(this.A03, this.A01, this.A02, this.A04, this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str;
        String str2;
        2K3 r314;
        FbUserSession fbUserSession = this.A01;
        String[] strArr = this.A04;
        MigColorScheme migColorScheme = this.A03;
        9KF r0 = this.A02;
        int i = this.A00;
        6qY r02 = (6qY) 1Lo.A06(fbUserSession, 67662);
        Context context = r302.A0D;
        MigColorScheme migColorScheme2 = (MigColorScheme) 1Bn.A0E(context, (1BY) null, 16980);
        C00i c00i = ((6qV) 1Bi.A03(67661)).A02.A00;
        Object obj = c00i.get();
        C0et c0et = C0et.A0P;
        String str3 = "";
        if (AnonymousClass001.A1W(obj, c0et)) {
            String string = context.getResources().getString(2131955343);
            str = string.replace("#", strArr[0]);
            int indexOf = string.indexOf("#");
            Drawable B5x = r02.B5x(context, strArr[0]);
            str2 = str3;
            if (indexOf >= 0) {
                str2 = str3;
                if (B5x != null) {
                    SpannableString spannableString = new SpannableString(string);
                    int A02 = C0A8.A02(context, 14.0f);
                    B5x.setBounds(0, 0, A02, A02);
                    spannableString.setSpan(new ImageSpan(B5x), indexOf, indexOf + 1, 33);
                    str2 = spannableString;
                }
            }
        } else {
            str = str3;
            str2 = str3;
        }
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A2c();
        C1ro c1ro = C1ro.CENTER;
        A01.A2g(c1ro);
        Resources resources = context.getResources();
        float f = 0.0f;
        if (resources.getConfiguration().orientation == 1) {
            f = 60.0f;
        }
        A01.A1B(f);
        8PZ r03 = new 8PZ(r302, new 8lT());
        8lT r04 = r03.A01;
        r04.A01 = fbUserSession;
        BitSet bitSet = r03.A02;
        bitSet.set(1);
        r04.A03 = migColorScheme;
        bitSet.set(0);
        r04.A04 = strArr;
        bitSet.set(3);
        r04.A00 = i;
        bitSet.set(4);
        r04.A02 = r0;
        bitSet.set(2);
        C1rs.A04(bitSet, r03.A03);
        r03.A0J();
        A01.A2e(r04);
        2KD A012 = 2K3.A01(r302, 0);
        A012.A2z(resources.getString(2131955342));
        A012.A19(16.0f);
        A012.A0X();
        A012.A2j();
        A012.A2x(migColorScheme2);
        A012.A1y(c1ro);
        A012.A2X();
        A012.A2b();
        4YU.A1K(A01, A012);
        if (c00i.get() == c0et) {
            2KD A13 = 7zM.A13(r302, str2, 0);
            A13.A2S(str);
            A13.A2j();
            A13.A1A(16.0f);
            A13.A0X();
            A13.A2x(migColorScheme2);
            A13.A32(true);
            A13.A1y(c1ro);
            A13.A2X();
            A13.A2b();
            r314 = A13.A2W();
        } else {
            r314 = null;
        }
        return 7zL.A0V(A01, r314);
    }
}
