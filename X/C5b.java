package X;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: C5b.class */
public final class C5b {
    public int A00;
    public int A01;
    public int A02;
    public PendingIntent A03;
    public PendingIntent A04;
    public IconCompat A05;
    public String A06;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.4vL, java.lang.Object] */
    public 4vL A00() {
        String str = this.A06;
        if (str == null) {
            if (this.A04 == null) {
                throw AnonymousClass001.A0Q("Must supply pending intent or shortcut to bubble");
            }
            if (this.A05 == null) {
                throw AnonymousClass001.A0Q("Must supply an icon or shortcut for the bubble");
            }
        }
        PendingIntent pendingIntent = this.A04;
        PendingIntent pendingIntent2 = this.A03;
        IconCompat iconCompat = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        ?? obj = new Object();
        ((4vL) obj).A04 = pendingIntent;
        ((4vL) obj).A05 = iconCompat;
        ((4vL) obj).A00 = i;
        ((4vL) obj).A01 = i2;
        ((4vL) obj).A03 = pendingIntent2;
        ((4vL) obj).A02 = i3;
        ((4vL) obj).A06 = str;
        ((4vL) obj).A02 = i3;
        return obj;
    }
}
