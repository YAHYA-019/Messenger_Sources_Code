package com.facebook.messaging.sharekey.contentprovider;

import X.0EW;
import X.0Pz;
import X.0Q8;
import X.0RF;
import X.0fH;
import X.11T;
import X.1BK;
import X.3Go;
import X.3zK;
import X.AnonymousClass001;
import X.AnonymousClass053;
import X.AnonymousClass291;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0w6;
import X.C4Su;
import X.C4Sv;
import X.C4Uo;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.facebook.messaging.lockbox.LockBoxStorageManager;
import com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate;
import java.util.List;

/* loaded from: SecureMessagingKeyContentProvider.class */
public final class SecureMessagingKeyContentProvider extends 0RF {

    /* loaded from: SecureMessagingKeyContentProvider$Impl.class */
    public final class Impl extends DeferredInitAbstractContentProviderDelegate {
        public C4Sv A00;
        public final C01i A01;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl(0RF r302) {
            super(r302);
            11T.A0F(r302, 1);
            this.A01 = C01g.A00(C03i.A02, 3zK.A00);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0U(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw AnonymousClass001.A0q("doUpdate action");
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0V(Uri uri, String str, String[] strArr) {
            throw AnonymousClass001.A0q("doDelete action");
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Cursor A0X(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            11T.A0F(uri, 0);
            C4Sv c4Sv = this.A00;
            if (c4Sv == null) {
                11T.A0L("secureKeyShareManager");
                throw 0Q8.createAndThrow();
            }
            List<String> pathSegments = uri.getPathSegments();
            0fH.A0j("SecureKeyShareManager", AnonymousClass001.A0Z(pathSegments, "path segments: ", AnonymousClass001.A0k()));
            MatrixCursor matrixCursor = null;
            if (pathSegments.size() >= 2) {
                String A14 = 1BK.A14(pathSegments, 0);
                String A142 = 1BK.A14(pathSegments, 1);
                C4Uo c4Uo = c4Sv.A00;
                11T.A0D(A14);
                11T.A0D(A142);
                11T.A0F(A14, 0);
                11T.A0F(A142, 1);
                0fH.A0j("LockBoxSharedStorage", 0Pz.A0W("retrieveSharedKey for feature ", A14));
                AnonymousClass291 A00 = 3Go.A00(A14);
                if (A00 != null) {
                    if (!c4Uo.A00.A00.contains(A00)) {
                        0fH.A0j("LockBoxSharedStorage", 0Pz.A0j("feature ", A14, " is not support"));
                        return null;
                    }
                    0fH.A0j("LockBoxSharedStorage", 0Pz.A0j("feature ", A14, " is support"));
                    String lockBoxGetLocalSecret = LockBoxStorageManager.lockBoxGetLocalSecret(A142, A14);
                    if (lockBoxGetLocalSecret != null) {
                        matrixCursor = new MatrixCursor(new String[]{"sharedKey"});
                        matrixCursor.addRow(new String[]{lockBoxGetLocalSecret});
                    }
                }
            }
            return matrixCursor;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Uri A0Y(Uri uri, ContentValues contentValues) {
            throw AnonymousClass001.A0q("doInsert action");
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public String A0a(Uri uri) {
            throw AnonymousClass001.A0q("doGetType action");
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public void A0b() {
            Context context = ((AnonymousClass053) this).A00.getContext();
            if (context != null) {
                C4Su c4Su = new C4Su(C4Uo.A02);
                LockBoxStorageManager lockBoxStorageManager = LockBoxStorageManager.INSTANCE;
                LockBoxStorageManager.initialize(context);
                this.A00 = new C4Sv(new C4Uo(lockBoxStorageManager, c4Su));
            }
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public boolean A0d() {
            0RF r0 = ((AnonymousClass053) this).A00;
            if (r0.getContext() == null) {
                return false;
            }
            Object value = this.A01.getValue();
            11T.A0A(value);
            return ((0EW) value).A02(r0.getContext(), (Intent) null, (C0w6) null);
        }
    }
}
