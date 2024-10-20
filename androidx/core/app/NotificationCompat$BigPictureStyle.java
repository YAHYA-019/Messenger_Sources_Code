package androidx.core.app;

import X.4YT;
import X.4iX;
import X.4vF;
import X.4vG;
import X.4vI;
import X.CJF;
import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: NotificationCompat$BigPictureStyle.class */
public final class NotificationCompat$BigPictureStyle extends 4vI {
    public IconCompat A00;
    public boolean A01;
    public IconCompat A02;
    public boolean A03;

    public String A02() {
        return 4YT.A00(860);
    }

    public void A04(Bundle bundle) {
        super.A04(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    public void A05(Bundle bundle) {
        IconCompat iconCompat;
        IconCompat iconCompat2;
        super.A05(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            Parcelable parcelable = bundle.getParcelable("android.largeIcon.big");
            if (parcelable != null) {
                if (parcelable instanceof Icon) {
                    iconCompat2 = 4iX.A01(parcelable);
                } else if (parcelable instanceof Bitmap) {
                    iconCompat2 = IconCompat.A01((Bitmap) parcelable);
                }
                this.A00 = iconCompat2;
                this.A01 = true;
            }
            iconCompat2 = null;
            this.A00 = iconCompat2;
            this.A01 = true;
        }
        Parcelable parcelable2 = bundle.getParcelable("android.picture");
        if (parcelable2 == null) {
            parcelable2 = bundle.getParcelable("android.pictureIcon");
        }
        if (parcelable2 != null) {
            if (parcelable2 instanceof Icon) {
                iconCompat = 4iX.A01(parcelable2);
            } else if (parcelable2 instanceof Bitmap) {
                iconCompat = IconCompat.A01((Bitmap) parcelable2);
            }
            this.A02 = iconCompat;
            this.A03 = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }
        iconCompat = null;
        this.A02 = iconCompat;
        this.A03 = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    public void A06(4vG r302) {
        4vF r0 = (4vF) r302;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(r0.A04).setBigContentTitle(((4vI) this).A01);
        IconCompat iconCompat = this.A02;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                CJF.A01(bigContentTitle, 4iX.A00(r0.A05, iconCompat));
            } else {
                int i = iconCompat.A02;
                if (i == -1) {
                    i = ((Icon) iconCompat.A06).getType();
                }
                if (i == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.A02.A04());
                }
            }
        }
        if (this.A01) {
            IconCompat iconCompat2 = this.A00;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(4iX.A00(r0.A05, iconCompat2));
            }
        }
        if (((4vI) this).A03) {
            bigContentTitle.setSummaryText(((4vI) this).A02);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            CJF.A02(bigContentTitle, this.A03);
            CJF.A00(bigContentTitle);
        }
    }

    public void A08(Bitmap bitmap) {
        this.A02 = bitmap == null ? null : IconCompat.A01(bitmap);
    }
}
