package X;

import android.net.Uri;
import com.facebook.graphql.enums.GraphQLStickerState;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.stickers.model.Sticker;
import com.facebook.stickers.model.StickerCapabilities;

/* renamed from: X.6q8, reason: invalid class name */
/* loaded from: 6q8.class */
public final class C6q8 {
    public int A00;
    public Uri A01;
    public Uri A02;
    public Uri A03;
    public Uri A04;
    public Uri A05;
    public Uri A06;
    public Uri A07;
    public Uri A08;
    public Uri A09;
    public GraphQLStickerState A0A;
    public GraphQLStickerType A0B;
    public StickerCapabilities A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J = true;

    public final Sticker A00() {
        if (!this.A0J) {
            throw new IllegalStateException("Check failed.");
        }
        this.A0J = false;
        String str = this.A0F;
        if (str == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String str2 = this.A0H;
        if (str2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        String str3 = this.A0G;
        String str4 = this.A0D;
        String str5 = this.A0E;
        int i = this.A00;
        GraphQLStickerState graphQLStickerState = this.A0A;
        GraphQLStickerType graphQLStickerType = this.A0B;
        Uri uri = this.A09;
        if (uri == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        Uri uri2 = this.A08;
        Uri uri3 = this.A02;
        Uri uri4 = this.A01;
        Uri uri5 = this.A07;
        Uri uri6 = this.A06;
        Uri uri7 = this.A04;
        Uri uri8 = this.A03;
        Uri uri9 = this.A05;
        boolean z = this.A0I;
        StickerCapabilities stickerCapabilities = this.A0C;
        if (stickerCapabilities != null) {
            return new Sticker(uri, uri2, uri3, uri4, uri5, uri6, uri7, uri8, uri9, graphQLStickerState, graphQLStickerType, stickerCapabilities, str, str2, str3, str4, str5, i, z);
        }
        throw AnonymousClass001.A0N("Required value was null.");
    }

    public final void A01() {
        this.A0F = null;
        this.A0H = null;
        this.A0G = null;
        this.A0D = null;
        this.A0E = null;
        this.A00 = 0;
        this.A0A = null;
        this.A0B = null;
        this.A09 = null;
        this.A08 = null;
        this.A02 = null;
        this.A01 = null;
        this.A07 = null;
        this.A06 = null;
        this.A04 = null;
        this.A03 = null;
        this.A05 = null;
        this.A0C = null;
        this.A0J = true;
        this.A0I = false;
    }

    public final void A02(Sticker sticker) {
        11T.A0F(sticker, 0);
        this.A0F = sticker.A0F;
        this.A0H = sticker.A0H;
        this.A0G = sticker.A0G;
        this.A0D = sticker.A0D;
        this.A0E = sticker.A0E;
        this.A00 = sticker.A00;
        this.A09 = sticker.A09;
        this.A08 = sticker.A08;
        this.A02 = sticker.A02;
        this.A01 = sticker.A01;
        this.A07 = sticker.A07;
        this.A06 = sticker.A06;
        this.A0C = sticker.A0C;
        this.A0A = sticker.A0A;
        this.A0B = sticker.A0B;
        this.A04 = sticker.A04;
        this.A03 = sticker.A03;
        this.A05 = sticker.A05;
        this.A0I = sticker.A0I;
    }

    public final void A03(StickerCapabilities stickerCapabilities) {
        11T.A0F(stickerCapabilities, 0);
        this.A0C = stickerCapabilities;
    }

    public final void A04(String str) {
        11T.A0F(str, 0);
        this.A0H = str;
    }
}
