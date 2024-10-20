package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2qk, reason: invalid class name */
/* loaded from: 2qk.class */
public final class C2qk extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public Typeface A03;
    public Drawable A04;
    public Layout.Alignment A05;
    public 2K8 A06;
    public 2KG A07;
    public C2p1 A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public static final Typeface A0C = Typeface.DEFAULT;
    public static final Layout.Alignment A0D = Layout.Alignment.ALIGN_NORMAL;
    public static final 2KG A0F = 2KG.A03;
    public static final 2K8 A0E = 2K5.A03;

    public C2qk() {
        super("ThreadNameComponent");
        this.A07 = A0F;
        this.A0A = false;
        this.A00 = 1;
        this.A05 = A0D;
        this.A06 = A0E;
        this.A03 = A0C;
    }

    public static C2qt A00(Drawable drawable, C01s c01s, C2qo c2qo, C2p2 c2p2, int i) {
        C2qt c2qt = new C2qt(c2p2.A00);
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i);
            CharSequence charSequence = c2qt.A00;
            charSequence.getClass();
            SpannableStringBuilder A00 = 9EA.A00(drawable, new SpannableStringBuilder().append((CharSequence) "DRAWABLE_PLACEHOLDER").append((CharSequence) " ").append(charSequence), "DRAWABLE_PLACEHOLDER");
            if (A00 != null) {
                c2qt = new C2qt(A00);
            }
        }
        C2qt A01 = c2qo.A01(c2qt, i);
        if (A01.A00.length() == 0) {
            c01s.D0v("ThreadNameComponentSpec", "Empty name text displayed");
        }
        return A01;
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v118, types: [X.23P, java.lang.Object] */
    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        2dD A00;
        String str;
        C2p1 c2p1 = this.A08;
        int i3 = this.A01;
        int i4 = this.A02;
        Typeface typeface = this.A03;
        int i5 = this.A00;
        Layout.Alignment alignment = this.A05;
        2KG r0 = this.A07;
        2K8 r02 = this.A06;
        boolean z = this.A0B;
        String str2 = this.A09;
        boolean z2 = this.A0A;
        Drawable drawable = this.A04;
        Context context = r302.A0D;
        C2qo c2qo = (C2qo) 1Hv.A02(context, 17098);
        C01s c01s = (C01s) 1Bi.A03(16511);
        C2p2 c2p2 = str2 == null ? null : new C2p2(str2);
        C2yv A002 = 2KF.A00(r302);
        2KF r03 = A002.A01;
        r03.A08 = i5;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        r03.A0E = truncateAt;
        float f = i4;
        11T.A0F(context, 0);
        r03.A02 = (int) (f / context.getResources().getDisplayMetrics().scaledDensity);
        A002.A2X(i3);
        r03.A0H = 2KH.A00(alignment, r0);
        r03.A0C = typeface;
        r03.A0F = r02;
        if (c2p1 == null) {
            A002.A2Y("");
            A00 = C2dB.A00(r302);
            A00.A2X(A002.A2W());
            A00.A2K("thread_name");
        } else if (z2) {
            String string = context.getResources().getString(2131967030);
            string.getClass();
            CharSequence charSequence = new C2qt(new C2p2(string).A00).A00;
            charSequence.getClass();
            A002.A2Y(charSequence);
            A00 = C2dB.A00(r302);
            A00.A2X(A002.A2W());
            A00.A2K("thread_name");
            A00.A1J(2131967030);
        } else {
            C2p2 c2p22 = c2p1.A00;
            if (c2p22 != null) {
                CharSequence charSequence2 = A00(drawable, c01s, c2qo, c2p22, i4).A00;
                charSequence2.getClass();
                A002.A2Y(charSequence2);
                A00 = C2dB.A00(r302);
                A00.A2X(A002.A2W());
                A00.A2K("thread_name");
                str = C2qo.A00(context, c2p2, c2p22, z).A00;
            } else {
                C2p4 c2p4 = c2p1.A01;
                ImmutableList immutableList = c2p4.A01;
                int size = immutableList.size();
                C2p2 A003 = C2qo.A00(context, c2p2, c2qo.A03(c2p4), z);
                if (size >= 2 && View.MeasureSpec.getMode(i) != 0) {
                    C00j.A05("ThreadNameComponent#GroupName", -1490296242);
                    try {
                        int size2 = View.MeasureSpec.getSize(i);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        ?? obj = new Object();
                        String str3 = (String) immutableList.get(0);
                        str3.getClass();
                        C2p2 c2p23 = new C2p2(str3);
                        C2p2 A02 = c2qo.A02(size - 1);
                        String str4 = c2p23.A00;
                        str4.getClass();
                        String str5 = A02.A00;
                        str5.getClass();
                        String A0W = 0Pz.A0W(str4, str5);
                        A0W.getClass();
                        CharSequence charSequence3 = c2qo.A01(new C2qt(new C2p2(A0W).A00), i4).A00;
                        charSequence3.getClass();
                        A002.A2Y(charSequence3);
                        1LI A2W = A002.A2W();
                        int i6 = 1;
                        do {
                            ImmutableList subList = immutableList.subList(0, i6);
                            C2qq c2qq = c2qo.A00.A00;
                            subList.getClass();
                            String A01 = c2qq.A01(subList);
                            A01.getClass();
                            String str6 = new C2p2(A01).A00;
                            str6.getClass();
                            StringBuilder sb = new StringBuilder(str6);
                            if (i6 < size) {
                                String str7 = c2qo.A02(size - i6).A00;
                                str7.getClass();
                                sb.append(str7);
                            }
                            C2yv A004 = 2KF.A00(r302);
                            2KF r04 = A004.A01;
                            r04.A08 = i5;
                            r04.A0E = truncateAt;
                            r04.A02 = (int) (f / context.getResources().getDisplayMetrics().scaledDensity);
                            A004.A2X(i3);
                            r04.A0C = typeface;
                            String obj2 = sb.toString();
                            obj2.getClass();
                            CharSequence charSequence4 = A00(drawable, c01s, c2qo, new C2p2(obj2), i4).A00;
                            charSequence4.getClass();
                            A004.A2Y(charSequence4);
                            r04.A0F = r02;
                            1LI A2W2 = A004.A2W();
                            A2W2.A0e(r302, (C23P) obj, makeMeasureSpec, makeMeasureSpec, false);
                            if (obj.A01 > size2) {
                                break;
                            }
                            i6++;
                            A2W = A2W2;
                        } while (i6 <= size);
                        2dD A005 = C2dB.A00(r302);
                        A005.A2X(A2W);
                        A005.A2K("thread_name");
                        String str8 = A003.A00;
                        str8.getClass();
                        A005.A2S(str8);
                        2dC A2W3 = A005.A2W();
                        C00j.A01(-1461663526);
                        return A2W3;
                    } catch (Throwable th) {
                        C00j.A01(-1031819883);
                        throw th;
                    }
                }
                CharSequence charSequence5 = A00(drawable, c01s, c2qo, c2qo.A03(c2p4), i4).A00;
                charSequence5.getClass();
                A002.A2Y(charSequence5);
                A00 = C2dB.A00(r302);
                A00.A2X(A002.A2W());
                A00.A2K("thread_name");
                str = A003.A00;
            }
            str.getClass();
            A00.A2S(str);
        }
        return A00.A2W();
    }
}
