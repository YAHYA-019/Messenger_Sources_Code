package com.facebook.messaging.database.threads;

import X.0Pz;
import X.0RF;
import X.1Bn;
import X.1EZ;
import X.3zF;
import X.4xA;
import X.6EA;
import X.AnonymousClass001;
import X.AnonymousClass053;
import X.C00j;
import X.C15h;
import X.C3o5;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.facebook.messaging.database.threads.ThreadsDbPropertiesContentProvider;
import com.facebook.secure.content.SecureContentDelegateDI;

/* loaded from: ThreadsDbPropertiesContentProvider.class */
public class ThreadsDbPropertiesContentProvider extends 0RF {

    /* loaded from: ThreadsDbPropertiesContentProvider$Impl.class */
    public class Impl extends SecureContentDelegateDI {
        public C15h A00;
        public 3zF A01;
        public C15h A02;

        public Impl(0RF r302) {
            super(r302);
            this.A01 = new 3zF();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0U(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0V(Uri uri, String str, String[] strArr) {
            C00j.A05("ThreadsDbPropertiesContentProvider.doDelete", 1666887189);
            try {
                int A03 = this.A01.A00(uri).A03(uri, str, strArr);
                C3o5.A0W(-1765658704, "ThreadsDbPropertiesContentProvider.doDelete took %d ms");
                return A03;
            } catch (Throwable th) {
                C3o5.A0W(523835802, "ThreadsDbPropertiesContentProvider.doDelete took %d ms");
                throw th;
            }
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Cursor A0X(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            C00j.A05("ThreadsDbPropertiesContentProvider.doQuery", -1436659212);
            try {
                Cursor A04 = this.A01.A00(uri).A04(uri, strArr, str, strArr2, str2);
                C3o5.A0W(-256948174, "ThreadsDbPropertiesContentProvider.doQuery took %d ms");
                return A04;
            } catch (Throwable th) {
                C3o5.A0W(-696753685, "ThreadsDbPropertiesContentProvider.doQuery took %d ms");
                throw th;
            }
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Uri A0Y(Uri uri, ContentValues contentValues) {
            C00j.A05("ThreadsDbPropertiesContentProvider.doInsert", -150009284);
            try {
                Uri A05 = this.A01.A00(uri).A05(uri, contentValues);
                C3o5.A0W(1436376519, "ThreadsDbPropertiesContentProvider.doInsert took %d ms");
                return A05;
            } catch (Throwable th) {
                C3o5.A0W(-809182996, "ThreadsDbPropertiesContentProvider.doInsert took %d ms");
                throw th;
            }
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public String A0a(Uri uri) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public void A0b() {
            synchronized (this) {
                C00j.A05("ThreadsDbPropertiesContentProvider.Impl.onInitialize", 916668058);
                try {
                    final 1EZ r0 = (1EZ) 1Bn.A0D(((AnonymousClass053) this).A00.getContext(), 16428);
                    final int i = 0;
                    this.A00 = new C15h(r0, this, i) { // from class: X.4Xm
                        public final int A00;
                        public final Object A01;
                        public final Object A02;

                        {
                            this.A00 = i;
                            this.A01 = this;
                            this.A02 = r0;
                        }

                        @Override // X.C15h
                        public /* bridge */ /* synthetic */ Object get() {
                            return 1Lo.A03(((AnonymousClass053) this.A01).A00.getContext(), 1Fw.A06(this.A02), this.A00 != 0 ? 49999 : 49346);
                        }
                    };
                    final int i2 = 1;
                    C15h c15h = new C15h(r0, this, i2) { // from class: X.4Xm
                        public final int A00;
                        public final Object A01;
                        public final Object A02;

                        {
                            this.A00 = i2;
                            this.A01 = this;
                            this.A02 = r0;
                        }

                        @Override // X.C15h
                        public /* bridge */ /* synthetic */ Object get() {
                            return 1Lo.A03(((AnonymousClass053) this.A01).A00.getContext(), 1Fw.A06(this.A02), this.A00 != 0 ? 49999 : 49346);
                        }
                    };
                    this.A02 = c15h;
                    6EA r02 = (6EA) c15h.get();
                    3zF r03 = new 3zF();
                    this.A01 = r03;
                    r03.A01(new 4xA() { // from class: X.4Ps
                        public int A03(Uri uri, String str, String[] strArr) {
                            return ((C10654u8) ThreadsDbPropertiesContentProvider.Impl.this.A00.get()).A00.AUF().delete("properties", str, strArr);
                        }

                        public Uri A05(Uri uri, ContentValues contentValues) {
                            SQLiteDatabase AUF = ((C10654u8) ThreadsDbPropertiesContentProvider.Impl.this.A00.get()).A00.AUF();
                            C01m.A00(1641023058);
                            AUF.replaceOrThrow("properties", null, contentValues);
                            C01m.A00(-98628458);
                            return null;
                        }

                        public Cursor A06(Uri uri, String str, String str2, String str3, String[] strArr, String[] strArr2) {
                            return ((C10654u8) ThreadsDbPropertiesContentProvider.Impl.this.A00.get()).A00.AUF().query("properties", strArr, str, strArr2, null, null, str2, str3);
                        }
                    }, 0Pz.A0j(r02.A01.getPackageName(), ".", "threads_properties"), "properties");
                    C00j.A01(1700578800);
                } catch (Throwable th) {
                    C00j.A01(1271048286);
                    throw th;
                }
            }
        }
    }
}
