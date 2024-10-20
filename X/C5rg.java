package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5rg, reason: invalid class name */
/* loaded from: 5rg.class */
public final class C5rg implements C5rh {
    public int A01;
    public int A03;
    public int A07;
    public PendingIntent A08;
    public Bitmap A09;
    public String A0A;
    public String A0B;
    public ArrayList A0C = new ArrayList();
    public int A05 = 1;
    public ArrayList A0D = new ArrayList();
    public int A02 = 8388613;
    public int A00 = -1;
    public int A04 = 0;
    public int A06 = 80;

    @Override // X.C5rh
    public C10924uz ARc(C10924uz c10924uz) {
        int i;
        Bundle bundle = new Bundle();
        ArrayList arrayList = this.A0C;
        if (!arrayList.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                5YV r0 = (5YV) it.next();
                IconCompat iconCompat = r0.A02;
                if (iconCompat == null && (i = r0.A00) != 0) {
                    iconCompat = IconCompat.A00(null, "", i);
                    r0.A02 = iconCompat;
                }
                Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? 4iX.A00((Context) null, iconCompat) : null, r0.A00(), r0.A01);
                Bundle bundle2 = new Bundle(r0.A08);
                boolean z = r0.A04;
                bundle2.putBoolean("android.support.allowGeneratedReplies", z);
                builder.setAllowGeneratedReplies(z);
                if (Build.VERSION.SDK_INT >= 31) {
                    7kN.A00(builder, r0.A05);
                }
                builder.addExtras(bundle2);
                C5rn[] c5rnArr = r0.A0A;
                if (c5rnArr != null) {
                    int length = c5rnArr.length;
                    RemoteInput[] remoteInputArr = new RemoteInput[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        remoteInputArr[i2] = C5sa.A00(c5rnArr[i2]);
                    }
                    for (int i3 = 0; i3 < length; i3++) {
                        builder.addRemoteInput(remoteInputArr[i3]);
                    }
                }
                arrayList2.add(builder.build());
            }
            bundle.putParcelableArrayList("actions", arrayList2);
        }
        int i4 = this.A05;
        if (i4 != 1) {
            bundle.putInt("flags", i4);
        }
        PendingIntent pendingIntent = this.A08;
        if (pendingIntent != null) {
            bundle.putParcelable("displayIntent", pendingIntent);
        }
        ArrayList arrayList3 = this.A0D;
        if (!arrayList3.isEmpty()) {
            bundle.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            bundle.putParcelable("background", bitmap);
        }
        int i5 = this.A01;
        if (i5 != 0) {
            bundle.putInt("contentIcon", i5);
        }
        int i6 = this.A02;
        if (i6 != 8388613) {
            bundle.putInt("contentIconGravity", i6);
        }
        int i7 = this.A00;
        if (i7 != -1) {
            bundle.putInt("contentActionIndex", i7);
        }
        int i8 = this.A04;
        if (i8 != 0) {
            bundle.putInt("customSizePreset", i8);
        }
        int i9 = this.A03;
        if (i9 != 0) {
            bundle.putInt("customContentHeight", i9);
        }
        int i10 = this.A06;
        if (i10 != 80) {
            bundle.putInt("gravity", i10);
        }
        int i11 = this.A07;
        if (i11 != 0) {
            bundle.putInt("hintScreenTimeout", i11);
        }
        String str = this.A0B;
        if (str != null) {
            bundle.putString("dismissalId", str);
        }
        String str2 = this.A0A;
        if (str2 != null) {
            bundle.putString("bridgeTag", str2);
        }
        Bundle bundle3 = c10924uz.A0D;
        if (bundle3 == null) {
            bundle3 = 1BK.A05();
            c10924uz.A0D = bundle3;
        }
        bundle3.putBundle("android.wearable.EXTENSIONS", bundle);
        return c10924uz;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        C5rg c5rg = new C5rg();
        c5rg.A0C = 1BK.A17(this.A0C);
        c5rg.A05 = this.A05;
        c5rg.A08 = this.A08;
        c5rg.A0D = 1BK.A17(this.A0D);
        c5rg.A09 = this.A09;
        c5rg.A01 = this.A01;
        c5rg.A02 = this.A02;
        c5rg.A00 = this.A00;
        c5rg.A04 = this.A04;
        c5rg.A03 = this.A03;
        c5rg.A06 = this.A06;
        c5rg.A07 = this.A07;
        c5rg.A0B = this.A0B;
        c5rg.A0A = this.A0A;
        return c5rg;
    }
}
