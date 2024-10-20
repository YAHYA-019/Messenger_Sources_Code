package com.facebook.messaging.tincan.attachments;

import X.0RF;
import X.0fH;
import X.1Bn;
import X.1EZ;
import X.1Fv;
import X.1Lo;
import X.2L6;
import X.2LB;
import X.AnonymousClass001;
import X.AnonymousClass053;
import X.C00i;
import X.COT;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate;
import com.facebook.secure.content.SecureContentDelegateDI;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* loaded from: DecryptedAttachmentProvider.class */
public class DecryptedAttachmentProvider extends 0RF {

    /* loaded from: DecryptedAttachmentProvider$Impl.class */
    public final class Impl extends SecureContentDelegateDI {
        public C00i A00;

        private AssetFileDescriptor A00(Uri uri) {
            try {
                File A01 = ((TincanMediaDownloadManager) this.A00.get()).A01(uri);
                ParcelFileDescriptor open = ParcelFileDescriptor.open(A01, 268435456);
                0fH.A0h(AnonymousClass001.A0P(A01), "DecryptedAttachmentProvider", "Succeed to get decrypted file of length %s");
                return new AssetFileDescriptor(open, 0L, A01.length());
            } catch (IOException | InterruptedException | ExecutionException | 2L6 | 2LB e) {
                0fH.A0r("DecryptedAttachmentProvider", "Error during file download or decryption", e);
                return null;
            }
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0U(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            return 0;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0V(Uri uri, String str, String[] strArr) {
            return 0;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public AssetFileDescriptor A0W(Uri uri, String str, Bundle bundle) {
            ((TincanMediaDownloadManager) this.A00.get()).A02();
            COT.A02(uri);
            return A00(uri);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Cursor A0X(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            return null;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Uri A0Y(Uri uri, ContentValues contentValues) {
            return null;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public String A0a(Uri uri) {
            return null;
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public void A0b() {
            this.A00 = 1Lo.A02(1Fv.A02((1EZ) 1Bn.A0D(((AnonymousClass053) this).A00.getContext(), 16428)), this, 16941);
        }
    }

    public AnonymousClass053 A09() {
        return new DeferredInitAbstractContentProviderDelegate(this);
    }
}
