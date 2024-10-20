package X;

import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;

/* renamed from: X.4E4, reason: invalid class name */
/* loaded from: 4E4.class */
public abstract class C4E4 {
    public static int A00(String str, int i) {
        return str.indexOf(38, i);
    }

    public static int A01(String str, int i) {
        return str.indexOf(61, i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 4054
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static android.content.Intent A02(android.content.Context r301, X.C4U0 r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 43496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4E4.A02(android.content.Context, X.4U0, java.lang.String):android.content.Intent");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0Jj, java.lang.Object] */
    public static Intent A03(Context context, String str) {
        11T.A0F(context, 0);
        Intent className = new Intent().setClassName(context, "com.facebook.messenger.neue.MainActivity");
        11T.A0A(className);
        return className.putExtra("key_uri", str).putExtra("key_sanitized_uri", new Object().CjJ(str));
    }

    public static Bundle A04(Bundle bundle) {
        return bundle == null ? new Bundle(2) : bundle;
    }

    public static Bundle A05(String str, String str2, Bundle bundle) {
        Bundle A03 = C4E5.A03(str, str2, bundle);
        return A03 != null ? A03 : bundle;
    }

    public static IllegalStateException A06(int i) {
        return new IllegalStateException(0Pz.A0T("Unexpected templateType: ", i));
    }

    public static void A07(Intent intent) {
        intent.putExtra("fragment_type", 248);
        intent.putExtra("access_fbpermissions", "[]");
        intent.putExtra("app_set", "[]");
    }

    public static void A08(Intent intent, String str) {
        intent.putExtra("matched_pattern", str);
        intent.putExtra("access_scope", "PUBLIC");
    }

    public static void A09(Intent intent, String str) {
        intent.putExtra("matched_pattern", str);
        intent.putExtra("access_scope", "PUBLIC");
        intent.putExtra("enforce_scope", true);
        intent.putExtra("access_domains", "[]");
        intent.putExtra("fragment_type", 248);
        intent.putExtra("access_fbpermissions", "[]");
        intent.putExtra("app_set", "[]");
    }

    public static void A0A(BaseBundle baseBundle, Boolean bool, String str) {
        baseBundle.putBoolean(str, bool.booleanValue());
    }

    public static boolean A0B(String str, char[] cArr) {
        return C4E5.A06(str, cArr, 2);
    }

    public static boolean A0C(String str, char[] cArr) {
        return C4E5.A06(str, cArr, 3);
    }
}
