package X;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0qt, reason: invalid class name */
/* loaded from: 0qt.class */
public abstract class C0qt extends ContentProvider {
    public final AtomicBoolean A01 = new AtomicBoolean();
    public final C14z A00 = new C14z(this);

    public static void A00() {
        0QE.A00(512L, 1231642287);
    }

    private final void A01() {
        A07();
        if (!A09()) {
            throw AnonymousClass001.A0V("Component access not allowed.");
        }
    }

    private final void A02() {
        A07();
        if (!A08()) {
            throw AnonymousClass001.A0V("Component access not allowed.");
        }
    }

    private void A03(String str) {
        if (Systrace.A0E(512L)) {
            0QE.A01(512L, 0Pz.A0j(AnonymousClass001.A0X(this), ".", str), -345935855);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:136:0x0150
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    private void A04(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0qt.A04(java.lang.String):void");
    }

    public abstract MatrixCursor A05(Uri uri, String str, String str2, String[] strArr, String[] strArr2);

    public void A06() {
    }

    public final void A07() {
        AtomicBoolean atomicBoolean = this.A01;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                A06();
                atomicBoolean.set(true);
            }
        }
    }

    public boolean A08() {
        return A09();
    }

    public abstract boolean A09();

    @Override // android.content.ContentProvider
    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        A03("applyBatch");
        A04("applyBatch");
        try {
            A01();
            return super.applyBatch(arrayList);
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider
    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        A03("bulkInsert");
        A04("bulkInsert");
        try {
            A01();
            return super.bulkInsert(uri, contentValuesArr);
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        A03("call");
        A04("call");
        try {
            A01();
            return null;
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        A03("delete");
        A04("delete");
        try {
            A01();
            throw AnonymousClass001.A0p();
        } catch (Throwable th) {
            A00();
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        A03("getStreamTypes");
        A04("getStreamTypes");
        try {
            A02();
            return null;
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        A03("getType");
        A04("getType");
        try {
            A02();
            throw AnonymousClass001.A0p();
        } catch (Throwable th) {
            A00();
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        A03("insert");
        A04("insert");
        try {
            A01();
            throw AnonymousClass001.A0p();
        } catch (Throwable th) {
            A00();
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final boolean isTemporary() {
        A03("isTemporary");
        try {
            A02();
            return super.isTemporary();
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        A03("onConfigurationChanged");
        try {
            if (this.A01.get()) {
                super.onConfigurationChanged(configuration);
            }
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        A03("onCreate");
        A00();
        return true;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public final void onLowMemory() {
        A03("onLowMemory");
        try {
            if (this.A01.get()) {
                super.onLowMemory();
            }
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        A03("onTrimMemory");
        try {
            if (this.A01.get()) {
                super.onTrimMemory(i);
            }
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openAssetFile(Uri uri, String str) {
        A03("openAssetFile");
        A04("openAssetFile");
        try {
            if (str.contains("w")) {
                A01();
            } else {
                A02();
            }
            return super.openAssetFile(uri, str);
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        A03("openFile");
        A04("openFile");
        try {
            if (str.contains("w")) {
                A01();
            } else {
                A02();
            }
            return super.openFile(uri, str);
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider
    public final AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        A03("openTypedAssetFile");
        A04("openTypedAssetFile");
        try {
            A02();
            return super.openTypedAssetFile(uri, str, bundle);
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        A03("query");
        A04("query");
        try {
            A02();
            return A05(uri, str, str2, strArr, strArr2);
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        A03("query");
        A04("query");
        try {
            A02();
            return A05(uri, str, str2, strArr, strArr2);
        } finally {
            A00();
        }
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        A03("shutdown");
        A00();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A03("update");
        A04("update");
        try {
            A01();
            throw AnonymousClass001.A0p();
        } catch (Throwable th) {
            A00();
            throw th;
        }
    }
}
