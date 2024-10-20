package com.facebook.messaging.provider;

import X.02P;
import X.0EV;
import X.0EW;
import X.0RF;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1CO;
import X.AnonymousClass001;
import X.AnonymousClass053;
import X.C06w;
import X.C06z;
import X.C1cx;
import X.Ei4;
import X.EkQ;
import X.Etr;
import X.FH0;
import X.GCC;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.content.FirstPartySecureContentProviderDelegate;

/* loaded from: FamilyAppsUserValuesProvider.class */
public final class FamilyAppsUserValuesProvider extends 0RF {

    /* loaded from: FamilyAppsUserValuesProvider$Impl.class */
    public final class Impl extends FirstPartySecureContentProviderDelegate {
        public static final /* synthetic */ C06z[] A07 = {new C06w(Impl.class, "fbPrefStoreManager", "getFbPrefStoreManager()Lcom/facebook/libraries/access/FBPrefStoreManager;", 0), new C06w(Impl.class, "accessLibraryFbLoggerLazy", "getAccessLibraryFbLoggerLazy()Lcom/facebook/libraries/access/AccessLibraryFBLogger;", 0), new C06w(Impl.class, "accessLibraryContentProviderManager", "getAccessLibraryContentProviderManager()Lcom/facebook/messaging/provider/MSGRContentProviderManager;", 0)};
        public Etr A00;
        public 1CO A01;
        public EkQ A02;
        public final 0EW A03;
        public final 1Br A04;
        public final 1Br A05;
        public final 1Br A06;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl(0RF r302) {
            super(r302);
            11T.A0F(r302, 1);
            this.A06 = 1Bu.A00(100271);
            this.A05 = 1Bu.A00(100269);
            this.A04 = 1Bq.A00(100253);
            0EV r0 = new 0EV();
            r0.A01 = 02P.A00();
            this.A03 = r0.A00();
        }

        private final GCC A00() {
            return (GCC) this.A05.A0F();
        }

        private final Ei4 A01() {
            return (Ei4) this.A06.A0F();
        }

        private final FH0 A02() {
            return (FH0) this.A04.A0F();
        }

        private final boolean A03() {
            1CO r0 = this.A01;
            return r0 != null && r0.AZk(18302324527278547L);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0U(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            11T.A0F(contentValues, 1);
            11T.A0F(strArr, 3);
            return 0;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0V(Uri uri, String str, String[] strArr) {
            11T.A0G(str, 1, strArr);
            return 0;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Cursor A0X(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            11T.A0F(uri, 0);
            return A02().A01(uri, str, strArr);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Uri A0Y(Uri uri, ContentValues contentValues) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Bundle A0Z(String str, String str2, Bundle bundle) {
            Etr etr;
            11T.A0G(str, 0, bundle);
            return (!A03() || (etr = this.A00) == null) ? new Bundle() : etr.A00(bundle, str);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public String A0a(Uri uri) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public void A0b() {
            Ei4 A01 = A01();
            GCC A00 = A00();
            11T.A0I(A00, "null cannot be cast to non-null type libraries.access.src.main.base.logging.logger.AccessLibraryLogger");
            this.A02 = new EkQ(A01, A00);
            Ei4 A012 = A01();
            0RF r0 = ((AnonymousClass053) this).A00;
            Context context = r0.getContext();
            if (context == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            this.A00 = new Etr(context, A012);
            this.A01 = (1CO) 1Bq.A01(16386);
            Context context2 = r0.getContext();
            11T.A0A(context2);
            C1cx.A00(context2);
        }
    }
}
