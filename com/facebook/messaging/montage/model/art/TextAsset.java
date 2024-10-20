package com.facebook.messaging.montage.model.art;

import X.1BK;
import X.1BL;
import X.2JX;
import X.2JY;
import X.C53v;
import X.H9J;
import X.H9a;
import X.HA1;
import android.os.Parcel;
import com.facebook.messaging.font.FontAsset;
import java.util.Locale;

/* loaded from: TextAsset.class */
public final class TextAsset extends LazyArtAsset {
    public final int A00;
    public final H9J A01;
    public final String A02;
    public final FontAsset A03;
    public final HA1 A04;

    public TextAsset(2JX r302) {
        super(H9a.TEXT, r302);
        this.A00 = 0;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
        this.A04 = null;
    }

    public TextAsset(Parcel parcel) {
        super(parcel, H9a.TEXT);
        this.A00 = parcel.readInt();
        this.A01 = C53v.A07(parcel, H9J.class);
        this.A03 = (FontAsset) 1BL.A0C(parcel, FontAsset.class);
        this.A02 = parcel.readString();
        this.A04 = (HA1) C53v.A07(parcel, HA1.class);
    }

    public FontAsset A05() {
        if (!super.A04) {
            return this.A03;
        }
        2JY A0B = 1BK.A0B((2JY) super.A03, 2JX.class, -1777944483, 314273459);
        if (A0B == null) {
            return null;
        }
        return new FontAsset(A0B.A0j(), A0B.A0r(351608024), A0B.A0m());
    }

    public HA1 A06() {
        Object obj = super.A03;
        if (obj == null) {
            return this.A04;
        }
        String A0r = ((2JY) obj).A0r(-1037551860);
        if (A0r != null) {
            String lowerCase = A0r.toLowerCase(Locale.US);
            switch (lowerCase.hashCode()) {
                case -237854632:
                    if (lowerCase.equals("user_prompt")) {
                        return HA1.USER_PROMPT;
                    }
                    break;
                case 3560141:
                    if (lowerCase.equals("time")) {
                        return HA1.TIME;
                    }
                    break;
                case 1782483940:
                    if (lowerCase.equals("user_location_picker")) {
                        return HA1.USER_LOCATION_PICKER;
                    }
                    break;
            }
        }
        return HA1.REGULAR;
    }
}
