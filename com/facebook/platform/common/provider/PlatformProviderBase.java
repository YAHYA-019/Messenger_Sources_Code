package com.facebook.platform.common.provider;

import X.0Pz;
import X.0RF;
import X.11T;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.EaH;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.facebook.secure.content.PublicContentDelegate;
import java.util.Iterator;

/* loaded from: PlatformProviderBase.class */
public final class PlatformProviderBase extends 0RF {

    /* loaded from: PlatformProviderBase$Impl.class */
    public final class Impl extends PublicContentDelegate {
        public static final UriMatcher A01 = new UriMatcher(-1);
        public final 1Br A00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl(0RF r302) {
            super(r302);
            11T.A0F(r302, 1);
            this.A00 = 1Bq.A00(147801);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0U(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0V(Uri uri, String str, String[] strArr) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Cursor A0X(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            MatrixCursor matrixCursor;
            synchronized (this) {
                11T.A0F(uri, 0);
                if (A01.match(uri) != 1) {
                    throw AnonymousClass002.A0C(uri, "Unknown URI ", AnonymousClass001.A0k());
                }
                matrixCursor = new MatrixCursor(new String[]{DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY});
                this.A00.A00.get();
                Iterator it = EaH.A00.iterator();
                while (it.hasNext()) {
                    matrixCursor.addRow(new Integer[]{Integer.valueOf(((Number) it.next()).intValue())});
                }
            }
            return matrixCursor;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Uri A0Y(Uri uri, ContentValues contentValues) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public String A0a(Uri uri) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public void A0b() {
            A01.addURI(0Pz.A0W((String) 1Bi.A03(100173), ".provider.PlatformProvider"), "versions", 1);
        }
    }
}
