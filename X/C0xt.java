package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.0xt, reason: invalid class name */
/* loaded from: 0xt.class */
public final class C0xt implements 0Re {
    public int A00;
    public int A01;
    public ClipData A02;
    public Uri A03;
    public Bundle A04;

    public 0Rg ACd() {
        return new 0Rg(new 0Rf(this) { // from class: X.0xl
            public final int A00;
            public final int A01;
            public final ClipData A02;
            public final Uri A03;
            public final Bundle A04;

            {
                ClipData clipData = this.A02;
                clipData.getClass();
                this.A02 = clipData;
                int i = this.A01;
                0RZ.A01(i, 0, 5, Property.SYMBOL_Z_ORDER_SOURCE);
                this.A01 = i;
                int i2 = this.A00;
                if ((i2 & 1) != i2) {
                    throw AnonymousClass001.A0L(0Pz.A0z("Requested flags 0x", Integer.toHexString(i2), ", but only 0x", Integer.toHexString(1), " are allowed"));
                }
                this.A00 = i2;
                this.A03 = this.A03;
                this.A04 = this.A04;
            }

            public ClipData Acq() {
                return this.A02;
            }

            public int BBe() {
                return this.A01;
            }

            public ContentInfo BL0() {
                return null;
            }

            public Bundle getExtras() {
                return this.A04;
            }

            public int getFlags() {
                return this.A00;
            }

            public Uri getLinkUri() {
                return this.A03;
            }

            public String toString() {
                String str;
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("ContentInfoCompat{clip=");
                A0k.append(this.A02.getDescription());
                A0k.append(", source=");
                int i = this.A01;
                A0k.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                A0k.append(", flags=");
                int i2 = this.A00;
                A0k.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = this.A03;
                str = "";
                A0k.append(uri == null ? str : 0Pz.A0d(", hasLinkUri(", ")", uri.toString().length()));
                A0k.append(this.A04 != null ? ", hasExtras" : "");
                return AnonymousClass001.A0d("}", A0k);
            }
        });
    }

    public void Cmw(ClipData clipData) {
        this.A02 = clipData;
    }

    public void Cop(int i) {
        this.A00 = i;
    }

    public void CqY(Uri uri) {
        this.A03 = uri;
    }

    public void setExtras(Bundle bundle) {
        this.A04 = bundle;
    }
}
