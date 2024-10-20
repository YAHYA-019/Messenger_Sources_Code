package com.facebook.push.fcm.customprovider;

import X.0RF;
import X.0fH;
import X.AbstractC00351au;
import X.AnonymousClass053;
import X.C00j;
import X.C0y3;
import android.content.ContentValues;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.net.Uri;
import android.os.ConditionVariable;
import java.util.Map;

/* loaded from: FirebaseInitCustomProvider.class */
public final class FirebaseInitCustomProvider extends 0RF {

    /* loaded from: FirebaseInitCustomProvider$Impl.class */
    public final class Impl extends AnonymousClass053 {
        public Impl(0RF r302) {
            super(r302);
        }

        @Override // X.AnonymousClass053
        public void A0B() {
            ConditionVariable conditionVariable;
            C00j.A05("FirebaseApp.customInitStart", -699326665);
            try {
                0fH.A0l("FirebaseInitCustomProvider", "FirebaseApp custom init start");
                AbstractC00351au.A02(new ContextWrapper(this.A00.getContext()));
                Map map = C0y3.A01;
                synchronized (map) {
                    conditionVariable = (ConditionVariable) map.get("firebase_init");
                }
                if (conditionVariable != null) {
                    conditionVariable.open();
                }
                C00j.A01(1985359469);
            } catch (Throwable th) {
                C00j.A01(-297724128);
                throw th;
            }
        }

        @Override // X.AnonymousClass053
        public int A0C(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            return 0;
        }

        @Override // X.AnonymousClass053
        public int A0D(Uri uri, String str, String[] strArr) {
            return 0;
        }

        @Override // X.AnonymousClass053
        public Cursor A0H(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            return null;
        }

        @Override // X.AnonymousClass053
        public Uri A0J(Uri uri, ContentValues contentValues) {
            return null;
        }

        @Override // X.AnonymousClass053
        public String A0M(Uri uri) {
            return null;
        }
    }

    public boolean A0E() {
        Map map = C0y3.A01;
        synchronized (map) {
            if (!map.containsKey("firebase_init")) {
                map.put("firebase_init", new ConditionVariable());
            }
        }
        return true;
    }
}
