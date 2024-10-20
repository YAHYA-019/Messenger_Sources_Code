package X;

import android.net.Uri;
import android.provider.BaseColumns;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.2eb, reason: invalid class name */
/* loaded from: 2eb.class */
public final class C2eb {
    public static final ImmutableSet A09 = ImmutableSet.A04("PHONE_E164", "PHONE_LOCAL", "PHONE_NATIONAL", "PHONE_VERIFIED");
    public final Uri A00;
    public final C2el A01;
    public final C2ed A02;
    public final C2eg A03;
    public final C2ek A04;
    public final C2ei A05;
    public final ImmutableSet A06 = ImmutableSet.A05("NAME", "PHONE_E164", "PHONE_NATIONAL", "PHONE_LOCAL", "USERNAME");
    public final ImmutableSet A07 = ImmutableSet.A02("NAME", "USERNAME");
    public final String A08;

    /* JADX WARN: Type inference failed for: r0v20, types: [X.2eg] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.2ei] */
    /* JADX WARN: Type inference failed for: r0v29, types: [X.2el] */
    public C2eb() {
        String A0j = 0Pz.A0j(FbInjector.A00().getPackageName(), ".", "contacts");
        this.A08 = A0j;
        this.A00 = C0A2.A03(0Pz.A0W("content://", A0j));
        this.A02 = new C2ed(this);
        this.A03 = new BaseColumns() { // from class: X.2eg
            public final Uri A00;

            {
                this.A00 = Uri.withAppendedPath(C2eb.this.A00, "favorites");
            }
        };
        this.A05 = new BaseColumns() { // from class: X.2ei
            public final Uri A00;

            {
                this.A00 = Uri.withAppendedPath(C2eb.this.A00, "sms_favorites");
            }
        };
        this.A04 = new C2ek(this);
        this.A01 = new BaseColumns() { // from class: X.2el
            public final Uri A00;

            {
                this.A00 = Uri.withAppendedPath(C2eb.this.A00, "contact_index");
            }
        };
    }
}
