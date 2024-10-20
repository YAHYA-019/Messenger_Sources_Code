package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.user.model.User;

/* loaded from: Csw.class */
public final class Csw implements DK6 {
    public final float A00;
    public final BOi A01;
    public final ThreadKey A02;
    public final DataSourceIdentifier A03;
    public final 53N A04;
    public final DK4 A05;
    public final User A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public Csw(BOi bOi, ThreadKey threadKey, 53N r304, DK4 dk4, User user, Float f, String str, String str2) {
        this.A06 = user;
        this.A02 = threadKey;
        this.A01 = bOi;
        this.A07 = str;
        this.A08 = null;
        this.A09 = str2;
        this.A00 = f == null ? 0.0f : f.floatValue();
        this.A05 = dk4;
        this.A04 = r304;
        this.A03 = null;
    }

    public Csw(BOi bOi, ThreadKey threadKey, DataSourceIdentifier dataSourceIdentifier, 53N r305, DK4 dk4, User user, Float f, String str) {
        this.A06 = user;
        this.A02 = threadKey;
        this.A01 = bOi;
        this.A07 = null;
        this.A08 = null;
        this.A09 = str;
        this.A00 = f == null ? 0.0f : f.floatValue();
        this.A05 = dk4 == null ? EnumC1297Ada.A1N : dk4;
        this.A04 = r305;
        this.A03 = dataSourceIdentifier;
    }

    public Csw(BOi bOi, ThreadKey threadKey, User user, String str, String str2, String str3) {
        EnumC1297Ada enumC1297Ada = EnumC1297Ada.A1N;
        53N r0 = 53N.A0R;
        this.A06 = user;
        this.A02 = threadKey;
        this.A01 = bOi;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A00 = 0.0f;
        this.A05 = enumC1297Ada;
        this.A04 = r0;
        this.A03 = null;
    }

    public String BHk() {
        return this.A09;
    }

    public String getId() {
        return this.A06.A13;
    }
}
