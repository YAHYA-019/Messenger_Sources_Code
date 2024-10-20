package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.fxcal.identity.model.AccountProfileModel;
import com.facebook.mig.deprecated.bottomsheet.LegacyMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: F1u.class */
public abstract class F1u {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.common.collect.ImmutableList$Builder] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.544, java.lang.Object, X.567] */
    /* JADX WARN: Type inference failed for: r312v1 */
    /* JADX WARN: Type inference failed for: r312v2 */
    /* JADX WARN: Type inference failed for: r312v5 */
    /* JADX WARN: Type inference failed for: r312v6 */
    /* JADX WARN: Type inference failed for: r312v8 */
    /* JADX WARN: Type inference failed for: r312v9, types: [java.lang.CharSequence, java.lang.Object] */
    public static AnonymousClass544 A00(2fZ r301, MigColorScheme migColorScheme, ImmutableList immutableList, String str, String str2, boolean z) {
        Uri uri;
        String str3 = Rhr.A00(immutableList).A0D;
        ?? builder = ImmutableList.builder();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            uri = ((AccountProfileModel) it.next()).A0D;
            if (!1JF.A0B((CharSequence) uri)) {
                builder.m11011add(uri);
            }
        }
        if (z || builder.build().size() != 2) {
            LightColorScheme.A00();
            C2p1 c2p1 = new C2p1(ImmutableList.of(), str);
            try {
                uri = str3 != null ? C0A2.A03(str3) : C0A2.A03("");
            } catch (SecurityException unused) {
            }
            C2fq A0B = r301.A0B(uri, C2fd.A0T);
            if (str2 == null) {
                str2 = "";
            }
            return new AnonymousClass565(c2p1, migColorScheme, A0B, ImmutableList.of((Object) str2));
        }
        ImmutableList build = builder.build();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        ?? obj = new Object();
        obj.A01 = build;
        obj.A00 = migColorScheme;
        obj.A03 = str;
        obj.A02 = str2;
        return obj;
    }

    public static void A01(06Z r301, FbUserSession fbUserSession, C1qb c1qb, GF3 gf3, MigColorScheme migColorScheme, ImmutableList immutableList, String str, String str2, String str3) {
        LegacyMigBottomSheetDialogFragment A05 = LegacyMigBottomSheetDialogFragment.A05(migColorScheme, false);
        String obj = EWW.class.toString();
        Dsi dsi = new Dsi(c1qb, new Dxs());
        Dxs dxs = dsi.A01;
        dxs.A00 = fbUserSession;
        BitSet bitSet = dsi.A02;
        bitSet.set(1);
        dxs.A03 = migColorScheme;
        bitSet.set(0);
        dxs.A04 = immutableList;
        bitSet.set(4);
        dxs.A01 = gf3;
        bitSet.set(2);
        dxs.A02 = A05;
        bitSet.set(3);
        dxs.A07 = str;
        dxs.A06 = str2;
        dxs.A05 = str3;
        C1rs.A04(bitSet, dsi.A03);
        dsi.A0J();
        A05.A1C(r301, dxs, obj);
    }
}
