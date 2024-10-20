package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;

/* renamed from: X.2qo, reason: invalid class name */
/* loaded from: 2qo.class */
public final class C2qo {
    public final C2qr A00;
    public final C2qs A01;
    public final C22a A02;

    public C2qo() {
        Context A00 = FbInjector.A00();
        C2qr c2qr = (C2qr) 1Bn.A0A(67520);
        C22a c22a = (C22a) 1Bi.A03(66067);
        this.A01 = new C2qs(A00);
        this.A00 = c2qr;
        this.A02 = c22a;
    }

    public static C2p2 A00(Context context, C2p2 c2p2, C2p2 c2p22, boolean z) {
        Resources resources = new C2qs(context).A00;
        String str = c2p22.A00;
        str.getClass();
        String string = resources.getString(2131967028, str);
        string.getClass();
        C2p2 c2p23 = new C2p2(string);
        StringBuilder sb = new StringBuilder();
        if (z) {
            String str2 = c2p23.A00;
            str2.getClass();
            String string2 = resources.getString(2131967031, str2);
            string2.getClass();
            c2p23 = new C2p2(string2);
        }
        String str3 = c2p23.A00;
        str3.getClass();
        sb.append(str3);
        if (c2p2 != null) {
            String str4 = c2p2.A00;
            str4.getClass();
            if (!1JF.A0B(str4)) {
                String string3 = resources.getString(2131967032, str4);
                string3.getClass();
                String str5 = new C2p2(string3).A00;
                str5.getClass();
                sb.append(str5);
            }
        }
        String obj = sb.toString();
        obj.getClass();
        return new C2p2(obj);
    }

    public C2qt A01(C2qt c2qt, int i) {
        CharSequence charSequence = c2qt.A00;
        charSequence.getClass();
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
        C22a c22a = this.A02;
        if (c22a != null) {
            c22a.A7O(valueOf, i);
        }
        valueOf.getClass();
        return new C2qt(valueOf);
    }

    public C2p2 A02(int i) {
        String A00 = this.A00.A00.A00();
        A00.getClass();
        C2p2 c2p2 = new C2p2(A00);
        String string = this.A01.A00.getString(2131967029, Integer.valueOf(i));
        string.getClass();
        C2p2 c2p22 = new C2p2(string);
        String str = c2p2.A00;
        str.getClass();
        String str2 = c2p22.A00;
        str2.getClass();
        String A0W = 0Pz.A0W(str, str2);
        A0W.getClass();
        return new C2p2(A0W);
    }

    public C2p2 A03(C2p4 c2p4) {
        ImmutableList immutableList = c2p4.A01;
        String A01 = !immutableList.isEmpty() ? this.A00.A00.A01(immutableList) : this.A01.A00.getString(2131967033);
        A01.getClass();
        return new C2p2(A01);
    }
}
