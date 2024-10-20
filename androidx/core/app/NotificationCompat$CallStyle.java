package androidx.core.app;

import X.4iX;
import X.4vI;
import X.5Ud;
import X.5YV;
import X.5sW;
import X.C5se;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: NotificationCompat$CallStyle.class */
public final class NotificationCompat$CallStyle extends 4vI {
    public int A00;
    public PendingIntent A01;
    public PendingIntent A02;
    public PendingIntent A03;
    public 5Ud A04;
    public Integer A05;
    public Integer A06;
    public boolean A07;
    public IconCompat A08;
    public CharSequence A09;

    public static 5YV A00(PendingIntent pendingIntent, NotificationCompat$CallStyle notificationCompat$CallStyle, Integer num, int i, int i2, int i3) {
        if (num == null) {
            num = Integer.valueOf(((4vI) notificationCompat$CallStyle).A00.A0C.getColor(i3));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) ((4vI) notificationCompat$CallStyle).A00.A0C.getResources().getString(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
        Context context = ((4vI) notificationCompat$CallStyle).A00.A0C;
        context.getClass();
        5YV A01 = new 5sW(pendingIntent, IconCompat.A00(context.getResources(), context.getPackageName(), i), spannableStringBuilder).A01();
        A01.A08.putBoolean("key_action_priority", true);
        return A01;
    }

    public void A03(Bundle bundle) {
        super.A03(bundle);
        bundle.putInt("android.callType", this.A00);
        bundle.putBoolean("android.callIsVideo", this.A07);
        5Ud r0 = this.A04;
        if (r0 != null) {
            bundle.putParcelable("android.callPerson", C5se.A00(r0));
        }
        IconCompat iconCompat = this.A08;
        if (iconCompat != null) {
            bundle.putParcelable("android.verificationIcon", 4iX.A00(((4vI) this).A00.A0C, iconCompat));
        }
        bundle.putCharSequence("android.verificationText", this.A09);
        bundle.putParcelable("android.answerIntent", this.A01);
        bundle.putParcelable("android.declineIntent", this.A02);
        bundle.putParcelable("android.hangUpIntent", this.A03);
        Integer num = this.A05;
        if (num != null) {
            bundle.putInt("android.answerColor", num.intValue());
        }
        Integer num2 = this.A06;
        if (num2 != null) {
            bundle.putInt("android.declineColor", num2.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$CallStyle.A05(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a0, code lost:
    
        if (r308 == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(X.4vG r302) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$CallStyle.A06(X.4vG):void");
    }
}
