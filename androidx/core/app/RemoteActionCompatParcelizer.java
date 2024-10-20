package androidx.core.app;

import X.4iR;
import X.7zS;
import X.C3086Jio;
import X.L5P;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: RemoteActionCompatParcelizer.class */
public class RemoteActionCompatParcelizer {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.app.RemoteActionCompat, java.lang.Object] */
    public static RemoteActionCompat read(L5P l5p) {
        ?? obj = new Object();
        4iR r303 = obj.A01;
        if (l5p.A09(1)) {
            r303 = l5p.A04();
        }
        obj.A01 = (IconCompat) r303;
        CharSequence charSequence = obj.A03;
        if (l5p.A09(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3086Jio) l5p).A05);
        }
        obj.A03 = charSequence;
        CharSequence charSequence2 = obj.A02;
        if (l5p.A09(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3086Jio) l5p).A05);
        }
        obj.A02 = charSequence2;
        obj.A00 = (PendingIntent) l5p.A02(obj.A00, 4);
        boolean z = obj.A04;
        if (l5p.A09(5)) {
            z = 7zS.A1Z(((C3086Jio) l5p).A05);
        }
        obj.A04 = z;
        boolean z2 = obj.A05;
        if (l5p.A09(6)) {
            z2 = 7zS.A1Z(((C3086Jio) l5p).A05);
        }
        obj.A05 = z2;
        return obj;
    }

    public static void write(RemoteActionCompat remoteActionCompat, L5P l5p) {
        IconCompat iconCompat = remoteActionCompat.A01;
        l5p.A05(1);
        l5p.A08(iconCompat);
        CharSequence charSequence = remoteActionCompat.A03;
        l5p.A05(2);
        Parcel parcel = ((C3086Jio) l5p).A05;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.A02;
        l5p.A05(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        l5p.A07(remoteActionCompat.A00, 4);
        boolean z = remoteActionCompat.A04;
        l5p.A05(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.A05;
        l5p.A05(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
