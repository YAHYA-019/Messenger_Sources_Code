package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ProfileRange;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* renamed from: X.5am, reason: invalid class name */
/* loaded from: 5am.class */
public final class C5am {
    public 1BY A00;
    public final AnonymousClass242 A01;
    public final C00i A02 = new 1BQ(33013);
    public final String A03;

    public C5am(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A01 = (AnonymousClass242) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 16907);
        this.A03 = ((1G1) fbUserSession).A02;
    }

    public static SpannableStringBuilder A00(Integer num, String str, String str2, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String[] split = str.split(" ");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int length = split.length;
            if (i3 >= length) {
                spannableStringBuilder.setSpan(new C7qw(num, str2, arrayList), 0, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(split[i3]);
            if (i3 != length - 1) {
                spannableStringBuilder2.append(' ');
            }
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
            spannableStringBuilder2.setSpan(foregroundColorSpan, 0, spannableStringBuilder2.length(), 33);
            arrayList.add(foregroundColorSpan);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            i2 = i3 + 1;
        }
    }

    public boolean A01(Message message) {
        ImmutableList immutableList = message.A0x;
        boolean z = false;
        if (!09K.A01(immutableList)) {
            1Du it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (this.A03.equals(((ProfileRange) it.next()).id)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public boolean A02(Message message) {
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) this.A02.get();
        ThreadKey threadKey = message.A0V;
        1G2 r0 = 1NK.A05;
        boolean z = false;
        if (!fbSharedPreferences.AZn(AbstractC03303xn.A03(threadKey), false) && A01(message)) {
            z = true;
        }
        return z;
    }
}
