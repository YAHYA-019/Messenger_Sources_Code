package com.facebook.abtest.qe.db;

import X.0RF;
import X.0fH;
import X.1BQ;
import X.1BV;
import X.3zF;
import X.4xA;
import X.AnonymousClass001;
import X.Bo6;
import X.C00i;
import X.C00j;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.secure.content.SecureContentDelegateDI;

/* loaded from: QuickExperimentContentProvider.class */
public class QuickExperimentContentProvider extends 0RF {

    /* loaded from: QuickExperimentContentProvider$Impl.class */
    public class Impl extends SecureContentDelegateDI {
        public 3zF A00;
        public final C00i A01;
        public final C00i A02;

        public Impl(0RF r302) {
            super(r302);
            this.A02 = new 1BQ(83302);
            this.A01 = new 1BV(84724);
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
            C00j.A05("QuickExperimentContentProvider.doQuery", -168647925);
            try {
                Cursor A04 = this.A00.A00(uri).A04(uri, strArr, str, strArr2, str2);
                0fH.A0g(Long.valueOf(C00j.A00(-952477652)), "QuickExperimentContentProvider", "QuickExperimentContentProvider.doQuery took %d ms");
                return A04;
            } catch (Throwable th) {
                0fH.A0g(Long.valueOf(C00j.A00(-1285395435)), "QuickExperimentContentProvider", "QuickExperimentContentProvider.doQuery took %d ms");
                throw th;
            }
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
            3zF r0 = new 3zF();
            this.A00 = r0;
            r0.A01((4xA) this.A01.get(), ((Bo6) this.A02.get()).A02, "metainfo");
        }
    }
}
