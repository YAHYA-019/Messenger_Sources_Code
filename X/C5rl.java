package X;

import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.5rl, reason: invalid class name */
/* loaded from: 5rl.class */
public final class C5rl implements C5rh {
    public int A00 = 0;
    public Bitmap A01;
    public C5ro A02;

    @Override // X.C5rh
    public C10924uz ARc(C10924uz c10924uz) {
        Bundle bundle = new Bundle();
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bundle.putParcelable("large_icon", bitmap);
        }
        int i = this.A00;
        if (i != 0) {
            bundle.putInt("app_color", i);
        }
        C5ro c5ro = this.A02;
        if (c5ro != null) {
            Bundle bundle2 = new Bundle();
            String[] strArr = c5ro.A05;
            String[] strArr2 = c5ro.A04;
            int length = strArr2.length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i2 = 0; i2 < length; i2++) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("text", strArr2[i2]);
                bundle3.putString("author", null);
                parcelableArr[i2] = bundle3;
            }
            bundle2.putParcelableArray("messages", parcelableArr);
            C5rn c5rn = c5ro.A03;
            if (c5rn != null) {
                RemoteInput.Builder builder = new RemoteInput.Builder(c5rn.A03);
                builder.setLabel(c5rn.A02);
                builder.setChoices(c5rn.A06);
                builder.setAllowFreeFormInput(c5rn.A05);
                builder.addExtras(c5rn.A01);
                bundle2.putParcelable("remote_input", builder.build());
            }
            bundle2.putParcelable("on_reply", c5ro.A02);
            bundle2.putParcelable("on_read", c5ro.A01);
            bundle2.putStringArray("participants", strArr);
            bundle2.putLong("timestamp", c5ro.A00);
            bundle.putBundle("car_conversation", bundle2);
        }
        Bundle bundle4 = c10924uz.A0D;
        if (bundle4 == null) {
            bundle4 = 1BK.A05();
            c10924uz.A0D = bundle4;
        }
        bundle4.putBundle("android.car.EXTENSIONS", bundle);
        return c10924uz;
    }
}
