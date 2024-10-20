package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import com.facebook.messaging.model.messages.Message;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.phonenumbers.Phonenumber$PhoneNumber;

/* loaded from: Cv7.class */
public final /* synthetic */ class Cv7 implements AYJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ Spanned A02;
    public final /* synthetic */ ClickableSpan A03;
    public final /* synthetic */ 06Z A04;
    public final /* synthetic */ Message A05;
    public final /* synthetic */ C9mX A06;
    public final /* synthetic */ C6p0 A07;
    public final /* synthetic */ C5id A08;

    public /* synthetic */ Cv7(Context context, Uri uri, Spanned spanned, ClickableSpan clickableSpan, 06Z r306, Message message, C9mX c9mX, C6p0 c6p0, C5id c5id) {
        this.A07 = c6p0;
        this.A06 = c9mX;
        this.A05 = message;
        this.A01 = uri;
        this.A00 = context;
        this.A04 = r306;
        this.A08 = c5id;
        this.A03 = clickableSpan;
        this.A02 = spanned;
    }

    public final void C6Y(Integer num) {
        CharSequence A00;
        Phonenumber$PhoneNumber A01;
        C6p0 c6p0 = this.A07;
        C9mX c9mX = this.A06;
        Message message = this.A05;
        Uri uri = this.A01;
        Context context = this.A00;
        C5id c5id = this.A08;
        ClickableSpan clickableSpan = this.A03;
        Spanned spanned = this.A02;
        int intValue = num.intValue();
        if (intValue == 1) {
            c9mX.A04(6Pq.A05, message);
            C6p0.A01(context, uri, message, c6p0, c5id, null);
            return;
        }
        if (intValue == 4) {
            CharSequence A002 = C6p0.A00(spanned, clickableSpan);
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager == null || A002 == null) {
                return;
            }
            c9mX.A04(6Pq.A06, message);
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Link", A002));
            return;
        }
        if (intValue != 2 || (A00 = C6p0.A00(spanned, clickableSpan)) == null) {
            return;
        }
        CNX cnx = (CNX) c6p0.A05.get();
        String charSequence = A00.toString();
        String A0j = 0Pz.A0j("http://wa.me/", (charSequence == null || charSequence.length() == 0 || (A01 = cnx.A01(charSequence)) == null) ? null : ((PhoneNumberUtil) 1Br.A0B(cnx.A00)).format(A01, PhoneNumberUtil.PhoneNumberFormat.E164), "?app=messenger&source_surface=6");
        PackageManager packageManager = context.getPackageManager();
        C00i c00i = c6p0.A07;
        c00i.get();
        if (6Ki.A03(packageManager, "com.whatsapp")) {
            c6p0.A03.get();
            Uri parse = Uri.parse(A0j);
            if (parse != null) {
                Intent A05 = AbG.A05();
                A05.setData(parse);
                c9mX.A04(6Pq.A0G, message);
                A05.setPackage("com.whatsapp");
                0LS.A09(context, A05);
                return;
            }
            return;
        }
        6Ki r0 = (6Ki) c00i.get();
        if (r0.A06() && r0.A07()) {
            c9mX.A04(6Pq.A0G, message);
            ((6Ki) c00i.get()).A05(context, "com.whatsapp", "m4a", "msgr_thread_pn");
            return;
        }
        c6p0.A03.get();
        Uri parse2 = Uri.parse(A0j);
        if (parse2 != null) {
            Intent A052 = AbG.A05();
            A052.setData(parse2);
            c9mX.A04(6Pq.A0G, message);
            0LS.A0C(context, A052);
        }
    }
}
