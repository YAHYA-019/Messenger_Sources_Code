package com.facebook.secure.content;

import X.02Q;
import X.0EY;
import X.0Lu;
import X.0Lv;
import X.0Pz;
import X.0QE;
import X.0RF;
import X.AnonymousClass001;
import X.AnonymousClass053;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: DeferredInitAbstractContentProviderDelegate.class */
public abstract class DeferredInitAbstractContentProviderDelegate extends AnonymousClass053 {
    public final AtomicBoolean A00;

    public DeferredInitAbstractContentProviderDelegate(0RF r302) {
        super(r302);
        this.A00 = new AtomicBoolean();
        A09("onCreate");
        A06();
    }

    public static void A06() {
        0QE.A00(512L, 1463009525);
    }

    private final void A07() {
        A0c();
        if (!A0d()) {
            throw AnonymousClass001.A0V("Component access not allowed.");
        }
    }

    private final void A08() {
        A0c();
        if (!A0d()) {
            throw AnonymousClass001.A0V("Component access not allowed.");
        }
    }

    private void A09(String str) {
        if (Systrace.A0E(512L)) {
            0QE.A01(512L, 0Pz.A0j(getClass().getSimpleName(), ".", str), -1008808295);
        }
    }

    private void A0A(String str) {
        0Lv r0 = 0Lu.A00;
        if (r0.A00.isEmpty()) {
            return;
        }
        Context context = super.A00.getContext();
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s/%s", context.getPackageName(), AnonymousClass001.A0Y(this));
        0EY r308 = null;
        try {
            r308 = 02Q.A00(context, Binder.getCallingUid());
        } catch (SecurityException unused) {
        }
        if (r308 == null) {
            r0.A00(context, formatStrLocaleSafe, str);
            return;
        }
        String A04 = r308.A04();
        String obj = r308.toString();
        if (A04 == null) {
            A04 = "no_app_identity";
        }
        r0.A01(context, formatStrLocaleSafe, str, obj, A04);
    }

    @Override // X.AnonymousClass053
    public final int A0C(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A09("update");
        A0A("update");
        try {
            A07();
            return A0U(uri, contentValues, str, strArr);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final int A0D(Uri uri, String str, String[] strArr) {
        A09("delete");
        A0A("delete");
        try {
            A07();
            return A0V(uri, str, strArr);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final int A0E(Uri uri, ContentValues[] contentValuesArr) {
        A09("bulkInsert");
        A0A("bulkInsert");
        try {
            A07();
            return super.A00.A04(uri, contentValuesArr);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final AssetFileDescriptor A0F(Uri uri, String str) {
        A09("openAssetFile");
        A0A("openAssetFile");
        try {
            if (str.contains("w")) {
                A07();
            } else {
                A08();
            }
            return super.A00.A05(uri, str);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final AssetFileDescriptor A0G(Uri uri, String str, Bundle bundle) {
        A09("openTypedAssetFile");
        A0A("openTypedAssetFile");
        try {
            A08();
            return A0W(uri, str, bundle);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final Cursor A0H(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        A09("query");
        A0A("query");
        try {
            A08();
            return A0X(uri, strArr, str, strArr2, str2);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final Cursor A0I(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        A09("query");
        A0A("query");
        try {
            A08();
            return A0X(uri, strArr, str, strArr2, str2);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final Uri A0J(Uri uri, ContentValues contentValues) {
        A09("insert");
        A0A("insert");
        try {
            A07();
            return A0Y(uri, contentValues);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final Bundle A0K(String str, String str2, Bundle bundle) {
        A09("call");
        A0A("call");
        try {
            A07();
            return A0Z(str, str2, bundle);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final ParcelFileDescriptor A0L(Uri uri, String str) {
        A09("openFile");
        A0A("openFile");
        try {
            if (str.contains("w")) {
                A07();
            } else {
                A08();
            }
            return super.A00.A08(uri, str);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final String A0M(Uri uri) {
        A09("getType");
        A0A("getType");
        try {
            A08();
            return A0a(uri);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final void A0N() {
        A09("onLowMemory");
        try {
            if (this.A00.get()) {
                super.A0N();
            }
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final void A0O() {
        A09("shutdown");
        A06();
    }

    @Override // X.AnonymousClass053
    public final void A0P(int i) {
        A09("onTrimMemory");
        try {
            if (this.A00.get()) {
                super.A0P(i);
            }
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final void A0Q(Configuration configuration) {
        A09("onConfigurationChanged");
        try {
            if (this.A00.get()) {
                super.A0Q(configuration);
            }
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final boolean A0R() {
        A09("isTemporary");
        try {
            A08();
            return super.A00.A0F();
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final ContentProviderResult[] A0S(ArrayList arrayList) {
        A09("applyBatch");
        A0A("applyBatch");
        try {
            A07();
            return super.A00.A0G(arrayList);
        } finally {
            A06();
        }
    }

    @Override // X.AnonymousClass053
    public final String[] A0T(Uri uri, String str) {
        A09("getStreamTypes");
        A0A("getStreamTypes");
        try {
            A08();
            return null;
        } finally {
            A06();
        }
    }

    public abstract int A0U(Uri uri, ContentValues contentValues, String str, String[] strArr);

    public abstract int A0V(Uri uri, String str, String[] strArr);

    public AssetFileDescriptor A0W(Uri uri, String str, Bundle bundle) {
        return null;
    }

    public abstract Cursor A0X(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    public abstract Uri A0Y(Uri uri, ContentValues contentValues);

    public Bundle A0Z(String str, String str2, Bundle bundle) {
        return null;
    }

    public abstract String A0a(Uri uri);

    public void A0b() {
    }

    public final void A0c() {
        AtomicBoolean atomicBoolean = this.A00;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                A0b();
                atomicBoolean.set(true);
            }
        }
    }

    public abstract boolean A0d();
}
