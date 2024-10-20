package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.api.model.RichStatusMention;
import com.facebook.presence.note.mentions.MentionData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.9mt, reason: invalid class name */
/* loaded from: 9mt.class */
public final class C9mt {
    public final 1Br A00 = 7zM.A0Y();
    public final 1Br A02 = 7zM.A0O();
    public final 1Br A01 = 1Bu.A00(66725);

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[EDGE_INSN: B:23:0x00c5->B:24:0x00c5 BREAK  A[LOOP:1: B:13:0x0068->B:28:0x0068], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.facebook.presence.note.mentions.MentionData A00(java.lang.CharSequence r301, java.util.List r302, int r303, boolean r304) {
        /*
            r0 = r302
            r1 = r301
            X.1BK.A1M(r0, r1)
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r305 = r0
            r0 = r302
            java.util.Iterator r0 = r0.iterator()
            r306 = r0
        L12:
            r0 = r306
            boolean r0 = r0.hasNext()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L5f
            r0 = r306
            java.lang.Object r0 = r0.next()
            r308 = r0
            r0 = r308
            r309 = r0
            r0 = r308
            com.facebook.presence.note.mentions.MentionData r0 = (com.facebook.presence.note.mentions.MentionData) r0
            r309 = r0
            r0 = r309
            java.lang.String r0 = r0.A01
            r310 = r0
            r0 = r309
            int r0 = r0.A00
            r311 = r0
            r0 = r301
            r1 = r310
            r2 = r311
            r3 = 0
            int r0 = X.0CU.A04(r0, r1, r2, r3)
            r307 = r0
            r0 = r307
            r1 = r311
            if (r0 != r1) goto L12
            r0 = r305
            r1 = r308
            boolean r0 = r0.add(r1)
            goto L12
        L5f:
            r0 = r305
            java.util.Iterator r0 = r0.iterator()
            r306 = r0
        L68:
            r0 = r306
            boolean r0 = r0.hasNext()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9e
            r0 = r306
            java.lang.Object r0 = r0.next()
            r308 = r0
            r0 = r308
            r310 = r0
            r0 = r308
            com.facebook.presence.note.mentions.MentionData r0 = (com.facebook.presence.note.mentions.MentionData) r0
            r310 = r0
            r0 = r310
            int r0 = r0.A00
            r311 = r0
            r0 = r304
            if (r0 == 0) goto La4
            r0 = r303
            r1 = r311
            if (r0 >= r1) goto Laa
            goto L68
        L9e:
            r0 = 0
            r308 = r0
            goto Lc5
        La4:
            r0 = r303
            r1 = r311
            if (r0 <= r1) goto L68
        Laa:
            r0 = r310
            java.lang.String r0 = r0.A01
            r310 = r0
            r0 = r310
            int r0 = r0.length()
            r307 = r0
            r0 = r311
            r1 = r307
            int r0 = r0 + r1
            r311 = r0
            r0 = r303
            r1 = r311
            if (r0 >= r1) goto L68
        Lc5:
            r0 = r308
            com.facebook.presence.note.mentions.MentionData r0 = (com.facebook.presence.note.mentions.MentionData) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9mt.A00(java.lang.CharSequence, java.util.List, int, boolean):com.facebook.presence.note.mentions.MentionData");
    }

    public static final ArrayList A01(CharSequence charSequence, List list, int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            if (((C5g9) obj).A00.optInt("offset") + i < charSequence.length()) {
                A0s.add(obj);
            }
        }
        ArrayList A0z = 1BL.A0z(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = ((C5g9) it.next()).A00;
            int optInt = jSONObject.optInt("offset") + i;
            A0z.add(new MentionData("", 7zO.A0u(charSequence, optInt, 7zO.A07(charSequence, jSONObject.optInt("length") + optInt)), optInt));
        }
        return A0z;
    }

    public static final List A02(CharSequence charSequence, List list, int i, int i2) {
        1BK.A1M(list, charSequence);
        List A00 = AHX.A00(list, 7);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : A00) {
            MentionData mentionData = (MentionData) obj;
            String str = mentionData.A01;
            int i3 = mentionData.A00;
            if (0CU.A04(charSequence, str, i3, false) == i3) {
                A0s.add(obj);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (Object obj2 : A0s) {
            MentionData mentionData2 = (MentionData) obj2;
            int i4 = mentionData2.A00;
            if (i < mentionData2.A01.length() + i4 && i2 > i4) {
                A0s2.add(obj2);
            }
        }
        return A0s2;
    }

    public static final List A03(List list, int i, int i2) {
        11T.A0F(list, 0);
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MentionData mentionData = (MentionData) it.next();
            int i3 = mentionData.A00;
            if (i3 >= i) {
                int i4 = i3 + i2;
                String str = mentionData.A02;
                String str2 = mentionData.A01;
                1BK.A1M(str, str2);
                mentionData = new MentionData(str, str2, i4);
            }
            A0z.add(mentionData);
        }
        return A0z;
    }

    public static final void A04(Spannable spannable, C9mt c9mt, List list, boolean z) {
        8C1 r312;
        1BK.A1M(list, spannable);
        Object[] spans = spannable.getSpans(0, spannable.length(), AX7.class);
        11T.A0A(spans);
        for (Object obj : spans) {
            spannable.removeSpan(obj);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MentionData mentionData = (MentionData) it.next();
            int i = mentionData.A00;
            int A07 = 7zO.A07(spannable, mentionData.A01.length() + i);
            String str = mentionData.A02;
            Context A00 = FbInjector.A00();
            if (z) {
                11T.A0D(A00);
                r312 = new 8C1(A00, str, new AKE(c9mt, 5));
            } else {
                11T.A0D(A00);
                r312 = new 8C4(A00);
            }
            spannable.setSpan(r312, i, A07, 33);
        }
    }

    public final CharSequence A05(CharSequence charSequence, List list, boolean z) {
        11T.A0H(list, charSequence);
        if (list.isEmpty() || charSequence.length() == 0) {
            return charSequence;
        }
        ArrayList<RichStatusMention> A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            if (((RichStatusMention) obj).A01 < charSequence.length()) {
                A0s.add(obj);
            }
        }
        ArrayList A0z = 1BL.A0z(A0s);
        for (RichStatusMention richStatusMention : A0s) {
            String valueOf = String.valueOf(richStatusMention.A02);
            long j = richStatusMention.A01;
            int i = (int) j;
            A0z.add(new MentionData(valueOf, 7zO.A0u(charSequence, i, 7zO.A07(charSequence, (int) (j + richStatusMention.A00))), i));
        }
        SpannableString spannableString = new SpannableString(charSequence);
        A04(spannableString, this, A0z, z);
        return spannableString;
    }

    public final void A06(Context context, Spannable spannable, List list) {
        ArrayList A01;
        boolean A1X = 1BL.A1X(context, spannable);
        C07u A04 = new C04t("�� (.*)\\n(.*)\\n(.*)").A04(spannable, 0);
        if (0AI.A00(A04) <= 0 || ((0PH) 0AI.A01(A04)).A00().size() != 4) {
            A01 = A01(spannable, list, 0);
        } else {
            List A00 = ((0PH) 0AI.A01(A04)).A00();
            String A14 = 1BK.A14(A00, A1X ? 1 : 0);
            String A142 = 1BK.A14(A00, 2);
            int length = A14.length() + 3 + 1;
            int length2 = A142.length() + length + 1;
            MigColorScheme A0c = 7zR.A0c(context);
            A01 = A01(spannable, list, length2);
            spannable.setSpan(new ForegroundColorSpan(A0c.B9Q()), length, length2, 33);
        }
        A04(spannable, this, A01, false);
    }
}
