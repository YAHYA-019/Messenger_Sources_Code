package com.facebook.messaging.platform;

import X.0RF;
import X.1Bi;
import X.53E;
import X.AbstractC02273uo;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass053;
import X.C00i;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.facebook.secure.content.PublicContentDelegate;
import java.util.Iterator;

/* loaded from: MessengerPlatformProvider.class */
public class MessengerPlatformProvider extends 0RF {

    /* loaded from: MessengerPlatformProvider$Impl.class */
    public final class Impl extends PublicContentDelegate {
        public static final UriMatcher A01 = new UriMatcher(-1);
        public final C00i A00;

        public Impl(0RF r302) {
            super(r302);
            this.A00 = 1Bi.A00(49475);
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
                if (A01.match(uri) != 1) {
                    throw AnonymousClass002.A0C(uri, "Unknown URI ", AnonymousClass001.A0k());
                }
                matrixCursor = new MatrixCursor(new String[]{DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY});
                Iterator it = ((53E) this.A00.get()).A01().iterator();
                while (it.hasNext()) {
                    matrixCursor.addRow(new Integer[]{(Integer) it.next()});
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
            AbstractC02273uo.A00(((AnonymousClass053) this).A00.getContext());
            A01.addURI("com.facebook.orca.provider.MessengerPlatformProvider", "versions", 1);
        }
    }

    public AnonymousClass053 A09() {
        return new Impl(this);
    }
}
